package PLATFORM_BUSINESS.ApplicationAccessAndApproval.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import PLATFORM_BUSINESS.ApplicationAccessAndApproval.constants.AAAConstants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.getAAAUrl;

public class AAAStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter to AAA Portal.
     */
    public static void UserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((AAAConstants.SUBMITTER));
        WebDriverUtils.webDriver.get(getAAAUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     *Navigate tor to AAA form.
     */
    public static void navigateToAAAViaPortalView() {
        CommonUtils.waitForClickability(aaaPage.servicesDropdownPortalView);
        CommonUtils.clickOnElement(aaaPage.servicesDropdownPortalView);
        CommonUtils.waitForClickability(aaaPage.enterpriseITServicesPortalView);
        CommonUtils.clickOnElement(aaaPage.enterpriseITServicesPortalView);
        CommonUtils.waitForClickability(aaaPage.accountAdminAIMPortalView);
        CommonUtils.clickOnElement(aaaPage.accountAdminAIMPortalView);
        CommonUtils.waitForClickability(aaaPage.accountAdministrationAIMPortalView);
        CommonUtils.clickOnElement(aaaPage.accountAdministrationAIMPortalView);
        CommonUtils.waitForClickability(aaaPage.addRemovePermissionsPortalView;
        CommonUtils.clickOnElement(aaaPage.addRemovePermissionsPortalView);
    }

    /**
     *Verify Page title
     */
    public static void verifyAAAPageTitle() {
        softAssert.assertTrue(aaaPage.aaaPageTitle.isDisplayed());
    }
}
