package PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CCR-Electronic-Approval-Regression-reports/CCR-Electronic-Approval-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCR_ELECTRONIC_APPROVAL/features"
        , glue = {"PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.steps", "Hooks"}
        , tags = "@Regression1"
        , dryRun = false
)
public class Run_CCREAPPROV_Regression_Test extends AbstractTestNGCucumberTests {
}