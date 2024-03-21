package ServiceNow.ServiceNowRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, features = "src/test/java/ServiceNow/COVIDDash/Features", glue = "ServiceNow.COVIDDash.Steps", tags = "@progression", dryRun = false
)
/**
 * 
 * @author sohilz2
 */
public class RunCOVIDDashProgressionTest extends AbstractTestNGCucumberTests{
}
