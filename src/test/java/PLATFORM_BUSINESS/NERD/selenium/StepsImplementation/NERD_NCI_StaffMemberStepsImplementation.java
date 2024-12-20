package PLATFORM_BUSINESS.NERD.selenium.StepsImplementation;

import PLATFORM_BUSINESS.NERD.selenium.Constants.*;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.testng.Assert;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class NERD_NCI_StaffMemberStepsImplementation extends PageInitializer {

    /**
     * This method will submit Application to DOC Planing Contact
     *
     * @param submissionName
     */
    public static void submittingOfApplicationToDocPlaningContact(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdDynamicXpaths.submitButtonToDOCPlanningContact(submissionName));
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText(submissionName));
        CommonUtils.sleep(1000);
        Assert.assertTrue(nerdDynamicXpaths.underReviewText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER).getText().contentEquals("Under Review"));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(submissionName));
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(5000);
    }

    /**
     * This method will delete the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void deletingOfSubmissionByProgramStaff(String submissionName) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.sleep(5000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        nerdDynamicXpaths.deleteButtonReturnedToStaffMember(submissionName).click();
        CommonUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
        CommonUtils.sleep(1000);
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(1000);
    }

    /**
     * This method will create the Submission by Program Staff
     *
     * @param submissionName
     */
    public static void creatingOfSubmissionByProgramStaff(String submissionName) {
        WebDriverUtils.webDriver.get(getNerdUrl());
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember(submissionName);
    }

    /**
     * This method will locate Staff Member to CRS Knowledge Management System Page
     *
     * @param submissionsPage
     */
    public static void aProgramStaffMemberIsOnTheCRSKnowledgeManagementSystemPage(String submissionsPage) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
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
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(nerdKnowledgeBasePage.nerdCRSKnowledgeMainText);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
    }

    /**
     * NCI Staff Member submits Top Accomplishment submission to DOC planning Contact
     */
    public static void nci_staff_member_submits_new_top_accomplishments_submission() {
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentsCreateNewSubmissionLink);
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.filingOutAllRequiredFieldsOfSubmission();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCRSTopAccomplishmentsPage.nerdNewSubmissionsSubmitToDocPlanningPopUpYesButton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        CommonUtils.sleep(6000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method documents the process of doc planning contact returning the top accomplishments submission back to nci staff member.
     * @param submissionName The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member(String docPlanningContact, String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton);
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(5000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
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
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton);
        nerdCRSTopAccomplishmentsPage.nerdTopAccomplishmentsAccordionButton.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertTrue(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME).getText()
                .contentEquals(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verify that Delete button is removed for the NCI Staff Member Top Accomplishment Submission returned by Doc Planning contact
     *
     * @param delete
     */
    public static void nci_staff_member_does_not_see_the_button_for_top_accomplishments_submission_returned_record(String delete) {
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
        CommonUtils.sleep(1000);
    }

    /**
     * NCI Staff Member submits Other Accomplishment submission to DOC planning Contact
     */
    public static void nci_staff_member_submits_new_other_accomplishments_submission() {
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.otherAccomplishmentsCreateNewSubmissionLink);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSIONS_PAGE_CATEGORY_VALUE));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsSelectCheckBoxFiscalYear2019.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox);
        CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox, Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME);
        CommonUtils.waitForVisibility(createNewSubmissionPage.leadDOCDropDown);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, Other_Accomplishments_Submissions_Constants.SUBMISSIONS_DOC_FIELD_DROPDOWN);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        createNewSubmissionPage.DescriptionTextBox.sendKeys(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_DESCRIPTION_TEXT_BOX);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageResearchTypeDropDown);
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageResearchTypeDropDown, Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_RESEARCH_TYPE);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCRSTopAccomplishmentsPage.nerdNewSubmissionsSubmitToDocPlanningPopUpYesButton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton.click();
        CommonUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to document the process of the doc planning contact returning the other accomplishments
     * submission back to the NCI staff member.
     *
     * @param docPlanningContact The name of the doc planning contact.
     * @param submissionName The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_other_accomplishments_submission_back_to_nci_staff_member(String docPlanningContact, String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(5000);
//        CommonUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText().contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * In this method, nci staff member views the other accomplishment submission returned by doc planning contact
     */
    public static void nci_staff_member_views_the_returned_other_accomplishments_submission() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton);
        nerdcrstOtherAccomplishmentsPage.nerdOtherAccomplishmentsAccordionButton.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertTrue(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getText()
                .contentEquals(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verify that Delete button is removed for the NCI Staff Member for Other Accomplishment Submission returned by Doc Planning contact
     *
     * @param delete
     */
    public static void nci_staff_member_does_not_see_the_button_for_other_accomplishments_submission_returned_record(String delete){
        String deleteButtonHidden = nerdDynamicXpaths.deleteCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(deleteButtonHidden, NCI_Staff_Members_Constants.DELETE_BUTTON_HIDDEN, "Verifying that delete button is hidden for NCI Staff Member using attribute");
        String submitButtonVisible = nerdDynamicXpaths.submitButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(submitButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Submit button is Visible for NCI Staff Member using attribute");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        String editButtonVisible = nerdDynamicXpaths.eiditCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(editButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Edit button is Visible for NCI Staff Member using attribute");
        nerdDynamicXpaths.submitToCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.SUBMIT_BUTTON_TEXT, nerdDynamicXpaths.submitToCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that NCI Staff Member Other Accomplishment Submission returned by Doc Planning contact has Submit Button");
        nerdDynamicXpaths.eiditCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME));
        CommonUtils.assertEquals(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT, nerdDynamicXpaths.eiditCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getText());
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT,nerdDynamicXpaths.eiditCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that NCI Staff Member Other Accomplishment Submission returned by Doc Planning contact has Edit Button");
        Assert.assertNotEquals(delete, nerdDynamicXpaths.deleteCRSButton(Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME).getText(),
                "Verifying that Delete button is removed from the NCI Staff Member Other Accomplishment Submission returned by Doc Planning contact");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the process of an NCI staff member submitting a new Collaborations submission.
     */
    public static void nci_staff_member_submits_new_collaborations_submission() {
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingNewCollaborationSubmission(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(createNewSubmissionPage.nerdCollaborationsButton);
        createNewSubmissionPage.nerdCollaborationsButton.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method documents the process of the doc planning contact returning the collaborations submission back to an NCI staff member.
     *
     * @param docPlanningContact The name of the doc planning contact.
     * @param submissionName The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_collaborations_submission_back_to_nci_staff_member(String docPlanningContact, String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(createNewSubmissionPage.nerdCollaborationsButton);
        createNewSubmissionPage.nerdCollaborationsButton.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(3000);
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText().contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method represents the process of an NCI staff member viewing the returned Collaborations submission.
     */
    public static void nci_staff_member_views_the_returned_collaborations_submission() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(createNewSubmissionPage.nerdCollaborationsButton);
        createNewSubmissionPage.nerdCollaborationsButton.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertTrue(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText()
                .contentEquals(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the NCI staff member does not see the Delete button for Collaborations submission returned record by Doc Planning Contact.
     *
     * @param delete The delete button value.
     */
    public static void nci_staff_member_does_not_see_the_button_for_collaborations_submission_returned_record(String delete) {
        String deleteButtonHidden = nerdDynamicXpaths.deleteCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(deleteButtonHidden, NCI_Staff_Members_Constants.DELETE_BUTTON_HIDDEN, "Verifying that delete button is hidden for NCI Staff Member using attribute");
        String submitButtonVisible = nerdDynamicXpaths.submitButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(submitButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Submit button is Visible for NCI Staff Member using attribute");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        String editButtonVisible = nerdDynamicXpaths.eiditCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(editButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Edit button is Visible for NCI Staff Member using attribute");
        nerdDynamicXpaths.submitToCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.SUBMIT_BUTTON_TEXT, nerdDynamicXpaths.submitToCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member Collaborations Submission returned by Doc Planning contact has Submit Button");
        nerdDynamicXpaths.eiditCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEquals(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT, nerdDynamicXpaths.eiditCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText());
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT,nerdDynamicXpaths.eiditCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member Collaborations Submission returned by Doc Planning contact has Edit Button");
        Assert.assertNotEquals(delete, nerdDynamicXpaths.deleteCRSButton(NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that Delete button is removed from the NCI Staff Member Collaborations Submission returned by Doc Planning contact");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(10000);
    }

    /**
     * This method represents the process of an NCI staff member submitting a new COVID-19 Activities submission.
     * NCI Staff Member submits COVID-19 Activities submission to DOC planning Contact
     */
    public static void nci_staff_member_submits_new_covid19_activities_submission() {
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CommonUtils.clickOnElement(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
        CommonUtils.sleep(2000);
        PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualCategoryValue = nerdDynamicXpaths.submissionsCategory(Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE).getText();
        CommonUtils.assertEqualsWithMessage(actualCategoryValue, Covid19ActivitiesSubmissions_Constants.COVID_19_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE,
                "Verify that when the user is on COVID-19 Activities Submission then Category is 'COVID-19 Activities'");
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox);
        CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX);
        CommonUtils.waitForVisibility(createNewSubmissionPage.leadDOCDropDown);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_DOC_DROP_DOWN);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.nCIActivitiesDropDown, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_NCI_ACTIVITIES_DROP_DOWN);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicCovid19CheckBox);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19SpecialTopicBigDataDataSharingCheckBox);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanPriority1CheckBox);
        JavascriptUtils.clickByJS(covid19ActivitiesSubmissionsPage.nihCovid19StrategicPlanPriority1CheckBox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCRSTopAccomplishmentsPage.nerdNewSubmissionsSubmitToDocPlanningPopUpYesButton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method documents the process of the doc planning contact returning the COVID-19 activities submission back to the NCI staff member.
     *
     * @param docPlanningContact The name of the doc planning contact.
     * @param submissionName The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_covid19_activities_submission_back_to_nci_staff_member(String docPlanningContact, String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(3000);
//        CommonUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText().contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * NCI staff member views the returned COVID-19 activities submission.
     */
    public static void nci_staff_member_views_the_returned_covid19_activities_submission() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink);
        covid19ActivitiesSubmissionsPage.covid19ActivitiesSubmissionAccordionLink.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertTrue(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getText()
                .contentEquals(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the Delete button for COVID-19 activities submission returned record is not visible for NCI staff member
     *
     * @param delete The delete button value
     */
    public static void nci_staff_member_does_not_see_the_button_for_covid19_activities_submission_returned_record(String delete) {
        String deleteButtonHidden = nerdDynamicXpaths.deleteCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(deleteButtonHidden, NCI_Staff_Members_Constants.DELETE_BUTTON_HIDDEN, "Verifying that delete button is hidden for NCI Staff Member using attribute");
        String submitButtonVisible = nerdDynamicXpaths.submitButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(submitButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Submit button is Visible for NCI Staff Member using attribute");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        String editButtonVisible = nerdDynamicXpaths.eiditCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(editButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Edit button is Visible for NCI Staff Member using attribute");
        nerdDynamicXpaths.submitToCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.SUBMIT_BUTTON_TEXT, nerdDynamicXpaths.submitToCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member COVID-19 Activities Submission returned by Doc Planning contact has Submit Button");
        nerdDynamicXpaths.eiditCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEquals(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT, nerdDynamicXpaths.eiditCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getText());
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT,nerdDynamicXpaths.eiditCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member COVID-19 Activities Submission returned by Doc Planning contact has Edit Button");
        Assert.assertNotEquals(delete, nerdDynamicXpaths.deleteCRSButton(Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that Delete button is removed from the NCI Staff Member COVID-19 Activities Submission returned by Doc Planning contact");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(10000);
    }

    /**
     * This method is used when an NCI staff member submits a new ad hoc data call submission.
     */
    public static void nci_staff_member_submits_new_ad_hoc_data_call_submission() {
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink);
        CommonUtils.clickOnElement(adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallCreateNewSubmissionButton);
        JavascriptUtils.drawBlueBorder(adHoc_data_call_submissions_page.adHocDataCallCreateNewSubmissionButton);
        CommonUtils.sleep(2000);
        NERDApplicationStepsImplementation.creatingNewSubmission(adHoc_data_call_submissions_page.adHocDataCallCreateNewSubmissionButton);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.viewSubmissionsHeaders(ReturningSubmissions_Constants.SUBMISSION_VIEW_RECORD_CATEGORY_HEADER));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submissionsCategory(NCI_Staff_Members_Constants.AD_HOC_DATA_CALL_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualCategoryValue = nerdDynamicXpaths.submissionsCategory(NCI_Staff_Members_Constants.AD_HOC_DATA_CALL_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE).getText();
        CommonUtils.assertEqualsWithMessage(actualCategoryValue, NCI_Staff_Members_Constants.AD_HOC_DATA_CALL_SUBMISSION_VIEW_RECORD_CATEGORY_VALUE,
                "Verify that when the user is on Ad Hoc Data Call Submission then Category is 'Ad Hoc Data Call'");
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsSelectCheckBoxFiscalYear2019.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox);
        CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsPageTitleTextBox, ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX);
        CommonUtils.waitForVisibility(createNewSubmissionPage.leadDOCDropDown);
        CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, ReturningSubmissions_Constants.SUBMISSIONS_DOC_FIELD_DROPDOWN);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
        createNewSubmissionPage.DescriptionTextBox.sendKeys(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_DESCRIPTION_TEXT_BOX);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.switchTo().defaultContent();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallSubmissionPOCTextBox);
        CommonUtils.sendKeys(adHoc_data_call_submissions_page.adHocDataCallSubmissionPOCTextBox, ReturningSubmissions_Constants.AD_HOC_DATA_CALL_SUBMISSION_POINT_OF_CONTACT_TEXT_BOX);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.newSubmissionsPageSubmitButton);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nerdCRSTopAccomplishmentsPage.nerdNewSubmissionsSubmitToDocPlanningPopUpYesButton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.clickOnElement(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink);
        adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nerdDynamicXpaths.underReviewText(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method documents the process of the doc planning contact returning the ad hoc data call submission back to NCI staff member.
     *
     * @param docPlanningContact  The name of the doc planning contact.
     * @param submissionName      The name of the submission to be returned.
     */
    public static void doc_planning_contact_returning_the_ad_hoc_data_call_submission_back_to_nci_staff_member(String docPlanningContact, String submissionName) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser(docPlanningContact);
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNerdUrl());
        WebDriverUtils.webDriver.navigate().refresh();
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink);
        adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink.click();
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButtonToStaff(submissionName));
        CommonUtils.sleep(2000);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField.sendKeys(NCI_Staff_Members_Constants.DOC_PLANNING_RETURN_TO_NCI_STAFF_MESSAGE);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
        nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
        CommonUtils.sleep(3000);
        CommonUtils.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText(submissionName).getText().contentEquals(ReturningSubmissions_Constants.RETURNED_TO_STUFF_MEMBER_TEXT));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(submissionName));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method represents the process of an NCI staff member viewing the returned ad hoc data call submission.
     */
    public static void nci_staff_member_views_the_returned_ad_hoc_data_call_submission() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
        CommonUtils.sleep(1000);
        CommonUtils.waitForVisibility(adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink);
        adHoc_data_call_submissions_page.adHocDataCallSubmissionAccordionLink.click();
        CommonUtils.scrollIntoView(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.waitForVisibility(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertTrue(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getText()
                .contentEquals(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.nciStaffMemberSubmissionTitle(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Method to verify that the NCI staff member does not see the Delete button for ad hoc data call submission returned record.
     *
     * @param delete A string parameter representing the delete button value.
     */
    public static void nci_staff_member_does_not_see_the_button_for_ad_hoc_data_call_submission_returned_record(String delete) {
        String deleteButtonHidden = nerdDynamicXpaths.deleteCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(deleteButtonHidden, NCI_Staff_Members_Constants.DELETE_BUTTON_HIDDEN, "Verifying that delete button is hidden for NCI Staff Member using attribute");
        String submitButtonVisible = nerdDynamicXpaths.submitButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(submitButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Submit button is Visible for NCI Staff Member using attribute");
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        String editButtonVisible = nerdDynamicXpaths.eiditCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getAttribute(NCI_Staff_Members_Constants.buttons_ARIA_HIDDEN_ATTRIBUTE);
        CommonUtils.assertEqualsWithMessage(editButtonVisible, NCI_Staff_Members_Constants.BUTTON_VISIBLE, "Verifying that Edit button is Visible for NCI Staff Member using attribute");
        nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.SUBMIT_BUTTON_TEXT, nerdDynamicXpaths.submitToCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member Ad Hoc Data Call Submission returned by Doc Planning contact has Submit Button");
        nerdDynamicXpaths.eiditCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).isDisplayed();
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.eiditCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX));
        CommonUtils.assertEquals(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT, nerdDynamicXpaths.eiditCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getText());
        CommonUtils.assertEqualsWithMessage(ReturningSubmissions_Constants.EDIT_BUTTON_TEXT,nerdDynamicXpaths.eiditCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that NCI Staff Member Ad Hoc Data Call Submission returned by Doc Planning contact has Edit Button");
        Assert.assertNotEquals(delete, nerdDynamicXpaths.deleteCRSButton(ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX).getText(),
                "Verifying that Delete button is removed from the NCI Staff Member Ad Hoc Data Call Submission returned by Doc Planning contact");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(10000);
    }
}