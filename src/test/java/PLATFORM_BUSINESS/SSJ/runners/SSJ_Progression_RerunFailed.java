package PLATFORM_BUSINESS.SSJ.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ssj-progression-rerun-failed-reports/ssj-progression-rerun-failed-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"@target/failed.txt"},
        glue = {"ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps", "ServiceNow.PlatformBusinessApps.SSJ.selenium.Steps", "Hooks"})
public class SSJ_Progression_RerunFailed extends AbstractTestNGCucumberTests {
}