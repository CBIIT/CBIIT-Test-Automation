package CustomBusiness.BusinessAppRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt"
		, "pretty"
		, "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/CustomBusiness/EIDP/Features"
		, glue="CustomBusiness.EIDP.Steps"
		, tags="@Smoke"
		, dryRun = false
		)		
public class RunAppEIDPSmokeTest extends AbstractTestNGCucumberTests{
}