package AnalysisTools.AnalysisToolsRunners;

import java.io.File;
import org.testng.annotations.BeforeClass;
import com.nci.automation.utils.LocalConfUtils;
import com.nci.automation.web.ConfUtils;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/AnalysisTools/JPSurv/Features"
		, glue="AnalysisTools.JPSurv.Steps"
		, tags="@Progression"
		, dryRun = false
		)
public class RunJPSurvProgressionTest extends AbstractTestNGCucumberTests{
	@BeforeClass
	public static void runSetup() {
		String reportsOutput = LocalConfUtils.getRootDir() + File.separator + "html-reports";
		ConfUtils.setBaseResultsDir(reportsOutput);
		System.out.println("Starting Test Execution...");
	}
}