package AnalysisTools.cProSite.cProSiteRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/cProSite/Features"
		, glue={"AnalysisTools.cProSite.Steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false
	)
public class RunCProSiteProgressionTest extends AbstractTestNGCucumberTests{
}