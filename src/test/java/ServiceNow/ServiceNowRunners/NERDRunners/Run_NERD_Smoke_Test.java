package ServiceNow.ServiceNowRunners.NERDRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/ServiceNow/NERD/Features"
		, glue="ServiceNow.NERD.Steps"
		, tags="@Smoke"
		, dryRun = false
		, monochrome=true
		, strict = true
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 *  @author sohilz2
 */


public class Run_NERD_Smoke_Test {
}
