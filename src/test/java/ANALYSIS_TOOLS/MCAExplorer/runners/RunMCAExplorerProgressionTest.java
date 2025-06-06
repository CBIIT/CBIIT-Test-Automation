package ANALYSIS_TOOLS.MCAExplorer.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features = {"src/test/java/ANALYSIS_TOOLS/MCAExplorer/features"}
		, glue = {"ANALYSIS_TOOLS.MCAExplorer.steps", "Hooks"}
		, tags = "@Progression"
		, dryRun = false
)

public class RunMCAExplorerProgressionTest extends AbstractTestNGCucumberTests{
}