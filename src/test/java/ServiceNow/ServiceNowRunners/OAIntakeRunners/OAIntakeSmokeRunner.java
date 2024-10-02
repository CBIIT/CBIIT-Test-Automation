package ServiceNow.ServiceNowRunners.OAIntakeRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt", "pretty"}
        , features = "src/test/java/ServiceNow/OA_Intake/Features"
        , glue = {"ServiceNow.OA_Intake.Steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class OAIntakeSmokeRunner extends AbstractTestNGCucumberTests {
}