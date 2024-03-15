package ServiceNow.SCSS.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import static ServiceNow.ATO.Utils.DriverObjectFactory.getWebDriver;

public class ApplicantFlowSteps extends PageInitializer {

    @Given("User is on Profile tab")
    public void user_is_on_profile_tab() {
        applicantFlowStepsImplementation.userIsOnProfileTab();
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
    public void user_inputs_into_email_field(String email) {
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
        applicantFlowStepsImplementation.userSavesUpdatedSection();
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
        @Given("User is on Home Page")
        public void user_is_on_Home_Page() {
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.homeTab.isDisplayed());
        }

        @Given("User applies for an open vacancy")
        public void user_applies_for_an_open_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.seniorProjectManagerVacancy);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
        }

        @Given("User enters  First Name, Last Name, and Email")
        public void user_enters_First_Name_Last_Name_and_Email() {
            CommonUtils.sendKeys(applicantFlowPage.firstNameField, "Jae");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameField, "Song");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.emailField, "a@gmail.com");
            MiscUtils.sleep(1000);
    }

    @Then("successful save alert is displayed")
    public void successful_save_alert_is_displayed() {
        Assert.assertTrue(applicantFlowPage.alertApplicationsaved.isDisplayed());
        MiscUtils.sleep(1000);
    }

        @When("User clicks on Save Application button")
        public void user_clicks_on_Save_button() {
            CommonUtils.clickOnElement(applicantFlowPage.saveApplicationButton);
            MiscUtils.sleep(1000);
        }

        @Then("User can verify the application became a draft")
        public void user_can_verify_the_application_became_a_draft() {
            CommonUtils.clickOnElement(applicantFlowPage.alertBackToApplicationsHome);
            MiscUtils.sleep(3000);
            CommonUtils.clickOnElement(applicantFlowPage.removeDraft);
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(applicantFlowPage.confirmAlert);
            MiscUtils.sleep(2000);
        }

        // @draftApplicationFailure
        @Given("User enters  First Name, Last Name")
        public void user_enters_First_Name_Last_Name() {
            CommonUtils.sendKeys(applicantFlowPage.firstNameField, "Jae");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameField, "Song");
            MiscUtils.sleep(1000);
        }

        @Then("User is not able to save an application")
        public void user_is_not_able_to_save_an_application() {
            Assert.assertTrue(applicantFlowPage.alertUnsuccessfulSaveApplication.isDisplayed());
            MiscUtils.sleep(1000);
        }

        @Given("User intends to apply for a vacancy")
        public void user_intends_to_apply_for_a_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.vpProductDevelopmentVacancy);
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
        }

        @When("User selects no for Do you possess a Doctoral degree? field")
        public void user_selects_no_for_Do_you_possess_a_Doctoral_degree_field() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.noMinimumDegreeAnswer);
            JavascriptUtils.clickByJS(applicantFlowPage.noMinimumDegreeAnswer);
            MiscUtils.sleep(2000);
        }

        @Then("User can see the following message displays {string}")
        public void user_can_see_the_following_message_displays(String alert) {
            Assert.assertEquals(alert, (applicantFlowPage.alertMinimumDegree.getText()));
            MiscUtils.sleep(1000);
        }

        @When("User clicks on Next button")
        public void user_clicks_on_Next_button() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
        }

        @Then("User can see the message {string}")
        public void user_can_see_the_message(String message) {
            Assert.assertEquals(message, applicantFlowPage.alertReqFields.getText());
            MiscUtils.sleep(1000);
        }

        @Given("User wants to apply for a vacancy")
        public void user_wants_to_apply_for_a_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.vpProductDevelopmentVacancy);
            MiscUtils.sleep(2000);
        }

        @Given("User can seethe following fields are displayed")
        public void user_can_seethe_following_fields_are_displayed(io.cucumber.datatable.DataTable data) {
            Map<String, String> fields = CommonUtil.getMapFromDataTable(data);
            Assert.assertEquals(fields.get("field1"), applicantFlowPage.vacTitle.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field2"), applicantFlowPage.openDateField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field3"), applicantFlowPage.closeDateField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field4"), applicantFlowPage.vacDescriptionField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field5"), applicantFlowPage.appDocumentsField.getText());
            MiscUtils.sleep(1000);
        }

        @Given("User can see mandatory statements indicated as active are displayed")
        public void user_can_see_mandatory_statements_indicated_as_active_are_displayed(
                io.cucumber.datatable.DataTable data) {
            Map<String, String> fields = CommonUtil.getMapFromDataTable(data);
            Assert.assertEquals(fields.get("field1"),
                    applicantFlowPage.equalOpportunityEmploymentStatement.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field2"), applicantFlowPage.standardsOfConductStatement.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field3"), applicantFlowPage.foreignEducationStatement.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field4"), applicantFlowPage.reasonableAccommodationStatement.getText());
            MiscUtils.sleep(1000);
        }

        @Then("User is able to apply to the vacancy")
        public void user_is_able_to_apply_to_the_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.vacTitle.isDisplayed());
        }

        @When("User enters Email Address, Phone Number, and Business Phone Number correctly")
        public void user_enters_Email_Address_Phone_Number_and_Business_Phone_Number_correctly() {
            CommonUtils.sendKeys(applicantFlowPage.emailAddressField, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.phoneNumberField, "2026675433");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.businessPhonehoneNumberField, "2123342323");
            MiscUtils.sleep(1000);
        }

        @When("User chooses yes to Do you possess a Doctoral degree?")
        public void user_chooses_yes_to_Do_you_possess_a_Doctoral_degree() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.yesMinimumDegreeAnswer);
            JavascriptUtils.clickByJS(applicantFlowPage.yesMinimumDegreeAnswer);
            MiscUtils.sleep(2000);
        }

        @Then("User can move to the Address section")
        public void user_can_move_to_the_Address_section() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.addressSectionTitle.isDisplayed());
            MiscUtils.sleep(1000);
        }

    @Then("User fills in Address section details")
    public void user_fills_in_Address_section_details() {
        CommonUtils.sendKeys(applicantFlowPage.addressLineOne, "123 Pip Drive");
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(applicantFlowPage.addressLineCity, "Reston");
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(applicantFlowPage.addressLineState, "VA");
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(applicantFlowPage.addressLineCountry, "USA");
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(applicantFlowPage.addressLineZipCode, "20194");
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(applicantFlowPage.nextButton);
        MiscUtils.sleep(1000);

    }
        @When("User enters Email Address, Phone Number, and Business Phone Number incorrectly")
        public void user_enters_Email_Address_Phone_Number_and_Business_Phone_Number_incorrectly() {
            CommonUtils.sendKeys(applicantFlowPage.emailAddressField, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.phoneNumberField, "202667543388");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.businessPhonehoneNumberField, "562123342323");
            MiscUtils.sleep(1000);
        }

        @When("User chooses no to Do you possess a Doctoral degree?")
        public void user_chooses_no_to_Do_you_possess_a_Doctoral_degree() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.noMinimumDegreeAnswer);
            JavascriptUtils.clickByJS(applicantFlowPage.noMinimumDegreeAnswer);
            MiscUtils.sleep(2000);
    }

        @Then("User can see alerts")
        public void user_can_see_alerts(io.cucumber.datatable.DataTable data) {
            Map<String, String> alerts = CommonUtil.getMapFromDataTable(data);
            Assert.assertEquals(alerts.get("alert1"), applicantFlowPage.emailAddressAlert.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(alerts.get("alert2"), applicantFlowPage.phoneNumberAlert.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(alerts.get("alert3"), applicantFlowPage.businessPhoneNumberAlert.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(alerts.get("alert4"), applicantFlowPage.doctoralDegreeAlert.getText());
            MiscUtils.sleep(1000);
        }

        // @addressSection
        @Then("User enters data in the  fields")
        public void user_enters_data_in_the_fields(io.cucumber.datatable.DataTable data) {
            Map<String, String> fields = CommonUtil.getMapFromDataTable(data);
            CommonUtils.sendKeys(applicantFlowPage.addressLineOne, fields.get("Address Line One"));
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.addressLineTwo, fields.get("Address Line Two"));
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.addressLineCity, fields.get("City"));
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.addressLineState, fields.get("State/Province"));
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.addressLineCountry, fields.get("Country"));
            MiscUtils.sleep(1000);

        }

        @Then("User removes data from Address Line Two")
        public void user_removes_data_from_Address_Line_Two() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.addressLineTwo);
            applicantFlowPage.addressLineTwo.clear();
            MiscUtils.sleep(1000);
        }

        @When("User presses Next button")
        public void user_presses_Next_button() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
        }

        @Then("User can see an alert{string}")
        public void user_can_see_an_alert(String alert) {
            JavascriptUtils.scrollIntoView(applicantFlowPage.alertZipCode);
            Assert.assertTrue(applicantFlowPage.alertZipCode.isDisplayed());
            MiscUtils.sleep(1000);
        }

        @When("User enters zipcode")
        public void user_enters_zipcode() {
            CommonUtils.sendKeys(applicantFlowPage.addressLineZipCode, "20194");
            MiscUtils.sleep(1000);
        }

        @Then("User can move to the next section")
        public void user_can_move_to_the_next_section() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.referencesSectionTitle.isDisplayed());
            MiscUtils.sleep(1000);
        }

        @When("User applies for an vacancy")
        public void user_applies_for_an_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.cyberSecurityAnalystVacancy);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
        }

        @Then("User fills in References section")
        public void user_fills_in_References_section() {
            CommonUtils.sendKeys(applicantFlowPage.firstNameReferencesSection, "Caroline");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.middleNameReferencesSection, "Maria");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameReferencesSection, "Smith");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.emailReferencesSection, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.phoneNumberReferencesSection, "2018887765");
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.relationshipsDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.relationshipsSupervisorDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.organizationReferencesSection, "NCI");
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.contactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.yesContactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
    }

        @Then("User uploads not all the documents not marked as optional")
        public void user_uploads_not_all_the_documents_not_marked_as_optional() throws AWTException {
            CommonUtils.clickOnElement(applicantFlowPage.uploadVisStatement);
            MiscUtils.sleep(1000);
            WebElement uploadFile = getWebDriver().findElement(By.xpath("(//input[@type='file'])[1]"));
            MiscUtils.sleep(3000);
            uploadFile.sendKeys("C:\\Users\\nekrashevicha2\\Desktop\\TEST-DATA\\QualificationStatement.docx");
            MiscUtils.sleep(2000);
            applicantFlowStepsImplementation.closeOutlookWindow();
        }

        @Then("User can see an alert")
        public void user_can_see_an_alert() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
            JavascriptUtils.scrollIntoView(applicantFlowPage.alertUploadFile);
            Assert.assertTrue(applicantFlowPage.alertUploadFile.isDisplayed());
        }

        @When("User uploads all the needed documents")
        public void user_upload_all_the_needed_documents() throws AWTException {
            CommonUtils.clickOnElement(applicantFlowPage.uploadVisStatement);
            MiscUtils.sleep(1000);
            WebElement uploadFile = getWebDriver().findElement(By.xpath("(//input[@type='file'])[1]"));
            MiscUtils.sleep(3000);
            uploadFile.sendKeys("C:\\Users\\nekrashevicha2\\Desktop\\TEST-DATA\\QualificationStatement.docx");
            MiscUtils.sleep(2000);
            applicantFlowStepsImplementation.closeOutlookWindow();
            JavascriptUtils.scrollIntoView(applicantFlowPage.uploadCV);
            CommonUtils.clickOnElement(applicantFlowPage.uploadCV);
            MiscUtils.sleep(2000);
            WebElement uploadFile1 = getWebDriver().findElement(By.xpath("(//input[@type='file'])[2]"));
            MiscUtils.sleep(3000);
            uploadFile1.sendKeys("C:\\Users\\nekrashevicha2\\Desktop\\TEST-DATA\\Chris Belles.pdf");
            MiscUtils.sleep(6000);
            applicantFlowStepsImplementation.closeOutlookWindow();
        }

        @Then("User is able to move to Review section")
        public void user_is_able_to_move_to_Review_section() {
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.reviewSectionTitle.isDisplayed());
        }

        @When("User enters only First Name, Last Name, Email Address, and contact directly info in References section")
        public void user_enters_only_First_Name_Last_Name_and_Email_Address() {
            CommonUtils.sendKeys(applicantFlowPage.firstNameReferencesSection, "Caroline");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameReferencesSection, "Smith");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.emailReferencesSection, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.contactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.yesContactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.organizationReferencesSection, "NCI");
            MiscUtils.sleep(1000);
        }

        @When("User enters Email Address incorrectly in References section")
        public void user_enters_Email_Address_incorrectly() {
            CommonUtils.sendKeys(applicantFlowPage.emailReferencesSection, "agmail.com");
            MiscUtils.sleep(2000);
        }

        @Then("User can see email address alerts")
        public void user_can_see_email_address_alerts() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.alertEmail);
            Assert.assertTrue(applicantFlowPage.alertEmail.isDisplayed());
            MiscUtils.sleep(1000);
        }

        @Then("User can move to the Application Documents section")
        public void user_can_move_to_the_Review_section() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.applicationDocumentsTitle);
            Assert.assertTrue(applicantFlowPage.applicationDocumentsTitle.isDisplayed());
            MiscUtils.sleep(1000);
        }

        @Then("User can see References blurb")
        public void user_can_see_References_blurb() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.referencesBlurb);
            Assert.assertTrue(applicantFlowPage.referencesBlurb.isDisplayed());
            MiscUtils.sleep(1000);
    }

        @Then("User can see Relationships dropdown options")
        public void user_can_see_Relationships_dropdown_options(io.cucumber.datatable.DataTable data) {
            CommonUtils.clickOnElement(applicantFlowPage.relationshipsDpReferencesSection);
            MiscUtils.sleep(2000);
            Map<String, String> options = CommonUtil.getMapFromDataTable(data);
            Assert.assertEquals(options.get("option1"),
                    applicantFlowPage.supervisorOption.getAttribute("aria-label"));
            MiscUtils.sleep(1000);
            Assert.assertEquals(options.get("option2"), applicantFlowPage.coworkerOption.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(options.get("option3"), applicantFlowPage.colleagueOption.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(options.get("option4"), applicantFlowPage.peerOption.getText());
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
            MiscUtils.sleep(1000);
        }

        @Then("User  denies for references to be contacted")
        public void user_can_deny_for_references_to_be_contacted() {
            CommonUtils.clickOnElement(applicantFlowPage.contactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.noContactdirectlyDpReferencesSection);
            MiscUtils.sleep(1000);
        }

        @Then("User can see Position Title\\(if applicable) References field")
        public void user_can_see_Position_Title_if_applicable_References_field() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.positionTitleReferencesSection);
            Assert.assertTrue(applicantFlowPage.positionTitleReferencesSection.isDisplayed());
        }

        // @applicationsDashboard
        @When("User is on Your Applications tab")
        public void user_is_on_Your_Applications_tab() {
        CommonUtils.clickOnElement(applicantFlowPage.yourApplicationsTab);
        MiscUtils.sleep(2000);
        Assert.assertTrue(applicantFlowPage.applicationDocumentsTitle.isDisplayed());
        MiscUtils.sleep(1000);
    }

        @Then("User can see the following columns")
        public void user_can_see_the_following_columns(io.cucumber.datatable.DataTable data) {
            Map<String, String> fields = CommonUtil.getMapFromDataTable(data);
            Assert.assertEquals(fields.get("field1"), applicantFlowPage.vacancyTitleField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field2"), applicantFlowPage.stateField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field3"),applicantFlowPage.vacancyClosesField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field4"), applicantFlowPage.applicationSubmittedField.getText());
            MiscUtils.sleep(1000);
            Assert.assertEquals(fields.get("field5"), applicantFlowPage.actionsField.getText());
        }

        // @applicationActions
        @When("User submits an application draft")
        public void user_submits_an_application_draft() {
            CommonUtils.clickOnElement((applicantFlowPage.vpProductDevelopmentVacancy));
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.firstNameField, "Jae");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameField, "Song");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.emailField, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement((applicantFlowPage.saveApplicationButton));
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement((applicantFlowPage.alertBackToApplicationsHome));
            MiscUtils.sleep(1000);
    }

        @When("User chooses to apply for a certain live vacancy")
        public void user_chooses_to_apply_for_a_certain_live_vacancy() {
            CommonUtils.clickOnElement(applicantFlowPage.homeTab);
            WebDriverUtils.webDriver.navigate().refresh();
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.pythonDeveloperVacancy);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.firstNameField, "Jae");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.lastNameField, "Song");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.emailField, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.phoneNumberField, "2026675433");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.businessPhonehoneNumberField, "2123342323");
            MiscUtils.sleep(1000);
            JavascriptUtils.scrollIntoView(applicantFlowPage.yesMinimumDegreeAnswer);
            JavascriptUtils.clickByJS(applicantFlowPage.yesMinimumDegreeAnswer);
            MiscUtils.sleep(2000);
            CommonUtils.clickOnElement(applicantFlowPage.nextButton);
        }

        @When("User enters {} alphanumeric characters for fields Address Line One  and Address Line Two")
        public void user_enters_alphanumeric_characters_for_fields_Address_Line_One_and_Address_Line_Two(Integer amount) {
            CommonUtils.sendKeys(applicantFlowPage.addressLineOne,
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoqbhdcwoqhdw;oqhbwcoqhbohpppppppppppppppppppppppppppppppmm121");
            MiscUtils.sleep(2000);
            CommonUtils.sendKeys(applicantFlowPage.addressLineTwo,
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoqbhdcwoqhdw;oqhbwcoqhbohpppppppppppppppppppppppppppppppmm121");
            MiscUtils.sleep(2000);

        }

        @When("User enters {} alphanumeric characters for field City")
        public void user_enters_alphanumeric_characters_for_field_City(Integer amount) {
            CommonUtils.sendKeys(applicantFlowPage.addressLineCity,
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoxnw@Qknwcf");
            MiscUtils.sleep(2000);
        }

        @When("User enters {} alphanumeric characters for field State\\/Province")
        public void user_enters_alphanumeric_characters_for_field_State_Province(Integer amount) {
            CommonUtils.sendKeys(applicantFlowPage.addressLineState, "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcP");
            MiscUtils.sleep(2000);
        }

        @When("User enters {} alphanumeric character for field Country")
        public void user_enters_alphanumeric_character_for_field_Country(Integer amount) {
            CommonUtils.sendKeys(applicantFlowPage.addressLineCountry,
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcPxbaldnpawsjdpqwodqwfcpqwufjwdj");
        }

        @When("User enters {} alphanumeric character for field Zip\\/Postal Code")
        public void user_enters_alphanumeric_character_for_field_Zip_Postal_Code(Integer amount) {
            CommonUtils.sendKeys(applicantFlowPage.addressLineZipCode, "12345678911");
        }

        @Then("User can verify that field limits are present")
        public void user_can_verify_that_the_limit_alerts_are_present() {
            Assert.assertEquals(
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoqbhdcwoqhdw;oqhbwcoqhbohpppppppppppppppppppppppppppppppmm12",
                    applicantFlowPage.addressLineOne.getAttribute("value"));
            MiscUtils.sleep(1000);
            Assert.assertEquals(
                    "qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoqbhdcwoqhdw;oqhbwcoqhbohpppppppppppppppppppppppppppppppmm12",
                    applicantFlowPage.addressLineTwo.getAttribute("value"));
            MiscUtils.sleep(1000);
            Assert.assertEquals("qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcoxnw@Qknwc",
                    applicantFlowPage.addressLineCity.getAttribute("value"));
            MiscUtils.sleep(1000);
            Assert.assertEquals("qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdc",
                    applicantFlowPage.addressLineState.getAttribute("value"));
            MiscUtils.sleep(1000);
            Assert.assertEquals("qqqqqqqqqqqqcxjqacwhnoqhncwsdohqdw;oqhdcPxbaldnpawsjdpqwodqwfcpqwufjwd",
                    applicantFlowPage.addressLineCountry.getAttribute("value"));
            MiscUtils.sleep(1000);
            Assert.assertEquals("1234567891", applicantFlowPage.addressLineZipCode.getAttribute("value"));MiscUtils.sleep(2000);
        }

        @Then("User can navigate to Your Applications tab")
        public void user_can_navigate_to_Your_Applications_tab() {
            CommonUtils.clickOnElement(applicantFlowPage.yourApplicationsTab);
            MiscUtils.sleep(1000);
        }

        @Then("User can see applications they previously applied for")
        public void user_can_see_applications_they_previously_applied_for() {
            Assert.assertTrue(applicantFlowPage.yourApplicationsHeadline.isDisplayed());
        }

        @Then("User can see application draft when clicking on it")
        public void user_can_see_application_draft_when_clicking_on_it() {
            CommonUtils.clickOnElement(applicantFlowPage.editDraft);
            MiscUtils.sleep(1000);
            Assert.assertTrue(applicantFlowPage.forescoutEngineergDraft.isDisplayed());
        }

        @When("User applies for the same vacancy again")
        public void user_applies_for_the_same_vacancy_again() {
            CommonUtils.clickOnElement(applicantFlowPage.dirOfCybersecurityVacancy);
            MiscUtils.sleep(1000);
            CommonUtils.clickOnElement(applicantFlowPage.applyButton);
            MiscUtils.sleep(3000);
        }

        @Then("User can see an error message {}")
        public void user_can_see_an_error_message(String alert) {
            Assert.assertTrue(applicantFlowPage.alertAlreadyApplied.isDisplayed());
            MiscUtils.sleep(2000);
        }

        @When("User enters Email Address, Phone Number, and leaves field Business Phone Number blank")
        public void user_enters_Email_Address_Phone_Number_and_for_Business_Phone_Number() {
            CommonUtils.sendKeys(applicantFlowPage.emailAddressField, "a@gmail.com");
            MiscUtils.sleep(1000);
            CommonUtils.sendKeys(applicantFlowPage.phoneNumberField, "2026675433");
            MiscUtils.sleep(1000);
        }

        @Then("User can verify that Business Phone Number field shows blank")
        public void user_can_verify_that_Business_Phone_Number_field_shows() {
            JavascriptUtils.scrollIntoView(applicantFlowPage.busPhoneFieldReview);
            Assert.assertTrue(applicantFlowPage.busPhoneFieldReview.isDisplayed());
            MiscUtils.sleep(2000);
        }

        @Then("User can see  documents section alert displayed {string}")
        public void user_can_see_documents_section_alert_displayed(String alert) {
            JavascriptUtils.scrollIntoView(applicantFlowPage.savedDocumentsAlert);
            Assert.assertTrue(applicantFlowPage.savedDocumentsAlert.isDisplayed());
            MiscUtils.sleep(2000);
        }

        @Then("User can see the documents section alert displayed {string}")
        public void user_can_see_the_documents_section_alert_displayed(String alert) {
            JavascriptUtils.scrollIntoView(applicantFlowPage.uniqueFilesDocumentsAlert);
            Assert.assertTrue(applicantFlowPage.uniqueFilesDocumentsAlert.isDisplayed());
            MiscUtils.sleep(2000);
        }

}
