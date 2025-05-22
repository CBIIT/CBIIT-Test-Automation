package PLATFORM_BUSINESS.TransferFundsMOU.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/tfm-smoke-reports/tfm-smoke-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/TransferFundsMOU/features"
        , glue = {"PLATFORM_BUSINESS.TransferFundsMOU.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)

public class TFMSmokeRunner extends AbstractTestNGCucumberTests {
}
