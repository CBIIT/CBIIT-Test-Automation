package PLATFORM_BUSINESS.NCCR.stepsImplementation;

import PLATFORM_BUSINESS.NCCR.constants.NCCRConstants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.getNCCRUrl;

public class NCCRStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter to NCCR Portal.
     */
    public void nccrSubmitterUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((NCCRConstants.SUBMITTER));
        WebDriverUtils.webDriver.get(getNCCRUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * User verifies section is displayed
     *
     * @param section (My Assigned Data Requests and Confidentiality Statement sections)
     */
    public void verifySectionDisplayed(String section) {
        switch (section) {
            case "My Assigned Data Requests":
                CommonUtils.waitForVisibility(nccrPage.sectionMyAssignedDataRequest);
                softAssert.assertTrue(nccrPage.sectionMyAssignedDataRequest.isDisplayed());
                break;
            case "Confidentiality Statement":
                CommonUtils.waitForVisibility(nccrPage.sectionConfidentialityStatement);
                softAssert.assertTrue(nccrPage.sectionConfidentialityStatement.isDisplayed());
                break;
        }
    }

    /**
     * User verifies section text is correct
     *
     * @param text (Sections description)
     */
    public void verifySectionTextDisplayed(String text) {
        switch (text) {
            case "My Assigned Data Requests":
                CommonUtils.waitForVisibility(nccrPage.sectionTextMyAssignedDataRequest);
                softAssert.assertTrue(nccrPage.sectionTextMyAssignedDataRequest.isDisplayed());
                break;
            case "Confidentiality Statement":
                CommonUtils.waitForVisibility(nccrPage.sectionTextConfidentialityStatement);
                softAssert.assertTrue(nccrPage.sectionTextConfidentialityStatement.isDisplayed());
                break;
        }
    }
}