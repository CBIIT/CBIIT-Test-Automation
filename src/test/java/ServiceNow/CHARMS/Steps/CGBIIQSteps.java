package ServiceNow.CHARMS.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

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

public class CGBIIQSteps extends PageInitializer {
	
	/*
	 * 
	 * DONT DELETE UNUSED STEPS!!!!
	 */
	@Given("the user is redirected to the log in page of the Individual Information Questionnaire")
	public void the_user_is_redirected_to_the_log_in_page_of_the_Individual_Information_Questionnaire() throws TestingException {
		//WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CGBIIQ"));		
	}

	/** This closes mobile view, switches frame to the desktop view and enters email */
	@When("types the email address in the textbook labeled Email")
	public void types_the_email_address_in_the_textbook_labeled_Email() {
		//JavascriptUtils.clickByJS(cGBIIQPages.mobileViewSlider);
		//CommonUtils.switchToFrame(cGBIIQPages.desktopFrame);
		//cGBIIQPages.loginEmail.sendKeys("sonika34@test.com");	
	}

	@When("types the One-time pin in the textbook labeled One Time pin")
	public void types_the_One_time_pin_in_the_textbook_labeled_One_Time_pin() {		
		//cGBIIQPages.oneTimePin.sendKeys("123456");
		//CucumberLogUtils.logScreenShot();
		//MiscUtils.sleep(2000);
		//JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		//JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		
		//cGBIIQPages.nextButton.click();
		//MiscUtils.sleep(2000);
	}

