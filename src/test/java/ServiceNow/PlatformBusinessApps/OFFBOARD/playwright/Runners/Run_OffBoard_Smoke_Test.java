package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/OFFBOARD/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.OFFBOARD.Steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_OffBoard_Smoke_Test extends AbstractTestNGCucumberTests {
}