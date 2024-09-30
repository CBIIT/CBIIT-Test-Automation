package AnalysisTools.JPSurv.JPSurvRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		, features="src/test/java/AnalysisTools/JPSurv/Features"
		, glue={"AnalysisTools.JPSurv.Steps", "Hooks"}
		, tags="@Progression"
		, dryRun = false
		)
public class RunJPSurvProgressionTest extends AbstractTestNGCucumberTests{
}