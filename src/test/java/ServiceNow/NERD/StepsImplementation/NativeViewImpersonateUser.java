package ServiceNow.NERD.StepsImplementation;

import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.ETracking.Constants.EtrackAssetsRecords_NativeView_Constants;
import ServiceNow.GCP.Constants.GCPNotifications_NativeView_Constants;
import ServiceNow.GDC.Constants.GDC_WorkFlow_NV_Constants;
import ServiceNow.NERD.Constants.CRSReviewers_Constants;
import ServiceNow.NERD.Steps.HooksSteps;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;

public class NativeViewImpersonateUser extends PageInitializer {

    public void impersonateToCRSReviewer() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(CRSReviewers_Constants.CRS_REVIEWER_UNIQUE_NAME);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateToAnyCRSReviewerNerd(String approver, String approverEmail) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.impersonateSearchBoxMultipleImpersonator.sendKeys(approver);
        CommonUtils.waitForVisibility(NativeViewDashboardPage.dynamicImpersonatorLocatorByEmail(approverEmail));
        CommonUtils.clickOnElement(NativeViewDashboardPage.dynamicImpersonatorLocatorByEmail(approverEmail));
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateToDocPlanningContact() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(CRSReviewers_Constants.CRS_DOC_PLANNING_CONTACT_REVIEWER_NAME);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateToStaffMemberCBIIT() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(CRSReviewers_Constants.CBIIT_TEST_ACCOUNT_NAME);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateOGCRUser() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(CRSReviewers_Constants.OGCR_REVIEWER_NAME);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateEtrackingUser() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(EtrackAssetsRecords_NativeView_Constants.ETRACKING_USER_NAME);
        MiscUtils.sleep(5000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateAdminUser() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(GCPNotifications_NativeView_Constants.ADMIN_USER_EMAIL);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateGDCFulfillerUser() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox(GDC_WorkFlow_NV_Constants.GDC_FULFILLER_USER_EMAIL);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        nativeViewImpersonateUserPage.nativeViewLink.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }
}
