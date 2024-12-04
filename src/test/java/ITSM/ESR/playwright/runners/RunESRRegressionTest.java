package ITSM.ESR.playwright.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ESR-reports/ESR-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ITSM/ESR/playwright/features"
        , glue = {"ITSM.ESR.Playwright.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunESRRegressionTest extends AbstractTestNGCucumberTests{
}