package ServiceNow.ServiceNowRunners.NCCRRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/NCCR/Features"
        , glue = {"ServiceNow.NCCR.Steps", "Hooks"}
        , tags = "@NCCRRegression"
        , dryRun = false
)
public class NCCRRegressionRunner  extends AbstractTestNGCucumberTests {
}
