package ANALYSIS_TOOLS.CervicalCP.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CCP-reports/CCP-Regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/ANALYSIS_TOOLS/CervicalCP/playwright/features", "src/test/java/AnalysisTools/CervicalCP/selenium/features"},
        glue = {"ANALYSIS_TOOLS.CervicalCP.playwright.steps", "AnalysisTools.CervicalCP.selenium.steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class RunCervicalCPRegressionTest extends AbstractTestNGCucumberTests{
}