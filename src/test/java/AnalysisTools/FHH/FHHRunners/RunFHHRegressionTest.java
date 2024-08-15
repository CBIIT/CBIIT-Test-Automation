package AnalysisTools.FHH.FHHRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/AnalysisTools/FHH/playwright/Features", "src/test/java/AnalysisTools/FHH/selenium/Features"},
        glue = {"AnalysisTools.FHH.playwright.Steps", "AnalysisTools.FHH.selenium.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

/*
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunFHHRegressionTest extends AbstractTestNGCucumberTests{
}