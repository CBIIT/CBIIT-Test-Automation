package PLATFORM_BUSINESS.OCI.OCI_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/onboard-progression-reports/onboard-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= "src/test/java/PLATFORM_BUSINESS/OCI/Features",
        glue={"PLATFORM_BUSINESS.OCI.Steps", "Hooks"},
        tags="@Regression",
        dryRun = false
)

public class Run_OCI_Regression_Test extends AbstractTestNGCucumberTests {
}