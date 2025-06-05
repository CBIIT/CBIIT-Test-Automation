package ANALYSIS_TOOLS.ezQTL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ezQTL-regression-reports/ezQTL-regression-report.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/ezQTL/features",
        glue = {"ANALYSIS_TOOLS.ezQTL.steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class RunEZqtlRegressionTest extends AbstractTestNGCucumberTests {
}