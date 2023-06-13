package ServiceNow.NERD.Steps;

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

public class NERDReturningSubmissionSteps extends PageInitializer {

    @Given("a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer")
    public void a_published_Collaboration_has_been_returned_to_the_DOC_Planning_Contact_by_the_CRS_Reviewer()
            throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff("TestingCRSReviewer");
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("TestingCRSReviewer");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("TestingCRSReviewer");
        NERDApplicationStepsImplementation.returningOfSubmission("TestingCRSReviewer");
    }

    @Then("the {string} and {string} field values are cleared and are required")
    public void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
            throws TestingException {
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission("TestingCRSReviewer");
        NERD_NCI_DOC_PlanningContactStepsImplementation.verifyingByDOCContactThatFieldsOfSubmissionAreClearedAndRequired("TestingCRSReviewer", PleaseSpecify, FiscalYear);
        NERDApplicationStepsImplementation.deletingOfSubmission("TestingCRSReviewer");
    }

    @Then("the Collaboration shows as {string} in the Submissions page")
    public void the_Collaboration_shows_as_in_the_Submissions_page(String ReturnedToDOC) throws TestingException {
        Assert.assertTrue(
                nerdDynamicXpaths.returnedToDOCText("TestingCRSReviewer").getText().contentEquals(ReturnedToDOC));
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText("TestingCRSReviewer"));
        MiscUtils.sleep(2000);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact("TestingCRSReviewer");
    }

    @When("the DOC Planning Contact fills out the {string} and {string} field")
    public void the_DOC_Planning_Contact_fills_out_the_and_field(String PleaseSpecify, String FiscalYear)
            throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.fillingOutRequiredFieldsByDOCPlaningContact("TestingCRSReviewer", PleaseSpecify, FiscalYear);
    }

    @When("returns the Collaboration to the Program Staff")
    public void returns_the_Collaboration_to_the_Program_Staff() {
        NERDApplicationStepsImplementation.returningOfSubmissionToProgramStaff("TestingCRSReviewer");
    }

    @Then("the {string} and {string} field values are not cleared and are required")
    public void the_and_field_values_are_not_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
            throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.openingNewTabToEditSubmission("TestingCRSReviewer");
        NERDApplicationStepsImplementation.verifyingThatFieldsOfSubmissionAreClearedAndRequired("TestingCRSReviewer", PleaseSpecify, FiscalYear);
        NERDApplicationStepsImplementation.deletingOfSubmission("TestingCRSReviewer");
    }

    @Then("the options available for the {string} field are {string}, {string}, {string}, and {string}")
    public void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange,
                                                            String Ended, String NotLedByNCI) throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.verifyingAvailableOptionsOfSubmission("TestingCRSReviewer", PleaseSpecify, Edited, NocChange, Ended, NotLedByNCI);
        NERDApplicationStepsImplementation.deletingOfSubmission("TestingCRSReviewer");
    }

    @Given("a Collaboration has been submitted to the DOC Planning Contact")
    public void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff("TestingUnderReviewText");
    }

    @Then("the submitted Collaboration shows as {string} in the Submissions page")
    public void the_submitted_Collaboration_shows_as_in_the_Submissions_page(String UnderReview)
            throws TestingException {
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview("TestingUnderReviewText", UnderReview);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact("TestingUnderReviewText");
    }

    @Given("a published Collaboration has been returned to the Program Staff with the article version number as {string}")
    public void a_published_Collaboration_has_been_returned_to_the_Program_Staff_with_the_article_version_number_as(String versionNumber) throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff(CommonUtils.email);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(CommonUtils.email);
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(CommonUtils.email);
        NERDApplicationStepsImplementation.returningOfSubmission(CommonUtils.email);
        NERDApplicationStepsImplementation.verifyingArticleVersionNumber(versionNumber);
        NERD_NCI_DOC_PlanningContactStepsImplementation.editingAndReturningSubmissionToProgramStaff(CommonUtils.email);
    }

    @When("the Program Staff resubmits the article to the DOC Planning Contact")
    public void the_Program_Staff_resubmits_the_article_to_the_DOC_Planning_Contact() throws TestingException {
        NERD_NCI_StaffMemberStepsImplementation.submittingOfApplicationToDocPlaningContact(CommonUtils.email);
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer(CommonUtils.email);
    }

    @Then("the article is incremented one major version number as {string}")
    public void the_article_is_incremented_one_major_version_number_as(String versionNumber) throws TestingException {
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer(CommonUtils.email);
        NERDApplicationStepsImplementation.verifyingIncrementedArticleVersionNumber(versionNumber);
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact(CommonUtils.email);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact(CommonUtils.email);
    }

    @Given("a published Collaboration is returned to the DOC Planning Contact")
    public void a_published_Collaboration_is_returned_to_the_DOC_Planning_Contact() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff("CollaborationAutomationTest");
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("CollaborationAutomationTest");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("CollaborationAutomationTest");
        NERDApplicationStepsImplementation.returningOfSubmission("CollaborationAutomationTest");
    }

    @Given("the DOC Planning Contact resubmits the submission")
    public void the_DOC_Planning_Contact_resubmits_the_submission() throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.resubmittingOfSubmissionByDOCContactToCRSREviewer("CollaborationAutomationTest");
    }

    @When("the CRS Reviewer returns the submission once more")
    public void the_CRS_Reviewer_returns_the_submission_once_more() throws TestingException {
        NERD_NCI_CRSReviewerStepsImplementation.returningOfSubmissionByCRSReviewer("CollaborationAutomationTest");
    }

    @Then("a notification is sent to the DOC Planning Contact")
    public void a_notification_is_sent_to_the_DOC_Planning_Contact() throws TestingException {
        JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText("CollaborationAutomationTest"));
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        NERD_NCI_DOC_PlanningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact("CollaborationAutomationTest");
    }

    @Given("a DOC Planning Contact creates a Collaboration submission")
    public void a_DOC_Planning_Contact_creates_a_Collaboration_submission() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, "DOCPlanContactCreateCollabarationTest");
    }

    @Then("they are able to return the submission to a Program Staff in the same DOC")
    public void they_are_able_to_return_the_submission_to_a_Program_Staff_in_the_same_DOC() throws TestingException {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC("DOCPlanContactCreateCollabarationTest");
        NERD_NCI_StaffMemberStepsImplementation.deletingOfSubmissionByProgramStaff("DOCPlanContactCreateCollabarationTest");
    }

    @Given("a Collaboration has been returned to a Program Staff")
    public void a_Collaboration_has_been_returned_to_a_Program_Staff() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff("TestCollaborationReturnToStaff");
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact("TestCollaborationReturnToStaff");
    }

    @Then("the Collaboration shows as {string} in the Submission page")
    public void the_Collaboration_shows_as_in_the_Submission_page(String ReturnedToStaffMember) throws TestingException {
        NERDApplicationStepsImplementation.verifyingReturnedToStaffMemberStatus("TestCollaborationReturnToStaff", ReturnedToStaffMember);
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff("TestCollaborationReturnToStaff");
    }

    @Given("a published Collaboration started by a Program Staff has been returned to the DOC Planning Contact")
    public void a_published_Collaboration_started_by_a_Program_Staff_has_been_returned_to_the_DOC_Planning_Contact() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_StaffMemberStepsImplementation.creatingOfSubmissionByProgramStaff("TestingAuthorSubmission");
        NERD_NCI_DOC_PlanningContactStepsImplementation.submittingOfSubmissionToCRSReviewer("TestingAuthorSubmission");
        NERD_NCI_CRSReviewerStepsImplementation.publishingOfSubmissionByCRSReviewer("TestingAuthorSubmission");
        NERDApplicationStepsImplementation.returningOfSubmissionToDOCPlaningContact("TestingAuthorSubmission");
    }

    @Given("the DOC Planning Contact returns the Collaboration to the Program Staff")
    public void the_DOC_Planning_Contact_returns_the_Collaboration_to_the_Program_Staff() throws TestingException {
        NERD_NCI_DOC_PlanningContactStepsImplementation.returningSubmissionToProgramStaffByDOCContact("TestingAuthorSubmission");
    }

    @Then("the author will show as the Program Staff user who originally created the Submission")
    public void the_author_will_show_as_the_Program_Staff_user_who_originally_created_the_Submission() throws TestingException {
        NERDApplicationStepsImplementation.verifyingTheAuthorOfCreatedSubmission("TestingAuthorSubmission");
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff("TestingAuthorSubmission");
    }

    @Given("a DOC Planning Contact creates a Collaboration")
    public void a_DOC_Planning_Contact_creates_a_Collaboration() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        NERD_NCI_DOC_PlanningContactStepsImplementation.creatingOfCollaborationSubmissionByDOCPlaningContact(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink, "DOCPlanContactCreateCollabarationSubmission");
    }

    @Then("they are able to return the Collaboration to a Program Staff user")
    public void they_are_able_to_return_the_Collaboration_to_a_Program_Staff_user() throws TestingException {
        NERDApplicationStepsImplementation.returningOfSubmissionToTheProgramStaffInSameDOC("DOCPlanContactCreateCollabarationSubmission");
        NERDApplicationStepsImplementation.deleteCreatedSubmissionByProgramStaff("DOCPlanContactCreateCollabarationSubmission");
    }

}
