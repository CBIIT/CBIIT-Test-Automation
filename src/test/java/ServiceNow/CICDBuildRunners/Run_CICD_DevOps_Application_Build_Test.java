package ServiceNow.CICDBuildRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/CICDBuild/Features"
		, glue="ServiceNow.CICDBuild.Steps"
		, tags="@CICD_Dev_Ops_Application_Build"
		, dryRun = false
)
/* @author sohilz2  */
public class Run_CICD_DevOps_Application_Build_Test extends AbstractTestNGCucumberTests{
}