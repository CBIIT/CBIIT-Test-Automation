package CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/java/CHARMS/Features/FHQ",
glue = {"CHARMS.Steps", "Hooks"},
tags = "@FHQ_Regression1",
dryRun = false
)
public class RunCHARMSFHQRegressionTest extends AbstractTestNGCucumberTests{
}