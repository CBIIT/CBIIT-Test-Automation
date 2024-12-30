package CHARMS.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/CHARMS/features",
		glue = "ServiceNow.CHARMS.steps",
		tags = "@TestAccountReset",
		dryRun = false
)
/* @author sohilz2 */
public class RunCHARMSTestAccountResetTest extends AbstractTestNGCucumberTests{
}
