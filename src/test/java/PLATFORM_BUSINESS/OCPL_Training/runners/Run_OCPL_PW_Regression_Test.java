package PLATFORM_BUSINESS.OCPL_Training.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OCPL-Training-Regression-reports/OCPL-Training-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/OCPL_Training/features"
        , glue = {"PLATFORM_BUSINESS.OCPL_Training.steps", "Hooks"}
        , tags = "@Regression1"
        , dryRun = false
)

public class Run_OCPL_PW_Regression_Test extends AbstractTestNGCucumberTests {
}