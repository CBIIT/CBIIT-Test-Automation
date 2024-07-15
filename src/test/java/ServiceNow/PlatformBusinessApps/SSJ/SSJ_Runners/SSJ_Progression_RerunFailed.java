package ServiceNow.PlatformBusinessApps.SSJ.SSJ_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"@target/failed.txt"},
        glue = {"ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps", "ServiceNow.PlatformBusinessApps.SSJ.selenium.Steps", "Hooks"})
public class SSJ_Progression_RerunFailed extends AbstractTestNGCucumberTests {
}