package ServiceNow.CHARMS.FanconiSurvey.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/* we would have to come back and update this runners class at a later time.*/
@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/CHARMS/FanconiSurvey/Playwright/Features",
        glue = {"ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps","Hooks"},
        tags = "@Regression",
        dryRun = false
)
public class Run_CHARMS_FanconiSurvey_Regression_Test extends AbstractTestNGCucumberTests {
}
