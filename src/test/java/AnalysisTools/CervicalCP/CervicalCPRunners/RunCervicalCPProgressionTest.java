package AnalysisTools.CervicalCP.CervicalCPRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/CervicalCP/playwright/Features", "src/test/java/AnalysisTools/CervicalCP/selenium/Features"},
        glue = {"AnalysisTools.CervicalCP.playwright.Steps", "AnalysisTools.CervicalCP.selenium.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = true
)

/*
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunCervicalCPProgressionTest extends AbstractTestNGCucumberTests{
}