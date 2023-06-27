package ServiceNow.CHARMS.Steps;

import java.util.Set;
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
//import cucumber.api.junit.Cucumber;

public class MelanomaScreenerSubmission extends PageInitializer {

    @Given("a participant is on the Family Cohort Study Management System: Melanoma and Spitzoid Tumor login page")
    public void a_participant_is_on_the_Family_Cohort_Study_Management_System_Melanoma_and_Spitzoid_Tumor_login_page()
            throws TestingException {

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("melanoma"));
    }

    @When("the participant logs in with username {string} and password {string}")
    public void the_participant_logs_in_with_username_and_password(String username, String password) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaLoginPage.loginToMelanomaButton);
        myRASLoginPage.loginToMyRASButton.click();
        oktaLoginPage.usernameTxtBox.sendKeys(username);
        oktaLoginPage.passwordTxtBox.sendKeys(password);
        CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
        CucumberLogUtils.logScreenShot();
        oktaLoginPage.loginBtn.click();

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaHomePage.warningAgreeButton);
        myRASHomePage.warningAgreeButton.click();
    }

    @When("clicks on Eligibility Questionnaire")
    public void clicks_on_Eligibility_Questionnaire() {

        CucumberLogUtils.logScreenShot();
        melanomaHomePage.melanomaEligibilityQuestionnaire.click();

    }

    @When("selects I am completing this form for myself for Are you completing this form for someone else or for yourself?")
    public void selects_I_am_completing_this_form_for_myself_for_Are_you_completing_this_form_for_someone_else_or_for_yourself() {

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
        melanomaQuestionnairePage.studyNextButton.click();

        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
        melanomaQuestionnairePage.studyNextButton.click();

        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.iAmCompletingThisFormForMyselfOption.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();

    }

    @When("enters First name {string}, Middle Initial {string}, Last name {string} for What is your name?")
    public void enters_First_name_Middle_Initial_Last_name_for_What_is_your_name(String firstName, String middleName,
            String lastName) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.firstNameTextBox);
        melanomaQuestionnairePage.firstNameTextBox.sendKeys(firstName);
        melanomaQuestionnairePage.middleNameTextBox.sendKeys(middleName);
        melanomaQuestionnairePage.lastNameTextBox.sendKeys(lastName);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("enters date of birth {string} for What is your date of birth?")
    public void enters_date_of_birth_for_What_is_your_date_of_birth(String dateOfBirth) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.dateOfBirthTextBox);
        melanomaQuestionnairePage.dateOfBirthTextBox.sendKeys(dateOfBirth);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects male for What was your sex assigned at birth?")
    public void selects_male_for_What_was_your_sex_assigned_at_birth() {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.sexFemaleOptionAssignedAtBirth.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects Yes for Are you adopted?")
    public void selects_Yes_for_Are_you_adopted() {

        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.isParticipantAdoptedYesOption);
        melanomaQuestionnairePage.isParticipantAdoptedYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects United States of America for In which country do you currently live?")
    public void selects_United_States_of_America_for_In_which_country_do_you_currently_live() {
        MiscUtils.sleep(1500);

        CommonUtils.waitForVisibility(melanomaQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
        CommonUtils.selectDropDownValue("United States of America",
                melanomaQuestionnairePage.whatCountryDoesParticipantCurrentlyLiveInDropDown);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("enters {string}, {string}, {string}, {string} for Please provide the mailing address where study materials can be sent, as needed")
    public void enters_for_Please_provide_the_mailing_address_where_study_materials_can_be_sent_as_needed(String street,
            String city, String state, String zipCode) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);
        melanomaQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
        melanomaQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
        melanomaQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
        melanomaQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("enters {string}, for What is your email address?")
    public void enters_for_What_is_your_email_address(String emailAddress) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.whatIsYourEmailAddressTextBox);
        melanomaQuestionnairePage.whatIsYourEmailAddressTextBox.sendKeys(emailAddress);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("enters {string}, for Please confirm your email address")
    public void enters_for_Please_confirm_your_email_address(String emailAddress) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.pleaseConfirmYourEmailAddressTextBox);
        melanomaQuestionnairePage.pleaseConfirmYourEmailAddressTextBox.sendKeys(emailAddress);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("enters {string}, {string}, {string} and enters a preferred contact number")
    public void enters_and_enters_a_preferred_contact_number(String homePhoneNumber, String cellPhoneNumber,
            String workPhoneNumber) {

        MiscUtils.sleep(1000);
        rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
        rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
        rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(workPhoneNumber);
        rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
        CucumberLogUtils.logScreenShot();
        rasopathyQuestionnairePage.studyNextButton.click();
    }

    @When("selects ethnicity {string}, for What is your ethnicity?")
    public void selects_ethnicity_for_What_is_your_ethnicity(String string) {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.authenticityOfParticipantHispanicLatinoOption);
        melanomaQuestionnairePage.authenticityOfParticipantHispanicLatinoOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects mothers ethnicity {string}, for What is your biological mother's ethnicity?")
    public void selects_mothers_ethnicity_for_What_is_your_biological_mother_s_ethnicity(String string) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.biologicalMothersEthnicityHispanicLatinoOption);
        melanomaQuestionnairePage.biologicalMothersEthnicityHispanicLatinoOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects fathers ethnicity {string}, for What is your biological father's ethnicity?")
    public void selects_fathers_ethnicity_for_What_is_your_biological_father_s_ethnicity(String string) {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.biologicalFathersEthnicityHispanicLatinoOption);
        melanomaQuestionnairePage.biologicalFathersEthnicityHispanicLatinoOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects White for What is your race?")
    public void selects_White_for_What_is_your_race() {

        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.raceOfParticipantOtherTextBox);
        melanomaQuestionnairePage.raceOfParticipantWhite.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects White for What is your biological mother's race?")
    public void selects_White_for_What_is_your_biological_mother_s_race() {

        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.raceOfParticipantOtherTextBox);
        melanomaQuestionnairePage.raceOfParticipantWhite.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects White for What is your biological father's race?")
    public void selects_White_for_What_is_your_biological_father_s_race() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.raceOfParticipantOtherTextBox);
        melanomaQuestionnairePage.raceOfParticipantWhite.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects Familial Melanoma Study for Are you a participant in any other research study or registry group?")
    public void selects_Familial_Melanoma_Study_for_Are_you_a_participant_in_any_other_research_study_or_registry_group() {
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.famililialMelanomaStudyOption);
        // JavascriptUtils.clearByJS(melanomaQuestionnairePage.famililialMelanomaStudyOption);
        melanomaQuestionnairePage.famililialMelanomaStudyOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects Yes to Have you been diagnosed with a melanoma or a Spitz tumor?")
    public void selects_Yes_to_Have_you_been_diagnosed_with_a_melanoma_or_a_Spitz_tumor() {

        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveYouBeenDiagnosedWithMelanomaOrSpitzTumorYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects Skin for Type, enters {string} for Age at diagnosis, enters {string} for Year of diagnosis, enters {string} for Name of institution or clinic where biopsy occurred, enters {string} for Name of physician who performed thr biopsy")
    public void selects_Skin_for_Type_enters_for_Age_at_diagnosis_enters_for_Year_of_diagnosis_enters_for_Name_of_institution_or_clinic_where_biopsy_occurred_enters_for_Name_of_physician_who_performed_thr_biopsy(
            String age, String year, String nameOfInstitution, String nameOfPhysician) {
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Skin", melanomaQuestionnairePage.melanomaOrSpitzTumorFirstTypeDropDown);
        melanomaQuestionnairePage.melanomaOrSpitzTumorFirstAgeAtDiagnosisTextBox.sendKeys(age);
        melanomaQuestionnairePage.melanomaOrSpitzTumorFirstYearOfDiagnosisTextBox.sendKeys(year);
        melanomaQuestionnairePage.melanomaOrSpitzTumorNameOfInstitutionOrClinicWhereBiopsyOccuredTextBox
                .sendKeys(nameOfInstitution);
        melanomaQuestionnairePage.melanomaOrSpitzTumorNameOfPhysicianWhoPerformedBiopsyTextBox
                .sendKeys(nameOfPhysician);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Yes to Have you ever been diagnosed with non-melanoma cancer?")
    public void selects_Yes_to_Have_you_ever_been_diagnosed_with_non_melanoma_cancer() {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveYouEverBeenDiagnosedWithNonMelanomaCancerYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Leukemia for Cancer Type, enters {string} for Age at diagnosis, enters {string} for Year of diagnosis, selects Yes tp currently receiving treatment for Please complete the box below by selecting which primary, non-melanoma cancers you were diagnosed with and at what age and year they occurred.")
    public void selects_Leukemia_for_Cancer_Type_enters_for_Age_at_diagnosis_enters_for_Year_of_diagnosis_selects_Yes_tp_currently_receiving_treatment_for_Please_complete_the_box_below_by_selecting_which_primary_non_melanoma_cancers_you_were_diagnosed_with_and_at_what_age_and_year_they_occurred(
            String ageAtDiagnosis, String yearOfDiagnosis) {

        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Leukemia",
                melanomaQuestionnairePage.pleaseCompletePrimaryNonMelanomaCancersYouWereDiagnosedWithCancerFirstDropDown);

        melanomaQuestionnairePage.pleaseCompletePrimaryNonMelanomaCancersYouWereDiagnosedWithAgeAtDiagnosisTextBox
                .sendKeys(ageAtDiagnosis);

        melanomaQuestionnairePage.pleaseCompletePrimaryNonMelanomaCancersYouWereDiagnosedWithYearOfDiagnosisTextBox
                .sendKeys(yearOfDiagnosis);

        melanomaQuestionnairePage.pleaseCompletePrimaryNonMelanomaCancersYouWereDiagnosedCurrentlyReceivingTreatmentYesOption
                .click();

        CucumberLogUtils.logScreenShot();

        melanomaQuestionnairePage.studyNextButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Yes for Have you ever had genetic testing?")
    public void selects_Yes_for_Have_you_ever_had_genetic_testing() {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveYouEverHadGeneticTestingYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects BAP{int} for Were any genetic changes detected in the following genes?")
    public void selects_BAP_for_Were_any_genetic_changes_detected_in_the_following_genes(Integer int1) {

        MiscUtils.sleep(2000);
        melanomaQuestionnairePage.geneticChangesDetectedBAP1_Option.click();
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Yes to Do you have a copy of the genetic test results?")
    public void selects_Yes_to_Do_you_have_a_copy_of_the_genetic_test_results() {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.doYouHaveACopyOfGeneticTestResultsYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Mail for How would you like to provide the genetic results to us?")
    public void selects_Mail_for_How_would_you_like_to_provide_the_genetic_results_to_us() {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.howWouldYouLikeToProvideGeneticTestResultsMailOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Yes option for Have any of your biological relatives been diagnosed with a melanoma?")
    public void selects_Yes_option_for_Have_any_of_your_biological_relatives_been_diagnosed_with_a_melanoma() {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveAnyOfBiologicalRelativesBeenDiagnosedWithMelanomaYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("enters {string} for First Name, selects Last initial {string}, selects Melanoma type {string} for Please complete the box below by selecting which primary melanoma cancers were diagnosed and at what age or year they occurred.")
    public void enters_for_First_Name_selects_Last_initial_selects_Melanoma_type_for_Please_complete_the_box_below_by_selecting_which_primary_melanoma_cancers_were_diagnosed_and_at_what_age_or_year_they_occurred(
            String firstName, String lastInitial, String melanomaType) {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.indicateOriginalMelanomaTextBox.sendKeys(firstName);
        CommonUtils.selectDropDownValue(lastInitial,
                melanomaQuestionnairePage.indicateOriginalMelanomaLastInitialDropDown);
        CommonUtils.selectDropDownValue(melanomaType,
                melanomaQuestionnairePage.indicateOriginalMelanomaLastMelanomaTypeDropDown);
        melanomaQuestionnairePage.indicateOriginalMelanomaLastMelanomaAgeAtDiagnosisTextBox.sendKeys("28");

        melanomaQuestionnairePage.indicateOriginalMelanomaLastMelanomaYearOfDiagnosisTextBox.sendKeys("2000");

        CommonUtils.selectDropDownValue("Aunt",
                melanomaQuestionnairePage.indicateOriginalMelanomaLastMelanomaRelationDropDown);

        CommonUtils.selectDropDownValue("Maternal",
                melanomaQuestionnairePage.indicateOriginalMelanomaLastMelanomaSideOfTheFamilyDropDown);

        CucumberLogUtils.logScreenShot();

        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects Yes for Have any of your biological relatives ever had genetic testing?")
    public void selects_Yes_for_Have_any_of_your_biological_relatives_ever_had_genetic_testing() {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveAnyOfYourBiologicalRelativesEverHadGeneticTestingYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("selects BAP{int} for Were any genetic changes detected for the following genes?")
    public void selects_BAP_for_Were_any_genetic_changes_detected_for_the_following_genes(Integer int1) {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.wereAnyGeneticChangesDetectedForTheFollowingGenesBAP1Option.click();
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        melanomaQuestionnairePage.studyNextButton.click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Websearch for How did you hear about this study?")
    public void selects_Websearch_for_How_did_you_hear_about_this_study() {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.howDidYouHearAboutThisStudyWebSearchOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Yes to Have you or other family members ever participated in another study on melanoma at another medical institution, university, government agency or other site?")
    public void selects_Yes_to_Have_you_or_other_family_members_ever_participated_in_another_study_on_melanoma_at_another_medical_institution_university_government_agency_or_other_site() {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.haveYouOrOtherFamilyMembersEverParticipatedInAnotherStudyOnMelanomaYesOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("enters {string} for Study Name, enters {string} for Family relationship, enters {string} for Study Contact Person, enters {string} for Study Phone Number, enters {string} for Start year of Participation , enters {string} for End year for Partiipation, enters {string} for Institution")
    public void enters_for_Study_Name_enters_for_Family_relationship_enters_for_Study_Contact_Person_enters_for_Study_Phone_Number_enters_for_Start_year_of_Participation_enters_for_End_year_for_Partiipation_enters_for_Institution(
            String studyName, String familyRelationship, String studyContactPerson, String studyPhoneNumber,
            String startYear,
            String endYear,
            String institution) {

        melanomaQuestionnairePage.studyNameTextBox.sendKeys(studyName);
        melanomaQuestionnairePage.familyRelationshipTextBox.sendKeys(familyRelationship);
        melanomaQuestionnairePage.studyContactTextBox.sendKeys(studyContactPerson);
        melanomaQuestionnairePage.studyPhoneNumberTextBox.sendKeys(studyPhoneNumber);
        melanomaQuestionnairePage.startYearTextBox.sendKeys(startYear);
        melanomaQuestionnairePage.endYearTextBox.sendKeys(endYear);
        melanomaQuestionnairePage.institutionTextBox.sendKeys(institution);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("selects Participate in research for What are the main reasons for participating in this study and enters reason {string}?")
    public void selects_Participate_in_research_for_What_are_the_main_reasons_for_participating_in_this_study_and_enters_reason(
            String reason) {
        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.participateInResearchCheckBox.click();
        melanomaQuestionnairePage.participateInResearchTextBox.sendKeys(
                reason);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();
    }

    @When("submits Melanoma Screener")
    public void submits_Melanoma_Screener() throws TestingException {
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

        /** LOGGING OUT */
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(1500);
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCButton);
        testAccountResetPage.nativeViewCCButton.click();
        CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
        CucumberLogUtils.logScreenShot();
        testAccountResetPage.nativeViewCCLogOutButton.click();

    }

    @When("selects I am completing this form for for someone else for Are you completing this form for someone else or for yourself?")
    public void selects_I_am_completing_this_form_for_for_someone_else_for_Are_you_completing_this_form_for_someone_else_or_for_yourself() {
        MiscUtils.sleep(1000);

        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }

        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
        melanomaQuestionnairePage.studyNextButton.click();

        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(melanomaQuestionnairePage.studyNextButton);
        CommonUtils.waitForVisibility(melanomaQuestionnairePage.studyNextButton);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
        melanomaQuestionnairePage.studyNextButton.click();

        MiscUtils.sleep(1000);

        melanomaQuestionnairePage.iAmCompletingThisFormForSomeoneElseOption.click();
        CucumberLogUtils.logScreenShot();
        melanomaQuestionnairePage.studyNextButton.click();

    }

    @When("enters First name {string}, Middle Initial {string}, Last name {string} for What is the name of the person who may be eligible for this study?")
    public void enters_First_name_Middle_Initial_Last_name_for_What_is_the_name_of_the_person_who_may_be_eligible_for_this_study(
            String firstName, String middleInitial, String lastName) {

        MiscUtils.sleep(1000);
        melanomaQuestionnairePage.nameOfPersonWhoMayBeEligibleForTheStudyTextBox.sendKeys("keysToSend");
    }

}
