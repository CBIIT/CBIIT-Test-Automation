package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERDataRejectionStepImpl;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SEERDataRejectionSteps extends PageInitializer {

    @Given("proceeds to register for research data with unique email address")
    public void proceeds_to_register_for_research_data_with_unique_email_address() {
        SEERDataRejectionStepImpl.proceedsToRegisterForResearchDataWithUniqueEmailAddress();
    }

    @When("a SEER ODS Admin navigates to {string}")
    public void a_SEER_ODS_Admin_navigates_to(String seerDataAccess) {
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTo(seerDataAccess);
    }

    @When("the admin change the status to {string}")
    public void the_admin_change_the_status_to(String seerAccessRequestStatus) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
