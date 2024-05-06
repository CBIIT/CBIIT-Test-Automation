package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.asserts.SoftAssert;

public class PlaywrightHooks extends PlaywrightUtils {

    SoftAssert softAssert;
    @Before
    public void start(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        setUp();
        softAssert = new SoftAssert();
    }

    @After
    public void end(){
        softAssert.assertAll();
        tearDown();
    }
}