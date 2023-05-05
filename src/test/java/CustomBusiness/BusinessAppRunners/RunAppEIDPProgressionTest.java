package CustomBusiness.BusinessAppRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/CustomBusiness/EIDP/Features"
		, glue="CustomBusiness.EIDP.Steps"
    	, tags=" @NCI "
        , dryRun =true,
		junit = "--step-notifications"
		
		)
public class RunAppEIDPProgressionTest {
}