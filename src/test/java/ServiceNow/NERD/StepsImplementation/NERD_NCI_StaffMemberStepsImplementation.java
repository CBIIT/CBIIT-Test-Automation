package ServiceNow.NERD.StepsImplementation;

import ServiceNow.COVIDDash.NativeView.Pages.NativeViewDashboardPage;
import ServiceNow.NERD.Constants.ReturningSubmissions_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;

import java.util.Set;


public class NERD_NCI_StaffMemberStepsImplementation extends PageInitializer {

    /**
     * This method will submit Application to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void submittingOfApplicationToDocPlaningContact(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName));
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText(submissionName));
        MiscUtils.sleep(1000);
        Assert.assertTrue(nerdDynamicXpaths.underReviewText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER).getText().contentEquals("Under Review"));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(submissionName));
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(5000);
    }

    /**
     * This method will edit and submit Collaboration to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void editingAndSubmittingOfCollaborationToDOCPlaningContact(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.eiditCRSButton(submissionName));
        nerdDynamicXpaths.eiditCRSButton(submissionName).click();
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
        JavascriptUtils.scrollIntoView(createNewSubmissionPage.editedStaffMemberSubmissionSaveButton);
        createNewSubmissionPage.editedStaffMemberSubmissionSaveButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths
                .submitButtonToDOCPlanningContact(submissionName));
        nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName)
                .click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
    }

    /**
     * This method will delete the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void deletingOfSubmissionByProgramStaff(String submissionName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        MiscUtils.sleep(5000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        MiscUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        nerdDynamicXpaths.deleteButtonReturnedToStaffMember(submissionName).click();
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
        MiscUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
    }

    /**
     * This method will create the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void creatingOfSubmissionByProgramStaff(String submissionName) throws TestingException {
        if (!nativeViewDashPage.textUserDropDown().equalsIgnoreCase("CBIIT Test Account")) {
            nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
            MiscUtils.sleep(5000);
        }
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(submissionName);
    }

    /**
     * This method will locate Staff Member to Submissions Page
     *
     * @param applicationName
     */
    public static void locatingProgramStaffMemberToSubmissionsPage(String applicationName) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationName));
        CucumberLogUtils.logScreenShot();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
    }

}
