package CustomBusinessApp.EIDP.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/CustomBusinessApp/EIDP/Features"
		, glue="CustomBusinessApp.EIDP.Steps"
<<<<<<< HEAD
		, tags="@InitiatesIDP"
=======
		, tags="@IDPOnHold "
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
		, dryRun = false,
		junit = "--step-notifications"
		
		)
public class CustomBusinessAppInProgressRunner {

}
