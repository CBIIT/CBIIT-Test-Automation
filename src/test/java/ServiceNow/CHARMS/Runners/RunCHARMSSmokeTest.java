package ServiceNow.CHARMS.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
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