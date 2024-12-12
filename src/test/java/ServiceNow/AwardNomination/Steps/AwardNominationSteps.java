package ServiceNow.AwardNomination.Steps;

import com.nci.automation.web.CommonUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
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
        awardNominationStepsImplementation.navigateToVIBE();
    }

    @Given("Submitter User is on VIBE Peer-to-Peer Appreciation Program home page")
    public void submitter_user_is_on_vibe_peer_to_peer_appreciation_program_home_page() {
        awardNominationStepsImplementation.verifyVIBEPageTitle();
    }

    @Given("Submitter User can verify that What is your name field is already populated")
    public void submitter_user_can_verify_that_what_is_your_name_field_is_already_populated() {
        awardNominationStepsImplementation.verifyWhatIsYourNameFieldNotNull();
    }

    @Given("Submitter User chooses Yes for Would you like your appreciation to be anonymous question")
    public void submitter_user_chooses_yes_for_would_you_like_your_appreciation_to_be_anonymous_question() {
        awardNominationStepsImplementation.chooseYesAnonymousAppreciation();
    }

    @Given("Submitter User picks {string} as a colleague to appreciate")
    public void submitter_user_picks_as_a_colleague_to_appreciate(String person){
        awardNominationStepsImplementation.enterColleagueToAppreciation(person);
    }

    @Given("Submitter User describes their appreciation as {string}")
    public void submitter_user_describes_their_appreciation_as(String text) {
        awardNominationStepsImplementation.enterShareAppreciation(text);
    }

    @Given("Submitter User can verify Optional Responses section is displayed")
    public void submitter_user_can_verify_optional_responses_section_is_displayed() {
        awardNominationStepsImplementation.verifySectionOptionalResponsesDisplayed();
    }

    @Given("Submitter User can verify Which value best reflects your appreciation section is displayed")
    public void submitter_user_can_verify_which_value_best_reflects_your_appreciation_section_is_displayed() {
        awardNominationStepsImplementation.verifySectionAppreciationValueDisplayed();
    }

    @Given("Submitter User can verify that Add Attachment option is displayed")
    public void submitter_user_can_verify_that_add_attachment_option_is_displayed() {
        awardNominationStepsImplementation.verifySectionAddAttachmentDisplayed();
    }

    @When("Submitter User submits VIBE Peer-to-Peer Appreciation Program request")
    public void submitter_user_submits_vibe_peer_to_peer_appreciation_program_request() {
        awardNominationStepsImplementation.clickSubmitButton();
    }

    @Then("Submitter User can verify they are redirected to general tickets view page")
    public void submitter_user_can_verify_they_are_redirected_to_general_tickets_view_page() {
        awardNominationStepsImplementation.verifySectionTicketsDisplayed();
    }

    /**
     * verify User is in Tickets tab
     */
    @Given("User navigates to Tickets tab")
    public void user_navigates_to_tickets_tab() {
        softAssert.assertTrue(awardNominationPage.sectionTickets.isDisplayed());
    }

    /**
     * User navigates to last VIBE ticket
     */
    @Given("User opens the last VIBE Peer-to-Peer Appreciation Program request submitted")
    public void user_opens_the_last_vibe_peer_to_peer_appreciation_program_request_submitted() {
        CommonUtils.clickOnElement(awardNominationPage.lastSubmittedVIBETicket);
    }

    @Given("User can confirm that the ticket's status is {string}")
    public void user_can_confirm_that_the_ticket_s_status_is(String statusWorkInProgress) {
        awardNominationStepsImplementation.verifyLastTicketsStatus(statusWorkInProgress);
    }

    @Given("User can verify that Approval status is {string}")
    public void user_can_verify_that_approval_status_is(String approvalStatusPageView) {
       awardNominationStepsImplementation.verifyApprovalStatus(approvalStatusPageView);
    }

    @Given("User can confirm Cancel button is displayed")
    public void user_can_confirm_cancel_button_is_displayed() {
       awardNominationStepsImplementation.verifyCancelButtonDisplayed();
    }

    @Given("User can confirm Add Watchers button is displayed")
    public void user_can_confirm_add_watchers_button_is_displayed() {
        awardNominationStepsImplementation.verifyAddWatchersButtonDisplayed();
    }

    @Given("User can confirm Add Attachment button is displayed")
    public void user_can_confirm_add_attachment_button_is_displayed() {
        awardNominationStepsImplementation.verifyAddAttachmentButtonDisplayed();
    }

    /**
     * User clicks Cancel button
     */
    @When("User clicks Cancel button")
    public void user_clicks_cancel_button() {
        CommonUtils.clickOnElement(awardNominationPage.cancelButton);
    }

    /**
     * verify Cancel confirmation modal is displayed
     */
    @Then("User can see Cancel confirmation modal")
    public void user_can_see_cancel_confirmation_modal() {
      softAssert.assertTrue(awardNominationPage.modalCancelMyTicket.isDisplayed());
    }

    /**
     * verify clicks Add Watchers button
     */
    @When("User clicks Add Watchers button")
    public void user_clicks_add_watchers_button() {
        CommonUtils.clickOnElement(awardNominationPage.addWatchersButton);
    }

    @When("User adds {string} as a watcher")
    public void user_adds_as_a_watcher(String watcher) {
        awardNominationStepsImplementation.addWatcher(watcher);
    }

    @Then("User can see that Watch List ticket field is populated with {string} name")
    public void user_can_see_that_watch_list_ticket_field_is_populated_with_name(String watcher) {
        awardNominationStepsImplementation.verifyWatcherAdded(watcher);
    }

    @When("User adds attachment")
    public void user_adds_attachment() {
        awardNominationStepsImplementation.uploadFile();
    }

    /**
     * verify attachment is added
     */
    @Then("User can verify that attachment is added")
    public void user_can_verify_that_attachment_is_added() {
      softAssert.assertTrue(awardNominationPage.attachmentAdded.isDisplayed());
    }
}



