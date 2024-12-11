package PLATFORM_BUSINESS.SEER.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"html:target/SEER-Regression-reports/SEER-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/PLATFORM_BUSINESS/SEER/features",
        glue = {"PLATFORM_BUSINESS.SEER.steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class Run_SEER_Regression_Test extends AbstractTestNGCucumberTests {
}