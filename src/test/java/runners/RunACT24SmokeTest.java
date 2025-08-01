package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/act24-smoke-reports/act24-smoke-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/ACT24/features",
        glue = {"ANALYSIS_TOOLS.ACT24.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)
public class RunACT24SmokeTest extends AbstractTestNGCucumberTests{
}