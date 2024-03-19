package ServiceNow.ServiceNowRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/java/ServiceNow/CHARMS/Features/FHQ",
glue = "ServiceNow.CHARMS.Steps", 
tags = "@Regression", 
dryRun = false
)
public class RunCHARMSFHQRegressionTest extends AbstractTestNGCucumberTests{
}