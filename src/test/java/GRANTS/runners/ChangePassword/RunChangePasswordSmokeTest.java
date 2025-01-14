package GRANTS.runners.ChangePassword;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/changePassword-smoke-reports/changePassword-smoke-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/GrantsApps/ChangePassword/features",
        glue = {"GrantsApps.ChangePassword.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)
public class RunChangePasswordSmokeTest extends AbstractTestNGCucumberTests{
}
