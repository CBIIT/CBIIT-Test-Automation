package ANALYSIS_TOOLS.BCRAT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/ANALYSIS_TOOLS/BCRAT/playwright/features"}
		, glue = {"ANALYSIS_TOOLS.BCRAT.playwright.steps", "Hooks"}
		, tags = "@Progression"
		, dryRun = false
)
public class RunBCRATProgressionTest extends AbstractTestNGCucumberTests {
}