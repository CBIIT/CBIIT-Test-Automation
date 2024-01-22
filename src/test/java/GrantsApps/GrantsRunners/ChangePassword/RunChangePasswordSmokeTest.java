package GrantsApps.GrantsRunners.ChangePassword;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/GrantsApps/ChangePassword/Features",
        glue = "GrantsApps.ChangePassword.Steps",
        tags = "@Smoke",
        dryRun = false,
        monochrome = true,
        strict = true
)
public class RunChangePasswordSmokeTest {
}
