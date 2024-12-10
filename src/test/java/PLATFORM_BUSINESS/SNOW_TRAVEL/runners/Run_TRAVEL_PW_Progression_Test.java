package PLATFORM_BUSINESS.SNOW_TRAVEL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/SNOW_TRAVEL/playwright/features"
        , glue = {"PLATFORM_BUSINESS.SNOW_TRAVEL.playwright.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)

public class Run_TRAVEL_PW_Progression_Test extends AbstractTestNGCucumberTests {
}