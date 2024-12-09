package ANALYSIS_TOOLS.mSigPortal.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ANALYSIS_TOOLS/mSigPortal/features"
		, glue={"ANALYSIS_TOOLS.mSigPortal.steps", "Hooks"}
		, tags="@Smoke"
		, dryRun = false
)

public class RunMSigPortalSmokeTest extends AbstractTestNGCucumberTests{
}