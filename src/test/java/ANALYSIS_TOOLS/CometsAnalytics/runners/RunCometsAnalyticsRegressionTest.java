package ANALYSIS_TOOLS.CometsAnalytics.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
        , features ={"src/test/java/ANALYSIS_TOOLS/CometsAnalytics/features"}
		, glue = {"ANALYSIS_TOOLS.CometsAnalystics.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false      
)

public class RunCometsAnalyticsRegressionTest extends AbstractTestNGCucumberTests{	
}