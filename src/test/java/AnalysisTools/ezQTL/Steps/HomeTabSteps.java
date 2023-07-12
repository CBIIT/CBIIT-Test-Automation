package AnalysisTools.ezQTL.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class HomeTabSteps extends PageInitializer {

    @Given("The user is on the ezQTL Analyses page")
    public void the_user_is_on_the_ezQTL_Analyses_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ezQTL"));
        CommonUtils.click(ezQTLHomePage.analysesTabButton);
        MiscUtils.sleep(2000);
    }

}
