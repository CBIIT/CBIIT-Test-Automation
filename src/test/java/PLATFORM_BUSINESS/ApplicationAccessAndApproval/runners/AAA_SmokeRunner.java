package PLATFORM_BUSINESS.ApplicationAccessAndApproval.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class AAA_SmokeRunner {
    @CucumberOptions(plugin = {"html:target/aaa-smoke-reports/aaa-smoke-report.html",
            "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
            , features = "src/test/java/PLATFORM_BUSINESS/ApplicationAccessAndApproval/features"
            , glue = {"PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps", "Hooks"}
            , tags = "@Smoke"
            , dryRun = false
    )

    public class AAASmokeRunner extends AbstractTestNGCucumberTests {
    }
}
