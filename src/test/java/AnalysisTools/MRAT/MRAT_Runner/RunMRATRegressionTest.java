package AnalysisTools.MRAT.MRAT_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/AnalysisTools/MRAT/playwright/Features"}
		, glue = {"AnalysisTools.MRAT.playwright.Steps", "Hooks"}
		, tags = "@Regression"
		, dryRun = false
)
public class RunMRATRegressionTest extends AbstractTestNGCucumberTests {
}