package PLATFORM_BUSINESS.NCCR.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/NCCR-regression-reports/NCCR-Regression-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/NCCR/features"
        , glue = {"PLATFORM_BUSINESS.NCCR.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class NCCRRegressionRunner  extends AbstractTestNGCucumberTests {
}
