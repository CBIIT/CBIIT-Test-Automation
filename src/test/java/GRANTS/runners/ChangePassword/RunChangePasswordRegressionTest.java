package GRANTS.runners.ChangePassword;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/change-password-reports/change-password-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            features = "src/test/java/GRANTS/ChangePassword/features",
            glue = {"GRANTS.ChangePassword.steps", "Hooks"},
            tags = "@Regression",
            dryRun = false
    )
    public class RunChangePasswordRegressionTest extends AbstractTestNGCucumberTests{
    }