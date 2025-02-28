package GRANTS.runners.GPMATS;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/GPMATS-regression-reports/GPMATS-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/GRANTS/GPMATS/features",
        glue = {"GRANTS.GPMATS.steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)
public class Run_GPMATS_Regression_Test extends AbstractTestNGCucumberTests {
}
