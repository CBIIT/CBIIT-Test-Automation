package ServiceNow.CHARMS.SMS.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/CHARMS/SMS/Playwright/Features",
        glue = {"ServiceNow.CHARMS.SMS.Playwright.Steps","Hooks"},
        tags = "@Regression",
        dryRun = false
)
public class Run_CHARMS_SMS_Regression_Test extends AbstractTestNGCucumberTests {
}
