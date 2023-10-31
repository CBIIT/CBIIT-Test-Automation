package ServiceNow.ServiceNowRunners.CHARMSRunners.RASStudy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty" }, features = "src/test/java/ServiceNow/CHARMS/Features", glue = "ServiceNow.CHARMS.Steps", tags = "@RAS_Study_Regression", dryRun = false, monochrome = true, strict = true

)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author sohilz2
 */
public class Run_CHARMS_RAS_Study_RegressionTest {
}