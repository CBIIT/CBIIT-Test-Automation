package ANALYSIS_TOOLS.LDLink.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report",
		"json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty" },
		features = "src/test/java/ANALYSIS_TOOLS/LDLink/features",
		glue = {"ANALYSIS_TOOLS.LDLink.steps", "Hooks"},
		tags = "@Smoke",
		dryRun = false
)
public class RunLDLinkSmokeTest  extends AbstractTestNGCucumberTests {
}