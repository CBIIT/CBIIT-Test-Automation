package PLATFORM_BUSINESS.NERD.selenium.Steps;

import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.Constants.ReturningSubmissions_Constants;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.*;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDCollaborationSubmissionSteps extends PageInitializer {
    public static String title = "Title" + CommonUtils.getDateAsString();

    @Given("user is on the COVID19 Activities submissions page")
    public void user_is_on_the_COVID19_Activities_submissions_page() {
        Covid19ActivitiesSubmissionsStepImplementation.userIsOnTheCOVID19ActivitiesSubmissionsPage();
    }

    @Then("the section {string} displays")
    public void the_section_displays(String thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan) {
        NERDApplicationStepsImplementation.sectionOfCovid_19_SubmissionIsDisplayed(thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan);
    }

    @Then("the following check box options are also displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_check_box_options_are_also_displayed(String covid19, String communications,
                                                                   String rare,
                                                                   String bigDataDataSharing, String researchResourcesAndInfrastructure,
                                                                   String sexGenderDifferences,
                                                                   String partnerships,
                                                                   String technologyDevelopment, String trainingWorkforceDevelopment, String workforce,
                                                                   String metastatic,
                                                                   String meetingWorkshopConference, String minorityHealthHealtDisparities, String pediatric,
                                                                   String reportGuidancePolicy) {
        NERDApplicationStepsImplementation.checkBoxOptionsAreDisplayed(covid19, communications, rare,
                bigDataDataSharing, researchResourcesAndInfrastructure, sexGenderDifferences,
                partnerships,
                technologyDevelopment, trainingWorkforceDevelopment, workforce, metastatic,
                meetingWorkshopConference,
                minorityHealthHealtDisparities, pediatric, reportGuidancePolicy);
    }

    @Given("a Program Staff member is on the CRS Knowledge Management System {string} page")
    public void a_program_staff_member_is_on_the_crs_knowledge_management_system_page(String submissionsPage) {
        NERD_NCI_StaffMemberStepsImplementation.aProgramStaffMemberIsOnTheCRSKnowledgeManagementSystemPage(submissionsPage);
    }

    @Given("creates a new submission for Collaboration category")
    public void creates_a_new_submission_for_Collaboration_category() {
        NERDCollaborationSubmissionStepImpl.createsANewSubmissionForCollaborationCategory();
    }

    @Then("the created Collaborations submission is displays in the Collaborations category section with the status {string}")
    public void the_created_Collaborations_submission_is_displays_in_the_Collaborations_category_section_with_the_status(String expectedUnderReviewText) {
        NERDApplicationStepsImplementation.theCreatedCollaborationsSubmissionIsDisplaysInTheCollaborationsCategorySectionWithTheStatus(expectedUnderReviewText);
    }

    @Given("a Regular User has submitted a Collaboration")
    public void a_Regular_User_has_submitted_a_Collaboration() {
        NERDCollaborationSubmissionStepImpl.aRegularUserHasSubmittedACollaboration();
    }

    @When("the DOC Planning Contact {string} locates the record in their Collaboration queue")
    public void the_doc_planning_contact_locates_the_record_in_their_collaboration_queue(String docPlanningContact) {
        NERDCollaborationSubmissionStepImpl.theDOCPlanningContactLocatesTheRecordInTheirCollaborationQueue(docPlanningContact, ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
    }

    @When("clicks the Edit button for the record")
    public void clicks_the_edit_button_for_the_record() {
        NERDCollaborationSubmissionStepImpl.clicksTheEditButtonForTheRecord(ReturningSubmissions_Constants.COLLABORATIONS_NEW_SUBMISSION);
    }

    @When("lands on the submission edit page for author {string}")
    public void lands_on_the_submission_edit_page_for_author(String author) {
        NERDCollaborationSubmissionStepImpl.landsOnTheSubmissionEditPageForAuthor(author);
    }

    @Then("the Rank field is not visible")
    public void the_rank_field_is_not_visible() {
        NERD_NCI_DOC_PlanningContactStepsImplementation.verifyingRankFieldIsNotDisplayedOnCollaborationForm();
    }

    @Given("a DOC Planning Contact {string} clicks the Submit to CRS button for a Collaboration")
    public void a_doc_planning_contact_clicks_the_submit_to_crs_button_for_a_collaboration(String docPlanningContact) {
        NERDCollaborationSubmissionStepImpl.aDOCPlanningContactClicksTheSubmitToCRSButtonForACollaboration(docPlanningContact);
    }

    @When("the CRS Reviewer {string} locates the record in the Submissions page")
    public void the_crs_reviewer_locates_the_record_in_the_submissions_page(String crsReviewer) {
        NERDCollaborationSubmissionStepImpl.theCRSReviewerLocatesTheRecordInTheSubmissionsPage(crsReviewer);
    }

    @Then("the Rank field is not visible and collaboration is deleted")
    public void the_rank_field_is_not_visible_and_collaboration_is_deleted() {
        NERD_NCI_CRSReviewerStepsImplementation.verifyingRankFieldIsNotDisplayedAndDeletingSubmission();
    }
}