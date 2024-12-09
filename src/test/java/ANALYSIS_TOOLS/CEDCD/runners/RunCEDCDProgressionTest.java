package ANALYSIS_TOOLS.CEDCD.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
		"junit:target/cucumber.xml", "rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/ANALYSIS_TOOLS/CEDCD/features",
		glue = {"ANALYSIS_TOOLS.CEDCD.steps","Hooks"},
		tags = "@Progression",
		dryRun = false
)

public class RunCEDCDProgressionTest extends AbstractTestNGCucumberTests{
}