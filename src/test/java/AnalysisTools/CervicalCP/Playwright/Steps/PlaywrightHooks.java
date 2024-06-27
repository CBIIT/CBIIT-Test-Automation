 package AnalysisTools.CervicalCP.Playwright.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class PlaywrightHooks extends PlaywrightUtils {
	/**
	 * THESE ARE HOOKS
	 * HOOKS EXECUTE BEFORE AND AFTER EACH SCENARIO
	 */

	/**
	 * This method will run before each scenario
	 *
	 */
	@Before
	public void start(Scenario scenario) {
		CucumberLogUtils.scenario = scenario;
		setUp();
	}

	/**
	 * This method runs after each scenario
	 */
	@After
	public void end() {
		tearDown();
	}

}
