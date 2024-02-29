package ServiceNow.ServiceNowRunners.NERDRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
			"junit:target/cucumber.xml", "rerun:target/failed.txt",
			"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			, features="src/test/java/ServiceNow/PlatformBusinessApps/NERD/Features"
			, glue="ServiceNow.PlatformBusinessApps.NERD.Steps"
			, tags="@Regression"
			, dryRun = false
	)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 *  @author sohilz2
 */
	public class Run_NERD_Regression_Test extends AbstractTestNGCucumberTests {
}
