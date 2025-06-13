package ANALYSIS_TOOLS.mSigPortal.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/mSigPortal-progression-reports/mSigPortal-progression-report.html"
		, "json:target/mSigPortal-progression-reports/cucumber.json"
		, "rerun:target/mSigPortal-progression-reports/failed.txt","pretty"}
		, features="src/test/java/ANALYSIS_TOOLS/mSigPortal/features"
		, glue={"ANALYSIS_TOOLS.mSigPortal.steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false	
)

public class RunMSigPortalProgressionTest extends AbstractTestNGCucumberTests{
}