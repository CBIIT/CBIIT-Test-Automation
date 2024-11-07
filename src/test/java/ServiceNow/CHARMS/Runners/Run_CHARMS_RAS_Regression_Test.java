package ServiceNow.CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-charms-rasopathy-regression-reports/rasopathy-regression-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = {"src/test/java/ServiceNow/CHARMS/Features/RASAccountReset", "src/test/java/ServiceNow/CHARMS/Features/RasopathyStudy"},
		glue = {"ServiceNow.CHARMS.Steps", "Hooks"},
		tags = "@RAS_Regression",
		dryRun = false
)
/**
 * 
 * @author sohilz2
 */
public class Run_CHARMS_RAS_Regression_Test extends AbstractTestNGCucumberTests{
}