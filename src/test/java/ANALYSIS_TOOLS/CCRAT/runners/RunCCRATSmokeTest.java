package ANALYSIS_TOOLS.CCRAT.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ANALYSIS_TOOLS/CCRAT/playwright/features",
        glue = {"ANALYSIS_TOOLS.CCRAT.playwright.steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)
public class RunCCRATSmokeTest extends AbstractTestNGCucumberTests{
}