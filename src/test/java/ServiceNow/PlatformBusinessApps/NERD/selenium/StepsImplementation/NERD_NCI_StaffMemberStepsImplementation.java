package ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation;

import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.NCI_Staff_Members_Constants;
import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.TopAccomplishmentsSubmission_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.testng.Assert;
import java.util.Set;

public class NERD_NCI_StaffMemberStepsImplementation extends PageInitializer {
    /**
     * This method will submit Application to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void submittingOfApplicationToDocPlaningContact(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
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
        CucumberLogUtils.logScreenshot();
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
    public static void deletingOfSubmissionByProgramStaff(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(2000);
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
    public static void creatingOfSubmissionByProgramStaff(String submissionName) {
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
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
    }

    /**
     * This method will locate Staff Member to CRS Knowledge Management System Page
     *
     * @param submissionsPage
     */
    public static void aProgramStaffMemberIsOnTheCRSKnowledgeManagementSystemPage(String submissionsPage) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1000);
        CommonUtils.assertEquals(NCI_Staff_Members_Constants.CRS_KNOWLEDGE_MANAGEMENT_SYSTEM_TEXT_MAIN_PAGE, nerdKnowledgeBasePage.nerdCRSKnowledgeMainText.getText());
        JavascriptUtils.drawBlueBorder(nerdKnowledgeBasePage.nerdCRSKnowledgeMainText);
        Assert.assertEquals(submissionsPage, nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink.getText());
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method logs in as an nci staff member who is not on the nerd table to the Nerd CRS Knowledge base.
     */
    public static void an_nci_staff_member_not_on_the_nerd_table_is_on_the_nerd_crs_knowledge_base() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nerdKnowledgeBasePage.nerdCRSKnowledgeMainText);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
    }

    /**
     * NCI Staff Member submits Top Accomplishment submission to DOC planning Contact
     */
    public static void nci_staff_member_submits_new_top_accomplishments_submission() {
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentsCreateNewSubmissionLink);
        NERDApplicationStepsImplementation.filingOutAllRequiredFieldsOfSubmission();
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentSubmitButton);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentSubmitButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsSubmitToDocPlanningPopUpYesButton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method documents the process of doc planning contact returning the top accomplishments submission back to nci staff member.
     * @param submissionName The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member(String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("jonesangel@nih.gov");
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton);
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        MiscUtils.sleep(1000);
        CommonUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText().contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * In this method, nci staff member views the top accomplishment submission returned by doc planning contact
     */
    public static void nci_staff_member_views_top_accomplishments_submission_category() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton);
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.topAccomplishmentSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.topAccomplishmentSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertTrue(nerdDynamicXpaths.topAccomplishmentSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText()
                .contentEquals(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.topAccomplishmentSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();

    }

    /**
     * Verify that Delete button is removed for the NCI Staff Member Top Accomplishment Submission returned by Doc Planning contact
     * @param delete
     */
    public static void nci_staff_member_does_not_see_the_button_for_returned_record(String delete) {
        String deleteButtonHidden = nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(deleteButtonHidden, NCI_Staff_Members_Constants.DELETE_BUTTON_HIDDEN, "Verifying that delete button is hidden for NCI Staff Member using attribute");
        String submitButtonVisible = nerdDynamicXpaths.submitButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(submitButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Submit button is Visible for NCI Staff Member using attribute");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        String editButtonVisible = nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(editButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Edit button is Visible for NCI Staff Member using attribute");
        nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.SUBMIT_BUTTON_TEXT, nerdDynamicXpaths.submitToCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that NCI Staff Member Top Accomplishment Submission returned by Doc Planning contact has Submit Button");
        nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT, nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT,nerdDynamicXpaths.eiditCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that NCI Staff Member Top Accomplishment Submission returned by Doc Planning contact has Edit Button");
        Assert.assertNotEquals(delete, nerdDynamicXpaths.deleteCRSButton(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that Delete button is removed from the NCI Staff Member Top Accomplishment Submission returned by Doc Planning contact");
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
    }
}