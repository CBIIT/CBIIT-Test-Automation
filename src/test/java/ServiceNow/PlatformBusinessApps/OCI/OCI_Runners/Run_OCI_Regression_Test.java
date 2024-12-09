package ServiceNow.PlatformBusinessApps.OCI.OCI_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/onboard-progression-reports/onboard-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= "src/test/java/ServiceNow/PlatformBusinessApps/OCI/Features",
        glue={"ServiceNow.PlatformBusinessApps.OCI.Steps", "Hooks"},
        tags="@Regression",
        dryRun = false
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 *  @author sohilz2
 */
public class Run_OCI_Regression_Test extends AbstractTestNGCucumberTests {
}