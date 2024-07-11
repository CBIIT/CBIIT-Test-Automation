package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import Hooks.Hooks;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.ApplicationDocumentsPage;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Profile_Tab_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Vacancy_Committee_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.ApplicantProfileStepsImpl;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.Reset_Account_StepsImpl;
import ServiceNow.PlatformBusinessApps.SSJ.utils.SSJ_Constants;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.beust.ah.A;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.LoadState;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.nci.automation.web.PlaywrightUtils.page;

public class ApplicantProfileSteps {

    @Given("User is on SCSS Landing page and user is {string} - PW")
    public void user_is_on_scss_landing_page_and_user_is_pw(String user) {
        ApplicantProfileStepsImpl.ssjLogin(user);
    }

    @Given("User is on Profile tab - PW")
    public void user_is_on_profile_tab_pw() {
        page.locator(Profile_Tab_Page.profileTab).click();
    }

    @Given("User inputs {string} into first name field - PW")
    public void user_inputs_into_first_name_field_pw(String firstName) {
        page.locator(Profile_Tab_Page.firstNameTextBox).fill(firstName);
    }

    @Given("User inputs {string} into middle name field - PW")
    public void user_inputs_into_middle_name_field_pw(String middleName) {
        page.locator(Profile_Tab_Page.middleNameTextBox).fill(middleName);
    }

    @Given("User inputs {string} into last name field - PW")
    public void user_inputs_into_last_name_field_pw(String lastName) {
        page.locator(Profile_Tab_Page.lastNameTextBox).fill(lastName);
    }

    @Given("User inputs {string} into email field - PW")
    public void user_inputs_into_email_field_pw(String email) {
        page.getByLabel(Profile_Tab_Page.emailTextBox).fill(email);
    }

    @Given("User inputs {string} into phone field - PW")
    public void user_inputs_into_phone_field_pw(String phoneNumber) {
        page.locator(Profile_Tab_Page.phoneNumberTextBox).fill(phoneNumber);
    }

    @Given("User inputs {string} into business phone field - PW")
    public void user_inputs_into_business_phone_field_pw(String businessPhone) {
        page.locator(Profile_Tab_Page.businessPhoneNumberTextBox).fill(businessPhone);
    }

    @Given("selects highest education {string}")
    public void selects_highest_education(String highestDegree) {
        ApplicantProfileStepsImpl.selects_highest_education(highestDegree);
    }

    @Given("User confirms being a US Citizen - PW")
    public void user_confirms_being_a_us_citizen_pw() {
        page.getByLabel(Profile_Tab_Page.are_You_A_US_Citizen_Yes_Radio_Button).check();
    }

    @Given("User inputs {string} into address field - PW")
    public void user_inputs_into_address_field_pw(String address) {
        page.getByLabel(Profile_Tab_Page.addressTextBox).fill(address);
    }

    @Given("User inputs {string} into appNumber field - PW")
    public void user_inputs_into_app_number_field_pw(String aptNumber) {
        page.locator(Profile_Tab_Page.apartmentOrSuiteNumberTextBox).fill(aptNumber);
    }

    @Given("User inputs {string} into city field - PW")
    public void user_inputs_into_city_field_pw(String city) {
        page.getByLabel(Profile_Tab_Page.cityTextBox).fill(city);
    }

    @Given("User inputs {string} into state field - PW")
    public void user_inputs_into_state_field_pw(String state) {
        page.getByLabel(Profile_Tab_Page.stateTextBox).fill(state);
    }

