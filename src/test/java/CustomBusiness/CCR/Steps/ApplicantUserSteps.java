package CustomBusiness.CCR.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import java.awt.*;

public class ApplicantUserSteps extends PageInitializer {

    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) {
        switch (user) {
            case "internal user":
                cCRStepsImplementation.ccrApplicantLogin();
                break;
            case "admin user":
                cCRStepsImplementation.ccrAdminLogin();
                break;
        }
    }

    @Given("User can see {string} tab displayed")
    public void user_can_see_tab_displayed(String tab) {
        cCRStepsImplementation.verifyDisplayedTab(tab);
    }

    @Given("User navigates to {string} open vacancy")
    public void user_navigates_to_open_vacancy(String text) {
        CommonUtils.clickOnElement(cCRDynamicXpaths.openVacancy(text));
    }

    @Given("User submits CCR Careers application")
    public void user_submits_CCR_Careers_application() {
        cCRStepsImplementation.submitApplication();
        MiscUtils.sleep(3000);
    }

    @Given("User applies for that vacancy")
    public void user_applies_for_that_vacancy() {
        cCRStepsImplementation.clickApplyButton();
        MiscUtils.sleep(3000);
    }

    @Given("User enters {string} into a first name field")
    public void user_enters_into_a_first_name_field(String firstName) {
        CommonUtils.waitForVisibility(cCRApplicantPage.firstNameField);
        CommonUtils.sendKeys(cCRApplicantPage.firstNameField, firstName);
    }

    @Given("User enter {string} into a middle name field")
    public void user_enter_into_a_middle_name_field(String middleName) {
        CommonUtils.waitForVisibility(cCRApplicantPage.middleNameField);
        CommonUtils.sendKeys(cCRApplicantPage.middleNameField, middleName);
    }

    @Given("User enters {string} into a last name field")
    public void user_enters_into_a_last_name_field(String lastName) {
        CommonUtils.waitForVisibility(cCRApplicantPage.lastNameField);
        CommonUtils.sendKeys(cCRApplicantPage.lastNameField, lastName);
    }

    @Given("User enters {string} into an email field")
    public void user_enters_into_an_email_field(String email) {
        CommonUtils.waitForVisibility(cCRApplicantPage.emailField);
        CommonUtils.sendKeys(cCRApplicantPage.emailField, email);
    }

    @Given("User enters {string} into a phone field")
    public void user_enters_into_a_phone_field(String phone) {
        CommonUtils.waitForVisibility(cCRApplicantPage.phoneField);
        CommonUtils.sendKeys(cCRApplicantPage.phoneField, phone);
    }

    @Given("User enters {string} into a business phone field")
    public void user_enters_into_a_business_phone_field(String businessPhone) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessPhoneField);
        CommonUtils.sendKeys(cCRApplicantPage.businessPhoneField, businessPhone);
    }

    @Given("User selects {string} from a degree dropdown")
    public void user_selects_from_a_degree_dropdown() {
        CommonUtils.clickOnElement(cCRApplicantPage.degreeDropdown);
        CommonUtils.clickOnElement(cCRApplicantPage.degreeOther);
    }

    @Given("User enters {string} into an other degree field")
    public void user_enters_into_an_other_degree_field(String otherDegrees) {
        CommonUtils.waitForVisibility(cCRApplicantPage.otherDegreesField);
        CommonUtils.sendKeys(cCRApplicantPage.otherDegreesField, otherDegrees);
    }

    @Given("User confirms that User is a US Citizen")
    public void user_confirms_that_user_is_a_us_citizen() {
        CommonUtils.clickOnElement(cCRApplicantPage.yesUSCitizenOption);
    }

    @Given("User enters {string} into an address field")
    public void user_enters_into_an_address_field(String address) {
        CommonUtils.waitForVisibility(cCRApplicantPage.addressField);
        CommonUtils.sendKeys(cCRApplicantPage.addressField, address);
    }

    @Given("User enters {string} into an address2 field")
    public void user_enters_into_an_address2_field(String address2) {
        CommonUtils.waitForVisibility(cCRApplicantPage.address2Field);
        CommonUtils.sendKeys(cCRApplicantPage.address2Field, address2);
        ;
    }

    @Given("User enters {string} into a city field")
    public void user_enters_into_a_city_field(String city) {
        CommonUtils.waitForVisibility(cCRApplicantPage.cityField);
        CommonUtils.sendKeys(cCRApplicantPage.cityField, city);
    }

    @Given("User enters {string} into a state field")
    public void user_enters_into_a_state_field(String state) {
        CommonUtils.waitForVisibility(cCRApplicantPage.stateField);
        CommonUtils.sendKeys(cCRApplicantPage.stateField, state);
    }

    @Given("User enters {string} into a zip field")
    public void user_enters_into_a_zip_field(String zip) {
        CommonUtils.waitForVisibility(cCRApplicantPage.zipcodeField);
        CommonUtils.sendKeys(cCRApplicantPage.zipcodeField, zip);
    }

    @Given("User selects United States from a country dropdown for {string} section")
    public void user_selects_united_states_from_a_country_dropdown_for_section(String country) throws TestingException {
        cCRStepsImplementation.chooseUSA(country);
    }

    @Given("User clicks Next button for {string} section")
    public void user_clicks_next_button_for_section(String sectionName) throws TestingException {
        cCRStepsImplementation.clickNextButton(sectionName);
    }

    @Given("User enters {string} into a department field")
    public void user_enters_into_a_department_field(String department) {
        CommonUtils.waitForVisibility(cCRApplicantPage.departmentField);
        CommonUtils.sendKeys(cCRApplicantPage.departmentField, department);
    }

    @Given("User enters {string} into an institution field")
    public void user_enters_into_an_institution_field(String institution) {
        CommonUtils.waitForVisibility(cCRApplicantPage.institutionField);
        CommonUtils.sendKeys(cCRApplicantPage.institutionField, institution);
    }

    @Given("User enters {string} into a business address field")
    public void user_enters_into_a_business_address_field(String businessAddress) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessAddressField);
        CommonUtils.sendKeys(cCRApplicantPage.businessAddressField, businessAddress);
    }

    @Given("User enters {string} into a business address2 field")
    public void user_enters_into_a_business_address2_field(String businessAddress2) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessAddress2Field);
        CommonUtils.sendKeys(cCRApplicantPage.businessAddress2Field, businessAddress2);
    }

    @Given("User enters {string} into a business city field")
    public void user_enters_into_a_business_city_field(String businessCity) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessCityField);
        CommonUtils.sendKeys(cCRApplicantPage.businessCityField, businessCity);
    }

    @Given("User enters {string} into a business state field")
    public void user_enters_into_a_business_state_field(String businessState) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessStateField);
        CommonUtils.sendKeys(cCRApplicantPage.businessStateField, businessState);
    }

    @Given("User enters {string} into a business zip field")
    public void user_enters_into_a_business_zip_field(String businessZip) {
        CommonUtils.waitForVisibility(cCRApplicantPage.businessZipField);
        CommonUtils.sendKeys(cCRApplicantPage.businessZipField, businessZip);
    }

    @Given("User uploads {string} document")
    public void user_uploads_document_as(String document) throws AWTException {
        cCRStepsImplementation.uploadDocuments(document);
    }

    @Given("User selects an outreach source as {string}")
    public void user_selects_an_outreach_source_as(String source) {
        cCRStepsImplementation.selectOutreachSource(source);
    }

    @Given("User selects {string} for the question on simplicity of uploading application materials")
    public void user_selects_for_the_question_on_simplicity_of_uploading_application_materials(String option) {
        cCRStepsImplementation.selectUploadingMaterialsOption(option);
    }

    @Given("User selects {string} for the question on whether the ad posted on the website contains enough information to decide on applying for a job")
    public void user_selects_for_the_question_on_whether_the_ad_posted_on_the_website_contains_enough_information_to_decide_on_applying_for_a_job(
            String option) {
        cCRStepsImplementation.selectAdInformationOption(option);
    }

    @Given("User inputs {string} in the changing process text field")
    public void user_inputs_in_the_changing_process_text_field(String text) {
        CommonUtils.waitForVisibility(cCRApplicantPage.textFieldSuggestions);
        CommonUtils.sendKeys(cCRApplicantPage.textFieldSuggestions, text);
    }

    @Given("User logs out of CCR application")
    public void user_logs_out_of_ccr_application() {
        cCRStepsImplementation.logOutOfCCRCareersApp();
    }

    @Given("User enters {string} into a reference First name field")
    public void user_enters_into_a_reference_first_name_field(String referenceFirstName) {
        CommonUtils.waitForVisibility(cCRApplicantPage.refFirstNameField);
        CommonUtils.sendKeys(cCRApplicantPage.refFirstNameField, referenceFirstName);
    }
    @Given("User enters {string} into a reference Last name field")
    public void user_enters_into_a_reference_last_name_field(String referenceLastName) {
        CommonUtils.waitForVisibility(cCRApplicantPage.refLastNameField);
        CommonUtils.sendKeys(cCRApplicantPage.refLastNameField, referenceLastName);
    }
    @Given("User enters {string} into a reference Email field")
    public void user_enters_into_a_reference_email_field(String referenceEmail) {
        CommonUtils.waitForVisibility(cCRApplicantPage.refEmailField);
        CommonUtils.sendKeys(cCRApplicantPage.refEmailField, referenceEmail);
    }
    @Given("User enters {string} into a reference Phone Number field")
    public void user_enters_into_a_reference_phone_number_field(String referencePhoneNumber) {
        CommonUtils.waitForVisibility(cCRApplicantPage.refPhoneNumberField);
        CommonUtils.sendKeys(cCRApplicantPage.refPhoneNumberField, referencePhoneNumber);
    }
}
