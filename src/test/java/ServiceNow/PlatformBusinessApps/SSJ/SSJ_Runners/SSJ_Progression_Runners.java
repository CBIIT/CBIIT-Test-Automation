package ServiceNow.PlatformBusinessApps.SSJ.SSJ_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ssj-progression-reports/ssj-progression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/ServiceNow/PlatformBusinessApps/SSJ/playwright/Features"}
        , glue = {"ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)

public class SSJ_Progression_Runners extends AbstractTestNGCucumberTests {
}
