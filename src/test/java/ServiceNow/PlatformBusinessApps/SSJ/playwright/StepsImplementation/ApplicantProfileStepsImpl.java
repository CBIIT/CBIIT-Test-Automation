package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Profile_Tab_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;

public class ApplicantProfileStepsImpl {

    public static void ssjLogin(String user) {
        if (user.equals ("OWM Vacancy Manager")) {

        } else if (user.equals("Stadtman Vacancy Manager")) {

        } else {
            Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Maria Chaudhry");
            PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("AppTracker"));
        }
    }

    public static void selects_highest_education(String highestDegree){
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.highestLevelOfEducationDropDown).click();
        PlaywrightUtils.page.getByTitle(highestDegree).locator("div").click();
    }
}
