package PLATFORM_BUSINESS.ApplicationAccessAndApproval.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class AAARegressionRunner {
    @CucumberOptions(plugin = {"html:target/aaa-regression-reports/aaa-regression-report.html",
            "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
            , features = "src/test/java/PLATFORM_BUSINESS/ApplicationAccessAndApproval/features"
            , glue = {"PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps", "Hooks"}
            , tags = "@Regression"
            , dryRun = false
    )

    public class ApplicationAccessAndApprovalRegressionRunner extends AbstractTestNGCucumberTests {
    }
}
