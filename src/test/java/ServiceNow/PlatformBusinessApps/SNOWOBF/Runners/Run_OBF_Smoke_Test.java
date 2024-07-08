package ServiceNow.PlatformBusinessApps.SNOWOBF.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/obf-smoke-reports/obf-smoke-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/SNOWOBF/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.SNOWOBF.Steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_OBF_Smoke_Test extends AbstractTestNGCucumberTests {
}