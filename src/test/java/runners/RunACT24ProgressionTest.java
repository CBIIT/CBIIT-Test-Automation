package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/act24-progression-reports/act24-progression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/ACT24/features",
        glue = {"ANALYSIS_TOOLS.ACT24.steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
public class RunACT24ProgressionTest extends AbstractTestNGCucumberTests{
}