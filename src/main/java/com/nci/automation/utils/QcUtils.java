package com.nci.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.apache.commons.lang.StringUtils.contains;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Random;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.LibraryLoader;
import com.jacob.com.Variant;

/**
 * This class contains utility methods for QC interaction
 */
public class QcUtils {
	
	private static Logger logger = LogManager.getLogger(QcUtils.class);
	
	public void buildFeatureFile(String qcTestPlanFolder, String outputFolder) {

		ArrayList<String> featureFileArrayList;
		int i;
		String featureName = "";

		String qcUsername = LocalConfUtils.getProperty("qcUsername");
		String qcPassword = LocalConfUtils.getProperty("qcPassword");
		String qcDomain = LocalConfUtils.getProperty("qcDomain");
		String qcProject = LocalConfUtils.getProperty("qcProject");

		String outFilePath = outputFolder + File.separator + "out.txt";
		String qcFilePath = LocalConfUtils.getQcResourcesDir() +
				File.separator + "build_feature_file.vbs";

		String cmd = "cscript //nologo \"" + qcFilePath + "\" " + qcUsername +
				" " + EncryptionUtils.decrypt(qcPassword) + " " +
				qcDomain + " " +
				qcProject + " \"" +
				qcTestPlanFolder + "\" > \"" + outFilePath + "\"";

		featureFileArrayList = runShellCmd(cmd);
		featureFileArrayList = FileUtils.txtToArrayList(outFilePath);

		for(i=0;i<featureFileArrayList.size();i++) {

			if (featureFileArrayList.get(i).startsWith("Feature Tags: ")) {
				featureFileArrayList.set(i, formatFeatureTags(featureFileArrayList.get(i)));
			}
			else if (featureFileArrayList.get(i).startsWith("Feature: ")) {
				featureFileArrayList.set(i, formatFeatureName(featureFileArrayList.get(i)));
				featureName = getFeatureName(featureFileArrayList.get(i));
			}
			else if (featureFileArrayList.get(i).startsWith("Scenario Tags: ")) {
				featureFileArrayList.set(i, formatScenarioTags(featureFileArrayList.get(i)));
			}
			else if (featureFileArrayList.get(i).startsWith("  Scenario: ")) {
				featureFileArrayList.set(i, formatScenarioName(featureFileArrayList.get(i)));
			}
			else if ("".equals(featureFileArrayList.get(i).trim())) {
				//This is an empty line. Do nothing
			}
			else { //This is a step
				featureFileArrayList.set(i, formatStep(featureFileArrayList.get(i)));
			}
		}

		FileUtils.deleteFile(outFilePath);
		FileUtils.listToTxt(featureFileArrayList, outputFolder + File.separator +
				featureName + ".feature", "", true);
	}

	private String getFeatureName(String featureName) {
		return featureName.replace("Feature: ", "").trim();
	}

	private String formatStep(String step) {

		int i;

		//replace <br> with line break before clean up
		step = step.replace("<br>", "--line_break--");

		step = StringUtils.cleanUpHtmlTags(step);
		ArrayList<String> arl = StringUtils.strToArrayList(step, "--line_break--");
		arl = ArrayListUtils.removeEmptyElements(arl);

		for(i=0;i<arl.size();i++) {
			arl.set(i, "    " + arl.get(i));
		}

		//step = step.replace("{break_here}", System.getProperty("line.separator"));
		step = StringUtils.arrayListToStr(arl, "");
		return step;
	}

	//No formatting required at this time
	private String formatScenarioName(String scenarioName) {
		return scenarioName;
	}

	private String formatScenarioTags(String scenarioTags) {

		if (!scenarioTags.trim().isEmpty()) {
			//No Scenario level tags exist
			if ("Scenario Tags: ".equals(scenarioTags)) {
				return "";
			}
			scenarioTags = StringUtils.trimAndReplaceDelim(scenarioTags, ",", " ");
			return scenarioTags.replace("Scenario Tags: ", "  ");
		}
		//No scenario level tags exist in QC
		else {
			return "";
		}
	}

	//No formatting required at this time
	private String formatFeatureName(String featureName) {
		return featureName;
	}

	private String formatFeatureTags(String featureTags) {

		if (contains(featureTags, "Cucumber Tags:") && !featureTags.trim().isEmpty()) {

			featureTags = featureTags.replace("Feature Tags: ", "");
			featureTags = StringUtils.cleanUpHtmlTags(featureTags);
			featureTags = featureTags.replace("Cucumber Tags:", "");

			return StringUtils.trimAndReplaceDelim(featureTags, ",", " ");
		}
		//No feature level tags exist in QC
		else {
			return "";
		}
	}

