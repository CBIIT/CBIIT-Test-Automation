package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;

public class ApplicantFlowSteps extends PageInitializer {
    
    @Given("User is on Profile tab")
    public void user_is_on_profile_tab() {
        CommonUtils.waitForVisibility(applicantFlowPage.tabProfile);
        CommonUtils.clickOnElement(applicantFlowPage.tabProfile);
    }

    @Given("User clicks Edit for {string} section")
    public void user_clicks_edit_for_section(String section) {
        applicantFlowStepsImplementation.clickEditButton(section);
    }

    @Given("User inputs {string} into first name field")
    public void user_inputs_into_first_name_field(String firstName) {
        applicantFlowStepsImplementation.enterFirstNameProfileTab(firstName);
    }

    @Given("User inputs {string} into middle name field")
    public void user_inputs_into_middle_name_field(String middleName) {
        applicantFlowStepsImplementation.enterMiddleNameProfileTab(middleName);
    }

    @Given("User inputs {string} into last name field")
    public void user_inputs_into_last_name_field(String lastName) {
     applicantFlowStepsImplementation.enterLastNameProfileTab(lastName);
    }

    @Given("User inputs {string} into email field")
    public void user_inputs_into_email_field(String  email) {
       applicantFlowStepsImplementation.enterEmailProfileTab(email);
    }

    @Given("User inputs {string} into phone field")
    public void user_inputs_into_phone_field(String phone) {
       applicantFlowStepsImplementation.enterPhoneProfileTab(phone);
    }

    @Given("User inputs {string} into business phone field")
    public void user_inputs_into_business_phone_field(String businessPhone) {
        applicantFlowStepsImplementation.enterBusinessPhoneProfileTab(businessPhone);
    }

    @Given("User inputs {string} into address field")
    public void user_inputs_into_address_field(String address) {
        applicantFlowStepsImplementation.enterAddressProfileTab(address);
    }

    @Given("User inputs {string} into appNumber field")
    public void user_inputs_into_app_number_field(String appNumber) {
        applicantFlowStepsImplementation.enterAppNumberProfileTab(appNumber);
    }

    @Given("User inputs {string} into city field")
    public void user_inputs_into_city_field(String city) {
       applicantFlowStepsImplementation.enterCityProfileTab(city);
    }

    @Given("User inputs {string} into state field")
    public void user_inputs_into_state_field(String state) {
       applicantFlowStepsImplementation.enterStateProfileTab(state);
    }

    @Given("User inputs {string} into country field")
    public void user_inputs_into_country_field(String country) {
       applicantFlowStepsImplementation.enterCountryProfileTab(country);
    }

    @Given("User inputs {string} into zip field")
    public void user_inputs_into_zip_field(String zip) {
       applicantFlowStepsImplementation.enterZipProfileTab(zip);
    }

    @Given("User picks highest degree option as {string}")
    public void user_picks_highest_degree_option_as(String degree) {
       applicantFlowStepsImplementation.pickDegree(degree);
    }

    @Given("User confirms being a US Citizen")
    public void user_confirms_being_a_us_citizen() {
        CommonUtils.assertTrue(applicantFlowPage.rdButtonUSCitizen.isSelected());
    }

    @Given("User saves the updated section")
    public void user_saves_the_updated_section() {
        CommonUtils.waitForVisibility(applicantFlowPage.buttonSave);
        CommonUtils.clickOnElement(applicantFlowPage.buttonSave);
    }

    @Given("User edits sex choice")
    public void user_edits_sex_choice() {
       applicantFlowStepsImplementation.editSexChoice();
    }

    @Given("User edits ethnicity choice")
    public void user_edits_ethnicity_choice() {
        applicantFlowStepsImplementation.editEthnicityChoice();
    }

    @Given("User edits race choice")
    public void user_edits_race_choice() {
        applicantFlowStepsImplementation.editRaceChoice();
    }

    @Given("User edits disability choice")
    public void user_edits_disability_choice() {
        applicantFlowStepsImplementation.editDisabilityChoice();
    }

    @Given("User chooses not to share demographic details")
    public void user_chooses_not_to_share_demographic_details() {
        CommonUtils.clickOnElement(applicantFlowPage.buttonNotShareDemographics);
    }

    @Given("User chooses to share demographic details")
    public void user_chooses_to_share_demographic_details() {
        CommonUtils.clickOnElement(applicantFlowPage.buttonShareDemographics);
    }
}
