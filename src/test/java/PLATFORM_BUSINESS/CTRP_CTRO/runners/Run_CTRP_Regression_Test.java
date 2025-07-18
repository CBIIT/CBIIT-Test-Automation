package PLATFORM_BUSINESS.CTRP_CTRO.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/ctrp-regression-reports/ctrp-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/PLATFORM_BUSINESS/CTRP_CTRO/selenium/features", "src/test/java/PLATFORM_BUSINESS/CTRP_CTRO/playwright/features"},
        glue = {"PLATFORM_BUSINESS.CTRP_CTRO.selenium.steps", "PLATFORM_BUSINESS.CTRP_CTRO.playwright.steps", "Hooks" },
        tags="@Regression",
        dryRun = false
)

public class Run_CTRP_Regression_Test extends AbstractTestNGCucumberTests {
}