package ANALYSIS_TOOLS.ACT24.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/AnalysisTools/ACT24/Features",
        glue = {"ANALYSIS_TOOLS.ACT24.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class RunACT24RegressionTest extends AbstractTestNGCucumberTests{
}