package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/fanconi-regression-reports/fanconi-regression-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/CHARMS/features/fanconiStudy",
        glue = {"CHARMS.steps", "Hooks"},
        tags = "@Fanconi_Regression",
        dryRun = false
)
public class Run_CHARMS_Fanconi_Regression_Test extends AbstractTestNGCucumberTests {
}