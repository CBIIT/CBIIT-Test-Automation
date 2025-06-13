package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/fanconi-regression-reports/metformin-regression-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/CHARMS/features/metforminStudy",
        glue = {"CHARMS.steps", "Hooks"},
        tags = "@Metformin_Regression",
        dryRun = false
)
public class Run_CHARMS_Metformin_Regression_Test extends AbstractTestNGCucumberTests {
}