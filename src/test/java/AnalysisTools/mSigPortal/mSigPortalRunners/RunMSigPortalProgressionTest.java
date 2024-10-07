package AnalysisTools.mSigPortal.mSigPortalRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/mSigPortal/Features"
		, glue={"AnalysisTools.mSigPortal.Steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false	
)

public class RunMSigPortalProgressionTest extends AbstractTestNGCucumberTests{
}