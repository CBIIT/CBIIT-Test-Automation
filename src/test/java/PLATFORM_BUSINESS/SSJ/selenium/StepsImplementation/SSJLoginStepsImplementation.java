package PLATFORM_BUSINESS.SSJ.selenium.StepsImplementation;

import PLATFORM_BUSINESS.SSJ.selenium.Constants.SSJ_Constants;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.WebDriverUtils;

import static com.nci.automation.web.TestProperties.getSSJUrl;

public class SSJLoginStepsImplementation extends PageInitializer {

    public void sSJLogin(String user) {
        if (user.equals ("OWM Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.OWM_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(getSSJUrl());
            CucumberLogUtils.logScreenshot();
        } else if (user.equals("Stadtman Vacancy Manager")) {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.STADTMAN_VACANCY_MANAGER);
            WebDriverUtils.webDriver.get(getSSJUrl());
            CucumberLogUtils.logScreenshot();
        } else {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
            ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View(SSJ_Constants.OKTA_APPLICANT);
            WebDriverUtils.webDriver.get(getSSJUrl());
            CucumberLogUtils.logScreenshot();
        }
    }
}