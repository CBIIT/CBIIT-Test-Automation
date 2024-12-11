package ANALYSIS_TOOLS.ThreeDVizSNP.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/html-reports/cucumber-default-report.html"
		, "json:target/cucumber.json"
		, "rerun:target/failed.txt"
		, "pretty"}
        , features ={"src/test/java/ANALYSIS_TOOLS/ThreeDVizSNP/features"}
		, glue = {"ANALYSIS_TOOLS.ThreeDVizSNP.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false      
)

public class RunThreeDVizSNPSmokeTest extends AbstractTestNGCucumberTests{
}