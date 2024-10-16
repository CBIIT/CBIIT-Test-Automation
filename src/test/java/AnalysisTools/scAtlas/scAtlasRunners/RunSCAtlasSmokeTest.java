package AnalysisTools.scAtlas.scAtlasRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/java/AnalysisTools/scAtlas/Features", glue = {"AnalysisTools.scAtlas.Steps", "Hooks"}, tags = "@Smoke", dryRun = false
)

public class RunSCAtlasSmokeTest extends AbstractTestNGCucumberTests {
}