package ServiceNow.PlatformBusinessApps.NERD.selenium.Steps;

import ServiceNow.PlatformBusinessApps.NERD.Constants.ReturningSubmissions_Constants;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERD_NCI_CRSReviewerStepsImplementation;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERD_NCI_DOC_PlanningContactStepsImplementation;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERD_NCI_StaffMemberStepsImplementation;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDReturningSubmissionSteps extends PageInitializer {

    public static String newEmailNerd3895 = "nerdEmail3895" + CommonUtils.email;

    @Given("a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer")
    public void a_published_Collaboration_has_been_returned_to_the_DOC_Planning_Contact_by_the_CRS_Reviewer()
            throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Then("the {string} and {string} field values are cleared and are required")
    public void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
            throws TestingException {
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.verifyingByDOCContactThatFieldsOfSubmissionAreClearedAndRequired(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
        NERDApplicationStepsImplementation.deletingOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Then("the Collaboration shows as {string} in the Submissions page")
    public void the_Collaboration_shows_as_in_the_Submissions_page(String ReturnedToDOC) throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.theCollaborationShowsAsInTheSubmissionsPage(ReturnedToDOC);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @When("the DOC Planning Contact fills out the {string} and {string} field")
    public void the_DOC_Planning_Contact_fills_out_the_and_field(String PleaseSpecify, String FiscalYear)
            throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.fillingOutRequiredFieldsByDOCPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
    }

    @When("returns the Collaboration to the Program Staff")
    public void returns_the_Collaboration_to_the_Program_Staff() {
        NERDApplicationStepsImplementation.returningOfSubmissionToProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Then("the {string} and {string} field values are not cleared and are required")
    public void the_and_field_values_are_not_cleared_and_are_required(String PleaseSpecify, String FiscalYear) {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
        NERDApplicationStepsImplementation.verifyingThatFieldsOfSubmissionAreClearedAndRequired(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, FiscalYear);
        NERDApplicationStepsImplementation.deletingOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Then("the options available for the {string} field are {string}, {string}, {string}, and {string}")
    public void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange,
                                                            String Ended, String NotLedByNCI) throws TestingException {
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.verifyingAvailableOptionsOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER, PleaseSpecify, Edited, NocChange, Ended, NotLedByNCI);
        NERDApplicationStepsImplementation.deletingOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_CRS_REVIEWER);
    }

    @Given("a Collaboration has been submitted to the DOC Planning Contact")
    public void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_UNDER_REVIEW_TEXT);
    }

    @Then("the submitted Collaboration shows as {string} in the Submissions page")
    public void the_submitted_Collaboration_shows_as_in_the_Submissions_page(String UnderReview)
            throws TestingException {
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_UNDER_REVIEW_TEXT, UnderReview);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_UNDER_REVIEW_TEXT);
    }

    @Given("a published Collaboration has been returned to the Program Staff with the article version number as {string}")
    public void a_published_Collaboration_has_been_returned_to_the_Program_Staff_with_the_article_version_number_as(String versionNumber) throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERDApplicationStepsImplementation.verifyingArticleVersionNumber(versionNumber);
        NERD_NCI_DOC_PlanningContactStepsImplementation.editingAndReturningSubmissionToProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    @When("the Program Staff resubmits the article to the DOC Planning Contact")
    public void the_Program_Staff_resubmits_the_article_to_the_DOC_Planning_Contact() throws TestingException {
        NERD_NCI_StaffMemberStepsImplementation.submittingOfApplicationToDocPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    @Then("the article is incremented one major version number as {string}")
    public void the_article_is_incremented_one_major_version_number_as(String versionNumber) throws TestingException {
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERDApplicationStepsImplementation.verifyingIncrementedArticleVersionNumber(versionNumber);
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
        NERDApplicationStepsImplementation.checkingEmailWasNotReceived();
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_VERSION_NUMBER);
    }

    @Given("a published Collaboration is returned to the DOC Planning Contact")
    public void a_published_Collaboration_is_returned_to_the_DOC_Planning_Contact() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
        NERDApplicationStepsImplementation.returningOfSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @Given("the DOC Planning Contact resubmits the submission")
    public void the_DOC_Planning_Contact_resubmits_the_submission() throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.resubmittingOfSubmissionByDOCContactToCRSREviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @When("the CRS Reviewer returns the submission once more")
    public void the_CRS_Reviewer_returns_the_submission_once_more() throws TestingException {
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @Then("a notification is sent to the DOC Planning Contact")
    public void a_notification_is_sent_to_the_DOC_Planning_Contact() throws TestingException {
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION));
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTOMATION);
    }

    @Given("a DOC Planning Contact creates a Collaboration submission")
    public void a_DOC_Planning_Contact_creates_a_Collaboration_submission() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT);
    }

    @Then("they are able to return the submission to a Program Staff in the same DOC")
    public void they_are_able_to_return_the_submission_to_a_Program_Staff_in_the_same_DOC() throws TestingException {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT);
        NERD_NCI_StaffMemberStepsImplementation.deletingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT);
    }

    @Given("a Collaboration has been returned to a Program Staff")
    public void a_Collaboration_has_been_returned_to_a_Program_Staff() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF);
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF);
    }

    @Then("the Collaboration shows as {string} in the Submission page")
    public void the_Collaboration_shows_as_in_the_Submission_page(String ReturnedToStaffMember) throws TestingException {
        NERDApplicationStepsImplementation.verifyingReturnedToStaffMemberStatus(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF, ReturnedToStaffMember);
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_RETURN_TO_STUFF);
    }

    @Given("a published Collaboration started by a Program Staff has been returned to the DOC Planning Contact")
    public void a_published_Collaboration_started_by_a_Program_Staff_has_been_returned_to_the_DOC_Planning_Contact() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Given("the DOC Planning Contact returns the Collaboration to the Program Staff")
    public void the_DOC_Planning_Contact_returns_the_Collaboration_to_the_Program_Staff() throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Then("the author will show as the Program Staff user who originally created the Submission")
    public void the_author_will_show_as_the_Program_Staff_user_who_originally_created_the_Submission() throws TestingException {
        NERDApplicationStepsImplementation.verifyingTheAuthorOfCreatedSubmission(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_AUTHOR);
    }

    @Given("a DOC Planning Contact creates a Collaboration")
    public void a_DOC_Planning_Contact_creates_a_Collaboration() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT_SUBMISSION);
    }

    @Then("they are able to return the Collaboration to a Program Staff user")
    public void they_are_able_to_return_the_Collaboration_to_a_Program_Staff_user() throws TestingException {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT_SUBMISSION);
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION_NAME_DOC_PLAN_CONTACT_SUBMISSION);
    }

    @Given("a DOC Planning Contact is on the CRS Knowledge Management System home page")
    public void a_doc_planning_contact_is_on_the_crs_knowledge_management_system_home_page() throws TestingException{
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
