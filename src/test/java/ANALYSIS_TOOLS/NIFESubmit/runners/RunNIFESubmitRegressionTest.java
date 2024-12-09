package ANALYSIS_TOOLS.NIFESubmit.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/NIFE-Regression-reports/NIFE-regression-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/ANALYSIS_TOOLS/NIFESubmit/playwright/features"}
		, glue = {"ANALYSIS_TOOLS.NIFESubmit.playwright.steps", "Hooks"}
		, tags = "@Regression"
		, dryRun = false
)
public class RunNIFESubmitRegressionTest extends AbstractTestNGCucumberTests {
}