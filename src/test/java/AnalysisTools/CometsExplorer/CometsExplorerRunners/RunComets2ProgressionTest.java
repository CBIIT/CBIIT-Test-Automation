package AnalysisTools.CometsExplorer.CometsExplorerRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/Comets2/Features"
		, glue={"AnalysisTools.Comets2.Steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false
		)

public class RunComets2ProgressionTest extends AbstractTestNGCucumberTests{
}