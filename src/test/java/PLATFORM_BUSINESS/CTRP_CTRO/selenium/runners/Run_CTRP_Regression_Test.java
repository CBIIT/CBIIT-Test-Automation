package PLATFORM_BUSINESS.CTRP_CTRO.selenium.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/ctrp-regression-reports/ctrp-regression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/PLATFORM_BUSINESS/CTRP_CTRO/selenium/features",
        glue = {"PLATFORM_BUSINESS.CTRP_CTRO.selenium.steps", "Hooks" },
        tags="@Regression",
        dryRun = false
)

/**
* This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
*  @author sohilz2
*/
public class Run_CTRP_Regression_Test extends AbstractTestNGCucumberTests {
}