package ServiceNow.ServiceNowRunners.SEERRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/PlatformBusinessApps/SEER/Features",
        glue = "ServiceNow.PlatformBusinessApps.SEER.Steps",
        tags = "@Regression",
        dryRun = false
)
/**
 * 
 * @author juarezds
 */

public class Run_SEER_Regression_Test extends AbstractTestNGCucumberTests{
}
