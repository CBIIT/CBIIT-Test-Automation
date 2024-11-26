package ServiceNow.PlatformBusinessApps.OCPL_Training.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OCPL-Training-Regression-reports/OCPL-Training-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/OCPL_Traning/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.OCPL_Traning.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_OCPL_PW_Regression_Test extends AbstractTestNGCucumberTests {
}