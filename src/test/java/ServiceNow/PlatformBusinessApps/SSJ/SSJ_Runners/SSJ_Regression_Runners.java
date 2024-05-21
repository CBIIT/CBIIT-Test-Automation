package ServiceNow.PlatformBusinessApps.SSJ.SSJ_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/ServiceNow/PlatformBusinessApps/SSJ/playwright/Features", "src/test/java/ServiceNow/PlatformBusinessApps/SSJ/selenium/Features"}
        , glue = {"ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps","ServiceNow.PlatformBusinessApps.SSJ.selenium.Steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class SSJ_Regression_Runners extends AbstractTestNGCucumberTests {
}
