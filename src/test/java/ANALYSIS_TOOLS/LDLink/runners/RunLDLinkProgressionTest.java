package ANALYSIS_TOOLS.LDLink.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ldLink-progression-reports/ldLink-progression-report.html",
		"json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ANALYSIS_TOOLS/LDLink/features",
		glue = {"ANALYSIS_TOOLS.LDLink.steps", "Hooks"},
		tags = "@Progression",
		dryRun = false
)

public class RunLDLinkProgressionTest extends AbstractTestNGCucumberTests {
}