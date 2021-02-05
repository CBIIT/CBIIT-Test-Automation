package ServiceNow.COVIDCode.Steps;



import org.junit.Assert;
import org.openqa.selenium.Keys;
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

public class ServicePortalFollowUpScenarioSteps extends PageInitializer {

	@Given("a user in the CovidCode App Admins group has saved a draft Follow-up Questionnaire")
	public void a_user_in_the_CovidCode_App_Admins_group_has_saved_a_draft_Follow_up_Questionnaire()
			throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown.click();
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("User Group 2", servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown);
	    servicePortalQuestionnairePage.createEnrollmentButton.click();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireSubmitYesButton.click();
		MiscUtils.sleep(2000);
		covidCodeEQPage.COVIDcodeHomeButton.click();
		MiscUtils.sleep(5000);	
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		MiscUtils.sleep(1000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("AutomatedFNGroup3");
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		MiscUtils.sleep(3000);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
		followUpFormPage.followUpNIHMedicalRecordNumberTextBox.sendKeys("11122288");
		followUpFormPage.followUpDemographicsTextBox.click();
		followUpFormPage.followUpQuestionnaireDemographicDateFormComplted.sendKeys("05/07/2020");
		followUpFormPage.followUpSaveButton.click();
	}

	@When("the user in the CovidCode App Admins group comes to the COVIDCode Home Page")
	public void the_user_in_the_CovidCode_App_Admins_group_comes_to_the_COVIDCode_Home_Page() throws TestingException {
		JavascriptUtils.scrollUp(2000);
		MiscUtils.sleep(3000);
		covidCodeEQPage.COVIDcodeHomeButton.click();
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the draft is shown in the Draft Follow up Questionnaires table on the Home Page")
	public void the_draft_is_shown_in_the_Draft_Follow_up_Questionnaires_table_on_the_Home_Page() {
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.draftFollowUpFirstRow);
		servicePortalQuestionnairePage.draftFollowUpLastUpdated.click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpFirstRow.getText().contains("11122288"));
		Assert.assertTrue(
				servicePortalQuestionnairePage.draftFollowUpUserGroupIDField.getText().contains("Group 1"));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user can resume draft follow up questionnaire by clicking the Open button")
	public void the_user_can_resume_draft_follow_up_questionnaire_by_clicking_the_Open_button() {
		servicePortalQuestionnairePage.draftFollowUpFirstOpenButton.click();
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(5000);
	}

	@Given("a COVIDcode user is on the Disease Course section on the Follow Up form")
	public void a_COVIDcode_user_is_on_the_Disease_Course_section_on_the_Follow_Up_form() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("Automated");
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		followUpFormPage.diseaseCourseNewButton.click();
		MiscUtils.sleep(5000);
	}

	@When("select {string} for the Symptoms")
	public void select_for_the_Symptoms(String othersSpecify) {
		followUpFormPage.diseaseCourseSymptomsField.click();
		CommonUtils.selectValueFromBootStrapDropDown(followUpFormPage.diseaseCourseSymptomsDDValue, othersSpecify);
	}

	@Then("a free text field {string} text is displayed")
	public void a_free_text_field_text_is_displayed(String freeTextSpecify) {
		followUpFormPage.diseaseCourseSymptomsOtherTextField.click();
		followUpFormPage.diseaseCourseSymptomsOtherTextField.sendKeys(freeTextSpecify);
		CucumberLogUtils.logScreenShot();
	}

	@Given("COVIDCode App Admin user is in the Portal")
	public void covidcode_App_Admin_user_is_in_the_Portal() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();

	}

	@When("the user creates a draft Follow-up questionnaire")
	public void the_user_creates_a_draft_Follow_up_questionnaire() {
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		MiscUtils.sleep(5000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("Automated");
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();

	}

	@When("create a new Disease Course record")
	public void create_a_new_Disease_Course_record() {
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		followUpFormPage.diseaseCourseNewButton.click();
		MiscUtils.sleep(5000);
	}

	@Then("there is a field option called a {string} for the Drug Treatments field")
	public void there_is_a_field_option_called_a_for_the_Drug_Treatments_field(String Plasma) {
		followUpFormPage.diseaseCourseDrugTreatmentsTextField.click();
		MiscUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(followUpFormPage.diseaseCourseDrugTreatmentsDropDownValues,
				Plasma);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}
}
