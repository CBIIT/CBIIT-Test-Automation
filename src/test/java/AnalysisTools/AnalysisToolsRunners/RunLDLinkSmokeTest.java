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
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty" }, features = "src/test/java/AnalysisTools/LDLink/Features", glue = "AnalysisTools.LDLink.Steps", tags = "@Smoke", dryRun = false, monochrome = true, strict = true

)

public class RunLDLinkSmokeTest {

	@BeforeClass
	public static void runSetup() {

		String reportsOutput = LocalConfUtils.getRootDir() + File.separator + "html-reports";
		ConfUtils.setBaseResultsDir(reportsOutput);
		System.out.println("Starting Test Execution...");
	}

}
