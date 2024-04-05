package ServiceNow.PlatformBusinessApps.NERD.selenium.Steps;

import ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation.NERD_NCI_StaffMemberStepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NERD_NCI_StaffMembers_Steps {
    @Given("an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base")
    public void an_nci_staff_member_not_on_the_nerd_table_is_on_the_nerd_crs_knowledge_base() {
        NERD_NCI_StaffMemberStepsImplementation.an_nci_staff_member_not_on_the_nerd_table_is_on_the_nerd_crs_knowledge_base();
    }

    @When("they view Top Accomplishments submission category")
    public void they_view_top_accomplishments_submission_category() {

    }
}
