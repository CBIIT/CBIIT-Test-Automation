package PLATFORM_BUSINESS.OA_Intake.stepsImplementation;

import PLATFORM_BUSINESS.OA_Intake.constants.OAIntakeConstants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.testng.Assert;
import static com.nci.automation.web.TestProperties.getOAntakeUrl;

public class OAIntakeStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter to OA Intake Portal.
     */
    public void oaIntakeSubmitterUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((OAIntakeConstants.SUBMITTER));
        WebDriverUtils.webDriver.get(getOAntakeUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Logs in as a Contracting Officer to OA Intake Portal.
     */
    public void oaIntakeContrOfficerUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((OAIntakeConstants.CONTRACTING_OFFICER_ROLE));
        WebDriverUtils.webDriver.get(getOAntakeUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Logs in as a Leader to OA Intake Portal.
     */
    public void oaIntakeLeadershipUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((OAIntakeConstants.LEADERSHIP_ROLE));
        WebDriverUtils.webDriver.get(getOAntakeUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * verify tabs are displayed
     *
     * @param option
     */
    public void verifyTabDisplayed(String option) {
        switch (option) {
            case "New Request":
                CommonUtils.waitForVisibility(oaIntakePage.tabNewRequest);
                Assert.assertTrue(oaIntakePage.tabNewRequest.isDisplayed());
                break;
            case "CO/CS Queue":
                CommonUtils.waitForVisibility(oaIntakePage.tabCOCSQueue);
                Assert.assertTrue(oaIntakePage.tabCOCSQueue.isDisplayed());
                break;
            case "Requestor(Requested For) Queue":
                CommonUtils.waitForVisibility(oaIntakePage.tabRequestorQueue);
                Assert.assertTrue(oaIntakePage.tabRequestorQueue.isDisplayed());
                break;
            case "Management Dashboard":
                CommonUtils.waitForVisibility(oaIntakePage.tabManagementDashboard);
                Assert.assertTrue(oaIntakePage.tabManagementDashboard.isDisplayed());
                break;
            case "Leadership Queue (Pending Action)":
                CommonUtils.waitForVisibility(oaIntakePage.tabLeadershipQueue);
                Assert.assertTrue(oaIntakePage.tabLeadershipQueue.isDisplayed());
                break;
        }
    }
}

