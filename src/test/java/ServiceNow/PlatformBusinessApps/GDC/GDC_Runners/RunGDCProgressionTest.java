package ServiceNow.PlatformBusinessApps.GDC.GDC_Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"html:target/html-reports/cucumber-default-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml", "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/ServiceNow/PlatformBusinessApps/GDC/Features",
        glue = {"ServiceNow.PlatformBusinessApps.GDC.Steps", "Hooks"},
        tags = "@Progression",
        dryRun = false
)
public class RunGDCProgressionTest extends AbstractTestNGCucumberTests{

}
