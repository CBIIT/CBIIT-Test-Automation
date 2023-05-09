package AnalysisTools.AnalysisToolsRunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt","pretty"}
        , features="src/test/java/AnalysisTools/cProSite/Features"
        , glue="AnalysisTools.cProSite.Steps"
        , tags="@Smoke"
        , dryRun = false
        , monochrome=true
        , strict = true

)



public class RunCProSiteSmokeTest {
}
