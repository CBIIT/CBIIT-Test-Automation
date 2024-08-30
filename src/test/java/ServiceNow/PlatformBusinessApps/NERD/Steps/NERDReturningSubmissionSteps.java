package ServiceNow.PlatformBusinessApps.NERD.Steps;

import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.*;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDReturningSubmissionSteps extends PageInitializer {

    public static String newEmailNerd3895 = "nerdEmail3895" + CommonUtils.email;

    @Given("a published Collaboration has been returned to the DOC Planning Contact {string} by the CRS Reviewer {string}")
    public void a_published_collaboration_has_been_returned_to_the_doc_planning_contact_by_the_crs_reviewer(String docPlanningContact, String crsReviewer) {
        NERD_Returning_Submission_StepImpl.published_collaboration_has_been_returned_to_the_doc_planning_contact_by_the_crs_reviewer(docPlanningContact, crsReviewer);
    }

    @Then("the {string} and {string} field values are cleared and are required")
    public void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear) {
        NERD_Returning_Submission_StepImpl.the_and_field_values_are_cleared_and_are_required(PleaseSpecify, FiscalYear);
    }

    @Then("the Collaboration shows as {string} in the Submissions page")
    public void the_Collaboration_shows_as_in_the_Submissions_page(String ReturnedToDOC) {
        NERD_NCI_DOC_PlanningContactStepsImplementation.theCollaborationShowsAsInTheSubmissionsPage(ReturnedToDOC);
    }

    @When("the DOC Planning Contact {string} fills out the {string} and {string} field")
    public void the_doc_planning_contact_fills_out_the_and_field(String DocPlanningContact, String PleaseSpecify, String FiscalYear) {
        NERD_NCI_DOC_PlanningContactStepsImplementation.fillingOutRequiredFieldsByDOCPlaningContact(DocPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
    }

    @When("returns the Collaboration to the Program Staff")
    public void returns_the_Collaboration_to_the_Program_Staff() {
        NERDApplicationStepsImplementation.returningOfSubmissionToProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Then("the {string} and {string} field values are not cleared and are required")
    public void the_and_field_values_are_not_cleared_and_are_required(String PleaseSpecify, String FiscalYear) {
        NERD_Returning_Submission_StepImpl.the_and_field_values_are_not_cleared_and_are_required(PleaseSpecify, FiscalYear);
    }

    @Then("the options available for the {string} field are {string}, {string}, {string}, and {string}")
    public void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange, String Ended, String NotLedByNCI) {
        NERD_Returning_Submission_StepImpl.the_options_available_for_the_field_are_and(PleaseSpecify, Edited, NocChange, Ended, NotLedByNCI);
    }

    @Given("a Collaboration has been submitted to the DOC Planning Contact")
    public void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() {
       NERD_Returning_Submission_StepImpl.a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact();
    }

    @Then("the submitted Collaboration shows as {string} in the Submissions page")
    public void the_submitted_Collaboration_shows_as_in_the_Submissions_page(String UnderReview) {
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_UNDER_REVIEW_TEXT, UnderReview);
    }

    @Given("a Collaboration has been submitted by the Program Staff Member to the DOC Planning Contact {string} who submits to CRS Reviewer {string} for publishing")
    public void a_collaboration_has_been_submitted_by_the_program_staff_member_to_the_doc_planning_contact_who_submits_to_crs_reviewer_for_publishing(String docPlanningContact, String crsReviewer) {
        NERD_Returning_Submission_StepImpl.a_collaboration_has_been_submitted_by_the_program_staff_member_to_the_doc_planning_contact_who_submits_to_crs_reviewer_for_publishing(docPlanningContact, crsReviewer);
    }

    @When("a published Collaboration has been returned to the Doc Planning Contact")
    public void a_published_collaboration_has_been_returned_to_the_doc_planning_contact() {
        NERD_Returning_Submission_StepImpl.a_published_collaboration_has_been_returned_to_the_doc_planning_contact();
    }

    @When("a published Collaboration has been returned to the Program Staff by Doc Planning Contact {string} with the article version number as {string}")
    public void a_published_collaboration_has_been_returned_to_the_program_staff_by_doc_planning_contact_with_the_article_version_number_as(String docPlanningContact, String versionNumber) {
        NERD_Returning_Submission_StepImpl.a_published_collaboration_has_been_returned_to_the_program_staff_by_doc_planning_contact_with_the_article_version_number_as(docPlanningContact, versionNumber);
    }

    @When("the Program Staff resubmits the article to the DOC Planning Contact")
    public void the_Program_Staff_resubmits_the_article_to_the_DOC_Planning_Contact() {
        NERD_NCI_StaffMemberStepsImplementation.submittingOfApplicationToDocPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    @When("the DOC Planning Contact {string} resubmits the article to the CRS Reviewer {string}")
    public void the_doc_planning_contact_resubmits_the_article_to_the_crs_reviewer(String docPlanningContact, String crsReviewer) {
        NERD_Returning_Submission_StepImpl.the_doc_planning_contact_resubmits_the_article_to_the_crs_reviewer(docPlanningContact, crsReviewer);
    }

    @Then("the article is incremented one major version number as {string}")
    public void the_article_is_incremented_one_major_version_number_as(String versionNumber) {
        NERD_Returning_Submission_StepImpl.the_article_is_incremented_one_major_version_number_as(versionNumber);
    }

    @Given("a published Collaboration is returned to the DOC Planning Contact")
    public void a_published_Collaboration_is_returned_to_the_DOC_Planning_Contact() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @Given("the DOC Planning Contact resubmits the submission")
    public void the_DOC_Planning_Contact_resubmits_the_submission() {
        NERD_NCI_DOC_PlanningContactStepsImplementation.resubmittingOfSubmissionByDOCContactToCRSREviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @When("the CRS Reviewer returns the submission once more")
    public void the_CRS_Reviewer_returns_the_submission_once_more() {
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @Then("a notification is sent to the DOC Planning Contact")
    public void a_notification_is_sent_to_the_DOC_Planning_Contact() {
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION));
        CucumberLogUtils.logScreenshot();
    }

    @Given("a DOC Planning Contact creates a Collaboration submission")
    public void a_DOC_Planning_Contact_creates_a_Collaboration_submission() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT);
    }

    @Then("they are able to return the submission to a Program Staff in the same DOC")
    public void they_are_able_to_return_the_submission_to_a_Program_Staff_in_the_same_DOC() {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT);
    }

    @Given("a Collaboration has been returned to a Program Staff")
    public void a_Collaboration_has_been_returned_to_a_Program_Staff() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF);
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF);
    }

    @Then("the Collaboration shows as {string} in the Submission page")
    public void the_Collaboration_shows_as_in_the_Submission_page(String ReturnedToStaffMember) {
        NERDApplicationStepsImplementation.verifyingReturnedToStaffMemberStatus(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF, ReturnedToStaffMember);
    }

    @Given("a published Collaboration started by a Program Staff has been returned to the DOC Planning Contact")
    public void a_published_Collaboration_started_by_a_Program_Staff_has_been_returned_to_the_DOC_Planning_Contact() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Given("the DOC Planning Contact returns the Collaboration to the Program Staff")
    public void the_DOC_Planning_Contact_returns_the_Collaboration_to_the_Program_Staff() {
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Then("the author will show as the Program Staff user who originally created the Submission")
    public void the_author_will_show_as_the_Program_Staff_user_who_originally_created_the_Submission() {
        NERDApplicationStepsImplementation.verifyingTheAuthorOfCreatedSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Given("a DOC Planning Contact creates a Collaboration")
    public void a_DOC_Planning_Contact_creates_a_Collaboration() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT_SUBMISSION);
    }

    @Then("they are able to return the Collaboration to a Program Staff user")
    public void they_are_able_to_return_the_Collaboration_to_a_Program_Staff_user() {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT_SUBMISSION);
    }

    @Given("a DOC Planning Contact is on the CRS Knowledge Management System home page")
    public void a_doc_planning_contact_is_on_the_crs_knowledge_management_system_home_page() {
       NERDApplicationStepsImplementation.aDocPlanningContactIsOnTheCrsKnowledgeManagementSystemHomePage();
    }

    @When("selecting the Published Only checkbox")
    public void selecting_the_published_only_checkbox() {
        NERDApplicationStepsImplementation.selectingThePublishedOnlyCheckbox();
    }

    @Then("the DOC Planning Contact is able to see only published submissions")
    public void the_doc_planning_contact_is_able_to_see_only_published_submissions() {
        NERDApplicationStepsImplementation.theDocPlanningContactIsAbleToSeeOnlyPublishedSubmissions();
    }
}