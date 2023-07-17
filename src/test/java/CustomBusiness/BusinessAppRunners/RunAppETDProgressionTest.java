package CustomBusiness.BusinessAppRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt"
		, "pretty"
		, "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/CustomBusiness/ETD/Features"
		, glue="CustomBusiness.ETD.Steps"
		, tags = "@Progression"
		, dryRun = false
		, monochrome = true
		, strict = true		
		)
	
public class RunAppETDProgressionTest { 

}