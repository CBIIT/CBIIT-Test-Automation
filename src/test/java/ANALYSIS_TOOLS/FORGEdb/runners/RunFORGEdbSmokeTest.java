package ANALYSIS_TOOLS.FORGEdb.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/ANALYSIS_TOOLS/FORGEdb/playwright/features"}
		, glue = {"ANALYSIS_TOOLS.FORGEdb.playwright.steps", "Hooks"}
		, tags = "@Smoke"
		, dryRun = false
)
public class RunFORGEdbSmokeTest extends AbstractTestNGCucumberTests {
}