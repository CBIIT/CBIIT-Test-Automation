package AnalysisTools.AnalysisToolsRunners;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.web.ConfUtils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features=""
		, glue=""
		, tags=""
		, dryRun = false
		, monochrome=true
		, strict = true
		
		)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run
 * cucumber feature(s).
 * 
 * @author sohilz2
 */
public class RunCEDCDRegressionTest {

	@BeforeClass
	public static void runSetup() {

		String reportsOutput = LocalConfUtils.getRootDir() + File.separator + "html-reports";
		ConfUtils.setBaseResultsDir(reportsOutput);
		System.out.println("Starting Test Execution...");
	}

}
