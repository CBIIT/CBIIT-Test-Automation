package CustomBusiness.CCR.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class CCRLogInStepsImplementation extends PageInitializer {
    public void ccrLogin() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CCR"));
        CommonUtils.clickOnElement(cCRLandingPage.logInDropdwn);
        CommonUtils.waitForVisibility(cCRLandingPage.internalUsersOption);
        CommonUtils.clickOnElement(cCRLandingPage.internalUsersOption);
        MiscUtils.sleep(2000);
        iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
        iTrustloginPage.enterPassword("nekrashevicha2Password");
        MiscUtils.sleep(2000);
        iTrustloginPage.clickSignInButton();
        MiscUtils.sleep(2000);
    }
}
