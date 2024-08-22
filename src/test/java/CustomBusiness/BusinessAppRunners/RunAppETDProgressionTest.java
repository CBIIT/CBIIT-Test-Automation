package CustomBusiness.BusinessAppRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

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
		)

public class RunAppETDProgressionTest extends AbstractTestNGCucumberTests{
}