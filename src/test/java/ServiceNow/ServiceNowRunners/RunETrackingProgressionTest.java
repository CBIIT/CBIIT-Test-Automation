package ServiceNow.ServiceNowRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/etrack-progression-reports/etrack-progression-report.html",
		"json:target/cucumber.json", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/PlatformBusinessApps/ETracking/Features",
		glue = "ServiceNow.PlatformBusinessApps.ETracking.Steps",
		tags = "@Progression",
		dryRun = false
)
/**
 * 
 * @author sohilz2
 */
public class RunETrackingProgressionTest extends AbstractTestNGCucumberTests{
}
