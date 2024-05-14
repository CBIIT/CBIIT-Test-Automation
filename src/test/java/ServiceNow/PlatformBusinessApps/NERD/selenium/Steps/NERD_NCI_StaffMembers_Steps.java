package ServiceNow.PlatformBusinessApps.NERD.selenium.Steps;

import ServiceNow.PlatformBusinessApps.NERD.selenium.Constants.TopAccomplishmentsSubmission_Constants;
import ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation.NERD_NCI_StaffMemberStepsImplementation;
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

    @When("DOC Planning Contact returning the Top Accomplishments submission back to NCI Staff Member")
    public void doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member() {
        NERD_NCI_StaffMemberStepsImplementation.doc_planning_contact_returning_the_top_accomplishments_submission_back_to_nci_staff_member(TopAccomplishmentsSubmission_Constants.TOP_ACCOMPLISHMENTS_SUBMISSION_NAME);
    }

    @When("NCI Staff Member views Top Accomplishments submission category")
    public void nci_staff_member_views_top_accomplishments_submission_category() {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_views_top_accomplishments_submission_category();
    }

    @Then("NCI Staff Member DOES NOT see the {string} button for returned record")
    public void nci_staff_member_does_not_see_the_button_for_returned_record(String delete) {
        NERD_NCI_StaffMemberStepsImplementation.nci_staff_member_does_not_see_the_button_for_returned_record(delete);
    }
}