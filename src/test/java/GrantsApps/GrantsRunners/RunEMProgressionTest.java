package GrantsApps.GrantsRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt", "pretty"}
        , features = "src/test/java/GrantsApps/EM/Features"
        , glue = "GrantsApps.EM.Steps"
        , tags = "@Progression"
        , dryRun = false
        , monochrome = false
        , strict = true
)
public class RunEMProgressionTest {
}