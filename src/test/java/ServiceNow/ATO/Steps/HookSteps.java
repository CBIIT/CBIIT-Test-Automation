package ServiceNow.ATO.Steps;

import java.io.File;

import org.apache.commons.lang.StringUtils;

import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.DateUtils;
import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.WebDriverUtils;

//import CustomBusinessApp.EIDP.Steps.HooksSteps;
import appsCommon.PageInitializer;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookSteps {
	public static String foldeName = "";
	private static final String BUILD_NUMBER = "BUILD_NUMBER";
	public static String SCENARIO_NAME_TEXT = "scenarioNameText";

	@Before(order = 0)
	public void before(Scenario s) {
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		/*String basePath = System.getProperty("user.dir") + "/Screenshots/";
		File directory = new File(basePath);
		if (!directory.exists()) {
			directory.mkdir();
		}
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String newPath = basePath + "Report-" + dateName + "/";
		File directory1 = new File(newPath);
		directory1.mkdir();
		foldeName = directory1.toString();*/
		WebDriverUtils.getWebDriver();
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
		System.setProperty(SCENARIO_NAME_TEXT, s.getName());// getScenarioName(scenario));
		String resultsDirName = scenarioNameForFolderCreation;
		ConfUtils.setResultsDir(resultsDirName);
	}

	@After(order = 0)
	public void tearDown() {
		WebDriverUtils.closeWebDriver();
	}

}
