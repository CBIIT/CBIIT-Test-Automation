package ANALYSIS_TOOLS.scAtlas.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/scAtlas/features",
        glue = {"ANALYSIS_TOOLS.scAtlas.steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)

public class RunSCAtlasProgressionTest extends AbstractTestNGCucumberTests{
}