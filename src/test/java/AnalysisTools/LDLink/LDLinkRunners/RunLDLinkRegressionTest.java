package AnalysisTools.LDLink.LDLinkRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/html-reports/cucumber-default-report"
		, "json:target/cucumber.json"
		, "junit:target/cucumber.xml"
		, "rerun:target/failed.txt","pretty"}
		, features="src/test/java/AnalysisTools/LDLink/Features"
		, glue = {"AnalysisTools.LDLink.Steps", "Hooks"}
		, tags="@Regression"
		, dryRun = false
		)
/* @author sohilz2 */
public class RunLDLinkRegressionTest extends AbstractTestNGCucumberTests {
}