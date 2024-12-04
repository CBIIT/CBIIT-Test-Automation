package ANALYSIS_TOOLS.scAtlas.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/scAtlas/features",
        glue = {"ANALYSIS_TOOLS.scAtlas.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

public class RunSCAtlasSmokeTest extends AbstractTestNGCucumberTests {
}