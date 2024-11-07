package AnalysisTools.CervicalCP.CervicalCPRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CCP-reports/CCP-Regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/CervicalCP/playwright/Features", "src/test/java/AnalysisTools/CervicalCP/selenium/Features"},
        glue = {"AnalysisTools.CervicalCP.playwright.Steps", "AnalysisTools.CervicalCP.selenium.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class RunCervicalCPRegressionTest extends AbstractTestNGCucumberTests{
}