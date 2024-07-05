package AnalysisTools.CervicalCP.selenium.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;

public class CCPHomeSteps extends PageInitializer {
    @Given("the user is on the CCP home pages")
    public void the_user_is_on_the_ccp_home_pages() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CervicalCP"));
    }
}