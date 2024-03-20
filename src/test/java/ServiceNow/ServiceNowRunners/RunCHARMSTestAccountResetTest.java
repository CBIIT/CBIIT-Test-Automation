package ServiceNow.ServiceNowRunners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/CHARMS/Features",
		glue = "ServiceNow.CHARMS.Steps",
		tags = "@TestAccountReset",
		dryRun = false
)
/* @author sohilz2 */
public class RunCHARMSTestAccountResetTest extends AbstractTestNGCucumberTests{
}
