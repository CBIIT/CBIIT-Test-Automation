package PLATFORM_BUSINESS.GDC.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/gdc-progression-reports/gdc-progression-report.html",
        "json:target/cucumber.json", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/PLATFORM_BUSINESS/GDC/features",
        glue = {"PLATFORM_BUSINESS.GDC.steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
public class RunGDCProgressionTest extends AbstractTestNGCucumberTests{
}