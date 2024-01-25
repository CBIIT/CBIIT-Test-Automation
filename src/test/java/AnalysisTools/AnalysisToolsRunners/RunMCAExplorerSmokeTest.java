package AnalysisTools.AnalysisToolsRunners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt", "pretty" }, features = {
				"src/test/java/AnalysisTools/PLCO/Features" }, glue = "AnalysisTools.PLCO.Steps", tags = "@Smoke", dryRun = false, monochrome = true, strict = true

)

public class RunMCAExplorerSmokeTest {

}
