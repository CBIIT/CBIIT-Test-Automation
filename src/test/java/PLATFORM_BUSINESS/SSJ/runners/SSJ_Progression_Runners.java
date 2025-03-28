package PLATFORM_BUSINESS.SSJ.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ssj-progression-reports/ssj-progression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/PLATFORM_BUSINESS/SSJ/playwright/features", "src/test/java/PLATFORM_BUSINESS/SSJ/selenium/Features"}
        , glue = {"PLATFORM_BUSINESS.SSJ.playwright.steps", "PLATFORM_BUSINESS.SSJ.selenium.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class SSJ_Progression_Runners extends AbstractTestNGCucumberTests {
}