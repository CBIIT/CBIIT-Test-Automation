package AnalysisTools.ICRP.ICRPRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/java/AnalysisTools/ICRP/Features", glue = {"AnalysisTools.ICRP.Steps", "Hooks"}, tags = "@Smoke", dryRun = false
)

public class RunICRPSmokeTest extends AbstractTestNGCucumberTests {
}