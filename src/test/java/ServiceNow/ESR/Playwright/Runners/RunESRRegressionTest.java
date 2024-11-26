package ServiceNow.ESR.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ESR-reports/ESR-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/ESR/Playwright/Features"
        , glue = {"ServiceNow.ESR.Playwright.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunESRRegressionTest extends AbstractTestNGCucumberTests{
}