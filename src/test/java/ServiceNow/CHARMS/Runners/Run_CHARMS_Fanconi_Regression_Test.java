package ServiceNow.CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

<<<<<<< HEAD
@CucumberOptions(plugin = {"html:target/fanconi-regression-reports/fanconi-regression-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
=======
@CucumberOptions(plugin = {"html:target/html-charms-fanconi-regression-reports/fanconi-regression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
>>>>>>> 5e27e6ad4ee5aa401538257e2b16be855827abef
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/CHARMS/Features/FanconiStudy",
        glue = {"ServiceNow.CHARMS.Steps", "Hooks"},
        tags = "@Fanconi_Regression",
        dryRun = false
)
public class Run_CHARMS_Fanconi_Regression_Test extends AbstractTestNGCucumberTests {
}