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

    private AssertionError assertionError; // To hold any assertion error during the test
    public static SoftAssert softAssert;

    @Before("@selenium")
    public void startSelenium(Scenario scenario) {
        System.out.println("Starting Selenium Scenario: " + scenario.getName());
        CucumberLogUtils.scenario = scenario;
        WebDriverUtils.setUp(); // Set up Selenium
        PageInitializer.initializeAllPages();
        softAssert = new SoftAssert();
        assertionError = null; // Reset for each test
    }

    @Before("@playwright")
    public void startPlaywright(Scenario scenario) {
        System.out.println("Starting Playwright Scenario: " + scenario.getName());
        CucumberLogUtils.scenario = scenario;
        PlaywrightUtils.setUp(); // Set up Playwright
        softAssert = new SoftAssert();
        assertionError = null; // Reset for each test
    }

    @After("@selenium")
    public void endSelenium() {
        try {
            softAssert.assertAll();
        } catch (AssertionError error) {
            assertionError = error;
        } finally {
            CucumberLogUtils.logScreenshot();
            webDriver.quit(); // Tear down Selenium
        }

        if (assertionError != null) {
            throw assertionError; // Re-throw assertions
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
            PlaywrightUtils.tearDown(); // Tear down Playwright
        }

        if (assertionError != null) {
            throw assertionError; // Re-throw assertions
        }
    }
}