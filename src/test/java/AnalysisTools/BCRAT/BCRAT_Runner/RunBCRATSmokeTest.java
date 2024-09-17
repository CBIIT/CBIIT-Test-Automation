package AnalysisTools.BCRAT.BCRAT_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/AnalysisTools/BCRAT/playwright/Features"}
		, glue = {"AnalysisTools.BCRAT.playwright.Steps","Hooks"}
		, tags = "@Smoke"
		, dryRun = false
)
public class RunBCRATSmokeTest extends AbstractTestNGCucumberTests {
}