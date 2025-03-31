package PLATFORM_BUSINESS.SEER.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import PLATFORM_BUSINESS.SEER.stepsImplementation.SEER_Research_Plus_Approval_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SEER_Research_Plus_Approval_Steps extends PageInitializer {

    @Given("a user is approved for SEER Research Plus data")
    public void a_user_is_approved_for_seer_research_plus_data() {
        SEER_Research_Plus_Approval_StepImpl.a_user_is_approved_for_seer_research_plus_data();
    }

    @When("they receive the approval email notification")
    public void they_receive_the_approval_email_notification() {
        SEER_Research_Plus_Approval_StepImpl.they_receive_the_approval_email_notification();
    }

    @Then("there is text at the bottom of the email notification that details how to access the NCCR Data Platform")
    public void there_is_text_at_the_bottom_of_the_email_notification_that_details_how_to_access_the_nccr_data_platform() {
    }

    @Then("the body of the email is as follows:")
    public void the_body_of_the_email_is_as_follows(String docString) {
    }
}