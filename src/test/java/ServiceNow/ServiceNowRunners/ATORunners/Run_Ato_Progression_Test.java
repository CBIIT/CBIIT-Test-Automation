package ServiceNow.ServiceNowRunners.ATORunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/ATO/Features"
		, glue="ServiceNow.ATO.Steps"
		, tags="@Progression"
		, dryRun = false
		)
public class Run_Ato_Progression_Test extends AbstractTestNGCucumberTests{

}
