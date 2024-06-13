package ServiceNow.CHARMS.FanconiSurvey.playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/CHARMS/playwright/Features",
		glue = "ServiceNow.CHARMS.playwright.Steps",
		tags = "@Regression",
		dryRun = true
)
public class Run_CHARMS_FanconiSurvey_Regression_Test extends AbstractTestNGCucumberTests{
}