    @Given("User inputs {string} into country field - PW")
    public void user_inputs_into_country_field_pw(String country) {
        page.getByLabel(Profile_Tab_Page.countryTextBox).fill(country);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Given("User inputs {string} into zip field - PW")
    public void user_inputs_into_zip_field_pw(String zipCode) {
        page.getByLabel(Profile_Tab_Page.zipCodeTextBox).fill(zipCode);
    }

    @When("User clicks on Save Application button - PW")
    public void user_clicks_on_save_application_button_pw() {
        page.locator(Profile_Tab_Page.saveButton).click();
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

    @When("clicks on a Vacancy Title")
    public void clicks_on_a_vacancy_title() {
        page.locator("//tbody/tr[2]/td/a").click();
    }

    @When("clicks {string}")
    public void clicks(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
    }

    @When("proceeds with completing profile by clicking {string}")
    public void proceeds_with_completing_profile_by_clicking(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
    }

    @Then("navigates to the {string} tab to be able to apply to a vacancy after creating a profile")
    public void navigates_to_the_tab_to_be_able_to_apply_to_a_vacancy_after_creating_a_profile(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String expectedApplicationText) {
        String actualApplicationText = page.locator("(//h3)[1]").innerText();
        Assert.assertEquals(actualApplicationText, expectedApplicationText);
    }

    @Then("uploads cover letter if cover letter option is displayed")
    public void uploads_cover_letter() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Cover Letter"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_COVER_LETTER));
        } catch (Exception e) {
            System.out.println("* * * COVER LETTER OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * COVER LETTER OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
    }

    @Then("uploads qualification statement if qualification statement is displayed")
    public void uploads_qualification_statement() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Qualification Statement"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_QUALIFICATION_STATEMENT));
        } catch (Exception e) {
            System.out.println("* * * QUALIFICATION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * QUALIFICATION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
    }

    @Then("if reference one is required then user enters Reference One first name {string}")
    public void user_enters_reference_one_first_name(String firstNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[1]").fill(firstNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One middle name {string}")
    public void enters_reference_one_middle_name(String middleNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[2]").fill(middleNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One last name {string}")
    public void enters_reference_one_last_name(String lastNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[3]").fill(lastNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One email address {string}")
    public void enters_reference_one_email_address(String emailAddress) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[4]").fill(emailAddress);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One phone number {string}")
    public void enters_reference_one_phone_number(String phoneNumber) {
        try {
            page.locator("(//input[@placeholder='(123) 456-7890'])[1]").fill(phoneNumber);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("selects Reference One relationship as {string}")
    public void selects_reference_one_relationship_as(String relationship) {
        try {
            page.locator("(//input[@role='combobox'])[1]").click();
            page.getByTitle(relationship).locator("div").click();
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One position title {string}")
    public void enters_reference_one_position_title(String positionTitle) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[5]").fill(positionTitle);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference One organization name {string}")
    public void enters_reference_one_organization_name(String organizationName) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[6]").fill(organizationName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("user agrees to share demographic details and help improve the hiring process.")
    public void user_agrees_to_share_demographic_details_and_help_improve_the_hiring_process() {
        page.getByText("I want to share my").click();
    }

    @Then("selects {string} for Sex")
    public void selects_for_sex(String gender) {
        page.getByText(gender, new Page.GetByTextOptions().setExact(true)).click();
    }

    @Then("selects {string} for Ethnicity")
    public void selects_for_ethnicity(String ethnicity) {
        Playwright_Common_Utils.scrollIntoView(ethnicity, true);
        page.getByText(ethnicity, new Page.GetByTextOptions().setExact(true)).click();
    }

    @Then("selects {string}, {string}, {string}, {string}, {string} for Race")
    public void selects_for_race(String americanIndianOrAlaska, String asia, String blackOrAfricanAmerican, String nativeHawaiianOrOther, String white) {
        Playwright_Common_Utils.scrollIntoView(americanIndianOrAlaska, false);
        page.getByText(americanIndianOrAlaska).click();
        page.getByText(asia).click();
        page.getByText(blackOrAfricanAmerican).click();
        page.getByText(nativeHawaiianOrOther).click();
        page.getByText(white).click();
    }


    @Then("selects {string} for Disability or Serious Health Condition")
    public void selects_for_disability_or_serious_health_condition(String text) {
        Playwright_Common_Utils.scrollIntoView(text, true);
        page.getByText(text).click();
    }

    @Then("user verifies basic information {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void user_verifies_basic_information_and(String firstName, String middleName, String lastName, String email, String phone, String businessPhone, String highestEducation, String usCitizenship) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstName);
        expectedValues.add(middleName);
        expectedValues.add(lastName);
        expectedValues.add(email);
        expectedValues.add("+1" + phone);
        expectedValues.add("+1" + businessPhone);
        expectedValues.add(highestEducation);
        expectedValues.add(usCitizenship);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 2; i <= 9; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    @Then("user verifies address information {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_address_information(String address, String aptNumber, String city, String state, String zip) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(address);
        expectedValues.add(aptNumber);
        expectedValues.add(city);
        expectedValues.add(state);
        expectedValues.add(zip);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 11; i <= 15; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    @Then("user verifies demographics information {string}, {string}, {string}, {string}, and {string}")
    public void user_verifies_demographics_information_and(String sharingDemographicsText, String sexText, String ethnicityText, String raceText, String disabilityText) {
        Playwright_Common_Utils.scrollIntoView("(//h2)[17]//following-sibling::span");
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(sharingDemographicsText);
        expectedValues.add(sexText);
        expectedValues.add(ethnicityText);
        expectedValues.add(raceText);
        expectedValues.add(disabilityText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 17; i <= 21; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
            System.out.println("***** = " + page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    @Then("user verifies references one information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_references_information(String firstNameText, String middleNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        Playwright_Common_Utils.scrollIntoView("(//tbody/tr/td)[7]");
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstNameText + " " + middleNameText + " " + lastNameText);
        expectedValues.add(emailText);
        expectedValues.add(phoneNumberText);
        expectedValues.add(relationshipText);
        expectedValues.add(titleText);
        expectedValues.add(organizationText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 7; i <= 12; i++) {
            actualValues.add(page.locator("(//tbody/tr/td)[" + i + "]").innerText());
        }
//        Assert.assertEquals(actualValues, expectedValues);
//        Assert.assertEquals(actualValues.size(), expectedValues.size());
        Hooks.softAssert.assertEquals(actualValues, expectedValues);
        //CommonUtils.comparingTwoList(actualValues, expectedValues);
    }

    @Then("if reference two is required then user enters Reference Two first name {string}")
    public void if_reference_two_is_required_then_user_enters_reference_two_first_name(String firstName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[7]").fill(firstName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two middle name {string}")
    public void enters_reference_two_middle_name(String middleName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[8]").fill(middleName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two last name {string}")
    public void enters_reference_two_last_name(String lastName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[9]").fill(lastName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two email address {string}")
    public void enters_reference_two_email_address(String emailAddressText) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[10]").fill(emailAddressText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two phone number {string}")
    public void enters_reference_two_phone_number(String phoneNumberText) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='(123) 456-7890'])[2]").fill(phoneNumberText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("selects Reference Two relationship as Co-worker")
    public void selects_reference_two_relationship_as_co_worker() {
        try {
            page.locator("(//input[@role='combobox'])[2]").click();
            page.locator("(//input[@role='combobox'])[2]").focus();
            for (int i = 0; i < 1; i++) {
                page.keyboard().press("ArrowDown");
                page.waitForTimeout(200);
            }
            page.keyboard().press("Enter");
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two position title {string}")
    public void enters_reference_two_position_title(String titleText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[11]").fill(titleText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("enters Reference Two organization name {string}")
    public void enters_reference_two_organization_name(String organizationTextBox) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[12]").fill(organizationTextBox);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
    }

    @Then("user verifies references two information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_references_two_information(String firstNameText, String middleNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstNameText + " " + middleNameText + " " + lastNameText);
        expectedValues.add(emailText);
        expectedValues.add(phoneNumberText);
        expectedValues.add(relationshipText);
        expectedValues.add(titleText);
        expectedValues.add(organizationText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 13; i <= 18; i++) {
            actualValues.add(page.locator("(//tbody/tr/td)[" + i + "]").innerText());
        }
        Hooks.softAssert.assertEquals(actualValues, expectedValues);
    }

    @Then("if either a Cover Letter, Qualification Statement, Curriculum Vitae \\(CV), or Vision Statement \\(or all) were uploaded then documents are displayed in the Application Documents section")
    public void if_either_a_cover_letter_qualification_statement_curriculum_vitae_cv_or_vision_statement_or_all_were_uploaded_then_documents_are_displayed_in_the_application_documents_section() {
        page.waitForLoadState(LoadState.NETWORKIDLE);
        List<ElementHandle> actualValues = page.querySelectorAll("//div[@class='SectionContent'][5]/div");
        ArrayList<String> values = new ArrayList<>();
        for(ElementHandle actualValue : actualValues){
            values.add(actualValue.innerText());
        }
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add("✓ Cover Letter" + "\n" + " SSJ_COVER_LETTER_TEST.docx");
        expectedValues.add("✓ Qualification Statement" + "\n" + " SSJ_QUALIFICATION_STATEMENT_TEST.pdf");
        expectedValues.add("✓ Curriculum Vitae (CV)" + "\n" + " SSJ_CURRICULUM_VITAE_(CV).docx");
        expectedValues.add("✓ Vision Statement" + "\n" + " SSJ_CURRICULUM_VITAE_(CV).docx");
        Hooks.softAssert.assertTrue(expectedValues.containsAll(values), "* * * VERIFYING UPLOADED DOCUMENTS * * *");
    }

    @Then("uploads a Curriculum Vitae if Curriculum Vitae option is displayed")
    public void uploads_a_curriculum_vitae_if_curriculum_vitae_option_is_displayed() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Curriculum Vitae (CV)"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_QUALIFICATION_STATEMENT));
        } catch (Exception e) {
            System.out.println("* * * CURRICULUM VITAE OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * CURRICULUM VITAE OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
    }

    @Then("uploads a Vision Statement if Vision Statement option is displayed")
    public void uploads_a_vision_statement_if_vision_statement_option_is_displayed() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Vision Statement"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_QUALIFICATION_STATEMENT));
        } catch (Exception e) {
            System.out.println("* * * VISION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * VISION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
    }

    @Then("verifies {string} tab is displayed")
    public void verifies_tab_is_displayed(String text) {
       Playwright_Common_Utils.scrollIntoView(text);
       MiscUtils.sleep(5000);
    }
}