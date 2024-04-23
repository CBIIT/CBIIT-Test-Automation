package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Playwright_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/SNOWOBF/playwright/Features"
        , glue = "ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Steps"
        , tags = "@Progression"
        , dryRun = true
)
public class Run_OBF_PW_Progression_Test extends AbstractTestNGCucumberTests {
}