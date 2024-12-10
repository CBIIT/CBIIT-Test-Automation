package CHARMS.Playwright.Runners.FanconiStudy;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/CHARMS/Playwright/Features/FanconiStudy",
        glue = {"CHARMS.Playwright.Steps","Hooks"},
        tags = "@Fanconi_Regression1",
        dryRun = false
)
public class Run_CHARMS_FanconiSurvey_Regression_Test extends AbstractTestNGCucumberTests {
}
