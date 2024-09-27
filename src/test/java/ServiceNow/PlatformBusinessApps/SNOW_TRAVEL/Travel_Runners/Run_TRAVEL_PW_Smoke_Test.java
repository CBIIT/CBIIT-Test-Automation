package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Travel_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/SNOW_TRAVEL/playwright/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_TRAVEL_PW_Smoke_Test extends AbstractTestNGCucumberTests {
}