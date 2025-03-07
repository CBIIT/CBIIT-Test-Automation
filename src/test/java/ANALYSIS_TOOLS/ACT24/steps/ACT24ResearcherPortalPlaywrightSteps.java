package ANALYSIS_TOOLS.ACT24.steps;

import ANALYSIS_TOOLS.ACT24.pages.ACT24ResearcherPortalPlaywrightPage;
import ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ResearcherPlaywrightStepImpl;
import ANALYSIS_TOOLS.ACT24.utils.ACT24ResearcherPlaywright_Constants;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ResearcherPlaywrightStepImpl.studyName;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getAct24ResearcherUrl;

public class ACT24ResearcherPortalPlaywrightSteps {

    @Given("User navigates to ACT24 website")
    public void user_navigates_to_act24_website() {
        PlaywrightUtils.page.navigate(getAct24ResearcherUrl());
        CommonUtils.sleep(2000);
    }

    /**
     * Entering email and password to login
     *
     * @param email     The email to be entered.
     * @param password  The password to be entered.
     */
    @When("User enters {string} in email and {string} in password and clicks Login")
    public void user_enters_in_email_and_in_password_and_clicks_login(String email, String password) {
        ACT24ResearcherPlaywrightStepImpl.enterLoginDetails(email, password);
    }

    /**
     * Validating the title for the ACT24 homepage
     */
    @Then("Verify the title of the ACT24 website home page is {string}")
    public void verify_the_title_of_the_act24_website_home_page_is(String ResearcherPageTitle) {
        assertThat(PlaywrightUtils.page).hasTitle(ResearcherPageTitle);
    }

