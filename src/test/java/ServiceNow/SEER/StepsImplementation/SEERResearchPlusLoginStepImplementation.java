package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.SEERDataAccessRequest_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class SEERResearchPlusLoginStepImplementation extends PageInitializer {

    public static void theUserClicksTheSeerResearchPlusButton() {
        CommonUtils.waitForClickability(seerLandingPage.seerResearchPlusLoginButton);
        CommonUtils.clickOnElement(seerLandingPage.seerResearchPlusLoginButton);
    }

    public static void theUserWillBeBroughtToTheSignInPage() {
        CommonUtils.waitForVisibility(seerLandingPage.seerResearchPlusSignInNIHLoginTitle);
        CommonUtils.assertEqualsWithMessage(SEERDataAccessRequest_Constants.SEER_RESEARCH_PLUS_LOGIN_SIGN_IN_NIH_LOGIN_PAGE_TITLE, seerLandingPage.seerResearchPlusSignInNIHLoginTitle.getText(), "Verifying the User is on Sign In page");
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerResearchPlusSignInNIHLoginTitle);
        MiscUtils.sleep(5000);
    }
}
