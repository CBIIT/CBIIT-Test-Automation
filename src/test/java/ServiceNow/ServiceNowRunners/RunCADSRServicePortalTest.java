package ServiceNow.ServiceNowRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report2"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/ServiceNow/CADSR/Features"
		, glue="ServiceNow.CADSR.Steps"
		, tags="@SNOWCADSR-57"
		, dryRun = false
		, monochrome=true
		, strict = true
		)
public class RunCADSRServicePortalTest {

}
