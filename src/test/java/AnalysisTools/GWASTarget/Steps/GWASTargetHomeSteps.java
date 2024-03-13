package AnalysisTools.GWASTarget.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.*;
import io.cucumber.java.en.*;

public class GWASTargetHomeSteps extends PageInitializer {

    @When("the user is on the GWAS Target home page")
    public void the_user_is_on_the_gwas_target_home_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("GWASExplorer"));
    }
    @Then("the home page {string}, {string} and {string} text is displayed")
    public void the_home_page_and_text_is_displayed(String string, String string2, String string3) {
    }

}
