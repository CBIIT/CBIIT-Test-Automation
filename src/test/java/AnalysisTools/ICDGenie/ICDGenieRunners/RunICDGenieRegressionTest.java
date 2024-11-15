package AnalysisTools.ICDGenie.ICDGenieRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/ICDGenie-regression-reports/ICDGenie-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/ICDGenie/playwright/Features", "src/test/java/AnalysisTools/ICDGenie/selenium/Features"},
        glue = {"AnalysisTools.ICDGenie.playwright.Steps", "AnalysisTools.ICDGenie.selenium.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

public class RunICDGenieRegressionTest extends AbstractTestNGCucumberTests{
}