package ServiceNow.PlatformBusinessApps.SSJ.selenium.StepsImplementation;

import ServiceNow.SSJ.Constants.SSJ_Constants;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class SSJLoginStepsImplementation extends PageInitializer {

    public void sSJLogin(String user) {
        if (user.equals ("OWM Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.OWM_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SSJPortalView"));
            CucumberLogUtils.logScreenshot();
        } else if (user.equals("Stadtman Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.STADTMAN_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SSJPortalView"));
            CucumberLogUtils.logScreenshot();
        } else {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.OKTA_APPLICANT);
            WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SSJPortalView"));
            CucumberLogUtils.logScreenshot();
        }
    }
}