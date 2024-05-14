package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Playwright_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/CCT_CHAT_BOT/Playwright/Features"
        , glue = "ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Steps"
        , tags = "@Progression"
        , dryRun = false
)
public class Run_CCT_CHAT_PW_Progression_Test extends AbstractTestNGCucumberTests {
}