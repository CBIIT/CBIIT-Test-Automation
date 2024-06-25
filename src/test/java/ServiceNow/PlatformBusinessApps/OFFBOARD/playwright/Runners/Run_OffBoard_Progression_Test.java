<<<<<<<< HEAD:src/test/java/ServiceNow/PlatformBusinessApps/OFFBOARD/Playwright_Runners/Run_OffBoard_PW_Progression_Test.java
package ServiceNow.PlatformBusinessApps.OFFBOARD.Playwright_Runners;
========
package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Runners;
>>>>>>>> c76d275a8b41e73ad29ebf2bc3a456d1aefd1846:src/test/java/ServiceNow/PlatformBusinessApps/OFFBOARD/playwright/Runners/Run_OffBoard_Progression_Test.java

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , features = "src/test/java/ServiceNow/PlatformBusinessApps/OFFBOARD/Features"
        , glue = {"ServiceNow.PlatformBusinessApps.OFFBOARD.Steps", "Hooks"}
        , tags = "@Progression"
        , dryRun = false
)
public class Run_OffBoard_Progression_Test extends AbstractTestNGCucumberTests {
}