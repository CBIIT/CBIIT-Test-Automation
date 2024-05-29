package ServiceNow.CHARMS.FanconiSurvey.playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "ServiceNow.CHARMS.FanconiSurvey.playwright.Features",
glue = "ServiceNow.CHARMS.FanconiSurvey.playwright.Steps", 
tags = "@Regression", 
dryRun = true
)
public class Run_CHARMS_FanconiSurvey_Regression_Test extends AbstractTestNGCucumberTests{
}
