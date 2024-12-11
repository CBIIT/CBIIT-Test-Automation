package CUSTOM_BUSINESS.Egrants.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/Egrants/features"
        , glue = {"CUSTOM_BUSINESS.Egrants.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
    public class RunEgrantsProgressionTest extends AbstractTestNGCucumberTests {
}