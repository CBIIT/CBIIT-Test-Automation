package ServiceNow.ServiceNowRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty" }, features = "src/test/java/ServiceNow/SampleTest/Features", glue = "ServiceNow.SampleTest.Steps", tags = "@Sample", dryRun = false, monochrome = false, strict = true)

public class RunSampleRunnerTest {
}
