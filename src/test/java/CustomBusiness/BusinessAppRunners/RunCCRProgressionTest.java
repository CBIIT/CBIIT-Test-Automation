package CustomBusiness.BusinessAppRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report"
        , "json:target/cucumber.json"
        , "junit:target/cucumber.xml"
        , "rerun:target/failed.txt", "pretty"}
        , features = "src/test/java/CustomBusiness/CCR/Features"
        , glue = {"CustomBusiness.CCR.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class RunCCRProgressionTest extends AbstractTestNGCucumberTests {
}