    /**
     * Clicking on logout button to check logout functionality
     */
    @Then("User logout from the ACT24 website")
    public void user_logout_from_the_act24_website() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.logoutLocator).click();
    }

    /**
     * Clicking every menu tabs
     */
    @Then("User clicks on the every menu tabs in the home page")
    public void user_clicks_on_the_every_menu_tabs_in_the_home_page() {
        ACT24ResearcherPlaywrightStepImpl.clickOnEveryMenuTabs();
    }

    /**
     * Clicking on instruction
     */
    @Then("User clicks on the instructions to expand details on it and then again click on it")
    public void user_clicks_on_the_instructions_to_expand_details_on_it_and_then_again_click_on_it() {
        ACT24ResearcherPlaywrightStepImpl.clickInstructions();
    }

    /**
     * Clicking on export button
     */
    @Then("User clicks on the export button under my studies menu tab")
    public void user_clicks_on_the_export_button_under_my_studies_menu_tab() {
        ACT24ResearcherPlaywrightStepImpl.clickExportButton();
    }

    /**
     * Selecting different entries on show entries dropdown
     *
     * @param entry1     The entry1 to be selected.
     * @param entry2     The entry2 to be selected.
     */
    @Then("User changes entries visibility to {string} and again to {string}")
    public void user_changes_entries_visibility_to_and_again_to(String entry1, String entry2) {
        ACT24ResearcherPlaywrightStepImpl.changesEntriesVisibility(entry1, entry2);
    }

    /**
     * Checking column is clickable and clicking on it
     */
    @Then("Verify columns are clickable in the table displayed")
    public void verify_columns_are_clickable_in_the_table_displayed() {
        ACT24ResearcherPlaywrightStepImpl.checkColumnClickable();
    }

    /**
     * Entering text in the search box
     */
    @Then("User enters text in the search box on the my studies page")
    public void user_enters_text_in_the_search_box_on_the_my_studies_page() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.searchBox).fill(studyName);
    }

    /**
     * Verifying the searched text in abbreviation column of the table data
     */
    @Then("Verify study abbreviation column contains searched text in the table data")
    public void verify_study_abbreviation_column_contains_searched_text_in_the_table_data() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(studyName)).first()).containsText(studyName);
    }

    /**
     * Clicking on th Create New Study button
     */
    @Then("User clicks on the create new study button on the researcher page")
    public void user_clicks_on_the_create_new_study_button_on_the_researcher_page() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.createNewStudy).click();
    }

    /**
     * Checking user is on the create new study page
     */
    @Given("User verifies that page is opened to create new studies")
    public void user_verifies_that_page_is_opened_to_create_new_studies() {
        ACT24ResearcherPlaywrightStepImpl.checkCreateStudyPageOpened();
    }

    /**
     * Entering all the mandatory details to create an study
     */
    @Then("User enters all the mandatory details for creating the new study")
    public void user_enters_all_the_mandatory_details_for_creating_the_new_study() {
        ACT24ResearcherPlaywrightStepImpl.enterMandatoryDetailsToCreateStudy();
    }

    /**
     * Clicking on the Submit button
     */
    @Then("User clicks on the submit button to create the study")
    public void user_clicks_on_the_submit_button_to_create_the_study() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.submitButtonLocator).click();
    }

    /**
     * Validating the text which is displayed on the creation of the study
     *
     * @param studyCreationText     The mentioned text to be verified.
     */
    @Then("Validate the text {string}")
    public void validate_the_text(String studyCreationText) {
        assertThat(PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.successAlertStudy)).containsText(studyCreationText);
    }

    /**
     * Searching the created study
     */
    @Given("User enters the created study text in the search box on the my studies page")
    public void user_enters_the_created_study_text_in_the_search_box_on_the_my_studies_page() {
        ACT24ResearcherPlaywrightStepImpl.searchCreatedStudy();
    }

    /**
     * Clicking on the Study Staff button
     */
    @Then("User clicks on the study staff button of the searched study")
    public void user_clicks_on_the_study_staff_button_of_the_searched_study() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.studyStaff).click();
    }

    /**
     * Validating that user is on the Study Staff manu tab
     */
    @Then("Validate user is on the study staff menu tab in the researcher website")
    public void validate_user_is_on_the_study_staff_menu_tab_in_the_researcher_website() {
        assertThat(PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.studyStaffMenuTab)).containsText("Study Staff");
    }

    /**
     * User clicks on the my account menu tab
     */
    @Given("User clicks on the my account menu tab in the act24 researcher website")
    public void user_clicks_on_the_my_account_menu_tab_in_the_act24_researcher_website() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.myAccount).click();
    }

    /**
     * Validating the displayed email in my account with the login email address
     *
     * @param emailInMyAccount     The mentioned email to be verified.
     */
    @Then("Validate the email field value matches with {string}")
    public void validate_the_email_field_value_matches_with(String emailInMyAccount) {
        ACT24ResearcherPlaywrightStepImpl.verifyEmailAddress(emailInMyAccount);
    }

    /**
     * Clicking on the edit study button of the created study
     */
    @Then("User clicks on the edit study button of the created study")
    public void user_clicks_on_the_edit_study_button_of_the_created_study() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.editStudy).click();
    }

    /**
     * Updating the details of the created study
     */
    @Then("User edits the entered details of the already created study")
    public void user_edits_the_entered_details_of_the_already_created_study() {
        ACT24ResearcherPlaywrightStepImpl.updateCreatedStudyDetails();
    }

    /**
     * Clicking on the save changes button to edit the study details
     */
    @Then("User clicks on the save changes button and details are getting edited")
    public void user_clicks_on_the_save_changes_button_and_details_are_getting_edited() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.submitCreatedStudy).click();
    }

    /**
     * Clicking on the analytics data for the created study
     */
    @Then("User clicks on the analytics data for the created study")
    public void user_clicks_on_the_analytics_data_for_the_created_study() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.analyticsData).click();
    }

    /**
     * Clicking on the clear button
     */
    @And("User clicks on the clear button")
    public void user_clicks_on_the_clear_button() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.clearButton).click();
    }

    /**
     * Selecting the created study from the dropdown
     */
    @Then("User selects the created study from the dropdown again")
    public void user_selects_the_created_study_from_the_dropdown_again() {
        ACT24ResearcherPlaywrightStepImpl.selectCreatedStudy();
    }

    /**
     * Clicking on the search button on the analytics data menu tab
     */
    @Then("User clicks on the search button on the analytics data menu tab")
    public void user_clicks_on_the_search_button_on_the_analytics_data_menu_tab() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.searchAnalyticsButton).click();
    }

    /**
     * Clicking accessibility link and validating it
     */
    @Then("User clicks on the accessibility link and verify it in ACT24 website")
    public void user_clicks_on_the_accessibility_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.accessibilityLink, ACT24ResearcherPlaywright_Constants.ACCESSIBILITY_PAGE_TITLE);
    }

    /**
     * Clicking disclaimer link and validating it
     */
    @Then("User clicks on the disclaimer link and verify it in ACT24 website")
    public void user_clicks_on_the_disclaimer_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.disclaimerLink, ACT24ResearcherPlaywright_Constants.DISCLAIMER_PAGE_TITLE);
    }

    /**
     * Clicking fios link and validating it
     */
    @Then("User clicks on the fios link and verify it in ACT24 website")
    public void user_clicks_on_the_fios_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.foiaLink, ACT24ResearcherPlaywright_Constants.FOIA_PAGE_TITLE);
    }

    /**
     * Clicking hhs vulnerability disclosure link and validating it
     */
    @Then("User clicks on the hhs vulnerability disclosure link and verify it in ACT24 website")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPage(ACT24ResearcherPortalPlaywrightPage.vulnerabilityDisclosure, ACT24ResearcherPlaywright_Constants.HHS_POLICY_PAGE_LINK);
    }

    /**
     * Clicking privacy and security link and validating it
     */
    @Then("User clicks on the privacy and security link and verify it in ACT24 website")
    public void user_clicks_on_the_privacy_and_security_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.privacyAndSecurity, ACT24ResearcherPlaywright_Constants.PRIVACY_PAGE_TITLE);
    }

    /**
     * Clicking hhs link and validating it
     */
    @Then("User clicks on the hhs link and verify it in ACT24 website")
    public void user_clicks_on_the_hhs_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPage(ACT24ResearcherPortalPlaywrightPage.hhsLink, ACT24ResearcherPlaywright_Constants.HHS_PAGE_LINK);
    }

    /**
     * Clicking nih link and validating it
     */
    @Then("User clicks on the nih link and verify it in ACT24 website")
    public void user_clicks_on_the_nih_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.nihLink, ACT24ResearcherPlaywright_Constants.NIH_PAGE_TITLE);
    }

    /**
     * Clicking nci link and validating it
     */
    @Then("User clicks on the nci link and verify it in ACT24 website")
    public void user_clicks_on_the_nci_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(ACT24ResearcherPortalPlaywrightPage.nciLink, ACT24ResearcherPlaywright_Constants.NCI_PAGE_TITLE);
    }

    /**
     * Clicking USA gov link and validating it
     */
    @Then("User clicks on the USA gov link and verify it in ACT24 website")
    public void user_clicks_on_the_usa_gov_link_and_verify_it_in_act24_website() {
        Playwright_Common_Utils.clickAndAssertNewPage(ACT24ResearcherPortalPlaywrightPage.USAGovLink, ACT24ResearcherPlaywright_Constants.USA_GOV_PAGE);
    }

    /**
     * Clicking on the track recalls for the created study
     */
    @Then("User clicks on the track recalls for the created study")
    public void user_clicks_on_the_track_recalls_for_the_created_study() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.trackRecalls).click();
    }

    /**
     * User adds login credentials and do login
     */
    @Given("User logins into the ACT24 website with valid credentials")
    public void user_logins_into_the_act24_website_with_valid_credentials() {
        ACT24ResearcherPlaywrightStepImpl.loginACT24Website();
    }

    /**
     * Creating a new study after entering all the mandatory details
     */
    @Then("User creates a new study")
    public void user_creates_a_new_study() {
        ACT24ResearcherPlaywrightStepImpl.createNewStudy();
    }

    /**
     * Navigating to the study staff menu tab and click on the clear button
     */
    @Then("User navigates to the study staff menu tab and click on the clear button")
    public void user_navigates_to_the_study_staff_menu_tab_and_click_on_the_clear_button() {
        ACT24ResearcherPlaywrightStepImpl.navigateStudyStaff();
    }

    /**
     * Selecting created study and then clicking on search button
     */
    @When("User selects the created study and clicks on the search button")
    public void user_selects_the_created_study_and_clicks_on_the_search_button() {
        ACT24ResearcherPlaywrightStepImpl.selectAndSearchCreatedStudyUnderStudyStaff();
    }

    /**
     * Checking if Add study staff button is visible or not
     */
    @Then("Validate Add Study Staff button is visible")
    public void validate_add_study_staff_button_is_visible() {
        ACT24ResearcherPlaywrightStepImpl.validateAddStudyStaffButton();
    }

    /**
     * Clicking on Add study staff and enters email in text box
     */
    @Then("User clicks on the Add Study Staff button and enters the user logged in email")
    public void user_clicks_on_the_add_study_staff_button_and_enters_the_user_logged_in_email() {
        ACT24ResearcherPlaywrightStepImpl.enterEmailOnAddStudyStaffClick();
    }

    /**
     * Validating text on click of the search button
     */
    @Then("Validate the text {string} on click of Search button")
    public void validate_the_text_on_click_of_search_button(String validateEmailText) {
        ACT24ResearcherPlaywrightStepImpl.validateSearchedText(validateEmailText);
    }

    /**
     * Clicking on the cancel button
     */
    @Then("user clicks on the Cancel button")
    public void user_clicks_on_the_cancel_button() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.cancelButtonLocator).click();
    }

    /**
     * Navigating to the participants account menu tab and click on the clear button
     */
    @Then("User navigates to the participants account menu tab and click on the clear button")
    public void user_navigates_to_the_participants_account_menu_tab_and_click_on_the_clear_button() {
        ACT24ResearcherPlaywrightStepImpl.navigateParticipantsAccount();
    }

    /**
     * Selecting the created study and clicking on the search button
     */
    @Then("User selects the created study and clicks on the search button under the participants account menu tab")
    public void user_selects_the_created_study_and_clicks_on_the_search_button_under_the_participants_account_menu_tab() {
        ACT24ResearcherPlaywrightStepImpl.searchCreatedStudyUnderParticipantAccount();
    }

    /**
     * User uploads required xlsx file
     */
    @Then("User uploads the required xlsx file")
    public void user_uploads_the_required_xlsx_file() {
        ACT24ResearcherPlaywrightStepImpl.uploadXLSXFile();
    }

    /**
     * Clicking on the load button
     */
    @When("User clicks on the load button")
    public void user_clicks_on_the_load_button() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.uploadLocator).click();
    }

    /**
     * Validating the specified entry text
     */
    @Then("Validate the entries which is not equal to {string}")
    public void validate_the_entries_which_is_not_equal_to(String entryText) {
        ACT24ResearcherPlaywrightStepImpl.validateEntries(entryText);
    }

    /**
     * Clicking on the delete button
     */
    @Then("user clicks on the delete button")
    public void user_clicks_on_the_delete_button() {
        ACT24ResearcherPlaywrightStepImpl.deleteEntry();
    }

    /**
     * Validating whether entry is deleted or not
     */
    @Then("Validate entry has been deleted from the selected study")
    public void validate_entry_has_been_deleted_from_the_selected_study() {
        ACT24ResearcherPlaywrightStepImpl.validateTextAfterDeleting();
    }

    /**
     * Clicking on the lock button
     */
    @When("User clicks on the lock button on a subject")
    public void user_clicks_on_the_lock_button_on_a_subject() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.lockButton).click();
    }

    /**
     * Validating the text once subject is locked
     *
     * @param validateLockedText     The validateLockedText to be verified.
     */
    @Then("Validate the text {string} once subject is locked")
    public void validate_the_text_once_subject_is_locked(String validateLockedText) {
        ACT24ResearcherPlaywrightStepImpl.validateTextOnceSubjectLocked(validateLockedText);
    }

    /**
     * Clicking again on lock button on a subject
     */
    @When("User again clicks on the lock button on a subject")
    public void user_again_clicks_on_the_lock_button_on_a_subject() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.newLockButton).click();
    }

    /**
     * Validating the text once subject is unlocked
     *
     * @param validateUnlockedText     The validateUnlockedText to be verified.
     */
    @Then("Validate the text {string} once subject is unlocked")
    public void validate_the_text_once_subject_is_unlocked(String validateUnlockedText) {
        ACT24ResearcherPlaywrightStepImpl.validateTextOnceSubjectUnLocked(validateUnlockedText);
    }

    /**
     * Navigating to track recalls menu tab and click on cleat button
     */
    @When("User navigates to the track recalls menu tab and click on the clear button")
    public void user_navigates_to_the_track_recalls_menu_tab_and_click_on_the_clear_button() {
        ACT24ResearcherPlaywrightStepImpl.navigateTrackRecallsTab();
    }

    /**
     * Selecting study in which study are already added
     */
    @Then("user selects the study in which subjects are already added and clicks on the search button")
    public void user_selects_the_study_in_which_subjects_are_already_added_and_clicks_on_the_search_button() {
        ACT24ResearcherPlaywrightStepImpl.selectStudyHavingSubjects();
    }

    /**
     * Validating the entry text under the track recall page
     *
     * @param entryText     The entryText to be verified.
     */
    @Then("Validate the entries which is equal to {string} under the track recall page")
    public void validate_the_entries_which_is_equal_to_under_the_track_recall_page(String entryText) {
        ACT24ResearcherPlaywrightStepImpl.validateEntriesInTrackRecall(entryText);
    }

    /**
     * Clicking on the search button on the track recalls menu tab
     */
    @Then("User clicks on the search button on the track recalls menu tab")
    public void user_clicks_on_the_search_button_on_the_track_recalls_menu_tab() {
        PlaywrightUtils.page.locator(ACT24ResearcherPortalPlaywrightPage.searchTrackRecalls).click();
    }
}