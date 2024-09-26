package AnalysisTools.JPSurv.JPSurvRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/JPSurv/Features"
		, glue={"AnalysisTools.JPSurv.Steps", "Hooks"}
		, tags="@Smoke"
		, dryRun=false
		)

public class RunJPSurvSmokeTest extends AbstractTestNGCucumberTests{
}