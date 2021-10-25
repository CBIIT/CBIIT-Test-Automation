package ServiceNow.CHARMS.Steps;

import java.util.Set;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myRASScreenerSubmissions extends PageInitializer {

	/* BEGINNING: RASopathies Longitudinal Cohort Study login page */

	@Given("a proxy is on the RASopathies Longitudinal Cohort Study login page")
	public void a_user_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));

	}

	@Given("a proband is on the RASopathies Longitudinal Cohort Study login page")
	public void a_proband_is_on_the_RASopathies_Longitudinal_Cohort_Study_login_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));

	}

	/* -END: RASopathies Longitudinal Cohort Study login page */

	/* ******************************************************* */

	/* BEGINNING: Logs in via Okta with user name and password */

	@Given("logs in via Okta with username {string} and password {string}")
	public void logs_in_via_Okta_with_username_and_password(String username, String password) {
		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		myRASLoginPage.loginToMyRASButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys(username);
		oktaLoginPage.passwordTxtBox.sendKeys(password);
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		oktaLoginPage.loginBtn.click();

	}

	/*
	 * ----------------------- END: Logs in via Okta with user name and password
	 * --------------------------
	 */

	/* ******************************************************* */
	/*
	 * ----------------------- BEGINNING: Eligibility Questionnaire Link to click
	 * --------------------------
	 */

	@Given("clicks on Eligibility Questionnaire to begin questionnaire")
	public void clicks_on_Eligibility_Questionnaire_to_begin_questionnaire() {
		CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
		myRASHomePage.warningAgreeButton.click();
		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyEligibilityQuestionnaire);
		myRASHomePage.rasoptathyEligibilityQuestionnaire.click();

	}

	/*
	 * ----------------------- END: Eligibility Questionnaire Link to click
	 * --------------------------
	 */

	/* ******************************************************* */

	/*
	 * ----------------------- BEGINNING: STUDY INTRODCTION Page
	 * --------------------------
	 */

	@Given("clicks next after reviewing the STUDY INTRODCTION")
	public void clicks_next_after_reviewing_the_STUDY_INTRODCTION() {

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);

		}

		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------------------------------ END: STUDY INTRODCTION Page
	 * --------------------------
	 */

	/* ******************************************************* */

	/*
	 * ----------------------- BEGINNING: For Whom the form is being submitted Page
	 * --------------------------
	 */

	@Given("selects I am completing this form for someone else option")
	public void selects_I_am_completing_this_form_for_someone_else_option() {
		MiscUtils.sleep(1000);
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

	/*
	 * ----------------------- END: For WHom the form is being submitted Page
	 * --------------------------
	 */

	/* ******************************************************* */

	/*
	 * --------------- BEGINNING: What is the name of the person who may be eligible
	 * for this study? Page ----------------
	 */

	@Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is the name of the person who may be eligible for this study?")
	public void enters_First_Name_Middle_Name_Last_Name_for_What_is_the_name_of_the_person_who_may_be_eligible_for_this_study(
			String firstName, String middleName, String lastName) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.firstNameTextBox);
		rasopathyQuestionnairePage.firstNameTextBox.sendKeys(firstName);
		rasopathyQuestionnairePage.middleNameTextBox.sendKeys(middleName);
		rasopathyQuestionnairePage.lastNameTextBox.sendKeys(lastName);
		rasopathyQuestionnairePage.studyNextButton.click();

	}
	/*
	 * --------------- END: What is the name of the person who may be eligible for
	 * this study? Page ----------------
	 */

	/* ******************************************************* */
	/*
	 * ----------------------- BEGINNING: What is your name? Page
	 * -----------------------------------------
	 */

	@Given("enters First Name {string}, Middle Name {string}, Last Name {string} for What is your name?")
	public void enters_First_Name_Middle_Name_Last_Name_for_What_is_your_name(String firstName, String middleName,
			String lastName) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.firstNameWhatIsYourNameTextBox);

		rasopathyQuestionnairePage.firstNameWhatIsYourNameTextBox.sendKeys(firstName);
		rasopathyQuestionnairePage.middleNameWhatIsYourNameTextBox.sendKeys(middleName);
		rasopathyQuestionnairePage.lastNameWhatIsYourNameTextBox.sendKeys(lastName);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * --------------------------------- END: What is your name? Page
	 * --------------------------------
	 */

	/* ******************************************************* */
	/*
	 * ------------------------------- BEGINNING: What is your relationship to the
	 * participant? Page ----------------------
	 */

	@Given("selects Parent for What is your relationship to the participant?")
	public void selects_Parent_for_What_is_your_relationship_to_the_participant() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.whatIsYourRelationshipParentOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters {string} for What is your relationship to the participant?")
	public void enters_for_What_is_your_relationship_to_automated_name(String enteringOtherData) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption);
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption.click();
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameTextBox.sendKeys(enteringOtherData);
		rasopathyQuestionnairePage.studyNextButton.click();

	}
	/*
	 * ------------------------------------- END: What is your relationship to the
	 * participant? Page -------------------------
	 */

	/* ******************************************************* */
	/*
	 * ---------------------------- BEGINNING: Options for Are you the legal
	 * guardian of the participant? Page ----------------
	 */

	@Given("selects Yes option for Are you the legal guardian of the participant?")
	public void selects_Yes_option_for_Are_you_the_legal_guardian_of_automated_name() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption);
		rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for Are you the legal guardian of the participant?")
	public void selects_No_option_for_Are_you_the_legal_guardian_of_the_participant() {
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.areYouTheLegalGuardianNoOption);
		rasopathyQuestionnairePage.areYouTheLegalGuardianNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------------------------------ END: Options for Are you the legal
	 * guardian of the participant? Page -------------------------------------
	 */

	/* ******************************************************* */
	/*
	 * --------------- -------------------BEGINNING: The next set of questions will
	 * collect basic information about the participant Page ----------------
	 */

	@Given("clicks next for The next set of questions will collect basic information about the participant. page")
	public void clicks_next_for_The_next_set_of_questions_will_collect_basic_information_about_automated_name_page() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();

	}
	/*
	 * ------------------------------- END: The next set of questions will collect
	 * basic information about the participant Page ----------------
	 */

	/* ******************************************************* */
	/*
	 * ----------------------------------- BEGINNING: participants Date of Birth
	 * from the calendar picker? Page -------------------------
	 */

	@Given("selects participants Date of Birth from the calendar picker")
	public void selects_a_Date_of_Birth_from_the_calendar_picker() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarMonthDropDown);
		CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarMonthDropDown);
		rasopathyQuestionnairePage.calendarYearTextBox.clear();
		rasopathyQuestionnairePage.calendarYearTextBox.sendKeys("1990");
		rasopathyQuestionnairePage.calendarDayOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * -------------------------------- END: participants Date of Birth from the
	 * calendar picker? Page ----------------
	 */

	/* ******************************************************* */

	/*
	 * ----------------------------- BEGINNING: Options for participants Sex
	 * assigned at birth Page -----------------------------------
	 */

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
	/*
	 * --------------- END: Options for participants Sex assigned at birth Page
	 * ----------------
	 */

	/* ******************************************************* */

	/*
	 * --------------- BEGINNING: Options for participant being adopted Page
	 * ----------------
	 */

	@Given("selects Yes option for participant being adopted")
	public void selects_Yes_option_for_being_adopted() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantAdoptedYesOption);
		rasopathyQuestionnairePage.isParticipantAdoptedYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for participant being adopted")
	public void selects_No_option_for_participant_being_adopted() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantAdoptedNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------------------ END: Options for participant being adopted Page
	 * -------------------------------
	 */

	/* ******************************************************* */

	/*
	 * ---------------------------- BEGINNING: Options for participant still being
	 * alive Page ------------------------
	 */

	@Given("selects Yes for participant still being alive")
	public void selects_Yes_for_still_being_alive() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isParticipantStillAliveYesOption);
		rasopathyQuestionnairePage.isParticipantStillAliveYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No for participant still being alive")
	public void selects_No_for_participant_still_being_alive() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantStillAliveNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * --------------- END: Options for participant still being alive Page
	 * ----------------
	 */

	/* ******************************************************* */

	/*
	 * ---------------------- BEGINNING: DOB of the Participant
	 * -----------------------------
	 */

	@Given("selects participants Date of Death from the calendar picker")
	public void selects_participants_Date_of_Death_from_the_calendar_picker() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarDODMonthDropDown);
		CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarDODMonthDropDown);
		rasopathyQuestionnairePage.calendarDODYearTextBox.clear();
		rasopathyQuestionnairePage.calendarDODYearTextBox.sendKeys("1995");
		rasopathyQuestionnairePage.calendarDODDayOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * -------------------------- END: DOB of the Participant
	 * --------------------------
	 */

	/* ******************************************************* */
	/*
	 * ------------------ BEGINNING: Option for participant currently living in the
	 * United States ------------------
	 */

	@Given("selects Yes option for participant currently living in the United States")
	public void selects_Yes_option_for_living_in_the_United_States() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesYesOption);
		rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	@Given("selects No option for participant currently living in the United States")
	public void selects_No_option_for_participant_currently_living_in_the_United_States() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.doesParticipantLiveInUnitedStatesNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * -------------- END: Option for participant currently living in the United
	 * States ----------------------
	 */

	/* ******************************************************* */

	/*
	 * ------------ BEGINNING: Enters mailing address for where study materials can
	 * be sent ------------------------
	 */

	@Given("enters mailing address for where study materials can be sent, street {string} street {string} city {string} state {string} Province {string} Country {string}")
	public void enters_mailing_address_for_where_study_materials_can_be_sent_street_street_city_state_Province_Country(
			String street, String streetOption, String city, String state, String province, String country) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreet2TextBox.sendKeys(streetOption);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentProvinceTextBox.sendKeys(province);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCountryTextBox.sendKeys(country);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters mailing address for where study materials can be sent, street {string} city {string} state {string} zip code {string}")
	public void enters_mailing_address_for_where_study_materials_can_be_sent_street_city_state_zip_code(String street,
			String city, String state, String zipCode) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters mailing address for where study materials can be sent, street {string} street Optional {string} city {string} state {string} zip code {string}")
	public void enters_mailing_address_for_where_study_materials_can_be_sent_street_street_Optional_city_state_zip_code(
			String street, String streetOptional, String city, String state, String zipCode) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreet2TextBox.sendKeys(streetOptional);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
		rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------------- END: Enters mailing address for where study materials can
	 * be sent -------------------------
	 */

	/* ******************************************************* */

	/*
	 * -------------------------- BEGINNING: Enters email address
	 * ---------------------------------
	 */

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

	@Given("enters proxy email address {string}")
	public void enters_email_address(String emailAddress) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox);
		rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters proxy email address {string} to confirm email address")
	public void enters_email_address_to_confirm_email_address(String emailAddress) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox);
		rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------------------------- END: Enters email address
	 * ------------------------------
	 */

	/* ******************************************************* */
	/*
	 * ---------------------------- BEGINNING: Enters Phone Numbers details
	 * ------------------------
	 */

	@Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects cell phone number as Preferred Contact")
	public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_cell_phone_number_as_Preferred_Contact(
			String foreignhomePhoneNumber, String foreigncellPhoneNumber, String foreignWorkPhoneNumber) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(foreignhomePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(foreigncellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(foreignWorkPhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects home phone number as Preferred Contact")
	public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_home_phone_number_as_Preferred_Contact(
			String foreignhomePhoneNumber, String foreigncellPhoneNumber, String foreignWorkPhoneNumber) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(foreignhomePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(foreigncellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(foreignWorkPhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectHomePhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters proxy home phone number {string}, cell phone number {string}, work phone number {string} and selects cell phone number as Preferred Contact")
	public void enters_home_phone_number_cell_phone_number_work_phone_number_and_selects_cell_phone_number_as_Preferred_Contact(
			String homePhoneNumber, String cellPhoneNumber, String workPhoneNumber) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters proband home phone number {string}, cell phone number {string}, work phone number {string} and selects Work phone number as Preferred Contact")
	public void enters_proband_home_phone_number_cell_phone_number_work_phone_number_and_selects_Work_phone_number_as_Preferred_Contact(
			String homePhoneNumber, String cellPhoneNumber, String workPhoneNumber) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectWorkPhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}
	/*
	 * ------------------------------------- END: Enters Phone Numbers details
	 * ----------------------------------------------
	 */

	/* ******************************************************* */
	/*
	 * ------------------------------- BEGINNING: Select Ethnicity of the
	 * participant ------------------------------------
	 */

	@Given("selects Hispanic\\/Latino option for Ethnicity of participant")
	public void selects_Hispanic_Latino_option_for_Ethnicity_of_participant() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption);
		rasopathyQuestionnairePage.authenticityOfParticipantHispanicLatinoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Not Hispanic\\/Latino option for Ethnicity of participant")
	public void selects_Not_Hispanic_Latino_option_for_Ethnicity_of_participant() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption);
		rasopathyQuestionnairePage.authenticityOfParticipantNotHispanicLatinoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Unknown option for Ethnicity of participant")
	public void selects_Unknown_option_for_Ethnicity_of_participant() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfParticipantUnKnownOption);
		rasopathyQuestionnairePage.authenticityOfParticipantUnKnownOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * -------------------------------------- END: Select Ethnicity of the
	 * participant ------------------------------------
	 */

	/* ******************************************************* */
	/*
	 * ---------------------------- BEGINNING: Selecting Race of the participant
	 * -----------------------------------
	 */

	@Given("selects White, Black\\/African American, Native Hawaiian\\/Pacific Islander, American Indian\\/Alaskan Native, Asian and enters {string} for other when selecting Race of participant")
	public void selects_White_Black_African_American_Native_Hawaiian_Pacific_Islander_American_Indian_Alaskan_Native_Asian_and_enters_for_other_when_selecting_Race_of_participant(
			String otherRace) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.raceOfParticipantOtherTextBox);

		rasopathyQuestionnairePage.raceOfParticipantWhite.click();
		rasopathyQuestionnairePage.raceOfParticipantBlackAfricanAmerican.click();
		rasopathyQuestionnairePage.raceOfParticipantnativeHawaiianPacificIslander.click();
		rasopathyQuestionnairePage.raceOfParticipantAmericanIndianAlaskanNative.click();
		rasopathyQuestionnairePage.raceOfParticipantAsian.click();
		rasopathyQuestionnairePage.raceOfParticipantOther.click();
		rasopathyQuestionnairePage.raceOfParticipantOtherTextBox.sendKeys(otherRace);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("enters {string} for other when selecting Race of participant")
	public void enters_for_other_when_selecting_Race(String otherRace) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.raceOfParticipantOtherTextBox);
		rasopathyQuestionnairePage.raceOfParticipantOtherTextBox.sendKeys(otherRace);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Prefer not to answer for other when selecting Race of participant")
	public void selects_Prefer_not_to_answer_for_other_when_selecting_Race_of_participant() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.raceOfParticipantPreferNotToAnswer.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ---------------------------- END: Selecting Race of the participant being
	 * -----------------------------------
	 */

	/* ******************************************************* */

	/*
	 * -------------------- BEGINNING: Selects for participant being in other
	 * research study ------------------------------
	 */

	@Given("selects Rasopathies Net,I am not involved in any other research study or registry group,Not sure, and enters {string} for Family Advocacy Group and enters {string} for other for is the participant participated in any other research study or registry group?")
	public void selects_Rasopathies_Net_I_am_not_involved_in_any_other_research_study_or_registry_group_Not_sure_and_enters_for_Family_Advocacy_Group_and_enters_for_other_for_is_the_participant_participated_in_any_other_research_study_or_registry_group(
			String familyAdvocacyGroup, String otherText) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantInResopathiesNetOption.click();
		rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
		rasopathyQuestionnairePage.isParticipantNotSureOption.click();
		rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOption.click();
		rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOptionTextBox.sendKeys(familyAdvocacyGroup);
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOption.click();
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOptionTextBox.sendKeys(otherText);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Rasopathies Net and enters {string} for Family Advocacy Group and enters {string} for other for is the participant participated in any other research study or registry group?")
	public void selects_Rasopathies_Net_and_enters_for_Family_Advocacy_Group_and_enters_for_other_for_is_the_participant_participated_in_any_other_research_study_or_registry_group(
			String familyAdvocacyGroup, String otherText) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantInResopathiesNetOption.click();
		rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
		rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOption.click();
		rasopathyQuestionnairePage.isParticipantInFamilyAdvocacyGroupOptionTextBox.sendKeys(familyAdvocacyGroup);
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOption.click();
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOptionTextBox.sendKeys(otherText);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Other option and enters {string} for is the participant participated in any other research study or registry group?")
	public void selects_Other_option_and_enters_for_is_the_participant_participated_in_any_other_research_study_or_registry_group(
			String addOption) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOption.click();
		rasopathyQuestionnairePage.isParticipantInOtherResearchStudyOptionTextBox.sendKeys(addOption);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects I am not involved in any other research study or registry group for is the participant participated in any other research study or registry group?")
	public void selects_I_am_not_involved_in_any_other_research_study_or_registry_group_for_is_the_participant_participated_in_any_other_research_study_or_registry_group() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantNotInvolvedInAnyStudyGroupOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Not sure for is the participant participated in any other research study or registry group?")
	public void selects_Not_sure_for_is_the_participant_participated_in_any_other_research_study_or_registry_group() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.isParticipantNotSureOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * --------------------------- END: Selects for participant being in other
	 * research study ------------------------------
	 */

	/* ******************************************************* */

	/*
	 * ------------ BEGINNING: proceeds with providing information for medical
	 * diagnosis Page --------------
	 */

	@Given("proceeds with providing information for medical diagnosis")
	public void proceeds_with_providing_information_for_medical_diagnosis() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * --------------------------- END: proceeds with providing information for
	 * medical diagnosis Page ------------------------------
	 */

	/* ******************************************************* */
	/*
	 * ------------ BEGINNING: Selects option for participant being diagnosed with
	 * any of the listed conditions --------------
	 */

	@Given("selects Feeding problems, failure to thrive, or other stomach\\/digestive problems option for participant being diagnosed with any of the listed conditions")
	public void selects_Feeding_problems_failure_to_thrive_or_other_stomach_digestive_problems_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption.click();

	}

	@Given("selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions")
	public void selects_Neurocognitive_developmental_delay_such_as_Intellectual_disability_and_language_impairment_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNeurocognitiveDelayOption.click();

	}

	@Given("selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions")
	public void selects_Skeletal_deformities_such_as_Short_stature_short_webbed_neck_unusual_chest_shape_curved_spine_muscle_or_joint_problems_limb_overgrowth_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsSkeletalDeformitiesOption.click();

	}

	@Given("selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions")
	public void selects_Head_craniofacial_abnormalities_such_as_Large_head_broad_or_high_forehead_short_nose_small_chin_swelling_or_bleeding_of_the_gums_abnormal_shape_or_movement_of_teeth_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsHeadCraniofacialAbnormalitiesOption.click();
	}

	@Given("selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions")
	public void selects_Eye_Ear_abnormalities_such_as_Widely_spaced_eyes_eye_diseases_droopy_eye_lids_sparse_absent_eye_lashes_eyebrows_low_set_ears_vision_or_hearing_impairment_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsEyeEarAbnormalitiesOption.click();

	}

	@Given("selects skin\\/hair abnormalitiessuch as: soft loose skin, fine\\/thin\\/thick\\/dry\\/brittle\\/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks \\(cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions")
	public void selects_skin_hair_abnormalitiessuch_as_soft_loose_skin_fine_thin_thick_dry_brittle_curly_hair_slow_growing_hair_tumors_or_small_skin_tags_near_the_nose_or_anus_lipomas_light_to_dark_brown_birth_marks_cafe_au_lait_spots_freckles_in_the_armpits_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsSkinHairAbnormalitiesOption.click();

	}

	@Given("selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions")
	public void selects_Heart_problems_such_as_cardiomyopathy_or_pulmonary_valve_stenosis_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsHeartProblemsOption.click();

	}

	@Given("selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions")
	public void selects_Genital_abnormalities_such_as_undescended_testes_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsGenitalAbnormalitiesOption.click();

	}

	@Given("selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions")
	public void selects_Non_cancerous_tumors_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNonCancerousTumorsOption.click();

	}

	@Given("selects Lymphedema or participant being diagnosed with any of the listed conditions")
	public void selects_Lymphedema_or_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsLymphedemaOption.click();

	}

	@Given("selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions")
	public void selects_Other_such_as_endocrine_issues_bleeding_disorders_seizures_tethered_cord_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsOtherOption.click();

	}

	@Given("enters {string} for participant being diagnosed with any of the listed conditions")
	public void enters_for_participant_being_diagnosed_with_any_of_the_listed_conditions(String OtherOption) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsOtherOptionTextBox.sendKeys(OtherOption);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Never diagnosed with any of these conditions option for participant being diagnosed with any of the listed conditions")
	public void selects_Never_diagnosed_with_any_of_these_conditions_option_for_participant_being_diagnosed_with_any_of_the_listed_conditions() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithConditionsNeverDiagnosedOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ------------ END: Selects option for participant being diagnosed with any of
	 * the listed conditions --------------
	 */

	/* ******************************************************* */
	/*
	 * -------------------- BEGINNING: Selects option for participant being
	 * diagnosed with cancer ---------------------
	 */

	@Given("selects Yes option for participant being diagnosed with cancer")
	public void selects_Yes_option_for_proxy_being_diagnosed_with_cancer() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerYesOption);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for participant being diagnosed with cancer")
	public void selects_No_option_for_participant_being_diagnosed_with_cancer() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerNoOption);
		rasopathyQuestionnairePage.hasParticipantBeenDiagnosedWithCancerNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects No option for currently receiving treatment")
	public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_No_option_for_currently_receiving_treatment(
			String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType,
			String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge,
			String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis,
			String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

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

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects Yes option for currently receiving treatment")
	public void for_primary_cancers_diagnosed_selects_cancer_types_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_Yes_option_for_currently_receiving_treatment(
			String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType,
			String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge,
			String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis,
			String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

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

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton);
		rasopathyQuestionnairePage.currentlyReceivingTreatmentFirstRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentSecondRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentThirdRadioButton.click();
		rasopathyQuestionnairePage.currentlyReceivingTreatmentFourthRadioButton.click();

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and enters Other cancers options {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects No option for currently receiving treatment")
	public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_enters_Other_cancers_options_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_No_option_for_currently_receiving_treatment(
			String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType,
			String otherCancerType1, String otherCancerType2, String otherCancerType3, String otherCancerType4,
			String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge,
			String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis,
			String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

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

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("for participants primary cancers diagnosed selects cancer types {string}, {string}, {string}, {string} and enters Other cancers options {string}, {string}, {string}, {string} and selects age at diagnosis for primary cancers entered for all options {string}, {string}, {string}, {string} and year of diagnosis {string}, {string}, {string}, {string} and selects Yes option for currently receiving treatment")
	public void for_participants_primary_cancers_diagnosed_selects_cancer_types_and_enters_Other_cancers_options_and_selects_age_at_diagnosis_for_primary_cancers_entered_for_all_options_and_year_of_diagnosis_and_selects_Yes_option_for_currently_receiving_treatment(
			String firstCancerType, String secondCancerType, String thirdCancerType, String fourthCancerType,
			String otherCancerType1, String otherCancerType2, String otherCancerType3, String otherCancerType4,
			String firstCancerTypeAge, String secondCancerTypeAge, String thirdCancerTypeAge,
			String fourthCancerTypeAge, String firstCancerYearOfDiagnosis, String secondCancerYearOfDiagnosis,
			String thirdCancerYearOfDiagnosis, String fourthCancerYearOfDiagnosis) {

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

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* ******************************************************* */
	/*
	 * --------------- BEGINNING: Have participant been diagnosed with a RASopathy
	 * such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello
	 * syndrome -------
	 */

	@Given("selects Yes option for participant being diagnosed with a Rasopathy")
	public void selects_Yes_option_for_proxy_being_diagnosed_with_a_Rasopathy() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyYesOption);
		rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for participant being diagnosed with a Rasopathy")
	public void selects_No_option_for_participant_being_diagnosed_with_a_Rasopathy() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption);
		rasopathyQuestionnairePage.hasProxyBeenDiagnosedWithaRasopathyNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for proband being diagnosed with a Rasopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome")
	public void selects_No_option_for_proband_being_diagnosed_with_a_Rasopathy_such_as_Noonan_syndrome_Noonan_syndrome_with_multiple_lentigines_Costello_syndrome() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.hasProbandBeenDiagnosedWithaRasopathyNoOption);
		rasopathyQuestionnairePage.hasProbandBeenDiagnosedWithaRasopathyNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}

	/*
	 * ------ END: Have you been diagnosed with a RASopathy such as Noonan syndrome,
	 * Noonan syndrome with multiple lentigines, Costello syndrome -------
	 */

	/* ******************************************************* */
	/*
	 * ----------------- BEGINNING: selecting a specific RASopathy diagnosed of the
	 * participant -------------------
	 */

	@Given("selects Other and enters {string} for selecting a specific RASopathy diagnosed of the participant")
	public void selects_Other_and_enters_for_selecting_a_specific_RASopathy(String enteringOtherText) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantSpecificRasopathyOtherOption);
		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.participantSpecificRasopathyOtherOption);
		rasopathyQuestionnairePage.participantSpecificRasopathyOtherTextBox.click();
		rasopathyQuestionnairePage.participantSpecificRasopathyOtherTextBox.sendKeys(enteringOtherText);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Dont Know for selecting a specific RASopathy diagnosed of the participant")
	public void selects_Dont_Know_for_selecting_a_specific_RASopathy_diagnosed_of_the_participant() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.participantSpecificRasopathyDontKnowOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ----------------- END: selecting a specific RASopathy diagnosed of the
	 * participant -------------------
	 */

	/* ******************************************************* */

	/*
	 * ----------------- BEGINNING: Entering participants age in years of diagnosis
	 * -------------------
	 */

	@Given("enters participants age in years {string} of diagnosis")
	public void enters_participants_age_in_years_of_diagnosis(String age) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantAgeInYearsAtDiagnosis);
		rasopathyQuestionnairePage.participantAgeInYearsAtDiagnosis.sendKeys(age);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * ----------------- END: Entering participants age in years of diagnosis
	 * -------------------
	 */

	/* ******************************************************* */

	/*
	 * ----------------- BEGINNING: Entering participants year of diagnosis
	 * -------------------
	 */

	@Given("enters participants year of diagnosis {string}")
	public void enters_participants_year_of_diagnosis(String participantsYearOfDiagnosis) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsYearOfDiagnosis);
		rasopathyQuestionnairePage.participantsYearOfDiagnosis.sendKeys(participantsYearOfDiagnosis);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: Entering participants year of diagnosis */
	/* ******************************************************* */
	/* BEGINNING:proceeds with providing genetic testing information page */

	@Given("proceeds with providing genetic testing information")
	public void proceeds_with_providing_genetic_testing_information() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: proceeds with providing genetic testing information page */
	/* ******************************************************* */
	/*
	 * BEGINNING:option to biological representatives of participants having been
	 * diagnosed with a RASopathy
	 */

	@Given("selects Yes option to family members of participants having been diagnosed with a RASopathy")
	public void selects_Yes_option_to_family_members_having_been_diagnosed_with_a_RASopathy() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedYesOption);
		rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option to family members of participants having been diagnosed with a RASopathy")
	public void selects_No_option_to_family_members_of_participants_having_been_diagnosed_with_a_RASopathy() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects I have no information on my biological relatives option to family members of participants having been diagnosed with a RASopathy")
	public void selects_I_have_no_information_on_my_biological_relatives_option_to_family_members_of_participants_having_been_diagnosed_with_a_RASopathy() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.participantsFamilyMembersBeenDiagnosedhaveNoInformationOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects I have no information on my biological relatives option for Have any of your biological relatives been diagnosed with a RASopathy?")
	public void selects_I_have_no_information_on_my_biological_relatives_option_for_Have_any_of_your_biological_relatives_been_diagnosed_with_a_RASopathy() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.probandFamilyMembersBeenDiagnosedIDontKnowOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * END: option to biological representatives of participants having been
	 * diagnosed with a RASopathy
	 */
	/* ******************************************************* */
	/* BEGINNING: options for participant having had genetic testing */

	@Given("selects Yes option to participant having had genetic testing")
	public void selects_Yes_option_to_participant_having_had_genetic_testing() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantsEverHadGeneticTestingYesOption);
		rasopathyQuestionnairePage.participantsEverHadGeneticTestingYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option to participant having had genetic testing")
	public void selects_No_option_to_participant_having_had_genetic_testing() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.participantsEverHadGeneticTestingNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Not sure option to participant having had genetic testing")
	public void selects_Not_sure_option_to_participant_having_had_genetic_testing() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.participantsEverHadGeneticTestingNotSureOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: options for participant having had genetic testing */
	/* ******************************************************* */
	/* BEGINNING:options for participant having a copy of genetic test results */

	@Given("selects No option to participant having a copy of genetic test results")
	public void selects_No_option_to_participant_having_a_copy_of_genetic_test_results() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.participantCopyOfGeneticTestResultsNoOption);
		rasopathyQuestionnairePage.participantCopyOfGeneticTestResultsNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: options for participant having a copy of genetic test results */
	/* ******************************************************* */
	/*
	 * BEGINNING:options for any genetic changes detected for the following
	 * syndromes for the participant
	 */

	@Given("selects all the option for any genetic changes detected for the following syndromes for the participant")
	public void selects_all_the_option_for_any_genetic_changes_detected_for_the_following_syndromes_for_the_participant() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedNoonanSyndromeOption);
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedNoonanSyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedNoonanSyndromeWithMultipleLentiginesOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedCardiofaciocutaneousSyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedCostelloSyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedCapillarySyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedSYNGAP1SyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedLegiusSyndromeOption.click();
		rasopathyQuestionnairePage.wereAnyGeneticChangesDetectedOtherGenesSyndromeOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * END: options for any genetic changes detected for the following syndromes for
	 * the participant
	 */
	/* ******************************************************* */
	/*
	 * BEGINNING: user proceeds on answering few remaining questions regarding the
	 * study
	 */

	@Given("the user proceeds on answering few remaining questions regarding the study")
	public void the_user_proceeds_on_answering_few_remaining_questions_regarding_the_study() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * END: user proceeds on answering few remaining questions regarding the study
	 */
	/* ******************************************************* */
	/* BEGINNING: How did you hear about this study. */

	@Given("selects Other option and enters {string} for how did you hear about this study?")
	public void selects_Other_option_and_enters_for_how_did_you_hear_about_this_study(String otherOptionText) {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.howDidYouHearAboutTheStudyOtherOption);
		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.howDidYouHearAboutTheStudyOtherOption);
		rasopathyQuestionnairePage.howDidYouHearAboutTheStudyOtherOption.click();
		rasopathyQuestionnairePage.howDidYouHearAboutTheStudyOtherTextBox.sendKeys(otherOptionText);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Websearch for how did you hear about this study?")
	public void selects_Websearch_for_how_did_you_hear_about_this_study() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.howDidYouHearAboutWebSearchOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Family member for how did you hear about this study?")
	public void selects_Family_member_for_how_did_you_hear_about_this_study() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.howDidYouHearAboutFamilyMemberOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Support Group for how did you hear about this study?")
	public void selects_Support_Group_for_how_did_you_hear_about_this_study() {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.howDidYouHearAboutSupportGroupOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects Genetic counselor option and enters {string} for how did you hear about this study?")
	public void selects_Genetic_counselor_option_and_enters_for_how_did_you_hear_about_this_study(
			String GeneticCounselorText) {
		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.howDidYouHearAboutGeneticCounselorOption.click();
		rasopathyQuestionnairePage.howDidYouHearAboutGeneticCounselorTextBox.sendKeys(GeneticCounselorText);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: How did you hear about this study. */
	/* ******************************************************* */
	/*
	 * BEGINNING:Options for the participant or other family members ever
	 * participated in another study on RASopathies
	 */

	@Given("selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution")
	public void selects_the_Yes_option_for_the_participant_or_other_family_members_ever_participated_in_another_study_on_RASopathies_at_another_medical_institution() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyYesOption);
		rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects No option for the participant or other family members ever participated in another study on RASopathies at another medical institution")
	public void selects_No_option_for_the_participant_or_other_family_members_ever_participated_in_another_study_on_RASopathies_at_another_medical_institution() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyNoOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	@Given("selects the Not sure option for the participant or other family members ever participated in another study on RASopathies at another medical institution")
	public void selects_the_Not_sure_option_for_the_participant_or_other_family_members_ever_participated_in_another_study_on_RASopathies_at_another_medical_institution() {

		MiscUtils.sleep(1000);
		rasopathyQuestionnairePage.hasParticipantOrOtherFamilyMemberParticipatedInOtherStudyNotSureOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * END:Options for the participant or other family members ever participated in
	 * another study on RASopathies
	 */
	/* ******************************************************* */
	/*
	 * BEGINNING: provides the information regarding previous participation in other
	 * RASopathy studies
	 */

	@Given("provides the following information regarding previous participation in other RASopathy studies")
	public void provides_the_following_information_regarding_previous_participation_in_other_RASopathy_studies() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNameRelative1textbox);

		rasopathyQuestionnairePage.studyNameRelative1textbox.sendKeys("RAS1");
		rasopathyQuestionnairePage.studyNameRelative2textbox.sendKeys("RAS2");
		rasopathyQuestionnairePage.studyNameRelative3textbox.sendKeys("RAS3");
		rasopathyQuestionnairePage.studyNameRelative4textbox.sendKeys("RAS4");

		rasopathyQuestionnairePage.familyRelationshipRelative1textbox.sendKeys("Parent");
		rasopathyQuestionnairePage.familyRelationshipRelative2textbox.sendKeys("Uncle");
		rasopathyQuestionnairePage.familyRelationshipRelative3textbox.sendKeys("Aunt");
		rasopathyQuestionnairePage.familyRelationshipRelative4textbox.sendKeys("Uncle");

		rasopathyQuestionnairePage.studyContactPersonRelative1textbox.sendKeys("RN");
		rasopathyQuestionnairePage.studyContactPersonRelative2textbox.sendKeys("MD");
		rasopathyQuestionnairePage.studyContactPersonRelative3textbox.sendKeys("GC");
		rasopathyQuestionnairePage.studyContactPersonRelative4textbox.sendKeys("etc");

		rasopathyQuestionnairePage.studyPhoneNumberRelative1textbox.sendKeys("240-286-6298");
		rasopathyQuestionnairePage.studyPhoneNumberRelative2textbox.sendKeys("240-286-6298");
		rasopathyQuestionnairePage.studyPhoneNumberRelative3textbox.sendKeys("240-286-6298");
		rasopathyQuestionnairePage.studyPhoneNumberRelative4textbox.sendKeys("240-286-6298");

		rasopathyQuestionnairePage.dateOfParticipationStartYearRelative1textbox.sendKeys("1991");
		rasopathyQuestionnairePage.dateOfParticipationStartYearRelative2textbox.sendKeys("1992");
		rasopathyQuestionnairePage.dateOfParticipationStartYearRelative3textbox.sendKeys("1993");
		rasopathyQuestionnairePage.dateOfParticipationStartYearRelative4textbox.sendKeys("1994");

		rasopathyQuestionnairePage.dateOfParticipationEndYearRelative1textbox.sendKeys("2010");
		rasopathyQuestionnairePage.dateOfParticipationEndYearRelative2textbox.sendKeys("2012");
		rasopathyQuestionnairePage.dateOfParticipationEndYearRelative3textbox.sendKeys("2014");
		rasopathyQuestionnairePage.dateOfParticipationEndYearRelative4textbox.sendKeys("2016");

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/*
	 * END:provides the following information regarding previous participation in
	 * other RASopathy studies
	 */
	/* ******************************************************* */
	/* BEGINNING: What are the main reasons for participating in this study */

	@Given("for What are the main reasons for participating in this study? selects All options and for Participate in research enters {string}, for Identify a diagnosis enters {string}, for Receive genetic testing enters {string}, and for Other enters {string}")
	public void for_What_are_the_main_reasons_for_participating_in_this_study_selects_All_options_and_for_Participate_in_research_enters_for_Identify_a_diagnosis_enters_for_Receive_genetic_testing_enters_and_for_Other_enters(
			String reasonOne, String reasonTwo, String reasonThree, String reasonFour) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rasopathyQuestionnairePage.mainReasonForParticipatingInStudyParticipateInResearchOption);
		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyParticipateInResearchOption.click();
		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyParticipateInResearchTextBox.sendKeys(reasonOne);

		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyIdentifyADiagnosisOption.click();
		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyIdentifyADiagnosisTextBox.sendKeys(reasonTwo);

		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyReceiveGeneticTestingOption.click();
		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyReceiveGeneticTestingTextBox.sendKeys(reasonThree);

		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyOtherOption.click();
		rasopathyQuestionnairePage.mainReasonForParticipatingInStudyOtherTextBox.sendKeys(reasonFour);

		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: What are the main reasons for participating in this study */
	/* ******************************************************* */
	/* BEGINNING: Proceeds with submitting the Eligibility Questionnaire */

	@Given("proceeds with submitting the Eligibility Questionnaire")
	public void proceeds_with_submitting_the_Eligibility_Questionnaire() {
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		JavascriptUtils.scrollIntoView(rasopathyQuestionnairePage.studyNextButton);
		rasopathyQuestionnairePage.studyNextButton.click();

	}

	/* END: Proceeds with submitting the Eligibility Questionnaire */
	/* ******************************************************* */
	/* BEGINNING: Eligibility Questionnaire is successfully submitted- */

	@Then("the Eligibility Questionnaire is sucessfully submitted")
	public void the_Eligibility_Questionnaire_is_sucessfully_submitted() throws TestingException {
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.submissionSuccessfulText);

		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCButton);
		testAccountResetPage.nativeViewCCButton.click();
		CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCCLogOutButton);
		testAccountResetPage.nativeViewCCLogOutButton.click();
	}

	/*- END: Eligibility Questionnaire is successfully submitted- */
	/* ******************************************************* */
	/* ---------Login to Service Now--------------- */

	@When("a ServiceNow user navigates to CHARMS Native view and opens records that are Waiting for Elegibility Review")
	public void a_ServiceNow_user_navigates_to_CHARMS_Native_view_and_opens_records_that_are_Waiting_for_Elegibility_Review()
			throws TestingException {

		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
		charmsNativeViewPage.nativeViewDashboardLink.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewWaitingForElegibilityReviewButton);
		charmsNativeViewPage.nativeViewWaitingForElegibilityReviewButton.click();

	}

	@Given("selects the submitted MyRAS screener record")
	public void selects_the_submitted_MyRAS_screener_record() {
		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText);
		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText
				.getAttribute("value").contentEquals("Automated"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText
				.getAttribute("value").contentEquals("Test"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText
				.getAttribute("value").contentEquals("703-687-5816"));
		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();

	}

	@Given("verifies data submitted in Qualtrics is imported as expected in ServiceNow")
	public void verifies_data_submitted_in_Qualtrics_is_imported_as_expected_in_ServiceNow() {

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNameText);
		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNameText
				.getAttribute("value").contentEquals("Automated Test"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordWaitingForEligibilityText
				.getText().contentEquals("Waiting for Eligibility"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordNewScreenerReceivedText
				.getText().contentEquals("New Screener Received"));

		Assert.assertTrue(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMayWeHaveYourPermissionToContactThisRelativeYesText
						.getText().contentEquals("Yes"));

	}

	@Given("the ServiceNow user submits the study for eligibility review")
	public void the_ServiceNow_user_submits_the_study_for_eligibility_review() {

		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSubmitForEligibilityReviewButton.click();

	}

	@Given("the ServiceNow user marks the study eligible")
	public void the_ServiceNow_user_marks_the_study_eligible() {

		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordMarkEligibleButton.click();

	}

	@Given("the ServiceNow user adds comments in the history section {string} and sends consent form")
	public void the_ServiceNow_user_adds_comments_in_the_history_section_and_sends_consent_form(String consentComment)
			throws TestingException {

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryTab.click();

		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordHistoryCommentsBox
				.sendKeys(consentComment);

		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
		CommonUtils
				.scrollIntoView(charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsAutomatedTestRecordSendConsentButton.click();

		/*
		 * LOGGING OUT OF NATIVE VIEW WITH DJ ACCOUNT
		 */

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDJButton);
		charmsNativeViewPage.nativeViewDJButton.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewLogOutButton);
		charmsNativeViewPage.nativeViewLogOutButton.click();

	}

	@When("the myRAS user signs the consent form in the Service Portal")
	public void the_myRAS_user_signs_the_consent_form_in_the_Service_Portal() throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("myRASLoginPage"));

		CommonUtils.waitForVisibility(myRASLoginPage.loginToMyRASButton);
		myRASLoginPage.loginToMyRASButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys("charmsras4@yahoo.com");
		oktaLoginPage.passwordTxtBox.sendKeys("RASTest2021$$");
		CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
		oktaLoginPage.loginBtn.click();

		CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
		myRASHomePage.warningAgreeButton.click();

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(myRASHomePage.rasopathyStudyConsent);
		JavascriptUtils.clickByJS(myRASHomePage.rasopathyStudyConsent);

		myRasStudyConsentPage.yesIhaveReadTheTermsAndConditionsCheckbox.click();

		JavascriptUtils.scrollIntoView(myRasStudyConsentPage.iAmThisPersonRadioButton);
		myRasStudyConsentPage.iAmThisPersonRadioButton.click();

		myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeStoredRadioButton.click();

		myRasStudyConsentPage.iDoGivePermissionForMyCodedSpecimensAndDataToBeSharedWithOtherResearchersRadioButton
				.click();

		CommonUtils.waitForVisibility(myRasStudyConsentPage.consentButton);
		myRasStudyConsentPage.consentButton.click();

		CommonUtils.waitForVisibility(myRasStudyConsentPage.signingPasswordTextBox);
		myRasStudyConsentPage.signingPasswordTextBox.sendKeys("RASTest2021$$");

		CommonUtils.waitForVisibility(myRasStudyConsentPage.signButton);
		myRasStudyConsentPage.signButton.click();

		CommonUtils.waitForVisibility(myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton);
		myRasStudyConsentPage.yourConsentFormHasBeenSubmittedOKbutton.click();

		/*
		 * LOGGING OUT OF CHARMS AUTOMATED OKTA ACCOUNT
		 */

		CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoLink);
		myRASHomePage.charmsAutomatedTestTwoLink.click();

		CommonUtils.waitForVisibility(myRASHomePage.charmsAutomatedTestTwoSignOutLink);
		myRASHomePage.charmsAutomatedTestTwoSignOutLink.click();

	}

	@When("a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature")
	public void a_ServiceNow_user_navigates_to_CHARMS_Native_view_and_opens_records_that_are_Awaiting_PI_Signature()
			throws TestingException {

		nativeViewLoginImpl.nativeViewLogin();

		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
		charmsNativeViewPage.nativeViewDashboardLink.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewAwaitingPISignatureLink);
		charmsNativeViewPage.nativeViewAwaitingPISignatureLink.click();

	}

	@Given("selects the submitted MyRAS screener record that has signed consent form from participant attached")
	public void selects_the_submitted_MyRAS_screener_record_that_has_signed_consent_form_from_participant_attached() {

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestButton.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText);
		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedFirstNameText
				.getAttribute("value").contentEquals("Automated"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedLastNameText
				.getAttribute("value").contentEquals("Test"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedContactHomePhoneText
				.getAttribute("value").contentEquals("703-687-5816"));

		Assert.assertTrue(charmsNativeViewPage.nativeViewFamilyStudyConsentLink.isDisplayed());

		CommonUtils.waitForVisibility(
				charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton);
		charmsNativeViewPage.nativeViewFamilyMemberDetailsPreviewAutomatedTestOpenRecordButton.click();

	}

	@Given("the ServiceNow user signs the consent form")
	public void the_ServiceNow_user_signs_the_consent_form() throws TestingException {

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewSignConsentButton);
		charmsNativeViewPage.nativeViewSignConsentButton.click();
		MiscUtils.sleep(3000);

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDJButton);
		charmsNativeViewPage.nativeViewDJButton.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewLogOutButton);
		charmsNativeViewPage.nativeViewLogOutButton.click();

	}

	/*
	 * *****************************************************************************
	 * *****************************************
	 */

	/*
	 * -------------*********************** THE END
	 * *****************************************-----------------------
	 */

	@Given("clicks on the Individual Information Questionnaire to begin the IIQ form")
	public void clicks_on_the_Individual_Information_Questionnaire_to_begin_the_IIQ_form() {

		CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
		myRASHomePage.warningAgreeButton.click();

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaire);
		myRASHomePage.rasoptathyIndividualInformationQuestionnaire.click();
	}

	static String cgbIIQOneTimePin;

	@Given("enters email address and One Time Pin code to proceed with the form")
	public void enters_email_address_and_One_Time_Pin_code_to_proceed_with_the_form() {

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

		// PRINTING OUT PIN - IT WILL ALWAYS BE DIFFERENT
		System.out.println(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText());

		cgbIIQOneTimePin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
		myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		CommonUtils.waitForVisibility(cgbIIQPage.cgbIIQOneTimePinTextBox);
		cgbIIQPage.cgbIIQOneTimePinTextBox.sendKeys(cgbIIQOneTimePin);

		cgbIIQPage.cgbIIQOneTimeEmailTextBox.sendKeys("automatedTest@nci.gov");

		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(2000);
	}
}
