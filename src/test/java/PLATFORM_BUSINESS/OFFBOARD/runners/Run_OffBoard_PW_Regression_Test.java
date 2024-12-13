package PLATFORM_BUSINESS.OFFBOARD.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/offboard-regression-reports/offboard-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/OFFBOARD/features"
        , glue = {"PLATFORM_BUSINESS.OFFBOARD.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class Run_OffBoard_PW_Regression_Test extends AbstractTestNGCucumberTests{
}
