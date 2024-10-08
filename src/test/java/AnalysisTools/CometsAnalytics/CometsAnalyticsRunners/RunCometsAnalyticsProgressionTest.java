package AnalysisTools.CometsAnalytics.CometsAnalyticsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
        , features ={"src/test/java/AnalysisTools/CometsAnalytics/Features"}
        , glue = {"AnalysisTools.CometsAnalystics.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false      
)

public class RunCometsAnalyticsProgressionTest extends AbstractTestNGCucumberTests{
}