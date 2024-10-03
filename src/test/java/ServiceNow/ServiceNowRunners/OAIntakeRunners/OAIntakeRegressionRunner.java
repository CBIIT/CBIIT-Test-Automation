package ServiceNow.ServiceNowRunners.OAIntakeRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
            , features = "src/test/java/ServiceNow/OA_Intake/Features"
            , glue = {"ServiceNow.OA_Intake.Steps", "Hooks"}
            , tags = "@Regression"
            , dryRun = false
    )
    public class OAIntakeRegressionRunner extends AbstractTestNGCucumberTests {
    }