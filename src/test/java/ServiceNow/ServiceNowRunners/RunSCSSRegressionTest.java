package ServiceNow.ServiceNowRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt","pretty"
        , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features="src/test/java/ServiceNow/SCSS/Features"
        , glue="ServiceNow.SCSS.Steps"
        , tags="@Regression"
        , dryRun =false
        , monochrome=false
        , strict =true
)

public class RunSCSSRegressionTest {
}
