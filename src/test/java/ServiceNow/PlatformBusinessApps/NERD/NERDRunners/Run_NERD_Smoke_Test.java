package ServiceNow.PlatformBusinessApps.NERD.NERDRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/nerd-smoke-reports/nerd-Smoke-report.html",
		"json:target/cucumber.json", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/ServiceNow/PlatformBusinessApps/NERD/selenium/Features"
		, glue={"ServiceNow.PlatformBusinessApps.NERD.selenium.Steps", "Hooks"}
		, tags="@Smoke"
		, dryRun = false
)
/**
 *  @author sohilz2
 */
public class Run_NERD_Smoke_Test extends AbstractTestNGCucumberTests{
}