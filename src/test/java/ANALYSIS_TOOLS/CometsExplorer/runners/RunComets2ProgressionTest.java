package ANALYSIS_TOOLS.CometsExplorer.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ANALYSIS_TOOLS/Comets2/features"
		, glue={"ANALYSIS_TOOLS.Comets2.steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false
		)

public class RunComets2ProgressionTest extends AbstractTestNGCucumberTests{
}