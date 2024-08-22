package AnalysisTools.HPVisuals.HPVisualsRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/HPVisuals/playwright/Features", "src/test/java/AnalysisTools/HPVisuals/selenium/Features"},
        glue = {"AnalysisTools.HPVisuals.playwright.Steps", "AnalysisTools.HPVisuals.selenium.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = true
)

/*
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunHPVisualsProgressionTest extends AbstractTestNGCucumberTests{
}