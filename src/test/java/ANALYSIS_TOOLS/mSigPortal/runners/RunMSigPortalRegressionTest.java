package ANALYSIS_TOOLS.mSigPortal.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/mSigPortal-regression-reports/mSigPortal-regression-report.html"
		, "json:target/mSigPortal-regression-reports/cucumber.json"
		, "rerun:target/mSigPortal-regression-reports/failed.txt","pretty"}
		, features="src/test/java/ANALYSIS_TOOLS/mSigPortal/features"
		, glue={"ANALYSIS_TOOLS.mSigPortal.steps", "Hooks"}
		, tags="@Regression"
		, dryRun = false	
)

public class RunMSigPortalRegressionTest extends AbstractTestNGCucumberTests{
}