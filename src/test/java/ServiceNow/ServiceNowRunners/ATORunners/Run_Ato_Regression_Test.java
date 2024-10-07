package ServiceNow.ServiceNowRunners.ATORunners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/serviceNow/ATO/features", glue = {
		"com/serviceNow/ATO" }, tags = "@Regression",
				dryRun = true,
				plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:test-output/cucumber-report.json" })
public class Run_Ato_Regression_Test {
}