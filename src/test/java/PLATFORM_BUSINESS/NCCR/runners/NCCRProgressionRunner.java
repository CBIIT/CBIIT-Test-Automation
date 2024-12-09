package PLATFORM_BUSINESS.NCCR.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/NCCR/features"
        , glue = {"PLATFORM_BUSINESS.NCCR.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)

public class NCCRProgressionRunner  extends AbstractTestNGCucumberTests {
}
