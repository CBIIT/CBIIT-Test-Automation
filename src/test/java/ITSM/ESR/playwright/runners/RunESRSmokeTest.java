package ITSM.ESR.playwright.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ITSM/ESR/playwright/features"
        , glue = {"ITSM.ESR.playwright.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class RunESRSmokeTest extends AbstractTestNGCucumberTests{
}