	public static void updateQcFromResultsCsv(String resultsCsvPath) {

		ArrayList<String> runResults = null;

		runResults = FileUtils.txtToArrayList(resultsCsvPath);

		if(runResults.isEmpty() || runResults == null) {
			logger.info(String.format("Results file %s is empty! QC update is aborted", resultsCsvPath));
		}
		else {
			try {
				for(String runResult : runResults) {

					String[] runResultArr = runResult.split(",");

					ZipUtils.zip(runResultArr[2]);
					updateQc(runResultArr[0], runResultArr[1], runResultArr[2] + ".zip");
				}
			}
			catch(Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	public static void updateQc(String testName, String testResult,
			String testAttachmentPath) {

		if (!"true".equals(LocalConfUtils.getProperty("updateQc")) ||
			"skipped".equals(testResult) ||
			("false".equals(LocalConfUtils.getProperty("updateFailsToQC")) &&
			 "failed".equalsIgnoreCase(testResult)) )
		{
			//Skip the QC update
			return;
		}

		Dispatch qcConnObj = null;
		Dispatch testSetTreeManager = null;
		Dispatch testSetFolder = null;
		Dispatch testInstances = null;
		Dispatch testInstance = null;
		Dispatch testRunFactory = null;
		Dispatch testRun = null;
		Dispatch testRunAttachment = null;
		Dispatch testRunAttachments = null;
		Dispatch attachmentStorage = null;

		String attachmentName = "";
		String attachmentDir = "";

		int testInstanceCount = -1;
		int i;

		String qcTestSetFolder = LocalConfUtils.getProperty("qcTestSetFolder");

		try {
			qcConnObj = qcConnect();

			//printFields(qcConnObj, "RUN");
			testSetTreeManager = getTestSetTreeManager(qcConnObj);
			testSetFolder = getTestSetFolder(testSetTreeManager, qcTestSetFolder);

			testInstances = getTestInstances(testSetFolder, testName);

			try {
				testInstanceCount = Dispatch.call(testInstances, "Count").getInt();
			}
			catch(Exception e) {
				CucumberLogUtils.logError("Test instance '" + testName +
						"' doesn't exist in the given test set");
				ComThread.Release();
				e.printStackTrace();
			}

			//CucumberLogUtils.logToConsole("Count: " + testInstanceCount);

			if (testInstanceCount > 1) {
				for(i=1;i<=testInstanceCount;i++) {
					testInstance = Dispatch.call(testInstances, "Item", i).toDispatch();
					if(Dispatch.get(testInstance, "TestName").getString().equals(testName))
							break;
				}
			}
			else {
				testInstance = Dispatch.call(testInstances, "Item", 1).toDispatch();
			}

			//CucumberLogUtils.logToConsole("Name: " + Dispatch.get(testInstance, "TestName").getString());

			testRunFactory = getTestRunFactory(testInstance);
			testRun = Dispatch.call(testRunFactory, "AddItem", "Test Run").toDispatch();

			if(testResult.equalsIgnoreCase("passed"))
				Dispatch.put(testRun, "Status", "Passed");
			else
				Dispatch.put(testRun, "Status", "Failed");

			Dispatch.invoke(testRun, "Field", Dispatch.Put,
			        new Object[]{"RN_TESTER_NAME", LocalConfUtils.getProperty("qcUsername")}, new int[1]);
			Dispatch.invoke(testRun, "Field", Dispatch.Put,
			        new Object[]{"RN_HOST", InetAddress.getLocalHost().getHostName()}, new int[1]);
			Dispatch.invoke(testRun, "Field", Dispatch.Put,
			        new Object[]{"RN_DURATION", (new Random()).nextInt(60) + 30}, new int[1]);

			Dispatch.call(testRun, "Post");
			Dispatch.call(testRun, "Refresh");

			if(!testAttachmentPath.isEmpty()) {

				attachmentName = getAttachmentName(testAttachmentPath);
				attachmentDir = getAttachmentDir(testAttachmentPath);

				testRunAttachments = Dispatch.get(testRun, "Attachments").toDispatch();
				testRunAttachment = Dispatch.call(testRunAttachments, "AddItem",
						attachmentName).toDispatch();
				Dispatch.call(testRunAttachment, "Post");

				attachmentStorage = Dispatch.get(testRunAttachment, "AttachmentStorage").toDispatch();
				Dispatch.put(attachmentStorage, "ClientPath", attachmentDir);
				Dispatch.call(attachmentStorage, "Save", attachmentName, true);

				Dispatch.call(testRunAttachment, "Post");
			}

			ComThread.Release();
			CucumberLogUtils.logInfo("Successfully updated test '" + testName + "' in QC");
		}
		catch(Exception e) {
			ComThread.Release();
			CucumberLogUtils.logError(e.getMessage());
		}
	}

	public static String getTestResult(String testName) {

		Dispatch qcConnObj = null;
		Dispatch testSetTreeManager = null;
		Dispatch testSetFolder = null;
		Dispatch testInstances = null;
		Dispatch testInstance = null;

		int testInstanceCount = -1;
		int i;

		String testResult = "";

		String qcTestSetFolder = LocalConfUtils.getProperty("qcTestSetFolder");

		try {
			qcConnObj = qcConnect();

			testSetTreeManager = getTestSetTreeManager(qcConnObj);
			testSetFolder = getTestSetFolder(testSetTreeManager, qcTestSetFolder);

			testInstances = getTestInstances(testSetFolder, testName);

			try {
				testInstanceCount = Dispatch.call(testInstances, "Count").getInt();
			}
			catch(Exception e) {
				CucumberLogUtils.logError("Test instance '" + testName +
						"' doesn't exist in the given test set");
				ComThread.Release();
				e.printStackTrace();
			}

			if (testInstanceCount > 1) {
				for(i=1;i<=testInstanceCount;i++) {
					testInstance = Dispatch.call(testInstances, "Item", i).toDispatch();
					if(Dispatch.get(testInstance, "TestName").getString().equals(testName))
							break;
				}
			}
			else {
				testInstance = Dispatch.call(testInstances, "Item", 1).toDispatch();
			}

			testResult = Dispatch.get(testInstance, "Status").getString();
		}
		catch(Exception e) {
			ComThread.Release();
			CucumberLogUtils.logError(e.getMessage());
		}

		return testResult;
	}

	private static String getAttachmentDir(String testAttachmentPath) {
		File f = new File(testAttachmentPath);
		return f.getParent();
	}

	private static String getAttachmentName(String testAttachmentPath) {
		File f = new File(testAttachmentPath);
		return f.getName();
	}

	private static Dispatch getTestRunFactory(Dispatch testInstance) {
		return Dispatch.get(testInstance, "RunFactory").toDispatch();
	}

	private static Dispatch getTestInstances(Dispatch testSetFolder, String testName) {
		return Dispatch.call(testSetFolder, "FindTestInstances", testName).toDispatch();
	}

	private static Dispatch getTestSetFolder(Dispatch testSetTreeManager,
			String testSetFolderPath) {
		return Dispatch.call(testSetTreeManager, "NodeByPath", testSetFolderPath).toDispatch();
	}

	private static Dispatch getTestSetTreeManager(Dispatch qcConnObj) {
		return Dispatch.get(qcConnObj, "TestSetTreeManager").toDispatch();
	}

	public static void populateDesignStepsInTestFromFeatureFile(String featureFilePath) {

		ArrayList<String> scenarios;
		ArrayList<String> stepDescriptions;

		scenarios = getScenarios(featureFilePath);

		for(String testName : scenarios) {
			stepDescriptions = getStepDescriptions(featureFilePath, testName);
			populateDesignStepsInTest(testName, stepDescriptions);
		}
	}

	private static ArrayList<String> getStepDescriptions(
			String featureFilePath, String testName) {

		ArrayList<String> featureFileLines;
		ArrayList<String> testSteps = new ArrayList<String>();
		String testStep;
		int i;
		String multiLineStep = "";
		
		featureFileLines = FileUtils.txtToArrayList(featureFilePath);

		for(i=0;i<featureFileLines.size();i++) {
			if(featureFileLines.get(i).contains("Scenario: " + testName))
				break;
		}

		do {
			i++;
			testStep = featureFileLines.get(i).trim();
			if (testStep.startsWith("Given") || testStep.startsWith("When") ||
					testStep.startsWith("Then") || testStep.startsWith("And") ||
					testStep.startsWith("But"))
				testSteps.add(testStep);
			else {
				if (!testStep.trim().isEmpty()) {
					multiLineStep = testSteps.get(testSteps.size()-1);
					multiLineStep += System.getProperty("line.separator") + testStep;
					testSteps.set(testSteps.size()-1, multiLineStep);
				}
			}
		} while (!(contains(featureFileLines.get(i), "Scenario:") || i == featureFileLines.size()-1));

		return testSteps;
	}

	private static ArrayList<String> getScenarios(String featureFilePath) {

		ArrayList<String> featureFileLines;
		ArrayList<String> scenarios = new ArrayList<String>();

		featureFileLines = FileUtils.txtToArrayList(featureFilePath);

		for(String line : featureFileLines) {
			if(contains(line, "Scenario:")) {
				line = line.replace("Scenario:", "").trim();
				scenarios.add(line);
			}
		}

		return scenarios;
	}

	public static void populateDesignStepsInTest(String testName, ArrayList<String> stepDescriptions) {

		Dispatch qcConnObj = null;
		Dispatch treeManager = null;
		Dispatch testFolder = null;
		Dispatch test = null;
		Dispatch testFactory = null;
		Dispatch testList = null;
		Dispatch designStepFactory = null;

		int testCount = -1;

		String qcTestPlanFolder = LocalConfUtils.getProperty("qcTestPlanFolder");

		try {

			qcConnObj = qcConnect();

			treeManager = getTestTreeManager(qcConnObj);
			testFolder = getTestFolder(treeManager, qcTestPlanFolder);
			testFactory = getTestFactory(testFolder);

			testList = filterTestsByName(testFactory, testName);
			//testList = Dispatch.call(testFactory, "NewList", "").toDispatch();
			testCount = Dispatch.get(testList, "Count").getInt();
			//CucumberLogUtils.logToConsole("Test Count: " + testCount);

			if (testCount != 1) {
				if(testCount < 1)
					CucumberLogUtils.logError("Test '" + testName +
							"' doesn't exist in the given test plan folder");
				else
					CucumberLogUtils.logError(testCount + " tests exist with name '" +
							testName + "' in the given test plan folder");
				return;
			}

			test = Dispatch.call(testList, "Item", 1).toDispatch();
			designStepFactory = getDesignStepFactory(test);

			//Remove all the current steps in the test
			clearDesignSteps(designStepFactory);

			//Add new steps to the test
			addDesignSteps(test, designStepFactory, stepDescriptions);
			
			ComThread.Release();

		}
		catch(Exception e) {
			ComThread.Release();
			e.printStackTrace();
		}
	}

	private static void addDesignSteps(Dispatch test, Dispatch designStepFactory,
			ArrayList<String> stepDescriptions) {

		Dispatch designStep = null;
		int i;
		ArrayList<ArrayList<String>> designSteps = getDesignStepsWithExpResults(stepDescriptions);
		
		try {
			for(i=0;i<designSteps.size();i++) {
				designStep = Dispatch.call(designStepFactory, "AddItem",
						Variant.VariantNull).toDispatch();

				Dispatch.put(designStep, "StepName", "Step " + (i+1));
				Dispatch.put(designStep, "StepDescription", designSteps.get(i).get(0));
				Dispatch.put(designStep, "StepExpectedResult", designSteps.get(i).get(1));
				Dispatch.call(designStep, "Post");
			}

			Dispatch.call(test, "Post");
		}
		catch(Exception e) {
			Dispatch.call(test, "Post");
		}

	}
	
	private static ArrayList<ArrayList<String>> getDesignStepsWithExpResults(
			ArrayList<String> descriptions) {

		ArrayList<ArrayList<String>> designSteps = new ArrayList<ArrayList<String>>();
		int i;
		int j;
		String expectedResults = "";
		
		for (i=0;i<descriptions.size();i++) {

			ArrayList<String> designStep = new ArrayList<String>();
			
			if (descriptions.get(i).trim().startsWith("Then")) {
				break;
			}
			else {
				designStep.add(descriptions.get(i));
				designStep.add("");
			}
			
			designSteps.add(designStep);
			
		}
		
		for (j=i;j<descriptions.size();j++) {
			expectedResults += descriptions.get(j) + System.getProperty("line.separator");
		}
		
		designSteps.get(designSteps.size()-1).set(1, expectedResults);
		return designSteps;
		
	}

	private static void clearDesignSteps(Dispatch designStepFactory) {

		Dispatch currentSteps = null;
		Dispatch currentStep = null;
		int currentStepCount = -1;
		int i;

		currentSteps = getDesignSteps(designStepFactory);
		currentStepCount = Dispatch.get(currentSteps, "Count").getInt();

		//Test has some existing steps
		if(currentStepCount != 0) {

			for (i=1;i<=currentStepCount;i++) {
				currentStep = Dispatch.call(currentSteps, "Item", i).toDispatch();
				Dispatch.call(designStepFactory, "RemoveItem",
						Dispatch.get(currentStep, "ID").getInt());
			}
		}
	}

	private static Dispatch filterTestsByName(Dispatch testFactory, String testName) {

		Dispatch testFilter = null;
		testName = "\"" + testName + "\"";

		testFilter = Dispatch.call(testFactory, "Filter").toDispatch();
		Dispatch.invoke(testFilter, "Filter", Dispatch.Put,
				new Object[]{"TS_NAME", testName}, new int[1]);

		return Dispatch.call(testFilter, "NewList").toDispatch();
	}

	private static Dispatch getDesignSteps(Dispatch designStepFactory) {
		return Dispatch.call(designStepFactory, "NewList", "").toDispatch();
	}

	private static Dispatch getDesignStepFactory(Dispatch test) {
		return Dispatch.call(test, "DesignStepFactory").toDispatch();
	}

	private static Dispatch getTestFactory(Dispatch testFolder) {
		return Dispatch.call(testFolder, "TestFactory").toDispatch();
	}

	private static Dispatch getTestFolder(Dispatch treeManager, String testFolderPath) {
		return Dispatch.call(treeManager, "NodeByPath", testFolderPath).toDispatch();
	}

	private static Dispatch getTestTreeManager(Dispatch qcConnObj) {
		return Dispatch.get(qcConnObj, "TreeManager").toDispatch();
	}

	private static Dispatch qcConnect() {

		Dispatch qcConnObj = null;

		String qcUrl = LocalConfUtils.getProperty("qcUrl");
		if ((qcUrl == null) || qcUrl.isEmpty())
			qcUrl = "http://qc1/qcbin";

		String qcUsername = LocalConfUtils.getProperty("qcUsername");
		String qcPassword = LocalConfUtils.getProperty("qcPassword");
		String qcDomain = LocalConfUtils.getProperty("qcDomain");
		String qcProject = LocalConfUtils.getProperty("qcProject");

		loadDll();
		ComThread.InitMTA();

		ActiveXComponent activeX = new ActiveXComponent("TDApiOle80.TDConnection");
		qcConnObj = activeX.getObject();

		Dispatch.call(qcConnObj, "InitConnectionEx", qcUrl);
		Dispatch.call(qcConnObj, "Login", qcUsername, EncryptionUtils.decrypt(qcPassword));
		Dispatch.call(qcConnObj, "Connect", qcDomain, qcProject);

		return qcConnObj;
	}

	private static void loadDll() {

		String dllPath = LocalConfUtils.getQcResourcesDir() + File.separator +
				LibraryLoader.getPreferredDLLName() + ".dll";
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, dllPath);
		LibraryLoader.loadJacobLibrary();
	}

	public static void printFields(Dispatch qcConnObj, String objName) {

		Dispatch runFields = null;
		Dispatch runField = null;
		Dispatch fieldProperty = null;

		int i;
		int fieldCount = -1;

		runFields = Dispatch.call(qcConnObj, "Fields", objName).toDispatch();
		fieldCount = Dispatch.call(runFields, "Count").getInt();

		for(i=1;i<=fieldCount;i++) {
			runField = Dispatch.call(runFields, "Item", i).toDispatch();
			fieldProperty = Dispatch.call(runField, "Property").toDispatch();
			logger.info(String.format("User Label: %s", Dispatch.call(fieldProperty, "UserLabel").getString()));
			logger.info(String.format("DB Column: %s", Dispatch.call(fieldProperty, "DbColumnName").getString()));
		}
	}
	
	public static ArrayList<String> runShellCmd(String cmd) {

		Process process;
		InputStream in;
		int ch;
		String str = "";
		
		cmd = "cmd /c " + cmd;
		
		try {
			process = Runtime.getRuntime().exec(cmd);
			in = process.getInputStream();
			
			while((ch = in.read()) != -1) {
				str += (char)ch;
			}
			
		}
		catch(IOException e) {
			e.getMessage();
		}
		
		return StringUtils.strToArrayList(str, System.getProperty("line.separator"));
		//return StringUtils.strToArrayList(str, "%n");
		
	}
}