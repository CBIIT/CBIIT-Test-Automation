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
		String[] arrayList = {"-- None --", "Day of or day before onset of symptoms/diagnosis (if asymptomatic)", "2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)", "1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)", "1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic)", "Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)", "Never", "Don't know", "Prefer not to answer" };
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedAntibioticsDD.click();
		covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDDValue, arrayList);
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
	
	@When("on the Initial Questionnaire form in Service Portal")
	public void on_the_Initial_Questionnaire_form_in_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();	
	}

	@When("on the Demographics Information section")
	public void on_the_Demographics_Information_section() {
		MiscUtils.sleep(500);
		CommonUtils.click(covidCodeEQPage.demographicsTab);	
	}

	@When("selecting Feet\\/Inches for Height")
	public void selecting_Feet_Inches_for_Height() {
		MiscUtils.sleep(500);
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdown.click();
		List<WebElement> heightDropdownValues = covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(heightDropdownValues, "Feet/Inches");
	}

	@When("entering any value for feet")
	public void entering_any_value_for_feet() {
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireFeetTextBox, "5");
	}

	@When("entering a value greater than {int}")
	public void entering_a_value_greater_than(Integer inches) {
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireInchesTextBox, "13"); 
	}

	@When("clicking anywhere else or attempting to submit the application")
	public void clicking_anywhere_else_or_attempting_to_submit_the_application() {
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdown.click();
	}

	@Then("a message {string} displays")
	public void a_message_displays(String errorMessage) {
		Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireInchesErrorMessage.getText().contentEquals(errorMessage));
		CucumberLogUtils.logScreenShot();
	}
	
	@When("on the enrollment form in Service Portal")
	public void on_the_enrollment_form_in_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();	
	}

	@When("navigating to the Symptomology section")
	public void navigating_to_the_Symptomology_section() {
	   covidCodeEQPage.symptomologyTab.click();
	}
	
	@Then("{string} question displays")
	public void question_displays(String question) {
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedText);
		JavascriptUtils.drawRedBorder(covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedText);
	    Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedText.getText().contentEquals(question));
	    CucumberLogUtils.logScreenShot();
	}
	
	@Given("a COVIDcode user is on the Initial Questionnaire form in Service Portal")
	public void a_COVIDcode_user_is_on_the_Initial_Questionnaire_form_in_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();	
	}
	
	@When("on Disease Course section, when selecting {string} for the Organ Failure field")
	public void on_Disease_Course_section_when_selecting_for_the_Organ_Failure_field(String organFailureYes) {
		JavascriptUtils.scrollIntoView(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseNewButton);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseNewButton.click();
		MiscUtils.sleep(4000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrganFailureDropDown.click();
		List<WebElement> organFailureValues = covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrganFailureDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(organFailureValues, organFailureYes);
		MiscUtils.sleep(2000);
	}

	@Then("a new question appears that reads {string}")
	public void a_new_question_appears_that_reads(String whichOrganShowedFailure) {
		JavascriptUtils.drawRedBorder(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWhichOrgansFailedText);
	    Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWhichOrgansFailedText.getText().trim().contentEquals(whichOrganShowedFailure));
	    CucumberLogUtils.logScreenShot();
	}

	@Then("the field options are: Liver, Kidney, Lungs, Heart, Central Nervous system, Hematologic System, Other, Other \\(free text field)")
	public void the_field_options_are_Liver_Kidney_Lungs_Heart_Central_Nervous_system_Hematologic_System_Other_Other_free_text_field() {
	    String [] arrayList = {"Central nervous system", "Heart", "Hematologic system", "Kidney", "Liver", "Lungs", "Other"};
	    covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrgansFailedDropDown.click();
	    covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrgansFailedDropDownValues, arrayList);
	    CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrgansFailedDropDownValues, "Other");
	    CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDcode user has logged into the COVIDcode application in Service Portal")
	public void a_COVIDcode_user_has_logged_into_the_COVIDcode_application_in_Service_Portal() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 1);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000);
	}

	@Given("fills out patients contact information")
	public void fills_out_patients_contact_information() {
		covidCodeEQPage.enrollmentQuestionnairePatientLastNameTextBox.sendKeys("TestLN");
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("TestFN");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("TestMN");
		covidCodeEQPage.enrollmentQuestionnairePatientEmailAddressTextBox.sendKeys("test@automatedtest.com");
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("12345678");
		covidCodeEQPage.enrollmentQuestionnairePatientStreetAddress1TextBox.sendKeys("TestAddress");
		covidCodeEQPage.enrollmentQuestionnairePatientCityTextBox.sendKeys("TestCity");
		covidCodeEQPage.enrollmentQuestionnairePatientStateTextBox.sendKeys("TestState");
		covidCodeEQPage.enrollmentQuestionnairePatientZipCodeTextBox.sendKeys("20210");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("the user enters {string}, {string}, {string} information")
	public void the_user_enters_information(String biologicalSex, String describeYourRace, String areYouHispanicOrLatino) {
		covidCodeEQPage.demographicsTab.click();
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightSearchBox.sendKeys("Pounds");
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireWeightTextBox.sendKeys("150");
		covidCodeEQPage.enrollmentQuestionnaireWeightTextBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightSearchBox.sendKeys("Feet/Inches");
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireFeetTextBox.sendKeys("5");
		covidCodeEQPage.enrollmentQuestionnaireFeetTextBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireInchesTextBox.sendKeys("5");
		covidCodeEQPage.enrollmentQuestionnaireInchesTextBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropdown.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireBiologicalSexSearchBox, biologicalSex);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireRaceDropdown.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireRaceSearchBox, describeYourRace);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireRaceSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdown.click();
		if(areYouHispanicOrLatino.equalsIgnoreCase("No")) {
			
			CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdownValues, areYouHispanicOrLatino);
			MiscUtils.sleep(1000);
		}else {
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoSearchBox, areYouHispanicOrLatino);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		}
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("selects Yes to being symptomatic")
	public void selects_Yes_to_being_symptomatic() {
		covidCodeEQPage.symptomologyTab.click();
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys("Yes");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("selects {string}, {string}")
	public void selects(String howWasTheSampleTaken, String whatTypeOfTestDidThePatientRecieve) {
		covidCodeEQPage.enrollmentQuestionnaireHowWasTheSampleTakenDropdown.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireHowWasTheSampleTakenSearchBox, howWasTheSampleTaken);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireHowWasTheSampleTakenSearchBox.sendKeys(Keys.ENTER);
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireWhatTypeOfTestDidThePatientReceiveSearchBox, whatTypeOfTestDidThePatientRecieve);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireWhatTypeOfTestDidThePatientReceiveSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("in exposures and Risk Factors section enters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void in_exposures_and_Risk_Factors_section_enters(String followingMedicalConditions, String  regularlyVaped, String smokedAtLeast100Cigarettes, String nonSteroidalAntiInflammatoryDrugs, String paracetamol, String asthmaMedication, String pollenAllergy, String antibioticsPenicillin, String testedPositiveForCovid19, String myocardialInfarction, String bloodThinners, String aceInhibitors, String arbs, String  wearMask) {
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTab.click();
	    MiscUtils.sleep(2000);
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPleaseTellMeIfThePatientHaveAnyOfTheFollowingMedicalConditionsSearchBox, followingMedicalConditions);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPleaseTellMeIfThePatientHaveAnyOfTheFollowingMedicalConditionsSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(3000);
	    covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHaveThePatientEverRegularlyVapedAnEcigaretteOrSimilarDeviceDD.click();
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHaveThePatientEverRegularlyVapedAnEcigaretteOrSimilarDeviceSearchBox, regularlyVaped);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHaveThePatientEverRegularlyVapedAnEcigaretteOrSimilarDeviceSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsSmokedAtLeast100CigarettesDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsSmokedAtLeast100CigarettesSearchBox, smokedAtLeast100Cigarettes);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsSmokedAtLeast100CigarettesSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		if(!(smokedAtLeast100Cigarettes.matches("Never smoked|Don't know/prefer not to answer"))) {
			covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHowManyCigarettesUsuallySmokeDailyDD.click();
			covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHowManyCigarettesUsuallySmokeDailySearchBox.sendKeys("1-10");
			MiscUtils.sleep(1000);
			covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsHowManyCigarettesUsuallySmokeDailySearchBox.sendKeys(Keys.ENTER);
			MiscUtils.sleep(1000);			
		}
		
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnSearchDropDownTextField, nonSteroidalAntiInflammatoryDrugs);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenSearchDropDownTextField, paracetamol);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationSearchDropDownTextField, asthmaMedication);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedSearchDropDownTextField, pollenAllergy);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedAntibioticsDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAntibioticsPenicillinSearchDropDownTextField, antibioticsPenicillin);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAntibioticsPenicillinSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTestedPositiveForCovidDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTestedPositiveForCovidSearchBox, testedPositiveForCovid19);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsTestedPositiveForCovidSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationSearchDropDownTextField, myocardialInfarction);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersSearchDropDownTextField, bloodThinners);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsSearchDropDownTextField, aceInhibitors);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsSearchDropDownTextField, arbs);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsSearchDropDownTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskDD.click();
        if(wearMask.equalsIgnoreCase("No")) {
			CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskDdValue, wearMask);
			MiscUtils.sleep(2000);
		}else {
		    CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskSearchBox, wearMask);
		    MiscUtils.sleep(1000);
		    covidCodeEQPage.enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskSearchBox.sendKeys(Keys.ENTER);
		    MiscUtils.sleep(1000);
		}
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("selects Yes to having received the vaccine")
	public void selects_Yes_to_having_received_the_vaccine() {
		covidCodeEQPage.enrollmentQuestionnaireVaccineTab.click();
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidDD.click();
		covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidSearchBox.sendKeys("Yes");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("enters vaccine information {string}, {string}")
	public void enters_vaccine_information(String vaccineManufacture, String secondVaccine ) {
		covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureDD.click();
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureSearchBox, vaccineManufacture);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineDD.click();
		  if(secondVaccine.equalsIgnoreCase("No")) {
				
				CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineDDValue, secondVaccine);
				MiscUtils.sleep(2000);

			}else {
		CommonUtils.sendKeys(covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineSearchBox, secondVaccine);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
			}
		if(secondVaccine.equalsIgnoreCase("Yes")) {
			covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSearchBox.sendKeys("01/05/2021");
			MiscUtils.sleep(1000);
		}
		covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSearchBox.sendKeys("01/03/2021");	
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("enters Disease Course information")
	public void enters_Disease_Course_information() {
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseNewButton.click();
		MiscUtils.sleep(10000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseVisitDateSearchBox.sendKeys("01/04/2021");
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseSymptomsSearchBox.sendKeys("Headache");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseSymptomsSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseHaveYouBeenDiagnosedWithPneumoniaDD.click();
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseHaveYouBeenDiagnosedWithPneumoniaSeacrhBox.sendKeys("Not present");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseHaveYouBeenDiagnosedWithPneumoniaSeacrhBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseTreatmentItemsSeacrhBox.sendKeys("None of the above");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseTreatmentItemsSeacrhBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseDrugTreatmentsTextField.sendKeys("None");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseDrugTreatmentsTextField.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWereYouAdmittedToTheHospitalToTreatYourCovidDD.click();
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWereYouAdmittedToTheHospitalToTreatYourCovidSearchBox.sendKeys("Yes");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWereYouAdmittedToTheHospitalToTreatYourCovidSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseWhatDateWereYouAdmittedToTheHospitalSearchBox.sendKeys("01/04/2021");
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseRespiratoryRateDD.click();
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseRespiratoryRateSearchBox.sendKeys("Not elevated");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseRespiratoryRateSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseSepticShockDD.click();
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseSepticShockSearchBox.sendKeys("Don't know");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseSepticShockSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrganFailureDD.click();
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrganFailureSearchBox.sendKeys("Don't know");
		MiscUtils.sleep(1000);
		covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseOrganFailureSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to successfully submit the Initial Questionnaire")
	public void the_user_is_able_to_successfully_submit_the_Initial_Questionnaire() {
	    covidCodeEQPage.enrollmentQuestionnaireDiseaseCourseAddButton.click();
		MiscUtils.sleep(2000);
//		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
//		MiscUtils.sleep(2000);
//		covidCodeEQPage.enrollmentQuestionnaireSubmitYesButton.click();
		CucumberLogUtils.logScreenShot();

	}
	
	@Given("a COVIDcode user has submitted an Initial Questionnaire with an NIH Medical Record number")
	public void a_COVIDcode_user_has_submitted_an_Initial_Questionnaire_with_an_NIH_Medical_Record_number() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 1);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000); 
		covidCodeEQPage.demographicsTab.click();
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexSearchBox.sendKeys("Male");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoSearchBox.sendKeys("Yes");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireRaceDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireRaceSearchBox.sendKeys("White");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireRaceSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightSearchBox.sendKeys("Pounds");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireWeightTextBox.sendKeys("150");
		MiscUtils.sleep(1000); 		
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightSearchBox.sendKeys("Feet/Inches");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightSearchBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireFeetTextBox.sendKeys("5");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireFeetTextBox.sendKeys(Keys.ENTER);
		covidCodeEQPage.enrollmentQuestionnaireInchesTextBox.sendKeys("5");
		MiscUtils.sleep(1000); 
		covidCodeEQPage.enrollmentQuestionnaireInchesTextBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireSubmitYesButton.click();
		MiscUtils.sleep(8000);
		CucumberLogUtils.logScreenShot(); 
	}

	@When("a Study Staff Nurse navigates to native view to view the submitted enrollment and verify NIH Medical Record number")
	public void a_Study_Staff_Nurse_navigates_to_native_view_to_view_the_submitted_enrollment_and_verify_NIH_Medical_Record_number() throws TestingException {
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();		
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewNihMedcalRecordNumber.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Study Staff Nurse is able to edit NIH Medical Record field")
	public void the_Study_Staff_Nurse_is_able_to_edit_NIH_Medical_Record_field() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewNihMedcalRecordNumber.sendKeys("444");
		MiscUtils.sleep(2000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewNihMedcalRecordNumber.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewNihMedcalRecordNumber.getAttribute("value").contentEquals("444"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	@Given("a COVIDcode user is on the Service Portal Initial Questionnaire form")
	public void a_COVIDcode_user_is_on_the_Service_Portal_Initial_Questionnaire_form() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 2);
		servicePortalQuestionnairePage.createEnrollmentButton.click();
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to see the {string} field in Service Portal")
	public void the_user_is_able_to_see_the_field_in_Service_Portal(String hospitalName) {
	 Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireHospitalNameText.getText().contentEquals(hospitalName));
	 MiscUtils.sleep(2000);
	 CucumberLogUtils.logScreenShot();
	}
	
	@Given("a COVIDCode user is on the Initial questionnaire page")
	public void a_COVIDCode_user_is_on_the_Initial_questionnaire_page() throws TestingException {
		signOutVerificationStepImp.covidCodeServicePortalLogIn();
		   servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		   servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		   CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown, 1);
		   servicePortalQuestionnairePage.createEnrollmentButton.click();
	   CucumberLogUtils.logScreenShot();
	}

	@Then("the system does not allow any future dates to be selected for any date picker")
	public void the_system_does_not_allow_any_future_dates_to_be_selected_for_any_date_picker() {
	   covidCodeEQPage.demographicsTab.click();
	   covidCodeEQPage.enrollmentQuestionnaireDateFormCompletedBox.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireDateFormCompletedBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireDOBbox.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireDOBbox.sendKeys(Keys.ENTER);
	   MiscUtils.sleep(1000);
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireDateFormSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireDOBSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   MiscUtils.sleep(2000);
	   CucumberLogUtils.logScreenShot();
	   covidCodeEQPage.symptomologyTab.click();
	   covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticDropdown.click();
	   covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys("Yes");
	   MiscUtils.sleep(1000);
	   covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireWhenDevelopSymptoms.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireWhenDevelopSymptoms.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedDropdown.click();
	   covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedSearchText.sendKeys("Yes");
	   MiscUtils.sleep(1000);
	   covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedSearchText.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendar.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendar.sendKeys(Keys.ENTER);
	   MiscUtils.sleep(1000);
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireWhenDevelopSymptomsSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendarSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   MiscUtils.sleep(2000);
	   CucumberLogUtils.logScreenShot();
	   covidCodeEQPage.enrollmentQuestionnaireVaccineTab.click();
	   covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidDD.click();
	   covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidSearchBox.sendKeys("Yes");
	   MiscUtils.sleep(1000);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidSearchBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSearchBox.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSearchBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureDD.click();
	   covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureSearchBox.sendKeys("Pfizer");
	   MiscUtils.sleep(1000);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineManufactureSearchBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineDD.click();
	   covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineSearchBox.sendKeys("Yes");
	   covidCodeEQPage.enrollmentQuestionnaireVaccineReceivedSecondVaccineSearchBox.sendKeys(Keys.ENTER);
	   covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSearchBox.sendKeys("02/22/2026");
	   covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSearchBox.sendKeys(Keys.ENTER);
	   MiscUtils.sleep(1000);
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSelectedDateCannotBeInTheFutureText.getText().contentEquals("Selected date cannot be in the future."));
	   MiscUtils.sleep(2000);
	   CucumberLogUtils.logScreenShot();

	}
}