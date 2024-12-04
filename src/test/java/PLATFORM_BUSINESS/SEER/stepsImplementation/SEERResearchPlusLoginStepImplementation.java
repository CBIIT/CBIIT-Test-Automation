package PLATFORM_BUSINESS.SEER.stepsImplementation;

import ServiceNow.PLATFORM_BUSINESS.SEER.Constants.SEERDataAccessRequest_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class SEERResearchPlusLoginStepImplementation extends PageInitializer {

    /**
     * User Clicks the Seer Research Plus button on the landing page.
     */
    public static void theUserClicksTheSeerResearchPlusButton() {
        CommonUtils.waitForClickability(seerLandingPage.seerResearchPlusLoginButton);
        CommonUtils.clickOnElement(seerLandingPage.seerResearchPlusLoginButton);
    }

    /**
     * The Research plus user lands on sign in page
     */
    public static void theUserWillBeBroughtToTheSignInPage() {
        CommonUtils.waitForVisibility(seerLandingPage.seerResearchPlusSignInNIHLoginTitle);
        CommonUtils.assertEqualsWithMessage(SEERDataAccessRequest_Constants.SEER_RESEARCH_PLUS_LOGIN_SIGN_IN_NIH_LOGIN_PAGE_TITLE, seerLandingPage.seerResearchPlusSignInNIHLoginTitle.getText(), "Verifying the User is on Sign In page");
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerResearchPlusSignInNIHLoginTitle);
    }
}