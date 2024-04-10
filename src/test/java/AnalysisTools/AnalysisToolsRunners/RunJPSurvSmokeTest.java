package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/JPSurv/Features"
		, glue="AnalysisTools.JPSurv.Steps"
		, tags="@Smoke"
		, dryRun=false
		)

public class RunJPSurvSmokeTest extends AbstractTestNGCucumberTests{
}