package CUSTOM_BUSINESS.MRS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/MRS-progression-reports/MRS-progression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/CUSTOM_BUSINESS/MRS/features"
        , glue = {"CUSTOM_BUSINESS.MRS.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = true
)
public class RunMRSProgressionTest extends AbstractTestNGCucumberTests{
}