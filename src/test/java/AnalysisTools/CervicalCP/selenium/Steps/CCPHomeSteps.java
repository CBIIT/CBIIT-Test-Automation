package AnalysisTools.CervicalCP.selenium.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import static com.nci.automation.web.TestProperties.getCervicalCPUrl;

public class CCPHomeSteps extends PageInitializer {
    @Given("the user is on the CCP home pages")
    public void the_user_is_on_the_ccp_home_pages() {
        WebDriverUtils.webDriver.get(getCervicalCPUrl());
    }
}