package ANALYSIS_TOOLS.CometsExplorer.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ANALYSIS_TOOLS/Comets2/Features"
		, glue={"ANALYSIS_TOOLS.Comets2.Steps", "Hooks"}
		, tags="@Smoke"
		, dryRun = false
)

public class RunComets2SmokeTest extends AbstractTestNGCucumberTests {
}