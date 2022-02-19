package ServiceNow.NERD.Steps;

import ServiceNow.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.NERD.StepsImplementation.NERD_NCI_DOCPlaningContactStepsImplementation;
import com.nci.automation.web.JavascriptUtils;
import org.junit.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NERDCollaborationSubmissionSteps extends PageInitializer {
    public static String title = "Title" + CommonUtils.getDateAsString();

    @Given("user is on the COVID19 Activities submissions page")
    public void user_is_on_the_COVID19_Activities_submissions_page() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.covid19CreateNewSubmissionButton);
    }

    @Then("the section {string} displays")
    public void the_section_displays(String thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan) {
        NERDApplicationStepsImplementation.sectionOfCovid_19_SubmissionIsDisplayed(thisActivityAlignsWithTheFollowingNIHCovid19StrategicPlan);
    }


    @Then("the following check box options are also displayed {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_check_box_options_are_also_displayed(String covid19, String communications, String rare, String bigDataDataSharing, String researchResourcesAndInfrastructure, String sexGenderDifferences, String partnerships,
                                                                   String technologyDevelopment, String trainingWorkforceDevelopment, String workforce, String metastatic, String meetingWorkshopConference, String minorityHealthHealtDisparities, String pediatric, String reportGuidancePolicy) {

        NERDApplicationStepsImplementation.checkBoxOptionsAreDisplayed(covid19, communications, rare, bigDataDataSharing, researchResourcesAndInfrastructure, sexGenderDifferences, partnerships,
                technologyDevelopment, trainingWorkforceDevelopment, workforce, metastatic, meetingWorkshopConference, minorityHealthHealtDisparities, pediatric, reportGuidancePolicy);

    }

    @Given("a Program Staff member is on the CRS Knowledge Management System {string} page")
    public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page(String submissionsPage) throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
        Assert.assertEquals(submissionsPage, nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink.getText());
        JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink);
    }

    @Given("creates a new submission for Collaboration category")
    public void creates_a_new_submission_for_Collaboration_category() {
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
    }

    @Then("the created Collaborations submission is displayed in the Collaborations category section with the status {string}")
    public void the_created_Collaborations_submission_is_display_in_the_Collaborations_category_section_with_the_status(String underReview) throws TestingException {
        NERDApplicationStepsImplementation.creatingOfNewSubmissionByStaffMember("AutomationTest");
        NERDApplicationStepsImplementation.verifyingSubmissionIsUnderReview("AutomationTest", underReview);
        NERD_NCI_DOCPlaningContactStepsImplementation.deleteCreatedSubmissionByDocPlanningContact("AutomationTest");
    }

}
