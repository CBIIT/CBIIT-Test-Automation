package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.*;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.ApplicantProfileStepsImpl;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.Reset_Account_StepsImpl;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.ElementHandle;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

import static com.nci.automation.web.PlaywrightUtils.page;

public class ApplicantProfileSteps {

    @Given("User is on SSJ Landing page and user is {string} - PW")
    public void user_is_on_ssj_landing_page_and_user_is_pw(String user) {
        ApplicantProfileStepsImpl.user_is_on_ssj_landing_page_and_user_is_pw(user);
    }

    @Given("User is on Profile tab - PW")
    public void user_is_on_profile_tab_pw() {
        page.locator(Profile_Tab_Page.profileTab).click();
    }

    @Given("User inputs {string} into first name field - PW")
    public void user_inputs_into_first_name_field_pw(String firstName) {
        ApplicantProfileStepsImpl.user_inputs_into_first_name_field_pw(firstName);
    }

    @Given("User inputs {string} into middle name field - PW")
    public void user_inputs_into_middle_name_field_pw(String middleName) {
        ApplicantProfileStepsImpl.user_inputs_into_middle_name_field_pw(middleName);
    }

    @Given("User inputs {string} into last name field - PW")
    public void user_inputs_into_last_name_field_pw(String lastName) {
        ApplicantProfileStepsImpl.user_inputs_into_last_name_field_pw(lastName);
    }

    @Given("User inputs {string} into email field - PW")
    public void user_inputs_into_email_field_pw(String email) {
        ApplicantProfileStepsImpl.user_inputs_into_email_field_pw(email);
    }

    @Given("User inputs {string} into phone field - PW")
    public void user_inputs_into_phone_field_pw(String phoneNumber) {
        ApplicantProfileStepsImpl.user_inputs_into_phone_field_pw(phoneNumber);
    }

    @Given("User inputs {string} into business phone field - PW")
    public void user_inputs_into_business_phone_field_pw(String businessPhone) {
        ApplicantProfileStepsImpl.user_inputs_into_business_phone_field_pw(businessPhone);
    }

    @Given("selects highest education {string}")
    public void selects_highest_education(String highestDegree) {
        ApplicantProfileStepsImpl.selects_highest_education(highestDegree);
    }

    @Given("User confirms being a US Citizen - PW")
    public void user_confirms_being_a_us_citizen_pw() {
        ApplicantProfileStepsImpl.user_confirms_being_a_us_citizen_pw();
    }

    @Given("User inputs {string} into address field - PW")
    public void user_inputs_into_address_field_pw(String address) {
        ApplicantProfileStepsImpl.user_inputs_into_address_field_pw(address);
    }

    @Given("User inputs {string} into appNumber field - PW")
    public void user_inputs_into_app_number_field_pw(String aptNumber) {
        ApplicantProfileStepsImpl.user_inputs_into_app_number_field_pw(aptNumber);
    }

    @Given("User inputs {string} into city field - PW")
    public void user_inputs_into_city_field_pw(String city) {
        ApplicantProfileStepsImpl.user_inputs_into_city_field_pw(city);
    }

    @Given("User inputs {string} into state field - PW")
    public void user_inputs_into_state_field_pw(String state) {
        ApplicantProfileStepsImpl.user_inputs_into_state_field_pw(state);
    }

    @Given("User inputs {string} into country field - PW")
    public void user_inputs_into_country_field_pw(String country) {
        ApplicantProfileStepsImpl.user_inputs_into_country_field_pw(country);
    }

    @Given("User inputs {string} into zip field - PW")
    public void user_inputs_into_zip_field_pw(String zipCode) {
        ApplicantProfileStepsImpl.user_inputs_into_zip_field_pw(zipCode);
    }

    @When("User clicks on Save Application button - PW")
    public void user_clicks_on_save_application_button_pw() {
        ApplicantProfileStepsImpl.user_clicks_on_save_application_button_pw();
    }

    @Then("user verifies that first name {string}, middle name {string}, and last name {string} saved display as expected")
    public void user_verifies_that_first_name_middle_name_and_last_name_saved_display_as_expected(String firstName, String middleName, String lastName) {
        ApplicantProfileStepsImpl.user_verifies_that_first_name_middle_name_and_last_name_saved_display_as_expected(firstName, middleName, lastName);
    }

