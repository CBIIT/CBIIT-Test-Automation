package ServiceNow.ServiceNowRunners.AwardNominationRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/AwardNomination/Features"
        , glue = {"ServiceNow.AwardNomination.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class AwardNominationRegressionRunner  extends AbstractTestNGCucumberTests {
}
