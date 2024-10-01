package AnalysisTools.ACT24.ACT24Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/AnalysisTools/ACT24/Features",
        glue = {"AnalysisTools.ACT24.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunACT24ProgressionTest extends AbstractTestNGCucumberTests{
}