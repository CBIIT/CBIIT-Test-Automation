package AnalysisTools.BCRAT.BCRAT_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/AnalysisTools/BCRAT/playwright/Features"}
		, glue = "AnalysisTools.BBCRAT.playwright.Steps"
		, tags = "@Regression"
		, dryRun = false
)
public class RunBCRATRegressionTest extends AbstractTestNGCucumberTests {
}