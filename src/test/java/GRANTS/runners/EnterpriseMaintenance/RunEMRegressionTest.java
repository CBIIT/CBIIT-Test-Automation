package GRANTS.runners.EnterpriseMaintenance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/EM-reports/EM-Regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/GrantsApps/EM/selenium/features", "src/test/java/GrantsApps/EM/playwright/features"}
        , glue = {"GrantsApps.EM.selenium.steps", "GrantsApps.EM.playwright.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)
public class RunEMRegressionTest extends AbstractTestNGCucumberTests {
}