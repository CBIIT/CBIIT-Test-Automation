package ANALYSIS_TOOLS.FHH.FHHRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"src/test/java/ANALYSIS_TOOLS/FHH/playwright/Features", "src/test/java/ANALYSIS_TOOLS/FHH/selenium/Features"},
        glue = {"ANALYSIS_TOOLS.FHH.playwright.Steps", "ANALYSIS_TOOLS.FHH.selenium.Steps", "Hooks"},
        tags = "@Smoke",
        dryRun = false
)

/*
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunFHHSmokeTest extends AbstractTestNGCucumberTests{
}