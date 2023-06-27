package ServiceNow.CICDBuildRunners;

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
		, features="src/test/java/ServiceNow/CICDBuild/Features"
		, glue="ServiceNow.CICDBuild.Steps"
		, tags="@CICD_Dev_Ops_UpdateSet_Build"
		, dryRun = false
		, monochrome=true
		, strict = true
		
		)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 *  @author sohilz2
 */
public class Run_CICD_DevOps_UpdateSet_Build_Test {

}
