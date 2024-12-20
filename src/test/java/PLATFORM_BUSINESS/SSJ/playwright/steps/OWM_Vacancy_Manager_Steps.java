package PLATFORM_BUSINESS.SSJ.playwright.steps;

import Hooks.Hooks;
import PLATFORM_BUSINESS.SSJ.playwright.pages.Mandatory_Statements_Page;
import PLATFORM_BUSINESS.SSJ.playwright.stepsImplementation.OWM_Vacancy_Manager_StepsImpl;
import APPS_COMMON.Pages.Playwright_Common_Locators;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OWM_Vacancy_Manager_Steps {

    @When("User navigates to tab {string} - PW")
    public void user_navigates_to_tab_pw(String dashboardText) {
        OWM_Vacancy_Manager_StepsImpl.user_navigates_to_tab_pw(dashboardText);
    }

    @When("User clicks button {string} - PW")
    public void user_clicks_button_pw(String buttonText) {
        OWM_Vacancy_Manager_StepsImpl.user_clicks_button_pw(buttonText);
    }

    @Then("User can see warning message {string}")
    public void user_can_see_warning_message(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_can_see_warning_message(text);
    }

    @Then("User fills in {string} field with title {string}")
    public void user_fills_in_field_with_title(String text, String textInput) {
        OWM_Vacancy_Manager_StepsImpl.user_fills_in_field_with_title(text, textInput);
    }

    @Then("User fills in {string} field with description {string}")
    public void user_fills_in_field_with_description(String text, String textInput) {
        OWM_Vacancy_Manager_StepsImpl.user_fills_in_field_with_description(text, textInput);
    }

    @Then("User checks {string} option")
    public void user_checks_option(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_checks_option(text);
    }

    @Then("User verifies Close Date entry box appears")
    public void user_verifies_close_date_entry_box_appears() {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_close_date_entry_box_appears();
    }

    @Then("User verifies {string} and {string} options are displayed for Vacancy Point of Contact Information dropdown")
    public void user_verifies_and_options_are_displayed_for_vacancy_point_of_contact_information_dropdown(String yesText, String noText) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_and_options_are_displayed_for_vacancy_point_of_contact_information_dropdown(yesText, noText);
    }

    @Then("User {string} confirms being a POC for this vacancy after selecting Yes for being the point of contact for this vacancy")
    public void user_confirms_being_a_poc_for_this_vacancy_after_selecting_yes_for_being_the_point_of_contact_for_this_vacancy(String poc) {
        OWM_Vacancy_Manager_StepsImpl.user_confirms_being_a_poc_for_this_vacancy_after_selecting_yes_for_being_the_point_of_contact_for_this_vacancy(poc);
    }

    @Then("User sets an {string} entry as today's date")
    public void user_sets_an_entry_as_today_s_date(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_sets_an_entry_as_today_s_date(text);
    }

    @Then("User sets a {string} entry a month from the Open Date")
    public void user_sets_a_entry_a_month_from_the_open_date(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_sets_a_entry_a_month_from_the_open_date(text);
    }

    @Then("User sets {string} entry")
    public void user_sets_entry(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_sets_entry(text);
    }

    @Then("User verifies {string} application document is checked as optional by default")
    public void user_verifies_application_document_is_checked_as_optional_by_default(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_application_document_is_checked_as_optional_by_default(text);
    }

    @Then("{string} button is displayed for Application Documents section")
    public void button_is_displayed_for_application_documents_section(String text) {
        OWM_Vacancy_Manager_StepsImpl.button_is_displayed_for_application_documents_section(text);
    }

    @Then("User can add another application document {string} by clicking on {string}")
    public void user_can_add_another_application_document_by_clicking_on(String document, String text) {
        OWM_Vacancy_Manager_StepsImpl.user_can_add_another_application_document_by_clicking_on(document, text);
    }

    @Then("User verifies Full Contact Details for References is set to {string} by default")
    public void user_verifies_full_contact_details_for_references_is_set_to_by_default(String expectedValue) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_full_contact_details_for_references_is_set_to_by_default(expectedValue);
    }

    @Then("User verifies Full Contact Details for References slider has {int} \\(Zero - fifteen) options")
    public void user_verifies_full_contact_details_for_references_slider_has_zero_fifteen_options(int expectedValue) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_full_contact_details_for_references_slider_has_zero_fifteen_options(expectedValue);
    }

    @Then("User verifies that Number of Scoring Categories slider is set to {string} by default")
    public void user_verifies_that_number_of_scoring_categories_slider_is_set_to_by_default(String expectedValue) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_that_number_of_scoring_categories_slider_is_set_to_by_default(expectedValue);
    }

    @Then("User verifies Number of Scoring Categories slider has {int} \\(One - six) options")
    public void user_verifies_number_of_scoring_categories_slider_has_zero_six_options(int expectedValue) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_number_of_scoring_categories_slider_has_zero_six_options(expectedValue);
    }

    @Then("User verifies that all positions are present via Position Classification dropdown")
    public void user_verifies_that_all_positions_are_present_via_position_classification_dropdown() {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_that_all_positions_are_present_via_position_classification_dropdown();
    }

    @Then("User confirms that {string} checkbox is displayed")
    public void user_confirms_that_checkbox_is_displayed(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_confirms_that_checkbox_is_displayed(text);
    }

    @Then("User verifies the text of {string} i tooltip is")
    public void user_verifies_the_text_of_i_tooltip_is(String text, String docString) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_text_of_i_tooltip_is(text, docString);
    }

    @Then("user selects Position Classification and Organizational Code options")
    public void user_selects_position_classification_and_organizational_code_options() {
        OWM_Vacancy_Manager_StepsImpl.user_selects_position_classification_and_organizational_code_options();
    }

    @Then("user verifies that POC {string} is displayed by default for Personnel Action Tracking Solution \\(PATS) Initiator drop down")
    public void user_verifies_that_poc_is_displayed_by_default_for_personnel_action_tracking_solution_pats_initiator_drop_down(String poc) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_that_poc_is_displayed_by_default_for_personnel_action_tracking_solution_pats_initiator_drop_down(poc);
    }

    @Then("User clicks {string} button to save the Basic Vacancy Information")
    public void user_clicks_button_to_save_the_basic_vacancy_information(String buttonText) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(buttonText)).click();
    }

    @Then("User confirms that User is on {string} section")
    public void user_confirms_that_user_is_on_section(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_confirms_that_user_is_on_section(text);
    }

    @When("User verifies that {string} section title is displayed")
    public void user_verifies_that_section_title_is_displayed(String text) {
        assertThat(page.locator(Mandatory_Statements_Page.mandatoryStatementsHeaderTitle)).containsText(text);
    }

    @When("User verifies {string} text displayed for Mandatory Statements section")
    public void user_verifies_text_displayed_for_mandatory_statements_section(String expectedText) {
        assertThat(page.locator(Mandatory_Statements_Page.whatMandatoryJobStatementsWouldYouLikeQuestion)).containsText(expectedText);
    }

    @When("User confirms that {string} statement is disabled by default")
    public void user_confirms_that_statement_is_disabled_by_default(String text) {
        OWM_Vacancy_Manager_StepsImpl.user_confirms_that_statement_is_disabled_by_default(text);
    }

    @When("User verifies the text of {string} is displayed as")
    public void user_verifies_the_text_of_is_displayed_as(String text, String docString) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_text_of_is_displayed_as(text, docString);
    }

    @When("User verifies the text {string} is displayed and description text is")
    public void user_verifies_the_text_is_displayed_and_description_text_is(String text, String docString) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_text_is_displayed_and_description_text_is(text, docString);
    }

    @When("User verifies the text of Foreign Education {string} is displayed as")
    public void user_verifies_the_text_of_foreign_education_is_displayed_as(String text, String docString) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_text_of_foreign_education_is_displayed_as(text, docString);
    }

    @When("User verifies the text of Reasonable Accommodation {string} is displayed as")
    public void user_verifies_the_text_of_reasonable_accommodation_is_displayed_as(String text, String docString) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_text_of_reasonable_accommodation_is_displayed_as(text, docString);
    }

    @When("User can disable statement options for {string}, {string}, {string}")
    public void user_can_disable_statement_options_for(String standardsOfConductText, String foreignEducationText, String reasonableAccommodationText) {
        OWM_Vacancy_Manager_StepsImpl.user_can_disable_statement_options_for(standardsOfConductText, foreignEducationText, reasonableAccommodationText);
    }

    @When("can enable statement options for {string}, {string}, {string}")
    public void can_enable_statement_options_for(String standardsOfConductText, String foreignEducationText, String reasonableAccommodationText) {
        OWM_Vacancy_Manager_StepsImpl.can_enable_statement_options_for(standardsOfConductText, foreignEducationText, reasonableAccommodationText);
    }

    @When("User clicks on {string} option on the left bar menu")
    public void user_clicks_on_option_on_the_left_bar_menu(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
    }

    @When("User verifies {string} text is displayed for Vacancy Committee section")
    public void user_verifies_text_is_displayed_for_section(String expectedAddAndManageVacancyCommitteeText) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_text_is_displayed_for_section(expectedAddAndManageVacancyCommitteeText);
    }

    @When("User verifies the following Vacancy Committee column headers are displayed {string}, {string}, {string}")
    public void user_verifies_the_following_vacancy_committee_column_headers_are_displayed(String expectedCommitteeMemberText, String expectedRoleText, String expectedActionsText) {
        OWM_Vacancy_Manager_StepsImpl.user_verifies_the_following_vacancy_committee_column_headers_are_displayed(expectedCommitteeMemberText, expectedRoleText, expectedActionsText);
    }

    @When("User confirms {string} button is displayed")
    public void user_confirms_button_is_displayed(String expectedText) {
        OWM_Vacancy_Manager_StepsImpl.user_confirms_button_is_displayed(expectedText);
    }

    @Then("User can see Chair {string} role option is displayed by default for Role drop down")
    public void user_can_see_chair_role_option_is_displayed_by_default_for_role_drop_down(String expectedText) {
        OWM_Vacancy_Manager_StepsImpl.user_can_see_chair_role_option_is_displayed_by_default_for_role_drop_down(expectedText);
    }

    @When("User clicks {string} for Actions")
    public void user_clicks_for_actions(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
    }

    @When("the user adds a Committee Member {string} for Chair role")
    public void the_user_adds_a_committee_member_for_chair_role(String committeeMember) {
        OWM_Vacancy_Manager_StepsImpl.the_user_adds_a_committee_member_for_chair_role(committeeMember);
    }

    @Then("User can see {string} alert")
    public void user_can_see_alert(String expectedAlertMessage) {
        OWM_Vacancy_Manager_StepsImpl.user_can_see_alert(expectedAlertMessage);
    }

    @Then("User adds Committee Member {string} for {string}")
    public void user_adds_committee_member_for(String committeeMember, String roleMember) {
       OWM_Vacancy_Manager_StepsImpl.user_adds_committee_member_for(committeeMember, roleMember);
    }

    @Then("User is directed to {string} section")
    public void user_is_directed_to_section(String expectedText) {
        OWM_Vacancy_Manager_StepsImpl.user_is_directed_to_section(expectedText);
    }

    @Then("User adds Committee Member {string} for {string} - PW")
    public void user_adds_committee_member_for_pw(String committeeMember, String roleMember) {
        OWM_Vacancy_Manager_StepsImpl.user_adds_committee_member_for_pw(committeeMember, roleMember);
    }

    @Then("User adds Committee Member {string} for Executive Secretary")
    public void user_adds_committee_member_for_executive_secretary(String committeeMember) {
        OWM_Vacancy_Manager_StepsImpl.user_adds_committee_member_for_executive_secretary(committeeMember);
    }

    @When("User adds duplicate Committee Member {string} for Executive Secretary")
    public void user_adds_duplicate_committee_member_for_executive_secretary(String committeeMember) {
        OWM_Vacancy_Manager_StepsImpl.user_adds_duplicate_committee_member_for_executive_secretary(committeeMember);
    }

    @Given("Impersonate Holly, or any Vacancy Manager")
    public void impersonate_holly_or_any_vacancy_manager() {
        OWM_Vacancy_Manager_StepsImpl.impersonate_holly_or_any_vacancy_manager();
    }

    @Then("verifies Vacancy Title {string} is on the Your Vacancies page")
    public void verifies_vacancy_title_is_on_the_your_vacancies_page(String vacancyTitle) {
        OWM_Vacancy_Manager_StepsImpl.verifies_vacancy_title_is_on_the_your_vacancies_page(vacancyTitle);
    }

    @When("User clicks on the {string} tab")
    public void user_clicks_on_the_tab(String text) {
        page.locator(Playwright_Common_Locators.vacancyType(text)).click();
    }

    @Then("User can see the filters {string},{string},{string}")
    public void user_can_see_the_filters(String all, String live, String extended) {
        Hooks.softAssert.assertEquals(page.locator(Playwright_Common_Locators.dynamicTextLocator(all)).innerText(), all);
        Hooks.softAssert.assertEquals(page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(live)).innerText(), live);
        Hooks.softAssert.assertEquals(page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(extended)).innerText(), extended);
    }

    @Then("User can verify All is by default selected")
    public void user_can_verify_all_is_by_default_selected() {
        page.locator("(//span[@class='ant-radio-button ant-radio-button-checked'])[2]").isVisible();
        ElementHandle button = page.waitForSelector("xpath=(//span[@class='ant-radio-button ant-radio-button-checked'])[2]");
        String classNames = button.getAttribute("class");
        assert classNames.contains("ant-radio-button-checked");
    }

    @Then("User can verify that All subfilter displays vacancies in the open state")
    public void user_can_verify_that_all_subfilter_displays_vacancies_in_the_open_state() {
        page.locator("(//span[@class='ant-table-column-title'][normalize-space()='Open Date'])[2]").click();
    }

    @Then("User can verify that vacancies with subfilter All are by default sorted by number of applicants in ascending order")
    public void user_can_verify_that_vacancies_with_subfilter_all_are_by_default_sorted_by_number_of_applicants_in_ascending_order() {
    }

    @Then("User can verify that Live subfilter displays vacancies in the open state")
    public void user_can_verify_that_live_subfilter_displays_vacancies_in_the_open_state() {
    }

    @Then("User can verify that vacancies with subfilter Live are by default sorted by number of applicants in ascending order")
    public void user_can_verify_that_vacancies_with_subfilter_live_are_by_default_sorted_by_number_of_applicants_in_ascending_order() {
    }

    @Then("User can verify the table columns are displayed as {string},{string},{string},{string},{string}")
    public void user_can_verify_the_table_columns_are_displayed_as(String string, String string2, String string3, String string4, String string5) {
    }
}