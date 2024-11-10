package ServiceNow.NCCR.StepsImplementation;

import ServiceNow.NCCR.Constants.NCCRConstants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
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
                CommonUtils.assertTrue(nccrPage.sectionMyAssignedDataRequest.isDisplayed());
                break;
            case "Confidentiality Statement":
                CommonUtils.waitForVisibility(nccrPage.sectionConfidentialityStatement);
                CommonUtils.assertTrue(nccrPage.sectionConfidentialityStatement.isDisplayed());
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
                CommonUtils.assertTrue(nccrPage.sectionTextMyAssignedDataRequest.isDisplayed());
                break;
            case "Confidentiality Statement":
                CommonUtils.waitForVisibility(nccrPage.sectionTextConfidentialityStatement);
                CommonUtils.assertTrue(nccrPage.sectionTextConfidentialityStatement.isDisplayed());
                break;
        }
    }
}