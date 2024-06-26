package GrantsApps.GrantsRunners.EnterpriseMaintenance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/GrantsApps/EM/selenium/Features", "src/test/java/GrantsApps/EM/playwright/Features"}
        , glue = {"GrantsApps.EM.selenium.Steps", "GrantsApps.EM.playwright.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class RunEMProgressionTest extends AbstractTestNGCucumberTests {
}