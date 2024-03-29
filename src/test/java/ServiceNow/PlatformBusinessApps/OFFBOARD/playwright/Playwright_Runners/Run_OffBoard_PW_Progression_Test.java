package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Playwright_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/OFFBOARD/playwright/Features"
        , glue = "ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Steps"
        , tags = "@Progression"
        , dryRun = false
)
public class Run_OffBoard_PW_Progression_Test extends AbstractTestNGCucumberTests {
}