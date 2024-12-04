package PLATFORM_BUSINESS.SEER.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/seer-smoke-reports/seer-smoke-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features = "src/test/java/PLATFORM_BUSINESS/SEER/features"
		, glue = {"PLATFORM_BUSINESS.SEER.steps", "Hooks"}
		, tags = "@Smoke"
		, dryRun = false
)

public class Run_SEER_Smoke_Test extends AbstractTestNGCucumberTests {
}
