package ANALYSIS_TOOLS.ezQTL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ezQTL-smoke-reports/ezQTL-smoke-report.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/ezQTL/features",
        glue = {"ANALYSIS_TOOLS.ezQTL.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

public class RunEZqtlSmokeTest extends AbstractTestNGCucumberTests {
}