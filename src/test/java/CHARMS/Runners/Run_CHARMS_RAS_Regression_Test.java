package CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CHARMS-rasopathy-regression-reports/rasopathy-regression-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = {"src/test/java/CHARMS/Features/RASAccountReset", "src/test/java/CHARMS/Features/RasopathyStudy"},
		glue = {"CHARMS.Steps", "Hooks"},
		tags = "@RAS_Regression",
		dryRun = false
)
public class Run_CHARMS_RAS_Regression_Test extends AbstractTestNGCucumberTests{
}