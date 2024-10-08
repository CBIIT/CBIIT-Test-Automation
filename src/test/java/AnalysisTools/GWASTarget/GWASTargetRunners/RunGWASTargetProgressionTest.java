package AnalysisTools.GWASTarget.GWASTargetRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/java/AnalysisTools/GWASTarget/Features", glue = {"AnalysisTools.GWASTarget.Steps", "Hooks"}, tags = "@Progression", dryRun = false

)

public class RunGWASTargetProgressionTest extends AbstractTestNGCucumberTests {
}