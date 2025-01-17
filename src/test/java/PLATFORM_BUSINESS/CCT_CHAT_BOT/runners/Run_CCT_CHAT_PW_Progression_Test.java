package PLATFORM_BUSINESS.CCT_CHAT_BOT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cct-progression-reports/cct-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCT_CHAT_BOT/playwright/features"
        , glue = {"PLATFORM_BUSINESS.CCT_CHAT_BOT.playwright.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class Run_CCT_CHAT_PW_Progression_Test extends AbstractTestNGCucumberTests {
}