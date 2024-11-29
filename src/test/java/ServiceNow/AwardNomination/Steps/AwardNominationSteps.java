package ServiceNow.AwardNomination.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Hooks.Hooks.softAssert;

public class AwardNominationSteps extends PageInitializer {

    @Given("Submitter User logged in to VIBE Peer-to-Peer Appreciation Program application via Portal")
    public void submitter_user_logged_in_to_vibe_peer_to_peer_appreciation_program_application_via_portal() {
     awardNominationStepsImplementation.awardNominationSubmitterUserLogin();
    }

    @Given("User navigates to VIBE Peer-to-Peer Appreciation Program via Services menu")
    public void user_navigates_to_vibe_peer_to_peer_appreciation_program_via_services_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User is on VIBE Peer-to-Peer Appreciation Program home page")
    public void submitter_user_is_on_vibe_peer_to_peer_appreciation_program_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User can verify that What is your name field is already populated")
    public void submitter_user_can_verify_that_what_is_your_name_field_is_already_populated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User chooses Yes for Would you like your appreciation to be anonymous question")
    public void submitter_user_chooses_yes_for_would_you_like_your_appreciation_to_be_anonymous_question() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User picks {string} as a colleague to apprecaite")
    public void submitter_user_picks_as_a_colleague_to_apprecaite(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User describes their appreciation as {string}")
    public void submitter_user_describes_their_appreciation_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User can verify Optional Responses section is displayed")
    public void submitter_user_can_verify_optional_responses_section_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Submitter User can verify that Add Attachment option is displayed")
    public void submitter_user_can_verify_that_add_attachment_option_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Submitter User submits VIBE Peer-to-Peer Appreciation Program request")
    public void submitter_user_submits_vibe_peer_to_peer_appreciation_program_request() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Submitter User can verify they are redirected to general tickets view page")
    public void submitter_user_can_verify_they_are_redirected_to_general_tickets_view_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
