package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CHARMS-rasopathy-regression-reports/rasopathy-regression-report-2.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = {"src/test/java/CHARMS/features/RASAccountReset", "src/test/java/CHARMS/features/rasopathyStudy"},
		glue = {"CHARMS.steps", "Hooks"},
		tags = "@RAS_Regression2",
		dryRun = false
)
public class Run_CHARMS_RAS_Regression_Test_2 extends AbstractTestNGCucumberTests{
}