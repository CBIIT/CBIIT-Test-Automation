package ServiceNow.PlatformBusinessApps.GCP.GCP_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/gcp-progression-reports/gcp-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/PlatformBusinessApps/GCP/Features",
        glue = {"ServiceNow.PlatformBusinessApps.GCP.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
/**
 *
 * @author sohilz2
 */
public class RunGCPProgressionTest extends AbstractTestNGCucumberTests{
}