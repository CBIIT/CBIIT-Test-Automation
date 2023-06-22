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
		, features="src/test/java/ServiceNow/AppTracker/Features"
	    , glue="ServiceNow.AppTracker.Steps"		
		, tags="@Ticket88"
    	, dryRun =false
		, monochrome=false
		, strict =true
		)

public class RunAppTrackerProgressionTest {

}
