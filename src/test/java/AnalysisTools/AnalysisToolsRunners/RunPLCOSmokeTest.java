package AnalysisTools.AnalysisToolsRunners;

import java.io.File;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.web.ConfUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt", "pretty" }, features = {
				"src/test/java/AnalysisTools/PLCO/Features" }, glue = "AnalysisTools.PLCO.Steps", tags = "@Smoke", dryRun = false, monochrome = true, strict = true

)

public class RunPLCOSmokeTest {

}
