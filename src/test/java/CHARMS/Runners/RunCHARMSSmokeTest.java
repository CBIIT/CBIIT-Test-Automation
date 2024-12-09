package CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty" },
		features = "src/test/java/ServiceNow/CHARMS/Features",
		glue = {"ServiceNow.CHARMS.Steps", "Hooks"},
		tags = "@Smoke",
		dryRun = false

)
/**
 * 
 * @author sohilz2
 */
public class RunCHARMSSmokeTest extends AbstractTestNGCucumberTests{
}
