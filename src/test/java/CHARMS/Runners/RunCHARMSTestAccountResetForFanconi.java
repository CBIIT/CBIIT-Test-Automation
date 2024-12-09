package CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ServiceNow/CHARMS/Features",
		glue = {"ServiceNow.CHARMS.Steps", "Hooks"},
		tags = "@FanconiTestAccountReset",
		dryRun = false
)
/**
 * 
 * @author sohilz2
 */
public class RunCHARMSTestAccountResetForFanconi extends AbstractTestNGCucumberTests{

}
