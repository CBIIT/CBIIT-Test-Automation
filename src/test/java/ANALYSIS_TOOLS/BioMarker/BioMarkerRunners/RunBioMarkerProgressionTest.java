package ANALYSIS_TOOLS.BioMarker.BioMarkerRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/BioMarker/playwright/Features", "src/test/java/AnalysisTools/BioMarker/selenium/Features"},
        glue = {"AnalysisTools.BioMarker.playwright.Steps", "AnalysisTools.BioMarker.selenium.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)

public class RunBioMarkerProgressionTest extends AbstractTestNGCucumberTests{
}