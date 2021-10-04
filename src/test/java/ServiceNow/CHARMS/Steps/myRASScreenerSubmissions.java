package ServiceNow.CHARMS.Steps;

import java.util.Set;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.Pages.MyRASLoginPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class myRASScreenerSubmissions extends PageInitializer {

	@Given("a user is on the RASopathies Longitudinal Cohort Study login page")
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
	
	@Given("enters {string} for What is your relationship to automated name?")
	public void enters_for_What_is_your_relationship_to_automated_name(String enteringOtherData) {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption);
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameOption.click();
		rasopathyQuestionnairePage.whatIsYourRelationshipToNameTextBox.sendKeys(enteringOtherData);
		rasopathyQuestionnairePage.studyNextButton.click();
		
	}
	
	@Given("selects Yes option for Are you the legal guardian of automated name?")
	public void selects_Yes_option_for_Are_you_the_legal_guardian_of_automated_name() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption);
		rasopathyQuestionnairePage.areYouTheLegalGuardianYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
		
	}
	
	@Given("clicks next for The next set of questions will collect basic information about automated name. page")
	public void clicks_next_for_The_next_set_of_questions_will_collect_basic_information_about_automated_name_page() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.studyNextButton);
		MiscUtils.sleep(2000);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects a Date of Birth from the calendar picker")
	public void selects_a_Date_of_Birth_from_the_calendar_picker() {
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.calendarMonthDropDown);
		CommonUtils.selectDropDownValue("April", rasopathyQuestionnairePage.calendarMonthDropDown);
		rasopathyQuestionnairePage.calendarYearTextBox.clear();
		rasopathyQuestionnairePage.calendarYearTextBox.sendKeys("1990");
		rasopathyQuestionnairePage.calendarDayOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();	
	}
	
	@Given("selects Male option for Sex assigned at birth")
	public void selects_Male_option_for_Sex_assigned_at_birth() {
		
		rasopathyQuestionnairePage.sexMaleOptionAssignedAtBirth.click();
		rasopathyQuestionnairePage.studyNextButton.click();	
	}
	
	@Given("selects Yes option for being adopted")
	public void selects_Yes_option_for_being_adopted() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isProxyAdoptedYesOption);
		rasopathyQuestionnairePage.isProxyAdoptedYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();	
	}
	
	@Given("selects Yes for still being alive")
	public void selects_Yes_for_still_being_alive() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.isProxyStillAliveYesOption);
		rasopathyQuestionnairePage.isProxyStillAliveYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects Yes option for living in the United States")
	public void selects_Yes_option_for_living_in_the_United_States() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.doesProxyLiveInUnitedStatesYesOption);
		rasopathyQuestionnairePage.doesProxyLiveInUnitedStatesYesOption.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters mailing address for where study materials can be sent, street {string} city {string} state {string} zip code {string}")
	public void enters_mailing_address_for_where_study_materials_can_be_sent_street_city_state_zip_code(String street, String city, String state, String zipCode) {

	CommonUtils.waitForVisibility(rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox);	
	rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStreetTextBox.sendKeys(street);
	rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentCityTextBox.sendKeys(city);
	rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentStateTextBox.sendKeys(state);
	rasopathyQuestionnairePage.addressForStudyMaterialsToBeSentZipCodeTextBox.sendKeys(zipCode);
	rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters email address {string}")
	public void enters_email_address(String emailAddress) {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox);
		rasopathyQuestionnairePage.whatIsYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters email address {string} to confirm email address")
	public void enters_email_address_to_confirm_email_address(String emailAddress) {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox);
		rasopathyQuestionnairePage.pleaseConfirmYourEmailAddressTextBox.sendKeys(emailAddress);
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("enters home phone number {string}, cell phone number {string}, work phone number {string} and selects cell phone number as Preferred Contact")
	public void enters_home_phone_number_cell_phone_number_work_phone_number_and_selects_cell_phone_number_as_Preferred_Contact(String homePhoneNumber, String cellPhoneNumber, String workPhoneNumber) {

		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox);
		rasopathyQuestionnairePage.pleaseListHomePhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseListCellPhoneNumberTextBox.sendKeys(cellPhoneNumber);
		rasopathyQuestionnairePage.pleaseListWorkPhoneNumberTextBox.sendKeys(homePhoneNumber);
		rasopathyQuestionnairePage.pleaseSelectCellPhonePreferredContactCheckBox.click();
		rasopathyQuestionnairePage.studyNextButton.click();
	}
	
	@Given("selects Not Hispanic\\/Latino option for Ethnicity of proxy")
	public void selects_Not_Hispanic_Latino_option_for_Ethnicity_of_proxy() {
		
		CommonUtils.waitForVisibility(rasopathyQuestionnairePage.authenticityOfProxyNotHispanicLatinoOption);
		rasopathyQuestionnairePage.authenticityOfProxyNotHispanicLatinoOption.click();	
	}


	
	
	
}
