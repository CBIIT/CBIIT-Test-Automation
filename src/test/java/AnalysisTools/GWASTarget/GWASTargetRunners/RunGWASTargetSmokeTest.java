package AnalysisTools.GWASTarget.GWASTargetRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = "src/test/java/AnalysisTools/GWASTarget/Features", glue = {"AnalysisTools.GWASTarget.Steps", "Hooks"}, tags = "@Smoke", dryRun = false
)
/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 *
 * @author sohilz2
 */
public class RunGWASTargetSmokeTest extends AbstractTestNGCucumberTests {
}