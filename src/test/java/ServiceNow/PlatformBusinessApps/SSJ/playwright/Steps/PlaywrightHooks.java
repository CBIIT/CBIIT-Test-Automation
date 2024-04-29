package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class PlaywrightHooks extends PlaywrightUtils {

    @Before
    public void start(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        setUp();
    }

    @After
    public void end(){
        tearDown();
    }
}