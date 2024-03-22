package GrantsApps.EM.playwright.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksSteps {
    /**
     * THESE ARE HOOKS
     * HOOKS EXECUTE BEFORE AND AFTER EACH SCENARIO
     */

    /**
     * This method will run before each scenario
     *
     */
    @Before
    public void genericSetUp(Scenario scenario) {
        CucumberLogUtils.scenario = scenario;
        PlaywrightUtils.setUp();
    }

    /**
     * This method runs after each scenario
     */
    @After
    public void genericTearDown()  {
        PlaywrightUtils.tearDown();
    }
}