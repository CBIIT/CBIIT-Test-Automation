package GrantsApps.GrantsRunners.ChangePassword;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/change-password-reports/regression-report.html", "json:target/cucumber.json",
            "junit:target/cucumber.xml", "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            features = "src/test/java/GrantsApps/ChangePassword/Features",
            glue = {"GrantsApps.ChangePassword.Steps", "Hooks"},
            tags = "@Regression",
            dryRun = false
    )
    public class RunChangePasswordRegressionTest extends AbstractTestNGCucumberTests{
    }
