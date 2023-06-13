package ServiceNow.CHARMS.Steps;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.*;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/* @author jains18 */

public class MyRASScreenerSubmissionSteps extends PageInitializer {

    private String referralNumber;
    private HashMap<String, String> geneticSyndromeMap = new HashMap<>();

    /* BEGINNING: RASopathies Longitudinal Cohort Study login page */

    @Given("a participant is on the RASopathies Longitudinal Cohort Study login page {string}")
    public void a_participant_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page(String applicationID) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(applicationID));
    }

    @When("the participant submits a screener for scenario one from excel sheet {string}")
    public void the_participant_submits_a_screener_for_scenario_one_from_excel_sheet(String sheetName) {
        testDataManager.dataInitializer(sheetName);
        rasScreenerStepsImpl.rasScreenerSubmissionScenario1();
    }

    @Then("data submitted for scenario one is verified in native view against scenario one excel sheet")
    public void data_submitted_for_scenario_one_is_verified_in_native_view_against_scenario_one_excel_sheet() {
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
        CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.xpath("(//div[text()='Dashboard'])[3]")));
        CommonUtils.switchToFrame("gsft_main");
        CommonUtils.clickOnElement(charmsNativeViewPage.dynamicDashboardModuleLinkLocator("Need Eligibility Review"));
        CommonUtils.switchToNextWindow();
        CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.xpath("(//td[contains(text(),'DiegoTest JuarezTest')]//ancestor::td/div/table/tbody/tr/td)[2]")));
        CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'Open Record')]")));
    }

    @Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
    public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    @Given("a proband is on the RASopathies Longitudinal Cohort Study login page")
    public void a_proband_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
    }

    /* END: RASopathies Longitudinal Cohort Study login page */
    /* ******************************************************* */
    /* BEGINNING: Logs in via Okta with user name and password */

    @Given("logs in via Okta with username {string} and password {string}")
    public void logs_in_via_Okta_with_username_and_password(String username, String password) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        myRASLoginPage.loginToMyRASButton.click();
        oktaLoginPage.usernameTxtBox.sendKeys(username);
        oktaLoginPage.passwordTxtBox.sendKeys(password);
        CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
        oktaLoginPage.loginBtn.click();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();
    }

    /* END: Logs in via Okta with user name and password */
    /* ******************************************************* */
    /* BEGINNING: Eligibility Questionnaire Link to click */

    @Given("clicks on Eligibility Questionnaire to begin questionnaire")
    public void clicks_on_Eligibility_Questionnaire_to_begin_questionnaire() {
        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyEligibilityQuestionnaire);
        CommonUtils.clickOnElement(myRASHomePage.rasoptathyEligibilityQuestionnaire);
    }

    /* END: Eligibility Questionnaire Link to click */
    /* ******************************************************* */
    /* BEGINNING: STUDY INTRODCTION Page */

    @Given("clicks next after reviewing the STUDY INTRODUCTION")
    public void clicks_next_after_reviewing_the_STUDY_INTRODUCTION() {
        CommonUtils.switchToNextWindow();
        JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
        CommonUtils.clickOnElement(rasopathyQuestionnairePage.studyNextButton);
        MiscUtils.sleep(2000);
    }

    /* END: STUDY INTRODCTION Page */
    /* ******************************************************* */
    /* BEGINNING: For Whom the form is being submitted Page */

    @Given("selects I am completing this form for someone else option")
    public void selects_I_am_completing_this_form_for_someone_else_option() {
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.iAmCompletingThisFormForSomeoneElseOption);
        rasopathyQuestionnairePage.iAmCompletingThisFormForSomeoneElseOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects I am completing this form for myself option")
    public void selects_I_am_completing_this_form_for_myself_option() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: For WHom the form is being submitted Page */
    /* ******************************************************* */
    /* BEGINNING:name of the person who may be eligible for this study? Page */

    @Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is the name of the person who may be eligible for this study?")
    public void enters_First_Name_Middle_Name_Last_Name_for_What_is_the_name_of_the_person_who_may_be_eligible_for_this_study(String firstName, String middleName, String lastName) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.firstNameTextBox);
        rasopathyQuestionnairePage.firstNameTextBox.sendKeys(firstName);
        rasopathyQuestionnairePage.middleNameTextBox.sendKeys(middleName);
        rasopathyQuestionnairePage.lastNameTextBox.sendKeys(lastName);
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END:name of the person who may be eligible for this study? Page */
    /* ******************************************************* */
    /* BEGINNING: What is your name? Page */
    @Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is your name?")
    public void enters_First_Name_Middle_Name_Last_Name_for_What_is_your_name(String firstName, String middleName, String lastName) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.firstNameWhatIsYourNameTextBox);
        rasopathyQuestionnairePage.firstNameWhatIsYourNameTextBox.sendKeys(firstName);
        rasopathyQuestionnairePage.middleNameWhatIsYourNameTextBox.sendKeys(middleName);
        rasopathyQuestionnairePage.lastNameWhatIsYourNameTextBox.sendKeys(lastName);
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: What is your name? Page */
    /* ******************************************************* */
    /* BEGINNING: What is your relationship to the participant? Page */
    @Given("selects Parent for What is your relationship to the participant?")
    public void selects_Parent_for_What_is_your_relationship_to_the_participant() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.whatIsYourRelationshipParentOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }


    /* END:What is your relationship to the participant? Page */
    /* ******************************************************* */
    /* BEGINNING: Options for Are you the legal guardian of the participant? Page */
    @Given("selects No option for Are you the legal guardian of the participant?")
    public void selects_No_option_for_Are_you_the_legal_guardian_of_the_participant() {
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.areYouTheLegalGuardianNoOption);
        rasopathyQuestionnairePage.areYouTheLegalGuardianNoOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Options for Are you the legal guardian of the participant? Page */
    /* ******************************************************* */
    /*
     * BEGINNING: The next set of questions will collect basic information about the
     * participant Page
     */

    /*
     * END: The next set of questions will collect basic information about the
     * participant Page
     */
    /* ******************************************************* */
    /* BEGINNING: participants Date of Birth from the calendar picker? Page */

    @Given("selects participants Date of Birth from the calendar picker")
    public void selects_a_Date_of_Birth_from_the_calendar_picker() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarMonthDropDown);
        rasopathyQuestionnairePage.calendarYearTextBox.clear();
        rasopathyQuestionnairePage.calendarYearTextBox.sendKeys("1990");
        CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarMonthDropDown);
        rasopathyQuestionnairePage.calendarDayOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: participants Date of Birth from the from the calendar picker? Page */
    /* ******************************************************* */
    /* BEGINNING: Options for participants Sex assigned at birth Page */

    @Given("selects Male option for participants Sex assigned at birth")
    public void selects_Male_option_for_Sex_assigned_at_birth() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.sexMaleOptionAssignedAtBirth.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Female option for participants Sex assigned at birth")
    public void selects_Female_option_for_participants_Sex_assigned_at_birth() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.sexFemaleOptionAssignedAtBirth.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Options for participants Sex assigned at birth Page */
    /* ******************************************************* */
    /* BEGINNING: Options for participant being adopted Page */

    @Given("selects Yes option for participant being adopted")
    public void selects_Yes_option_for_being_adopted() {
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantAdoptedYesOption);
        rasopathyQuestionnairePage.isParticipantAdoptedYesOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects No option for participant being adopted")
    public void selects_No_option_for_participant_being_adopted() {
        MiscUtils.sleep(1500);
        rasopathyQuestionnairePage.isParticipantAdoptedNoOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Options for participant being adopted Page */
    /* ******************************************************* */
    /* BEGINNING: Options for participant still being alive Page */

    /*
     * ADDING BELOW QUESTION - UPDATED COUNTRY QUESTION
     */
    @Given("selects country {string} for In which country does participant currently live?")
    public void selects_country_for_In_which_country_does_participant_currently_live(String string) {

    }

    @Given("selects No for participant still being alive")
    public void selects_No_for_participant_still_being_alive() {
        MiscUtils.sleep(1500);
        rasopathyQuestionnairePage.isParticipantStillAliveNoOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Options for participant still being alive Page */
    /* ******************************************************* */
    /* BEGINNING: DOB of the Participant */

    @Given("selects participants Date of Death from the calendar picker")
    public void selects_participants_Date_of_Death_from_the_calendar_picker() {
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarDODMonthDropDown);
        CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarDODMonthDropDown);
        rasopathyQuestionnairePage.calendarDODYearTextBox.clear();
        rasopathyQuestionnairePage.calendarDODYearTextBox.sendKeys("1995");
        rasopathyQuestionnairePage.calendarDODDayOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: DOB of the Participant */
    /* ******************************************************* */
    /* BEGINNING: Option for participant currently living in the United States */


    @Given("selects No option for participant currently living in the United States")
    public void selects_No_option_for_participant_currently_living_in_the_United_States() {
        MiscUtils.sleep(1500);
        rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesNoOption.click();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Option for participant currently living in the United States */
    /* ******************************************************* */
    /* BEGINNING: Enters mailing address for where study materials can be sent */

    @Given("enters mailing address for where study materials can be sent, street {string} street {string} city {string} state {string} Province {string} Country {string}")
    public void enters_mailing_address_for_where_study_materials_can_be_sent_street_street_city_state_Province_Country(String street, String streetOption, String city, String state, String province, String country) {
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreet2TextBox.sendKeys(streetOption);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentProvinceTextBox.sendKeys(province);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCountryTextBox.sendKeys(country);
        rasopathyQuestionnairePage.studyNextButton.click();
    }


    @Given("enters mailing address for where study materials can be sent, street {string} street Optional {string} city {string} state {string} zip code {string}")
    public void enters_mailing_address_for_where_study_materials_can_be_sent_street_street_Optional_city_state_zip_code(String street, String streetOptional, String city, String state, String zipCode) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreet2TextBox.sendKeys(streetOptional);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
        rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Enters mailing address for where study materials can be sent */
    /* ******************************************************* */
    /* BEGINNING: Enters email address */

    @Given("enters proband email address {string}")
    public void enters_proband_email_address(String probandEmailAddress) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox);
        rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox.sendKeys(probandEmailAddress);
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("enters proband email address {string} to confirm email address")
    public void enters_proband_email_address_to_confirm_email_address(String probandEmailAddressConfirm) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox);
        rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox.sendKeys(probandEmailAddressConfirm);
        rasopathyQuestionnairePage.studyNextButton.click();
    }


    /* END: Enters email address */
    /* ******************************************************* */
    /* BEGINNING: Enters Phone Numbers details */

    @Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects cell phone number as Preferred Contact")
    public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_cell_phone_number_as_Preferred_Contact(String foreignhomePhoneNumber, String foreigncellPhoneNumber, String foreignWorkPhoneNumber) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(foreignhomePhoneNumber);
        rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(foreigncellPhoneNumber);
        rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(foreignWorkPhoneNumber);
        rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects home phone number as Preferred Contact")
    public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_home_phone_number_as_Preferred_Contact(String foreignhomePhoneNumber, String foreigncellPhoneNumber, String foreignWorkPhoneNumber) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(foreignhomePhoneNumber);
        rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(foreigncellPhoneNumber);
        rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(foreignWorkPhoneNumber);
        rasopathyQuestionnairePage.pleaseSelectHomePhonePreferredContactCheckBox.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects Work phone number as Preferred Contact")
    public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_Work_phone_number_as_Preferred_Contact(String homePhoneNumber, String cellPhoneNumber, String workPhoneNumber) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox);
        rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
        rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
        rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(homePhoneNumber);
        rasopathyQuestionnairePage.pleaseSelectWorkPhonePreferredContactCheckBox.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }
    /* END: Enters Phone Numbers details */
    /* ******************************************************* */
    /* BEGINNING: Select Ethnicity of the participant */

    @Given("selects Hispanic\\/Latino option for Ethnicity of participant")
    public void selects_Hispanic_Latino_option_for_Ethnicity_of_participant() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption);
        rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Not Hispanic\\/Latino option for Ethnicity of participant")
    public void selects_Not_Hispanic_Latino_option_for_Ethnicity_of_participant() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption);
        rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Unknown option for Ethnicity of participant")
    public void selects_Unknown_option_for_Ethnicity_of_participant() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantUnKnownOption);
        rasopathyQuestionnairePage.authenticityOfParticipantUnKnownOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Select Ethnicity of the participant */
    /* ******************************************************* */
    /* BEGINNING: Selecting Race of the participant */

    @Given("selects White, Black\\/African American, Native Hawaiian\\/Pacific Islander, American Indian\\/Alaskan Native, Asian and enters {string} for other when selecting Race of participant")
    public void selects_White_Black_African_American_Native_Hawaiian_Pacific_Islander_American_Indian_Alaskan_Native_Asian_and_enters_for_other_when_selecting_Race_of_participant(String otherRace) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.raceOfParticipantOtherTextBox);
        rasopathyQuestionnairePage.raceOfParticipantWhite.click();
        rasopathyQuestionnairePage.raceOfParticipantBlackAfricanAmerican.click();
        rasopathyQuestionnairePage.raceOfParticipantnativeHawaiianPacificIslander.click();
        rasopathyQuestionnairePage.raceOfParticipantAmericanIndianAlaskanNative.click();
        rasopathyQuestionnairePage.raceOfParticipantAsian.click();
        rasopathyQuestionnairePage.raceOfParticipantOther.click();
        rasopathyQuestionnairePage.raceOfParticipantOtherTextBox.sendKeys(otherRace);
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Prefer not to answer for other when selecting Race of participant")
    public void selects_Prefer_not_to_answer_for_other_when_selecting_Race_of_participant() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.raceOfParticipantPreferNotToAnswer.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Selecting Race of the participant being */
    /* ******************************************************* */
    /* BEGINNING: Selects for participant being in other research study */

    @Given("selects Rasopathies Net,I am not involved in any other research study or registry group,Not sure, and enters {string} for Family Advocacy Group and enters {string} for other for is the participant participated in any other research study or registry group?")
    public void selects_Rasopathies_Net_I_am_not_involved_in_any_other_research_study_or_registry_group_Not_sure_and_enters_for_Family_Advocacy_Group_and_enters_for_other_for_is_the_participant_participated_in_any_other_research_study_or_registry_group(String familyAdvocacyGroup, String otherText) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.isParticipantInResopathiesNetOption.click();
        rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
        rasopathyQuestionnairePage.isParticipantNotSureOption.click();
        rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOption.click();
        rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOptionTextBox.sendKeys(familyAdvocacyGroup);
        rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOption.click();
        rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOptionTextBox.sendKeys(otherText);
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Rasopathies Net and enters {string} for Family Advocacy Group and enters {string} for other for is the participant participated in any other research study or registry group?")
    public void selects_Rasopathies_Net_and_enters_for_Family_Advocacy_Group_and_enters_for_other_for_is_the_participant_participated_in_any_other_research_study_or_registry_group(String familyAdvocacyGroup, String otherText) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.isParticipantInResopathiesNetOption.click();
        rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
        rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOption.click();
        rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOptionTextBox.sendKeys(familyAdvocacyGroup);
        rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOption.click();
        rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOptionTextBox.sendKeys(otherText);
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects I am not involved in any other research study or registry group for is the participant participated in any other research study or registry group?")
    public void selects_I_am_not_involved_in_any_other_research_study_or_registry_group_for_is_the_participant_participated_in_any_other_research_study_or_registry_group() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Not sure for is the participant participated in any other research study or registry group?")
    public void selects_Not_sure_for_is_the_participant_participated_in_any_other_research_study_or_registry_group() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.isParticipantNotSureOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Selects for participant being in other research study */
    /* ******************************************************* */
    /* BEGINNING: proceeds with providing information for medical diagnosis Page */


    /* END: proceeds with providing information for medical diagnosis Page */
    /* ******************************************************* */
    /*
     * BEGINNING: Selects option for participant being diagnosed with any of the
     * listed conditions
     */

    @Given("selects Feeding problems, failure to thrive, or other stomach\\/digestive problems option for participant being diagnosed with any of the listed conditions")
    public void selects_Feeding_problems_failure_to_thrive_or_other_stomach_digestive_problems_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption);
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption.click();
    }

    @Given("selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions")
    public void selects_Neurocognitive_developmental_delay_such_as_Intellectual_disability_and_language_impairment_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNeurocognitiveDelayOption.click();
    }

    @Given("selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions")
    public void selects_Skeletal_deformities_such_as_Short_stature_short_webbed_neck_unusual_chest_shape_curved_spine_muscle_or_joint_problems_limb_overgrowth_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsSkeletalDeformitiesOption.click();
    }

    @Given("selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions")
    public void selects_Head_craniofacial_abnormalities_such_as_Large_head_broad_or_high_forehead_short_nose_small_chin_swelling_or_bleeding_of_the_gums_abnormal_shape_or_movement_of_teeth_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsHeadCraniofacialAbnormalitiesOption.click();
    }

    @Given("selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions")
    public void selects_Eye_Ear_abnormalities_such_as_Widely_spaced_eyes_eye_diseases_droopy_eye_lids_sparse_absent_eye_lashes_eyebrows_low_set_ears_vision_or_hearing_impairment_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsEyeEarAbnormalitiesOption.click();
    }

    @Given("selects skin\\/hair abnormalitiessuch as: soft loose skin, fine\\/thin\\/thick\\/dry\\/brittle\\/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks \\(cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions")
    public void selects_skin_hair_abnormalitiessuch_as_soft_loose_skin_fine_thin_thick_dry_brittle_curly_hair_slow_growing_hair_tumors_or_small_skin_tags_near_the_nose_or_anus_lipomas_light_to_dark_brown_birth_marks_cafe_au_lait_spots_freckles_in_the_armpits_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsSkinHairAbnormalitiesOption.click();
    }

    @Given("selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions")
    public void selects_Heart_problems_such_as_cardiomyopathy_or_pulmonary_valve_stenosis_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsHeartProblemsOption.click();
    }

    @Given("selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions")
    public void selects_Genital_abnormalities_such_as_undescended_testes_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsGenitalAbnormalitiesOption.click();
    }

    @Given("selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions")
    public void selects_Non_cancerous_tumors_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNonCancerousTumorsOption.click();
    }

    @Given("selects Lymphedema or participant being diagnosed with any of the listed conditions")
    public void selects_Lymphedema_or_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsLymphedemaOption.click();
    }

    @Given("selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions")
    public void selects_Other_such_as_endocrine_issues_bleeding_disorders_seizures_tethered_cord_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsOtherOption.click();
    }

    @Given("selects Never diagnosed with any of these conditions option for participant being diagnosed with any of the listed conditions")
    public void selects_Never_diagnosed_with_any_of_these_conditions_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNeverDiagnosedOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();

    }

    /*
     * END: Selects option for participant being diagnosed with any of the listed
     * conditions
     */
    /* ******************************************************* */
    /* BEGINNING: Selects option for participant being diagnosed with cancer */


    @Given("selects No option for participant being diagnosed with cancer")
    public void selects_No_option_for_participant_being_diagnosed_with_cancer() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerNoOption);
        rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects No option for currently receiving treatment")
    public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_No_option_for_currently_receiving_treatment(String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType, String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge, String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis, String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(firstCancerType, rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(secondCancerType, rasopathyQuestionnairePage.primaryCancerSecondDropDown);
        CommonUtils.selectDropDownValue(thirdCancerType, rasopathyQuestionnairePage.primaryCancerThirdDropDown);
        CommonUtils.selectDropDownValue(fourthCancerType, rasopathyQuestionnairePage.primaryCancerFourthDropDown);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox.sendKeys(firstCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisSecondTextBox.sendKeys(secondCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisThirdTextBox.sendKeys(thirdCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisFourthTextBox.sendKeys(fourthCancerTypeAge);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox.sendKeys(firstCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisSecondTextBox.sendKeys(secondCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisThirdTextBox.sendKeys(thirdCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisFourthTextBox.sendKeys(fourthCancerYearOfDiagnosis);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.currentlyReceivingNoTreatmentFirstRadioButton);
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentFirstRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentSecondRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentThirdRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentFourthRadioButton.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and enters Other cancers options {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects No option for currently receiving treatment")
    public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_enters_Other_cancers_options_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_No_option_for_currently_receiving_treatment(String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType, String otherCancerType1, String otherCancerType2, String otherCancerType3, String otherCancerType4, String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge, String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis, String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(firstCancerType, rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(secondCancerType, rasopathyQuestionnairePage.primaryCancerSecondDropDown);
        CommonUtils.selectDropDownValue(thirdCancerType, rasopathyQuestionnairePage.primaryCancerThirdDropDown);
        CommonUtils.selectDropDownValue(fourthCancerType, rasopathyQuestionnairePage.primaryCancerFourthDropDown);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.otherCancerOptionFirst);
        rasopathyQuestionnairePage.otherCancerOptionFirst.sendKeys(otherCancerType1);
        rasopathyQuestionnairePage.otherCancerOptionSecond.sendKeys(otherCancerType2);
        rasopathyQuestionnairePage.otherCancerOptionThird.sendKeys(otherCancerType3);
        rasopathyQuestionnairePage.otherCancerOptionFourth.sendKeys(otherCancerType4);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox.sendKeys(firstCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisSecondTextBox.sendKeys(secondCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisThirdTextBox.sendKeys(thirdCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisFourthTextBox.sendKeys(fourthCancerTypeAge);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox.sendKeys(firstCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisSecondTextBox.sendKeys(secondCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisThirdTextBox.sendKeys(thirdCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisFourthTextBox.sendKeys(fourthCancerYearOfDiagnosis);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton);
        rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingTreatmentSecondRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingTreatmentThirdRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingTreatmentFourthRadioButton.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and enters Other cancers options {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects Yes option for currently receiving treatment")
    public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_enters_Other_cancers_options_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_Yes_option_for_currently_receiving_treatment(String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType, String otherCancerType1, String otherCancerType2, String otherCancerType3, String otherCancerType4, String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge, String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis, String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(firstCancerType, rasopathyQuestionnairePage.primaryCancerFirstDropDown);
        CommonUtils.selectDropDownValue(secondCancerType, rasopathyQuestionnairePage.primaryCancerSecondDropDown);
        CommonUtils.selectDropDownValue(thirdCancerType, rasopathyQuestionnairePage.primaryCancerThirdDropDown);
        CommonUtils.selectDropDownValue(fourthCancerType, rasopathyQuestionnairePage.primaryCancerFourthDropDown);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.otherCancerOptionFirst);
        rasopathyQuestionnairePage.otherCancerOptionFirst.sendKeys(otherCancerType1);
        rasopathyQuestionnairePage.otherCancerOptionSecond.sendKeys(otherCancerType2);
        rasopathyQuestionnairePage.otherCancerOptionThird.sendKeys(otherCancerType3);
        rasopathyQuestionnairePage.otherCancerOptionFourth.sendKeys(otherCancerType4);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.ageAtDiagnosisFirstTextBox.sendKeys(firstCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisSecondTextBox.sendKeys(secondCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisThirdTextBox.sendKeys(thirdCancerTypeAge);
        rasopathyQuestionnairePage.ageAtDiagnosisFourthTextBox.sendKeys(fourthCancerTypeAge);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox);
        rasopathyQuestionnairePage.yearOfDiagnosisFirstTextBox.sendKeys(firstCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisSecondTextBox.sendKeys(secondCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisThirdTextBox.sendKeys(thirdCancerYearOfDiagnosis);
        rasopathyQuestionnairePage.yearOfDiagnosisFourthTextBox.sendKeys(fourthCancerYearOfDiagnosis);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton);
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentFirstRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentSecondRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentThirdRadioButton.click();
        rasopathyQuestionnairePage.currentlyReceivingNoTreatmentFourthRadioButton.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: Selects option for participant being diagnosed with cancer */
    /* ******************************************************* */
    /*
     * BEGINNING: Have participant been diagnosed with a RASopathy such as Noonan
     * syndrome, Noonan syndrome with multiple lentigines, Costello syndrome
     */

    @Given("selects No option for participant being diagnosed with a Rasopathy")
    public void selects_No_option_for_participant_being_diagnosed_with_a_Rasopathy() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption);
        rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects No option for proband being diagnosed with a Rasopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome")
    public void selects_No_option_for_proband_being_diagnosed_with_a_Rasopathy_such_as_Noonan_syndrome_Noonan_syndrome_with_multiple_lentigines_Costello_syndrome() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProbandBeenDiagnosedWithaRasopathyNoOption);
        rasopathyQuestionnairePage.hasProbandBeenDiagnosedWithaRasopathyNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /*
     * END: Have you been diagnosed with a RASopathy such as Noonan syndrome, Noonan
     * syndrome with multiple lentigines, Costello syndrome
     */
    /* ******************************************************* */
    /* BEGINNING: selecting a specific RASopathy diagnosed of the participant */


    @Given("selects Dont Know for selecting a specific RASopathy diagnosed of the participant")
    public void selects_Dont_Know_for_selecting_a_specific_RASopathy_diagnosed_of_the_participant() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.participantSpecificRasopathyDontKnowOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: selecting a specific RASopathy diagnosed of the participant */
    /* ******************************************************* */
    /* BEGINNING: Entering participants age in years of diagnosis */


    /* END: Entering participants age in years of diagnosis */
    /* ******************************************************* */
    /* BEGINNING: Entering participants year of diagnosis */


    /* END: Entering participants year of diagnosis */
    /* ******************************************************* */
    /* BEGINNING:proceeds with providing genetic testing information page */


    /* END: proceeds with providing genetic testing information page */
    /* ******************************************************* */
    /*
     * BEGINNING:option to biological representatives of participants having been
     * diagnosed with a RASopathy page
     */


    @Given("selects No option to family members of participants having been diagnosed with a RASopathy")
    public void selects_No_option_to_family_members_of_participants_having_been_diagnosed_with_a_RASopathy() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects I have no information on my biological relatives option to family members of participants having been diagnosed with a RASopathy")
    public void selects_I_have_no_information_on_my_biological_relatives_option_to_family_members_of_participants_having_been_diagnosed_with_a_RASopathy() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedhaveNoInformationOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects I have no information on my biological relatives option for Have any of your biological relatives been diagnosed with a RASopathy?")
    public void selects_I_have_no_information_on_my_biological_relatives_option_for_Have_any_of_your_biological_relatives_been_diagnosed_with_a_RASopathy() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.probandFamilyMembersBeenDiagnosedIDontKnowOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /*
     * END: option to biological representatives of participants having been
     * diagnosed with a RASopathy
     */
    /* ******************************************************* */
    /* BEGINNING: options for participant having had genetic testing */


    @Given("selects No option to participant having had genetic testing")
    public void selects_No_option_to_participant_having_had_genetic_testing() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.participantsEverHadGeneticTestingNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Not sure option to participant having had genetic testing")
    public void selects_Not_sure_option_to_participant_having_had_genetic_testing() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.participantsEverHadGeneticTestingNotSureOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: options for participant having had genetic testing */
    /* ******************************************************* */
    /* BEGINNING:options for participant having a copy of genetic test results */


    /* END: options for participant having a copy of genetic test results */
    /* ******************************************************* */
    /*
     * BEGINNING:options for any genetic changes detected for the following
     * syndromes for the participant
     */


    /*
     * END: options for any genetic changes detected for the following syndromes for
     * the participant
     */
    /* ******************************************************* */
    /*
     * BEGINNING:user proceeds on answering few remaining questions regarding the
     * study
     */


    /* END:user proceeds on answering few remaining questions regarding the study */
    /* ******************************************************* */
    /* BEGINNING: How did you hear about this study. */


    @Given("selects Websearch for how did you hear about this study?")
    public void selects_Websearch_for_how_did_you_hear_about_this_study() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.howDidYouHearAboutWebSearchOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Family member for how did you hear about this study?")
    public void selects_Family_member_for_how_did_you_hear_about_this_study() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.howDidYouHearAboutFamilyMemberOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Support Group for how did you hear about this study?")
    public void selects_Support_Group_for_how_did_you_hear_about_this_study() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.howDidYouHearAboutSupportGroupOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects Genetic counselor option and enters {string} for how did you hear about this study?")
    public void selects_Genetic_counselor_option_and_enters_for_how_did_you_hear_about_this_study(String GeneticCounselorText) {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.howDidYouHearAboutGeneticCounselorOption.click();
        rasopathyQuestionnairePage.howDidYouHearAboutGeneticCounselorTextBox.sendKeys(GeneticCounselorText);
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /* END: How did you hear about this study. */
    /* ******************************************************* */
    /*
     * BEGINNING:Options for the participant or other family members ever
     * participated in another study on RASopathies
     */


    @Given("selects No option for the participant or other family members ever participated in another study on RASopathies at another medical institution")
    public void selects_No_option_for_the_participant_or_other_family_members_ever_participated_in_another_study_on_RASopathies_at_another_medical_institution() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyNoOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @Given("selects the Not sure option for the participant or other family members ever participated in another study on RASopathies at another medical institution")
    public void selects_the_Not_sure_option_for_the_participant_or_other_family_members_ever_participated_in_another_study_on_RASopathies_at_another_medical_institution() {
        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyNotSureOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    /*
     * END:Options for the participant or other family members ever participated in
     * another study on RASopathies
     */
    /* ******************************************************* */
    /*
     * BEGINNING:Provides information regarding previous participation in other
     * RASopathy studies
     */


    /*
     * END:Provides information regarding previous participation in other RASopathy
     * studies
     */
    /* ******************************************************* */
    /* BEGINNING: What are the main reasons for participating in this study */


    /* END: What are the main reasons for participating in this study */
    /* ******************************************************* */
    /* BEGINNING: Proceeds with submitting the Eligibility Questionnaire */

    /* END: Proceeds with submitting the Eligibility Questionnaire */
    /* ******************************************************* */
    /* BEGINNING: Eligibility Questionnaire is successfully submitted- */


    /* END: Eligibility Questionnaire is successfully submitted */

    /* ******************************************************************* */
    /* ******************************************************************* */

    /* LOGIN TO SERVICE NOW */
    @When("a ServiceNow user navigates to CHARMS Native view and opens records that are Waiting for Elegibility Review")
    public void a_ServiceNow_user_navigates_to_CHARMS_Native_view_and_opens_records_that_are_Waiting_for_Elegibility_Review() throws TestingException {
        MiscUtils.sleep(1000);
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
        charmsNativeViewPage.nativeViewDashboardLink.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewWaitingForElegibilityReviewButton);
        CucumberLogUtils.logScreenShot();
        charmsNativeViewPage.nativeViewWaitingForElegibilityReviewButton.click();
    }

    /* SELECTS THE SUBMITTED MYRAS SCREENER RECORD */
    @Given("selects the submitted MyRAS screener record")
    public void selects_the_submitted_MyRAS_screener_record() {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();
        MiscUtils.sleep(3000);
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();
    }

    /* VERIFIES DATA SUBMITTED IN QUALTRICS IS IMPORTED AS EXPECTED IN SERVICENOW */
    @Given("verifies data submitted in Qualtrics is imported as expected in ServiceNow")
    public void verifies_data_submitted_in_Qualtrics_is_imported_as_expected_in_ServiceNow() {

        referralNumber = (charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordReferral.getAttribute("value"));

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNameText);
        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNameText.getAttribute("value").contentEquals("AutomatedFirstNameOfParticipant AutomatedLastNameOfParticipant"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordWaitingForEligibilityText.getText().contentEquals("Waiting for Eligibility"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNewScreenerReceivedText.getText().contentEquals("New Screener Received"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMayWeHaveYourPermissionToContactThisRelativeYesText.getText().contentEquals("Yes"));

    }

    /* VERIFIES PERSONAL INFORMATION TAB DATA IN FAMILY MEMBERS DETAILS PAGE */
    @When("verifies Personal Information data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Personal_Information_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTab);
        charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue(charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTabRelationshipToYou.getAttribute("value").contentEquals("proband"));

        Assert.assertTrue(charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTabFirstName.getAttribute("value").contentEquals("AutomatedFirstNameOfParticipant"));

        Assert.assertTrue(charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTabMiddleName.getAttribute("value").contentEquals("Middle"));

        Assert.assertTrue(charmsNativeViewPage.nVFamilyMemberDetailsRecordPersonalInformationTabLastName.getAttribute("value").contentEquals("AutomatedLastNameOfParticipant"));

    }

    /* VERIFIES DEMOGRAPHICS TAB DATA IN FAMILY MEMBERS DETAILS PAGE */
    @When("verifies Demographics data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Demographics_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTab.click();
        MiscUtils.sleep(3000);

        Assert.assertTrue("Is the participant adopted Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabBiologicalGender.getText().contentEquals("Male"));

        Assert.assertTrue("Participants identified gender Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabParticipantsIdentifiedGender.getText().contentEquals("-- None --"));

        Assert.assertTrue("Is the participant Ethinicity Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabEthnicity.getText().contentEquals("Not Hispanic/Latino"));

        Assert.assertTrue("Is the participant adopted Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabIsTheParticipantAdopted.getText().contentEquals("Yes"));

        Assert.assertTrue("Participant DOB Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabParticipantDOB.getAttribute("value").contentEquals("04/01/1990"));

        Assert.assertTrue("If Date of Birth is unkown, is this person 18 years old or older Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabIfDOBUnknownAge18.getText().contentEquals("-- None --"));

        Assert.assertTrue("Participant Age Data Field is not blank", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabParticipantAge.getText().contentEquals(""));

        Assert.assertTrue("Participant Race (Select all that apply) Data Field do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabParticipantRace.getText().contentEquals("Caucasian (white), Black/African American, Native Hawaiian/Other Pacific Islander, American Indian/Alaskan Native, Asian, Other"));

        CommonUtils.assertTrueJUNIT("Participant Race Other Text Field  do not match", charmsNativeViewPage.nVFamilyMemberDetailsRecordDemographicsTabParticipantRaceOtherText.getAttribute("value").contentEquals("Entering other Race"));

    }

    /* VERIFIES CONTACT INFO TAB DATA IN FAMILY MEMBERS DETAILS PAGE */
    @When("verifies Contact Info data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Contact_Info_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTab);

        charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Does the participant need legal representation?: ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabDoesParticipantNeedLegalRepresentation.getText().contentEquals("Yes"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Legal Representative Name :", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabLegalRepresentativeName.getAttribute("value").contentEquals("FirstNameOfProxyTest  MiddleNameTest  lastNameOfProxyTest"));
        // Assert.assertTrue("This is a Contact Info Tab mismatch data for the Legal
        // Representative Name :",
        // charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabLegalRepresentativeName
        // .getAttribute("value")
        // .contentEquals("FirstNameOfProxyTest MiddleNameTest lastNameOfProxyTest"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the What is your relationship to this person? :", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabWhatIsYourRelationshipToThisPerson.getText().contentEquals("Other"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Are you the legal guardian of this person? : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabAreYouTheLegalGuardianOfThisPerson.getText().contentEquals("Yes"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Please specify your relationship to the participant : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabSpecifyYourRelationshipToTheParticipant.getAttribute("value").contentEquals(""));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Contact Street Address : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabStreetAddress.getAttribute("value").contentEquals("9609 Medical Center Dr New Avenue Park"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Contact State : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabState.getAttribute("value").contentEquals("MD"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Contact City : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabCity.getAttribute("value").contentEquals("Rockville"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Contact Country: ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabCountry.getText().contentEquals("U.S.A"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Contact Zipcode : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabZipcode.getAttribute("value").contentEquals("20850"));

        CommonUtils.assertTrueJUNIT("This is a Contact Info Tab mismatch data for the Contact Email : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabEmail.getAttribute("value").contentEquals("automatedTest@nci.gov"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Contact Home Phone : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabHomePhone.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Contact Cell Phone : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabCellPhone.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue("This is a Contact Info Tab mismatch data for the Contact Work Phone : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordContactInfoTabWorkPhone.getAttribute("value").contentEquals("703-687-5816"));

    }

    /* VERIFIES MEDICAL INFORMATION TAB DATA IN FAMILY MEMBERS DETAILS PAGE */
    @When("verifies Medical Information data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Medical_Information_data_submitted_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nVFamilyMemberDetailsRecordMedicalInfoTab);

        charmsNativeViewPage.nVFamilyMemberDetailsRecordMedicalInfoTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is a Medical Information Tab mismatch data for the Has a physician ever diagnosed this participant with cancer? : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordMedicalInfoPhysicianDiagnosedParticipantWithCancer.getText().contentEquals("Yes"));

        Assert.assertTrue("This is a Medical Information Tab mismatch data for the Has the participant ever had genetic testing? : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordMedicalInfoParticipantEverHadGeneticTesting.getText().contentEquals("Yes"));

        Assert.assertTrue("This is a Medical Information Tab mismatch data for the Vital Status : ", charmsNativeViewPage.nVFamilyMemberDetailsRecordMedicalInfoParticipantVitalStatus.getText().contentEquals("Alive"));

    }

    /* VERIFIES DATA IN THE PARTICIPANT CANCER HISTORY TAB */
    @When("verifies Participant Cancer History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Participant_Cancer_History_data_submitted_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        charmsNativeViewPage.nVReferralPatientCancerIntakeFormForSkinCancerButton.click();
        MiscUtils.sleep(1000);
        charmsNativeViewPage.nVReferralPatientIntakeFormPreviewOpenRecordButton.click();

        MiscUtils.sleep(3000);
        Assert.assertTrue("This is Participant Cancer History mismatch data for Cancer Type or Site for Skin cancer  : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCancerTypeOrSite.getAttribute("value").contentEquals("Skin cancer (i.e.Melanoma)"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Currently being treated for Skin cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCurrentlyBeingTreated.getText().contentEquals("Yes"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Year of diagnosis for Skin cancer: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormYearOfDiagnosis.getAttribute("value").contentEquals("2003"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for How old was the research participant when the cancer was diagnosed? for Skin cancer: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormHowOldWasParticipantWhenCancerWasDiagnosed.getAttribute("value").contentEquals("23"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for If unknown, please select an age range for Skin cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormIfUnknownSelectAgeRange.getText().contentEquals("-- None --"));

        charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();

        /* --------------------------------------------------------------- */

        charmsNativeViewPage.nVReferralPatientCancerIntakeFormForBreastLeftButton.click();
        MiscUtils.sleep(1000);
        charmsNativeViewPage.nVReferralPatientIntakeFormPreviewOpenRecordButton.click();

        MiscUtils.sleep(3000);
        Assert.assertTrue("This is Participant Cancer History mismatch data for Cancer Type or Site cancer for Breast Left  : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCancerTypeOrSite.getAttribute("value").contentEquals("Breast left"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Currently being treated for Breast Left : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCurrentlyBeingTreated.getText().contentEquals("Yes"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Year of diagnosis for Breast Left: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormYearOfDiagnosis.getAttribute("value").contentEquals("2002"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for How old was the research participant when the cancer was diagnosed? for Breast Left: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormHowOldWasParticipantWhenCancerWasDiagnosed.getAttribute("value").contentEquals("22"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for If unknown, please select an age range for Breast Left : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormIfUnknownSelectAgeRange.getText().contentEquals("-- None --"));

        charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();

        /* --------------------------------------------------------------- */

        charmsNativeViewPage.nVReferralPatientCancerIntakeFormForAnalCancerButton.click();
        MiscUtils.sleep(1000);
        charmsNativeViewPage.nVReferralPatientIntakeFormPreviewOpenRecordButton.click();

        MiscUtils.sleep(3000);
        Assert.assertTrue("This is Participant Cancer History mismatch data for Cancer Type or Site cancer for Anal Cancer: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCancerTypeOrSite.getAttribute("value").contentEquals("Anal cancer"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Currently being treated for Anal Cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCurrentlyBeingTreated.getText().contentEquals("Yes"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Year of diagnosis for Anal Cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormYearOfDiagnosis.getAttribute("value").contentEquals("2001"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for How old was the research participant when the cancer was diagnosed? for Anal Cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormHowOldWasParticipantWhenCancerWasDiagnosed.getAttribute("value").contentEquals("21"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for If unknown, please select an age range for Anal Cancer : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormIfUnknownSelectAgeRange.getText().contentEquals("-- None --"));

        charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();

        /* --------------------------------------------------------------- */

        charmsNativeViewPage.nVReferralPatientCancerIntakeFormForAdrenalGlandButton.click();
        MiscUtils.sleep(1000);
        charmsNativeViewPage.nVReferralPatientIntakeFormPreviewOpenRecordButton.click();

        MiscUtils.sleep(3000);
        Assert.assertTrue("This is Participant Cancer History mismatch data for Cancer Type or Site cancer for Adrenal Gland: ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCancerTypeOrSite.getAttribute("value").contentEquals("Adrenal Gland"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Currently being treated for Adrenal Gland : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormCurrentlyBeingTreated.getText().contentEquals("Yes"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for Year of diagnosis for Adrenal Gland : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormYearOfDiagnosis.getAttribute("value").contentEquals("2000"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for How old was the research participant when the cancer was diagnosed? for Adrenal Gland : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormHowOldWasParticipantWhenCancerWasDiagnosed.getAttribute("value").contentEquals("20"));

        Assert.assertTrue("This is Participant Cancer History mismatch data for If unknown, please select an age range for Adrenal Gland : ", charmsNativeViewPage.nVReferralPatientCancerIntakeFormIfUnknownSelectAgeRange.getText().contentEquals("-- None --"));

        charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();

    }

    /* VERIFIES DATA IN THE PARTICIPANT GENETIC HISTORY TAB */
    @When("verifies Participant Genetic History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow")
    public void verifies_Participant_Genetic_History_data_submitted_Qualtrics_is_imported_as_expected_in_the_Family_Member_Details_page_of_ServiceNow() {

        referralNumber = (charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordReferral.getAttribute("value"));

        charmsNativeViewPage.nVParticipantGeneticHistoryTab.click();
        MiscUtils.sleep(2000);
        List<WebElement> tBodyList = charmsNativeViewPage.participantGeneticHistoryTable.findElements(By.tagName("tbody"));

        WebElement tBody = tBodyList.get(0);
        List<WebElement> rowList = tBody.findElements(By.tagName("tr"));

        for (int j = 0; j < rowList.size(); j++) {
            WebElement row;
            if (0 != j) {
                tBodyList = charmsNativeViewPage.participantGeneticHistoryTable.findElements(By.tagName("tbody"));

                tBody = tBodyList.get(0);
                rowList = tBody.findElements(By.tagName("tr"));
                // scroll to the bottom of the page
                ((JavascriptExecutor) WebDriverUtils.webDriver).executeScript("arguments[0].scrollIntoView();", charmsNativeViewPage.participantGeneticHistoryTable);
            }
            row = rowList.get(j);

            List<WebElement> columnList = row.findElements(By.tagName("td"));
            if (columnList.size() >= 4) {
                for (int i = 0; i < columnList.size(); i++) {
                    if (2 == i) {
                        WebElement desciptionCol = columnList.get(i);
                        String description = desciptionCol.getAttribute("title");
                        if (!("").equals(description)) {
                            WebElement testResultColumn = columnList.get(i + 1);
                            String testResult = testResultColumn.getText();

                            WebElement previewIcon = columnList.get(i - 1);
                            previewIcon.click();

                            MiscUtils.sleep(1000);

                            charmsNativeViewPage.nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframeOpenRecord.click();

                            MiscUtils.sleep(1000);

                            MiscUtils.sleep(2000);
                            Assert.assertTrue("This is Participant Genetic History mismatch data for Test Result? : ", charmsNativeViewPage.nVParticipantGeneticTestResult.getAttribute("value").contentEquals("Positive"));

                            Assert.assertTrue("This is Participant Genetic History mismatch data for Intake Form REFERRAL ID: ", charmsNativeViewPage.nVParticipantGeneticIntakeFormReferralId.getAttribute("value").contentEquals(referralNumber));

                            charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();
                            MiscUtils.sleep(2000);
                        }
                        break;
                    }

                }

            }
        }

    }

    /* VERIFIES DATA IN THE RAS REFERRAL PAGE */
    @When("verifies data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        Assert.assertTrue("This is RAS REFERRAL field mismatch data for the auto Populated Referral Number: ", charmsNativeViewPage.nVFamilyMemberDetailsRecordPageReferral.getAttribute("value").contentEquals(referralNumber));

        charmsNativeViewPage.nVFamilyMemberDetailsRecordPagePreviewReferralRecordButton.click();
        MiscUtils.sleep(3000);
        // CommonUtils.switchToFrame(charmsNativeViewPage.nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframe);
        // CommonUtils.waitForVisibility(
        // charmsNativeViewPage.nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframeOpenRecord);
        charmsNativeViewPage.nVFamilyMemberDetailsRecordPagePreviewReferralRecordIframeOpenRecord.click();

        MiscUtils.sleep(1000);
        Assert.assertTrue("The RAS REFERRAL BAR TITLE NOT DISPLAYED: ", charmsNativeViewPage.nVRasReferralViewPageRASReferralBarTitle.isDisplayed());

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Does the participant need legal representation?: ", charmsNativeViewPage.nVRasReferralViewPageDoesParticipantNeedLegalRepresentation.getText().contentEquals("Yes"));

        CommonUtils.assertTrueJUNIT("This is a RAS Referaal Page mismatch data for the Legal Representative Name : ", charmsNativeViewPage.nVRasReferralViewPageLegalRepresentativeName.getAttribute("value").contentEquals("FirstNameTest  MiddleNameTest  lastNameTest"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the What is your relationship to this person?: ", charmsNativeViewPage.nVRasReferralViewPageWhatIsYourRelationshipToThisPerson.getText().contentEquals("Other"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Are you the legal guardian of this person?: ", charmsNativeViewPage.nVRasReferralViewPageAreYouTheLegalGuardianOfThisPerson.getText().contentEquals("Yes"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for thecPlease specify your relationship to the participant : ", charmsNativeViewPage.nVRasReferralViewPagespecifyYourRelationshipToTheParticipant.getAttribute("value").contentEquals(""));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Study : ", charmsNativeViewPage.nVRasReferralViewPageStudy.getAttribute("value").contentEquals("RASopathies"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Family Member Record:", charmsNativeViewPage.nVRasReferralViewPageFamilyMemberRecord.getAttribute("value").contentEquals("Automated Test"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Vital Status: ", charmsNativeViewPage.nVRasReferralViewPageVitalStatus.getText().contentEquals("Alive"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Eligibility Status : ", charmsNativeViewPage.nVRasReferralViewPageEligibilityStatus.getText().contentEquals("Waiting for Eligibility"));

        Assert.assertTrue("This is a RAS Referaal Page mismatch data for the Enrollment Status : ", charmsNativeViewPage.nVRasReferralViewPageEnrollmentStatus.getText().contentEquals("New Screener Received"));

    }

    /* VERIFIES CONTACT INFO DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Contact Info data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Contact_Info_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageContactInformationTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is the Contact Info tab --> Contact Email mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactEmail.getAttribute("value").contentEquals("automatedTest@nci.gov"));

        Assert.assertTrue("This is the Contact Info tab --> Contact Home Phone mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactHomePhone.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue("This is the Contact Info tab --> Contact Cell Phone mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactCellPhone.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue("This is the Contact Info tab --> Contact Work Phone mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactWorkPhone.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue("This is the Contact Info tab --> Country of Birth mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabCountryOfBirth.getText().contentEquals("-- None --"));

        Assert.assertTrue("This is the Contact Info tab --> Contact Street Address mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactStreetAddress.getAttribute("value").contentEquals("9609 Medical Center Dr New Avenue Park"));

        Assert.assertTrue("This is the Contact Info tab --> Contact City mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactCity.getAttribute("value").contentEquals("Rockville"));

        Assert.assertTrue("This is the Contact Info tab --> Contact State mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactState.getAttribute("value").contentEquals("Maryland "));

        Assert.assertTrue("This is the Contact Info tab --> Contact ZipCode mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageContactInformationTabContactZipCode.getAttribute("value").contentEquals("20850"));

    }

    /* VERIFIES DEMOGRAPHICS DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Demographics data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Demographics_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageDemographicsTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is the Demographics tab -- > Participant Race mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageDemographicsTabParticipantRace.getText().contentEquals("Caucasian (white), Black/African American, Native Hawaiian/Other Pacific Islander, American Indian/Alaskan Native, Asian, Other"));

        Assert.assertTrue("This is the Demographics tab -- > Other mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageDemographicsTabOther.getAttribute("value").contentEquals("Entering other Race"));

        Assert.assertTrue("This is the Demographics tab -- > Biological Gender mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageDemographicsTabBiologicalGender.getText().contentEquals("Male"));

        Assert.assertTrue("This is the Demographics tab -- > Date of Birth mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageDemographicsTabDateOfBirth.getAttribute("value").contentEquals("04/01/1990"));

        Assert.assertTrue("This is the Demographics tab -- > Ethnicity mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageDemographicsTabEthnicity.getText().contentEquals("Not Hispanic/Latino"));

    }

    /* VERIFIES RASOPATHY HISTORY DATA IN THE RAS REFERRAL PAGE */
    @When("verifies RASopathy History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_RASopathy_History_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is the RASopathy History tab -- > Have you been diagnosed with a RASopathy? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabHaveYouBeenDiagnosedWithRASopathy.getText().contentEquals("Yes"));

        Assert.assertTrue("This is the RASopathy History tab -- > RASopathy diagnosis mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabRASopathyDiagnosis.getText().contentEquals("Other"));

        Assert.assertTrue("This is the RASopathy History tab -- > Please specify mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabASopathyDiagnosisPleaseSpecify.getAttribute("value").contentEquals(" Entering Other RASopathy"));

        Assert.assertTrue("This is the RASopathy History tab -- > Age (in years) at diagnosis : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabAgeInYearsAtDiagnosis.getAttribute("value").contentEquals("20"));

        Assert.assertTrue("This is the RASopathy History tab -- > Year of diagnosis mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabYearOfDiagnosis.getAttribute("value").contentEquals("2010"));

        Assert.assertTrue("This is the RASopathy History tab -- > Has the participant been diagnosed with any of the following Conditions? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabHasParticipantBeenDiagnosedWithAnyOfTheFollowingConditions.getText().contentEquals("Feeding problems or failure to thrive, Neurocognitive/ Developmental Delay such as: Intellectual disability and language impairment, Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth, Head/Craniofacial Abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth, Eye/Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse/absent eye lashes/eyebrows, low set ears, hearing loss, Skin/hair abnormalities such as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits, Heart problems such as cardiomyopathy, Genital abnormalities such as undescended testes, Other: such as endocrine issues, bleeding disorders, seizures, Non-cancerous tumors, Lymphedema"));

        Assert.assertTrue("This is the RASopathy History tab -- > Other conditions mismatch for the Referral Submitted in the Referral page :  ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabOtherConditions.getAttribute("value").contentEquals(""));

        Assert.assertTrue("This is the RASopathy History tab -- > Have any of your biological relatives been diagnosed with a RASopathy? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageRASopathyHistoryTabHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithRASopathy.getText().contentEquals("No info on biological relatives"));

    }

    /* VERIFIES CANCER HISTORY DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Cancer History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Cancer_History_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageCancerHistoryTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is the Cancer History tab -- > Has a physician ever diagnosed this participant with cancer? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageCancerHistoryTabHasPhysicianEverDiagnosedParticipantWithCancer.getText().contentEquals("Yes"));

    }

    /* VERIFIES GENETICS TESTING HISTORY DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Genetic Testing History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Genetic_Testing_History_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {
        charmsNativeViewPage.nVRasReferralViewPageGeneticTestingHistoryTab.click();

        Assert.assertTrue("This is the Genetic Testing History tab -- > Has the participant ever had genetic testing? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageGeneticTestingHistoryTabHasParticipantEverHadGeneticTesting.getText().contentEquals("Yes"));

        Assert.assertTrue("This is the Genetic Testing History tab -- > Does the participant have a copy of the genetic test results? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageGeneticTestingHistoryTabDoesParticipantHaveCopyOfGeneticTestResults.getText().contentEquals("No"));

        Assert.assertTrue("This is the Genetic Testing History tab -- > Participants preferred method of delivering genetic test results mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageGeneticTestingHistoryTabParticipantPreferredMethodOfDeliveringGeneticTestResults.getText().contentEquals("Not answered"));

        Assert.assertTrue("This is the Genetic Testing History tab -- > Have any relatives been genetically tested for inherited cancer syndromes? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageGeneticTestingHistoryTabHaveAnyRelativesBeenGeneticallyTestedFoInheritedCancerSyndromes.getText().contentEquals("Not answered"));

    }

    /* VERIFIES FINAL INFORMATION DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Final Information data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Final_Information_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageFinalInformationTab.click();
        MiscUtils.sleep(3000);
        Assert.assertTrue("This is the Final Information tab -- > How did you hear about this study? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabHowDidYouHearAboutThisStudy.getText().contentEquals("Other"));

        /*
         * RETEST BELOW BUG
         */
        Assert.assertTrue("This is the Final Information tab -- > Please specify ? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabPleaseSpecify.getAttribute("value").contentEquals(""));

        Assert.assertTrue("This is the Final Information tab -- > Has the participant or any family member participated in any cancer study? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudy.getText().contentEquals("Not answered"));

        Assert.assertTrue("This is the Final Information tab -- > Are any relatives currently receiving cancer care or follow-up? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabAreAnyRelativesCurrentlyReceivingCancerCareOrFollowUp.getText().contentEquals("Not answered"));

        Assert.assertTrue("This is the Final Information tab -- > Main reasons for participating in this study? Select all that apply mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabMainReasonsForParticipatingInThisStudy.getText().contentEquals("Participate in research, Identify a diagnosis, Receive genetic testing, Other"));

        Assert.assertTrue("This is the Final Information tab -- > Identify a diagnosis mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabIdentifyDiagnosis.getAttribute("value").contentEquals("Reason two"));

        Assert.assertTrue("This is the Final Information tab -- > Receive genetic testing mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabReceiveGeneticTesting.getAttribute("value").contentEquals("Reason three"));

        Assert.assertTrue("This is the Final Information tab -- > Participate in research mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabParticipateInResearch.getAttribute("value").contentEquals("Reason one"));

        Assert.assertTrue("This is the Final Information tab -- > Other mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabOther.getAttribute("value").contentEquals("Reason four"));

        Assert.assertTrue("This is the Final Information tab -- > Are you a participant in any other research study or registry group? mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabAreYouParticipantInAnyOtherResearchStudyOrRegistryGroup.getText().contentEquals("Other"));

        Assert.assertTrue("This is the Final Information tab -- > Comments mismatch for the Referral Submitted in the Referral page : ", charmsNativeViewPage.nVRasReferralViewPageFinalInformationTabComments.getAttribute("value").contentEquals(""));

    }

    /* VERIFIES COMMENTS DATA IN THE RAS REFERRAL PAGE */
    @When("verifies Comments data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow")
    public void verifies_Comments_data_submitted_in_Qualtrics_is_imported_as_expected_in_the_RAS_Referral_page_of_ServiceNow() {

        charmsNativeViewPage.nVRasReferralViewPageCommentsTab.click();
        charmsNativeViewPage.nVReferralParticipantIntakeFormBackButton.click();
    }

    /* THE SERVICENOW USER SUBMITS THE STUDY FOR ELIGIBILITY REVIEW */
    @Given("the ServiceNow user submits the study for eligibility review")
    public void the_ServiceNow_user_submits_the_study_for_eligibility_review() {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton.click();
        MiscUtils.sleep(1000);

    }

    /* THE SERVICENOW USER MARKS THE STUDY ELIGIBLE */
    @Given("the ServiceNow user marks the study eligible")
    public void the_ServiceNow_user_marks_the_study_eligible() {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton.click();
        MiscUtils.sleep(1000);

    }

    /**
     * NEW WAY OF SENDING CONSENT FORM FOR AN ADULT
     * 1. CALL NEEDS TO BE COMPLETED
     *
     * @throws TestingException
     */

    @When("the ServiceNow user completes a consent call for an Adult")
    public void the_ServiceNow_user_completes_a_consent_call_for_an_Adult() throws TestingException {

        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        nativeViewDashPage.clickNativeViewLink();

        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
        charmsNativeViewPage.nativeViewDashboardLink.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

        // Clicking on Awaiting Consent
        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div[2]/div[1]/div[3]/div/span/a")).click();

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();
        MiscUtils.sleep(3000);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);

        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();

        /**
         * Scrolling down to 'Consents'
         */

        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")));

        /**
         * Clicking on 'Consents'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")).click();

        /**
         * Clicking on 'Consent Call Pending' record
         */

        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/span/div[2]/div[4]/table/tbody/tr/td/div/table/tbody/tr/td[2]/a")).click();

        /**
         * Clicking on 'Open Record'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='Open Record']")).click();

        /**
         * SELECTING 'Pending' for Consent/Assent Status
         */
        CommonUtils.selectDropDownValue("Pending", WebDriverUtils.webDriver.findElement(By.xpath("//select[@aria-labelledby='label.x_naci_family_coho_fcsms_consent.participant_response']")));

        /*
         * SELECTING 'CHARMS e-consent' for Response Type
         */

        CommonUtils.selectDropDownValue("CHARMS e-consent", WebDriverUtils.webDriver.findElement(By.xpath("//select[contains(@aria-labelledby,'label.x_naci_family_coho_fcsms_consent.response_type')]")));

        /*
         * Clicking on 'Call Complete'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='navbar_ui_actions']//button[@value='7a9ed9a51b11c590e541631ee54bcbad'][normalize-space()='Call Complete']")).click();

        /*
         * Logging out of ServiceNow
         */

        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    /*
     * THE SERVICENOW USER ADDS COMMENTS IN THE HISTORY SECTION AND SENDS CONSENT
     * FORM - NOT IN USE ANYMORE!!!!!!!!
     */
    @Given("the ServiceNow user adds comments in the history section {string} and sends consent form")
    public void the_ServiceNow_user_adds_comments_in_the_history_section_and_sends_consent_form(String consentComment) throws TestingException {

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox.sendKeys(consentComment);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
        CommonUtils.scrollIntoView(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton.click();

        /* LOGGING OUT OF NATIVE VIEW WITH DJ ACCOUNT */
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDJButton);
        charmsNativeViewPage.nativeViewDJButton.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewLogOutButton);
        charmsNativeViewPage.nativeViewLogOutButton.click();

    }

    @When("the myRAS user signs the consent form in the Service Portal")
    public void the_myRAS_user_signs_the_consent_form_in_the_Service_Portal() throws TestingException {

        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        myRASHomePage.rasopathyStudyConsent.click();

        // SCROLLING DOWN TO FIRST CHECKBOX
        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//input[@value='read']")));

        // CLICKING ON FIRST CHECKBOX
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@value='read']")).click();

        // CLICKING I AM IN THIS PERSON
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@aria-label='I am this person.']")).click();

        // ASSERTING NEW CONSENT TEXT FOR 'I AM IN THIS PERSON'
        // CommonUtils.assertEquals(
        // " Please indicate if you give permission for your specimens and data to be
        // stored and used for future research by selecting one of the following
        // statements: ",
        // WebDriverUtils.webDriver.findElement(By.xpath(
        // "/html/body/div/section/main/div[2]/div/sp-page-row/div/div[2]/span/div/div[1]/div/div/div[4]/div[2]/div[6]/div/label/text()"))
        // .getText());

        // CLICKING 'I DO give permission for my coded specimens and data to be stored
        // and used for future research.'
        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div/section/main/div[2]/div/sp-page-row/div/div[2]/span/div/div[1]/div/div/div[4]/div[2]/div[7]/div[1]/input")).click();

        // CLICKING I DO give permission for my coded specimens and data to be shared
        // with other researchers and used by these researchers for future research.
        WebDriverUtils.webDriver.findElement(By.xpath("//body[1]/div[1]/section[1]/main[1]/div[2]/div[1]/sp-page-row[1]/div[1]/div[2]/span[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[10]/div[1]/input[1]")).click();

        myRasStudyConsentPage.consentButton.click();
        MiscUtils.sleep(2000);

        myRasStudyConsentPage.signingPasswordTextBox.sendKeys("RASTest2021$$");

        myRasStudyConsentPage.signButton.click();
        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCButton);
        testAccountResetPage.nativeViewCCButton.click();
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    /**
     * @param username
     * @param password
     * @throws TestingException USE BELOW METHOD TO SIGN CONSENT FORM - USE SAME
     *                          CREDENTIALS USED TO SUBMIT ELIGIBILITY QUESTIONNAIRE
     */

    @When("the myRas user signs in with Username {string} and Password {string}")
    public void the_myRas_user_signs_in_with_Username_and_Password(String username, String password) throws TestingException {

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));

        CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
        myRASLoginPage.loginToMyRASButton.click();
        oktaLoginPage.usernameTxtBox.sendKeys(username);
        oktaLoginPage.passwordTxtBox.sendKeys(password);
        CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
        oktaLoginPage.loginBtn.click();

        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
        JavascriptUtils.clickByJS(myRASHomePage.rasopathyStudyConsent);

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox);
        myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox.click();

        JavascriptUtils.scrollIntoView(myRasStudyConsentPage.iAmThisPersonRadioButton);
        myRasStudyConsentPage.iAmThisPersonRadioButton.click();

        myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeStoredRadioButton.click();

        myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeSharedWithOtherResearchersRadioButton.click();

        CommonUtils.waitForVisibility(myRasStudyConsentPage.consentButton);
        myRasStudyConsentPage.consentButton.click();

        CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
        MiscUtils.sleep(1000);
        myRasStudyConsentPage.signingPasswordTextBox.sendKeys("RASTest2021$$");

        CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
        myRasStudyConsentPage.signButton.click();
        MiscUtils.sleep(2500);

        CommonUtils.waitForVisibility(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
        myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton.click();

        /* LOGGING OUT OF CHARMS AUTOMATED OKTA ACCOUNT */
        CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoLink);
        myRASHomePage.charmsAutomatedTestTwoLink.click();

        CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoSignOutLink);
        myRASHomePage.charmsAutomatedTestTwoSignOutLink.click();

    }

    /*
     * A SERVICENOW USER NAVIGATES TO CHARMS NATIVE VIEW AND OPENS RECORDS THAT ARE
     * AWAITING PI SIGNATURE
     */
    @When("a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature")
    public void a_ServiceNow_user_navigates_to_CHARMS_Native_view_and_opens_records_that_are_Awaiting_PI_Signature() throws TestingException {

        nativeViewLoginImpl.sideDoorAccountLogin();

        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
        charmsNativeViewPage.nativeViewDashboardLink.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewAwaitingPISignatureLink);
        charmsNativeViewPage.nativeViewAwaitingPISignatureLink.click();

    }

    /*
     * SELECTS THE SUBMITTED myRAS SCREENER RECORD THAT HAS SIGNED CONSENT FORM FROM
     * PARTICIPANT ATTACHED
     */
    @Given("selects the submitted MyRAS screener record that has signed consent form from participant attached")
    public void selects_the_submitted_MyRAS_screener_record_that_has_signed_consent_form_from_participant_attached() {

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText);
        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText.getAttribute("value").contentEquals("Automated"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText.getAttribute("value").contentEquals("Test"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText.getAttribute("value").contentEquals("703-687-5816"));

        Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyStudyConsentLink.isDisplayed());

        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);
        charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();

    }

    /* THE SERVICENOW USER SIGNS THE CONSENT FORM */

    @When("signs the consent form")
    public void signs_the_consent_form() throws TestingException {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Open record: Automated Test']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@aria-label='Open record: Automated Test']")).click();
        MiscUtils.sleep(2000);

        JavascriptUtils.scrollIntoView(WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")));

        /**
         * Clicking on 'Consents'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='Consents (1)']")).click();

        WebDriverUtils.webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/span/div[2]/div[4]/table/tbody/tr/td/div/table/tbody/tr/td[2]/a")).click();

        /**
         * Clicking on 'Open Record'
         */
        WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='Open Record']")).click();

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")));
        // Entering Consent Date
        JavascriptUtils.selectDateByJS(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")), "05/05/2022");

        // Entering 'Consent By'
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys("CBIIT Test Account");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys(Keys.RETURN);

        // Clicking 'Sign and Complete' button
        WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'Sign and Complete')])[1]")).click();

        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    @Given("the ServiceNow user signs the consent form")
    public void the_ServiceNow_user_signs_the_consent_form() throws TestingException {

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")));
        // Entering Consent Date
        JavascriptUtils.selectDateByJS(WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='x_naci_family_coho_fcsms_consent.consent_date']")), "05/05/2022");

        // Entering 'Consent By'
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys("CBIIT Test Account");
        WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='sys_display.x_naci_family_coho_fcsms_consent.consent_by']")).sendKeys(Keys.RETURN);

        // Clicking 'Sign and Complete' button
        WebDriverUtils.webDriver.findElement(By.xpath("(//*[contains(text(),'Sign and Complete')])[1]")).click();

        MiscUtils.sleep(3000);

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")));
        WebDriverUtils.webDriver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();

        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    /* *************************************************************** */
    /* **************** THE END ************************************** */
    /* *************************************************************** */

    /* -------------- ******* CGB IIQ SUBMISSION ********* ------------------ */
    @Given("clicks on the Individual Information Questionnaire to begin the IIQ form")
    public void clicks_on_the_Individual_Information_Questionnaire_to_begin_the_IIQ_form() {

        CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaire);
        MiscUtils.sleep(1000);
        myRASHomePage.rasoptathyIndividualInformationQuestionnaire.click();
        MiscUtils.sleep(65000);
    }

    static String cgbIIQOneTimePin;

    @Given("enters email address {string} and One Time Pin code to proceed with the form")
    public void enters_email_address_and_One_Time_Pin_code_to_proceed_with_the_form(String emailAddress) {

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

        cgbIIQOneTimePin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

        CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
        myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(cgbIIQPage.cgbIIQOneTimePinTextBox);
        // MiscUtils.sleep(2000);
        cgbIIQPage.cgbIIQOneTimeEmailTextBox.sendKeys("charmsras5@yahoo.com");
        cgbIIQPage.cgbIIQOneTimePinTextBox.sendKeys(cgbIIQOneTimePin);

        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);

        /** DEBUG HERE --------- ISSUE WAS FOUND TEST CASE WILL BE UPDATED */
        cGBIIQPages.nextButton.click();
        MiscUtils.sleep(1000);
        // MiscUtils.sleep(10000);
    }
}