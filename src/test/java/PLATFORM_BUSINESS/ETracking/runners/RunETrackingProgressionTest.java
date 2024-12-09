package PLATFORM_BUSINESS.ETracking.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/etrack-progression-reports/etrack-progression-report.html",
		"json:target/cucumber.json", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/PLATFORM_BUSINESS/ETracking/features",
		glue ={"PLATFORM_BUSINESS.ETracking.steps", "Hooks"},
		tags = "@Progression",
		dryRun = false
)

public class RunETrackingProgressionTest extends AbstractTestNGCucumberTests{
}