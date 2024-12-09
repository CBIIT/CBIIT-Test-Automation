package ServiceNow.PlatformBusinessApps.NERD.selenium.Steps;

import ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation.NERD_NCI_StaffMemberStepsImplementation;
import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERD_NCI_StaffMembers_Steps {

    @Given("an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base")
    public void an_nci_staff_member_not_on_the_nerd_table_is_on_the_nerd_crs_knowledge_base() {
        NERD_NCI_StaffMemberStepsImplementation.an_nci_staff_member_not_on_the_nerd_table_is_on_the_nerd_crs_knowledge_base();
    }

    @When("NCI Staff Member submits new Top Accomplishments submission")
    public void nci_staff_member_submits_new_top_accomplishments_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_submits_new_top_accomplishments_submission();
    }

    @When("DOC Planning Contact {string} returning the Top Accomplishments submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member(String docPlanningContact) {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member(docPlanningContact, TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
    }

    @When("NCI Staff Member views Top Accomplishments submission category")
    public void nci_staff_member_views_top_accomplishments_submission_category() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_top_accomplishments_submission_category();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for Top Accomplishments submission returned record")
    public void nci_staff_member_does_not_see_the_button_for_top_accomplishments_submission_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_top_accomplishments_submission_returned_record(delete);
    }

    @When("NCI Staff Member submits new Other Accomplishments submission")
    public void nci_staff_member_submits_new_other_accomplishments_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_submits_new_other_accomplishments_submission();
    }

    @When("DOC Planning Contact {string} returning the Other Accomplishments submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_other_accomplishments_submission_back_to_nci_staff_member(String docPlanningContact) {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_other_accomplishments_submission_back_to_nci_staff_member(docPlanningContact, Other_Accomplishments_Submissions_Constants.OTHER_ACCOMPLISHMENTS_SUBMISSION_NAME);
    }

    @When("NCI Staff Member views the returned Other Accomplishments submission")
    public void nci_staff_member_views_the_returned_other_accomplishments_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_the_returned_other_accomplishments_submission();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for Other Accomplishments submission returned record")
    public void nci_staff_member_does_not_see_the_button_for_other_accomplishments_submission_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_other_accomplishments_submission_returned_record(delete);
    }

    @When("NCI Staff Member submits new Collaborations submission")
    public void nci_staff_member_submits_new_collaborations_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_submits_new_collaborations_submission();
    }

    @When("DOC Planning Contact {string} returning the Collaborations submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_collaborations_submission_back_to_nci_staff_member(String docPlanningContact) {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_collaborations_submission_back_to_nci_staff_member(docPlanningContact, NCI_Staff_Members_Constants.CRS_COLLABORATION_NEW_SUBMISSION_TITLE_TEXT_BOX);
    }

    @When("NCI Staff Member views the returned Collaborations submission")
    public void nci_staff_member_views_the_returned_collaborations_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_the_returned_collaborations_submission();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for Collaborations submission returned record")
    public void nci_staff_member_does_not_see_the_button_for_collaborations_submission_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_collaborations_submission_returned_record(delete);
    }

    @When("NCI Staff Member submits new COVID19 Activities submission")
    public void nci_staff_member_submits_new_covid19_activities_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_submits_new_covid19_activities_submission();
    }

    @When("DOC Planning Contact {string} returning the COVID19 Activities submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_covid19_activities_submission_back_to_nci_staff_member(String docPlanningContact) {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_covid19_activities_submission_back_to_nci_staff_member(docPlanningContact, Covid19ActivitiesSubmissions_Constants.COVID_19_NEW_SUBMISSION_TITLE_TEXT_BOX);

    }

    @When("NCI Staff Member views the returned COVID19 Activities submission")
    public void nci_staff_member_views_the_returned_covid19_activities_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_the_returned_covid19_activities_submission();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for COVID19 Activities submission returned record")
    public void nci_staff_member_does_not_see_the_button_for_covid19_activities_submission_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_covid19_activities_submission_returned_record(delete);
    }

    @When("NCI Staff Member submits new Ad Hoc Data Call submission")
    public void nci_staff_member_submits_new_ad_hoc_data_call_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_submits_new_ad_hoc_data_call_submission();
    }

    @When("DOC Planning Contact {string} returning the Ad Hoc Data Call submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_ad_hoc_data_call_submission_back_to_nci_staff_member(String docPlanningContact) {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_ad_hoc_data_call_submission_back_to_nci_staff_member(docPlanningContact, ReturningSubmissions_Constants.AD_HOC_DATA_CALL_NEW_SUBMISSION_TITLE_TEXT_BOX);
    }

    @When("NCI Staff Member views the returned Ad Hoc Data Call submission")
    public void nci_staff_member_views_the_returned_ad_hoc_data_call_submission() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_the_returned_ad_hoc_data_call_submission();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for Ad Hoc Data Call submission returned record")
    public void nci_staff_member_does_not_see_the_button_for_ad_hoc_data_call_submission_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_ad_hoc_data_call_submission_returned_record(delete);
    }
}