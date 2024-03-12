package ServiceNow.PlatformBusinessApps.SCSS.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SCSS.Constants.SCSS_Constants;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class SCSSLoginStepsImplementation extends PageInitializer {

    public void sCSSLogin(String user) {
        if (user.equals ("OWM Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SCSS_Constants.OWM_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
            CucumberLogUtils.logScreenshot();
        } else if (user.equals("Stadtman Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SCSS_Constants.STADTMAN_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
            CucumberLogUtils.logScreenshot();
        } else {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SCSS_Constants.OKTA_APPLICANT);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SCSSPortalView"));
            CucumberLogUtils.logScreenshot();
        }
    }
}