package AnalysisTools.Soccer.Soccer_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/AnalysisTools/Soccer/playwright/Features"}
		, glue = {"AnalysisTools.Soccer.playwright.Steps","Hooks"}
		, tags = "@Smoke"
		, dryRun = false
)
public class RunSoccerSmokeTest extends AbstractTestNGCucumberTests {
}