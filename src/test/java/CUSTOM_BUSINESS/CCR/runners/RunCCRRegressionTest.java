package CUSTOM_BUSINESS.CCR.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CCR-regression-reports/CCR-regression-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/CCR/features"
        , glue = {"CUSTOM_BUSINESS.CCR.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunCCRRegressionTest extends AbstractTestNGCucumberTests {
}