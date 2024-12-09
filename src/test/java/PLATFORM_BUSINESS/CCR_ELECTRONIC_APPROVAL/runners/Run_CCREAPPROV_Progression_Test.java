package PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/CCR_ELECTRONIC_APPROVAL/features"
        , glue = {"PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class Run_CCREAPPROV_Progression_Test extends AbstractTestNGCucumberTests {
}