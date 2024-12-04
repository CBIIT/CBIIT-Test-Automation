package PLATFORM_BUSINESS.SNOW_TRAVEL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/Travel-Request-Regression-reports/Travel-Request-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/SNOW_TRAVEL/playwright/features"
        , glue = {"PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_TRAVEL_PW_Regression_Test extends AbstractTestNGCucumberTests {
}