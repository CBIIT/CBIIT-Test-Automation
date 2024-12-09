package PLATFORM_BUSINESS.OCPL_Training.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/OCPL-Training-Progression-reports/OCPL-Training-Progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/PLATFORM_BUSINESS/OCPL_Training/features"
        , glue = {"PLATFORM_BUSINESS.OCPL_Training.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)

public class Run_OCPL_PW_Progression_Test extends AbstractTestNGCucumberTests {
}