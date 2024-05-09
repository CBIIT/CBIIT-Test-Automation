package ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOWOBF.playwright.StepImpl.OBF_Notifications_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OBF_Notifications_Steps {

    @Given("I am an authenticated user with NCI credentials")
    public void i_am_an_authenticated_user_with_nci_credentials() {
        OBF_Notifications_StepImpl.i_am_an_authenticated_user_with_nci_credentials();
    }

    @When("I submit a ticket For New Request for Access and the ticket is approved")
    public void i_submit_a_ticket_for_new_request_for_access_and_the_ticket_is_approved() {
        OBF_Notifications_StepImpl.i_submit_a_ticket_for_and_the_ticket_is_approved();
    }

    @Then("the requested for should get a notification:")
    public void the_requested_for_should_get_a_notification(String docString) {
        OBF_Notifications_StepImpl.the_requested_for_should_get_a_notification(docString);
    }
}