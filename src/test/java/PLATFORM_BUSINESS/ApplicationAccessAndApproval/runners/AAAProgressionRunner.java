package PLATFORM_BUSINESS.ApplicationAccessAndApproval.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/aaa-progression-reports/aaa-progression-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/ApplicationAccessAndApproval/features"
        , glue = {"PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false

)

public class AAAProgressionRunner extends AbstractTestNGCucumberTests {
}
