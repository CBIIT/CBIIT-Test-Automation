package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(plugin = {"html:target/fcas-vendor-portal-smoke-reports/fcas-vendor-portal-smoke-report.html",
            "rerun:target/failed.txt",
            "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
            , features = "src/test/java/CUSTOM_BUSINESS/FCAS_VENDOR_PORTAL/features"
            , glue = {"CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.steps", "Hooks"}
            , tags = "Smoke"
            , dryRun = false
    )

    public class FCAS_VENDOR_PORTAL_Smoke_Runner extends AbstractTestNGCucumberTests {}