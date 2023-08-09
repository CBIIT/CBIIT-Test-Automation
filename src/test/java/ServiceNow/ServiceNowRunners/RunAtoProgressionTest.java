package ServiceNow.ServiceNowRunners;

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
		, tags="@allato"
		, dryRun = false
		, monochrome=true
		, strict = true
		)
public class RunAtoProgressionTest {

}
