package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/CHARMS-rasopathy-regression-reports/rasopathy-regression-report.html", "json:target/CHARMS-RAS-Regression-Test-Results.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = {"src/test/java/CHARMS/features/RASAccountReset", "src/test/java/CHARMS/features/rasopathyStudy"},
		glue = {"CHARMS.steps", "Hooks"},
		tags = "@Testing",
		dryRun = false
)
public class Run_CHARMS_RAS_Regression_Test extends AbstractTestNGCucumberTests{
}