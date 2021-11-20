
package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Pages.RASSurveyPage;
import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

public class RASSurveySteps extends PageInitializer {

	@Given("a participant is on the Rassurvey Questionaire login page - myRAS Survey")
	public void a_participant_is_on_the_Rassurvey_Questionaire_login_page_myRAS_Survey() throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("RASSurvey"));
		CommonUtils.waitForVisibility(rASSurveyPage.mobileViewSlider);
		rASSurveyPage.mobileViewSlider.click();
		CommonUtils.switchToFrame(rASSurveyPage.surveyIFrame);
		CucumberLogUtils.logScreenShot();
	}

	@Given("logs in via Okta with username {string} and password {string} on login page - myRAS Survey")
	public void logs_in_via_Okta_with_username_and_password_on_login_page_myRAS_Survey(String username,
			String password) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.cHARMSEmailLogIn);
		rASSurveyPage.cHARMSEmailLogIn.sendKeys(username);
		rASSurveyPage.cHARMSpasswordToLogIn.sendKeys(password);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey")
	public void clicks_on_survey_next_button_after_reviewing_the_survey_details_to_start_on_the_myRAS_Survey_questions_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey")
	public void clicks_next_button_on_The_first_block_of_questions_will_collect_basic_demographic_information_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects I am completing this form for myself option on who is completing this form page - myRAS Survey")
	public void selects_I_am_completing_this_form_for_myself_option_on_who_is_completing_this_form_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.completingFormForSelfRadioButton);
		rASSurveyPage.completingFormForSelfRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES option for Have you ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher? page - myRAS Survey")
	public void clicks_YES_option_for_Have_you_ever_been_included_in_a_published_case_report_or_otherwise_represented_in_a_public_manner_by_a_healthcare_provider_orresearcher_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("enters information about a previous cancer study {string} Please provide any additional information about the authors, year of publication or PubMed ID \\(PMID), if available. page - myRAS Survey")
	public void enters_information_about_a_previous_cancer_study_Please_provide_any_additional_information_about_the_authors_year_of_publication_or_PubMed_ID_PMID_if_available_myRAS_Survey(
			String additionalInfo) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.pleaseProvideAdditionalintoIfAvailabletextbox);
		rASSurveyPage.pleaseProvideAdditionalintoIfAvailabletextbox.sendKeys(additionalInfo);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_will_ask_about_birth_and_neonatal_history_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Biological Mother birth city {string}, select Mothers Age {string} and enters Father birth city {string},and selects Fathers age {string} for What was your biological parents age in Years when you were born? page - myRAS Survey")
	public void enters_Biological_Mother_birth_city_select_Mothers_Age_and_enters_Father_birth_city_and_selects_Fathers_age_for_What_was_your_biological_parents_age_in_Years_when_you_were_born_page_myRAS_Survey(
			String mothersBirthCity, String mothersAge, String fathersBirthCity, String fathersAge) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.bioMothersBirthCityTextBox);
		rASSurveyPage.bioMothersBirthCityTextBox.sendKeys(mothersBirthCity);
		rASSurveyPage.bioFatherBirthCityTextBox.sendKeys(fathersBirthCity);
		CommonUtils.selectDropDownValue(mothersAge, rASSurveyPage.bioMothersAgeWhenBornDropDown);
		CommonUtils.selectDropDownValue(fathersAge, rASSurveyPage.bioFathersAgeWhenBornDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Were you diagnosed with hypoglycemia \\(low blood sugar) during the newborn period. page - myRAS Survey")
	public void clicks_YES_Were_you_diagnosed_with_hypoglycemia_low_blood_sugar_during_the_newborn_period_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters in other prenatal condition {string} for Were you diagnosed with any of the following conditions during your mothers pregnancy? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_in_other_prenatal_condition_for_Were_you_diagnosed_with_any_of_the_following_conditions_during_your_mothers_pregnancy_page_myRAS_Survey(
			String otherPrenatalCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherConditionTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherConditionTextBox.sendKeys(otherPrenatalCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES During her pregnancy with you, did your mother have any prenatal tests to identify fetal birth defects or fetal medical problems? page - myRAS Survey")
	public void click_YES_During_her_pregnancy_with_you_did_your_mother_have_any_prenatal_tests_to_identify_fetal_birth_defects_or_fetal_medical_problems_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All normal results and enters other prenatal test {string} for Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you. page - myRAS Survey")
	public void selects_All_normal_results_and_enters_other_prenatal_test_for_Please_indicate_the_results_of_the_prenatal_tests_administered_to_your_biological_mother_during_her_pregnancy_with_you_page_myRAS_Survey(
			String otherPrenatalTest) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.serumSFRadioButton);
		rASSurveyPage.serumSFRadioButton.click();
		rASSurveyPage.ultrasoundRadioButton.click();
		rASSurveyPage.amniocentesisRadioButton.click();
		rASSurveyPage.chronicVillaSamplingRadioButton.click();
		rASSurveyPage.fetalBloodSamplingRadioButton.click();
		rASSurveyPage.stressTestRadioButton.click();
		rASSurveyPage.xRayRadioButton.click();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		rASSurveyPage.otherRadioButton.click();
		rASSurveyPage.otherTestTextBox.sendKeys(otherPrenatalTest);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters mothers prenatal type of infection {string} prenatal type of rash {string}, other complications {string} for Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_mothers_prenatal_type_of_infection_prenatal_type_of_rash_other_complications_for_Was_your_biological_mother_diagnosed_with_any_of_the_following_conditions_prior_to_or_during_her_pregnancy_with_you_page_myRAS_Survey(
			String prenatalInfection, String prenatalRash, String otherPrenatalComplications) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.typeOfInfectionTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown", "Mother did not have any of these conditions");
		rASSurveyPage.typeOfInfectionTextBox.sendKeys(prenatalInfection);
		rASSurveyPage.rashTextBox.sendKeys(prenatalRash);
		rASSurveyPage.otherComplicationsTextBox.sendKeys(otherPrenatalComplications);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES During her pregnancy with you, did your biological mother take any medications vitamins or supplements for any reason? page - myRAS Survey")
	public void click_YES_During_her_pregnancy_with_you_did_your_biological_mother_take_any_medications_vitamins_or_supplements_for_any_reason_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply for and enters herbal supplement {string}, other medication {string}, and other medication {string} for Please select all medications your mother took during her pregnancy with you. page - myRAS Survey")
	public void selects_All_that_apply_for_and_enters_herbal_supplement_other_medication_and_other_medication_for_Please_select_all_medications_your_mother_took_during_her_pregnancy_with_you_page_myRAS_Survey(
			String herbalSupplement, String otherMedication1, String otherMedication2) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.herbalSupplementTextBox);
		rASSurveyStepsImpl
				.selectingCheckBoxes("Unsure of what medications/supplements/vitamins taken during pregnancy");
		rASSurveyPage.herbalSupplementTextBox.sendKeys(herbalSupplement);
		rASSurveyPage.otherMedicationTextBox.sendKeys(otherMedication1);
		rASSurveyPage.otherMedicationTextBox2.sendKeys(otherMedication2);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("adds details in Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey")
	public void adds_details_in_Please_provide_details_on_the_name_of_the_medication_taken_reason_it_was_taken_and_approximate_length_of_time_it_was_taken_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.antibioticNameTextBox);
		rASSurveyPage.antibioticNameTextBox.sendKeys("NAMEOFANTIBIOTIC");
		rASSurveyPage.antibioticReasonTextBox.sendKeys("INFECTION");
		CommonUtils.selectDropDownValue("9 months", rASSurveyPage.antibioticLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.vitaminNameTextBox.sendKeys("VITAMIN B");
		rASSurveyPage.vitaminReasonTextBox.sendKeys("SUPPORT");
		CommonUtils.selectDropDownValue("5 months", rASSurveyPage.vitaminLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antihypertensivesNameTextBox.sendKeys("PROPRANOLOL");
		rASSurveyPage.antihypertensiveReasonTextBox.sendKeys("BLOOD PRESSURE");
		CommonUtils.selectDropDownValue("2 weeks",
				rASSurveyPage.antihypertensivesLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.insulinMedicationNameTextBox.sendKeys("INSULIN");
		rASSurveyPage.insulinReasonTextBox.sendKeys("DIABETES");
		CommonUtils.selectDropDownValue("4 weeks", rASSurveyPage.insulinLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antiemeticsNameTextBox.sendKeys("ANTIEMETICS");
		rASSurveyPage.antiemeticsReasonTextBox.sendKeys("ANTIEMETICS DEFICIENCY");
		CommonUtils.selectDropDownValue("9 months", rASSurveyPage.antiemeticsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.hormoneNameTextBox.sendKeys("PROGESTERONE");
		rASSurveyPage.hormoneReasonTextBox.sendKeys("HORMONALINBALANCE");
		CommonUtils.selectDropDownValue("4 months", rASSurveyPage.hormonesLenghtOfTimeMedicationWasTakenDropDown);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		rASSurveyPage.antidepressantNameTextBox.sendKeys("ZOLOFT");
		rASSurveyPage.antidepressantReasonTextBox.sendKeys("DEPRESSION");
		CommonUtils.selectDropDownValue("1 month", rASSurveyPage.antiDepressantsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.diureticNameTextBox.sendKeys("DIUERTIC");
		rASSurveyPage.diureticReasonTextBox.sendKeys("DIURETIC DEFICIENCY");
		CommonUtils.selectDropDownValue("7 days", rASSurveyPage.diureticsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.painReliverNameTextBox.sendKeys("OXYCOTIN");
		rASSurveyPage.painReliverReasonTextBox.sendKeys("EXTREMEPAIN");
		CommonUtils.selectDropDownValue("4 days", rASSurveyPage.painRelieversLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.pretermLaborMedicationNameTextBox.sendKeys("PRETERM LABOR MEDICATION");
		rASSurveyPage.pretermLaborReasonTextBox.sendKeys("PRETERM LABOR RISK");
		CommonUtils.selectDropDownValue("3 weeks",
				rASSurveyPage.medicationsForPretermLaborLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.thyroidMedicationNameTextBox.sendKeys("THYROID MEDICATION");
		rASSurveyPage.thyroidReasonTextBox.sendKeys("THYROID ILLNESS");
		CommonUtils.selectDropDownValue("1 day",
				rASSurveyPage.thyroidMedicationsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antiSeizureNameTextBox.sendKeys("ANTI SEIZURE MEDICATION");
		rASSurveyPage.antiSeizureReasonTextBox.sendKeys("SEIZURES");
		CommonUtils.selectDropDownValue("4 days",
				rASSurveyPage.antiSeizureMedicationsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.oreganoNameTextBox.sendKeys("OREGANO");
		rASSurveyPage.oreganoReasonTextBox.sendKeys("DIGESTIVE SUPPORT");
		CommonUtils.selectDropDownValue("9 months", rASSurveyPage.oreganoLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.tpnNameTextBox.sendKeys("TPN");
		rASSurveyPage.tpnReasonTextBox.sendKeys("TPN DEFICIENCY");
		CommonUtils.selectDropDownValue("6 days", rASSurveyPage.tpnLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.turmericNameTextBox.sendKeys("TUMERIC");
		rASSurveyPage.turmericReasonTextBox.sendKeys("INFLAMMATION");
		CommonUtils.selectDropDownValue("3 days", rASSurveyPage.tumericLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.melatoninNameTextBox.sendKeys("MELATONIN");
		rASSurveyPage.melatoninReasonTextBox.sendKeys("SLEEPING ISSUES");
		CommonUtils.selectDropDownValue("6 days", rASSurveyPage.melatoninLenghtOfTimeMedicationWasTakenDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks next Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey")
	public void clicks_next_Please_provide_details_on_the_name_of_the_medication_taken_reason_it_was_taken_and_approximate_length_of_time_it_was_taken_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Did your biological mother use any tobacco products during her pregnancy with you? page - myRAS Survey")
	public void clicks_YES_Did_your_biological_mother_use_any_tobacco_products_during_her_pregnancy_with_you_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters other tobacco product {string} for What tobacco products did your biological mother use during her pregnancy with you? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_other_tobacco_product_for_What_tobacco_products_did_your_biological_mother_use_during_her_pregnancy_with_you_page_myRAS_Survey(
			String otherTobaccoProducts) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherTobaccoProducts);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Did your biological mother use any vaping products during her pregnancy with you? - myRAS Survey")
	public void clicks_YES_Did_your_biological_mother_use_any_vaping_products_during_her_pregnancy_with_you_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters other vape product {string} for Which vaping products did your mother use during her pregnancy with you? Please select all that apply. page - myRAS Survey")
	public void selects_All_that_apply_and_enters_other_vape_product_for_Which_vaping_products_did_your_mother_use_during_her_pregnancy_with_you_Please_select_all_that_apply_page_myRAS_Survey(
			String otherVapeProducts) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherVapeProducts);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Did your biological mother drink any alcoholic beverages during her pregnancy with you? page - myRAS Survey")
	public void clicks_YES_Did_your_biological_mother_drink_any_alcoholic_beverages_during_her_pregnancy_with_you_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters other alcoholic beverage {string} for What alcoholic beverages did your mother drink during her pregnancy with you? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_other_alcoholic_beverage_for_What_alcoholic_beverages_did_your_mother_drink_during_her_pregnancy_with_you_page_myRAS_Survey(
			String otherAlcoholicBeverages) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherAlcoholicBeverages);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Did your biological mother use any recreational drugs during her pregnancy with you? page - myRAS Survey")
	public void clicks_YES_Did_your_biological_mother_use_any_recreational_drugs_during_her_pregnancy_with_you_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters other recreational drug {string} for What recreational drug did your biological mother use during her pregnancy with you? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_other_recreational_drug_for_What_recreational_drug_did_your_biological_mother_use_during_her_pregnancy_with_you_page_myRAS_Survey(
			String otherRecreationalDrugs) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherRecreationalDrugs);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Did your biological mother ever live or work in a place where others smoked cigarettes, pipes or cigars around her during her pregnancy with you? page - myRAS Survey")
	public void clicks_YES_Did_your_biological_mother_ever_live_or_work_in_a_place_where_others_smoked_cigarettes_pipes_or_cigars_around_her_during_her_pregnancy_with_you_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All that apply and enters other products used around your mother {string} for What products were used around your biological mother during her pregnancy with you? page - myRAS Survey")
	public void selects_All_that_apply_and_enters_other_products_used_around_your_mother_for_What_products_were_used_around_your_biological_mother_during_her_pregnancy_with_you_page_myRAS_Survey(
			String otherPrenatalProducts) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherPrenatalProducts);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("adds Please describe your biological parents occupation\\(s) during your mothers pregnancy with you? and enters mothers occupation {string} and enters fathers occupation {string} in Please list all of the occupations during the pregnancy. page - myRAS Survey")
	public void adds_Please_describe_your_biological_parents_occupation_s_during_your_mothers_pregnancy_with_you_and_enters_mothers_occupation_and_enters_fathers_occupation_in_Please_list_all_of_the_occupations_during_the_pregnancy_page_myRAS_Survey(
			String mothersOccupation, String fathersOccupation) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.biologicalMotherOccupationTextBox);
		rASSurveyPage.biologicalMotherOccupationTextBox.sendKeys(mothersOccupation);
		rASSurveyPage.biologicalFatherOccupationTextBox.sendKeys(fathersOccupation);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters height in cm for biological mother height {string} and biological fathers height {string} in What is the height of your biological mother and father? page - myRAS Survey")
	public void enters_height_in_cm_for_biological_mother_height_and_biological_fathers_height_in_What_is_the_height_of_your_biological_mother_and_father_page_myRAS_Survey(
			String mothersHeight, String fathersHeight) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.biologicalMotherHeightTextBox);
		rASSurveyPage.biologicalMotherHeightTextBox.sendKeys(mothersHeight);
		rASSurveyPage.unitOfMeasureMotherRadioButton.click();
		rASSurveyPage.biologicalFatherHeightTextBox.sendKeys(fathersHeight);
		rASSurveyPage.unitOfMeasureFatherRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks next The next set of questions will ask about hormone-related growth. Growth is influenced by many things including nutrition, parental height\\/genetics and secreted hormones that tell the body to grow taller. page - myRAS Survey")
	public void clicks_next_The_next_set_of_questions_will_ask_about_hormone_related_growth_Growth_is_influenced_by_many_things_including_nutrition_parental_height_genetics_and_secreted_hormones_that_tell_the_body_to_grow_taller_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever been evaluated by an endocrinologist for any reason? These are doctors that specialize in the endocrine system, which is made up of many glands that secrete hormones. Hormones play a role in many things in the body including growth, metabolism and salt regulation. Endocrinologists often diagnose conditions such as diabetes and thyroid problems. page - myRAS Survey")
	public void clicks_YES_Have_you_ever_been_evaluated_by_an_endocrinologist_for_any_reason_These_are_doctors_that_specialize_in_the_endocrine_system_which_is_made_up_of_many_glands_that_secrete_hormones_Hormones_play_a_role_in_many_things_in_the_body_including_growth_metabolism_and_salt_regulation_Endocrinologists_often_diagnose_conditions_such_as_diabetes_and_thyroid_problems_page_myRAS_Survey() {
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Endocrinologist medical provider name {string}, medical provider city, state, country {string}, hospital or medical affiliation {string} in What is the name of the endocrinologist who completed your examination? page - myRAS Survey")
	public void enters_endocrinologist_medical_provider_name_medical_provider_city_state_country_hospital_or_medical_affiliation_in_What_is_the_name_of_the_endocrinologist_who_completed_your_examination_page_myRAS_Survey(
			String endocrinologistMedicalProvider, String endocrinologistLocation, String endocrinologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.doctorMedicalProviderNameTextBox);
		CommonUtils.sendKeys(rASSurveyPage.doctorMedicalProviderNameTextBox, endocrinologistMedicalProvider);
		CommonUtils.sendKeys(rASSurveyPage.locatioCityStateCountryTextBox, endocrinologistLocation);
		CommonUtils.sendKeys(rASSurveyPage.hospitalOrHealthSystemAffiliationTextBox, endocrinologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever had growth hormone testing? page - myRAS Survey")
	public void clicks_YES_Have_you_ever_had_growth_hormone_testing_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All options that apply enters other hormone testing {string} for What were the results of your growth hormone testing? page - myRAS Survey")
	public void selects_All_options_that_apply_enters_other_hormone_testing_for_What_were_the_results_of_your_growth_hormone_testing_page_myRAS_Survey(
			String otherHormoneTesting) {

		MiscUtils.sleep(1000);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherHormoneTesting);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever received growth hormone treatment? page - myRAS Survey")
	public void clicks_YES_Have_you_ever_received_growth_hormone_treatment_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters height before growth hormone treatment {string} for What was your height before starting growth hormone? page - myRAS Survey")
	public void enters_height_before_growth_hormone_treatment_for_What_was_your_height_before_starting_growth_hormone_page_myRAS_Survey(
			String growthHormoneTreatment) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneRadioButton);
		rASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneRadioButton.click();
		rASSurveyPage.heightTextBox.sendKeys(growthHormoneTreatment);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects number of growth hormone treatment {string} for How many times have you received growth hormone treatment? page - myRAS Survey")
	public void selects_number_of_growth_hormone_treatment_for_How_many_times_have_you_received_growth_hormone_treatment_page_myRAS_Survey(
			String numberOfgrowthHormoneTreatments) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
		CommonUtils.selectDropDownValue(numberOfgrowthHormoneTreatments,
				rASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("adds details in Please provide the details of growth hormone replacement by completing the table below. page - myRAS Survey")
	public void adds_details_in_Please_provide_the_details_of_growth_hormone_replacement_by_completing_the_table_below_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.growthHormoneTreatment1AgeStartedTextBox);
		rASSurveyPage.growthHormoneTreatment1AgeStartedTextBox.sendKeys("15");
		rASSurveyPage.growthHormoneTreatment1AgeStoppedTextBox.sendKeys("20");
		rASSurveyPage.growthHormoneTreatment1AreYouStillOnGrowthHormoneNoRadioButton.click();
		rASSurveyPage.growthHormoneTreatment2AgeStartedTextBox.sendKeys("21");
		rASSurveyPage.growthHormoneTreatment2AgeStoppedTextBox.sendKeys("23");
		rASSurveyPage.growthHormoneTreatment2AreYouStillOnGrowthHormoneNoRadioButton.click();
		rASSurveyPage.growthHormoneTreatment3AgeStartedTextBox.sendKeys("25");
		rASSurveyPage.growthHormoneTreatment3AgeStoppedTextBox.sendKeys("29");
		rASSurveyPage.growthHormoneTreatment3AreYouStillOnGrowthHormoneNoRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next set of questions will ask about development. Development includes things such as crawling walking and speaking understanding language. page - myRAS Survey")
	public void clicks_Next_button_The_next_set_of_questions_will_ask_about_development_Development_includes_things_such_as_crawling_walking_and_speaking_understanding_language_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Were you ever diagnosed with hypotonia as an infant or child? This is often described as unusually low muscle tone or floppy muscle tone. page - myRAS Survey")
	public void clicks_YES_Were_you_ever_diagnosed_with_hypotonia_as_an_infant_or_child_This_is_often_described_as_unusually_low_muscle_tone_or_floppy_muscle_tone_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks twelve-eighteen months option At what age were you able to sit without support? page - myRAS Survey")
	public void clicks_twelve_eighteen_months_option_At_what_age_were_you_able_to_sit_without_support_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.atWhatAgeWereYouAbleToSitWithoutSupportCheckRadioButton);
		rASSurveyPage.atWhatAgeWereYouAbleToSitWithoutSupportCheckRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks twelve-eighteen months option At what age were you able to walk without support? page - myRAS Survey")
	public void clicks_twelve_eighteen_months_option_At_what_age_were_you_able_to_walk_without_support_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportCheckRadioButton);
		rASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportCheckRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever received physical therapy? page - myRAS Survey")
	public void clicks_YES_Have_you_ever_received_physical_therapy_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks twenty-four to thirthy-six months option At what age were you able to use simple two-word phrases? page - myRAS Survey")
	public void clicks_twenty_four_to_thirthy_six_months_option_At_what_age_were_you_able_to_use_simple_two_word_phrases_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.twentyFourToThirthySixMonthsRadioButton);
		rASSurveyPage.twentyFourToThirthySixMonthsRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects Simple speech compared to people of the same age How would you describe your current speech capabilities? page - myRAS Survey")
	public void selects_Simple_speech_compared_to_people_of_the_same_age_How_would_you_describe_your_current_speech_capabilities_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.simpleSpeechComparedToPeopleOfTheSameAgeRadioButton);
		rASSurveyPage.simpleSpeechComparedToPeopleOfTheSameAgeRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever received speech therapy? page - myRAS Survey")
	public void clicks_YES_Have_you_ever_received_speech_therapy_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Severe Cognitive Delay Between the ages of three and six years old preschool years, were you ever diagnosed with issues of cognitive development? Cognitive development can include difficulties in learning, understanding, andprocessing information or making decisions. page - myRAS Survey")
	public void clicks_Severe_Cognitive_Delay_Between_the_ages_of_three_and_six_years_old_preschool_years_were_you_ever_diagnosed_with_issues_of_cognitive_development_Cognitive_development_can_include_difficulties_in_learning_understanding_andprocessing_information_or_making_decisions_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.severeCognitiveDelayRadioButton);
		rASSurveyPage.severeCognitiveDelayRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Didyou receive occupational therapy between three and six years of age? Occupational therapy is based on engagement in activities of daily life \\(such as self-care skills, education, work, or social interaction). page - myRAS Survey")
	public void clicks_YES_Didyou_receive_occupational_therapy_between_three_and_six_years_of_age_Occupational_therapy_is_based_on_engagement_in_activities_of_daily_life_such_as_self_care_skills_education_work_or_social_interaction_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Attended typical elementary school without support Between the ages of six and ten \\(elementary school age)Please select the option that best describes your schooling. page - myRAS Survey")
	public void clicks_Attended_typical_elementary_school_without_support_Between_the_ages_of_six_and_ten_elementary_school_age_Please_select_the_option_that_best_describes_your_schooling_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.attendedTypicalElementarySchoolWithoutSupportRadioButton);
		rASSurveyPage.attendedTypicalElementarySchoolWithoutSupportRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Attended typical elementary school without support Between the ages of ten and seventeen \\(middle and high school age) please select the option that best describes your schooling. page - myRAS Survey")
	public void clicks_Attended_typical_elementary_school_without_support_Between_the_ages_of_ten_and_seventeen_middle_and_high_school_age_please_select_the_option_that_best_describes_your_schooling_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.attendedTypicalclassroomOrlittleSupportRadioButton);
		rASSurveyPage.attendedTypicalclassroomOrlittleSupportRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Bachelors degree four-year college with BA, BS, AB, Please indicate the highest degree or level of schooling you have completed. page - myRAS Survey")
	public void clicks_Bachelors_degree_four_year_college_with_BA_BS_AB_Please_indicate_the_highest_degree_or_level_of_schooling_you_have_completed_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.BachelorsDegreeRadioButton);
		rASSurveyPage.BachelorsDegreeRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click Working full time What is your current employment status? page - myRAS Survey")
	public void click_Working_full_time_What_is_your_current_employment_status_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.workingFullTimeRadioButton);
		rASSurveyPage.workingFullTimeRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other learning differences {string} for if other Have you ever been diagnosed with any of the following learning differences? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_learning_differences_for_if_other_Have_you_ever_been_diagnosed_with_any_of_the_following_learning_differences_page_myRAS_Survey(
			String otherLearningDifferences) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown", "No known learning differences");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherLearningDifferences);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button If you have ever had formal IQ testing and have a copy, please upload it here. page - myRAS Survey")
	public void clicks_Next_button_If_you_have_ever_had_formal_IQ_testing_and_have_a_copy_please_upload_it_here_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next set of questions will ask about medical conditions associated with the heart. page - myRAS Survey")
	public void clicks_Next_button_The_next_set_of_questions_will_ask_about_medical_conditions_associated_with_the_heart_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever been evaluated by a cardiologist? These are doctors that specialize in the heart. Cardiologists often diagnose conditions such as an irregular heart beat, an enlarged heart, and heartdefects. page - myRAS Survey")
	public void clicks_YES_Have_you_ever_been_evaluated_by_a_cardiologist_These_are_doctors_that_specialize_in_the_heart_Cardiologists_often_diagnose_conditions_such_as_an_irregular_heart_beat_an_enlarged_heart_and_heartdefects_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters name of Cardiologist doctor {string}, and enters Location {string} ,and enters for Hospital {string} for What is the name of the cardiologist who completed your heart evaluation? page - myRAS Survey")
	public void enters_name_of_Cardiologist_doctor_and_enters_Location_and_enters_for_Hospital_for_What_is_the_name_of_the_cardiologist_who_completed_your_heart_evaluation_page_myRAS_Survey(
			String cardiologistDoctor, String cardiologistLocation, String cardiologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfDoctorOrMedicalProviderTextBox);
		rASSurveyPage.nameOfDoctorOrMedicalProviderTextBox.sendKeys(cardiologistDoctor);
		rASSurveyPage.locationCityStateCountryTextBox.sendKeys(cardiologistLocation);
		rASSurveyPage.hospitalOrHealthCenterAffiliationTextBox.sendKeys(cardiologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever been diagnosed with any structural heart issue\\(s)? page - myRAS Survey")
	public void clicks_YES_Have_you_ever_been_diagnosed_with_any_structural_heart_issue_s_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters {string} for Have you been diagnosed with any of the following structural heart issues? Structural issues affect how the heart is shaped. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_for_Have_you_been_diagnosed_with_any_of_the_following_structural_heart_issues_Structural_issues_affect_how_the_heart_is_shaped_page_myRAS_Survey(
			String otherStructuralHeartIssues) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherStructuralHeartIssues);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply for Have you ever had any of the following symptoms? page - myRAS Survey")
	public void clicks_All_that_apply_for_Have_you_ever_had_any_of_the_following_symptoms_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyStepsImpl.selectingCheckBoxes("Never had any of these symptoms");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for all symptom occurences and where and when they were evaluated for Please complete the table below for the following symptoms, indicating when these symptoms occurred and where these symptoms wereevaluated. You only have to provide the age or date for each symptom. If you dont recall when the symptom first started or when it most recently occurred, place an X under dont know. page - myRAS Survey")
	public void enters_all_details_for_all_symptom_occurences_and_where_and_when_they_were_evaluated_for_Please_complete_the_table_below_for_the_following_symptoms_indicating_when_these_symptoms_occurred_and_where_these_symptoms_wereevaluated_You_only_have_to_provide_the_age_or_date_for_each_symptom_If_you_dont_recall_when_the_symptom_first_started_or_when_it_most_recently_occurred_place_an_X_under_dont_know_page_myRAS_Survey() {

		// -------------CHEST PAIN OF TIGHTENING SECTION-------------

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.chestPainOrTighteningAgeTextBox);
		rASSurveyPage.chestPainOrTighteningAgeTextBox.sendKeys("11");
		rASSurveyPage.chestPainOrTighteningDateTextBox.sendKeys("11/01");
		rASSurveyPage.chestPainOrTighteningFirstHospitalEvaluationTextBox.sendKeys("CHEST PAIN");
		rASSurveyPage.chestPainOrTighteningFirstHospitalEvaluationAgeTextBox.sendKeys("12");
		rASSurveyPage.chestPainOrTighteningFirstHospitalEvaluationDateTextBox.sendKeys("12/02");
		rASSurveyPage.chestPainOrTighteningMostRecentHospitalEvaluationTextBox.sendKeys("NO CHEST PAIN");

		// -------------FATIGUE SECTION-------------

		rASSurveyPage.fatigueAgeTextBox.sendKeys("13");
		rASSurveyPage.fatigueDateTextBox.sendKeys("03/03");
		rASSurveyPage.fatigueFirstHospitalEvaluationTextBox.sendKeys("BODY FATIGUE");
		rASSurveyPage.fatigueFirstHospitalEvaluationAgeTextBox.sendKeys("14");
		rASSurveyPage.fatigueFirstHospitalEvaluationDateTextBox.sendKeys("04/04");
		rASSurveyPage.fatigueMostRecentHospitalEvaluationTextBox.sendKeys("EXTREME FATIGUE");

		// -------------HERAT PALPITATIONS/IRREGULAR HEARTBEAT SECTION-------------

		rASSurveyPage.heartPalpitationsIrregularHeartBeatAgeTextBox.sendKeys("13");
		rASSurveyPage.heartPalpitationsIrregularHeartBeatDateTextBox.sendKeys("03/03");
		rASSurveyPage.heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationTextBox.sendKeys("NORMAL PALPITATIONS");
		rASSurveyPage.heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationAgeTextBox.sendKeys("14");
		rASSurveyPage.heartPalpitationsIrregularHeartBeatFirstHospitalEvaluationDateTextBox.sendKeys("04/04");
		rASSurveyPage.heartPalpitationsIrregularHeartBeatMostRecentHospitalEvaluationTextBox
				.sendKeys("ABNORMALLY FAST PALPITATIONS");

		// -------------LEG CRAMPING SECTION-------------

		rASSurveyPage.legCrampingAgeTextBox.sendKeys("13");
		rASSurveyPage.legCrampingDateTextBox.sendKeys("03/03");
		rASSurveyPage.legCrampingFirstHospitalEvaluationTextBox.sendKeys("LEG CRAMP");
		rASSurveyPage.legCrampingFirstHospitalEvaluationAgeTextBox.sendKeys("14");
		rASSurveyPage.legCrampingFirstHospitalEvaluationDateTextBox.sendKeys("04/04");
		rASSurveyPage.legCrampingMostRecentHospitalEvaluationTextBox.sendKeys("EXTREME LEG CRAMP");

		// -------------SHORTNESS OF BREATH SECTION-------------

		JavascriptUtils.scrollIntoView(rASSurveyPage.shortnessOfBreathAgeTextBox);
		rASSurveyPage.shortnessOfBreathAgeTextBox.sendKeys("15");
		rASSurveyPage.shortnessOfBreathDateTextBox.sendKeys("05/05");
		rASSurveyPage.shortnessOfBreathFirstHospitalEvaluationTextBox.sendKeys("SHORTNESS OF BREATH");
		rASSurveyPage.shortnessOfBreathFirstHospitalEvaluationAgeTextBox.sendKeys("16");
		rASSurveyPage.shortnessOfBreathFirstHospitalEvaluationDateTextBox.sendKeys("06/06");
		rASSurveyPage.shortnessOfBreathMostRecentHospitalEvaluationTextBox.sendKeys("LONG TERM SHORTNESS OF BREATH");
		CucumberLogUtils.logScreenShot();

		// -------------DIFFICULTY EXCERCISING SECTION-------------

		rASSurveyPage.difficultyExcercisingAgeTextBox.sendKeys("17");
		rASSurveyPage.difficultyExcercisingDateTextBox.sendKeys("07/07");
		rASSurveyPage.difficultyExcercisingFirstHospitalEvaluationTextBox.sendKeys("DIFFICULTY EXCERCISING");
		rASSurveyPage.difficultyExcercisingFirstHospitalEvaluationAgeTextBox.sendKeys("18");
		rASSurveyPage.difficultyExcercisingFirstHospitalEvaluationDateTextBox.sendKeys("08/08");
		rASSurveyPage.difficultyExcercisingMostRecentHospitalEvaluationTextBox
				.sendKeys("EXTREME DIFFICULTY EXERCISING");

		// -------------HIGH BLOOD PRESSURE SECTION-------------
		rASSurveyPage.highBloodPressureAgeTextBox.sendKeys("19");
		rASSurveyPage.highBloodPressureDateTextBox.sendKeys("09/09");
		rASSurveyPage.highBloodPressureFirstHospitalEvaluationTextBox.sendKeys("HIGH BLOOD PRESSURE");
		rASSurveyPage.highBloodPressureFirstHospitalEvaluationAgeTextBox.sendKeys("20");
		rASSurveyPage.highBloodPressureFirstHospitalEvaluationDateTextBox.sendKeys("10/10");
		rASSurveyPage.highBloodPressureMostRecentHospitalEvaluationTextBox.sendKeys("LOW BLOOD PRESSURE");

		// ------------KIDNEY DYSFUNCTION SECTION-------------

		rASSurveyPage.kidneyDysfunctionAgeTextBox.sendKeys("28");
		rASSurveyPage.kidneyDysfunctionDateTextBox.sendKeys("04/18");
		rASSurveyPage.kidneyDysfunctionFirstHospitalEvaluationTextBox.sendKeys("KIDNEY PAIN");
		rASSurveyPage.kidneyDysfunctionFirstHospitalEvaluationAgeTextBox.sendKeys("29");
		rASSurveyPage.kidneyDysfunctionFirstHospitalEvaluationDateTextBox.sendKeys("09/19");
		rASSurveyPage.kidneyDysfunctionMostRecentHospitalEvaluationTextBox.sendKeys("KIDNEY DISSEASE");

		// ------------MIGRAINES SECTION-------------

		rASSurveyPage.migrainesAgeTextBox.sendKeys("21");
		rASSurveyPage.migrainesDateTextBox.sendKeys("02/11");
		rASSurveyPage.migrainesFirstHospitalEvaluationTextBox.sendKeys("NORMAL HEADACHES");
		rASSurveyPage.migrainesFirstHospitalEvaluationAgeTextBox.sendKeys("22");
		rASSurveyPage.migrainesFirstHospitalEvaluationDateTextBox.sendKeys("02/12");
		rASSurveyPage.migrainesMostRecentHospitalEvaluationTextBox.sendKeys("LONG LASTING MIGRAINES");

		// ------------STROKE SECTION-------------

		rASSurveyPage.strokeAgeTextBox.sendKeys("23");
		rASSurveyPage.strokeDateTextBox.sendKeys("03/13");
		rASSurveyPage.strokeFirstHospitalEvaluationTextBox.sendKeys("SMALL STROKE");
		rASSurveyPage.strokeFirstHospitalEvaluationAgeTextBox.sendKeys("24");
		rASSurveyPage.strokeFirstHospitalEvaluationDateTextBox.sendKeys("04/24");
		rASSurveyPage.strokeMostRecentHospitalEvaluationTextBox.sendKeys("SHARP STROKE");

		// ------------TRANSIENT ISCHEMIC ATTACK (TIA) SECTION-------------

		rASSurveyPage.transientIschemicAttackAgeTextBox.sendKeys("25");
		rASSurveyPage.transientIschemicAttackDateTextBox.sendKeys("05/15");
		rASSurveyPage.transientIschemicAttackFirstHospitalEvaluationTextBox.sendKeys("TRANSIENT ISCHEMIC ATTACK");
		rASSurveyPage.transientIschemicAttackFirstHospitalEvaluationAgeTextBox.sendKeys("26");
		rASSurveyPage.transientIschemicAttackFirstHospitalEvaluationDateTextBox.sendKeys("06/16");
		rASSurveyPage.transientIschemicAttackMostRecentHospitalEvaluationTextBox
				.sendKeys("EXTREME TRANSIENT ISCHEMIC ATTACK");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Have you ever received treatment for heart problems? Some examples include: medication, catheter intervention, and surgery. page - myRAS Survey")
	public void clicks_YES_Have_you_ever_received_treatment_for_heart_problems_Some_examples_include_medication_catheter_intervention_and_surgery_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("select All that apply and enters for medication {string} and enters for other treatment {string} for Have you ever had any of the following treatments for heart problems? page - myRAS Survey")
	public void select_All_that_apply_and_enters_for_medication_and_enters_for_other_treatment_for_Have_you_ever_had_any_of_the_following_treatments_for_heart_problems_page_myRAS_Survey(
			String otherHeartMedication, String otherHeartTreatment) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.medicationTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.medicationTextBox.sendKeys(otherHeartMedication);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherHeartTreatment);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please complete the table below by providing information for the FIRST treatment and the MOST RECENT treatment. You only need to provide the age at which symptoms occurred or date \\(not both). If you donot recall the details, please place an X in the Dont know box. page - myRAS Survey")
	public void enters_all_details_for_Please_complete_the_table_below_by_providing_information_for_the_FIRST_treatment_and_the_MOST_RECENT_treatment_You_only_need_to_provide_the_age_at_which_symptoms_occurred_or_date_not_both_If_you_donot_recall_the_details_please_place_an_X_in_the_Dont_know_box_page_myRAS_Survey() {
		// -------------MEDICATION (PLEASE SPECIFY) SECTION-------------

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.medicationFirstTreatmentAgeTextBox);
		rASSurveyPage.medicationFirstTreatmentAgeTextBox.sendKeys("13");
		rASSurveyPage.medicationFirstTreatmentDateTextBox.sendKeys("03/03");
		rASSurveyPage.medicationFirstTreatmentLocationTextBox.sendKeys("JOHNS HOPKINS A,LA,CA,US");
		rASSurveyPage.medicationMostRecentTreatmentAgeTextBox.sendKeys("14");
		rASSurveyPage.medicationMostRecentTreatmentAgeTextBox.sendKeys("04/04");
		rASSurveyPage.medicationMostRecentTreatmentLocationTextBox.sendKeys("MOUNT SINAI B,CASPER,WY,US");

		// -------------CATHETER INTERVENTION SECTION-------------

		rASSurveyPage.catheterInterventionFirstTreatmentAgeTextBox.sendKeys("15");
		rASSurveyPage.catheterInterventionFirstTreatmentDateTextBox.sendKeys("05/05");
		rASSurveyPage.catheterInterventionFirstTreatmentLocationTextBox.sendKeys("JOHNS HOPKINS C,TAMPA,FL,US");
		rASSurveyPage.catheterInterventionMostRecentTreatmentAgeTextBox.sendKeys("16");
		rASSurveyPage.catheterInterventionMostRecentTreatmentAgeTextBox.sendKeys("06/06");
		rASSurveyPage.catheterInterventionMostRecentTreatmentLocationTextBox
				.sendKeys("RONALD REAGAN D,HELENA,MONTANA,US");

		// -------------SURGERY SECTION-------------

		rASSurveyPage.surgeryFirstTreatmentAgeTextBox.sendKeys("17");
		rASSurveyPage.surgeryFirstTreatmentDateTextBox.sendKeys("07/07");
		rASSurveyPage.surgeryFirstTreatmentLocationTextBox.sendKeys("G.W. UNIVERSITY HOSPITAL E,WASH,DC,US");
		rASSurveyPage.surgeryMostRecentTreatmentAgeTextBox.sendKeys("18");
		rASSurveyPage.surgeryMostRecentTreatmentAgeTextBox.sendKeys("08/08");
		rASSurveyPage.surgeryMostRecentTreatmentLocationTextBox.sendKeys("MOUNT SINAI F,SACRAMENTO,CA,US");

		// -------------OTHER(PLEASE SPECIFY) SECTION-------------

		rASSurveyPage.otherFirstTreatmentAgeTextBox.sendKeys("19");
		rASSurveyPage.otherFirstTreatmentDateTextBox.sendKeys("09/09");
		rASSurveyPage.otherFirstTreatmentLocationTextBox.sendKeys("RONALD REAGAN F,ATLANTA,GEORGIA,US");
		rASSurveyPage.otherMostRecentTreatmentAgeTextBox.sendKeys("20");
		rASSurveyPage.otherMostRecentTreatmentAgeTextBox.sendKeys("10/10");
		rASSurveyPage.otherMostRecentTreatmentLocationTextBox.sendKeys("HOLY CROSS G,BOISE,IDAHO,US");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Are you still on? page - myRAS Survey")
	public void clicks_YES_button_Are_you_still_on_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you ever been diagnosed with any functional heart issue\\(s)? page - myRAS Survey")
	public void clicks_YES_button_Have_you_ever_been_diagnosed_with_any_functional_heart_issue_s_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other functional heart issues {string} for Have you ever been diagnosed with any of the following functional heart issues? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_functional_heart_issues_for_Have_you_ever_been_diagnosed_with_any_of_the_following_functional_heart_issues_page_myRAS_Survey(
			String otherFunctionalHeartIssues) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherFunctionalHeartIssues);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please provide any details known for the condition\\(s) for which you have been diagnosed. For each condition, you need to provide either the age or date at which the condition occurred \\(not both). If you do not know or cannot recall, place an X in the Dont know box. For each condition, also provide any information regarding treatment. If none, please state None in the treatment. page - myRAS Survey")
	public void enters_all_details_for_Please_provide_any_details_known_for_the_condition_s_for_which_you_have_been_diagnosed_For_each_condition_you_need_to_provide_either_the_age_or_date_at_which_the_condition_occurred_not_both_If_you_do_not_know_or_cannot_recall_place_an_X_in_the_Dont_know_box_For_each_condition_also_provide_any_information_regarding_treatment_If_none_please_state_None_in_the_treatment_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.tachycardiaAgeOfFirstSymptomTextBox);
		rASSurveyPage.tachycardiaAgeOfFirstSymptomTextBox.sendKeys("21");
		rASSurveyPage.tachycardiaAgeOfDiagnosisTextBox.sendKeys("21");
		rASSurveyPage.tachycardiaTreatmentAndMedicationTextBox.sendKeys("TACHYCARDIA MEDECINE");
		rASSurveyPage.tachycardiaHospitalOfTreatmentTextBox.sendKeys("INOVA");
		rASSurveyPage.cardiacConductionDefectFristSymptomTextBox.sendKeys("10 NOVEMBER 2021");
		rASSurveyPage.cardiacConductionDefectDateOfDiagnosisTextBox.sendKeys("15 NOVEMBER 2021");
		rASSurveyPage.cardiacConductionDefectTreatmentAndMedicationTextBox
				.sendKeys("CARDIAC CONDUCTION DEFECT MEDECINE");
		rASSurveyPage.cardiacConductionDefectHospitalOfTreatmentTextBox.sendKeys("INOVA");
		rASSurveyPage.heartFailureAgeOfFirstSymptomTextBox.sendKeys("22");
		rASSurveyPage.heartFailureDateOfDiagnosisTextBox.sendKeys("10 December 2020");
		rASSurveyPage.heartFailureTreatmentAndMedecationTextBox.sendKeys("MEDICATION FOR HEART FAILURE");
		rASSurveyPage.heartFailureHospitalOfTreatmentTextBox.sendKeys("HOSPITAL");
		rASSurveyPage.otherHeartIssuesDateOfFirstSymptomTextBox.sendKeys("15 NOVEMBER 2020");
		rASSurveyPage.otherHeartIssuesAgeOfDiagnosisTextBox.sendKeys("22");
		rASSurveyPage.OtherHeartIssuesTreatmentAndMedicationTextBox.sendKeys("TYLENOL");
		rASSurveyPage.otherHeartIssuesHospitalOfTreatmentTextBox.sendKeys("MEDICAL CENTER");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next two questions will ask about RASopathy diagnoses. page - myRAS Survey")
	public void clicks_Next_button_The_next_two_questions_will_ask_about_RASopathy_diagnoses_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you been diagnosed with a RASopathy by a physician or through genetic testing? page - myRAS Survey")
	public void clicks_YES_button_Have_you_been_diagnosed_with_a_RASopathy_by_a_physician_or_through_genetic_testing_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other RASopathies {string} for Please indicate if you have been diagnosed with any of the following RASopathies? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_RASopathies_for_Please_indicate_if_you_have_been_diagnosed_with_any_of_the_following_RASopathies_page_myRAS_Survey(
			String string) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(string);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next set of questions will ask about general medical history. page - myRAS Survey")
	public void clicks_Next_button_The_next_set_of_questions_will_ask_about_general_medical_history_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Do you have a primary care provider? A primary care provider is a health professional \\(doctor, physician assistant, nurse practitioner) for which you go to for routine care. Examples of routine care include immunizations\\/vaccines, annual or sports physicals, or to treat common minor illnesses, such as sinus or ear infections. page - myRAS Survey")
	public void clicks_YES_Do_you_have_a_primary_care_provider_A_primary_care_provider_is_a_health_professional_doctor_physician_assistant_nurse_practitioner_for_which_you_go_to_for_routine_care_Examples_of_routine_care_include_immunizations_vaccines_annual_or_sports_physicals_or_to_treat_common_minor_illnesses_such_as_sinus_or_ear_infections_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters name of Primary Care medical provider {string} and enter for location {string} and enters hospital {string} for Please provide the information for your primary care provider below. page - myRAS Survey")
	public void enters_name_of_Primary_Care_medical_provider_and_enter_for_location_and_enters_hospital_for_Please_provide_the_information_for_your_primary_care_provider_below_page_myRAS_Survey(
			String primaryCareProvider, String primaryCareProviderLocation, String primaryCareProviderHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.PrimaryCareProviderNameTextBox);
		rASSurveyPage.PrimaryCareProviderNameTextBox.sendKeys(primaryCareProvider);
		rASSurveyPage.PrimaryCareProviderLocationTextBox.sendKeys(primaryCareProviderLocation);
		rASSurveyPage.PrimaryCareProviderHospitalorMedicalCenterAffiliationTextBox
				.sendKeys(primaryCareProviderHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES to all allergies for Please indicate in the table below if you have allergies to the listed items. We will ask about the specifics of these allergies in later questions. page - myRAS Survey")
	public void clicks_YES_to_all_allergies_for_Please_indicate_in_the_table_below_if_you_have_allergies_to_the_listed_items_We_will_ask_about_the_specifics_of_these_allergies_in_later_questions_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.allergiesToMedicinesRadioButton);
		rASSurveyPage.allergiesToMedicinesRadioButton.click();
		rASSurveyPage.allergiesToFoodRadioButton.click();
		rASSurveyPage.allergiesToAnythingElseRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks + sign to add Medication {string} and enters for allergic reaction {string} for Please complete the table below for all medications to which you are allergic. page - myRAS Survey")
	public void clicks_sign_to_add_Medication_and_enters_for_allergic_reaction_for_Please_complete_the_table_below_for_all_medications_to_which_you_are_allergic_page_myRAS_Survey(
			String medicationAllergy, String allergicReaction) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.plusSignButton);
		rASSurveyPage.plusSignButton.click();
		rASSurveyPage.medicationNamestextBox.sendKeys(medicationAllergy);
		rASSurveyPage.allergiesReactionsTextBox.sendKeys(allergicReaction);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks + sign to add first food allergy {string} and enters allergic reaction {string} and clicks + sign for second food allergy {string} and enters allergic reaction {string} for Please complete the table below for all Foods to which you are allergic. page - myRAS Survey")
	public void clicks_sign_to_add_first_food_allergy_and_enters_allergic_reaction_and_clicks_sign_for_second_food_allergy_and_enters_allergic_reaction_for_Please_complete_the_table_below_for_all_Foods_to_which_you_are_allergic_page_myRAS_Survey(
			String firstFoodAllergy, String firstFoodAllergyReaction, String secondFoodAllergy,
			String secondFoodAllergyReaction) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.plusSignButton);
		JavascriptUtils.clickByJS(rASSurveyPage.plusSignButton);
		JavascriptUtils.clickByJS(rASSurveyPage.plusSignButton);
		rASSurveyPage.firstFoodAllergyNamestextBox.sendKeys(firstFoodAllergy);
		rASSurveyPage.firstFoodAllergyreactiontextBox.sendKeys(firstFoodAllergyReaction);
		rASSurveyPage.secondFoodAllergyNamestextBox.sendKeys(secondFoodAllergy);
		rASSurveyPage.secondFoodAllergyreactiontextBox.sendKeys(secondFoodAllergyReaction);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks + sign to add other allergy {string} and enters {string} for allergic reaction and clicks + sign for second allergy {string} and enters	{string} for items to which you are allergic that were notincluded in medication or food allergies. page - myRAS Survey")
	public void clicks_sign_to_add_other_allergy_and_enters_for_allergic_reaction_and_clicks_sign_for_second_allergy_and_enters_for_items_to_which_you_are_allergic_that_were_notincluded_in_medication_or_food_allergies_page_myRAS_Survey(
			String otherFirstFoodAllergy, String otherFirstFoodAllergyReaction, String otherSecondFoodAllergy,
			String otherSecondFoodAllergyReaction) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.plusSignButton);
		JavascriptUtils.clickByJS(rASSurveyPage.plusSignButton);
		JavascriptUtils.clickByJS(rASSurveyPage.plusSignButton);
		rASSurveyPage.firstOtherAllergyNamesTextBox.sendKeys(otherFirstFoodAllergy);
		rASSurveyPage.firstOtherAllergyReactionTextBox.sendKeys(otherFirstFoodAllergyReaction);
		rASSurveyPage.secondOtherAllergyNamesTextBox.sendKeys(otherSecondFoodAllergy);
		rASSurveyPage.secondOtherAllergyReactionTextBox.sendKeys(otherSecondFoodAllergyReaction);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you ever had an operation or biopsy? page - myRAS Survey")
	public void clicks_YES_button_Have_you_ever_had_an_operation_or_biopsy_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks + sign to add type of surgery {string} and enters age for surgery {string} and selects reason for surgery {string} and enters hospital name {string} in Please provide the information for eachbiopsy and surgery in the table below. To add a surgery or biopsy, click on the + button located in the upper left corner of the table. page - myRAS Survey")
	public void clicks_sign_to_add_type_of_surgery_and_enters_age_for_surgery_and_selects_reason_for_surgery_and_enters_hospital_name_in_Please_provide_the_information_for_eachbiopsy_and_surgery_in_the_table_below_To_add_a_surgery_or_biopsy_click_on_the_button_located_in_the_upper_left_corner_of_the_table_page_myRAS_Survey(
			String typeOfSurgery, String ageForSurgery, String reasonForSurgery, String surgeryHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.plusSignButton);
		rASSurveyPage.plusSignButton.click();
		rASSurveyPage.typeOfSurgeryTextBox.sendKeys(typeOfSurgery);
		rASSurveyPage.ageOfSurgeryTextBox.sendKeys(ageForSurgery);
		CommonUtils.selectDropDownValue(reasonForSurgery, rASSurveyPage.reasonSurgeryDropDown);
		rASSurveyPage.surgeryHospitalTextBox.sendKeys(surgeryHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you ever been hospitalized for any reason other than a surgery or childbirth? page - myRAS Survey")
	public void clicks_YES_button_Have_you_ever_been_hospitalized_for_any_reason_other_than_a_surgery_or_childbirth_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks + sign to add reason for hospitalization {string} and enters when it occureed {string} and enters hospital {string} for Please provide the information for eachhospitalization in the table below. To add a new hospitalization, please click on the + sign in the upper left corner of the table. page - myRAS Survey")
	public void clicks_sign_to_add_reason_for_hospitalization_and_enters_when_it_occureed_and_enters_hospital_for_Please_provide_the_information_for_eachhospitalization_in_the_table_below_To_add_a_new_hospitalization_please_click_on_the_sign_in_the_upper_left_corner_of_the_table_page_myRAS_Survey(
			String reasonForHospitalization, String dateOfHospitalization, String hospitalOfHospitalization) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.plusSignButton);
		rASSurveyPage.plusSignButton.click();
		rASSurveyPage.reasonOfHospitalizationTextBox.sendKeys(reasonForHospitalization);
		rASSurveyPage.dateOfHospitalizationTextBox.sendKeys(dateOfHospitalization);
		rASSurveyPage.placeOfHospitalizationTextBox.sendKeys(hospitalOfHospitalization);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next set of questions will ask about GI\\(gastrointestinal) symptoms or conditions. page - myRAS Survey")
	public void clicks_Next_button_The_next_set_of_questions_will_ask_about_GI_gastrointestinal_symptoms_or_conditions_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you ever been evaluated by a gastroenterologist? These are doctors that specialize in the GI tract and liver. The GI tract includes your esophagus, stomach, small intestine, large intestine\\/colon, liver and pancreas. page - myRAS Survey")
	public void clicks_YES_button_Have_you_ever_been_evaluated_by_a_gastroenterologist_These_are_doctors_that_specialize_in_the_GI_tract_and_liver_The_GI_tract_includes_your_esophagus_stomach_small_intestine_large_intestine_colon_liver_and_pancreas_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Gastroenterologist doctors name {string} and enters city, state {string} then enters hospital {string} for Please provide the details for the gastroenterologist who completed the evaluation. page - myRAS Survey")
	public void enters_Gastroenterologist_doctors_name_and_enters_city_state_then_enters_hospital_for_Please_provide_the_details_for_the_gastroenterologist_who_completed_the_evaluation_page_myRAS_Survey(
			String gastroenterologistDoctor, String gastroenterologistLocation, String gastroenterologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfGastroenterologistTextBox);
		rASSurveyPage.nameOfGastroenterologistTextBox.sendKeys(gastroenterologistDoctor);
		rASSurveyPage.cityStateOfGastroenterologistTextBox.sendKeys(gastroenterologistLocation);
		rASSurveyPage.hospitalOfGastroenterologistTextBox.sendKeys(gastroenterologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other feeding difficulties {string} for Have you ever been diagnosed with any of the following feeding difficulties? These issues often include problems eating food by mouth or keeping food from being vomited. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_feeding_difficulties_for_Have_you_ever_been_diagnosed_with_any_of_the_following_feeding_difficulties_These_issues_often_include_problems_eating_food_by_mouth_or_keeping_food_from_being_vomited_page_myRAS_Survey(
			String otherFeedingDifficulties) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known feeding difficulties", "Unsure/unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherFeedingDifficulties);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks age and enters amount of time {string} for At what age was the nasogastric or nasojejunal tube placed? page - myRAS Survey")
	public void clicks_age_and_enters_amount_of_time_for_At_what_age_was_the_nasogastric_or_nasojejunal_tube_placed_page_myRAS_Survey(
			String amountOfTubePlacementTime) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.tubePlacedRadioButton);
		rASSurveyPage.tubePlacedRadioButton.click();
		rASSurveyPage.tubePlacedTextBox.sendKeys(amountOfTubePlacementTime);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks age and enters amount of time {string} for At what age was the gastrostomy \\(G-tube) or gastrostomy-jejunostomy \\(GJ) tube placed? page - myRAS Survey")
	public void clicks_age_and_enters_amount_of_time_for_At_what_age_was_the_gastrostomy_G_tube_or_gastrostomy_jejunostomy_GJ_tube_placed_page_myRAS_Survey(
			String amountOfGastrostomyTimePlaced) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.tubePlacedJejunostomyPlacedRadioButton);
		rASSurveyPage.tubePlacedJejunostomyPlacedRadioButton.click();
		rASSurveyPage.tubePlacedTextBox.sendKeys(amountOfGastrostomyTimePlaced);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks age and enters amount of time {string} for At what age was the gastrostomy \\(G-tube) or gastrostomy-jejunostomy \\(GJ) tube removed? page - myRAS Survey")
	public void clicks_age_and_enters_amount_of_time_for_At_what_age_was_the_gastrostomy_G_tube_or_gastrostomy_jejunostomy_GJ_tube_removed_page_myRAS_Survey(
			String amountOfGastrostomyTimeRemoved) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.tubePlacedJejunostomyRemovedRadioButton);
		rASSurveyPage.tubePlacedJejunostomyRemovedRadioButton.click();
		rASSurveyPage.tubePlacedTextBox.sendKeys(amountOfGastrostomyTimeRemoved);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES button Have you ever had any physical symptoms that likely involved your gastrointestinal \\(GI) system? There are many symptoms that are connected to the GI system. page - myRAS Survey")
	public void click_YES_button_Have_you_ever_had_any_physical_symptoms_that_likely_involved_your_gastrointestinal_GI_system_There_are_many_symptoms_that_are_connected_to_the_GI_system_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply Which of the following symptoms related to the GI system have occurred? page - myRAS Survey")
	public void clicks_All_that_apply_Which_of_the_following_symptoms_related_to_the_GI_system_have_occurred_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/unknown");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All previous resolved symptom for let us know if the symptoms listed below were previous symptoms or current \\(ongoing) symptoms. page - myRAS Survey")
	public void clicks_All_previous_resolved_symptom_for_let_us_know_if_the_symptoms_listed_below_were_previous_symptoms_or_current_ongoing_symptoms_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.chockingPreviousSymptomRadioButton);
		rASSurveyPage.chockingPreviousSymptomRadioButton.click();
		rASSurveyPage.DifficultySwallowingPreviousSymptomRadioButton.click();
		rASSurveyPage.PainfulSwallowingPreviousSymptomRadioButton.click();
		rASSurveyPage.FoodGettingStuckWhileSwallowingPreviousSymptomRadioButton.click();
		rASSurveyPage.RefluxHeartBurnPreviousSymptomRadioButton.click();
		rASSurveyPage.NauseaPreviousSymptomRadioButton.click();
		rASSurveyPage.AbdominalPainPreviousSymptomRadioButton.click();
		rASSurveyPage.VomitingPreviousSymptomRadioButton.click();
		rASSurveyPage.FeelFullQuicklyPreviousSymptomRadioButton.click();
		rASSurveyPage.GallbladderProblemsPreviousSymptomRadioButton.click();
		rASSurveyPage.JaundicePreviousSymptomRadioButton.click();
		rASSurveyPage.FoodAllergiesPreviousSymptomRadioButton.click();
		rASSurveyPage.LactoseIntolerancePreviousSymptomRadioButton.click();
		rASSurveyPage.AversionToSpecificFoodsPreviousSymptomRadioButton.click();
		rASSurveyPage.GasBloatingPreviousSymptomRadioButton.click();
		rASSurveyPage.DiarrheaPreviousSymptomRadioButton.click();
		rASSurveyPage.ConstipationPreviousSymptomRadioButton.click();
		rASSurveyPage.EncopresisPreviousSymptomRadioButton.click();
		rASSurveyPage.PerianalLesionsPreviousSymptomRadioButton.click();
		rASSurveyPage.UnintentionalOrWeighLossPreviousSymptomRadioButton.click();
		rASSurveyPage.DecreasedAppetitePreviousSymptomRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for All for Did choking\\/gagging ever lead to. page - myRAS Survey")
	public void clicks_YES_for_All_for_Did_choking_gagging_ever_lead_to_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.pneumoniaYesRadioButton);
		rASSurveyPage.pneumoniaYesRadioButton.click();
		rASSurveyPage.evaluationWithXrayYesRadioButton.click();
		rASSurveyPage.AspirationOnSwallowStudyYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES for All that apply and enters heartburn symptoms at age {string} and enters heartburn medication {string} for Please complete the Testing Docs table below regarding heartburn\\/reflux symptoms. page - myRAS Survey")
	public void click_YES_for_All_that_apply_and_enters_heartburn_symptoms_at_age_and_enters_heartburn_medication_for_Please_complete_the_Testing_Docs_table_below_regarding_heartburn_reflux_symptoms_page_myRAS_Survey(
			String ageOfHeartBurnMedication, String heartBurnMedication) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.impedanceStudyYesRadioButton);
		rASSurveyPage.impedanceStudyYesRadioButton.click();
		rASSurveyPage.refuxHeartburnmedicationTakenYesRadioButton.click();
		rASSurveyPage.ageOfMedicationTakenTexBox.sendKeys(ageOfHeartBurnMedication);
		rASSurveyPage.MedicationTakenTexBox.sendKeys(heartBurnMedication);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES for All and enters nausea symptoms at age {string} and enters medication {string} for Please complete the table below regarding nausea symptoms. page - myRAS Survey")
	public void click_YES_for_All_and_enters_nausea_symptoms_at_age_and_enters_medication_for_Please_complete_the_table_below_regarding_nausea_symptoms_page_myRAS_Survey(
			String ageOfNausea, String nauseaMedication) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.bothersomeNauseaForAtLeast2WeeksNotRelatedToMealsYesRadioButton);
		rASSurveyPage.bothersomeNauseaForAtLeast2WeeksNotRelatedToMealsYesRadioButton.click();
		rASSurveyPage.nauseaThatIsNotRelatedToVomitingOccurredThatHasOccurredForAtLeast2WeeksYesRadioButton.click();
		rASSurveyPage.haveAnyNauseaMedicationsBeenTakenYesRadioButton.click();
		rASSurveyPage.ageAtWhichNauseaMedicationswereTakenAndTheMedicationNameTextBox.sendKeys(ageOfNausea);
		rASSurveyPage.naauseaMedicationNameTextBox.sendKeys(nauseaMedication);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for ALL for Please complete the next set of questions regarding abdominal pain. page - myRAS Survey")
	public void clicks_YES_for_ALL_for_Please_complete_the_next_set_of_questions_regarding_abdominal_pain_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.severeDistressingAcutePainAtTheBellyButtomOrEntireAbdomenYesRadioButton);
		rASSurveyPage.severeDistressingAcutePainAtTheBellyButtomOrEntireAbdomenYesRadioButton.click();
		rASSurveyPage.areEpisodesOfBellyPainSeparatedByWeeksOrMonthsYesRadioButton.click();
		rASSurveyPage.doesAbdominalPainPreventTheCompletionOfUsualActivitiesYesRadioButton.click();
		rASSurveyPage.isThePainSimilarWithEachEpisodeYesRadioButton.click();
		rASSurveyPage.haveTheseEpisodesBeenHappeningAtLeastSixMonthsYesRadioButton.click();
		rASSurveyPage.abdominalPainsOccurAtLeast4MonthsFor2MonthsYesRadioButton.click();
		rASSurveyPage.isPainAssociatedWithHavingBowelMovementsYesRadioButton.click();
		rASSurveyPage.associatedWithChangeInBowelMovementFrequencyYesRadioButton.click();
		rASSurveyPage.associatedWithChangeInBowelMovementConsistencyYesRadioButton.click();
		rASSurveyPage.didPainResolveInRelationToResolutionOfConstipationYesRadioButton.click();
		rASSurveyPage.isThePainNotRelatedToEatingMenstrualCyclesOrOtherIllnessYesRadioButton.click();
		rASSurveyPage.hasAbdominalPainEverCausedAwakeningFromSleepAtNightYesRadioButton.click();
		rASSurveyPage.hasTheAbdominalPainCausedWeightLossYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithLossOfAppetiteYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithNauseaYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithVomitingYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithHeadacheYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithIrritationToBrightLightYesRadioButton.click();
		rASSurveyPage.isAbdominalPainAssociatedWithLookingPaleYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have any medications ever been taken for abdominal pain? page - myRAS Survey")
	public void clicks_YES_button_Have_any_medications_ever_been_taken_for_abdominal_pain_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects abdominal medication amount {string} for How many medications have been taken for abdominal pain. page - myRAS Survey")
	public void selects_abdominal_medication_amount_for_How_many_medications_have_been_taken_for_abdominal_pain_page_myRAS_Survey(
			String amountOfAbdominalMedication) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.howManyMediationsHaveBeenTakenForAbdominal2DropDown);
		CommonUtils.selectDropDownValue(amountOfAbdominalMedication,
				rASSurveyPage.howManyMediationsHaveBeenTakenForAbdominal2DropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters abdominal pain details at age {string} and enters medication {string} and enters {string} for Please complete the table below regarding the medications taken for abdominal pain to the best of your ability. page - myRAS Survey")
	public void enters_abdominal_pain_details_at_age_and_enters_medication_and_enters_for_Please_complete_the_table_below_regarding_the_medications_taken_for_abdominal_pain_to_the_best_of_your_ability_page_myRAS_Survey(
			String ageOfAbdominalMedication, String typeOfAbdominalMedication, String detailsOfAbdominalMedication) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.pleaseIncludeAgeWhenEachMedicationWasTaken18TextBox);
		rASSurveyPage.pleaseIncludeAgeWhenEachMedicationWasTaken18TextBox.sendKeys(ageOfAbdominalMedication);
		rASSurveyPage.pleaseSpecifyTheMedicationNameAdvilTextBox.sendKeys(typeOfAbdominalMedication);
		rASSurveyPage.pleaseIncludeAsManyDetailsAsYouCanRecallTextBox.sendKeys(detailsOfAbdominalMedication);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for all Please complete the next set of questions regarding vomiting. page - myRAS Survey")
	public void clicks_YES_button_for_all_Please_complete_the_next_set_of_questions_regarding_vomiting_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.everHadAtLeast2MonthsWith1OrMoreEpisodesOfVomitingPerWeekYesRadioButton);
		rASSurveyPage.everHadAtLeast2MonthsWith1OrMoreEpisodesOfVomitingPerWeekYesRadioButton.click();
		rASSurveyPage.isVomitingEverSelfInducedYesRadioButton.click();
		rASSurveyPage.isVomitingRelatedToMedicationSurgeryOrOtherHealthIssueYesRadioButton.click();
		rASSurveyPage.everHave2OrMoreEpisodesOfIntenseNauseaAndVomitingThatLastsHoursToDaysWithinA6MonthPeriodYesRadioButton
				.click();
		rASSurveyPage.doEpisodesOfVomitingSeemSimilarToEachOtherWhenTheyOccurYesRadioButton.click();
		rASSurveyPage.areThereWeeksToMonthsWithoutSymptomsOfNauseaVomitingBetweenEpisodesYesRadioButton.click();
		rASSurveyPage.everVomitedBloodYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Has any medication ever been taken for vomiting? page - myRAS Survey")
	public void clicks_YES_button_for_Has_any_medication_ever_been_taken_for_vomiting_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects vomiting medication amount {string} for How many medications have been taken for vomiting? page - myRAS Survey")
	public void selects_vomiting_medicaiton_amount_for_How_many_medications_have_been_taken_for_vomiting_page_myRAS_Survey(
			String amountOfVomitingMedications) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.howManyMedicationsHaveBeenTakenForVomiting2DropDown);
		CommonUtils.selectDropDownValue(amountOfVomitingMedications,
				rASSurveyPage.howManyMedicationsHaveBeenTakenForVomiting2DropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters vomiting details at age {string} and enters medication {string} and enters second age {string} for second medication {string} for second medication for Please complete the list below by describing any medications taken for vomiting and the age when these medications were taken. page - myRAS Survey")
	public void enters_vomiting_details_at_age_and_enters_medication_and_enters_second_age_for_second_medication_for_second_medication_for_Please_complete_the_list_below_by_describing_any_medications_taken_for_vomiting_and_the_age_when_these_medications_were_taken_page_myRAS_Survey(
			String ageOfVomitingMedication, String typeVomitingMedication, String secondAgeOfVomitingMedication,
			String secondTypeOfVomitingMedication) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.pleaseIncludeAgeWhenEachMedicationWasTakenTextBox);
		rASSurveyPage.pleaseIncludeAgeWhenEachMedicationWasTakenTextBox.sendKeys(ageOfVomitingMedication);
		rASSurveyPage.pleaseSpecifyNameOfMedicationTakenForVomitingTextBox.sendKeys(typeVomitingMedication);
		rASSurveyPage.pleaseIncludeAgeWhenEachMedication2WasTakenTextBox.sendKeys(typeVomitingMedication);
		rASSurveyPage.pleaseSpecifyNameOfMedication2TakenForVomitingTextBox.sendKeys(secondTypeOfVomitingMedication);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects all symptoms for Have any of the following symptoms occurred four or more days\\/month for at least two months? Select all that apply. page - myRAS Survey")
	public void selects_all_symptoms_for_Have_any_of_the_following_symptoms_occurred_four_or_more_days_month_for_at_least_two_months_Select_all_that_apply_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyStepsImpl.selectingCheckBoxes();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters amount of time {string} for when jaundice occured and enters {string} for how long jaundice lasted for Please answer the below questions regarding jaundice \\(yellowing of the skin). page - myRAS Survey")
	public void enters_amount_of_time_for_when_jaundice_occured_and_enters_for_how_long_jaundice_lasted_for_Please_answer_the_below_questions_regarding_jaundice_yellowing_of_the_skin_page_myRAS_Survey(
			String amountOfJaundiceTime, String amountOfTimeJaundiceLasted) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.whatAgeDidJaundiceOccurPleaseSpecifyIfDaysWeeksMonthsYearsOld1DayTextBox);
		rASSurveyPage.whatAgeDidJaundiceOccurPleaseSpecifyIfDaysWeeksMonthsYearsOld1DayTextBox
				.sendKeys(amountOfJaundiceTime);
		rASSurveyPage.howLongDidJaundiceLastTextBox.sendKeys(amountOfTimeJaundiceLasted);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES Do you take a lactose supplement? page - myRAS Survey")
	public void clicks_YES_Do_you_take_a_lactose_supplement_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters avoided foods {string} for foods you avoid in Describe foods that you avoid because you do not like the texture or other physical qualities of the food. page - myRAS Survey")
	public void enters_avoided_foods_for_foods_you_avoid_in_Describe_foods_that_you_avoid_because_you_do_not_like_the_texture_or_other_physical_qualities_of_the_food_page_myRAS_Survey(
			String foodsToAvoid) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.describeFoodsThatYouAvoidBecauseYouDoNotLikeTheTextureOrOtherPhysicalQualitiesOfTheFoodEggsTextBox);
		rASSurveyPage.describeFoodsThatYouAvoidBecauseYouDoNotLikeTheTextureOrOtherPhysicalQualitiesOfTheFoodEggsTextBox
				.sendKeys(foodsToAvoid);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for all for Please answer the next two questions about diarrhea. page - myRAS Survey")
	public void clicks_YES_button_for_all_for_Please_answer_the_next_two_questions_about_diarrhea_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.isThereUrgencyNeedToRushToGoToTheBathroomYesRadioButton);
		rASSurveyPage.isThereUrgencyNeedToRushToGoToTheBathroomYesRadioButton.click();
		rASSurveyPage.doesDiarrheaOccurWithCrampyLowerBellyPainYesRadioButton.click();
		rASSurveyPage.isTheDiarrheaEverBloodyYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters amount of episodes {string} for episodes in a day and enters {string} for medication used and enters {string} for age when medication was taken in Please complete the table below regarding diarrhea. If medications have never been used, please put N\\/A in the box. page - myRAS Survey")
	public void enters_amount_of_episodes_for_episodes_in_a_day_and_enters_for_medication_used_and_enters_for_age_when_medication_was_taken_in_Please_complete_the_table_below_regarding_diarrhea_If_medications_have_never_been_used_please_put_N_A_in_the_box_page_myRAS_Survey(
			String amountOfEpisodes, String medicationOfEpisodes, String ageDuringEpisodes) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.whenDiarrheaOccursHowManyEpisodesOccurInOneDayTextBox);
		rASSurveyPage.whenDiarrheaOccursHowManyEpisodesOccurInOneDayTextBox.sendKeys(amountOfEpisodes);
		rASSurveyPage.whatMedicationsHaveBeenUsedToTreatDiarrheaTextBox.sendKeys(medicationOfEpisodes);
		rASSurveyPage.atWhatAgeWereMedicationsUsedToTreatDiarrheaTextBox.sendKeys(ageDuringEpisodes);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for All for Please complete the table regarding constipation. page - myRAS Survey")
	public void clicks_YES_for_All_for_Please_complete_the_table_regarding_constipation_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.twoOrFewerBowelMovementsPerWeekYesRadioButton);
		rASSurveyPage.twoOrFewerBowelMovementsPerWeekYesRadioButton.click();
		rASSurveyPage.oneOrMoreStoolAccidentsOrStoolIncontinencePerWeekYesRadioButton.click();
		rASSurveyPage.posturingOrExcessiveAttemptsToAvoidHavingABowelMovementYesRadioButton.click();
		rASSurveyPage.painfulOrHardBowelMovementsYesRadioButton.click();
		rASSurveyPage.historyOfStoolImpactionYesRadioButton.click();
		rASSurveyPage.largeBowelMovementsThatClogTheToiletYesRadioButton.click();
		rASSurveyPage.bloodOnToiletPaperOrInTheStoolYesRadioButton.click();
		rASSurveyPage.havingBowelMovementsInPlacesInappropriateOrNotSociallyAcceptableYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters medication {string} for medication and enters {string} for age in Please complete the table below regarding encopresis. If medications have never been used, please put N\\/A in the box. page - myRAS Survey")
	public void enters_medication_for_medication_and_enters_for_age_in_Please_complete_the_table_below_regarding_encopresis_If_medications_have_never_been_used_please_put_N_A_in_the_box_page_myRAS_Survey(
			String encopresisMedication, String encopresisAge) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.whatMedicationsHaveBeenUsedToTreatEncopresisTextBox);
		rASSurveyPage.whatMedicationsHaveBeenUsedToTreatEncopresisTextBox.sendKeys(encopresisMedication);
		rASSurveyPage.atWhatAgeWereTheseMedicationsUsedTextBox.sendKeys(encopresisAge);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters weight {string} for weight lost and enters {string} for over period of time where loss of weight occured and enters {string} for gained back weight in Please complete the table below regarding weight loss. page - myRAS Survey")
	public void enters_weight_for_weight_lost_and_enters_for_over_period_of_time_where_loss_of_weight_occured_and_enters_for_gained_back_weight_in_Please_complete_the_table_below_regarding_weight_loss_page_myRAS_Survey(
			String amountOfWeightLost, String timeOfWeightLost, String gainedBackWeight) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.howMuchWeightHasBeenLostTextBox);
		rASSurveyPage.howMuchWeightHasBeenLostTextBox.sendKeys(amountOfWeightLost);
		rASSurveyPage.overWhatTimePeriodDidThisWeightLossOccur30DaysTextBox.sendKeys(timeOfWeightLost);
		rASSurveyPage.hasTheWeightBeenGainedBackYesNoYesTextBox.sendKeys(gainedBackWeight);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("clicks YES for All and clicks all checkboxes regarding supplemental nutrition for Please complete the information below regarding decreased appetite. page - myRAS Survey")
	public void clicks_YES_for_All_and_clicks_all_checkboxes_regarding_supplemental_nutrition_for_Please_complete_the_information_below_regarding_decreased_appetite_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.hasDecreasedAppetiteCausedWeightLossOrPoorGrowthYesRadioButton);
		rASSurveyPage.hasDecreasedAppetiteCausedWeightLossOrPoorGrowthYesRadioButton.click();
		rASSurveyPage.haveNutritionalSupplementsFeedsEverBeenTakenOrReceivedYesRadioButton.click();
		rASSurveyPage.whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyDrinkPediasureCheckBox.click();
		rASSurveyPage.whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyTubeFeedingCheckBox.click();
		rASSurveyPage.whatSupplementalNutritionHaveBeenTakenPleaseSelectAllThatApplyTPNCheckBox.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES. Are you toilet trained? page - myRAS Survey")
	public void clicks_YES_Are_you_toilet_trained() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects toilet trained age {string} for At what age \\(approximately) were you toilet trained? page - myRAS Survey")
	public void selects_toilet_trained_age_for_At_what_age_approximately_were_you_toilet_trained_page_myRAS_Survey(
			String ageOfToiletTraining) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CommonUtils.selectDropDownValue(ageOfToiletTraining,
				rASSurveyPage.atWhatAgeApproximatelyWereYouToiletTrainedDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for ALL for Please complete the information below regarding urination. page - myRAS Survey")
	public void clicks_YES_for_ALL_for_Please_complete_the_information_below_regarding_urination_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.isTheToiletConsistentlyUsedForAllUrinationYesRadioButton);
		rASSurveyPage.isTheToiletConsistentlyUsedForAllUrinationYesRadioButton.click();
		rASSurveyPage.haveThereBeenAnyEpisodesOfRepeatedUrinaryAccidentsAfterBeingToiletTrainedYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for ALL for Please complete the information below regarding bowel movements. page - myRAS Survey")
	public void clicks_YES_for_ALL_for_Please_complete_the_information_below_regarding_bowel_movements_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.isTheToiletConsistentlyUsedForAllBowelMovementsYesRadioButton);
		rASSurveyPage.isTheToiletConsistentlyUsedForAllBowelMovementsYesRadioButton.click();
		rASSurveyPage.haveThereBeenAnyEpisodesOfRepeatedBowelMovementAccidentsAfterBeingToiletTrainedYesRadioButton
				.click();
		rASSurveyPage.isTherePainWithBowelMovementsYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects bowel movement per week amount {string} for How many bowel movements do you have per week? page - myRAS Survey")
	public void selects_bowel_movement_per_week_amount_for_How_many_bowel_movements_do_you_have_per_week_page_myRAS_Survey(
			String amountOfBowelMovements) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CommonUtils.selectDropDownValue(amountOfBowelMovements,
				rASSurveyPage.howManyBowelMovementsDoYouHavePerWeekDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects longest amount of time since last bowel movement {string} What is the longest amount of time that has passed without you having a bowel movement? page - myRAS Survey")
	public void selects_longest_amount_of_time_since_last_bowel_movement_What_is_the_longest_amount_of_time_that_has_passed_without_you_having_a_bowel_movement_page_myRAS_Survey(
			String longestAmountOfTimeWithoutBowelMovement) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CommonUtils.selectDropDownValue(longestAmountOfTimeWithoutBowelMovement,
				rASSurveyPage.whatIsTheLongestAmountOfTimeThatHasPassedWithoutYouHavingABowelMovementDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks type one for Please use the Bristol Stool Chart shown below and select the choice that best represents what typical bowel movements look like. page - myRAS Survey")
	public void clicks_type_one_for_Please_use_the_Bristol_Stool_Chart_shown_below_and_select_the_choice_that_best_represents_what_typical_bowel_movements_look_like_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(
				rASSurveyPage.bristolStoolChartShownBelowAndSelectTheChoiceThatBestRepresentsWhatTypicalBowelMovementsLookLikeType1RadioButton);
		JavascriptUtils.scrollIntoView(
				rASSurveyPage.bristolStoolChartShownBelowAndSelectTheChoiceThatBestRepresentsWhatTypicalBowelMovementsLookLikeType1RadioButton);
		rASSurveyPage.bristolStoolChartShownBelowAndSelectTheChoiceThatBestRepresentsWhatTypicalBowelMovementsLookLikeType1RadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES for Have you ever had a procedure, test or study to evaluate your gastrointestinal \\(GI) system? page - myRAS Survey")
	public void clicks_YES_for_Have_you_ever_had_a_procedure_test_or_study_to_evaluate_your_gastrointestinal_GI_system_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("selects All and enters for other GI test {string} Please indicate which of the following procedures have been performed. page - myRAS Survey")
	public void selects_All_and_enters_for_other_GI_test_Please_indicate_which_of_the_following_procedures_have_been_performed_page_myRAS_Survey(
			String otherGiTests) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.pleaseIndicateWhichOfTheFollowingProceduresHaveBeenPerformedPleaseSelectAllThatApplyOtherGITestPleaseSpecifyExamTextBox
				.sendKeys(otherGiTests);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please provide the information below for the first procedure of each kind that was performed. page - myRAS Survey")
	public void enters_all_details_for_Please_provide_the_information_below_for_the_first_procedure_of_each_kind_that_was_performed_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.digitalRectalExamMmYyOrDontKnowTextBox);
		rASSurveyPage.digitalRectalExamMmYyOrDontKnowTextBox.sendKeys("01/01");
		rASSurveyPage.digitalRectalExamexPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.digitalRectalExamexPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.digitalRectalExamhospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.digitalRectalExampleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.upperEndoscopymMYYOrDontKnowTextBox.sendKeys("02/02");
		rASSurveyPage.upperEndoscopyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.upperEndoscopyexPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.upperEndoscopyHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.upperEndoscopyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.colonoscopyMmYyOrDontKnowTextBox.sendKeys("03/03");
		rASSurveyPage.colonoscopyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.colonoscopyExPolypUlcerTestTextBox.sendKeys("Positive");
		rASSurveyPage.colonoscopyHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.colonoscopyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.anorectalManometryMmYyOrDontKnowTextBox.sendKeys("04/04");
		rASSurveyPage.anorectalManometryExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.anorectalManometryExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.anorectalManometryHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.anorectalManometryPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.phProbeOrImpedanceStudyMmYyOrDontKnowTextBox.sendKeys("05/05");
		rASSurveyPage.phProbeOrImpedanceStudyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.phProbeOrImpedanceStudyExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.phProbeOrImpedanceStudyHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.phProbeOrImpedanceStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton
				.click();
		rASSurveyPage.upperGiSwallowStudyMmYyOrDontKnowTextBox.sendKeys("06/06");
		rASSurveyPage.upperGiSwallowStudyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.upperGiSwallowStudyExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.upperGiSwallowStudyHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.upperGiSwallowStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.modifiedBariumSwallowStudyMmYyOrDontKnowTextBox.sendKeys("07/07");
		rASSurveyPage.modifiedBariumSwallowStudyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.modifiedBariumSwallowStudyExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.modifiedBariumSwallowStudyHospitalNameCityStateProvinceCountryTextBox
				.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.modifiedBariumSwallowStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton
				.click();
		rASSurveyPage.gastricEmptyingStudyMmYyOrDontKnowTextBox.sendKeys("08/08");
		rASSurveyPage.gastricEmptyingStudyExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.gastricEmptyingStudyExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.gastricEmptyingStudyHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.gastricEmptyingStudyPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		rASSurveyPage.analFissuresExamMmYyOrDontKnowTextBox.sendKeys("09/09");
		rASSurveyPage.analFissuresExamExPainEtcTestTextBox.sendKeys("HAD PAIN");
		rASSurveyPage.analFissuresExamExPolypUlcerTestTextBox.sendKeys("POSITIVE");
		rASSurveyPage.analFissuresExamHospitalNameCityStateProvinceCountryTextBox.sendKeys("INOVA, FAIRFAX VA");
		rASSurveyPage.analFissuresExamPleaseSelectThisColumnIfOnlyOneProcedureHasBeenPerformedRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about breathing and the lungs. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_breathing_and_the_lungs_page_myRAS_Survey() {

		MiscUtils.sleep(1600);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever had an evaluation by a pulmonologist? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_had_an_evaluation_by_a_pulmonologist_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Name of Pulmonologist Physician {string}, and enters hospital Location {string} and enters Hospital name {string} for Please provide the information below for the pulmonologist who completed your evaluation. page - myRAS Survey")
	public void enters_Name_of_Pulmonologist_Physician_and_enters_hospital_Location_and_enters_Hospital_name_for_Please_provide_the_information_below_for_the_pulmonologist_who_completed_your_evaluation_page_myRAS_Survey(
			String pulmonologistDoctor, String pulmonologistLocation, String pulmonologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianTextBox);
		rASSurveyPage.nameOfPhysicianTextBox.sendKeys(pulmonologistDoctor);
		rASSurveyPage.locationPulmonologistCityStateCountryTextBox.sendKeys(pulmonologistLocation);
		rASSurveyPage.hospitalAndMedicalCenterAffiliationTestTextBox.sendKeys(pulmonologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever had wheezing or whistling in your chest? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_had_wheezing_or_whistling_in_your_chest_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Has a doctor diagnosed you with reactive airway disease or asthma? page - myRAS Survey")
	public void clicks_YES_button_for_Has_a_doctor_diagnosed_you_with_reactive_airway_disease_or_asthma_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been seen in the emergency room for a breathing problem? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_seen_in_the_emergency_room_for_a_breathing_problem_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button. Have you ever been admitted to the hospital for a breathing problem? page - myRAS Survey")
	public void clicks_YES_button_Have_you_ever_been_admitted_to_the_hospital_for_a_breathing_problem_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions will ask about oral health and dental history. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_will_ask_about_oral_health_and_dental_history_page_myRAS_Survey() {

		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you receive regular dental care? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_receive_regular_dental_care_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters name of Dentist {string} and enters location {string}, and enters Medical Center {string} for Please provide the information below for where dental care is received. page - myRAS Survey")
	public void enters_name_of_Dentist_and_enters_location_and_enters_Medical_Center_for_Please_provide_the_information_below_for_where_dental_care_is_received_page_myRAS_Survey(
			String dentistName, String dentistLocation, String dentistMedicalCenter) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfDentistTextBox);
		rASSurveyPage.nameOfDentistTextBox.sendKeys(dentistName);
		rASSurveyPage.cityStateTextBox.sendKeys(dentistLocation);
		rASSurveyPage.medicalCenterOrDentalGroupAffiliationTextBox.sendKeys(dentistMedicalCenter);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters last dentist visit date {string} for when did you last visit a dentist? Please use format month\\/year as MM\\/YY. page - myRAS Survey")
	public void enters_last_dentist_visit_date_for_when_did_you_last_visit_a_dentist_Please_use_format_month_year_as_MM_YY_page_myRAS_Survey(
			String lastDentistVisit) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.whenDidYouLastVisitADentistTextBox);
		rASSurveyPage.whenDidYouLastVisitADentistTextBox.sendKeys(lastDentistVisit);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks cleaning for What was the reason for your last dental visit? page - myRAS Survey")
	public void clicks_cleaning_for_What_was_the_reason_for_your_last_dental_visit_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.cleaningRadioButton);
		rASSurveyPage.cleaningRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do your gums bleed regularly with tooth brushing now? page - myRAS Survey")
	public void clicks_YES_button_for_Do_your_gums_bleed_regularly_with_tooth_brushing_now_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES button for Do your teeth or gums hurt regularly? page - myRAS Survey")
	public void click_YES_button_for_Do_your_teeth_or_gums_hurt_regularly_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("click YES button for Do you have periodontal or gum disease? page - myRAS Survey")
	public void click_YES_button_for_Do_you_have_periodontal_or_gum_disease_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had dental sealants placed? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_dental_sealants_placed_page_myRAS_Survey() {

		MiscUtils.sleep(1300);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you currently have cavities? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_currently_have_cavities_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you previously had any dental fillings? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_previously_had_any_dental_fillings_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Does your mouth usually feel dry? page - myRAS Survey")
	public void clicks_YES_button_for_Does_your_mouth_usually_feel_dry_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Fair button for Overall, how would you rate the overall health of your teeth and gums? page - myRAS Survey")
	public void clicks_Fair_button_for_Overall_how_would_you_rate_the_overall_health_of_your_teeth_and_gums_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.overallHealthOfTeethAndGumsFairRadioButton);
		rASSurveyPage.overallHealthOfTeethAndGumsFairRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Fair button for Overall, how would you rate your dental hygiene routine \\(regular tooth brushing, flossing, and your home oral mouth rinse)? page - myRAS Survey")
	public void clicks_Fair_button_for_Overall_how_would_you_rate_your_dental_hygiene_routine_regular_tooth_brushing_flossing_and_your_home_oral_mouth_rinse_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.overallRateDentalHygeneFairRadioButton);
		rASSurveyPage.overallRateDentalHygeneFairRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had any changes in your sense of smell \\(NOT related to a diagnosis of COVID)? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_any_changes_in_your_sense_of_smell_NOT_related_to_a_diagnosis_of_COVID_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had any changes in your sense of taste \\(NOT related to a diagnosis of COVID)? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_any_changes_in_your_sense_of_taste_NOT_related_to_a_diagnosis_of_COVID_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have jaw or temporomandibular joint pain? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_jaw_or_temporomandibular_joint_pain_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have frequent headaches? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_frequent_headaches_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had any orthodontic treatment? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_any_orthodontic_treatment_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had a palatal expansion? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_a_palatal_expansion_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you had any facial or dental trauma? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_had_any_facial_or_dental_trauma_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button and enters dental surgery {string} for Did the facial or dental trauma require surgery? page - myRAS Survey")
	public void clicks_YES_button_and_enters_dental_surgery_for_Did_the_facial_or_dental_trauma_require_surgery_page_myRAS_Survey(
			String dentalSurgery) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.didTheFacialOrDentalTraumaRequireSurgeryYesRadioButton);
		rASSurveyPage.didTheFacialOrDentalTraumaRequireSurgeryYesRadioButton.click();
		rASSurveyPage.yesPleaseSpecifyTextBox.sendKeys(dentalSurgery);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Have you had elective jaw surgery? page - myRAS Survey")
	public void clicks_YES_button_Have_you_had_elective_jaw_surgery_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button enters mouth or jaw cancer {string} for Do you have a history of cancer in the mouth or jaw? page - myRAS Survey")
	public void clicks_YES_button_enters_mouth_or_jaw_cancer_for_Do_you_have_a_history_of_cancer_in_the_mouth_or_jaw_page_myRAS_Survey(
			String otherJawCancer) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.doYouHaveAHistoryOfCancerInTheMouthOrJawYesRadioButton);
		rASSurveyPage.doYouHaveAHistoryOfCancerInTheMouthOrJawYesRadioButton.click();
		rASSurveyPage.yesPleaseSpecifyTextBox.sendKeys(otherJawCancer);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button enters jaw abnormality {string} for Do you have a family member with a jaw abnormality? page - myRAS Survey")
	public void clicks_YES_button_enters_jaw_abnormality_for_Do_you_have_a_family_member_with_a_jaw_abnormality_page_myRAS_Survey(
			String jawAbnormality) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.doYouHaveAFamilyMemberWithJawAbnormalityYesRadioButton);
		rASSurveyPage.doYouHaveAFamilyMemberWithJawAbnormalityYesRadioButton.click();
		rASSurveyPage.yesPleaseSpecifyTextBox.sendKeys(jawAbnormality);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Do you have any numbness in or around your mouth? page - myRAS Survey")
	public void clicks_YES_button_Do_you_have_any_numbness_in_or_around_your_mouth_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Do you have any mouth sores? page - myRAS Survey")
	public void clicks_YES_button_Do_you_have_any_mouth_sores_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Do your teeth feel sensitive to hot or cold foods? page - myRAS Survey")
	public void clicks_YES_button_Do_your_teeth_feel_sensitive_to_hot_or_cold_foods_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Do you have problems moving your lips, tongue or mouth? page - myRAS Survey")
	public void clicks_YES_button_Do_you_have_problems_moving_your_lips_tongue_or_mouth_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button enters unusual dental condition {string} for Is there anything unusual about your teeth or mouth extra teeth, missing teeth, severe dental diseases, jawbone problems, enamel problems, etc.? page - myRAS Survey")
	public void clicks_YES_button_enters_unusual_dental_condition_for_Is_there_anything_unusual_about_your_teeth_or_mouth_extra_teeth_missing_teeth_severe_dental_diseases_jawbone_problems_enamel_problems_etc_page_myRAS_Survey(
			String unusualDentalCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.overallIsThereAnythingUnusualAboutYourTeethOrMouthYesPleaseSpecifyWhatIsUnusualRadioButton);
		rASSurveyPage.overallIsThereAnythingUnusualAboutYourTeethOrMouthYesPleaseSpecifyWhatIsUnusualRadioButton
				.click();
		rASSurveyPage.yesPleaseSpecifyWhatIsUnusualRadioButton.sendKeys(unusualDentalCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Have you had trouble pronouncing any words because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_for_Have_you_had_trouble_pronouncing_any_words_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.troublePronouncingWordsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton);
		rASSurveyPage.troublePronouncingWordsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Have you felt that your sense of taste has worsened because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_for_Have_you_felt_that_your_sense_of_taste_has_worsened_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouFeltYourSenseOfTasteWorsenedBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton);
		rASSurveyPage.haveYouFeltYourSenseOfTasteWorsenedBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Have you had painful aching in your mouth? page - myRAS Survey")
	public void clicks_Occasionally_for_Have_you_had_painful_aching_in_your_mouth_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.haveYouHadPainfulAchingInYourMouthOcassionallyRadioButton);
		rASSurveyPage.haveYouHadPainfulAchingInYourMouthOcassionallyRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Have you found it uncomfortable to eat any foods because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_for_Have_you_found_it_uncomfortable_to_eat_any_foods_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouFoundItUnconfortableToEatFoodsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton);
		rASSurveyPage.haveYouFoundItUnconfortableToEatFoodsBecauseOfProblemsWithTeethMouthOrDenturesOcassionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Are you self-conscious because of your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_for_Are_you_self_conscious_because_of_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.areYouSelfConsciousBecauseOfYourTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.areYouSelfConsciousBecauseOfYourTeethMouthOrDenturesOccasionallyRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally for Have you felt tense because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_for_Have_you_felt_tense_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouFeltTenseBecauseOfProblemsWithYourTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouFeltTenseBecauseOfProblemsWithYourTeethMouthOrDenturesOccasionallyRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Has your diet been unsatisfactory because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Has_your_diet_been_unsatisfactory_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.hasYourDietBeenUnsatisfactoryBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.hasYourDietBeenUnsatisfactoryBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you had to interrupt meals because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_had_to_interrupt_meals_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouHadToInterruptMealsBeacuseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouHadToInterruptMealsBeacuseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you found it difficult to relax because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_found_it_difficult_to_relax_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouFoundItDifficultToRelaxBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouFoundItDifficultToRelaxBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you been a bit embarrassed because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_been_a_bit_embarrassed_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouBeenABitEmbarrassedBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouBeenABitEmbarrassedBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you been irritable with other people because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_been_irritable_with_other_people_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouBeenIrritableWithOtherPeopleBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouBeenIrritableWithOtherPeopleBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you had difficulty doing your usual jobs because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_had_difficulty_doing_your_usual_jobs_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouHadDifficultyDoingYourUsualJobsBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouHadDifficultyDoingYourUsualJobsBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you felt that life in general is less satisfying because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_felt_that_life_in_general_is_less_satisfying_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouFeltThatLifeInGeneralIsLessSatisfyingBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouFeltThatLifeInGeneralIsLessSatisfyingBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Occasionally Have you been totally unable to function because of problems with your teeth, mouth or dentures? page - myRAS Survey")
	public void clicks_Occasionally_Have_you_been_totally_unable_to_function_because_of_problems_with_your_teeth_mouth_or_dentures_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(
				rASSurveyPage.haveYouBeenTotallyUnableToFunctionBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton);
		rASSurveyPage.haveYouBeenTotallyUnableToFunctionBecauseOfProblemsWithTeethMouthOrDenturesOccasionallyRadioButton
				.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button The next set of questions ask about fluid balance and if any fluid builds up throughout the body. page - myRAS Survey")
	public void clicks_Next_button_The_next_set_of_questions_ask_about_fluid_balance_and_if_any_fluid_builds_up_throughout_the_body_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with a lymphatic system issue? Some examples include: neonatal lymphedema, lymphedema, congenital chylothorax, pleural effusion\\/chylothorax, and lymphangioma. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_a_lymphatic_system_issue_Some_examples_include_neonatal_lymphedema_lymphedema_congenital_chylothorax_pleural_effusion_chylothorax_and_lymphangioma_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("clicks All and enters for other lymphatic condition {string} for Have you ever been diagnosed with any of the following lymphatic system issues? The lymphatic system is a network of vessels and nodes \\(lymph nodes) that carry a fluid called lymph throughout our bodies. Lymph helps the body fight infection. Please select all that apply. page - myRAS Survey")
	public void clicks_All_and_enters_for_other_lymphatic_condition_for_Have_you_ever_been_diagnosed_with_any_of_the_following_lymphatic_system_issues_The_lymphatic_system_is_a_network_of_vessels_and_nodes_lymph_nodes_that_carry_a_fluid_called_lymph_throughout_our_bodies_Lymph_helps_the_body_fight_infection_Please_select_all_that_apply_page_myRAS_Survey(
			String otherLymphaticConditon) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherLymphaticConditon);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please complete the table below to the best of your ability about the onset of symptoms, when you were diagnosed and if any procedures or medications were undertaken. page - myRAS Survey")
	public void enters_all_details_for_Please_complete_the_table_below_to_the_best_of_your_ability_about_the_onset_of_symptoms_when_you_were_diagnosed_and_if_any_procedures_or_medications_were_undertaken_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.neonatalLymphedemaAgeOfFirstSymptomsTextBox);
		rASSurveyPage.neonatalLymphedemaAgeOfFirstSymptomsTextBox.sendKeys("1");
		rASSurveyPage.neonatalLymphedemaAgeOfDiagnosisTextBox.sendKeys("1");
		rASSurveyPage.neonatalLymphedemaMedicationOrProcedureTextBox.sendKeys("KETOPROFEN");
		rASSurveyPage.neonatalLymphedemaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.lymphedemaAgeOfFirstSymptomsTextBox.sendKeys("1");
		rASSurveyPage.lymphedemaAgeOfDiagnosisTextBox.sendKeys("1");
		rASSurveyPage.lymphedemaMedicationOrProcedureTextBox.sendKeys("AMOXICILLIN");
		rASSurveyPage.lymphedemaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.congenitalChylothoraxAgeOfFirstSymptomsTextBox.sendKeys("1");
		rASSurveyPage.congenitalChylothoraxAgeOfDiagnosisTextBox.sendKeys("1");
		rASSurveyPage.congenitalChylothoraxMedicationOrProcedureTextBox.sendKeys("OCTREOTIDE");
		rASSurveyPage.congenitalChylothoraxNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.pleuralEffusionChylothoraxAgeOfFirstSymptomsTextBox.sendKeys("1");
		rASSurveyPage.pleuralEffusionChylothoraxAgeOfDiagnosisTextBox.sendKeys("1");
		rASSurveyPage.pleuralEffusionChylothoraxMedicationOrProcedureTextBox.sendKeys("CLINDAMYCIN");
		rASSurveyPage.pleuralEffusionChylothoraxNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.lymphangiomaAgeOfFirstSymptomsTextBox.sendKeys("10");
		rASSurveyPage.lymphangiomaAgeOfDiagnosisTextBox.sendKeys("11");
		rASSurveyPage.lymphangiomaMedicationOrProcedureTextBox.sendKeys("SIROLIMUS");
		rASSurveyPage.lymphangiomaNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.chronicAbdominalPainAgeOfFirstSymptomsBox.sendKeys("15");
		rASSurveyPage.chronicAbdominalPainAgeOfDiagnosisBox.sendKeys("16");
		rASSurveyPage.chronicAbdominalPainMedicationOrProcedureTextBox.sendKeys("TYLENOL");
		rASSurveyPage.chronicAbdominalPainNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		rASSurveyPage.poorLymphaticDrainageAgeOfFirstSymptomsTextBox.sendKeys("20");
		rASSurveyPage.poorLymphaticDrainageAgeOfDiagnosisTextBox.sendKeys("21");
		rASSurveyPage.poorLymphaticDrainageMedicationOrProcedureTextBox.sendKeys("ASTRAGALUS");
		rASSurveyPage.poorLymphaticDrainageNameOfTreatingHospitalOrPhysicianAndAddressOfHospitalTextBox
				.sendKeys("INOVA URGENT CARE - NORTH ARLINGTON, 4600 LEE HWY, ARLINGTON, VA , USA");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("click Next button for The next set of questions will ask about the kidneys. page - myRAS Survey")
	public void click_Next_button_for_The_next_set_of_questions_will_ask_about_the_kidneys_page_myRAS_Survey() {

		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button Start Have you ever been evaluated by a nephrologist? These are doctors that specialize in the kidneys.They often diagnose conditions related to kidney function and help people get dialysis if their kidneys are not working well. page - myRAS Survey")
	public void clicks_YES_button_Start_Have_you_ever_been_evaluated_by_a_nephrologist_These_are_doctors_that_specialize_in_the_kidneys_They_often_diagnose_conditions_related_to_kidney_function_and_help_people_get_dialysis_if_their_kidneys_are_not_working_well_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters name of Neuphrologist doctor {string}, and enters City {string} and enters Hospital {string} for Please list the information below for the nephrologist who completed your evaluation. page - myRAS Survey")
	public void enters_name_of_Neuphrologist_doctor_and_enters_City_and_enters_Hospital_for_Please_list_the_information_below_for_the_nephrologist_who_completed_your_evaluation_page_myRAS_Survey(
			String neuphrologistDoctor, String neuphrologistLocation, String neuphrologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.informationForNephrologistNameOfDoctorTextBox);
		rASSurveyPage.informationForNephrologistNameOfDoctorTextBox.sendKeys(neuphrologistDoctor);
		rASSurveyPage.informationForNephrologistCityStateTextBox.sendKeys(neuphrologistLocation);
		rASSurveyPage.informationForANephrologistHospitalOrMedicalAffiliationTextBox.sendKeys(neuphrologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with a kidney problem? Some examples include: minor issues with kidney shape, underdeveloped kidney, missing kidney, or swollen kidney. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_a_kidney_problem_Some_examples_include_minor_issues_with_kidney_shape_underdeveloped_kidney_missing_kidney_or_swollen_kidney_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other kidney problem {string} Have you ever been diagnosed with any of the following kidney problems? Please select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_kidney_problem_Have_you_ever_been_diagnosed_with_any_of_the_following_kidney_problems_Please_select_all_that_apply_page_myRAS_Survey(
			String kidneyProblem) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(kidneyProblem);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below to the best of your ability regarding date of onset of symptoms, diagnosis and if any medications or procedures were undertaken. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_to_the_best_of_your_ability_regarding_date_of_onset_of_symptoms_diagnosis_and_if_any_medications_or_procedures_were_undertaken_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.minorIssuesWithKidneysFirstSymptomsDateTextBox);
		rASSurveyPage.minorIssuesWithKidneysFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.minorIssuesWithKidneysFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.minorIssuesWithKidneysDiagnosisDateTextBox.sendKeys("11/01");
		rASSurveyPage.minorIssuesWithKidneysDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.minorIssuesWithKidneysMedicationTypeTextBox.sendKeys("HEMODIALYSIS");
		rASSurveyPage.minorIssuesWithKidneysAddressTextBox.sendKeys("UCLA MEDICAL CENTER, LA, CA");
		rASSurveyPage.underdevelopedKidneyFirstSymptomsDateTextBox.sendKeys("02/02");
		rASSurveyPage.underdevelopedKidneyFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.underdevelopedKidneyDiagnosisDateTextBox.sendKeys("12/02");
		rASSurveyPage.underdevelopedKidneyDiagnosisAgeTextBox.sendKeys("13");
		rASSurveyPage.underdevelopedKidneyMedicationTypeTextBox.sendKeys("TRANSPLANT");
		rASSurveyPage.underdevelopedKidneyAddressTextBox.sendKeys("KECK MEDICAL CENTER OF USC, LA, CA");
		rASSurveyPage.hydronephrosisFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.hydronephrosisFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.hydronephrosisDiagnosisDateTextBox.sendKeys("12/03");
		rASSurveyPage.hydronephrosisDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.hydronephrosisMedicationTypeTextBox.sendKeys("CATHETERISATION");
		rASSurveyPage.hydronephrosisAddressTextBox.sendKeys("UCSF MEDICAL CENTER, SF, CA");
		rASSurveyPage.otherKidneyFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.otherKidneyFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.otherKidneyDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.otherKidneyDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.otherKidneyMedicationTypeTextBox.sendKeys("ISONIAZID");
		rASSurveyPage.otherKidneyAddressTextBox.sendKeys("DOCTOR KID CLAY");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about hair and skin qualities. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_hair_and_skin_qualities_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Yes button for Have you ever been evaluated by a dermatologist? Dermatologists are physicians who specialize in conditions of the skin. They diagnose and treat a range of conditions such as melanoma, acne, and hemangiomas. page - myRAS Survey")
	public void clicks_Yes_button_for_Have_you_ever_been_evaluated_by_a_dermatologist_Dermatologists_are_physicians_who_specialize_in_conditions_of_the_skin_They_diagnose_and_treat_a_range_of_conditions_such_as_melanoma_acne_and_hemangiomas_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters name of Dermatologist Physician {string} and enters city\\/state {string} and enters Hospital {string} for Please provide the information below for the dermatologist who completed your evaluation. page - myRAS Survey")
	public void enters_name_of_Dermatologist_Physician_and_enters_city_state_and_enters_Hospital_for_Please_provide_the_information_below_for_the_dermatologist_who_completed_your_evaluation_page_myRAS_Survey(
			String dermatologistDoctor, String dermatologistLocation, String dermatologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianDermatologistTextBox);
		rASSurveyPage.nameOfPhysicianDermatologistTextBox.sendKeys(dermatologistDoctor);
		rASSurveyPage.cityStateDermatologistTextBox.sendKeys(dermatologistLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationDermatologistTextBox.sendKeys(dermatologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks all and enters other hair condition {string} for Please choose the best term\\(s) to describe your hair. Please select all that apply. page - myRAS Survey")
	public void clicks_all_and_enters_other_hair_condition_for_Please_choose_the_best_term_s_to_describe_your_hair_Please_select_all_that_apply_page_myRAS_Survey(
			String otherHairCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes();
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherHairCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Is the texture or amount of your hair similar to biological family members, such as your mother, father, sibling, and children? page -  myRAS Survey")
	public void clicks_YES_button_for_Is_the_texture_or_amount_of_your_hair_similar_to_biological_family_members_such_as_your_mother_father_sibling_and_children_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other skin issue {string} for Have you ever been diagnosed with any of the following issues involving patches of thickened skin, also known as hyperkeratotis skin? Please select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_skin_issue_for_Have_you_ever_been_diagnosed_with_any_of_the_following_issues_involving_patches_of_thickened_skin_also_known_as_hyperkeratotis_skin_Please_select_all_that_apply_page_myRAS_Survey(
			String otherSkinIssue) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known thickened/hyperkeratotic skin issues", "Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherSkinIssue);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other pigmented skin issue {string} for Do you have any of the following pigmented skin findings? Select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_pigmented_skin_issue_for_Do_you_have_any_of_the_following_pigmented_skin_findings_Select_all_that_apply_page_myRAS_Survey(
			String otherPigmentedSkinIssue) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known pigmented skin findings", "Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherPigmentedSkinIssue);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Three or more hemangiomas for Do you have any hemangiomas? Hemangiomas are bright red marks on the skin made up of blood vessels, which may appear as a mass or lump. A hemangioma may appear in infancy or childhood and fade over time. page - myRAS Survey")
	public void clicks_Three_or_more_hemangiomas_for_Do_you_have_any_hemangiomas_Hemangiomas_are_bright_red_marks_on_the_skin_made_up_of_blood_vessels_which_may_appear_as_a_mass_or_lump_A_hemangioma_may_appear_in_infancy_or_childhood_and_fade_over_time_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.threeOrMoreHemangiomasRadioButton);
		rASSurveyPage.threeOrMoreHemangiomasRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other skin tumor {string} for Have you ever been diagnosed with any of the following skin tumors? Please select all that applyfor this page. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_skin_tumor_for_Have_you_ever_been_diagnosed_with_any_of_the_following_skin_tumors_Please_select_all_that_applyfor_this_page_page_myRAS_Survey(
			String otherSkinTumor) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known skin tumors", "Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherSkinTumor);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about skeletal conditions. Skeletal conditions involve the bones throughout the body page. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_skeletal_conditions_Skeletal_conditions_involve_the_bones_throughout_the_body_page_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been evaluated by an orthopaedic surgeon? Orthopaedic surgeons are doctors who specialize in the bones and muscles. They diagnose and treat a range of conditions including broken bones, osteosarcoma, and torn ligaments. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_evaluated_by_an_orthopaedic_surgeon_Orthopaedic_surgeons_are_doctors_who_specialize_in_the_bones_and_muscles_They_diagnose_and_treat_a_range_of_conditions_including_broken_bones_osteosarcoma_and_torn_ligaments_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Name of Orthapaedic Physican {string} and enters Location {string} and enters Hospital {string} for Please provide the details below for the orthopaedic surgeon who completed your evaluation. page - myRAS Survey")
	public void enters_Name_of_Orthapaedic_Physican_and_enters_Location_and_enters_Hospital_for_Please_provide_the_details_below_for_the_orthopaedic_surgeon_who_completed_your_evaluation_page_myRAS_Survey(
			String orthapaedicDoctor, String orthapaedicLocation, String orthapaedicHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianOrthopaedicTextBox);
		rASSurveyPage.nameOfPhysicianOrthopaedicTextBox.sendKeys(orthapaedicDoctor);
		rASSurveyPage.cityStateOrthopaedicTextBox.sendKeys(orthapaedicLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationOrthopaedicTextBox.sendKeys(orthapaedicHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other skeletal condition {string} for Have you been diagnosed with any of the following skeletal findings in the thoracic area? The thoracic area includes the chest and ribs. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_skeletal_condition_for_Have_you_been_diagnosed_with_any_of_the_following_skeletal_findings_in_the_thoracic_area_The_thoracic_area_includes_the_chest_and_ribs_page_myRAS_Survey(
			String otherSkeletalCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known thoracic area skeletal issues", "Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherSkeletalCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have any issues with curving of the spine? This would often be diagnosed or evaluated by an orthopaedic surgeon. Examples include scoliosis and kyphosis. page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_any_issues_with_curving_of_the_spine_This_would_often_be_diagnosed_or_evaluated_by_an_orthopaedic_surgeon_Examples_include_scoliosis_and_kyphosis_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other spine condition {string} for Have you ever been diagnosed with any of the following types of curvature of the spin. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_spine_condition_for_Have_you_ever_been_diagnosed_with_any_of_the_following_types_of_curvature_of_the_spin_page_myRAS_Survey(
			String otherSpineCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherSpineCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please complete the table below for each of the spine issues listed. For each condition, please indicate your age or date when they occurred \\(you do not need to include both). If you do not recall the details, place	an X in the column Dont know. For the treatment column, if no treatment was	required, please write None. page - myRAS Survey")
	public void enters_all_details_for_Please_complete_the_table_below_for_each_of_the_spine_issues_listed_For_each_condition_please_indicate_your_age_or_date_when_they_occurred_you_do_not_need_to_include_both_If_you_do_not_recall_the_details_place_an_X_in_the_column_Dont_know_For_the_treatment_column_if_no_treatment_was_required_please_write_None_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.scoliosisFirstSymptomsDateTextBox);
		rASSurveyPage.scoliosisFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.scoliosisFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.scoliosisDiagnosisDateTextBox.sendKeys("12/03");
		rASSurveyPage.scoliosisDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.scoliosisTreatmentTextBox.sendKeys("BRACING");
		rASSurveyPage.kyphosisFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.kyphosisFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.kyphosisDiagnosisDateTextBox.sendKeys("03/05");
		rASSurveyPage.kyphosisDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.kyphosisTreatmentTextBox.sendKeys("SPINAL FUSION SURGERY");
		rASSurveyPage.kyphoscoliosisFirstSymptomsDateTextBox.sendKeys("04/06");
		rASSurveyPage.kyphoscoliosisFirstSymptomsAgeTextBox.sendKeys("16");
		rASSurveyPage.kyphoscoliosisDiagnosisDateTextBox.sendKeys("03/07");
		rASSurveyPage.kyphoscoliosisDiagnosisAgeTextBox.sendKeys("17");
		rASSurveyPage.kyphoscoliosisTreatmentTextBox.sendKeys("SPINAL CORRECTION SURGERY");
		rASSurveyPage.otherSpineFirstSymptomsDateTextBox.sendKeys("08/08");
		rASSurveyPage.otherSpineFirstSymptomsAgeTextBox.sendKeys("18");
		rASSurveyPage.otherSpineDiagnosisDateTextBox.sendKeys("03/09");
		rASSurveyPage.otherSpineDiagnosisAgeTextBox.sendKeys("19");
		rASSurveyPage.otherSpineTreatmentTextBox.sendKeys("SPINAL STEROID INJECTIONS");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("clicks YES button for Has your neck been described as short or webbed? Individuals with a short, webbed neck may have a low hairline or extra skin where the neck meets the shoulders. Page - myRAS Survey")
	public void clicks_YES_button_for_Has_your_neck_been_described_as_short_or_webbed_Individuals_with_a_short_webbed_neck_may_have_a_low_hairline_or_extra_skin_where_the_neck_meets_the_shoulders_Page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with joint issues? These conditions are often diagnosed by neurologists, rheumatologists and orthopaedic surgeons. Examples include ulnar deviation, Achilles tendon contracture, hip dysplasia. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_joint_issues_These_conditions_are_often_diagnosed_by_neurologists_rheumatologists_and_orthopaedic_surgeons_Examples_include_ulnar_deviation_Achilles_tendon_contracture_hip_dysplasia_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks ALL that apply and enters other joint issue {string} for Have you ever been diagnosed with the following joint issues page? page - myRAS Survey")
	public void clicks_ALL_that_apply_and_enters_other_joint_issue_for_Have_you_ever_been_diagnosed_with_the_following_joint_issues_page_page_myRAS_Survey(
			String otherJointIssue) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherJointIssue);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters all details for Please complete the table below for each of the joint issues listed. For each condition, please include the date or age when symptoms first occurred and date or age at diagnosis \\(you do not need to include both the date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please put None in the Treatment column. page - myRAS Survey")
	public void enters_all_details_for_Please_complete_the_table_below_for_each_of_the_joint_issues_listed_For_each_condition_please_include_the_date_or_age_when_symptoms_first_occurred_and_date_or_age_at_diagnosis_you_do_not_need_to_include_both_the_date_and_age_If_you_do_not_recall_the_details_please_place_an_X_in_the_column_Dont_know_If_no_treatment_was_required_please_put_None_in_the_Treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.scoliosisFirstSymptomsDateTextBox);
		rASSurveyPage.ulnarDeviationFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.ulnarDeviationFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.ulnarDeviationDiagnosisDateTextBox.sendKeys("12/03");
		rASSurveyPage.ulnarDeviationDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.ulnarDeviationTreatmentTextBox.sendKeys("TENDON TRANSFER");
		rASSurveyPage.pesPlanusFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.pesPlanusFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.pesPlanusDiagnosisDateTextBox.sendKeys("03/05");
		rASSurveyPage.pesPlanusDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.pesPlanusTreatmentTextBox.sendKeys("PHYSICAL THERAPY");
		rASSurveyPage.achillesTendonFirstSymptomsDateTextBox.sendKeys("04/06");
		rASSurveyPage.achillesTendonFirstSymptomsAgeTextBox.sendKeys("16");
		rASSurveyPage.achillesTendonDiagnosisDateTextBox.sendKeys("03/07");
		rASSurveyPage.achillesTendonDiagnosisAgeTextBox.sendKeys("17");
		rASSurveyPage.achillesTendonTreatmentTextBox.sendKeys("STRETCHING");
		rASSurveyPage.hipDysplasiaFirstSymptomsDateTextBox.sendKeys("04/06");
		rASSurveyPage.hipDysplasiaFirstSymptomsAgeTextBox.sendKeys("16");
		rASSurveyPage.hipDysplasiaDiagnosisDateTextBox.sendKeys("03/07");
		rASSurveyPage.hipDysplasiaDiagnosisAgeTextBox.sendKeys("17");
		rASSurveyPage.hipDysplasiaTreatmentTextBox.sendKeys("HIP REPLACEMENT");
		rASSurveyPage.hypermobilityFirstSymptomsDateTextBox.sendKeys("08/08");
		rASSurveyPage.hypermobilityFirstSymptomsAgeTextBox.sendKeys("18");
		rASSurveyPage.hypermobilityDiagnosisDateTextBox.sendKeys("03/09");
		rASSurveyPage.hypermobilityDiagnosisAgeTextBox.sendKeys("19");
		rASSurveyPage.hypermobilityTreatmentTextBox.sendKeys("IBUPROFIN");
		rASSurveyPage.otherJointFirstSymptomsDateTextBox.sendKeys("08/08");
		rASSurveyPage.otherJointFirstSymptomsAgeTextBox.sendKeys("18");
		rASSurveyPage.otherJointDiagnosisDateTextBox.sendKeys("03/09");
		rASSurveyPage.otherJointDiagnosisAgeTextBox.sendKeys("19");
		rASSurveyPage.otherJointTreatmentTextBox.sendKeys("NSAIDS");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about blood disorders. Blood disorders include immune system problems white blood cells or bleeding clotting issues platelets or other bone marrow problems where white blood cells, red blood cells and platelets are produced. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_blood_disorders_Blood_disorders_include_immune_system_problems_white_blood_cells_or_bleeding_clotting_issues_platelets_or_other_bone_marrow_problems_where_white_blood_cells_red_blood_cells_and_platelets_are_produced_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever had an evaluation by a hematologist or oncologist? Hematologists are physicians who specialize in the blood system, including white blood cells, platelets, red blood cells and clotting factors. Oncologists are physicians who specialize in cancer. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_had_an_evaluation_by_a_hematologist_or_oncologist_Hematologists_are_physicians_who_specialize_in_the_blood_system_including_white_blood_cells_platelets_red_blood_cells_and_clotting_factors_Oncologists_are_physicians_who_specialize_in_cancer_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Name of Hematologist Physican {string} and enters Location {string},and enters Hospital {string} for Please provide the information below for the hematologist\\/oncologist who completed your evaluation. page - myRAS Survey")
	public void enters_Name_of_hematologist_Physican_and_enters_Location_and_enters_Hospital_for_Please_provide_the_information_below_for_the_hematologist_oncologist_who_completed_your_evaluation_page_myRAS_Survey(
			String hematologistDoctor, String hematologistLocation, String hematologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianHematologistTextBox);
		rASSurveyPage.nameOfPhysicianHematologistTextBox.sendKeys(hematologistDoctor);
		rASSurveyPage.cityStateHematologistTextBox.sendKeys(hematologistLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationHematologistTextBox.sendKeys(hematologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have issues with bleeding or bruising? Examples include easy bruising, poor blood clotting. These conditions are often evaluated and diagnosed by a hematologist \\(a physician who specializes in the blood). page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_issues_with_bleeding_or_bruising_Examples_include_easy_bruising_poor_blood_clotting_These_conditions_are_often_evaluated_and_diagnosed_by_a_hematologist_a_physician_who_specializes_in_the_blood_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesBleedingRadioButton);
		JavascriptUtils.clickByJS(rASSurveyPage.yesBleedingRadioButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other blood issue {string} for Do you have any of the following issues with bleeding or bruising? Please select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_blood_issue_for_Do_you_have_any_of_the_following_issues_with_bleeding_or_bruising_Please_select_all_that_apply_page_myRAS_Survey(
			String otherBloodIssue) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherBloodIssue);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the bleeding bruising issues listed. For each condition, please provide your age or date when symptoms first started and at diagnosis, you only need to provide date or age, but not both. If you do not recall the details, please place an X in the Dont know column. If no treatment was required, please write None in the treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_bleeding_bruising_issues_listed_For_each_condition_please_provide_your_age_or_date_when_symptoms_first_started_and_at_diagnosis_you_only_need_to_provide_date_or_age_but_not_both_If_you_do_not_recall_the_details_please_place_an_X_in_the_Dont_know_column_If_no_treatment_was_required_please_write_None_in_the_treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.easyBruisingFirstSymptomsDateTextBox);
		rASSurveyPage.easyBruisingFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.easyBruisingFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.easyBruisingDiagnosisDateTextBox.sendKeys("04/04");
		rASSurveyPage.easyBruisingDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.easyBruisingMedicationTypeTextBox.sendKeys("VITAMIN K CREAM");
		rASSurveyPage.easyBruisingAddressTextBox.sendKeys("INOVA HOSPITAL FAIRFAX, VA");
		rASSurveyPage.plateletDysfunctionFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.plateletDysfunctionFirstSymptomsAgeTextBox.sendKeys("15");
		rASSurveyPage.plateletDysfunctionDiagnosisDateTextBox.sendKeys("06/06");
		rASSurveyPage.plateletDysfunctionDiagnosisAgeTextBox.sendKeys("16");
		rASSurveyPage.plateletDysfunctionMedicationTypeTextBox.sendKeys("PLASMA EXCHANGE");
		rASSurveyPage.plateletDysfunctionAddressTextBox.sendKeys("GEORGE WASHINGTON UNIVERSITY HOSPITAL, DC");
		rASSurveyPage.clottingDisorderFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.clottingDisorderFirstSymptomsAgeTextBox.sendKeys("17");
		rASSurveyPage.clottingDisorderDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.clottingDisorderDiagnosisAgeTextBox.sendKeys("18");
		rASSurveyPage.clottingDisorderMedicationTypeTextBox.sendKeys("PLASMA TRANSFUSION");
		rASSurveyPage.clottingDisorderAddressTextBox.sendKeys("DELAWARE HOSPITAL, DE");
		rASSurveyPage.otherBleedingTextBox.sendKeys("HEMOPHILIA");
		rASSurveyPage.otherBleedingFirstSymptomsDateTextBox.sendKeys("05/15");
		rASSurveyPage.otherBleedingFirstSymptomsAgeTextBox.sendKeys("25");
		rASSurveyPage.otherBleedingDiagnosisDateTextBox.sendKeys("06/16");
		rASSurveyPage.otherBleedingDiagnosisAgeTextBox.sendKeys("26");
		rASSurveyPage.otherBleedingMedicationTypeTextBox.sendKeys("BLOOD TRANSFUSION");
		rASSurveyPage.otherBleedingAddressTextBox.sendKeys("CLEVELAND CLINIC, OH");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have any known blood disorders or symptoms of blood disorders? Examples include an enlarged spleen, leukemia, low plateletsor low blood cells. page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_any_known_blood_disorders_or_symptoms_of_blood_disorders_Examples_include_an_enlarged_spleen_leukemia_low_plateletsor_low_blood_cells_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other leukemia condition {string} and other blood condition {string} in Have you ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? Please select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_leukemia_condition_and_other_blood_condition_in_Have_you_ever_been_diagnosed_with_any_of_the_following_blood_disorders_or_symptoms_of_blood_disorders_Please_select_all_that_apply_page_myRAS_Survey(
			String otherLeukemia, String otherBloodDisorder) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherLeukemiaTextBox.sendKeys(otherLeukemia);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherBloodDisorder);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the blood disorders issues listed. For each condition listed, please include either your age or date of symptoms and diagnosis \\(you do not need to include both date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please write None in the Treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_blood_disorders_issues_listed_For_each_condition_listed_please_include_either_your_age_or_date_of_symptoms_and_diagnosis_you_do_not_need_to_include_both_date_and_age_If_you_do_not_recall_the_details_please_place_an_X_in_the_column_Dont_know_If_no_treatment_was_required_please_write_None_in_the_Treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.splenomegalyFirstSymptomsDateTextBox);
		rASSurveyPage.splenomegalyFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.splenomegalyFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.splenomegalyDiagnosisDateTextBox.sendKeys("02/02");
		rASSurveyPage.splenomegalyDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.splenomegalyMedicationTypeTextBox.sendKeys("RUXOLITINIB");
		rASSurveyPage.splenomegalyAddressTextBox.sendKeys("INOVA FAIRFAX HOSPITAL, VA");
		rASSurveyPage.myeloproliferativeFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.myeloproliferativeFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.myeloproliferativeDiagnosisDateTextBox.sendKeys("04/04");
		rASSurveyPage.myeloproliferativeDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.myeloproliferativeMedicationTypeTextBox.sendKeys("RADIATION THERAPY");
		rASSurveyPage.myeloproliferativeAddressTextBox.sendKeys("MEDSTAR SOUTHERN MARYLAND HOSPITAL CENTER, MD");
		rASSurveyPage.juvenileMyelomonocyticFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.juvenileMyelomonocyticFirstSymptomsAgeTextBox.sendKeys("15");
		rASSurveyPage.juvenileMyelomonocyticDiagnosisDateTextBox.sendKeys("06/06");
		rASSurveyPage.juvenileMyelomonocyticDiagnosisAgeTextBox.sendKeys("16");
		rASSurveyPage.juvenileMyelomonocyticMedicationTypeTextBox.sendKeys("CHEMOTHERAPY");
		rASSurveyPage.juvenileMyelomonocyticAddressTextBox.sendKeys("GEORGE WASHINGTON UNIVERSITY HOSPITAL, DC");
		rASSurveyPage.thrombocytopeniaFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.thrombocytopeniaFirstSymptomsAgeTextBox.sendKeys("17");
		rASSurveyPage.thrombocytopeniaDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.thrombocytopeniaDiagnosisAgeTextBox.sendKeys("18");
		rASSurveyPage.thrombocytopeniaMedicationTypeTextBox.sendKeys("BLOOD TRANSFUSION");
		rASSurveyPage.thrombocytopeniaAddressTextBox.sendKeys("DELAWARE HOSPITAL, DE");
		rASSurveyPage.marrowHypoplasiaFirstSymptomsDateTextBox.sendKeys("09/09");
		rASSurveyPage.marrowHypoplasiaFirstSymptomsAgeTextBox.sendKeys("19");
		rASSurveyPage.marrowHypoplasiaDiagnosisDateTextBox.sendKeys("10/10");
		rASSurveyPage.marrowHypoplasiaDiagnosisAgeTextBox.sendKeys("20");
		rASSurveyPage.marrowHypoplasiaMedicationTypeTextBox.sendKeys("BLOOD TRANSFUSION");
		rASSurveyPage.marrowHypoplasiaAddressTextBox.sendKeys("ADVANT HEALTH, FL");
		rASSurveyPage.historyOfLowBloodCellCountFirstSymptomsDateTextBox.sendKeys("11/11");
		rASSurveyPage.historyOfLowBloodCellCountFirstSymptomsAgeTextBox.sendKeys("21");
		rASSurveyPage.historyOfLowBloodCellCountDiagnosisDateTextBox.sendKeys("12/12");
		rASSurveyPage.historyOfLowBloodCellCountDiagnosisAgeTextBox.sendKeys("22");
		rASSurveyPage.historyOfLowBloodCellCountMedicationTypeTextBox.sendKeys("IRON SUPPLEMENT");
		rASSurveyPage.historyOfLowBloodCellCountAddressTextBox.sendKeys("CENTRAL FLORIDA REGIONAL HOSPITAL, FL");
		rASSurveyPage.otherLeukemiaFirstSymptomsDateTextBox.sendKeys("09/15");
		rASSurveyPage.otherLeukemiaFirstSymptomsAgeTextBox.sendKeys("24");
		rASSurveyPage.otherLeukemiaDiagnosisDateTextBox.sendKeys("12/16");
		rASSurveyPage.otherLeukemiaDiagnosisAgeTextBox.sendKeys("28");
		rASSurveyPage.otherLeukemiaMedicationTypeTextBox.sendKeys("TARGETED THERAPY");
		rASSurveyPage.otherLeukemiaAddressTextBox.sendKeys("CLEVELAND CLINIC, OH");
		rASSurveyPage.otherBloodDisordersFirstSymptomsDateTextBox.sendKeys("05/15");
		rASSurveyPage.otherBloodDisordersFirstSymptomsAgeTextBox.sendKeys("25");
		rASSurveyPage.otherBloodDisordersDiagnosisDateTextBox.sendKeys("06/16");
		rASSurveyPage.otherBloodDisordersDiagnosisAgeTextBox.sendKeys("26");
		rASSurveyPage.otherBloodDisordersMedicationTypeTextBox.sendKeys("TARGETED THERAPY");
		rASSurveyPage.otherBloodDisordersAddressTextBox.sendKeys("CLEVELAND CLINIC, OH");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other tumor condition {string} for Have you ever been diagnosed with any of the following tumors? Please select all that apply. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_tumor_condition_for_Have_you_ever_been_diagnosed_with_any_of_the_following_tumors_Please_select_all_that_apply_page_yRAS_Survey(
			String otherTumor) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherConditionTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("No known tumors", "Unsure/Unknown");
		rASSurveyPage.otherConditionTextBox.sendKeys(otherTumor);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the tumors listed. Please include your age or date when symptoms first started and diagnosis you do not need to include both age and date. If you do not recall the details, please place an X under the Dont know column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_tumors_listed_Please_include_your_age_or_date_when_symptoms_first_started_and_diagnosis_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_the_details_please_place_an_X_under_the_Dont_know_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.giantCellLesionFirstSymptomsDateTextBox);
		rASSurveyPage.giantCellLesionFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.giantCellLesionFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.giantCellLesionDiagnosisDateTextBox.sendKeys("04/04");
		rASSurveyPage.giantCellLesionDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.giantCellLesionYesRadioButton.click();
		rASSurveyPage.pigmentedVilonodulousFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.pigmentedVilonodulousFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.pigmentedVilonodulousDiagnosisDateTextBox.sendKeys("05/05");
		rASSurveyPage.pigmentedVilonodulousDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.pigmentedVilonodulousYesRadioButton.click();
		rASSurveyPage.papilomataFirstSymptomsDateTextBox.sendKeys("06/06");
		rASSurveyPage.papilomataFirstSymptomsAgeTextBox.sendKeys("16");
		rASSurveyPage.papilomataDiagnosisDateTextBox.sendKeys("07/07");
		rASSurveyPage.papilomataDiagnosisAgeTextBox.sendKeys("17");
		rASSurveyPage.papilomataYesRadioButton.click();
		rASSurveyPage.rhabdomyosarcomaFirstSymptomsDateTextBox.sendKeys("12/12");
		rASSurveyPage.rhabdomyosarcomaFirstSymptomsAgeTextBox.sendKeys("22");
		rASSurveyPage.rhabdomyosarcomaDiagnosisDateTextBox.sendKeys("13/13");
		rASSurveyPage.rhabdomyosarcomaDiagnosisAgeTextBox.sendKeys("23");
		rASSurveyPage.rhabdomyosarcomaYesRadioButton.click();
		rASSurveyPage.neuroblastomaFirstSymptomsDateTextBox.sendKeys("03/14");
		rASSurveyPage.neuroblastomaFirstSymptomsAgeTextBox.sendKeys("24");
		rASSurveyPage.neuroblastomaDiagnosisDateTextBox.sendKeys("04/15");
		rASSurveyPage.neuroblastomaDiagnosisAgeTextBox.sendKeys("25");
		rASSurveyPage.neuroblastomaYesRadioButton.click();
		rASSurveyPage.otherTumorDisorderFirstSymptomsDateTextBox.sendKeys("10/10");
		rASSurveyPage.otherTumorDisorderFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.otherTumorDisorderDiagnosisDateTextBox.sendKeys("11/11");
		rASSurveyPage.otherTumorDisorderDiagnosisAgeTextBox.sendKeys("21");
		rASSurveyPage.otherTumorDisorderYesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have a history of frequent infections \\(typically recurrent sinus infections or pneumonia) or immunodeficiency? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_a_history_of_frequent_infections_typically_recurrent_sinus_infections_or_pneumonia_or_immunodeficiency_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been evaluated by an immunologist or rheumatologist? These are physicians who specialize in the immune system and how it functions. They diagnose conditions such as lupus, autoimmune thyroiditis, and psoriasis. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_evaluated_by_an_immunologist_or_rheumatologist_These_are_physicians_who_specialize_in_the_immune_system_and_how_it_functions_They_diagnose_conditions_such_as_lupus_autoimmune_thyroiditis_and_psoriasis_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enter Name of Immunologist Physican {string} and enters Location {string} and enters Hospital {string} for Please provide the name of the immunologist\\/rheumatologist who completed your evaluation. page - myRAS Survey")
	public void enter_Name_of_immunologist_Physican_and_enters_Location_and_enters_Hospital_for_Please_provide_the_name_of_the_immunologist_rheumatologist_who_completed_your_evaluation_page_myRAS_Survey(
			String immunologistDoctor, String immunologistLocation, String immunologistHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianImmunologistTextBox);
		rASSurveyPage.nameOfPhysicianImmunologistTextBox.sendKeys(immunologistDoctor);
		rASSurveyPage.cityStateImmunologistTextBox.sendKeys(immunologistLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationImmunologistTextBox.sendKeys(immunologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All and enters for other infection frequency {string} for How would you describe infection frequency and your immune system? Please select all that apply. page - myRAS Survey")
	public void clicks_All_and_enters_for_other_infection_frequency_for_How_would_you_describe_infection_frequency_and_your_immune_system_Please_select_all_that_apply_page_myRAS_Survey(
			String otherInfectionFrequency) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherInfectionFrequency);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the immunodeficiencies listed. For each, please provide the date or age at which symptoms occurred and diagnosis \\(you do not need to include both age and date). If you do not recall details, please place an X in the Dont know column. If no treatment has been required, place None in the Treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_immunodeficiencies_listed_For_each_please_provide_the_date_or_age_at_which_symptoms_occurred_and_diagnosis_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_details_please_place_an_X_in_the_Dont_know_column_If_no_treatment_has_been_required_place_None_in_the_Treatment_column_Page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.frequentInfectionsNoFormalDiagnosisFirstSymptomsDateTextBox);
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisFirstSymptomsAgeTextBox.sendKeys("5");
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisDiagnosisDateTextBox.sendKeys("05/05");
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisDiagnosisAgeTextBox.sendKeys("5");
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisMedicationTypeTextBox.sendKeys("IBUPROFIN");
		rASSurveyPage.frequentInfectionsNoFormalDiagnosisAddressTextBox
				.sendKeys("GEORGE WASHINGTON UNIVERSITY HOSPITAL");
		rASSurveyPage.frequentInfectionsFormalDiagnosisFirstSymptomsDateTextBox.sendKeys("06/06");
		rASSurveyPage.frequentInfectionsFormalDiagnosisFirstSymptomsAgeTextBox.sendKeys("6");
		rASSurveyPage.frequentInfectionsFormalDiagnosisDiagnosisDateTextBox.sendKeys("07/07");
		rASSurveyPage.frequentInfectionsFormalDiagnosisDiagnosisAgeTextBox.sendKeys("7");
		rASSurveyPage.frequentInfectionsFormalDiagnosisMedicationTypeTextBox.sendKeys("NSAIDS");
		rASSurveyPage.frequentInfectionsFormalDiagnosisAddressTextBox.sendKeys("INOVA FAIRFAX HOSPITAL");
		rASSurveyPage.otherFrequentInfectionsFormalFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.otherFrequentInfectionsFormalFirstSymptomsAgeTextBox.sendKeys("7");
		rASSurveyPage.otherFrequentInfectionsFormalDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.otherFrequentInfectionsFormalDiagnosisAgeTextBox.sendKeys("8");
		rASSurveyPage.otherFrequentInfectionsFormalDiagnosisMedicationTypeTextBox.sendKeys("NAPROXEN");
		rASSurveyPage.otherFrequentInfectionsFormalDiagnosisAddressTextBox.sendKeys("DOCTOR ROCHELLE VIYA");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with an autoimmune disorder? An autoimmune disorder is when the immune system attacks the bodys own healthy tissues; can include Hashimoto thyroiditis, lupus, or autoimmune thrombocytopenia, etc. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_an_autoimmune_disorder_An_autoimmune_disorder_is_when_the_immune_system_attacks_the_bodys_own_healthy_tissues_can_include_Hashimoto_thyroiditis_lupus_or_autoimmune_thrombocytopenia_etc_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters autoimmune blood condition {string} and enters for other {string} for With what autoimmune disorder have you been diagnosed? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_autoimmune_blood_condition_and_enters_for_other_for_With_what_autoimmune_disorder_have_you_been_diagnosed_page_myRAS_Survey(
			String otherAutoimmuneCondition, String otherAutoimmuneBloodCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherAutomimmuneTextBox.sendKeys(otherAutoimmuneCondition);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherAutoimmuneBloodCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the autoimmune conditions listed below. Please provide the date or age when symptoms first occurred and diagnosis, you do not need to include both age and date. If you do not recall the details, please place an X in the Dont know box. If no treatment was required, please state None in the Treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_autoimmune_conditions_listed_below_Please_provide_the_date_or_age_when_symptoms_first_occurred_and_diagnosis_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_the_details_please_place_an_X_in_the_Dont_know_box_If_no_treatment_was_required_please_state_None_in_the_Treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.autoimmuneThyroiditisFirstSymptomsDateTextBox);
		rASSurveyPage.autoimmuneThyroiditisFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.autoimmuneThyroiditisFirstSymptomsAgeTextBox.sendKeys("5");
		rASSurveyPage.autoimmuneThyroiditisDiagnosisDateTextBox.sendKeys("06/06");
		rASSurveyPage.autoimmuneThyroiditisDiagnosisAgeTextBox.sendKeys("6");
		rASSurveyPage.autoimmuneThyroiditisMedicationTypeTextBox.sendKeys("MOTRIN");
		rASSurveyPage.autoimmuneThyroiditisAddressTextBox.sendKeys("DOCTOR LILY KING, INOVA FAIRFAX HOSPITAL, VA");
		rASSurveyPage.lupusFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.lupusFirstSymptomsAgeTextBox.sendKeys("7");
		rASSurveyPage.lupusDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.lupusDiagnosisAgeTextBox.sendKeys("8");
		rASSurveyPage.lupusMedicationTypeTextBox.sendKeys("NSAIDS");
		rASSurveyPage.lupusAddressTextBox.sendKeys("DOCTOR JOSE MORENO, GEORGE WASHINGTON UNIVERSITY HOSPITAL, DC");
		rASSurveyPage.psoriasisFirstSymptomsDateTextBox.sendKeys("09/09");
		rASSurveyPage.psoriasisFirstSymptomsAgeTextBox.sendKeys("9");
		rASSurveyPage.psoriasisDiagnosisDateTextBox.sendKeys("10/10");
		rASSurveyPage.psoriasisDiagnosisAgeTextBox.sendKeys("10");
		rASSurveyPage.psoriasisMedicationTypeTextBox.sendKeys("WYNZORA");
		rASSurveyPage.psoriasisAddressTextBox.sendKeys("DOCTOR FRAN WENZEL, SIBLEY MEMORIAL HOSPITAL, DC");
		rASSurveyPage.automimmuneBloodConditionFirstSymptomsDateTextBox.sendKeys("11/11");
		rASSurveyPage.automimmuneBloodConditionFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.automimmuneBloodConditionDiagnosisDateTextBox.sendKeys("12/12");
		rASSurveyPage.automimmuneBloodConditionDiagnosisAgeTextBox.sendKeys("13");
		rASSurveyPage.automimmuneBloodConditionMedicationTypeTextBox.sendKeys("PREDNISONE");
		rASSurveyPage.automimmuneBloodConditionAddressTextBox.sendKeys("DOCTOR YOKO ONO, SIBLEY MEMORIAL HOSPITAL, DC");
		rASSurveyPage.otherAutomimmuneBloodConditionFirstSymptomsDateTextBox.sendKeys("11/11");
		rASSurveyPage.otherAutomimmuneBloodConditionFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.otherAutomimmuneBloodConditionDiagnosisDateTextBox.sendKeys("12/12");
		rASSurveyPage.otherAutomimmuneBloodConditionDiagnosisAgeTextBox.sendKeys("13");
		rASSurveyPage.otherAutomimmuneBloodConditionMedicationTypeTextBox.sendKeys("XELIJANZ");
		rASSurveyPage.otherAutomimmuneBloodConditionAddressTextBox
				.sendKeys("DOCTOR JOHN LENNON, BRIDGEPOINT HOSPITAL CAPITOL HILL, DC");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about conditions associated with the central nervous system. The central nervous system includes the brain and spinal cord. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_conditions_associated_with_the_central_nervous_system_The_central_nervous_system_includes_the_brain_and_spinal_cord_page_myRAS_Survey() {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been evaluated by a neurologist or neurosurgeon? These are physicians who specialize in the brain and spinal cord. They diagnose conditions such as seizures, brain tumors, and brain malformations. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_evaluated_by_a_neurologist_or_neurosurgeon_These_are_physicians_who_specialize_in_the_brain_and_spinal_cord_They_diagnose_conditions_such_as_seizures_brain_tumors_and_brain_malformations_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Name of Neurologist Physican {string} and enters Location {string} and enters Hospital {string} for Please provide the information for the neurologist or neurosurgeon who completed your evaluation. page - myRAS Survey")
	public void enters_Name_of_neurologist_Physican_and_enters_Location_and_enters_Hospital_for_Please_provide_the_information_for_the_neurologist_or_neurosurgeon_who_completed_your_evaluation_page_myRAS_Survey(
			String neurologistDoctor, String neurologistLocation, String neurologistHospital) {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianNeurologistTextBox);
		rASSurveyPage.nameOfPhysicianNeurologistTextBox.sendKeys(neurologistDoctor);
		rASSurveyPage.cityStateNeurologistTextBox.sendKeys(neurologistLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationNeurologistTextBox.sendKeys(neurologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with a structural brain abnormality? Examples include Chiari one malformation, hydrocephalus, tethered spinal cord. These conditions are often diagnosed using a CT or MRI scan and evaluated by neurosurgeons. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_a_structural_brain_abnormality_Examples_include_Chiari_one_malformation_hydrocephalus_tethered_spinal_cord_These_conditions_are_often_diagnosed_using_a_CT_or_MRI_scan_and_evaluated_by_neurosurgeons_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters brain issue {string} for Have you ever been diagnosed with any of the following issues of the brain? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_brain_issue_for_Have_you_ever_been_diagnosed_with_any_of_the_following_issues_of_the_brain_Page_myRAS_Survey(
			String otherBrainIssue) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherBrainIssue);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the conditions listed. For each condition, please list either the date or age when the symptoms started and time of diagnosis \\(you do not need to include both age and date). If you do not recall, place an X in the Dont know column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_conditions_listed_For_each_condition_please_list_either_the_date_or_age_when_the_symptoms_started_and_time_of_diagnosis_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_place_an_X_in_the_Dont_know_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.chiariMalformationFirstSymptomsDateTextBox);
		rASSurveyPage.chiariMalformationFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.chiariMalformationFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.chiariMalformationDiagnosisDateTextBox.sendKeys("11/01");
		rASSurveyPage.chiariMalformationDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.chiariMalformationMedicationTypeTextBox.sendKeys("IBUPROPHIN AGE 12");
		rASSurveyPage.hydrocephalusFirstSymptomsDateTextBox.sendKeys("02/02");
		rASSurveyPage.hydrocephalusFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.hydrocephalusDiagnosisDateTextBox.sendKeys("12/02");
		rASSurveyPage.hydrocephalusDiagnosisAgeTextBox.sendKeys("13");
		rASSurveyPage.hydrocephalusMedicationTypeTextBox.sendKeys("SURGERY SHUNT AGE 13");
		rASSurveyPage.syringomyeliaFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.syringomyeliaFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.syringomyeliaDiagnosisDateTextBox.sendKeys("12/03");
		rASSurveyPage.syringomyeliaDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.syringomyeliaMedicationTypeTextBox.sendKeys("SURGERY SHUNT AGE 14");
		rASSurveyPage.tetheredFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.tetheredFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.tetheredDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.tetheredDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.tetheredMedicationTypeTextBox.sendKeys("TETHER CORD SURGERY 15");
		rASSurveyPage.corticalFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.corticalFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.corticalDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.corticalDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.corticalMedicationTypeTextBox.sendKeys("KETO DIET AGE 15");
		rASSurveyPage.otherNeurologicalFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.otherNeurologicalFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.otherNeurologicalDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.otherNeurologicalDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.otherNeurologicalMedicationTypeTextBox.sendKeys("VITAMIN SUPPLEMENT AGE 15");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Do you have a history of seizures page? page - myRAS Survey")
	public void clicks_YES_button_for_Do_you_have_a_history_of_seizures_page_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

	}

	@Given("clicks All that apply and enters seizure type {string} for Please select all seizure disorders for which you have been diagnosed. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_seizure_type_for_Please_select_all_seizure_disorders_for_which_you_have_been_diagnosed_page_myRAS_Survey(
			String otherSeizureType) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherSeizureType);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the conditions listed. For each condition, please include the age or date when symptoms occurred and when diagnosed \\(you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_conditions_listed_For_each_condition_please_include_the_age_or_date_when_symptoms_occurred_and_when_diagnosed_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_please_place_an_X_in_the_Dont_know_box_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.febrileFirstSymptomsDateTextBox);
		rASSurveyPage.febrileFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.febrileFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.febrileDiagnosisDateTextBox.sendKeys("11/01");
		rASSurveyPage.febrileDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.febrileMedicationTypeTextBox.sendKeys("RECTAL DIAZEPAM AGE 12");
		rASSurveyPage.epilepsyResolvedFirstSymptomsDateTextBox.sendKeys("02/02");
		rASSurveyPage.epilepsyResolvedFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.epilepsyResolvedDiagnosisDateTextBox.sendKeys("12/02");
		rASSurveyPage.epilepsyResolvedDiagnosisAgeTextBox.sendKeys("13");
		rASSurveyPage.epilepsyResolvedMedicationTypeTextBox.sendKeys("PHENYTOIN AGE 13");
		rASSurveyPage.epilepsyOngoingFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.epilepsyOngoingFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.epilepsyOngoingDiagnosisDateTextBox.sendKeys("12/03");
		rASSurveyPage.epilepsyOngoingDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.epilepsyOngoingMedicationTypeTextBox.sendKeys("LAMOTRIGINE AGE 14");
		rASSurveyPage.seizuresUncontrolledFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.seizuresUncontrolledFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.seizuresUncontrolledDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.seizuresUncontrolledDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.seizuresUncontrolledMedicationTypeTextBox.sendKeys("TOPIRAMATE 15");
		rASSurveyPage.otherEpilepsyFirstSymptomsDateTextBox.sendKeys("04/04");
		rASSurveyPage.otherEpilepsyFirstSymptomsAgeTextBox.sendKeys("14");
		rASSurveyPage.otherEpilepsyDiagnosisDateTextBox.sendKeys("12/04");
		rASSurveyPage.otherEpilepsyDiagnosisAgeTextBox.sendKeys("15");
		rASSurveyPage.otherEpilepsyMedicationTypeTextBox.sendKeys("PHENOBARBITAL AGE 15");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been evaluated by a psychiatrist, psychologist or behavioral pediatrician? These medical providers often diagnose conditions such as depression, anxiety, learning difficulties, and developmental disorders. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_evaluated_by_a_psychiatrist_psychologist_or_behavioral_pediatrician_These_medical_providers_often_diagnose_conditions_such_as_depression_anxiety_learning_difficulties_and_developmental_disorders_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters Name of Behavioral Physican {string} and enters Location {string} and enters hospital {string} for Please provide the information listed below for the medical providers who completed your evaluation. page - myRAS Survey")
	public void enters_Name_of_behavioral_Physican_and_enters_Location_and_enters_hospital_for_Please_provide_the_information_listed_below_for_the_medical_providers_who_completed_your_evaluation_page_myRAS_Survey(
			String behavioralDoctor, String behavioralLocation, String behavioralHospital) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nameOfPhysicianPsychologistTextBox);
		rASSurveyPage.nameOfPhysicianPsychologistTextBox.sendKeys(behavioralDoctor);
		rASSurveyPage.cityStatePsychologistTextBox.sendKeys(behavioralLocation);
		rASSurveyPage.hospitalOrMedicalCenterAffiliationPsychologistTextBox.sendKeys(behavioralHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with a behavioral or psychiatric condition? Examples include mood disorders \\(depression), self-harm acts, anxiety, bipolar disorder, autism spectrum disorder, aggression. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_a_behavioral_or_psychiatric_condition_Examples_include_mood_disorders_depression_self_harm_acts_anxiety_bipolar_disorder_autism_spectrum_disorder_aggression_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other behaviorial condition {string} for Have you ever been diagnosed with a behavioral or psychiatric condition? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_behaviorial_condition_for_Have_you_ever_been_diagnosed_with_a_behavioral_or_psychiatric_condition_page_myRAS_Survey(
			String otherBehavorialCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherBehavorialCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the diagnosed behavioral and\\/or psychiatric conditions listed. For each condition, please list the date or age of symptom onset and diagnosis \\(you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. If no treatment was required, place None in the Treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_diagnosed_behavioral_and_or_psychiatric_conditions_listed_For_each_condition_please_list_the_date_or_age_of_symptom_onset_and_diagnosis_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_please_place_an_X_in_the_Dont_know_box_If_no_treatment_was_required_place_None_in_the_Treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.autismFirstSymptomsDateTextBox);
		rASSurveyPage.autismFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.autismFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.autismDiagnosisDateTextBox.sendKeys("11/01");
		rASSurveyPage.autismDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.autismTreatmentTextBox.sendKeys("RISPERIDONE");
		rASSurveyPage.schizophreniaFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.schizophreniaFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.schizophreniaDiagnosisDateTextBox.sendKeys("04/04");
		rASSurveyPage.schizophreniaDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.schizophreniaTreatmentTextBox.sendKeys("CLOZAPINE");
		rASSurveyPage.bipolarFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.bipolarFirstSymptomsAgeTextBox.sendKeys("15");
		rASSurveyPage.bipolarDiagnosisDateTextBox.sendKeys("06/06");
		rASSurveyPage.bipolarDiagnosisAgeTextBox.sendKeys("17");
		rASSurveyPage.bipolarTreatmentTextBox.sendKeys("LITHIUM");
		rASSurveyPage.anxietyFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.anxietyFirstSymptomsAgeTextBox.sendKeys("18");
		rASSurveyPage.anxietyDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.anxietyDiagnosisAgeTextBox.sendKeys("18");
		rASSurveyPage.anxietyTreatmentTextBox.sendKeys("PROZAC");
		rASSurveyPage.moodProblemsFirstSymptomsDateTextBox.sendKeys("09/09");
		rASSurveyPage.moodProblemsFirstSymptomsAgeTextBox.sendKeys("19");
		rASSurveyPage.moodProblemsDiagnosisDateTextBox.sendKeys("10/10");
		rASSurveyPage.moodProblemsDiagnosisAgeTextBox.sendKeys("20");
		rASSurveyPage.moodProblemsTreatmentTextBox.sendKeys("ZOLOFT");
		rASSurveyPage.obsessionsFirstSymptomsDateTextBox.sendKeys("12/11");
		rASSurveyPage.obsessionsFirstSymptomsAgeTextBox.sendKeys("21");
		rASSurveyPage.obsessionsDiagnosisDateTextBox.sendKeys("12/12");
		rASSurveyPage.obsessionsDiagnosisAgeTextBox.sendKeys("22");
		rASSurveyPage.obsessionsTreatmentTextBox.sendKeys("THERAPY");
		rASSurveyPage.ptsdFirstSymptomsDateTextBox.sendKeys("03/13");
		rASSurveyPage.ptsdFirstSymptomsAgeTextBox.sendKeys("24");
		rASSurveyPage.ptsdDiagnosisDateTextBox.sendKeys("11/14");
		rASSurveyPage.ptsdDiagnosisAgeTextBox.sendKeys("25");
		rASSurveyPage.ptsdTreatmentTextBox.sendKeys("THERAPY");
		rASSurveyPage.selfHarmFirstSymptomsDateTextBox.sendKeys("05/15");
		rASSurveyPage.selfHarmFirstSymptomsAgeTextBox.sendKeys("26");
		rASSurveyPage.selfHarmDiagnosisDateTextBox.sendKeys("08/16");
		rASSurveyPage.selfHarmDiagnosisAgeTextBox.sendKeys("28");
		rASSurveyPage.selfHarmTreatmentTextBox.sendKeys("PSYCHIATRIC ASSERTIVE COMMUNITY TREATMENT");
		rASSurveyPage.agressionFirstSymptomsDateTextBox.sendKeys("05/16");
		rASSurveyPage.agressionFirstSymptomsAgeTextBox.sendKeys("28");
		rASSurveyPage.agressionDiagnosisDateTextBox.sendKeys("08/17");
		rASSurveyPage.agressionDiagnosisAgeTextBox.sendKeys("29");
		rASSurveyPage.agressionTreatmentTextBox.sendKeys("THERAPY");
		rASSurveyPage.otherBehavioralFirstSymptomsDateTextBox.sendKeys("02/18");
		rASSurveyPage.otherBehavioralFirstSymptomsAgeTextBox.sendKeys("30");
		rASSurveyPage.otherBehavioralDiagnosisDateTextBox.sendKeys("01/19");
		rASSurveyPage.otherBehavioralDiagnosisAgeTextBox.sendKeys("31");
		rASSurveyPage.otherBehavioralTreatmentTextBox.sendKeys("SPECIAL EDUCATION CLASSES");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters neurologic conditions and enters other neurologic condition {string} for Please list and describe any additional neurologic conditions here that were not covered by the previous questions. page - myRAS Survey")
	public void enters_neurologic_conditions_and_enters_other_neurologic_condition_for_Please_list_and_describe_any_additional_neurologic_conditions_here_that_were_not_covered_by_the_previous_questions__page_myRAS_Survey(
			String otherNeurologicCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.additionalNeurologicConditionsTextBox);
		rASSurveyPage.additionalNeurologicConditionsTextBox.sendKeys(otherNeurologicCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button for The next set of questions ask about vision and hearing page. page - myRAS Survey")
	public void clicks_Next_button_for_The_next_set_of_questions_ask_about_vision_and_hearing_page_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever been diagnosed with ptosis \\(droopiness of the upper eyelid)? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_been_diagnosed_with_ptosis_droopiness_of_the_upper_eyelid_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Did you require treatment for ptosis? page - myRAS Survey")
	public void clicks_YES_button_for_Did_you_require_treatment_for_ptosis_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever had any issues with your vision or eyesight? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_had_any_issues_with_your_vision_or_eyesight_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters for other vision condition {string} for Please select all the vision\\/eyesight conditions for which you have been diagnosed. page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_for_other_vision_condition_for_Please_select_all_the_vision_eyesight_conditions_for_which_you_have_been_diagnosed__page_myRAS_Survey(
			String otherVisionCondition) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherVisionCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first started and when the diagnosis was made you do not need to include both date and age. If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey")
	public void enters_All_details_for_Please_complete_the_table_below_for_each_of_the_conditions_listed_For_each_condition_please_list_the_age_or_date_when_symptoms_first_started_and_when_the_diagnosis_was_made_you_do_not_need_to_include_both_date_and_age_If_you_do_not_recall_place_an_X_in_the_Dont_know_column_If_no_treatment_was_required_place_None_in_the_Treatment_column_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.neurologicalVisualFirstSymptomsDateTextBox);
		rASSurveyPage.neurologicalVisualFirstSymptomsDateTextBox.sendKeys("01/01");
		rASSurveyPage.neurologicalVisualFirstSymptomsAgeTextBox.sendKeys("11");
		rASSurveyPage.neurologicalVisualDiagnosisDateTextBox.sendKeys("11/01");
		rASSurveyPage.neurologicalVisualDiagnosisAgeTextBox.sendKeys("12");
		rASSurveyPage.neurologicalVisualTreatmentTextBox.sendKeys("LUMBAR PUNCTURE");
		rASSurveyPage.nearsightednessFirstSymptomsDateTextBox.sendKeys("03/03");
		rASSurveyPage.nearsightednessFirstSymptomsAgeTextBox.sendKeys("13");
		rASSurveyPage.nearsightednessDiagnosisDateTextBox.sendKeys("04/04");
		rASSurveyPage.nearsightednessDiagnosisAgeTextBox.sendKeys("14");
		rASSurveyPage.nearsightednessTreatmentTextBox.sendKeys("LASER IN-SITU KERATOMILEUSIS");
		rASSurveyPage.farsightednessFirstSymptomsDateTextBox.sendKeys("05/05");
		rASSurveyPage.farsightednessFirstSymptomsAgeTextBox.sendKeys("15");
		rASSurveyPage.farsightednessDiagnosisDateTextBox.sendKeys("06/06");
		rASSurveyPage.farsightednessDiagnosisAgeTextBox.sendKeys("16");
		rASSurveyPage.farsightednessTreatmentTextBox.sendKeys("PHOTOREFRACTIVE KERATECTOMY");
		rASSurveyPage.astigmatismFirstSymptomsDateTextBox.sendKeys("07/07");
		rASSurveyPage.astigmatismFirstSymptomsAgeTextBox.sendKeys("17");
		rASSurveyPage.astigmatismDiagnosisDateTextBox.sendKeys("08/08");
		rASSurveyPage.astigmatismDiagnosisAgeTextBox.sendKeys("18");
		rASSurveyPage.astigmatismTreatmentTextBox.sendKeys("LASER EPITHELIAL KERTOMILEUSIS");
		rASSurveyPage.amblyopiaFirstSymptomsDateTextBox.sendKeys("09/09");
		rASSurveyPage.amblyopiaFirstSymptomsAgeTextBox.sendKeys("19");
		rASSurveyPage.amblyopiaDiagnosisDateTextBox.sendKeys("10/10");
		rASSurveyPage.amblyopiaDiagnosisAgeTextBox.sendKeys("20");
		rASSurveyPage.amblyopiaTreatmentTextBox.sendKeys("LASER THERMAL KERATOPLASTY");
		rASSurveyPage.otherEyeSightFirstSymptomsDateTextBox.sendKeys("11/11");
		rASSurveyPage.otherEyeSightFirstSymptomsAgeTextBox.sendKeys("21");
		rASSurveyPage.otherEyeSightDiagnosisDateTextBox.sendKeys("12/12");
		rASSurveyPage.otherEyeSightDiagnosisAgeTextBox.sendKeys("22");
		rASSurveyPage.otherEyeSightMedicationTypeTextBox.sendKeys("LOWER INTRAOCULAR PRESSURE");
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever experienced strabismus? Strabismus is when the eyes are not aligned properly; one may wander up, down or sideways. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_experienced_strabismus_Strabismus_is_when_the_eyes_are_not_aligned_properly_one_may_wander_up_down_or_sideways_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters strabismus first symptoms date {string} and enters age {string} and enters diagnosis date {string} and enters age {string} and clicks occlusion treatment for Please complete the table below regarding strabismus. Please list the age or date when symptoms first started and when the diagnosis was made \\(you do not need to include both date and age). If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey")
	public void enters_strabismus_first_symptoms_date_and_enters_age_and_enters_diagnosis_date_and_enters_age_and_clicks_occlusion_treatment_for_Please_complete_the_table_below_regarding_strabismus_Please_list_the_age_or_date_when_symptoms_first_started_and_when_the_diagnosis_was_made_you_do_not_need_to_include_both_date_and_age_If_you_do_not_recall_place_an_X_in_the_Dont_know_column_If_no_treatment_was_required_place_None_in_the_Treatment_column_page_myRAS_Survey(
			String strabismusFirstSymptomsDate, String strabismusFirstSymptomsAge, String strabismusDiagnosisDate,
			String strabismusDiagnosisAge) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.strabismusFirstSymptomsDateTextBox);
		rASSurveyPage.strabismusFirstSymptomsDateTextBox.sendKeys(strabismusFirstSymptomsDate);
		rASSurveyPage.strabismusFirstSymptomsAgeTextBox.sendKeys(strabismusFirstSymptomsAge);
		rASSurveyPage.strabismusDiagnosisDateTextBox.sendKeys(strabismusDiagnosisDate);
		rASSurveyPage.strabismusDiagnosisAgeTextBox.sendKeys(strabismusDiagnosisAge);
		rASSurveyPage.occlusionTreatmentTextBox.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you ever experienced nystagmus? Nystagmus is when the eye makes sudden, uncontrolled movements, like tremors. page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_ever_experienced_nystagmus_Nystagmus_is_when_the_eye_makes_sudden_uncontrolled_movements_like_tremors_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters nystagmus first symptoms date {string} and enters age {string} and enters diagnosis date {string} and enters age {string} and clicks yes treatment mild shorterm severity for Please complete the table below regarding nystagmus. Please include the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. page - myRAS Survey")
	public void enters_nystagmus_first_symptoms_date_and_enters_age_and_enters_diagnosis_date_and_enters_age_and_clicks_yes_treatment_mild_shorterm_severity_for_Please_complete_the_table_below_regarding_nystagmus_Please_include_the_age_or_date_when_symptoms_first_occurred_and_when_the_diagnosis_was_made_you_do_not_need_to_include_both_age_and_date_page_myRAS_Survey(
			String nystagmusFirstSymptomsDate, String nystagmusFirstSymptomsAge, String nystagmusDiagnosisDate,
			String nystagmusDiagnosisAge) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.nystagmusFirstSymptomsDateTextBox);
		rASSurveyPage.nystagmusFirstSymptomsDateTextBox.sendKeys(nystagmusFirstSymptomsDate);
		rASSurveyPage.nystagmusFirstSymptomsAgeTextBox.sendKeys(nystagmusFirstSymptomsAge);
		rASSurveyPage.nystagmusDiagnosisDateTextBox.sendKeys(nystagmusDiagnosisDate);
		rASSurveyPage.nystagmusDiagnosisAgeTextBox.sendKeys(nystagmusDiagnosisAge);
		rASSurveyPage.yesNystagmusTreatmentRadioButton.click();
		rASSurveyPage.mildNystagmusRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks YES button for Have you experienced hearing loss? page - myRAS Survey")
	public void clicks_YES_button_for_Have_you_experienced_hearing_loss_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks All that apply and enters other hearing loss {string} for Have you experienced any of the following types of hearing loss? page - myRAS Survey")
	public void clicks_All_that_apply_and_enters_other_hearing_loss_for_Have_you_experienced_any_of_the_following_types_of_hearing_loss_page_myRAS_Survey(
			String otherHearingLoss) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes("Unsure/Unknown");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherHearingLoss);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters for other hearing loss {string} and clicks YES for all treatment and enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. If you do not recall the details, place an X in the Dont know column. page - myRAS Survey")
	public void enters_for_other_hearing_loss_and_clicks_YES_for_all_treatment_and_enters_All_details_for_Please_complete_the_table_below_for_each_of_the_conditions_listed_For_each_condition_please_list_the_age_or_date_when_symptoms_first_occurred_and_when_the_diagnosis_was_made_you_do_not_need_to_include_both_age_and_date_If_you_do_not_recall_the_details_place_an_X_in_the_Dont_know_column_page_myRAS_Survey(
			String string) {

		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.sensorineuralFirstSymptomsDateTextBox);
		rASSurveyPage.sensorineuralFirstSymptomsDateTextBox.sendKeys("04/08");
		rASSurveyPage.sensorineuralFirstSymptomsAgeTextBox.sendKeys("24");
		rASSurveyPage.sensorineuralDiagnosisDateTextBox.sendKeys("05/10");
		rASSurveyPage.sensorineuralDiagnosisAgeTextBox.sendKeys("25");
		rASSurveyPage.yesSensorineuralTreatmentRadioButton.click();

		rASSurveyPage.conductiveFirstSymptomsDateTextBox.sendKeys("04/09");
		rASSurveyPage.conductiveFirstSymptomsAgeTextBox.sendKeys("12");
		rASSurveyPage.conductiveDiagnosisDateTextBox.sendKeys("01/11");
		rASSurveyPage.conductiveDiagnosisAgeTextBox.sendKeys("26");
		rASSurveyPage.yesConductiveTreatmentRadioButton.click();

		MiscUtils.sleep(800);
		rASSurveyPage.mixedFirstSymptomsDateTextBox.sendKeys("02/04");
		rASSurveyPage.mixedFirstSymptomsAgeTextBox.sendKeys("67");
		rASSurveyPage.mixedDiagnosisDateTextBox.sendKeys("04/03");
		rASSurveyPage.mixedDiagnosisAgeTextBox.sendKeys("19");
		rASSurveyPage.yesMixedTreatmentRadioButton.click();

		rASSurveyPage.unsureHearingLossFirstSymptomsDateTextBox.sendKeys("03/11");
		rASSurveyPage.unsureHearingLossFirstSymptomsAgeTextBox.sendKeys("24");
		rASSurveyPage.unsureHearingLossDiagnosisDateTextBox.sendKeys("05/11");
		rASSurveyPage.unsureHearingLossDiagnosisAgeTextBox.sendKeys("27");
		rASSurveyPage.yesUnsureHearingLossTreatmentRadioButton.click();

		rASSurveyPage.otherHearingLossTextBox.sendKeys("SEVERE HEARING LOSS");
		rASSurveyPage.otherHearingLossFirstSymptomsDateTextBox.sendKeys("05/12");
		rASSurveyPage.otherHearingLossFirstSymptomsAgeTextBox.sendKeys("25");
		rASSurveyPage.otherHearingLossDiagnosisDateTextBox.sendKeys("06/13");
		rASSurveyPage.otherHearingLossDiagnosisAgeTextBox.sendKeys("26");
		rASSurveyPage.yesOtherTreatmentRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("select All that apply and enters other ear issue {string} for Do you have any of the following issues with your ears? page - myRAS Survey")
	public void select_All_that_apply_and_enters_other_ear_issue_for_Do_you_have_any_of_the_following_issues_with_your_ears_page_myRAS_Survey(
			String otherEarIssues) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxesAnd("Unsure/Unknown", "No known ear issues");
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherEarIssues);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("enters other health issue {string} for If there are any other health issues present that have not been captured by this survey page. page - myRAS Survey")
	public void enters_other_health_issue_for_If_there_are_any_other_health_issues_present_that_have_not_been_captured_by_this_survey_page__page_myRAS_Survey(
			String otherHealthIssues) {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		rASSurveyPage.anyOtherHealthIssuesTextBox.sendKeys(otherHealthIssues);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	@Given("clicks Next button to end survey for You are almost done! To submit your responses, you must continue in the questionnaire by clicking the forward arrow below. The information you have provided will be reviewed by our study team. In the meantime, you should receive an email confirming this submission. page - myRAS Survey")
	public void clicks_Next_button_to_end_survey_for_You_are_almost_done_To_submit_your_responses_you_must_continue_in_the_questionnaire_by_clicking_the_forward_arrow_below_The_information_you_have_provided_will_be_reviewed_by_our_study_team_In_the_meantime_you_should_receive_an_email_confirming_this_submission_page_myRAS_Survey() {

		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		// rASSurveyPage.surveyNextButton.click();
		MiscUtils.sleep(2000);
	}

	/**
	 * BEGINNING OF RAS SURVEY AUTOMATION INTEGRATION (NOT QUALTRICS PREVIEW)
	 */

	@Given("clicks on the RAS Survey to begin the RAS Survey")
	public void clicks_on_the_RAS_Survey_to_begin_the_RAS_Survey() {

		CommonUtils.waitForVisibility(myRASHomePage.warningAgreeButton);
		myRASHomePage.warningAgreeButton.click();

		CommonUtils.waitForVisibility(myRASHomePage.rasSurvey);
		myRASHomePage.rasSurvey.click();

	}

	static String rasSurveyPin;

	@Given("enters Okta email address and One Time Pin code to proceed with the RAS Survey")
	public void enters_Okta_email_address_and_One_Time_Pin_code_to_proceed_with_the_RAS_Survey() {

		/**
		 * USING SAME PIN TEXT AND GO BUTTON LOCATORS AS CGB IIQ SINCE THEY ARE THE SAME
		 */
		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

		rasSurveyPin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
		myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.cHARMSEmailLogIn);
		rASSurveyPage.cHARMSEmailLogIn.sendKeys("charmsras4@yahoo.com");
		rASSurveyPage.cHARMSpasswordToLogIn.sendKeys(rasSurveyPin);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
	}

	/**
	 * END OF RAS SURVEY AUTOMATION INTEGRATION (NOT QUALTRICS PREVIEW)
	 */

}
