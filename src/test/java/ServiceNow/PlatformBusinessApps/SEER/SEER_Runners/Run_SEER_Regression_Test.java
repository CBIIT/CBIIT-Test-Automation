package ServiceNow.PlatformBusinessApps.SEER.SEER_Runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/PlatformBusinessApps/SEER/Features",
        glue = {"ServiceNow.PlatformBusinessApps.SEER.Steps", "Hooks"},
        tags = "@Regression",
        dryRun = false
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author juarezds
 */
public class Run_SEER_Regression_Test extends AbstractTestNGCucumberTests {
}