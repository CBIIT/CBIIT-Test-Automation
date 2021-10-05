package ServiceNow.CHARMS.Steps;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.Pages.MyRASLoginPage;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class myRASScreenerSubmissions extends PageInitializer {

	@Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
	public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));
	}

	@Given("logs in via Okta with username {string} and password {string}")
	public void logs_in_via_Okta_with_username_and_password(String username, String password) {

		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		myRASLoginPage.loginToMyRASButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys(username);
		oktaLoginPage.passwordTxtBox.sendKeys(password);
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		oktaLoginPage.loginBtn.click();
	}

	@Given("clicks on Eligibility Questionnaire to begin questionnaire")
	public void clicks_on_Eligibility_Questionnaire_to_begin_questionnaire() {

		CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
		myRASHomePage.warningAgreeButton.click();
		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyEligibilityQuestionnaire);
		myRASHomePage.rasoptathyEligibilityQuestionnaire.click();
	}

	@Given("clicks next after reviewing the STUDY INTRODCTION")
	public void clicks_next_after_reviewing_the_STUDY_INTRODCTION() {

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		MiscUtils.sleep(2000);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects I am completing this form for someone else option")
	public void selects_I_am_completing_this_form_for_someone_else_option() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.iAmCompletingThisFormForSomeoneElseOption);
		rasopathyQuestionnairePage.iAmCompletingThisFormForSomeoneElseOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is the name of the person who may be eligible for this study?")
	public void enters_First_Name_Middle_Name_Last_Name_for_What_is_the_name_of_the_person_who_may_be_eligible_for_this_study(
			String firstName, String middleName, String lastName) {

		rasopathyQuestionnairePage.firstNameTextBox.sendKeys(firstName);
		rasopathyQuestionnairePage.middleNameTextBox.sendKeys(middleName);
		rasopathyQuestionnairePage.lastNameTextBox.sendKeys(lastName);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is your name?")
	public void enters_First_Name_Middle_Name_Last_Name_for_What_is_your_name(String firstName, String middleName,
			String lastName) {

		rasopathyQuestionnairePage.firstNameWhatIsYourNameTextBox.sendKeys(firstName);
		rasopathyQuestionnairePage.middleNameWhatIsYourNameTextBox.sendKeys(middleName);
		rasopathyQuestionnairePage.lastNameWhatIsYourNameTextBox.sendKeys(lastName);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters {string} for What is your relationship to the participant?")
	public void enters_for_What_is_your_relationship_to_automated_name(String enteringOtherData) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption);
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption.click();
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameTextBox.sendKeys(enteringOtherData);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Yes option for Are you the legal guardian of the participant?")
	public void selects_Yes_option_for_Are_you_the_legal_guardian_of_automated_name() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption);
		rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("clicks next for The next set of questions will collect basic information about the participant. page")
	public void clicks_next_for_The_next_set_of_questions_will_collect_basic_information_about_automated_name_page() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		MiscUtils.sleep(2000);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects participants Date of Birth from the calendar picker")
	public void selects_a_Date_of_Birth_from_the_calendar_picker() {
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarMonthDropDown);
		CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarMonthDropDown);
		rasopathyQuestionnairePage.calendarYearTextBox.clear();
		rasopathyQuestionnairePage.calendarYearTextBox.sendKeys("1990");
		rasopathyQuestionnairePage.calendarDayOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Male option for participants Sex assigned at birth")
	public void selects_Male_option_for_Sex_assigned_at_birth() {

		rasopathyQuestionnairePage.sexMaleOptionAssignedAtBirth.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes option for participant being adopted")
	public void selects_Yes_option_for_being_adopted() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantAdoptedYesOption);
		rasopathyQuestionnairePage.isParticipantAdoptedYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes for participant still being alive")
	public void selects_Yes_for_still_being_alive() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantStillAliveYesOption);
		rasopathyQuestionnairePage.isParticipantStillAliveYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes option for participant currently living in the United States")
	public void selects_Yes_option_for_living_in_the_United_States() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesYesOption);
		rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters mailing address for where study materials can be sent, street {string} city {string} state {string} zip code {string}")
	public void enters_mailing_address_for_where_study_materials_can_be_sent_street_city_state_zip_code(String street,
			String city, String state, String zipCode) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters proxy email address {string}")
	public void enters_email_address(String emailAddress) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox);
		rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters proxy email address {string} to confirm email address")
	public void enters_email_address_to_confirm_email_address(String emailAddress) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox);
		rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters proxy home phone number {string}, cell phone number {string}, work phone number {string} and selects cell phone number as Preferred Contact")
	public void enters_home_phone_number_cell_phone_number_work_phone_number_and_selects_cell_phone_number_as_Preferred_Contact(
			String homePhoneNumber, String cellPhoneNumber, String workPhoneNumber) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Not Hispanic\\/Latino option for Ethnicity of participant")
	public void selects_Not_Hispanic_Latino_option_for_Ethnicity_of_participant() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption);
		rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters {string} for other when selecting Race of participant")
	public void enters_for_other_when_selecting_Race(String otherRace) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.raceOfParticipantOtherTextBox);
		rasopathyQuestionnairePage.raceOfParticipantOtherTextBox.sendKeys(otherRace);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Other option and enters {string} for participant being in other research study")
	public void enters_for_participant_being_in_other_research_study(String otherText) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOtherOption);
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOtherOption.click();
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOtherTextBox.sendKeys(otherText);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("proceeds with providing information for medical diagnosis")
	public void proceeds_with_providing_information_for_medical_diagnosis() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("enters {string} for participant being diagnosed with any of the listed conditions")
	public void enters_for_being_diagnosed_with_any_of_the_listed_conditions(String otherCondition) {

		MiscUtils.sleep(1000);
		CommonUtils
				.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithFollowingConditionsOtherOption);
		JavascriptUtils
				.scrollIntoView(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithFollowingConditionsOtherOption);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithFollowingConditionsOtherOption.click();
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithFollowingConditionsOtherTextBox.sendKeys(otherCondition);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes option for participant being diagnosed with cancer")
	public void selects_Yes_option_for_proxy_being_diagnosed_with_cancer() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithCancerYesOption);
		rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithCancerYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects Yes option for currently receiving treatment")
	public void for_primary_cancers_diagnosed_selects_cancer_types_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_Yes_option_for_currently_receiving_treatment(
			String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType,
			String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge,
			String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis,
			String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

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

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton);
		rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentSecondRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentThirdRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentFourthRadioButton.click();

		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes option for participant being diagnosed with a Rasopathy")
	public void selects_Yes_option_for_proxy_being_diagnosed_with_a_Rasopathy() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyYesOption);
		rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Other and enters {string} for selecting a specific RASopathy diagnosed of the participant")
	public void selects_Other_and_enters_for_selecting_a_specific_RASopathy(String enteringOtherText) {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantSpecificRasopathyOtherOption);
		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.participantSpecificRasopathyOtherOption);
		rasopathyQuestionnairePage.participantSpecificRasopathyOtherTextBox.click();
		rasopathyQuestionnairePage.participantSpecificRasopathyOtherTextBox.sendKeys(enteringOtherText);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters participants age in years {string} of diagnosis")
	public void enters_participants_age_in_years_of_diagnosis(String age) {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantAgeInYearsAtDiagnosis);
		rasopathyQuestionnairePage.participantAgeInYearsAtDiagnosis.sendKeys(age);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters participants year of diagnosis {string}")
	public void enters_participants_year_of_diagnosis(String participantsYearOfDiagnosis) {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsYearOfDiagnosis);
		rasopathyQuestionnairePage.participantsYearOfDiagnosis.sendKeys(participantsYearOfDiagnosis);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("proceeds with providing genetic testing information")
	public void proceeds_with_providing_genetic_testing_information() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects Yes option to family members of participants having been diagnosed with a RASopathy")
	public void selects_Yes_option_to_family_members_having_been_diagnosed_with_a_RASopathy() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedYesOption);
		rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects Yes option to participant having had genetic testing")
	public void selects_Yes_option_to_participant_having_had_genetic_testing() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsEverHadGeneticTestingYesOption);
		rasopathyQuestionnairePage.participantsEverHadGeneticTestingYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects Yes option to participant having a copy of genetic test results")
	public void selects_Yes_option_to_participant_having_a_copy_of_genetic_test_results() {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantCopyOfGeneticTestResultsYesOption);
		rasopathyQuestionnairePage.participantCopyOfGeneticTestResultsYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects Upload to this questionnaire options for providing genetic test results of participant")
	public void selects_Upload_to_this_questionnaire_options_for_providing_genetic_test_results_of_participant() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantUploadToThisQuestionnaireOption);
		rasopathyQuestionnairePage.participantUploadToThisQuestionnaireOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("uploads PDF file of genetic test results of participant")
	public void uploads_PDF_file_of_genetic_test_results_of_participant() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton);
		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton);
		
		MiscUtils.sleep(7000);
		
		//rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton.click();
		//JavascriptUtils.enterValueByJS(rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton, COVIDConstants.PDF_PATH);
		MiscUtils.sleep(7000);
		//CommonUtils.waitForClickability(rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton);
		rasopathyQuestionnairePage.dropFilesOrClickHereToUploadButton.sendKeys(COVIDConstants.PDF_PATH);
		MiscUtils.sleep(7000);
		//boolean isFileUploaded = rasopathyQuestionnairePage.wordDocumentPDFtext.getText().contains(".pdf");
		//Assert.assertTrue(isFileUploaded);	
	}
}
