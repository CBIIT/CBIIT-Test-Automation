package CUSTOM_BUSINESS.OASYS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OASYS-regression-reports/OASYS-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/OASYS/features"
        , glue = {"CUSTOM_BUSINESS.OASYS.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunOASYSRegressionTest extends AbstractTestNGCucumberTests{
}
