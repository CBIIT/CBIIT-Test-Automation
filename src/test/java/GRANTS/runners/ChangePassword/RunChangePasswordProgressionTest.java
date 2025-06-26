package GRANTS.runners.ChangePassword;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "rerun:target/failed.txt", "pretty"}
        , features = "src/test/java/GRANTS/ChangePassword/features"
        , glue = {"GRANTS.ChangePassword.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class RunChangePasswordProgressionTest extends AbstractTestNGCucumberTests{
}