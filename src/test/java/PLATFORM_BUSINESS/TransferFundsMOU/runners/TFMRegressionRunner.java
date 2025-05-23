package PLATFORM_BUSINESS.TransferFundsMOU.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/tfm-regression-reports/tfm-regression-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/TransferFundsMOU/features"
        , glue = {"PLATFORM_BUSINESS.TransferFundsMOU.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class TFMRegressionRunner extends AbstractTestNGCucumberTests {
}
