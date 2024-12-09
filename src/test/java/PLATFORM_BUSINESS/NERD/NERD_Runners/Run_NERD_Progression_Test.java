package PLATFORM_BUSINESS.NERD.NERD_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/nerd-progression-reports/nerd-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= {"src/test/java/PLATFORM_BUSINESS/NERD/selenium/Features", "src/test/java/PLATFORM_BUSINESS/NERD/playwright/Features"},
        glue={"PLATFORM_BUSINESS.NERD.selenium.Steps", "PLATFORM_BUSINESS.NERD.playwright.Steps", "Hooks"},
        tags="@Progression",
        dryRun = false
)

public class Run_NERD_Progression_Test extends AbstractTestNGCucumberTests {
}