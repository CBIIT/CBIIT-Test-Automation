package DEPRECATED.COVIDCode.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicePortalFollowUpScenarioSteps extends PageInitializer {

	@Given("a user in the CovidCode App Admins group has saved a draft Follow-up Questionnaire")
	public void a_user_in_the_CovidCode_App_Admins_group_has_saved_a_draft_Follow_up_Questionnaire() {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.sleep(1000);
		CommonUtils.selectDropDownValue("User Group 2", servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown);
	    servicePortalQuestionnairePage.createEnrollmentButton.click();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireSubmitButton);
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		CommonUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireSubmitYesButton.click();
		CommonUtils.sleep(2000);
		covidCodeEQPage.COVIDcodeHomeButton.click();
		CommonUtils.sleep(5000);	
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		CommonUtils.sleep(1000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("AutomatedFNGroup3");
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		CommonUtils.sleep(3000);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
		JavascriptUtils.scrollIntoView(followUpFormPage.followUpNIHMedicalRecordNumberTextBox);
		followUpFormPage.followUpNIHMedicalRecordNumberTextBox.sendKeys("11122288");
		followUpFormPage.followUpDemographicsTextBox.click();
		JavascriptUtils.scrollIntoView(followUpFormPage.followUpQuestionnaireDemographicDateFormComplted);
		followUpFormPage.followUpQuestionnaireDemographicDateFormComplted.sendKeys("05/07/2020");
		JavascriptUtils.scrollIntoView(followUpFormPage.followUpSaveButton);
		followUpFormPage.followUpSaveButton.click();
	}

	@When("the user in the CovidCode App Admins group comes to the COVIDCode Home Page")
	public void the_user_in_the_CovidCode_App_Admins_group_comes_to_the_COVIDCode_Home_Page()  {
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(covidCodeEQPage.COVIDcodeHomeButton);
		covidCodeEQPage.COVIDcodeHomeButton.click();
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("the draft is shown in the Draft Follow up Questionnaires table on the Home Page")
	public void the_draft_is_shown_in_the_Draft_Follow_up_Questionnaires_table_on_the_Home_Page() {
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.draftFollowUpFirstRow);
		JavascriptUtils.scrollUp(200);
		CommonUtils.sleep(500);
		servicePortalQuestionnairePage.draftFollowUpLastUpdated.click();
		CommonUtils.sleep(1000);
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpFirstRow.getText().contains("11122288"));
		CucumberLogUtils.logScreenshot();
	}

	@Then("the user can resume draft follow up questionnaire by clicking the Open button")
	public void the_user_can_resume_draft_follow_up_questionnaire_by_clicking_the_Open_button() {
		servicePortalQuestionnairePage.draftFollowUpFirstOpenButton.click();
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(5000);
	}

	@Given("a COVIDcode user is on the Disease Course section on the Follow Up form")
	public void a_COVIDcode_user_is_on_the_Disease_Course_section_on_the_Follow_Up_form()  {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("Automated");
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
		CommonUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		followUpFormPage.diseaseCourseNewButton.click();
		CommonUtils.sleep(5000);
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
		CucumberLogUtils.logScreenshot();
	}

	@Given("COVIDCode App Admin user is in the Portal")
	public void covidcode_App_Admin_user_is_in_the_Portal()  {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();

	}

	@When("the user creates a draft Follow-up questionnaire")
	public void the_user_creates_a_draft_Follow_up_questionnaire() {
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		CommonUtils.sleep(5000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys("Automated");
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDownTextField.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();

	}

	@When("create a new Disease Course record")
	public void create_a_new_Disease_Course_record() {
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		followUpFormPage.diseaseCourseNewButton.click();
		CommonUtils.sleep(5000);
	}

	@Then("there is a field option called a {string} for the Drug Treatments field")
	public void there_is_a_field_option_called_a_for_the_Drug_Treatments_field(String Plasma) {
		followUpFormPage.diseaseCourseDrugTreatmentsTextField.click();
		CommonUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(followUpFormPage.diseaseCourseDrugTreatmentsDropDownValues,
				Plasma);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
	}
}
