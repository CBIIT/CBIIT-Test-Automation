package ServiceNow.PlatformBusinessApps.ETracking.ETracking_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/etrack-progression-reports/etrack-progression-report.html",
		"json:target/cucumber.json", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/PlatformBusinessApps/ETracking/Features",
		glue ={ "ServiceNow.PlatformBusinessApps.ETracking.Steps", "Hooks"},
		tags = "@Progression",
		dryRun = false
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 * @author sohilz2
 */
public class RunETrackingProgressionTest extends AbstractTestNGCucumberTests{
}