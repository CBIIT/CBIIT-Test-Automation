package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cct-progression-reports/cct-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/CCT_CHAT_BOT/Playwright/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class Run_CCT_CHAT_PW_Progression_Test extends AbstractTestNGCucumberTests {
}