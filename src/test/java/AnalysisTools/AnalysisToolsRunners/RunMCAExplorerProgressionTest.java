package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
		, features = {"src/test/java/AnalysisTools/MCAExplorer/Features"}
		, glue = "AnalysisTools.MCAExplorer.Steps"
		, tags = "Progression"
		, dryRun = false
)
public class RunMCAExplorerProgressionTest extends AbstractTestNGCucumberTests{
}