package ServiceNow.NERD.Steps;

import ServiceNow.NERD.Pages.NERDDOCCollaborationsPage;
import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_CRSReviewerStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_DOC_PlanningContactStepsImplementation;
import com.nci.automation.web.JavascriptUtils;
import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDCollaborationSubmissionSteps extends PageInitializer {
        public static String title = "Title" + CommonUtils.getDateAsString();

        @Given("user is on the COVID19 Activities submissions page")
        public void user_is_on_the_COVID19_Activities_submissions_page() throws TestingException {
                nativeViewLoginImpl.sideDoorAccountLogin();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                NERDApplicationStepsImplementation
                                .creatingNewSubmission(
                                                nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
        }

        @Then("the section {string} displays")
        public void the_section_displays(String thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan) {
                NERDApplicationStepsImplementation
                                .sectionOfCovid_19_SubmissionIsDisplayed(
                                                thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan);
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
        public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page(String submissionsPage)
                        throws TestingException {
                nativeViewLoginImpl.sideDoorAccountLogin();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                Assert.assertEquals(submissionsPage,
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink
                                                .getText());
                JavascriptUtils.drawBlueBorder(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
        }

        @Given("creates a new submission for Collaboration category")
        public void creates_a_new_submission_for_Collaboration_category() {
                NERDApplicationStepsImplementation.creatingNewSubmission(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
        }

        @Then("the created Collaborations submission is displayed in the Collaborations category section with the status {string}")
        public void the_created_Collaborations_submission_is_display_in_the_Collaborations_category_section_with_the_status(
                        String underReview) throws TestingException {
                NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("AutomationTest");
                NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview("AutomationTest", underReview);
                NERD_NCI_DOC_PlanningContactStepsImplementation
                                .deleteCreatedSubmissionByDocPlanningContact("AutomationTest");
        }

        @Given("a Regular User has submitted a Collaboration")
        public void a_Regular_User_has_submitted_a_Collaboration() throws TestingException {
                nativeViewLoginImpl.sideDoorAccountLogin();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                NERDApplicationStepsImplementation.creatingNewSubmission(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
                NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("Diego Test");
        }

        @When("the DOC Planning Contact locates the record {string} in their Collaboration queue")
        public void the_DOC_Planning_Contact_locates_the_record_in_their_Collaboration_queue(String nameOfRecord)
                        throws TestingException {
                nativeViewImpersonateUser.impersonateToDocPlanningContact();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
        }

        @When("clicks the Edit button for the record {string}")
        public void clicks_the_Edit_button_for_the_record(String nameOfRecord) {
                nerdDynamicXpaths.editButton(nameOfRecord).click();
        }

        @When("lands on the submission edit page for author {string}")
        public void lands_on_the_submission_edit_page_for_author(String author) {
                CommonUtils.switchToAnotherWindow();
                MiscUtils.sleep(3000);
                String actualText = NERDDOCCollaborationsPage.authorText(author).getText();
                CommonUtils.assertEquals(actualText, author);
        }

        @Then("the Rank field is not visible and {string} collaboration is deleted for Automation Testing")
        public void the_Rank_field_is_not_visible_and_collaboration_is_deleted_for_Automation_Testing(
                        String collaborationName) throws TestingException {
                NERD_NCI_DOC_PlanningContactStepsImplementation
                                .verifyingRankFieldIsNotDisplayedOnCollaborationForm(collaborationName);
        }

        @Given("a DOC Planning Contact clicks the Submit to CRS button for a Collaboration {string}")
        public void a_DOC_Planning_Contact_clicks_the_Submit_to_CRS_button_for_a_Collaboration(String nameOfRecord)
                        throws TestingException {

                nativeViewLoginImpl.sideDoorAccountLogin();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
                NERDApplicationStepsImplementation.creatingNewSubmission(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
                NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("Diego Test");
                nativeViewImpersonateUser.impersonateToDocPlanningContact();
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));

                NERDApplicationStepsImplementation.clickingOnCollaborationsLink();
                MiscUtils.sleep(1000);
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(nameOfRecord));
                nerdDynamicXpaths.submitToCRSButton(nameOfRecord).click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.confirmPopUpWindowYESbutton.click();
                CommonUtils.waitForVisibility(
                                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton);
                nerdCrsKnowledgeDatabaseSubmissionsPage.submissionSuccessfullyPopUpOkButton.click();
        }

        @When("the CRS Reviewer locates the record {string} in the Submissions page")
        public void the_CRS_Reviewer_locates_the_record_in_the_Submissions_page(String collaborationName)
                        throws TestingException {
                NERD_NCI_CRSReviewerStepsImplementation.crsReviewerIsOnSubmissionsPage(collaborationName);
                CommonUtils.waitForVisibility(nerdDynamicXpaths.publishedCollaboration(collaborationName));
                JavascriptUtils.scrollIntoView(nerdDynamicXpaths.publishedCollaboration(collaborationName));
        }

        @Then("the Rank field is not visible and {string} collaboration is deleted")
        public void the_Rank_field_is_not_visible_and_collaboration_is_deleted(String collaborationName) {
                NERD_NCI_CRSReviewerStepsImplementation
                                .verifyingRankFieldIsNotDisplayedAndDeletingSubmission(collaborationName);
        }
}