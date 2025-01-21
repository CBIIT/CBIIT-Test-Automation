package PLATFORM_BUSINESS.CCT_CHAT_BOT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cct-regression-reports/cct-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCT_CHAT_BOT/playwright/features"
        , glue = {"PLATFORM_BUSINESS.CCT_CHAT_BOT.playwright.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_CCT_CHAT_PW_Regression_Test extends AbstractTestNGCucumberTests {
}