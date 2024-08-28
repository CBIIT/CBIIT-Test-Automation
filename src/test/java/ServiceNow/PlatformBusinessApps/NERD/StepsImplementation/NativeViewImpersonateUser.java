package ServiceNow.PlatformBusinessApps.NERD.StepsImplementation;

import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.PlatformBusinessApps.NERD.Constants.CRSReviewers_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewImpersonateUser extends PageInitializer {

    public void impersonateToCRSReviewer() {
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

    public void impersonateToAnyCRSReviewerNerd(String approver, String approverEmail) {
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

    public void impersonateToDocPlanningContact() {
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
        nativeViewDashPage.enterTextImpersntSearchBox(CRSReviewers_Constants.DOC_PLANNING_CONTACT_NAME);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
    }

    public void impersonateToStaffMemberCBIIT() {
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
}