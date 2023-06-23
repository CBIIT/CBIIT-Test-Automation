package ServiceNow.ServiceNowRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/ITPG/Features"
		, glue="ServiceNow.ITPG.Steps"
		, tags="@ITPG"
		, dryRun = false
		, monochrome=true
		, strict = true
//		, junit = "--step-notifications"
		)
public class RunITPGProgressionTest {

}
