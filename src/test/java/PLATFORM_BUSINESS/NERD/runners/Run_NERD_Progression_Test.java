package PLATFORM_BUSINESS.NERD.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin= {"html:target/nerd-progression-reports/nerd-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features= {"src/test/java/PLATFORM_BUSINESS/NERD/selenium/features", "src/test/java/PLATFORM_BUSINESS/NERD/playwright/features"},
        glue={"PLATFORM_BUSINESS.NERD.selenium.steps", "PLATFORM_BUSINESS.NERD.playwright.steps", "Hooks"},
        tags="@Progression",
        dryRun = false
)

/**
 * This class is annotated with @RunWith(Cucumber.class) and it will run cucumber feature(s).
 *  @author sohilz2
 */
public class Run_NERD_Progression_Test extends AbstractTestNGCucumberTests {
}