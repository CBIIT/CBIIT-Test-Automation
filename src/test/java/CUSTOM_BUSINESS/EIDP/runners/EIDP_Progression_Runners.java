package CUSTOM_BUSINESS.EIDP.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/EIDP-smoke-reports/EIDP-smoke-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = {"src/test/java/CustomBusiness/EIDP/features"}
        , glue = {"CustomBusiness.EIDP.steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)

public class EIDP_Progression_Runners extends AbstractTestNGCucumberTests {
}
