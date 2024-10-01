package AnalysisTools.NIFESubmit.NIFESubmit_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/NIFE-Regression-reports/NIFE-regression-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/AnalysisTools/NIFESubmit/playwright/Features"}
		, glue = "AnalysisTools.NIFESubmit.playwright.Steps"
		, tags = "@Regression"
		, dryRun = false
)
public class RunNIFESubmitRegressionTest extends AbstractTestNGCucumberTests {
}