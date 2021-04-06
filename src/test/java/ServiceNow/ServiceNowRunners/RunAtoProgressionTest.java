package ServiceNow.ServiceNowRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/ATO/Features"
		, glue="ServiceNow.ATO.Steps"
		, tags="@AuditAndAccountability"
		, dryRun = false
		, monochrome=true
		, strict = true
		
		)
public class RunAtoProgressionTest {

}
