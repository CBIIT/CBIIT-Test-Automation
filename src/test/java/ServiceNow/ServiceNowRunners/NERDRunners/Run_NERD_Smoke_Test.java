package ServiceNow.ServiceNowRunners.NERDRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/ServiceNow/PlatformBusinessApps/NERD/Features"
		, glue="ServiceNow.PlatformBusinessApps.NERD.Steps"
		, tags="@Smoke"
		, dryRun = false
)
/**
 *  @author sohilz2
 */


public class Run_NERD_Smoke_Test extends AbstractTestNGCucumberTests{
}
