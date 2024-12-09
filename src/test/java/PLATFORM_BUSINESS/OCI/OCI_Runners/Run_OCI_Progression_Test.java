package PLATFORM_BUSINESS.OCI.OCI_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/onboard-progression-reports/onboard-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= "src/test/java/ServiceNow/PlatformBusinessApps/OCI/Features",
        glue={"ServiceNow.PlatformBusinessApps.OCI.Steps", "Hooks"},
        tags="@Progression",
        dryRun = false
)

public class Run_OCI_Progression_Test extends AbstractTestNGCucumberTests {
}