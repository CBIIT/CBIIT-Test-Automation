package ServiceNow.ServiceNowRunners.ATORunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/ATO/Features"
		, glue="ServiceNow.ATO.Steps"
		, tags="@Progression"
		, dryRun = false
		, monochrome=true
		, strict = true
		)
public class Run_Ato_Progression_Test {

}