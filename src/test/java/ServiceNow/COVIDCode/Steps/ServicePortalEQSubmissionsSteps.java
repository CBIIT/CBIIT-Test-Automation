package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.StepsImplementation.ServicePortalEQPageImpl;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServicePortalEQSubmissionsSteps extends PageInitializer {
	
	@Given("a COVIDcode Study Provider user has logged in to the COVIDcode Study application")
	public void a_COVIDcode_Study_Provider_user_has_logged_in_to_the_COVIDcode_Study_application() throws TestingException {
		covidCodeLoginStepsImpl.covidCodeServicePortalLogin();
	}

	@When("the COVIDcode Study Provider fills out an Enrollment Questionnaire for a {string} who says {string} to join the study")
	public void the_COVIDcode_Study_Provider_fills_out_an_Enrollment_Questionnaire_for_a_who_says_to_join_the_study(String groupUserID, String consent) {
		covidCodeEQPageImpl.groupUserAndConsent(groupUserID, consent);
	}

	@When("enters users full name, required information, and demographics information")
	public void enters_users_full_name_required_information_and_demographics_information() {
		covidCodeEQPageImpl.requiredDemographicsInfo();
	}

	@When("does not enter Disease Course and Exposures and Risk Factors information")
	public void does_not_enter_Disease_Course_and_Exposures_and_Risk_Factors_information() {
		//skipping disease course and exposures and risk factors information
	}

	@When("Submits the enrollment questionnaire")
	public void submits_the_enrollment_questionnaire() {
		covidCodeEQPageImpl.submittingEQ();
	}

	@Then("the enrollment questionnaire should be successfully submitted")
	public void the_enrollment_questionnaire_should_be_successfully_submitted() throws TestingException {
		ServicePortalEQPageImpl.enrollmentSubmissionConfirmation();
	}
	
	@Given("a user is on the Exposures and Risk Factors tab on  COVIDcode Enrollment Questionnaire")
	public void a_user_is_on_the_Exposures_and_Risk_Factors_tab_on_COVIDcode_Enrollment_Questionnaire() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 2);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTab);
		MiscUtils.sleep(3000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTab.click();
	}
	
	@Then("the options for the following questions Non-steroidal anti-inflammatory drugs, Myocardial infarction or stroke medication, Paracetamol\\/acetaminophen, Blood thinners, Asthma medication, ACE-inhibitors for blood pressure, Pollen allergy medication, ARBs, Antibiotics penicillin, azithromycin are: -- None --, Day of or day before onset of symptoms\\/diagnosis \\(if asymptomatic), {int} to {int} days prior to onset of symptoms\\/diagnosis \\(if asymptomatic), {int} to {int} weeks prior to onset of symptoms\\/diagnosis \\(if asymptomatic), {int} to {int} months prior to onset of symptoms\\/diagnosis \\(if asymptomatic), Over {int} year prior to onset of symptoms\\/diagnosis \\(if asymptomatic), Never, Don’t know, Prefer not to answer")
	public void the_options_for_the_following_questions_Non_steroidal_anti_inflammatory_drugs_Myocardial_infarction_or_stroke_medication_Paracetamol_acetaminophen_Blood_thinners_Asthma_medication_ACE_inhibitors_for_blood_pressure_Pollen_allergy_medication_ARBs_Antibiotics_penicillin_azithromycin_are_None_Day_of_or_day_before_onset_of_symptoms_diagnosis_if_asymptomatic_to_days_prior_to_onset_of_symptoms_diagnosis_if_asymptomatic_to_weeks_prior_to_onset_of_symptoms_diagnosis_if_asymptomatic_to_months_prior_to_onset_of_symptoms_diagnosis_if_asymptomatic_Over_year_prior_to_onset_of_symptoms_diagnosis_if_asymptomatic_Never_Don_t_know_Prefer_not_to_answer(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7) {
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedAntibioticsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAntibioticsPenicillinSearchDropDownTextField.sendKeys(Keys.ENTER);
	}
	
	@Given("a COVIDCode App Admin user is in the Portal")
	public void a_COVIDCode_App_Admin_user_is_in_the_Portal() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
	}

	@When("the user creates a draft Enrollment questionnaire")
	public void the_user_creates_a_draft_Enrollment_questionnaire() {
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 2);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000);
	
	}

	@When("creates a new Disease Course record")
	public void creates_a_new_Disease_Course_record() {
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseNewButton.click();
		MiscUtils.sleep(5000);
	}

	@Then("there is a field option called {string} for the Drug Treatments field")
	public void there_is_a_field_option_called_for_the_Drug_Treatments_field(String ConvalescentPlasma) {
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseDrugTreatmentsTextField.click();
		MiscUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseDrugTreatmentsDropDownValues, ConvalescentPlasma);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}
}
