package GRANTS.runners.GPMATS;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/GPMATS-progression-reports/GPMATS-progression-report.html", "json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/GrantsApps/GPMATS/features",
        glue = {"GrantsApps.GPMATS.steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
public class Run_GPMATS_Progression_Test extends AbstractTestNGCucumberTests {
}