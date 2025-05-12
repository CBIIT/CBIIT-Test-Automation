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
        CommonUtils.waitForClickability(aaaPage.aaaPortalView);
        CommonUtils.clickOnElement(aaaPage.aaaPortalView);
    }

    /**
     *Verify Page title
     */
    public static void verifyAAAPageTitle() {
        softAssert.assertTrue(aaaPage.aaaPageTitle.isDisplayed());
    }

    /**
     *Verify requested for dropdown is displayed
     */
    public static void verifyRequestedForDropdown() {
        softAssert.assertTrue(aaaPage.requestedForDropdown.isDisplayed());
    }

    /**
     *Verify requested for field is prepopulated
     */
    public static void verifyRequestedForFieldPrepopulated() {
        softAssert.assertNotNull(aaaPage.requestedForField.getText());
    }

    /**
     *Verify requested for email field is prepopulated
     */
    public static void verifyRequestedForEmailFieldPrepopulated() {
        softAssert.assertNotNull(aaaPage.requestedForEmailField.getText());
    }

    /**
     *Verify organization affiliation field is prepopulated
     */
    public static void verifyOrganizationAffiliationFieldPrepopulated() {
        softAssert.assertNotNull(aaaPage.organizationAffiliationField.getText());
    }

    /**
     *Verify requested for email field is displayed
     */
    public static void verifyRequestedForEmailFieldDisplayed() {
        softAssert.assertTrue(aaaPage.systemNameDropdown.isDisplayed());
    }

    /**
     *Verify Application datasources dropdown is displayed
     */
    public static void verifyApplDatasourcesDropdownDisplayed() {
        softAssert.assertTrue(aaaPage.applDatasourcesDropdown.isDisplayed());
    }

    /**
     *Verify Application datasources dropdown is displayed
     */
    public static void verifyApplDatasourcesDescriptionFieldDisplayed() {
        softAssert.assertTrue(aaaPage.applDatasourcesDescriptionField.isDisplayed());
    }

    /**
     *Verify DOC level is displayed
     */
    public static void verifyDocLevelFieldDisplayed() {
        softAssert.assertTrue(aaaPage.docLevelField.isDisplayed());
    }

    /**
     *Verify User role is displayed
     */
    public static void verifyUserRoleFieldDisplayed() {
        softAssert.assertTrue(aaaPage.userRoleField.isDisplayed());
    }

    /**
     *Verify datepicker is displayed
     */
    public static void verifyDatepickerFieldDisplayed() {
        softAssert.assertTrue(aaaPage.datepickerField.isDisplayed());
    }

    /**
     *Verify Business Justification is displayed
     */
    public static void verifyBusinessJustificationFieldDisplayed() {
        softAssert.assertTrue(aaaPage.businessJustificationField.isDisplayed());
    }

    /**
     *Verify Federal Supervisor dropdown is displayed
     */
    public static void verifyFederalSupervisorDropdownDisplayed() {
        softAssert.assertTrue(aaaPage.federalSupervisorDropdown.isDisplayed());
    }

    /**
     *Verify 2nd Level Federal Supervisor dropdown is displayed
     */
    public static void verifySecondLevelSupervisorDropdownDisplayed() {
        softAssert.assertTrue(aaaPage.secondLevelSupervisorDropdown.isDisplayed());
    }
}
