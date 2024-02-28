package AnalysisTools.AnalysisToolsRunners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {
		"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt", "pretty" }
        , features = {"src/test/java/AnalysisTools/MCAExplorer/Features" }
        , glue = "AnalysisTools.MCAExplorer.Steps"
        , tags = "@Smoke"
        , dryRun = false
        , monochrome = true
        , strict = true

)

public class RunMCAExplorerSmokeTest extends AbstractTestNGCucumberTests {

}
