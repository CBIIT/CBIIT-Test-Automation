package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Profile_Tab_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.ApplicantProfileStepsImpl;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.Reset_Account_StepsImpl;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicantProfileSteps {

    @Given("User is on SCSS Landing page and user is {string} - PW")
    public void user_is_on_scss_landing_page_and_user_is_pw(String user) {
        ApplicantProfileStepsImpl.ssjLogin(user);
    }

    @Given("User is on Profile tab - PW")
    public void user_is_on_profile_tab_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.profileTab).click();
    }

    @Given("User inputs {string} into first name field - PW")
    public void user_inputs_into_first_name_field_pw(String firstName) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.firstNameTextBox).fill(firstName);
    }

    @Given("User inputs {string} into middle name field - PW")
    public void user_inputs_into_middle_name_field_pw(String middleName) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.middleNameTextBox).fill(middleName);
    }

    @Given("User inputs {string} into last name field - PW")
    public void user_inputs_into_last_name_field_pw(String lastName) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.lastNameTextBox).fill(lastName);
    }

    @Given("User inputs {string} into email field - PW")
    public void user_inputs_into_email_field_pw(String email) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.emailTextBox).fill(email);
    }

    @Given("User inputs {string} into phone field - PW")
    public void user_inputs_into_phone_field_pw(String phoneNumber) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.phoneNumberTextBox).fill(phoneNumber);
    }

    @Given("User inputs {string} into business phone field - PW")
    public void user_inputs_into_business_phone_field_pw(String businessPhone) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.businessPhoneNumberTextBox).fill(businessPhone);
    }

    @Given("selects highest education {string}")
    public void selects_highest_education(String highestDegree) {
        ApplicantProfileStepsImpl.selects_highest_education(highestDegree);
    }

    @Given("User confirms being a US Citizen - PW")
    public void user_confirms_being_a_us_citizen_pw() {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.are_You_A_US_Citizen_Yes_Radio_Button).check();
    }

    @Given("User inputs {string} into address field - PW")
    public void user_inputs_into_address_field_pw(String address) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.addressTextBox).fill(address);
    }

    @Given("User inputs {string} into appNumber field - PW")
    public void user_inputs_into_app_number_field_pw(String aptNumber) {
        PlaywrightUtils.page.locator(Profile_Tab_Page.apartmentOrSuiteNumberTextBox).fill(aptNumber);
    }

    @Given("User inputs {string} into city field - PW")
    public void user_inputs_into_city_field_pw(String city) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.cityTextBox).fill(city);
    }

    @Given("User inputs {string} into state field - PW")
    public void user_inputs_into_state_field_pw(String state) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.stateTextBox).fill(state);
    }

    @Given("User inputs {string} into country field - PW")
    public void user_inputs_into_country_field_pw(String country) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.countryTextBox).fill(country);
        CucumberLogUtils.playwrightScreenshot();
    }

    @Given("User inputs {string} into zip field - PW")
    public void user_inputs_into_zip_field_pw(String zipCode) {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.zipCodeTextBox).fill(zipCode);
    }

    @When("User clicks on Save Application button - PW")
    public void user_clicks_on_save_application_button_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.saveButton).click();
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

    @When("User chooses to share demographic details - PW")
    public void user_chooses_to_share_demographic_details_pw() {
       ApplicantProfileStepsImpl.user_chooses_to_share_demographic_details();
    }

    @When("User edits sex choice - PW")
    public void user_edits_sex_choice_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.sexMaleOption).click();
    }

    @When("User edits ethnicity choice - PW")
    public void user_edits_ethnicity_choice_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.ethnicityChoiceHispanicLatino).click();
    }

    @When("User edits race choice - PW")
    public void user_edits_race_choice_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.raceOptionAmericanIndianAlaska).click();
    }

    @When("User edits disability choice - PW")
    public void user_edits_disability_choice_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.disabilityChoiceDeafSeriousDifficulty).click();
    }

    @When("User chooses not to share demographic details - PW")
    public void user_chooses_not_to_share_demographic_details_pw() {
        PlaywrightUtils.page.getByLabel(Profile_Tab_Page.shareNotDemographicsRadioButton).check();
    }

    @Then("User saves the updated section - PW")
    public void user_saves_the_updated_section_pw() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.SaveDemographicsSection).click();
    }
}