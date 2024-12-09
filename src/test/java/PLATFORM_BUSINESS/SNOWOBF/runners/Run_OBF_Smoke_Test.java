package PLATFORM_BUSINESS.SNOWOBF.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/obf-smoke-reports/obf-smoke-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/SNOWOBF/features"
        , glue = {"PLATFORM_BUSINESS.SNOWOBF.steps", "Hooks"}
        , tags = "@Smoke"
        , dryRun = false
)
public class Run_OBF_Smoke_Test extends AbstractTestNGCucumberTests {
}