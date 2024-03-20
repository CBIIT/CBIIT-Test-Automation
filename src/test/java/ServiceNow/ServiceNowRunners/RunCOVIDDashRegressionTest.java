package ServiceNow.ServiceNowRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty" }, features = "src/test/java/ServiceNow/COVIDDash/Features", glue = "ServiceNow.COVIDDash.Steps", tags = "@test", dryRun = false

)
/**
 * 
 * @author sohilz2
 */
public class RunCOVIDDashRegressionTest extends AbstractTestNGCucumberTests{
}
