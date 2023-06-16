package ServiceNow.NERD.Steps;

import java.util.Set;

import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_CRSReviewerStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_DOC_PlanningContactStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_StaffMemberStepsImplementation;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class existingReturningCollaborationsSteps extends PageInitializer {

    /*
     * ------------------------------------------------------------- BEGINNING FIRST
     * SCENARIO -------------------------------------------------------------
     */

    @Given("a CRS Reviewer is on the Submissions page")
    public void a_CRS_Reviewer_is_on_the_Submissions_page() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_CRSReviewerStepsImplementation.crsReviewerIsOnSubmissionsPage("Submissions");
    }

    @Given("locates the Collaboration titled {string}")
    public void locates_the_Collaboration_titled(String nCICancerDataStandardsRepositoryAndRegistrycaDSR) {
        NERDApplicationStepsImplementation.locatingOfCollaboration(nCICancerDataStandardsRepositoryAndRegistrycaDSR);
    }

    @When("the user clicks the Return button")
    public void the_user_clicks_the_Return_button() throws TestingException {
        nerdDynamicXpaths.returnButton("NCI Cancer Data Standards Repository and Registry (caDSR)").click();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the user is able to enter a comment")
    public void the_user_is_able_to_enter_a_comment() {
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
                .sendKeys("Returning to Doc - Automated Test");
        CucumberLogUtils.logScreenShot();

    }

    @Then("click the {string} button")
    public void click_the_button(String yes) {
        NERDApplicationStepsImplementation.clickingOnYESButtonWhenReturningCollaboration(yes);
    }

    @Then("the status of the Collaboration reads {string}")
    public void the_status_of_the_Collaboration_reads(String returnedToDoc) throws TestingException {
        NERDApplicationStepsImplementation.verifyingReturnedDOCStatus("NCI Cancer Data Standards Repository and Registry (caDSR)", returnedToDoc);
        NERD_NCI_DOC_PlanningContactStepsImplementation.resubmittingOfSubmissionByDOCContactToCRSREviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    /*
     * ------------------------------------------------------------- END FIRST
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING
     * SECOND SCENARIO -------------------------------------------------------------
     */

    @Given("a DOC Planning Contact is on the Submissions page")
    public void a_DOC_Planning_Contact_is_on_the_Submissions_page() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_DOC_PlanningContactStepsImplementation.docPlaningContactIsOnSubmissionsPage("Submissions");

    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String editButton) {
        NERDApplicationStepsImplementation.clickingOnEditButtonWhenReturningCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)", editButton);
    }

    @Then("a new tab opens to allow the user to edit the submission")
    public void a_new_tab_opens_to_allow_the_user_to_edit_the_submission() {
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    @Then("{string} and {string} field values are cleared and are required")
    public void the_and_field_values_are_cleared_and_are_required(String pleaseSpecify, String fiscalYear)
            throws TestingException {
        NERDApplicationStepsImplementation.verifyingThatFieldsOfSubmissionAreClearedAndRequired("NCI Cancer Data Standards Repository and Registry (caDSR)", pleaseSpecify, fiscalYear);
        NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
        NERDApplicationStepsImplementation.editAndResubmittingOfSubmissionByDOCContactToCRSREviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    /*
     * ------------------------------------------------------------- END SECOND
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING THIRD
     * SCENARIO -------------------------------------------------------------
     */

    @Given("DOC Planning Contact is on the edit submission page for the Collaboration titled {string}")
    public void doc_Planning_Contact_is_on_the_edit_submission_page_for_the_Collaboration_titled(
            String nCICancerDataStandardsRepositoryAndRegistrycaDSR) throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer(nCICancerDataStandardsRepositoryAndRegistrycaDSR);
        NERD_NCI_DOC_PlanningContactStepsImplementation.docPlaningContactIsOnSubmissionsPage("Submissions");
        NERDApplicationStepsImplementation.locatingOfCollaboration(nCICancerDataStandardsRepositoryAndRegistrycaDSR);
        NERDApplicationStepsImplementation.clickingOnEditButtonWhenReturningCollaboration(nCICancerDataStandardsRepositoryAndRegistrycaDSR, "Edit");
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission(nCICancerDataStandardsRepositoryAndRegistrycaDSR);
    }

    @When("the user selects a value for the {string} field and for the {string} field")
    public void the_user_selects_a_value_for_the_field_and_for_the_field(String pleaseSpecify, String fiscalYear) {
        NERDApplicationStepsImplementation.selectingPleaseRequiredValues(pleaseSpecify, fiscalYear);
    }

    @When("clicks the {string} button")
    public void clicks_the_button(String saveButton) {
        NERDApplicationStepsImplementation.clickingOnSaveButton(saveButton);
    }

    @Then("the user is redirected to the Submissions page")
    public void the_user_is_redirected_to_the_Submissions_page() throws TestingException {
        NERDApplicationStepsImplementation.redirectingToSubmissionsPage();
        NERDApplicationStepsImplementation.submittingOfCollaborationToCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    /*
     * ------------------------------------------------------------- END THIRD
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING
     * FOURTH SCENARIO -------------------------------------------------------------
     */

    @Then("the user is able to select a {string}")
    public void the_user_is_able_to_select_a(String staffMember) {
        NERDApplicationStepsImplementation.selectingMemberFromUserDropDown("CBIIT Test Account");
    }

    @Then("enter a Comment")
    public void enter_a_Comment() {
        NERDApplicationStepsImplementation.enteringACommentWhenReturningCollaboration("Return DOC Test to Staff Member - Automated Test");
    }

    @Then("click the confirm {string} button")
    public void click_the_confirm_button(String yesButton) {
        NERDApplicationStepsImplementation.clickingOnYESButtonWhenReturningCollaboration(yesButton);
    }

    @Then("the status of the Collaboration will read {string}")
    public void the_status_of_the_Collaboration_will_read(String returnedToStaffMember) throws TestingException {
        NERDApplicationStepsImplementation.verifyingReturnedToStaffMemberStatus("NCI Cancer Data Standards Repository and Registry (caDSR)", returnedToStaffMember);
        NERD_NCI_StaffMemberStepsImplementation.editingAndSubmittingOfCollaborationToDOCPlaningContact("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    /*
     * ------------------------------------------------------------- END FOURTH
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING FIFTH
     * SCENARIO -------------------------------------------------------------
     */

    @Given("a Program Staff is on the Submissions page")
    public void a_Program_Staff_is_on_the_Submissions_page() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_DOC_PlanningContactStepsImplementation.editingAndReturningSubmissionToProgramStaff("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_StaffMemberStepsImplementation.locatingProgramStaffMemberToSubmissionsPage("NERD");
    }

    @When("the Staff Member clicks the {string} button")
    public void the_Staff_Member_clicks_the_button(String staffEditButton) {
        NERDApplicationStepsImplementation.clickingOnEditButtonWhenReturningCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)", staffEditButton);
    }

    @Then("the {string} and {string} fields are not cleared and retain the values entered by the DOC Planning Contact")
    public void the_and_fields_are_not_cleared_and_retain_the_values_entered_by_the_DOC_Planning_Contact(
            String pleaseSpecifyText, String fiscalYearText) throws TestingException {
        NERDApplicationStepsImplementation.verifyingThatFieldsOfSubmissionAreNotClearedAndRequired();
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    /*
     * ------------------------------------------------------------- END FIFTH
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING SIXTH
     * SCENARIO -------------------------------------------------------------
     */

    @When("the Program Staff clicks the {string} button")
    public void the_Program_Staff_clicks_the_button(String submit) {
        NERDApplicationStepsImplementation.clickingOnSubmitButton("NCI Cancer Data Standards Repository and Registry (caDSR)", submit);
        NERDApplicationStepsImplementation.confirmingSubmission();
    }

    @Then("the Status of the {string} submission reads {string}")
    public void the_Status_of_the_submission_reads(String nciCancerDataStandardsRepositoryAndRegistry,
                                                   String underReview) {

        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        Assert.assertTrue(nerdDynamicXpaths.underReviewText(nciCancerDataStandardsRepositoryAndRegistry).getText()
                .equals(underReview));
        JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText(nciCancerDataStandardsRepositoryAndRegistry));
        CucumberLogUtils.logScreenShot();

    }

    @Then("the Program Staff is redirected to the Submissions page")
    public void the_Program_Staff_is_redirected_to_the_Submissions_page() throws TestingException {
        NERDApplicationStepsImplementation.redirectingToSubmissionsPage();
    }

    @Then("the Status of the Program Staff {string} submission reads {string}")
    public void the_Status_of_the_Program_Staff_submission_reads(String nciCancerDataStandardsRepositoryAndRegistry,
                                                                 String underReview) throws TestingException {
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview(nciCancerDataStandardsRepositoryAndRegistry, underReview);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");

    }

    /*
     * ------------------------------------------------------------- END SIXTH
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING
     * SEVENTH SCENARIO
     * -------------------------------------------------------------
     */

    @When("the DOC Planning Contact clicks the {string} button")
    public void the_DOC_Planning_Contact_clicks_the_button(String submitToCRS) throws TestingException {
        NERDApplicationStepsImplementation.editAndResubmittingOfSubmissionByDOCContactToCRSREviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");
    }

    @When("then the DOC Planning Contact clicks the {string} button")
    public void then_the_DOC_Planning_Contact_clicks_the_button(String yes) throws TestingException {
        //   NERDApplicationStepsImplementation.clickingOnYESButtonWhenReturningCollaboration(yes);
        //    CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        System.out.println(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.getAttribute("textContent").trim());
        System.out.println(yes);
        Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.getAttribute("textContent").trim().equals(yes));
        MiscUtils.sleep(1000);
        JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        MiscUtils.sleep(3000);

    }

    @Then("the status of the submission reads {string}")
    public void the_status_of_the_submission_reads(String underCrsReview) throws TestingException {

        // NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview("NCI Cancer Data Standards Repository and Registry (caDSR)", underCrsReview);
        JavascriptUtils
                .scrollIntoView(nerdDynamicXpaths.underReviewText("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        System.out.println(nerdDynamicXpaths.underReviewText("NCI Cancer Data Standards Repository and Registry (caDSR)").getText());
        Assert.assertTrue(nerdDynamicXpaths.underReviewText("NCI Cancer Data Standards Repository and Registry (caDSR)")
                .getText().equals(underCrsReview));
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(
                nerdDynamicXpaths.underReviewText("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();

        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");

    }

    /*
     * ------------------------------------------------------------- END SEVENTH
     * SCENARIO -------------------------------------------------------------
     */

    /*
     * ------------------------------------------------------------- BEGINNING
     * EIGHTH SCENARIO -------------------------------------------------------------
     */

    @Given("a CRS Reviewer has navigated to the Submissions page")
    public void a_CRS_Reviewer_has_navigated_to_the_Submissions_page() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer("NCI Cancer Data Standards Repository and Registry (caDSR)");

        nativeViewImpersonateUser.impersonateToDocPlanningContact();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.editButton("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        MiscUtils.sleep(2000);
        nerdDynamicXpaths.editButton("NCI Cancer Data Standards Repository and Registry (caDSR)").click();
        MiscUtils.sleep(2000);
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
        CommonUtils.selectDropDownValue("2022", createNewSubmissionPage.fiscalYearDropDown);
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(createNewSubmissionPage.editedDOCSubmissionSaveButton);
        createNewSubmissionPage.editedDOCSubmissionSaveButton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.submitToCRSButton("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        Assert.assertTrue(
                nerdDynamicXpaths.submitToCRSButton("NCI Cancer Data Standards Repository and Registry (caDSR)")
                        .getText().equals("Submit to CRS"));
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        nerdDynamicXpaths.submitToCRSButton("NCI Cancer Data Standards Repository and Registry (caDSR)").click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        MiscUtils.sleep(1000);

        nativeViewImpersonateUser.impersonateToCRSReviewer();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        CommonUtils.waitForVisibility(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                "Submissions");
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)"));
    }

    @When("the CRS Reviewer clicks the {string} button")
    public void the_CRS_Reviewer_clicks_the_button(String publishToNerd) {

        Assert.assertTrue(
                nerdDynamicXpaths.publishToNERDButton("NCI Cancer Data Standards Repository and Registry (caDSR)")
                        .getText().equals(publishToNerd));
        nerdDynamicXpaths.publishToNERDButton("NCI Cancer Data Standards Repository and Registry (caDSR)").click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        CucumberLogUtils.logScreenShot();

    }

    @When("the CRS Reviwer clicks the {string} button")
    public void the_CRS_Reviwer_clicks_the_button(String yes) {

        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
        Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.getText().equals(yes));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        MiscUtils.sleep(1000);

    }

    @Then("the submission is published")
    public void the_submission_is_published() {

        JavascriptUtils.scrollIntoView(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu);
        nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
        CommonUtils.selectValueFromBootStrapDropDown(
                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
                "Submissions");
        CommonUtils.waitForVisibility(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
        nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
        CommonUtils.waitForVisibility(
                nerdDynamicXpaths.publishedCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.publishedCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.publishedText.isDisplayed());
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    @Then("the status reads {string}")
    public void the_status_reads(String published) {

        JavascriptUtils.scrollIntoView(
                nerdDynamicXpaths.publishedCollaboration("NCI Cancer Data Standards Repository and Registry (caDSR)"));
        JavascriptUtils.drawRedBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.publishedText);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.publishedText.getText().equals(published));
    }

    /*
     * ------------------------------------------------------------- END EIGHTH
     * SCENARIO -------------------------------------------------------------
     */


}
