package ServiceNow.SEER.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;

public class SEERDataRejectionStepImpl extends PageInitializer {

    public static void proceedsToRegisterForResearchDataWithUniqueEmailAddress() {
        CommonUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        seerLandingPage.researchDataRequestsEmailAddressField.sendKeys("SEER320" + CommonUtils.email);
        seerLandingPage.registerForResearchDataButton.click();
    }

    public static void aSEERODSAdminNavigatesTo(String seerDataAccess) {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys(seerDataAccess);
    }
}
