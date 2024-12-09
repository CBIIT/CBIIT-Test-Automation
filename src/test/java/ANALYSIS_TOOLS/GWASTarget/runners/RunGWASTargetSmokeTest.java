package ANALYSIS_TOOLS.GWASTarget.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/GWASTarget/features",
        glue = {"ANALYSIS_TOOLS.GWASTarget.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

public class RunGWASTargetSmokeTest extends AbstractTestNGCucumberTests {
}