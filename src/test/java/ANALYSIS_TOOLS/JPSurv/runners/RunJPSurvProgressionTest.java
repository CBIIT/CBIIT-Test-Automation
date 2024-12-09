package ANALYSIS_TOOLS.JPSurv.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/ANALYSIS_TOOLS/JPSurv/features"
		, glue={"ANALYSIS_TOOLS.JPSurv.steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false
		)
public class RunJPSurvProgressionTest extends AbstractTestNGCucumberTests{
}