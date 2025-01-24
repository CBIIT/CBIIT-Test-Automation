package PLATFORM_BUSINESS.CCT_CHAT_BOT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/cct-smoke-reports/cct-smoke-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCT_CHAT_BOT/features"
        , glue = {"PLATFORM_BUSINESS.CCT_CHAT_BOT.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_CCT_CHAT_Smoke_Test extends AbstractTestNGCucumberTests {
}