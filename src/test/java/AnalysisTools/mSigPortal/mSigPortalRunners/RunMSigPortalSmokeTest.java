package AnalysisTools.mSigPortal.mSigPortalRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/mSigPortal/Features"
		, glue={"AnalysisTools.mSigPortal.Steps", "Hooks"}
		, tags="@Smoke"
		, dryRun = false
)

public class RunMSigPortalSmokeTest extends AbstractTestNGCucumberTests{
}