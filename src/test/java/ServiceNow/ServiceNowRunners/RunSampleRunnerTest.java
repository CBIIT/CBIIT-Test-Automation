package ServiceNow.ServiceNowRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty" }, features = "src/test/java/ServiceNow/SampleTest/Features", glue = "ServiceNow.SampleTest.Steps", tags = "@Sample", 
        dryRun = false
        )
public class RunSampleRunnerTest  extends AbstractTestNGCucumberTests{
}
