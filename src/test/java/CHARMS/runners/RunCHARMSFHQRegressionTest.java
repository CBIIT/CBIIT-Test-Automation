package CHARMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/java/CHARMS/features/FHQ",
glue = {"CHARMS.steps", "Hooks"},
tags = "@FHQ_Regression",
dryRun = false
)
public class RunCHARMSFHQRegressionTest extends AbstractTestNGCucumberTests{
}