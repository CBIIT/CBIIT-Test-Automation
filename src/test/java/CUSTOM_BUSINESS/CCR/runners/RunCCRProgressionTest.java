package CUSTOM_BUSINESS.CCR.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/CCR/features"
        , glue = {"CUSTOM_BUSINESS.CCR.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class RunCCRProgressionTest extends AbstractTestNGCucumberTests {
}