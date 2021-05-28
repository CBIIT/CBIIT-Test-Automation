package ServiceNow.ServiceNowRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/serviceNow/ATO/features", glue = {
		"com/serviceNow/ATO" }, tags = "@Regression",
//				dryRun = true, 
				plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:test-output/cucumber-report.json" })
public class RunAtoRegressionTest {

}
