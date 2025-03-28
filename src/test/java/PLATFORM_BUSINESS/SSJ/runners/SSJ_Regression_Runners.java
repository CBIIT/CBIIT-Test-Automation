package PLATFORM_BUSINESS.SSJ.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ssj-regression-reports/ssj-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/PLATFORM_BUSINESS/SSJ/playwright/features", "src/test/java/PLATFORM_BUSINESS/SSJ/selenium/features"}
        , glue = {"PLATFORM_BUSINESS.SSJ.playwright.steps", "PLATFORM_BUSINESS.SSJ.selenium.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class SSJ_Regression_Runners extends AbstractTestNGCucumberTests {
}
