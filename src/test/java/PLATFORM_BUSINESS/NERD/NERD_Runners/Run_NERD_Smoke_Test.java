package PLATFORM_BUSINESS.NERD.NERD_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/nerd-smoke-reports/nerd-smoke-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/NERD/features"
        , glue = {"PLATFORM_BUSINESS.NERD.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)

public class Run_NERD_Smoke_Test extends AbstractTestNGCucumberTests {
}