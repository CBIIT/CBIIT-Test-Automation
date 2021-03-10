package ServiceNow.COVIDCode.Steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
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

public class ServicePortalIQScenarioSteps extends PageInitializer {

	@Given("a user in the CovidCode App Admins group has saved a draft Initial Questionnaire")
	public void a_user_in_the_CovidCode_App_Admins_group_has_saved_a_draft_Initial_Questionnaire() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown.click();
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("User Group 2", servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		covidCodeEQPage.enrollmentQuestionnaireNIHMedicalRecordNumberTextBox.sendKeys("11122245");
		covidCodeEQPage.enrollmentQuestionnairePatientLastNameTextBox.sendKeys("AutomatedLNGroup2");
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("AutomatedFNGroup2");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("M");
		MiscUtils.sleep(3000);
		covidCodeEQPage.enrollmentQuestionnairePatientEmailAddressTextBox.sendKeys("emailGroup2@email.com");
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("2346794567");
		covidCodeEQPage.enrollmentQuestionnairePatientStreetAddress1TextBox.sendKeys("345 M Road");
		covidCodeEQPage.enrollmentQuestionnaireSaveButton.click();
		
	   	}
	
	@When("the user comes to the COVIDCode Home Page")
	public void the_user_comes_to_the_COVIDCode_Home_Page() throws TestingException {
		JavascriptUtils.scrollUp(2000);
		MiscUtils.sleep(3000);
		covidCodeEQPage.COVIDcodeHomeButton.click();
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}


	@Then("the draft is shown in the Draft Initial Questionnaires table")
	public void the_draft_is_shown_in_the_Draft_Initial_Questionnaires_table() {
	
	   Assert.assertTrue(servicePortalQuestionnairePage.draftIQTableFirstRow.getText().contains("11122245"));
	   Assert.assertTrue(servicePortalQuestionnairePage.draftIQTableFirstRowUserGroupIDField.getText().contentEquals("Group 2"));
	   CucumberLogUtils.logScreenShot();
	  
	}

	@Then("the user can resume draft by clicking the Open button")
	public void the_user_can_resume_draft_by_clicking_the_Open_button() {
		 servicePortalQuestionnairePage.draftInitialOpenButton.click();
		 CucumberLogUtils.logScreenShot();
	}
	
	@Given("COVIDcode user is on the Disease Course section on the Initial Questionnaire form")
	public void covidcode_user_is_on_the_Disease_Course_section_on_the_Initial_Questionnaire_form()
			throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 2);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		followUpFormPage.diseaseCourseNewButton.click();
		MiscUtils.sleep(5000);
	}

	@When("selecting {string} for Symptoms")
	public void selecting_for_Symptoms(String otherSpecify) {
		followUpFormPage.diseaseCourseSymptomsField.click();
		CommonUtils.selectValueFromBootStrapDropDown(followUpFormPage.diseaseCourseSymptomsDDValue, otherSpecify);
	}

	@Then("free text field with {string} text is displayed")
	public void free_text_field_with_text_is_displayed(String specify) {
		followUpFormPage.diseaseCourseSymptomsOtherTextField.click();
		followUpFormPage.diseaseCourseSymptomsOtherTextField.sendKeys(specify);
		CucumberLogUtils.logScreenShot();

	}
	
	@Given("an enrollment form has been filled out")
	public void an_enrollment_form_has_been_filled_out() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		CucumberLogUtils.logScreenShot();
		// Start New initial questionnaire, select Group1 and click on create Enrollment
		// Button
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.startNewInitialQuestionnaireButton);
		MiscUtils.sleep(2000);

		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown,
				"1");
		JavascriptUtils.clickByJS(servicePortalQuestionnairePage.createEnrollmentButton);
		// filling the questionnaire
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireUserGroupIdDropdown);
		covidCodeEQPage.enrollmentQuestionnaireConsentDropdown.click();
		List<WebElement> consentValues = covidCodeEQPage.enrollmentQuestionaireConsentDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(consentValues, "Yes");
		covidCodeEQPageImpl.requiredDemographicsInfo();
	}

	@When("submitting")
	public void submitting() {
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		MiscUtils.sleep(2000);
	}

	@Then("a pop up with the message {string} displays")
	public void a_pop_up_with_the_message_displays(String confirmSubmissionPopUpText) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(confirmSubmissionPopUpText, covidCodeEQPage.enrollmentQuestionnaireConfirmSubmissionPopUpText.getText());
	}



}
