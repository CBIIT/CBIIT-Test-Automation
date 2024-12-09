package GRANTS.runners.EnterpriseMaintenance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/GrantsApps/EM/selenium/features", "src/test/java/GrantsApps/EM/playwright/features"}
        , glue = {"GrantsApps.EM.selenium.steps", "GrantsApps.EM.playwright.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun =false

)
public class RunEMProgressionTest extends AbstractTestNGCucumberTests {
}