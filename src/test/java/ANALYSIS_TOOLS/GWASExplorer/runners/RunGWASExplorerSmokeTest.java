package ANALYSIS_TOOLS.GWASExplorer.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report",
		"json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ANALYSIS_TOOLS/GWASExplorer/features",
		glue = {"ANALYSIS_TOOLS.GWASExplorer.steps", "Hooks"},
		tags = "@Smoke",
		dryRun = false
)

public class RunGWASExplorerSmokeTest extends AbstractTestNGCucumberTests {
}