	@When("on the CGB Statement of Confidentiality page clicks next arrow button")
	public void on_the_CGB_Statement_of_Confidentiality_page_clicks_next_arrow_button() {	
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);		
		cGBIIQPages.nextButton.click();
	}

	@When("on the CGB Instructions page clicks next arrow button")
	public void on_the_CGB_Instructions_page_clicks_next_arrow_button() {	
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);	
		cGBIIQPages.nextButton.click();
	}

	@When("on the General Background Information section of IIQ Survey page clicks next arrow button")
	public void on_the_General_Background_Information_section_of_IIQ_Survey_page_clicks_next_arrow_button() {	
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
	}

	@When("selects the radio button labelled I am completing this form for someone else")
	public void selects_the_radio_button_labelled_I_am_completing_this_form_for_someone_else() {	
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.completingForSomeoneElseRadioButton);
		cGBIIQPages.completingForSomeoneElseRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
	}

	@When("fills out the participant {string} for whom the user is completing the IIQ form.")
	public void fills_out_the_participant_for_whom_the_user_is_completing_the_IIQ_form(String probandName) {		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandsName);
		cGBIIQPages.probandsName.sendKeys(probandName);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
	}

	@When("selects Female as the biological sex of the participant assigned at birth")
	public void selects_as_the_biological_sex_of_the_participant_assigned_at_birth() {		
		MiscUtils.sleep(1500);
		CommonUtils.waitForVisibility(cGBIIQPages.probandFemaleSex);
		cGBIIQPages.probandFemaleSex.click();		
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects for which Sex the participant is identified")
	public void selects_for_which_the_participant_is_identified() {	
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandFemaleSex);
		cGBIIQPages.probandFemaleSex.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects what the participant is considered to be")
	public void selects_what_the_participant_is_to_be() {		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandsHispanicEthnicity);
		cGBIIQPages.probandsHispanicEthnicity.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects the Race of the participant")
	public void selects_the_of_the_participant() {		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandsWhiteRace);
		cGBIIQPages.probandsWhiteRace.click();	
		cGBIIQPages.probandsBlackRace.click();	
		cGBIIQPages.probandsNativeHawaiianRace.click();	
		cGBIIQPages.probandsAmericanIndianRace.click();	
		cGBIIQPages.probandsAsianRace.click();	
		cGBIIQPages.probandsOtherRace.click();	
		cGBIIQPages.probandsOtherRaceTextbox.sendKeys("Other Race");
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects if the participant is from the Ashkenazi Eastern European JewishDescent")
	public void selects_if_the_participant_is_from_the_Ashkenazi_Eastern_European_JewishDescent() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects if the participant is Adopted")
	public void selects_if_the_participant_is_Adopted() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
	}

	@When("selects Yes for the participant raised by someone other than their biological parent")
	public void selects_for_the_participant_raised_by_someone_other_than_their_biological_blood_parent() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
	}

	@When("adds Information regarding individuals who raised the participant {string},{string}")
	public void adds_Information_regarding_individuals_who_raised_the_participant(String nameOfGuardian, String relationshipOfGuardian) {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.guardianName);
		cGBIIQPages.guardianName.sendKeys(nameOfGuardian);
		cGBIIQPages.guardianRelationshipToProband.sendKeys(relationshipOfGuardian);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
	}

	@When("adds the participant DOB in MMDDYYYY format")
	public void adds_the_participant_DOB_in_MMDDYYYY_format() {
		
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandsDOBDay);
		cGBIIQPages.probandsDOBDay.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
		
	}

	@When("adds the Demographic information of the participant {string}, {string}, {string}")
	public void adds_the_Demographic_information_of_the_participant_or(String City, String State, String Country) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandCity);
		cGBIIQPages.probandCity.sendKeys(City);
		cGBIIQPages.probandState.sendKeys(State);
		cGBIIQPages.probandCountry.sendKeys(Country);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
	}

	@When("selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY")
	public void selects_the_participant_Biological_Mothers_Ancestral_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.multipleAnswers.get(1));
		cGBIIQPages.multipleAnswers.get(1).click();
		cGBIIQPages.multipleAnswers.get(2).click();
		cGBIIQPages.multipleAnswers.get(3).click();
		cGBIIQPages.multipleAnswers.get(4).click();
		cGBIIQPages.multipleAnswers.get(5).click();
		cGBIIQPages.multipleAnswers.get(6).click();
		cGBIIQPages.multipleAnswers.get(7).click();
		cGBIIQPages.multipleAnswers.get(8).click();
		cGBIIQPages.multipleAnswers.get(9).click();
		cGBIIQPages.multipleAnswers.get(10).click();
		cGBIIQPages.multipleAnswers.get(11).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
	}
	
	@When("selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY")
	public void selects_the_participant_Biological_Fathers_Ancestral_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.multipleAnswers.get(1));
		cGBIIQPages.multipleAnswers.get(1).click();
		cGBIIQPages.multipleAnswers.get(2).click();
		cGBIIQPages.multipleAnswers.get(7).click();
		cGBIIQPages.multipleAnswers.get(8).click();
		cGBIIQPages.multipleAnswers.get(9).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		
	}
	
	@When("selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY")
	public void selects_the_participant_Familys_Religious_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.multipleAnswers.get(1));
		cGBIIQPages.multipleAnswers.get(1).click();
		cGBIIQPages.multipleAnswers.get(2).click();
		cGBIIQPages.multipleAnswers.get(4).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects the participant Current Marital Status")
	public void selects_the_participant_Current_Marital_Status() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.marriedMaritalStatus);
		cGBIIQPages.marriedMaritalStatus.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("adds the participant {string}")
	public void adds_the_participant_or_select_the_option(String Occupation) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandsOccupation);
		cGBIIQPages.probandsOccupation.click();	
		cGBIIQPages.probandsOccupationTextBox.sendKeys(Occupation);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects if the participant currently have health insurance?")
	public void selects_if_the_participant_currently_have_health_insurance() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		MiscUtils.sleep(1000);		
	}

	@When("selects the total combined yearly income for all the persons in participant household")
	public void selects_the_total_combined_yearly_income_for_all_the_persons_in_participant_household() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.householdIncome);
		cGBIIQPages.householdIncome.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		MiscUtils.sleep(1000);		
	}

	@When("selects the highest level of schooling participant has completed")
	public void selects_the_highest_level_of_schooling_participant_has_completed() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.educationLevel);
		cGBIIQPages.educationLevel.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("on the medical history section of IIQ Survey page clicks on the forward arrow button")
	public void on_the_medical_history_section_of_IIQ_Survey_page_clicks_on_the_forward_arrow_button() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("the user selects if the participant conceived using in vitro fertilization IVF")
	public void the_user_selects_if_the_participant_conceived_using_in_vitro_fertilization_IVF() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects if the participant conceived through a donor egg or sperm")
	public void selects_if_the_participant_conceived_through_a_donor_egg_or_sperm() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.conceivedBySpermAndEggDonation);
		cGBIIQPages.conceivedBySpermAndEggDonation.click();	
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects if the participant Preimplantation Genetic Diagnosis PGD used")
	public void selects_if_the_participant_Preimplantation_Genetic_Diagnosis_PGD_used() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects option Yes if the participant is a twin or multiple birth")
	public void selects_option_Yes_if_the_participant_is_a_twin_or_multiple_birth() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects the option Twin for what type of birth was the participant")
	public void selects_the_option_Twin_for_what_type_of_birth_was_the_participant() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.probandTwinBirth);
		cGBIIQPages.probandTwinBirth.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects whether the participant have a fraternal or identical twin")
	public void selects_whether_the_participant_have_a_fraternal_or_identical_twin() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.fraternalTwinValue);
		cGBIIQPages.fraternalTwinValue.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("adds the information for the names of the children in the twin or multiple birth {string},{string},{string},{string}")
	public void adds_the_information_for_the_names_of_the_children_in_the_twin_or_multiple_birth(String Twin, String SiblingFirstName, String SiblingLastInitial, String RelationshipToProband) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.siblingBirthTypeDropdown);
		CommonUtils.selectDropDownValue(Twin, cGBIIQPages.siblingBirthTypeDropdown);
		cGBIIQPages.siblingFirstName.sendKeys(SiblingFirstName);
		CommonUtils.selectDropDownValue(SiblingLastInitial, cGBIIQPages.siblingLastNameInitial);
		CommonUtils.selectDropDownValue(RelationshipToProband, cGBIIQPages.siblingRelationshipToProband);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects the option Yes for the participants biological parents blood-related to each other")
	public void selects_the_option_Yes_for_the_participants_biological_parents_blood_related_to_each_other() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("adds {string} of the participant how the biological parents blood-related to each other")
	public void adds_of_the_participant_how_the_biological_parents_blood_related_to_each_other(String RelationshipBetweenParents) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.parentsRelationshipToEachotherRadioButton);
		cGBIIQPages.parentsRelationshipToEachotherRadioButton.click();	
		cGBIIQPages.parentsRelationshipToEachotherTextBox.sendKeys(RelationshipBetweenParents);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects how was the participant born")
	public void selects_how_was_the_participant_born() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.fullTermBirth);
		cGBIIQPages.fullTermBirth.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("adds the participants birth {string}, {string} and {string} Numerical Value and {string}, {string} and {string} for Unit Of Measure")
	public void adds_the_participants_birth_and_Numerical_Value_and_and_for_Unit_Of_Measure(String NumericalWeight, String NumericalLength, String NumericalHeadCircumference, String UnitMeasurementWeight, String UnitMeasurementLength, String UnitMeasurementHeadCircumference) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.numericalWeight);
		cGBIIQPages.numericalWeight.sendKeys(NumericalWeight);
		cGBIIQPages.numericalLength.sendKeys(NumericalLength);
		cGBIIQPages.numericalHeadCircumference.sendKeys(NumericalHeadCircumference);
		CommonUtils.selectDropDownValue(UnitMeasurementWeight, cGBIIQPages.unitOfMeasurementWeight);
		CommonUtils.selectDropDownValue(UnitMeasurementLength, cGBIIQPages.unitOfMeasurementLength);
		CommonUtils.selectDropDownValue(UnitMeasurementHeadCircumference, cGBIIQPages.unitOfMeasurementHeadCircumference);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		MiscUtils.sleep(1000);		
	}

	@When("the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page")
	public void the_user_clicks_the_forward_arrow_on_the_cancer_and_benign_tumor_history_section_of_IIQ_Survey_page() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor")
	public void the_user_selects_option_Yes_if_participant_ever_been_diagnosed_with_any_cancer_and_or_benign_tumor() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("selects or adds the primary cancers or benign tumors that have been diagnosed")
	public void selects_or_adds_the_primary_cancers_or_benign_tumors_that_have_been_diagnosed() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.cancerBenignTumorAdrenalGlandValue);
		cGBIIQPages.cancerBenignTumorAdrenalGlandValue.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("adds primary cancer or tumor information {string},{string},{string},{string} and selects what kind of the treatment received")
	public void adds_primary_cancer_or_tumor_information_and_selects_what_kind_of_the_treatment_received(String DateOfDiagnosisInYears, String AgeOfDiagnosisInYears, String NameAndAddressOfDiagnosisFacility, String NameAndAddressOfTreatingFacility) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.dateOfDiagnosisInYears);
		cGBIIQPages.dateOfDiagnosisInYears.click();	
		cGBIIQPages.dateOfDiagnosisInYears.sendKeys(DateOfDiagnosisInYears);
		MiscUtils.sleep(2000);
		cGBIIQPages.ageOfDiagnosisInYear.sendKeys(AgeOfDiagnosisInYears);
		cGBIIQPages.facilityAddressWhereProbandWasDiagnosed.sendKeys(NameAndAddressOfDiagnosisFacility);
		cGBIIQPages.facilityAddressWhereProbandWasTreated.sendKeys(NameAndAddressOfTreatingFacility);
		cGBIIQPages.treatmentReceivedSurgery.click();	
		cGBIIQPages.treatmentReceivedChemotherapy.click();	
		cGBIIQPages.treatmentReceivedRadiation.click();	
		cGBIIQPages.treatmentReceivedImmunotherapy.click();	
		cGBIIQPages.treatmentReceivedOther.click();	
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();	
		MiscUtils.sleep(1000);	
	}

	@When("selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome?")
	public void selects_Yes_if_the_participant_ever_been_evaluated_for_ANY_genetic_disease_or_syndrome() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects if participant ever had genetic counseling for ANY reason?")
	public void selects_if_participant_ever_had_genetic_counseling_for_ANY_reason() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects the details for the genetic evaluations that have been completed includes {string} summarization of the evaluation and adds the information {string}, {string}, {string}, and {string}")
	public void selects_the_details_for_the_genetic_evaluations_that_have_been_completed_includes_summarization_of_the_evaluation_and_adds_the_information_and(String GeneOrSyndromeTested, String DateDiagnosedMonthYear, String AgeDiagnosed, String HospitalLocationOfEvaluation, String ResultsOfEvaluation) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.geneOrSyndromeTested);
		CommonUtils.selectDropDownValue(GeneOrSyndromeTested, cGBIIQPages.geneOrSyndromeTested);
		cGBIIQPages.dateOfTesting.sendKeys(DateDiagnosedMonthYear);
		MiscUtils.sleep(1000);
		cGBIIQPages.ageOfDiagnosisInYear.sendKeys(AgeDiagnosed);
		cGBIIQPages.hospitalLocation.sendKeys(HospitalLocationOfEvaluation);
		CommonUtils.selectDropDownValue(ResultsOfEvaluation, cGBIIQPages.bestSummaryOfEvaluation);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire?")
	public void selects_Yes_if_the_participant_has_copy_of_the_genetic_test_results_and_would_like_to_upload_them_to_this_questionnaire() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	/** NO PDF HAS BEEN ATTACHED YET, THIS STEP IS JUST CLICKING THE NEXT BUTTON */
	@When("upload the genetic test results")
	public void upload_the_genetic_test_results() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("the user adds the participant height and weight at the indicated ages {string},{string},{string},{string},{string} and selects {string}, {string}, {string}, {string} and {string} for Unit of Measurements")
	public void the_user_adds_the_participant_height_and_weight_at_the_indicated_ages_and_selects_and_for_Unit_of_Measurements(String CurrentWeight, String CurrentHeight, String WeightAt18YearsOld, String WeightAt30YearsOld, String WeightAt40YearsOld, String CurrentWeightUnits, String CurrentHeightUnits, String WeightAt18YearsOldUnits, String WeightAt30YearsOldUnits, String WeightAt40YearsOldUnits) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.numericalCurrentWeight);
		cGBIIQPages.numericalCurrentWeight.sendKeys(CurrentWeight);
		cGBIIQPages.numericalCurrentHeight.sendKeys(CurrentHeight);
		cGBIIQPages.numericalWeightAt18.sendKeys(WeightAt18YearsOld);
		cGBIIQPages.numericalWeightAt30.sendKeys(WeightAt30YearsOld);
		cGBIIQPages.numericalWeightAt40.sendKeys(WeightAt40YearsOld);
		CommonUtils.selectDropDownValue(CurrentWeightUnits, cGBIIQPages.UnitOfMeasurementCurrentWeight);
		CommonUtils.selectDropDownValue(CurrentHeightUnits, cGBIIQPages.UnitOfMeasurementCurrentHeight);
		CommonUtils.selectDropDownValue(WeightAt18YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt18);
		CommonUtils.selectDropDownValue(WeightAt30YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt30);
		CommonUtils.selectDropDownValue(WeightAt40YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt40);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}
	
	

	@When("selects the most participant has ever weighed {string} EXCLUDING WEIGHT DURING PREGNANCY")
	public void selects_the_most_participant_has_ever_weighed_EXCLUDING_WEIGHT_DURING_PREGNANCY(String MostedEverWeighed) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.mostProbandHasEverWeighed);
		cGBIIQPages.mostProbandHasEverWeighed.sendKeys(MostedEverWeighed);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects at what {string} was the participant at their highest weight?")
	public void selects_at_what_was_the_participant_at_their_highest_weight(String ageProbandWasTallestEver) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageProbandWeighedTheMost);
		cGBIIQPages.ageProbandWeighedTheMost.sendKeys(ageProbandWasTallestEver);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("the user adds the {string} of the participant at first menstrual period")
	public void the_user_adds_the_of_the_participant_at_first_menstrual_period(String AgeofFirstMenstrualPeriod) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageInYears);
		cGBIIQPages.ageInYears.click();	
		cGBIIQPages.ageProbandHadFirstMenstrualPeriodTextBox.sendKeys(AgeofFirstMenstrualPeriod);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("adds the last menstrual period {string}")
	public void adds_the_last_menstrual_period(String AgeofMostRecentMenstrualPeriod) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageProbandHadMostRecentMenstrualPeriod);
		cGBIIQPages.ageProbandHadMostRecentMenstrualPeriod.click();	
		MiscUtils.sleep(2000);
		cGBIIQPages.ageProbandHadMostRecentMenstrualPeriodTextBox.sendKeys(AgeofMostRecentMenstrualPeriod);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		    
	}
	
	@When("selects the reason if participant period has not occurred for the last year or more")
	public void selects_the_reason_if_participant_period_has_not_occurred_for_the_last_year_or_more() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.stillHavingPeriodsRadioButton);
		cGBIIQPages.stillHavingPeriodsRadioButton.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects Yes if the participant ever been pregnant?")
	public void selects_Yes_if_the_participant_ever_been_pregnant() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("adds the participant {string} at their first pregnancy?")
	public void adds_the_participant_at_their_first_pregnancy(String AgeOfFirstPregnancy) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageOfFirstPregnancy);
		cGBIIQPages.ageOfFirstPregnancy.sendKeys(AgeOfFirstPregnancy);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("adds the {string} the participant has been pregnant?")
	public void adds_the_the_participant_has_been_pregnant(String numberOfTimesProbandHasBeenPregnant) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.numberOfTimesProbandHasBeenPregnant);
		cGBIIQPages.numberOfTimesProbandHasBeenPregnant.sendKeys(numberOfTimesProbandHasBeenPregnant);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects Yes if the participant has ever tried to become pregnant for more than one year without success")
	public void selects_Yes_if_the_participant_has_ever_tried_to_become_pregnant_for_more_than_one_year_without_success() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant")
	public void selects_Yes_for_participant_ever_being_consulted_a_doctor_because_of_difficulty_in_getting_pregnant() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("adds {string} was participant when they first consulted a doctor about difficulty in getting pregnant")
	public void adds_was_participant_when_they_first_consulted_a_doctor_about_difficulty_in_getting_pregnant(String AgeProbandConsultedDrOverFailedPregnancies) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageWhenConsultedDrOverDifficultiesGettingPregnant);
		cGBIIQPages.ageWhenConsultedDrOverDifficultiesGettingPregnant.sendKeys(AgeProbandConsultedDrOverFailedPregnancies);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}

	@When("selects all diagnosis that was made to explain the difficulties getting pregnant")
	public void selects_all_diagnosis_that_was_made_to_explain_the_difficulties_getting_pregnant() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.diagnosisPregnancyDifficultyLowSpermCount);
		cGBIIQPages.diagnosisPregnancyDifficultyLowSpermCount.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}
	
	@When("on the Female Hormones section of IIQ Survey page clicks on the forward arrow button")
	public void on_the_Female_Hormones_section_of_IIQ_Survey_page_clicks_on_the_forward_arrow_button() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason?")
	public void the_user_selects_if_participant_has_ever_taken_pills_injections_or_implants_for_birth_control_or_for_any_other_reason() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("selects Yes if participant has ever prescribed female hormones for this reason?")
	public void selects_Yes_if_participant_has_ever_prescribed_female_hormones_for_this_reason() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.yesSelection);
		cGBIIQPages.yesSelection.click();	
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@When("adds at what {string} was participant prescribed female hormones for hormone replacement therapy?")
	public void adds_at_what_was_participant_prescribed_female_hormones_for_hormone_replacement_therapy(String AgeProbandWasPrescribedHormones) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.ageInYears);
		cGBIIQPages.ageInYears.click();	
		cGBIIQPages.ageProbandWasPrescribedHormonesTextBox.sendKeys(AgeProbandWasPrescribedHormones);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();			
	}
	
	@When("adds the total amount of time the participant has taken hormone replacement therapy {string}")
	public void adds_the_total_amount_of_time_the_participant_has_taken_hormone_replacement_therapy(String WeeksProbandTookPrescribedHormones) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.weeksProbandTookPrescribedHormones);
		cGBIIQPages.weeksProbandTookPrescribedHormones.click();	
		cGBIIQPages.weeksProbandTookPrescribedHormonesTextBox.sendKeys(WeeksProbandTookPrescribedHormones);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}
	
	@Then("the user lands on the {string} page")
	public void the_user_lands_on_the_page(String YouAreAlmostDoneText) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.youAreAlmostDoneText);
		Assert.assertTrue(cGBIIQPages.youAreAlmostDoneText.getText().contains(YouAreAlmostDoneText));
		CucumberLogUtils.logScreenShot();	
	}

	@Then("the user clicks the forward arrow button")
	public void the_user_clicks_the_forward_arrow_button() {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.nextButton);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		cGBIIQPages.nextButton.click();		
	}

	@Then("the end of the IIQ survey page {string} is displayed")
	public void the_end_of_the_IIQ_survey_page_is_displayed(String EndOfScreenerText) {
		
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(cGBIIQPages.endOfSurveyText);
		Assert.assertTrue(cGBIIQPages.endOfSurveyText.getAttribute("id").contentEquals(EndOfScreenerText));	
	}

}
