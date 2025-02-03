package ANALYSIS_TOOLS.BioMarker.BioMarkerRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/ANALYSIS_TOOLS/BioMarker/playwright/Features", "src/test/java/ANALYSIS_TOOLS/BioMarker/selenium/Features"},
        glue = {"ANALYSIS_TOOLS.BioMarker.playwright.Steps", "ANALYSIS_TOOLS.BioMarker.selenium.Steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

public class RunBioMarkerSmokeTest extends AbstractTestNGCucumberTests{
}