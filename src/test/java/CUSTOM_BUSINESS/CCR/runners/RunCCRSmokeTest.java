package CUSTOM_BUSINESS.CCR.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CustomBusiness/CCR/features"
        , glue = {"CustomBusiness.CCR.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class RunCCRSmokeTest extends AbstractTestNGCucumberTests {
}