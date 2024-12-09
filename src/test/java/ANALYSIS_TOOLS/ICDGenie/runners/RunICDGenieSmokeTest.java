package ANALYSIS_TOOLS.ICDGenie.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/ANALYSIS_TOOLS/ICDGenie/playwright/features",
                    "src/test/java/ANALYSIS_TOOLS/ICDGenie/selenium/features"},
        glue = {"ANALYSIS_TOOLS.ICDGenie.playwright.steps",
                "ANALYSIS_TOOLS.ICDGenie.selenium.steps",
                "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

public class RunICDGenieSmokeTest extends AbstractTestNGCucumberTests{
}