    @Then("verifies that the saved address displays with {string}, {string}, {string}, {string}, {string}, {string}")
    public void verifies_that_the_saved_address_displays_with(String address, String aptNumber, String city, String state, String country, String zipCode) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_address_displays_with(address, aptNumber, city, state, country, zipCode);
    }

    @Then("verifies that the saved email address displays as {string}")
    public void verifies_that_the_saved_email_address_displays_as(String expectedEmail) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_email_address_displays_as(expectedEmail);
    }

    @Then("verifies that the saved phone number displays as {string}")
    public void verifies_that_the_saved_phone_number_displays_as(String expectedPhoneNumber) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_phone_number_displays_as(expectedPhoneNumber);
    }

    @Then("verifies that the saved business phone number displays as {string}")
    public void verifies_that_the_saved_business_phone_number_displays_as(String expectedBusinessPhoneNumber) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_business_phone_number_displays_as(expectedBusinessPhoneNumber);
    }

    @Then("verifies that the saved highest education displays as {string}")
    public void verifies_that_the_saved_highest_education_displays_as(String expectedHighestEducation) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_highest_education_displays_as(expectedHighestEducation);
    }

    @Then("verifies that the saved US Citizenship displays as {string}")
    public void verifies_that_the_saved_us_citizenship_displays_as(String expectedYesOrNo) {
        ApplicantProfileStepsImpl.verifies_that_the_saved_us_citizenship_displays_as(expectedYesOrNo);
    }

    @Then("tester navigates to native view to reset account with name {string} so that automated test can run again without manual intervention")
    public void tester_navigates_to_native_view_to_reset_account_with_name_so_that_automated_test_can_run_again_without_manual_intervention(String name) {
        Reset_Account_StepsImpl.tester_navigates_to_native_view_to_reset_account_with_name_so_that_automated_test_can_run_again_without_manual_intervention(name);
    }

    @Given("a test account {string} is reset before executing a test")
    public void a_test_account_is_reset_before_executing_a_test(String testAccountName) {
        Reset_Account_StepsImpl.a_test_account_is_reset_before_executing_a_test(testAccountName);
    }

    @When("User clicks Edit for Demographics section - PW")
    public void user_clicks_edit_for_demographics_section_pw() {
        ApplicantProfileStepsImpl.user_clicks_edit_for_demographics_section();
    }

    @Then("User clicks Demographics section - PW")
    public void user_clicks_demographics_section_pw() {
        page.locator(Profile_Tab_Page.demographicsOptionalTab).click();
    }

    @When("User chooses to share demographic details - PW")
    public void user_chooses_to_share_demographic_details_pw() {
        ApplicantProfileStepsImpl.user_chooses_to_share_demographic_details();
    }

    @When("User edits sex choice - PW")
    public void user_edits_sex_choice_pw() {
        page.locator(Profile_Tab_Page.sexMaleOption).click();
    }

    @When("User edits ethnicity choice - PW")
    public void user_edits_ethnicity_choice_pw() {
        page.locator(Profile_Tab_Page.ethnicityChoiceHispanicLatino).click();
    }

    @When("User edits race choice - PW")
    public void user_edits_race_choice_pw() {
        page.locator(Profile_Tab_Page.raceOptionAmericanIndianAlaska).click();
    }

    @When("User edits disability choice - PW")
    public void user_edits_disability_choice_pw() {
        page.locator(Profile_Tab_Page.disabilityChoiceDeafSeriousDifficulty).click();
    }

    @When("User chooses not to share demographic details - PW")
    public void user_chooses_not_to_share_demographic_details_pw() {
        page.getByLabel(Profile_Tab_Page.shareNotDemographicsRadioButton).check();
    }

    @Then("User saves the updated section - PW")
    public void user_saves_the_updated_section_pw() {
        page.locator(Profile_Tab_Page.SaveDemographicsSection).click();
    }

    @When("clicks on Vacancy Title {string}")
    public void clicks_on_vacancy_title(String vacancyTitle) {
        ApplicantProfileStepsImpl.clicks_on_vacancy_title(vacancyTitle);
    }

    @When("clicks {string}")
    public void clicks(String text) {
        ApplicantProfileStepsImpl.clicks(text);
    }

    @When("proceeds with completing profile by clicking {string}")
    public void proceeds_with_completing_profile_by_clicking(String text) {
        ApplicantProfileStepsImpl.proceeds_with_completing_profile_by_clicking(text);
    }

    @Then("navigates to the {string} tab to be able to apply to a vacancy after creating a profile")
    public void navigates_to_the_tab_to_be_able_to_apply_to_a_vacancy_after_creating_a_profile(String text) {
        ApplicantProfileStepsImpl.navigates_to_the_tab_to_be_able_to_apply_to_a_vacancy_after_creating_a_profile(text);
    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String expectedApplicationText) {
        ApplicantProfileStepsImpl.user_is_on_the_page(expectedApplicationText);
    }

    @Then("uploads cover letter if cover letter option is displayed")
    public void uploads_cover_letter() {
        ApplicantProfileStepsImpl.uploads_cover_letter();
    }

    @Then("uploads qualification statement if qualification statement is displayed")
    public void uploads_qualification_statement() {
        ApplicantProfileStepsImpl.uploads_qualification_statement();
    }

    @Then("if reference one is required then user enters Reference One first name {string}")
    public void user_enters_reference_one_first_name(String firstNameText) {
        ApplicantProfileStepsImpl.user_enters_reference_one_first_name(firstNameText);
    }

    @Then("enters Reference One middle name {string}")
    public void enters_reference_one_middle_name(String middleNameText) {
        ApplicantProfileStepsImpl.enters_reference_one_middle_name(middleNameText);
    }

    @Then("enters Reference One last name {string}")
    public void enters_reference_one_last_name(String lastNameText) {
        ApplicantProfileStepsImpl.enters_reference_one_last_name(lastNameText);
    }

    @Then("enters Reference One email address {string}")
    public void enters_reference_one_email_address(String emailAddress) {
        ApplicantProfileStepsImpl.enters_reference_one_email_address(emailAddress);
    }

    @Then("enters Reference One phone number {string}")
    public void enters_reference_one_phone_number(String phoneNumber) {
        ApplicantProfileStepsImpl.enters_reference_one_phone_number(phoneNumber);
    }

    @Then("selects Reference One relationship as {string}")
    public void selects_reference_one_relationship_as(String relationship) {
        ApplicantProfileStepsImpl.selects_reference_one_relationship_as(relationship);
    }

    @Then("enters Reference One position title {string}")
    public void enters_reference_one_position_title(String positionTitle) {
        ApplicantProfileStepsImpl.enters_reference_one_position_title(positionTitle);
    }

    @Then("enters Reference One organization name {string}")
    public void enters_reference_one_organization_name(String organizationName) {
        ApplicantProfileStepsImpl.enters_reference_one_organization_name(organizationName);
    }

    @Then("user agrees to share demographic details and help improve the hiring process.")
    public void user_agrees_to_share_demographic_details_and_help_improve_the_hiring_process() {
        ApplicantProfileStepsImpl.user_agrees_to_share_demographic_details_and_help_improve_the_hiring_process();
    }

    @Then("selects {string} for Sex")
    public void selects_for_sex(String gender) {
        ApplicantProfileStepsImpl.selects_for_sex(gender);
    }

    @Then("selects {string} for Ethnicity")
    public void selects_for_ethnicity(String ethnicity) {
        ApplicantProfileStepsImpl.selects_for_ethnicity(ethnicity);
    }

    @Then("selects {string}, {string}, {string}, {string}, {string} for Race")
    public void selects_for_race(String americanIndianOrAlaska, String asia, String blackOrAfricanAmerican, String nativeHawaiianOrOther, String white) {
        ApplicantProfileStepsImpl.selects_for_race(americanIndianOrAlaska, asia, blackOrAfricanAmerican, nativeHawaiianOrOther, white);
    }


    @Then("selects {string} for Disability or Serious Health Condition")
    public void selects_for_disability_or_serious_health_condition(String text) {
        ApplicantProfileStepsImpl.selects_for_disability_or_serious_health_condition(text);
    }

    @Then("user verifies basic information {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void user_verifies_basic_information_and(String firstName, String middleName, String lastName, String email, String phone, String businessPhone, String highestEducation, String usCitizenship) {
        ApplicantProfileStepsImpl.user_verifies_basic_information_and(firstName, middleName, lastName, email, phone, businessPhone, highestEducation, usCitizenship);
    }

    @Then("user verifies address information {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_address_information(String address, String aptNumber, String city, String state, String zip) {
        ApplicantProfileStepsImpl.user_verifies_address_information(address, aptNumber, city, state, zip);
    }

    @Then("user verifies demographics information {string}, {string}, {string}, {string}, and {string}")
    public void user_verifies_demographics_information_and(String sharingDemographicsText, String sexText, String ethnicityText, String raceText, String disabilityText) {
        ApplicantProfileStepsImpl.user_verifies_demographics_information_and(sharingDemographicsText, sexText, ethnicityText, raceText, disabilityText);
    }

    @Then("user verifies references one information {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_references_information(String firstNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        ApplicantProfileStepsImpl.user_verifies_references_information(firstNameText, lastNameText, emailText, phoneNumberText, relationshipText, titleText, organizationText);
    }

    @Then("if reference two is required then user enters Reference Two first name {string}")
    public void if_reference_two_is_required_then_user_enters_reference_two_first_name(String firstName) {
        ApplicantProfileStepsImpl.if_reference_two_is_required_then_user_enters_reference_two_first_name(firstName);
    }

    @Then("enters Reference Two middle name {string}")
    public void enters_reference_two_middle_name(String middleName) {
        ApplicantProfileStepsImpl.enters_reference_two_middle_name(middleName);
    }

    @Then("enters Reference Two last name {string}")
    public void enters_reference_two_last_name(String lastName) {
        ApplicantProfileStepsImpl.enters_reference_two_last_name(lastName);
    }

    @Then("enters Reference Two email address {string}")
    public void enters_reference_two_email_address(String emailAddressText) {
        ApplicantProfileStepsImpl.enters_reference_two_email_address(emailAddressText);
    }

    @Then("enters Reference Two phone number {string}")
    public void enters_reference_two_phone_number(String phoneNumberText) {
        ApplicantProfileStepsImpl.enters_reference_two_phone_number(phoneNumberText);
    }

    @Then("selects Reference Two relationship as Co-worker")
    public void selects_reference_two_relationship_as_co_worker() {
        ApplicantProfileStepsImpl.selects_reference_two_relationship_as_co_worker();
    }

    @Then("enters Reference Two position title {string}")
    public void enters_reference_two_position_title(String titleText) {
        ApplicantProfileStepsImpl.enters_reference_two_position_title(titleText);
    }

    @Then("enters Reference Two organization name {string}")
    public void enters_reference_two_organization_name(String organizationTextBox) {
        ApplicantProfileStepsImpl.enters_reference_two_organization_name(organizationTextBox);
    }

    @Then("user verifies references two information {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_references_two_information(String firstNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        ApplicantProfileStepsImpl.user_verifies_references_two_information(firstNameText, lastNameText, emailText, phoneNumberText, relationshipText, titleText, organizationText);
    }

    @Then("if either a Cover Letter, Qualification Statement, Curriculum Vitae \\(CV), or Vision Statement \\(or all) were uploaded then documents are displayed in the Application Documents section")
    public void if_either_a_cover_letter_qualification_statement_curriculum_vitae_cv_or_vision_statement_or_all_were_uploaded_then_documents_are_displayed_in_the_application_documents_section() {
        ApplicantProfileStepsImpl.if_either_a_cover_letter_qualification_statement_curriculum_vitae_cv_or_vision_statement_or_all_were_uploaded_then_documents_are_displayed_in_the_application_documents_section();
    }

    @Then("uploads a Curriculum Vitae if Curriculum Vitae option is displayed")
    public void uploads_a_curriculum_vitae_if_curriculum_vitae_option_is_displayed() {
        ApplicantProfileStepsImpl.uploads_a_curriculum_vitae_if_curriculum_vitae_option_is_displayed();
    }

    @Then("uploads a Vision Statement if Vision Statement option is displayed")
    public void uploads_a_vision_statement_if_vision_statement_option_is_displayed() {
        ApplicantProfileStepsImpl.uploads_a_vision_statement_if_vision_statement_option_is_displayed();
    }

    @Then("verifies Your Applications tab is displayed")
    public void verifies_your_applications_tab_is_displayed() {
        ApplicantProfileStepsImpl.verifies_your_applications_tab_is_displayed();
    }

    @When("user navigates to Your Applications tab")
    public void user_navigates_to_your_applications_tab() {
        ApplicantProfileStepsImpl.user_navigates_to_your_applications_tab();
    }

    @When("clicks on {string} - PW")
    public void clicks_on_pw(String text) {
        ApplicantProfileStepsImpl.clicks_on_pw(text);
    }

    @When("enters Vacancy Title name {string} - PW")
    public void enters_vacancy_title_name_pw(String vacancyName) {
        ApplicantProfileStepsImpl.enters_vacancy_title_name_pw(vacancyName);
    }

    @When("enters Vacancy Description {string} - PW")
    public void enters_vacancy_description_pw(String vacancyDescription) {
        ApplicantProfileStepsImpl.enters_vacancy_description_pw(vacancyDescription);
    }

    @When("selects {string} for point of contact - PW")
    public void selects_for_point_of_contact_pw(String text) {
        ApplicantProfileStepsImpl.selects_for_point_of_contact_pw(text);
    }

    @When("unselects the option for cover letter")
    public void unselects_the_option_for_cover_letter() {
        ApplicantProfileStepsImpl.unselects_the_option_for_cover_letter();
    }

    @When("checks {string} check box")
    public void checks_check_box(String text) {
        ApplicantProfileStepsImpl.checks_check_box(text);
    }

    @When("selects a Reference Collection Date Ten days from today")
    public void selects_a_reference_collection_date_ten_days_from_today() {
        ApplicantProfileStepsImpl.selects_a_reference_collection_date_ten_days_from_today();
    }

    @When("selects {string} for Full Contact Details for References")
    public void selects_for_full_contact_details_for_references(String text) {
        ApplicantProfileStepsImpl.selects_for_full_contact_details_for_references(text);
    }

    @When("selects {string} for Position Classification drop down")
    public void selects_for_position_classification_drop_down(String text) {
        ApplicantProfileStepsImpl.selects_for_position_classification_drop_down(text);
    }

    @When("selects {string} for Organizational Code drop down")
    public void selects_for_organizational_code_drop_down(String option) {
        ApplicantProfileStepsImpl.selects_for_organizational_code_drop_down(option);
    }

    @When("clicks Save for Mandatory Statements")
    public void clicks_save_for_mandatory_statements() {
        ApplicantProfileStepsImpl.clicks_save_for_mandatory_statements();
    }

    @When("selects {string} for Committee Member with chair role")
    public void selects_for_committee_member_with_chair_role(String name) {
        ApplicantProfileStepsImpl.selects_for_committee_member_with_chair_role(name);
    }

    @When("selects {string} for Committee Member with Executive Secretary role")
    public void selects_for_committee_member_with_executive_secretary_role(String name) {
        ApplicantProfileStepsImpl.selects_for_committee_member_with_executive_secretary_role(name);
    }

    @When("clicks Save for Email Templates")
    public void clicks_save_for_email_templates() {
        ApplicantProfileStepsImpl.clicks_save_for_email_templates();
    }

    @Then("user is able to see the Review and Finalize section with the vacancy information submitted")
    public void user_is_able_to_see_the_review_and_finalize_section_with_the_vacancy_information_submitted() {
        ApplicantProfileStepsImpl.user_is_able_to_see_the_review_and_finalize_section_with_the_vacancy_information_submitted();
    }

    @Then("verifies Vacancy Title {string}")
    public void verifies_vacancy_title(String vacancyTitle) {
        ApplicantProfileStepsImpl.verifies_vacancy_title(vacancyTitle);
    }

    @Then("verifies Utilize a Set Close Date is {string}")
    public void verifies_utilize_a_set_close_date_is(String text) {
        ApplicantProfileStepsImpl.verifies_utilize_a_set_close_date_is(text);
    }

    @Then("verifies Allow HR Specialist to Triage is {string}")
    public void verifies_allow_hr_specialist_to_triage_is(String text) {
        ApplicantProfileStepsImpl.verifies_allow_hr_specialist_to_triage_is(text);
    }

    @Then("verifies Vacancy Description {string}")
    public void verifies_vacancy_description(String text) {
        ApplicantProfileStepsImpl.verifies_vacancy_description(text);
    }

    @Then("verifies Vacancy Point of Contact Information is {string} with email address {string}")
    public void verifies_vacancy_point_of_contact_information_is_with_email_address(String fullNameText, String emailText) {
        ApplicantProfileStepsImpl.verifies_vacancy_point_of_contact_information_is_with_email_address(fullNameText, emailText);
    }

    @Then("verifies Open Date is todays date")
    public void verifies_open_date_is_todays_date() {
        ApplicantProfileStepsImpl.verifies_open_date_is_todays_date();
    }

    @Then("verifies Application Documents {string}, {string}, {string}, {string}")
    public void verifies_application_documents(String curriculumVitaeText, String coverLetterText, String visionStatementText, String qualificationStatementText) {
        ApplicantProfileStepsImpl.verifies_application_documents(curriculumVitaeText, coverLetterText, visionStatementText, qualificationStatementText);
    }

    @Then("verifies Reference Collection is {string}")
    public void verifies_reference_collection_is(String text) {
        ApplicantProfileStepsImpl.verifies_reference_collection_is(text);
    }

    @Then("verifies Collection Date is ten days from today")
    public void verifies_collection_date_is_ten_days_from_today() {
        ApplicantProfileStepsImpl.verifies_collection_date_is_ten_days_from_today();
    }

    @Then("verifies {string} reference recommendations are required for this vacancy")
    public void verifies_reference_recommendations_are_required_for_this_vacancy(String text) {
        ApplicantProfileStepsImpl.verifies_reference_recommendations_are_required_for_this_vacancy(text);
    }

    @Then("verifies {string} scoring categories are required for this vacancy")
    public void verifies_scoring_categories_are_required_for_this_vacancy(String text) {
        ApplicantProfileStepsImpl.verifies_scoring_categories_are_required_for_this_vacancy(text);
    }

    @Then("verifies Organizational Code is {string}")
    public void verifies_organizational_code_is(String text) {
        ApplicantProfileStepsImpl.verifies_organizational_code_is(text);
    }

    @Then("verifies Position Classification is {string}")
    public void verifies_position_classification_is(String text) {
        ApplicantProfileStepsImpl.verifies_position_classification_is(text);
    }

    @Then("verifies Personnel Action Tracking Solution \\(PATS) Initiator is {string}")
    public void verifies_personnel_action_tracking_solution_pats_initiator_is(String text) {
        ApplicantProfileStepsImpl.verifies_personnel_action_tracking_solution_pats_initiator_is(text);
    }

    @Then("verifies Mandatory Statements {string}, {string}, {string}, and {string} are displayed")
    public void verifies_mandatory_statements_and_are_displayed(String valueOne, String valueTwo, String valueThree, String valueFour) {
        ApplicantProfileStepsImpl.verifies_mandatory_statements_and_are_displayed(valueOne, valueTwo, valueThree, valueFour);
    }

    @Then("verifies Committee Member {string} is displayed with role {string}")
    public void verifies_committee_member_is_displayed_with_role(String name, String role) {
        ApplicantProfileStepsImpl.verifies_committee_member_is_displayed_with_role(name, role);
    }

    @Then("verifies Email Templates {string}, {string}, {string}, {string}, {string}")
    public void verifies_email_templates(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        ApplicantProfileStepsImpl.verifies_email_templates(valueOne, valueTwo, valueThree, valueFour, valueFive);
    }

    @Given("a test vacancy {string} is reset before creating a vacancy")
    public void a_test_vacancy_is_reset_before_creating_a_vacancy(String text) {
        ApplicantProfileStepsImpl.a_test_vacancy_is_reset_before_creating_a_vacancy(text);
    }

    @Given("OWM Vacancy Manager logs out")
    public void owm_vacancy_manager_logs_out() {
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
    }

    @When("user verifies {string} page title is displayed")
    public void user_verifies_page_title_is_displayed(String text) {
        ApplicantProfileStepsImpl.user_verifies_page_title_is_displayed(text);
    }

    @Then("user verifies the following columns are displayed on Your Applications page {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_the_following_columns_are_displayed_on_your_applications_page(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        ApplicantProfileStepsImpl.user_verifies_the_following_columns_are_displayed_on_your_applications_page(valueOne, valueTwo, valueThree, valueFour, valueFive);
    }

    @Given("a user who has not applied to a Vacancy before is on the SSJ home page")
    public void a_user_who_has_not_applied_to_a_vacancy_before_is_on_the_ssj_home_page() {
        ApplicantProfileStepsImpl.a_user_who_has_not_applied_to_a_vacancy_before_is_on_the_ssj_home_page();
    }

    @Then("Your Applications tab should NOT be displayed")
    public void your_applications_tab_should_not_be_displayed() {
        ApplicantProfileStepsImpl.your_applications_tab_should_not_be_displayed();
    }

    @When("verifies Vacancy Title is {string}")
    public void verifies_vacancy_title_is(String expectedVacancyTitle) {
        ApplicantProfileStepsImpl.verifies_vacancy_title_is(expectedVacancyTitle);
    }

    @When("verifies text {string} with the date in which the Vacancy was created")
    public void verifies_text_with_the_date_in_which_the_vacancy_was_created(String expectedVacancyDate) {
        ApplicantProfileStepsImpl.verifies_text_with_the_date_in_which_the_vacancy_was_created(expectedVacancyDate);
    }

    @When("verifies text Open Until Filled {string}")
    public void verifies_text_open_until_filled(String expectedOpenUntilFilledText) {
        ApplicantProfileStepsImpl.verifies_text_open_until_filled(expectedOpenUntilFilledText);
    }

    @When("verifies point of contact text {string} with POC {string}")
    public void verifies_point_of_contact_text_with_poc(String expectedPointOfContactText, String expectedPOCText) {
        ApplicantProfileStepsImpl.verifies_point_of_contact_text_with_poc(expectedPointOfContactText, expectedPOCText);
    }

    @When("verifies Vacancy Description text {string}")
    public void verifies_vacancy_description_text(String expectedText) {
        ApplicantProfileStepsImpl.verifies_vacancy_description_text(expectedText);
    }

    @Given("the test application {string} is deleted to re-run automated tests")
    public void the_test_application_is_also_deleted_to_re_run_automated_tests(String userName) {
        ApplicantProfileStepsImpl.the_test_application_is_also_deleted_to_re_run_automated_tests(userName);
    }

    @When("verifies Application Documents text {string}")
    public void verifies_application_documents_text(String expectedText) {
        ApplicantProfileStepsImpl.verifies_application_documents_text(expectedText);
    }

    @When("verifies required documents with required references needed to apply to this test Vacancy")
    public void verifies_required_documents_with_required_references_needed_to_apply_to_this_test_vacancy() {
        ApplicantProfileStepsImpl.verifies_required_documents_with_required_references_needed_to_apply_to_this_test_vacancy();
    }

    @Given("an unauthenticated applicant is on the SSJ homepage {string}")
    public void an_unauthenticated_applicant_is_on_the_ssj_homepage(String ssjHomePage) {
        ApplicantProfileStepsImpl.an_unauthenticated_applicant_is_on_the_ssj_homepage(ssjHomePage);
    }

    @Given("verifies that the drop drown text is {string}")
    public void verifies_that_the_drop_drown_text_is(String expectedDropDownText) {
        ApplicantProfileStepsImpl.verifies_that_the_drop_drown_text_is(expectedDropDownText);
    }

    @Given("clicks on the first vacancy")
    public void clicks_on_the_first_vacancy() {
        ApplicantProfileStepsImpl.clicks_on_the_first_vacancy();
    }

    @Given("verifies that Sign In and Apply button text is {string}")
    public void verifies_that_sign_in_and_apply_button_text_is(String expectedSignInButtonText) {
        ApplicantProfileStepsImpl.verifies_that_sign_in_and_apply_button_text_is(expectedSignInButtonText);
    }

    @Given("verifies that the pop up header text is {string}")
    public void verifies_that_the_pop_up_header_text_is(String expectedModalHeaderText) {
        ApplicantProfileStepsImpl.verifies_that_the_pop_up_header_text_is(expectedModalHeaderText);
    }

    @Given("verifies that the pop up body text is")
    public void verifies_that_the_pop_up_body_text_is(String expectedModalBodyText) {
        ApplicantProfileStepsImpl.verifies_that_the_pop_up_body_text_is(expectedModalBodyText);
    }

    @Given("verifies that the text on the buttons is {string} {string} {string}")
    public void verifies_that_the_button_text_is(String expectedCreatedAnAccountText, String expectedLogInText, String expectedGoBackText) {
        ApplicantProfileStepsImpl.verifies_that_the_button_text_is(expectedCreatedAnAccountText, expectedLogInText, expectedGoBackText);
    }

    @Given("clicks {string} and is redirected to the Okta Login Portal")
    public void clicks_and_is_redirected_to_the_login_portal(String logInButton) {
        ApplicantProfileStepsImpl.clicks_and_is_redirected_to_the_login_portal(logInButton);
    }

    @Given("verifies that the PIV CAC card button text is {string}")
    public void verifies_that_the_piv_cac_card_button_text_is(String pivCacCardButtonText) {
        ApplicantProfileStepsImpl.verifies_that_the_piv_cac_card_button_text_is(pivCacCardButtonText);
    }

    @Then("User sees there is no question that reads {string}")
    public void user_sees_there_is_no_question_that_reads(String expectedQuestionText) {
        ApplicantProfileStepsImpl.user_sees_there_is_no_question_that_reads(expectedQuestionText);
    }

    @Then("User sees there is a statement that reads {string} at the top of the screen")
    public void user_sees_there_is_a_statement_that_reads_at_the_top_of_the_screen(String expectedStatementText) {
        ApplicantProfileStepsImpl.user_sees_there_is_a_statement_that_reads_at_the_top_of_the_screen(expectedStatementText);
    }

    @When("User clicks on Save Application button")
    public void user_clicks_on_save_application_button() {
        ApplicantProfileStepsImpl.user_clicks_on_save_application_button();
    }

    @When("verifies that successful save alert is displayed {string}")
    public void verifies_that_successful_save_alert_is_displayed(String expectedSuccessfulText) {
        ApplicantProfileStepsImpl.verifies_that_successful_save_alert_is_displayed(expectedSuccessfulText);
    }

    @Then("verifies that the application became a draft {string}")
    public void verifies_that_the_application_became_a_draft(String expectedDraftText) {
        ApplicantProfileStepsImpl.verifies_that_the_application_became_a_draft(expectedDraftText);
    }

    @Then("clicks the application {string}")
    public void clicks_the_application(String vacancyTitle) {
        ApplicantProfileStepsImpl.clicks_the_application(vacancyTitle);
    }

    @Then("clicks Edit vacancy {string}")
    public void clicks_edit_vacancy(String applicationName) {
        ApplicantProfileStepsImpl.clicks_edit_vacancy(applicationName);
    }

    @Then("verifies that Reference One {string}, {string}, {string}, {string}, {string}, {string}, {string} is updated")
    public void verifies_that_reference_one_is_updated(String expectedUpdatedReferenceOneFirstName, String expectedUpdatedReferenceOneMiddleName, String expectedUpdatedReferenceOneLastName, String expectedUpdatedReferenceOneEmail, String expectedUpdatedReferenceOnePhoneNumber, String expectedUpdatedReferenceOnePositionTitle, String expectedUpdatedReferenceOneOrganizationName) {
        ApplicantProfileStepsImpl.verifies_that_reference_one_is_updated(expectedUpdatedReferenceOneFirstName, expectedUpdatedReferenceOneMiddleName, expectedUpdatedReferenceOneLastName, expectedUpdatedReferenceOneEmail, expectedUpdatedReferenceOnePhoneNumber, expectedUpdatedReferenceOnePositionTitle, expectedUpdatedReferenceOneOrganizationName);
    }

    @Then("verifies tha Reference Two {string}, {string}, {string}, {string}, {string}, {string}, {string} is updated")
    public void verifies_tha_reference_two_is_updated(String expectedUpdatedReferenceTwoFirstName, String expectedUpdatedReferenceTwoMiddleName, String expectedUpdatedReferenceTwoLastName, String expectedUpdatedReferenceTwoEmail, String expectedUpdatedReferenceTwoPhoneNumber, String expectedUpdatedReferenceTwoPositionTitle, String expectedUpdatedReferenceTwoOrganizationName) {
        ApplicantProfileStepsImpl.verifies_tha_reference_two_is_updated(expectedUpdatedReferenceTwoFirstName, expectedUpdatedReferenceTwoMiddleName, expectedUpdatedReferenceTwoLastName, expectedUpdatedReferenceTwoEmail, expectedUpdatedReferenceTwoPhoneNumber, expectedUpdatedReferenceTwoPositionTitle, expectedUpdatedReferenceTwoOrganizationName);
    }

    @Then("clicks on Remove button")
    public void clicks_on_remove_button() {
        ApplicantProfileStepsImpl.clicks_on_remove_button();
    }

    @Then("{string} that the draft was removed")
    public void that_the_draft_was_removed(String confirm) {
        ApplicantProfileStepsImpl.that_the_draft_was_removed(confirm);
    }

    @Then("verifies that the draft is no longer showing under Your Application tab")
    public void verifies_that_the_draft_is_no_longer_showing_under_your_application_tab() {
        ApplicantProfileStepsImpl.verifies_that_the_draft_is_no_longer_showing_under_your_application_tab();
    }

    @Then("user withdraws the application")
    public void user_withdraws_the_application() {
        ApplicantProfileStepsImpl.user_withdraws_the_application();
    }

    @Then("{string} withdrawing the application")
    public void withdrawing_the_application(String withdraw) {
        ApplicantProfileStepsImpl.withdrawing_the_application(withdraw);
    }

    @Then("verifies that the application status is {string}")
    public void verifies_that_the_application_status_is(String withdrawnText) {
        ApplicantProfileStepsImpl.verifies_that_the_application_status_is(withdrawnText);
    }

    @When("selects {string} for Number of Scoring Categories")
    public void selects_for_number_of_scoring_categories(String scoringNumber) {
        ApplicantProfileStepsImpl.selects_for_number_of_scoring_categories(scoringNumber);
    }
}
