package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cct-smoke-reports/cct-smoke-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/CCT_CHAT_BOT/Playwright/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_CCT_CHAT_Smoke_Test extends AbstractTestNGCucumberTests {
}