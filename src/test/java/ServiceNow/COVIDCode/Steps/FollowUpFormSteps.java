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

public class FollowUpFormSteps extends PageInitializer {

	@Given("a COVIDCode user is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.initialQuestionnaireConcent();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		MiscUtils.sleep(2000);
		servicePortalQuestionnairePage.startNewFollowUpButton.click();		
	}
	
	@Then("the user is able to search an existing enrollment by patient ID OR last name OR first name OR NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_OR_last_name_OR_first_name_OR_NIH_Medical_Record_Number() {
		MiscUtils.sleep(2000);
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();
	}

	@Then("the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_last_name_first_name_or_NIH_Medical_Record_Number() {
		MiscUtils.sleep(2000);
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();
	}
	
	@Given("an existing Draft Follow Up Form cleared to run automation")
	public void an_existing_Draft_Follow_Up_Form_cleared_to_run_automation() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		//ADDING TEMPORARY WORK AROUND TO LOG INTO FOLLOW UP FORM
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		if(CommonUtils.isElementDisplayed(servicePortalQuestionnairePage.draftFollowUpFirstDeleteButton)) {
			servicePortalQuestionnairePage.draftFollowUpFirstDeleteButton.click();
			MiscUtils.sleep(500);
			servicePortalQuestionnairePage.deleteConfirmationButton.click();
		}
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
	}

	@When("an enrollment is selected")
	public void an_enrollment_is_selected() {
		followUpFormPageImpl.selectingExistingFollowUPEnrollment();
	}
	
	@Then("selected enrollment is opened")
	public void selected_enrollment_is_opened() {
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}

	@When("the user is on the Disease Course section to add information")
	public void the_user_is_on_the_Disease_Course_section_to_add_information() {
		followUpFormPageImpl.accessingFollowUpFormDiseaseCourseSection();
	}

	@Then("the user is able to select multiple symptoms in the symptoms field")
	public void the_user_is_able_to_select_multiple_symptoms_in_the_symptoms_field() {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDFeverOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects {string} after having selected multiple symptoms")
	public void the_user_selects_after_having_selected_multiple_symptoms(String string) {
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDNoneOfTheAboveOption.click();
	}

	@Then("the user sees a pop up with the message {string}")
	public void the_user_sees_a_pop_up_with_the_message(String noneOfTheAboveMessage) {
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(noneOfTheAboveMessage));
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects Yes")
	public void the_user_selects_Yes() {
		followUpFormPage.diseaseCoursePopUpYesButton.click();
	}

	@Then("{string} option displays and replaces all previously selected symptoms")
	public void option_displays_and_replaces_all_previously_selected_symptoms(String noneOfTheAboveAfterSelecting) {
		followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText()
				.contentEquals(noneOfTheAboveAfterSelecting);
		CucumberLogUtils.logScreenShot();
	}

	@When("the user attempts to add a symptom such as {string} after selecting {string} option")
	public void the_user_attempts_to_add_a_symptom_such_as_after_selecting_option(String string, String string2) {
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDCoughOption.click();
	}

	@Then("the user sees another pop up with the message {string}")
	public void the_user_sees_another_pop_up_with_the_message(String message) {
		MiscUtils.sleep(3000);
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(message));
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} symptom is displayed")
	public void symptom_is_displayed(String coughOptionAfterSelected) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText()
				.contentEquals(coughOptionAfterSelected));
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} after having selected a symptoms")
	public void selecting_after_having_selected_a_symptoms(String string) {
		MiscUtils.sleep(3000);
		followUpFormPage.diseaseCourseSymptomsField.click();
		followUpFormPage.diseasCourseSymptomsDDdontKnowOption.click();
	}

	@Then("the user is able to see another pop up with the message {string}")
	public void the_user_is_able_to_see_another_pop_up_with_the_message(String message) {
		MiscUtils.sleep(1000);
		Assert.assertTrue(followUpFormPage.diseaseCoursePopUpMessage.getText().contentEquals(message));
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} option displays")
	public void option_displays(String dontKnowDisplayed) {
		MiscUtils.sleep(3000);
		Assert.assertTrue(
				followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(dontKnowDisplayed));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to select multiple treatment items in {string} field")
	public void the_user_is_able_to_select_multiple_treatment_items_in_field(String treatmentItemsField) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCoursetreatmentItemsSectionText);
		Assert.assertTrue(
				followUpFormPage.diseaseCoursetreatmentItemsSectionText.getText().contentEquals(treatmentItemsField));
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseTreatmentItemDDIntubationOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@When("the user selects {string} after having selected multiple treatment items")
	public void the_user_selects_after_having_selected_multiple_treatment_items(String string) {
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseSymptomsDDNoneOfTheAboveOption.click();

	}

	@When("the user adds a symptom such as {string} after selecting {string} option")
	public void the_user_adds_a_symptom_such_as_after_selecting_option(String string, String string2) {
		MiscUtils.sleep(2000);
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		MiscUtils.sleep(2000);
		followUpFormPage.diseasCourseTreatmentItemDDIntubationOption.click();
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} symptom is displayed in treatment item field")
	public void symptom_is_displayed_in_treatment_item_field(String intubationOption) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(
				followUpFormPage.diseaseCourseOptionDisplayeAfterSelecting.getText().contentEquals(intubationOption));
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} after having selected a treatment item")
	public void selecting_after_having_selected_a_treatment_item(String string) {
		followUpFormPage.diseaseCoursetreatmentItemsField.click();
		followUpFormPage.diseasCourseSymptomsDDdontKnowOption.click();
	}

	@When("on the {string} section")
	public void on_the_section(String string) {
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuredAndRiskFactorsLabelText);
		followUpFormPage.exposuredAndRiskFactorsLabelText.click();
		MiscUtils.sleep(5000);
	}

	@Then("the following questions should display {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}")
	public void the_following_questions_should_display(String patientsSelfReportedHealth, String medicalConditionsText,
			String patientCancerTypeText, String immunizationsUpToDateText, String patientReceivedVaccinationsText,
			String patientsWalkingPaceText, String hoursSpentSittingText, String patientVapeCigarettesText,
			String patientSmokeAtLeast100cigarettesText, String patientConsumeAlcoholicBeveragesText,
			String hoursSpentExercisingText) {
		followUpFormPageImpl.verifyingExposuresAndRiskFactorsQuestion(patientsSelfReportedHealth, medicalConditionsText,
				patientCancerTypeText, immunizationsUpToDateText, patientReceivedVaccinationsText,
				patientsWalkingPaceText, hoursSpentSittingText, patientVapeCigarettesText,
				patientSmokeAtLeast100cigarettesText, patientConsumeAlcoholicBeveragesText, hoursSpentExercisingText);
	}
	
	@When("on the Follow Up form in Service Portal")
	public void on_the_Follow_Up_form_in_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.initialQuestionnaireConcent();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		followUpFormPageImpl.searchEnrollmentByPatientID();
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}
	
	@Given("a COVIDcode user is on the Follow Up form in Service Portal")
	public void a_COVIDcode_user_is_on_the_Follow_Up_form_in_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.initialQuestionnaireConcent();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		followUpFormPageImpl.searchEnrollmentByPatientID();
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}
	
	@Given("a COVIDCode provider is on the Follow Up Form")
	public void a_COVIDCode_provider_is_on_the_Follow_Up_Form() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.initialQuestionnaireConcent();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		followUpFormPageImpl.searchEnrollmentByPatientID();
		servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}

	@Given("navigating to the Disease Course section")
	public void navigating_to_the_Disease_Course_section() {
		MiscUtils.sleep(1000);
	    JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
	    followUpFormPage.diseaseCourseNewButton.click();    
	}
	
	@Then("Drug Treatments section should display along with the values None, Azithromycin, Chloroquine, Corticosteroids, Hydroxycholoquine, JAK Inhibitor, Remdesivir, Tocilizumab, Other")
	public void drug_Treatments_section_should_display_along_with_the_values_None_Azithromycin_Chloroquine_Corticosteroids_Hydroxycholoquine_JAK_Inhibitor_Remdesivir_Tocilizumab_Other() {
		MiscUtils.sleep(1000);
		String [] arrayList = {"Azithromycin", "Chloroquine", "Convalescent plasma", "Corticosteroids", "Hydroxycholoquine", "JAK Inhibitor", "None", "Other", "Remdesivir", "Tocilizumab"};
	    followUpFormPage.diseaseCourseDrugTreatmentsTextField.click();
	    covidCodeEQPageImpl.servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(followUpFormPage.diseaseCourseDrugTreatmentsDropDownValues, arrayList);
	}
	
	@Given("a COVIDCode user is on the Follow Up form page")
	public void a_COVIDCode_user_is_on_the_Follow_Up_form_page() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		CommonUtils.waitForClickability(servicePortalQuestionnairePage.startNewFollowUpButton);
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		followUpFormPageImpl.selectingExistingFollowUPEnrollment();
	    servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}

	@Then("the systems does not allow any future dates to be selected for any date picker")
	public void the_systems_does_not_allow_any_future_dates_to_be_selected_for_any_date_picker() {
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
	
	@Given("a COVIDcode User is on the Follow Up form Service Portal")
	public void a_COVIDcode_User_is_on_the_Follow_Up_form_Service_Portal() throws TestingException {
		servicePortalQuestionnairePageImp.startNewInitialQuestionnaire();
		covidCodeEQPageImpl.requiredDemographicsInfo();
		covidCodeEQPageImpl.submittingEQ();
		CommonUtils.waitForClickability(servicePortalQuestionnairePage.startNewFollowUpButton);
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		followUpFormPageImpl.selectingExistingFollowUPEnrollment();
	    servicePortalQuestionnairePage.enrollmentLookUpCreateFollowUpButton.click();
	}

	@When("a navigating to the Symptomology tab")
	public void a_navigating_to_the_Symptomology_tab() {
	   covidCodeEQPage.symptomologyTab.click();
	   MiscUtils.sleep(2000);
	   CucumberLogUtils.logScreenShot();

	}

	@Then("the following field display: {string}, {string}, {string}, {string}")
	public void the_following_field_display(String wereYouSymptomatic, String howWasTheSampleTaken, String typeOfTest, String dateOfficiallyDiagnosed) {
		  Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticText.getText().contentEquals(wereYouSymptomatic));
		  Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireHowWasTheSampleTakenText.getText().contentEquals(howWasTheSampleTaken));
		  Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireWhatTypeOfTestDidThePatientReceiveText.getText().contentEquals(typeOfTest));
		  Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedText.getText().contentEquals(dateOfficiallyDiagnosed));
		  MiscUtils.sleep(2000);
	      CucumberLogUtils.logScreenShot();
	}

	@Then("when a selecting {string} to Were you symptomatic?")
	public void when_a_selecting_to_Were_you_symptomatic(String string) {
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticDropdown.click();
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys("Yes");
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticSearchBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("when did you the first develop symptoms of COVID{int}? date picker displays")
	public void when_did_you_the_first_develop_symptoms_of_COVID_date_picker_displays(Integer int1) {
		 Assert.assertTrue(covidCodeEQPage.enrollmentQuestionnaireWhenDevelopSymptomsText.getText().contentEquals("When did you first develop symptoms of COVID-19?"));
		 MiscUtils.sleep(2000);
		 CucumberLogUtils.logScreenShot();
	}

	
}