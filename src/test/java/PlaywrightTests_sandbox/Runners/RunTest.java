package PlaywrightTests_sandbox.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PlaywrightTests/features"
        , glue = "PlaywrightTests.steps"
        , tags = "@Progression"
        , dryRun = true
)
public class RunTest extends AbstractTestNGCucumberTests {
}