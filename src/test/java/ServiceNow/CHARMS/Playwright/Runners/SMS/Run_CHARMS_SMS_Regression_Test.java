package ServiceNow.CHARMS.Playwright.Runners.FanconiStudy;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/CHARMS/FanconiSurvey/Playwright/Features",
        glue = {"ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps","Hooks"},
        tags = "@In-Progress",
        dryRun = false
)
public class Run_CHARMS_SMS_Regression_Test extends AbstractTestNGCucumberTests {
}
