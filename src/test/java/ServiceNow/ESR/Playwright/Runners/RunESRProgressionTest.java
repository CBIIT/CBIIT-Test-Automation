package ServiceNow.ESR.Playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
		"json:target/cucumber.json", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features = "src/test/java/ServiceNow/ESR/Playwright/Features"
		, glue = {"ServiceNow.ESR.Playwright.Steps", "Hooks"}
		, tags = "@Progression"
		, dryRun = true
)
public class RunESRProgressionTest extends AbstractTestNGCucumberTests{
}