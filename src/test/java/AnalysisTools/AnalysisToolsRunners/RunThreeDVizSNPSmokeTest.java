package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { 
		"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt", "pretty" }
        , features = {"src/test/java/AnalysisTools/ThreeDVizSNP/Features" }
        , glue = "AnalysisTools.ThreeDVizSNP.Steps"
        , tags = "@ThreeDVizSNP"
        , dryRun = false
        

)

public class RunThreeDVizSNPSmokeTest extends AbstractTestNGCucumberTests {

}
