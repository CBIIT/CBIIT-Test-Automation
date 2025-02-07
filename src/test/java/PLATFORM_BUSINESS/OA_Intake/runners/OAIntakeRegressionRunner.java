package PLATFORM_BUSINESS.OA_Intake.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OAIntake-regression-reports/OAIntake-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/OA_Intake/features"
        , glue = {"PLATFORM_BUSINESS.OA_Intake.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class OAIntakeRegressionRunner extends AbstractTestNGCucumberTests {
}