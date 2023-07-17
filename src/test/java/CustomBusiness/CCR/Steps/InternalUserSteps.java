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
import java.util.Map;

public class InternalUserSteps extends PageInitializer {
    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) throws TestingException {
        switch (user) {
            case "internal user":
                cCRLogInStepsImplementation.ccrLogin();
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
    @Given("User clicks Apply Now button")
    public void user_clicks_apply_now_button() {
        CommonUtils.waitForClickability(cCRApplicationPage.applyNowButton);
        CommonUtils.clickOnElement(cCRApplicationPage.applyNowButton);
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
    @Given("User enter {string} into a last name field")
    public void user_enter_into_a_last_name_field(String lastName) {
        CommonUtils.waitForVisibility(cCRApplicationPage.lastNameField);
        CommonUtils.sendKeys(cCRApplicationPage.lastNameField,lastName);
    }
    @Given("User enter {string} into an email field")
    public void user_enter_into_an_email_field(String email) {
        CommonUtils.waitForVisibility(cCRApplicationPage.emailField);
        CommonUtils.sendKeys(cCRApplicationPage.emailField,email);
    }
    @Given("User enter {string} into a phone field")
    public void user_enter_into_a_phone_field(String phone) {
        CommonUtils.waitForVisibility(cCRApplicationPage.phoneField);
        CommonUtils.sendKeys(cCRApplicationPage.phoneField,phone);
    }
    @Given("User enter {string} into a business phone field")
    public void user_enter_into_a_business_phone_field(String businessPhone) {
        CommonUtils.waitForVisibility(cCRApplicationPage. businessPhoneField);
        CommonUtils.sendKeys(cCRApplicationPage. businessPhoneField,businessPhone);
    }
    @Given("User selects {string} from a degree dropdown")
    public void user_selects_from_a_degree_dropdown(String phd) {
        Select se = new Select(WebDriverUtils.webDriver
                .findElement(By.xpath("//select[@id='degree']")));
        se.selectByVisibleText(phd);
    }    @Given("User enter {string} into an other degree field")
    public void user_enter_into_an_other_degree_field(String otherDegrees) {
        CommonUtils.waitForVisibility(cCRApplicationPage.otherDegreesField);
        CommonUtils.sendKeys(cCRApplicationPage.otherDegreesField,otherDegrees);
    }
    @Given("User confirms that User is a US Citizen")
    public void user_confirms_that_user_is_a_us_citizen() {
        CommonUtils.clickOnElement(cCRApplicationPage.yesUSCitizenOption);
    }
    @Given("User clicks Basic Information Section Next button")
    public void user_clicks_basic_information_section_next_button() {
        CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonBasicInfoSection);
        CommonUtils.clickOnElement(cCRApplicationPage.nextButtonBasicInfoSection);
    }
    @Given("User enter {string} into an address field")
    public void user_enter_into_an_address_field(String address) {
        CommonUtils.waitForVisibility(cCRApplicationPage.addressField);
        CommonUtils.sendKeys(cCRApplicationPage.addressField,address);
    }
    @Given("User enter {string} into an address2 field")
    public void user_enter_into_an_address2_field(String address2) {
        CommonUtils.waitForVisibility(cCRApplicationPage.address2Field);
        CommonUtils.sendKeys(cCRApplicationPage.address2Field,address2);;
    }
    @Given("User enter {string} into a city field")
    public void user_enter_into_a_city_field(String city) {
        CommonUtils.waitForVisibility(cCRApplicationPage.cityField);
        CommonUtils.sendKeys(cCRApplicationPage.cityField,city);
    }
    @Given("User enter {string} into a state field")
    public void user_enter_into_a_state_field(String state) {
        CommonUtils.waitForVisibility(cCRApplicationPage.stateField);
        CommonUtils.sendKeys(cCRApplicationPage.stateField,state);
    }
    @Given("User enter {string} into a zip field")
    public void user_enter_into_a_zip_field(String zip) {
        CommonUtils.waitForVisibility(cCRApplicationPage.zipcodeField);
        CommonUtils.sendKeys(cCRApplicationPage.zipcodeField,zip);
    }
    @Given("User selects United States from a country dropdown")
    public void user_selects_united_states_from_a_country_dropdown() {
        Select se = new Select(WebDriverUtils.webDriver
                .findElement(By.xpath("//select[@id='country']")));
        se.selectByValue("060f782fdb51f30054d8ff621f96190a");
    }
    @Given("User clicks Address Section Next button")
    public void user_clicks_address_section_next_button() {
        CommonUtils.waitForVisibility(cCRApplicationPage.nextButtonAddressSection);
        CommonUtils.clickOnElement(cCRApplicationPage.nextButtonAddressSection);
    }

}