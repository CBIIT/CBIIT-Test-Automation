package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/CHARMS/features",
        glue = {"CHARMS.steps", "Hooks"},
        tags = "@Progression1",
        dryRun = false
)
public class Run_CHARMS_Progression_Test extends AbstractTestNGCucumberTests {
}