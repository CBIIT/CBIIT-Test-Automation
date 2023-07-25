package CustomBusiness.CCR.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.Map;

public class InternalUserSteps extends PageInitializer {

    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) throws TestingException {
        switch (user) {
            case "internal user":
                cCRStepsImplementation.ccrLogin();
                break;
        }
    }

    @Given("User can see tabs displayed")
    public void user_can_see_tabs_displayed(io.cucumber.datatable.DataTable data) {
        Map<String, String> options = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(options.get("Option1"),cCRLandingPage.homeTab.isDisplayed());
        Assert.assertTrue(options.get("Option2"),cCRLandingPage.positionsTab.isDisplayed());
    }

    @Given("User navigates to {string} open vacancy")
    public void user_navigates_to_open_vacancy(String text) {
        CommonUtils.clickOnElement(cCRDynamicXpaths.openVacancy(text));
    }

    @Given("User clicks {string} button")
    public void user_clicks_button(String button) {
        cCRStepsImplementation.clickButton(button);
    }

    @Given("User enters {string} into a first name field")
    public void user_enters_into_a_first_name_field(String firstName) {
        CommonUtils.waitForVisibility(cCRApplicationPage.firstNameField);
        CommonUtils.sendKeys(cCRApplicationPage.firstNameField,firstName);
    }

    @Given("User enter {string} into a middle name field")
    public void user_enter_into_a_middle_name_field(String middleName) {
        CommonUtils.waitForVisibility(cCRApplicationPage.middleNameField);
        CommonUtils.sendKeys(cCRApplicationPage.middleNameField,middleName);
    }

    @Given("User enters {string} into a last name field")
    public void user_enters_into_a_last_name_field(String lastName) {
        CommonUtils.waitForVisibility(cCRApplicationPage.lastNameField);
        CommonUtils.sendKeys(cCRApplicationPage.lastNameField,lastName);
    }

    @Given("User enters {string} into an email field")
    public void user_enters_into_an_email_field(String email) {
        CommonUtils.waitForVisibility(cCRApplicationPage.emailField);
        CommonUtils.sendKeys(cCRApplicationPage.emailField,email);
    }

    @Given("User enters {string} into a phone field")
    public void user_enters_into_a_phone_field(String phone) {
        CommonUtils.waitForVisibility(cCRApplicationPage.phoneField);
        CommonUtils.sendKeys(cCRApplicationPage.phoneField,phone);
    }

    @Given("User enters {string} into a business phone field")
    public void user_enters_into_a_business_phone_field(String businessPhone) {
        CommonUtils.waitForVisibility(cCRApplicationPage. businessPhoneField);
        CommonUtils.sendKeys(cCRApplicationPage. businessPhoneField,businessPhone);
    }

    @Given("User selects {string} from a degree dropdown")
    public void user_selects_from_a_degree_dropdown(String phd) {
        Select se = new Select(WebDriverUtils.webDriver
                .findElement(By.xpath("//select[@id='degree']")));
        se.selectByVisibleText(phd);
    }

    @Given("User enters {string} into an other degree field")
    public void user_enters_into_an_other_degree_field(String otherDegrees) {
        CommonUtils.waitForVisibility(cCRApplicationPage.otherDegreesField);
        CommonUtils.sendKeys(cCRApplicationPage.otherDegreesField,otherDegrees);
    }

    @Given("User confirms that User is a US Citizen")
    public void user_confirms_that_user_is_a_us_citizen() {
        CommonUtils.clickOnElement(cCRApplicationPage.yesUSCitizenOption);
    }

    @Given("User enters {string} into an address field")
    public void user_enters_into_an_address_field(String address) {
        CommonUtils.waitForVisibility(cCRApplicationPage.addressField);
        CommonUtils.sendKeys(cCRApplicationPage.addressField,address);
    }

    @Given("User enters {string} into an address2 field")
    public void user_enters_into_an_address2_field(String address2) {
        CommonUtils.waitForVisibility(cCRApplicationPage.address2Field);
        CommonUtils.sendKeys(cCRApplicationPage.address2Field,address2);;
    }

    @Given("User enters {string} into a city field")
    public void user_enters_into_a_city_field(String city) {
        CommonUtils.waitForVisibility(cCRApplicationPage.cityField);
        CommonUtils.sendKeys(cCRApplicationPage.cityField,city);
    }

    @Given("User enters {string} into a state field")
    public void user_enters_into_a_state_field(String state) {
        CommonUtils.waitForVisibility(cCRApplicationPage.stateField);
        CommonUtils.sendKeys(cCRApplicationPage.stateField,state);
    }

    @Given("User enters {string} into a zip field")
    public void user_enters_into_a_zip_field(String zip) {
        CommonUtils.waitForVisibility(cCRApplicationPage.zipcodeField);
        CommonUtils.sendKeys(cCRApplicationPage.zipcodeField,zip);
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
        CommonUtils.waitForVisibility(cCRApplicationPage.departmentField);
        CommonUtils.sendKeys(cCRApplicationPage.departmentField,department);
    }

    @Given("User enters {string} into an institution field")
    public void user_enters_into_an_institution_field(String institution) {
        CommonUtils.waitForVisibility(cCRApplicationPage.institutionField);
        CommonUtils.sendKeys(cCRApplicationPage.institutionField,institution);
    }

    @Given("User enters {string} into a business address field")
    public void user_enters_into_a_business_address_field(String businessAddress) {
        CommonUtils.waitForVisibility(cCRApplicationPage.businessAddressField);
        CommonUtils.sendKeys(cCRApplicationPage.businessAddressField,businessAddress);
    }

    @Given("User enters {string} into a business address2 field")
    public void user_enters_into_a_business_address2_field(String businessAddress2) {
        CommonUtils.waitForVisibility(cCRApplicationPage.businessAddress2Field);
        CommonUtils.sendKeys(cCRApplicationPage.businessAddress2Field,businessAddress2);
    }

    @Given("User enters {string} into a business city field")
    public void user_enters_into_a_business_city_field(String businessCity) {
        CommonUtils.waitForVisibility(cCRApplicationPage.businessCityField);
        CommonUtils.sendKeys(cCRApplicationPage.businessCityField,businessCity);
    }

    @Given("User enters {string} into a business state field")
    public void user_enters_into_a_business_state_field(String businessState) {
        CommonUtils.waitForVisibility(cCRApplicationPage.businessStateField);
        CommonUtils.sendKeys(cCRApplicationPage.businessStateField,businessState);
    }

    @Given("User enters {string} into a business zip field")
    public void user_enters_into_a_business_zip_field(String businessZip) {
        CommonUtils.waitForVisibility(cCRApplicationPage.businessZipField);
        CommonUtils.sendKeys(cCRApplicationPage.businessZipField,businessZip);
    }

    @Given("User uploads {string} document")
    public void user_uploads_document(String document) throws TestingException, AWTException {
        cCRStepsImplementation.uploadDocuments(document);
        MiscUtils.sleep(8000);
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
    public void user_selects_for_the_question_on_whether_the_ad_posted_on_the_website_contains_enough_information_to_decide_on_applying_for_a_job(String option) {
        cCRStepsImplementation.selectAdInformationOption(option);
    }

    @Given("User inputs {string} in the changing process text field")
    public void user_inputs_in_the_changing_process_text_field(String text) {
        CommonUtils.waitForVisibility(cCRApplicationPage.textFieldSuggestions);
        CommonUtils.sendKeys(cCRApplicationPage.textFieldSuggestions,text);
    }
}