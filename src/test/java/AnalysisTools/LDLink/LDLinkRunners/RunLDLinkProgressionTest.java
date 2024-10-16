package AnalysisTools.LDLink.LDLinkRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-re]ports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/java/AnalysisTools/LDLink/Features", glue = {"AnalysisTools.LDLink.Steps", "Hooks"}, tags = "@Progression", dryRun = false
)

public class RunLDLinkProgressionTest extends AbstractTestNGCucumberTests {
}