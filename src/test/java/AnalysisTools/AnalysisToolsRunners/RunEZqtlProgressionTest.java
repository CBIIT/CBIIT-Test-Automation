package AnalysisTools.AnalysisToolsRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty" }, features = "src/test/java/AnalysisTools/ezQTL/Features", glue = "AnalysisTools.ezQTL.Steps", tags = "@Progression", dryRun = false, monochrome = true, strict = true

)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author sohilz2
 */
public class RunEZqtlProgressionTest {

}
