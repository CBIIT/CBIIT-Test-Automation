package ANALYSIS_TOOLS.MRAT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features ={"src/test/java/ANALYSIS_TOOLS/MRAT/playwright/features"}
		, glue = {"ANALYSIS_TOOLS.MRAT.playwright.steps", "Hooks"}
		, tags = "@Regression"
		, dryRun = false
)
public class RunMRATRegressionTest extends AbstractTestNGCucumberTests {
}