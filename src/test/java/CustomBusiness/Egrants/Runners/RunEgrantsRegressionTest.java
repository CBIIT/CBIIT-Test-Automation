package CustomBusiness.Egrants.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/Egrants-regression-reports/Egrants-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CustomBusiness/Egrants/Features"
        , glue = {"CustomBusiness.Egrants.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
    public class RunEgrantsRegressionTest extends AbstractTestNGCucumberTests{
}