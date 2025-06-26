package PLATFORM_BUSINESS.CCR_Help_Desk.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ccr_Help_Desk-regression-reports/ccr_Help_Desk-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCR_Help_Desk/features"
        , glue = {"PLATFORM_BUSINESS.CCR_Help_Desk.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class Run_CCR_OIT_Helpdesk_PW_Regression_Test extends AbstractTestNGCucumberTests {
}