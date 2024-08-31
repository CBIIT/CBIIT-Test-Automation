package GrantsApps.GrantsRunners.GPMATS;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/GPMATS-regression-reports/GPMATS-regression-report.html", "json:target/cucumber.json",
            "junit:target/cucumber.xml", "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            features = "src/test/java/GrantsApps/GPMATS/Features",
            glue = {"GrantsApps.GPMATS.Steps", "Hooks"},
            tags = "@Regression",
            dryRun = true
    )
    public class Run_GPMATS_Regression_Test extends AbstractTestNGCucumberTests{
    }
