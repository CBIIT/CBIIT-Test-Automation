package CustomBusiness.CCR.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;

public class LandingPageSteps extends PageInitializer {
    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) throws TestingException {
        switch(user){
        case "internal user":
            cCRLogInStepsImplementation.ccrLogin();
            break;
        }
    }
    @Given("User can navigate to {string} Hyperlink")
    public void user_can_navigate_to_hyperlink(String string) {
        CommonUtils.waitForVisibility(cCRLandingPage.ccrCareersHyperlink);
        CommonUtils.clickOnElement(cCRLandingPage.ccrCareersHyperlink);
    }

}
