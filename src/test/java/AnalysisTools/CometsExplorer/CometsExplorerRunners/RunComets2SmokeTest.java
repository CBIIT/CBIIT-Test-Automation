package AnalysisTools.CometsExplorer.CometsExplorerRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/Comets2/Features"
		, glue="AnalysisTools.Comets2.Steps"
		, tags="@Smoke"
		, dryRun = false
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author sohilz2
 */
public class RunComets2SmokeTest extends AbstractTestNGCucumberTests {
}