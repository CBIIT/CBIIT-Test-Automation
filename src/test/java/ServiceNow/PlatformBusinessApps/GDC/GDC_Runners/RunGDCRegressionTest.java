package ServiceNow.PlatformBusinessApps.GDC.GDC_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/gdc-regression-reports/gdc-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/PlatformBusinessApps/GDC/Features",
        glue = {"ServiceNow.PlatformBusinessApps.GDC.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)
public class RunGDCRegressionTest extends AbstractTestNGCucumberTests{
}