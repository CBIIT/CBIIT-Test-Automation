package ServiceNow.PlatformBusinessApps.SNOWPROJ.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OCPL-Regression-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/SNOWPROJ/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.SNOWPROJ.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_OCPL_PW_Regression_Test extends AbstractTestNGCucumberTests {
}