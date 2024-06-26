package AnalysisTools.CervicalCP.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;

public class CCPHomeSteps extends PageInitializer {
    @Given("the user is on the CCP home page")
    public void the_user_is_on_the_ccp_home_page() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("CervicalCP"));
    }
}