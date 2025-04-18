package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/CHARMS/features", "src/test/java/CHARMS/playwright/features/fanconiStudy"},
        glue = {"CHARMS.steps", "Hooks",  "CHARMS.playwright.steps.fanconiStudy"},
        tags = "@Progression",
        dryRun = false
)
public class Run_CHARMS_Progression_Test extends AbstractTestNGCucumberTests {
}