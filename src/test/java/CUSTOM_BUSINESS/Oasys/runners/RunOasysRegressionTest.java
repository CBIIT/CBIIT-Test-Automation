package CUSTOM_BUSINESS.Oasys.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/Oasys-regression-reports/Oasys-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/Oasys/features"
        , glue = {"CUSTOM_BUSINESS.Oasys.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunOasysRegressionTest extends AbstractTestNGCucumberTests{
}
