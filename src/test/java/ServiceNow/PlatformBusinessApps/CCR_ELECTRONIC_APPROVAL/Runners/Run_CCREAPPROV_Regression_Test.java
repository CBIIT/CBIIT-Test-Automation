package ServiceNow.PlatformBusinessApps.CCR_ELECTRONIC_APPROVAL.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CCR-Electronic-Approval-Regression-reports/CCR-Electronic-Approval-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/CCR_ELECTRONIC_APPROVAL/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.CCR_ELECTRONIC_APPROVAL.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_CCREAPPROV_Regression_Test extends AbstractTestNGCucumberTests {
}