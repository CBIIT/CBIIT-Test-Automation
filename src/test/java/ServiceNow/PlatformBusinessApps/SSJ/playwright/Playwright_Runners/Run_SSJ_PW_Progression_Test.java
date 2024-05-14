package ServiceNow.PlatformBusinessApps.SSJ.playwright.Playwright_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/SSJ/playwright/Features"
        , glue = "ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps"
        , tags = "@Progression"
        , dryRun = true
)
public class Run_SSJ_PW_Progression_Test extends AbstractTestNGCucumberTests {
}