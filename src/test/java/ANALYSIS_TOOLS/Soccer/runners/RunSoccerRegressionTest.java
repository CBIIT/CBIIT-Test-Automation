package ANALYSIS_TOOLS.Soccer.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin ={"html:target/soccer-regression-reports/soccer-regression-report.html"
        , "json:target/cucumber.json"
        , "rerun:target/failed.txt"
        , "pretty"}
        , features ={"src/test/java/ANALYSIS_TOOLS/Soccer/playwright/features"}
        , glue = {"ANALYSIS_TOOLS.Soccer.playwright.steps","Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunSoccerRegressionTest extends AbstractTestNGCucumberTests {
}