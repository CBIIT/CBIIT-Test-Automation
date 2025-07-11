package Hooks;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.asserts.SoftAssert;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class Hooks {

    private AssertionError assertionError;  // to hold any assertion error during the test
    public static SoftAssert softAssert;

    @Before("@selenium")
    public void startSelenium(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        WebDriverUtils.setUp(); // setUp for Selenium
        PageInitializer.initializeAllPages();
        softAssert = new SoftAssert();
        assertionError = null;  // reset the assertion error at the start of each test
    }

    @Before("@playwright")
    public void startPlaywright(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        PlaywrightUtils.setUp(); // setUp for Playwright
        softAssert = new SoftAssert();
        assertionError = null;  // reset the assertion error at the start of each test
    }

//    @After("@selenium")
    public void endSelenium() {
        try {
            softAssert.assertAll();
        } catch (AssertionError error) {
            assertionError = error;
        } finally {
            CucumberLogUtils.logScreenshot();
            webDriver.quit(); // tearDown() for Selenium
        }

        if (assertionError != null) {
            throw assertionError;  // re-throw the assertion error after tearDown()
        }
    }

    @After("@playwright")
    public void endPlaywright() {
        try {
            softAssert.assertAll();
        } catch (AssertionError error) {
            assertionError = error;
        } finally {
            CucumberLogUtils.playwrightScreenshot(page);
            PlaywrightUtils.tearDown(); // tearDown() for Playwright
        }

        if (assertionError != null) {
            throw assertionError;  // re-throw the assertion error after tearDown()
        }
    }
}
