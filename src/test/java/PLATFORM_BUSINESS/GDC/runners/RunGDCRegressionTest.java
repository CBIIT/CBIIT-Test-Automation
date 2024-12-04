package PLATFORM_BUSINESS.GDC.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/gdc-regression-reports/gdc-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/PLATFORM_BUSINESS/GDC/features",
        glue = {"PLATFORM_BUSINESS.GDC.steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)
public class RunGDCRegressionTest extends AbstractTestNGCucumberTests{
}