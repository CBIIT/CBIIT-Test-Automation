package ANALYSIS_TOOLS.cProSite.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "rerun:target/failed.txt","pretty"}
        , features="src/test/java/ANALYSIS_TOOLS/cProSite/features"
        , glue={"ANALYSIS_TOOLS.cProSite.steps", "Hooks"}
        , tags="@Regression"
        , dryRun = false
)
public class RunCProSiteRegressionTest extends AbstractTestNGCucumberTests{
}