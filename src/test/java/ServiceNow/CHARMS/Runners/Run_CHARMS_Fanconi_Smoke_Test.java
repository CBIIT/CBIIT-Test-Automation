package ServiceNow.CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/fanconi-smoke-reports/fanconi-smoke-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/java/ServiceNow/CHARMS/Features/FanconiStudy",
glue = {"ServiceNow.CHARMS.Steps", "Hooks"},
tags = "@Smoke",
dryRun = false
)
public class Run_CHARMS_Fanconi_Smoke_Test extends AbstractTestNGCucumberTests{
}