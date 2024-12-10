package PLATFORM_BUSINESS.SNOWOBF.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OBF-Regression-reports/OBF-Regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/SNOWOBF/features"
        , glue = {"PLATFORM_BUSINESS.SNOWOBF.steps", "Hooks"}
        , tags = "@Regression"
        , dryRun = false
)

public class Run_OBF_PW_Regression_Test extends AbstractTestNGCucumberTests {
}