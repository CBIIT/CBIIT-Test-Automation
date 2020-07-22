package com.nci.automation.common;

import java.io.File;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.ExcelUtils;

import cucumber.api.Scenario;

/**
 * This class is the global scenario context.
 */
public class ScenarioContext {

	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	public static Properties localConf;
	public static ThreadLocal<Scenario> scenario = new ThreadLocal<Scenario>();
	public static ThreadLocal<String> dataFilePath = new ThreadLocal<String>();
	public static ThreadLocal<String> sauceSessionId = new ThreadLocal<String>();

	/** The QC Test case results based on current scenario */
	public static ThreadLocal<QcTestResult> currentQcResultTL = new ThreadLocal<QcTestResult>();
	// private static QcTestResult currentQcResult;

	/**
	 * System property name for the scenario name.
	 */
	public static String SCENARIO_NAME_PROPERTY_NAME = "scenarioName";
	public static String USE_SCENARIO_NAME_PROPERTY = "useDefinedScenarioName";

	public static void setDataFile(String scenarioName, String dataDir) {

		String driverFile = dataDir + File.separator + "driver.xls";
		String excelColumnName = "scenarioName";

		scenarioName = scenarioName.trim();

		try {
			Map<String, String> dataValues = ExcelUtils.getRowDataByRowValue(new File(driverFile), excelColumnName,
					scenarioName);

			String dataFileColumnName = "dataFilePath";

			if (!dataValues.isEmpty()) {
				dataFilePath.set(dataDir + File.separator + dataValues.get(dataFileColumnName));
			}
		} catch (Exception e) {
			return;
		}

	}

	public static String getScenarioName() {
		String scenarioName = "";

		if (scenario.get() != null) {
			scenarioName = scenario.get().getName();
			//CucumberLogUtils.logToConsole("Scenario Name: " + scenarioName);
		}

		return scenarioName;
	}

	public static String getScenarioUniqueID() {
		String scenarioID = "";

		if (scenario.get() != null) {
			CucumberLogUtils.logToConsole("Scenario Name: " + scenario.get().getName());
			scenarioID = scenario.get().getId();
			scenarioID = scenarioID.replaceAll("[^a-zA-Z0-9.-]", "_");
			CucumberLogUtils.logToConsole("Scenario ID: " + scenarioID);
		}

		return scenarioID;
	}

	public static QcTestResult getCurrentQcResult() {
		// return ScenarioContext.currentQcResultTL;
		return ScenarioContext.currentQcResultTL.get();
	}

	public static void setCurrentQcResult(QcTestResult currentQcResult) {
		// ScenarioContext.currentQcResult = currentQcResult;
		ScenarioContext.currentQcResultTL.set(currentQcResult);
	}

	public static void cleanCurrentQcResult() {
		// ScenarioContext.currentQcResult = null;
		ScenarioContext.currentQcResultTL.set(null);
	}

	public static String getBrowserID() {
		return localConf.getProperty("browser");
	}

	public static boolean isTakeScreenShots() {
		return "true".equals(localConf.getProperty("takeScreenShots"));
	}

	public static boolean isLogLevelDebug() {
		return "debug".equals(localConf.getProperty("logLevel"));
	}

}
