package appsCommon.StepsImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class ITrustLoginPageImpl extends PageInitializer {

    /**
     * Logs in to the iTrust application using the provided username and password.
     * The method waits for the visibility of the username field, enters the username,
     * enters the password, and finally clicks the Sign In button.
     */
    public void loginToITrust() {
        CommonUtils.waitForVisibility(iTrustloginPage.userNameField);
        iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
        iTrustloginPage.enterPassword("Password");
        iTrustloginPage.clickSignInButton();
    }
}