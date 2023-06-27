package AnalysisTools.LDLink.Steps;

import java.io.File;
import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.lang.StringUtils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.nci.automation.common.QcTestResult;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.DateUtils;
import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageCache;
import appsCommon.PageInitializer;


public class HooksSteps {
	
	private static final String BUILD_NUMBER = "BUILD_NUMBER";
	public static String SCENARIO_NAME_TEXT = "scenarioNameText";

	/**
	 * This method will run before each scenario
	 * 
	 * @param s
	 * @throws TestingException
	 */
	@Before
	public void genericSetUp(Scenario s) throws TestingException {
		WebDriverUtils.getWebDriver();
		System.out.println();
		MiscUtils.sleep(2000);
		PageInitializer.initializeAllPages();
		ScenarioContext.localConf = LocalConfUtils.loadLocalConf();
		System.out.println("Starting Scenario: " + s.getName());
		ScenarioContext.scenario.set(s);
		String buildNumber = LocalConfUtils.getProperty(BUILD_NUMBER);
		String scenarioName = s.getName();
		scenarioName = scenarioName.replace("|", "");
		scenarioName = scenarioName.trim();
		String scenarioNameForFolderCreation = scenarioName;

		if (!scenarioName.equals(s.getName())) {
			String exampleName = s.getName().replace("|", "");
			exampleName = exampleName.trim();
			scenarioNameForFolderCreation = s.getName() + File.separatorChar + exampleName;
		}

		if (!StringUtils.isEmpty(buildNumber)) {
			scenarioNameForFolderCreation = buildNumber + File.separatorChar + scenarioNameForFolderCreation;
		} else {
			// create artifacts in new folder with current time-stamp
			scenarioNameForFolderCreation = DateUtils.getFormatedDate("MM-dd-yyyy") + File.separatorChar
					+ scenarioNameForFolderCreation;
		}
		System.setProperty(ScenarioContext.USE_SCENARIO_NAME_PROPERTY, "true");
		System.setProperty(ScenarioContext.SCENARIO_NAME_PROPERTY_NAME, scenarioNameForFolderCreation);
		System.setProperty(HooksSteps.SCENARIO_NAME_TEXT, s.getName());// getScenarioName(scenario));
		String resultsDirName = scenarioNameForFolderCreation;
		ConfUtils.setResultsDir(resultsDirName);
	}

	/**
	 * This method runs after each scenario
	 * 
	 * @throws TestingException
	 * @throws MalformedURLException
	 */
	@After
	public void genericTearDown(Scenario s) throws TestingException {

		if (WebDriverUtils.webDriver != null) {
			MiscUtils.sleep(2000);

			System.out.println("Ending Scenario: " + s.getName());
			String scenarioName = ScenarioContext.getScenarioName();
			String scenarioResult = ScenarioContext.scenario.get().getStatus().toString();
			String scenarioResultsDir = ConfUtils.getResultsDir();

			if (scenarioResult.contentEquals("passed"))
				scenarioResult = "Passed";
			else {
				scenarioResult = "Failed";
			}

			QcTestResult currentQcResult = new QcTestResult(scenarioName, scenarioResult, scenarioResultsDir);
			ScenarioContext.setCurrentQcResult(currentQcResult);
			WebDriverUtils.closeWebDriver();
			PageCache.getInstance().destroyInstances();
		}
	}

	@Before("@web")
	public void webSetUp(Scenario s) {
		// use this for web specific setup
		System.out.println("web specific setup");
	}

	@After("@web")
	public void webTearDown() throws MalformedURLException {
		// use this for web specific clean up
		System.out.println("web specific clean up");
	}


}
