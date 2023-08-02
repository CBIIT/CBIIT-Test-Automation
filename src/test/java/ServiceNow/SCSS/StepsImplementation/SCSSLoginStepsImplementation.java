package ServiceNow.SCSS.StepsImplementation;

import ServiceNow.SCSS.Constants.SCSS_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class SCSSLoginStepsImplementation extends PageInitializer {

    public void sCSSLogin(String user) {
        if (user.equals ("OWM Vacancy Manager")) {
            nativeViewLoginImpl.sideDoorAccountLogin();
            MiscUtils.sleep(5000);
            nativeViewDashPage.clickUserDropDown();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateUserLink();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateSearchDD();
            MiscUtils.sleep(3000);
            nativeViewDashPage.enterTextImpersntSearchBox(SCSS_Constants.OWM_VACANCY_MANAGER);
            MiscUtils.sleep(5000);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
        } else if (user.equals("Stadtman Vacancy Manager")) {
            nativeViewLoginImpl.sideDoorAccountLogin();
            MiscUtils.sleep(5000);
            nativeViewDashPage.clickUserDropDown();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateUserLink();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateSearchDD();
            MiscUtils.sleep(3000);
            nativeViewDashPage.enterTextImpersntSearchBox(SCSS_Constants.OWM_VACANCY_MANAGER);
            MiscUtils.sleep(5000);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
        } else {
            nativeViewLoginImpl.sideDoorAccountLogin();
            MiscUtils.sleep(5000);
            nativeViewDashPage.clickUserDropDown();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateUserLink();
            MiscUtils.sleep(2000);
            nativeViewDashPage.clickImpersonateSearchDD();
            MiscUtils.sleep(3000);
            nativeViewDashPage.enterTextImpersntSearchBox(SCSS_Constants.OKTA_APPLICANT);
            MiscUtils.sleep(5000);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
        }
    }
}