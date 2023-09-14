package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
        CommonUtils.waitForClickability(applicantFlowPage.fldFirstNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldFirstNameProfile,firstName);
    }

    @Given("User inputs {string} into middle name field")
    public void user_inputs_into_middle_name_field(String middleName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldMiddleNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldMiddleNameProfile,middleName);
    }

    @Given("User inputs {string} into last name field")
    public void user_inputs_into_last_name_field(String lastName) {
        CommonUtils.waitForClickability(applicantFlowPage.fldLastNameProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldLastNameProfile,lastName);
    }

    @Given("User inputs {string} into email field")
    public void user_inputs_into_email_field(String  email) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldEmailProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldEmailProfile,email);
    }

    @Given("User inputs {string} into phone field")
    public void user_inputs_into_phone_field(String phone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldPhoneProfile,phone);
    }

    @Given("User inputs {string} into business phone field")
    public void user_inputs_into_business_phone_field(String businessPhone) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldBusinessPhoneProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldBusinessPhoneProfile, businessPhone);
    }

    @Given("User inputs {string} into address field")
    public void user_inputs_into_address_field(String address) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldAddressProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAddressProfile,address);
    }

    @Given("User inputs {string} into appNumber field")
    public void user_inputs_into_app_number_field(String appNumber) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldAppNumberProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldAppNumberProfile,appNumber);
    }

    @Given("User inputs {string} into city field")
    public void user_inputs_into_city_field(String city) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCityProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCityProfile,city);
    }

    @Given("User inputs {string} into state field")
    public void user_inputs_into_state_field(String state) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldStateProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldStateProfile,state);
    }

    @Given("User inputs {string} into country field")
    public void user_inputs_into_country_field(String country) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldCountryProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldCountryProfile,country);
    }

    @Given("User inputs {string} into zip field")
    public void user_inputs_into_zip_field(String zip) {
        CommonUtils.waitForVisibility(applicantFlowPage.fldZipProfile);
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile, Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        CommonUtils.sendKeys(applicantFlowPage.fldZipProfile,zip);
    }

    @Given("User picks highest degree option as {string}")
    public void user_picks_highest_degree_option_as(String degree) {
       applicantFlowStepsImplementation.pickDegree(degree);
    }

    @Given("User confirms being a US Citizen")
    public void user_confirms_being_a_us_citizen() {
        Assert.assertTrue(applicantFlowPage.rdButtonUSCitizen.isSelected());
    }

    @Given("User saves the updated section")
    public void user_saves_the_updated_section() {
        CommonUtils.waitForVisibility(applicantFlowPage.buttonSave);
        CommonUtils.clickOnElement(applicantFlowPage.buttonSave);
    }
}
