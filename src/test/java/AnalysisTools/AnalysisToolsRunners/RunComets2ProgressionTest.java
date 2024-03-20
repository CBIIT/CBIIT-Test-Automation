package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/Comets2/Features"
		, glue="AnalysisTools.Comets2.Steps"
		, tags="@Progression"
		, dryRun = false
		)
/**
 * 
 * @author sohilz2
 */
public class RunComets2ProgressionTest extends AbstractTestNGCucumberTests{
}
