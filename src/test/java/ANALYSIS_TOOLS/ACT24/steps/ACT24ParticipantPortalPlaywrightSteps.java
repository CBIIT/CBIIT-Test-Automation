package ANALYSIS_TOOLS.ACT24.steps;

import ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ParticipantPlaywrightStepsImpl;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getAct24ParticipantUrl;

public class ACT24ParticipantPortalPlaywrightSteps {

    @Given("User navigates to Participant Portal of the ACT24 website")
    public void user_navigates_to_participant_portal_of_the_act24_website() {
        PlaywrightUtils.page.navigate(getAct24ParticipantUrl());
        CommonUtils.sleep(2000);
    }

    /**
     * Login with the valid credentials in the participant portal
     */
    @When("User logins with the valid credentials in the website")
    public void user_logins_with_the_valid_credentials_in_the_website() {
        ACT24ParticipantPlaywrightStepsImpl.loginWithCredentials();
    }

    /**
     * Validating the title for the participant portal of ACT24 website
     */
    @Then("Verify the title of the participant portal of the ACT24 website")
    public void verify_the_title_of_the_participant_portal_of_the_act24_website() {
        assertThat(PlaywrightUtils.page).hasTitle("ACT24");
    }

    /**
     * Navigating to participant url from researcher website and validating the title
     */
    @Then("User navigates to the participant url of the selected study in the new tab")
    public void user_navigates_to_the_participant_url_of_the_selected_study_in_the_new_tab() {
        ACT24ParticipantPlaywrightStepsImpl.navigateToNewTabAndOpenUrl();
    }

    /**
     * Navigating to participant url from researcher website and validating the title
     */
    @Then("User navigates to the participant url of the selected study in the new other tab")
    public void user_navigates_to_the_participant_url_of_the_selected_study_in_the_new_other_tab() {
        ACT24ParticipantPlaywrightStepsImpl.navigateToNewTabAndOpenUrl1();
    }

    /**
     * Clicking on the fourth tab
     */
    @Then("User clicks on fourth tab and then click on next")
    public void user_clicks_on_fourth_tab_and_then_click_on_next() {
        ACT24ParticipantPlaywrightStepsImpl.clickFourthTab();
    }

    /**
     * Creating a new study for submitting the recalls
     */
    @When("User creates a study and loads subjects by uploading required xlsx file under the participants account menu tab")
    public void user_creates_a_study_and_loads_subjects_by_uploading_required_xlsx_file_under_the_participants_account_menu_tab() {
        ACT24ParticipantPlaywrightStepsImpl.createStudyAndUploadTemplateFile();
    }

    /**
     * Searching the created study
     */
    @Then("User searches the created study in the participant account menu tab")
    public void user_searches_the_created_study_in_the_participant_account_menu_tab() {
        ACT24ParticipantPlaywrightStepsImpl.searchStudyThroughName();
    }

    /**
     * Opening the first recall in the new tab
     */
    @Then("User opens first recall in the new tab")
    public void user_opens_first_recall_in_the_new_tab() {
        ACT24ParticipantPlaywrightStepsImpl.openFirstRecall();
    }

    /**
     * Selecting all the activities
     */
    @Then("User selects all the activities over the period")
    public void user_selects_all_the_activities_over_the_period() {
        ACT24ParticipantPlaywrightStepsImpl.selectsAllActivities();
    }

    /**
     * Clicking on the next button
     */
    @Then("user clicks on the next button")
    public void user_clicks_on_the_next_button() {
        ACT24ParticipantPlaywrightStepsImpl.clickNextButton();
    }

    /**
     * Clicking on the submit recall now button
     */
    @Then("User clicks on the submit recall now button")
    public void user_clicks_on_the_submit_recall_now_button() {
        ACT24ParticipantPlaywrightStepsImpl.clickSubmitRecallButton();
    }

    /**
     * Verifying that recall is submitted
     */
    @Then("Validate that recall is submitted successfully")
    public void validate_that_recall_is_submitted_successfully() {
        ACT24ParticipantPlaywrightStepsImpl.validateSubmittedRecallText();
    }

    /**
     * Opening the second recall of the created study in new tab
     */
    @Then("User opens second recall in the new tab")
    public void user_opens_second_recall_in_the_new_tab() {
        ACT24ParticipantPlaywrightStepsImpl.openSecondRecall();
    }

    /**
     * Opening the third recall of the created study in new tab
     */
    @Then("User opens third recall in the new tab")
    public void user_opens_third_recall_in_the_new_tab() {
        ACT24ParticipantPlaywrightStepsImpl.openThirdRecall();
    }

    /**
     * Navigating to the activity page of the participant portal
     */
    @When("When User reaches the add activity page of the participant portal")
    public void when_user_reaches_the_add_activity_page_of_the_participant_portal() {
        ACT24ParticipantPlaywrightStepsImpl.navigatingActivityPage();
    }

    /**
     * Changing language from French to English
     */
    @Then("User changes the language from french to english on the portal")
    public void user_changes_the_language_from_french_to_english_on_the_portal() {
        ACT24ParticipantPlaywrightStepsImpl.changesLanguages();
    }

    /**
     * Clicking on help link and verifying it
     */
    @Then("User clicks on the help link and verify it in participant portal")
    public void user_clicks_on_the_help_link_and_verify_it_in_participant_portal() {
        ACT24ParticipantPlaywrightStepsImpl.clickOnHelpAndVerify();
    }

    /**
     * Clicking on logout button
     */
    @Then("User clicks on the logout button and then clicks on the OK")
    public void user_clicks_on_the_logout_button_and_then_clicks_on_the_ok() {
        ACT24ParticipantPlaywrightStepsImpl.clickLogout();
    }

    /**
     * Selecting newly created study and clicking on the search button
     */
    @Then("User selects the newly created study and searches under the participants account menu tab")
    public void user_selects_the_newly_created_study_and_searches_under_the_participants_account_menu_tab() {
        ACT24ParticipantPlaywrightStepsImpl.searchesNewlyCreatedStudy();
    }

    /**
     * Selecting Second Recall
     */
    @Then("User selects the second recall of same study")
    public void user_selects_the_second_recall_of_same_study() {
        ACT24ParticipantPlaywrightStepsImpl.getSecondRecallUrl();
    }

    /**
     * Selecting Third Recall
     */
    @Then("User selects the third recall of same study")
    public void user_selects_the_third_recall_of_same_study() {
        ACT24ParticipantPlaywrightStepsImpl.getThirdRecallUrl();
    }
}