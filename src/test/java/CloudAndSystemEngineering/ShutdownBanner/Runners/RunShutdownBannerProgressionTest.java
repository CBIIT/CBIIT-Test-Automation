package CloudAndSystemEngineering.ShutdownBanner.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt","pretty"
        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features="src/test/java/CloudAndSystemEngineering/ShutdownBanner/Features"
        , glue="CloudAndSystemEngineering.ShutdownBanner.Steps"
        , tags="@Progression"
        , dryRun =false
        , monochrome=true
        , strict =true
)

public class RunShutdownBannerProgressionTest {
}
