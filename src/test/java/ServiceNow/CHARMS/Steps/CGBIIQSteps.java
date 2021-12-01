package ServiceNow.CHARMS.Steps;

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

public class CGBIIQSteps extends PageInitializer {

	@Given("the user is redirected to the log in page of the Individual Information Questionnaire - CGB IIQ")
	public void the_user_is_redirected_to_the_log_in_page_of_the_Individual_Information_Questionnaire__CGB_IIQ()
			throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CGBIIQ"));

	}

	/*
	 * 
	 * DONT DELETE UNUSED STEPS!!!!
	 */
	@Given("the user is redirected to the log in page of the Individual Information Questionnaire")
	public void the_user_is_redirected_to_the_log_in_page_of_the_Individual_Information_Questionnaire()
			throws TestingException {
		// WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CGBIIQ"));
	}

	/**
	 * This closes mobile view, switches frame to the desktop view and enters email
	 */
	@When("types the email address in the textbook labeled Email - CGB IIQ")
	public void types_the_email_address_in_the_textbook_labeled_Email__CGB_IIQ() {

		JavascriptUtils.clickByJS(cGBIIQPages.mobileViewSlider);
		CommonUtils.switchToFrame(cGBIIQPages.desktopFrame);
		cGBIIQPages.loginEmail.sendKeys("sonika34@test.com");

	}

	@When("types the One-time pin in the textbook labeled One Time pin - CGB IIQ")
	public void types_the_One_time_pin_in_the_textbook_labeled_One_Time_pin__CGB_IIQ() {

		cGBIIQPages.oneTimePin.sendKeys("123456");
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("on the CGB Statement of Confidentiality page clicks next arrow button - CGB IIQ")
	public void on_the_CGB_Statement_of_Confidentiality_page_clicks_next_arrow_button__CGB_IIQ() {

		MiscUtils.sleep(2000);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("on the CGB Instructions page clicks next arrow button - CGB IIQ")
	public void on_the_CGB_Instructions_page_clicks_next_arrow_button__CGB_IIQ() {

		MiscUtils.sleep(2000);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("on the General Background Information section of IIQ Survey page clicks next arrow button - CGB IIQ")
	public void on_the_General_Background_Information_section_of_IIQ_Survey_page_clicks_next_arrow_button__CGB_IIQ() {

		MiscUtils.sleep(2000);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the radio button labelled I am completing this form for someone else - CGB IIQ")
	public void selects_the_radio_button_labelled_I_am_completing_this_form_for_someone_else__CGB_IIQ() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.completingForSomeoneElseRadioButton);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("fills out the participant {string} for whom the user is completing the IIQ form. - CGB IIQ")
	public void fills_out_the_participant_for_whom_the_user_is_completing_the_IIQ_form__CGB_IIQ(String probandName) {

		MiscUtils.sleep(2000);
		cGBIIQPages.probandsName.sendKeys(probandName);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects Female as the biological sex of the participant assigned at birth - CGB IIQ")
	public void selects_as_the_biological_sex_of_the_participant_assigned_at_birth__CGB_IIQ() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandFemaleSex);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects for which Sex the participant is identified - CGB IIQ")
	public void selects_for_which_the_participant_is_identified__CGB_IIQ() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandFemaleSex);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects what the participant is considered to be - CGB IIQ")
	public void selects_what_the_participant_is_to_be__CGB_IIQ() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsHispanicEthnicity);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the Race of the participant - CGB IIQ")
	public void selects_the_of_the_participant__CGB_IIQ() {

		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsWhiteRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsBlackRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsNativeHawaiianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsAmericanIndianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsAsianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsOtherRace);
		MiscUtils.sleep(500);
		cGBIIQPages.probandsOtherRaceTextbox.sendKeys("Other Race");
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("types the One-time pin in the textbook labeled One Time pin")
	public void types_the_One_time_pin_in_the_textbook_labeled_One_Time_pin() {
		// cGBIIQPages.oneTimePin.sendKeys("123456");
		// CucumberLogUtils.logScreenShot();
		// MiscUtils.sleep(2000);
		// JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		// JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

		// cGBIIQPages.nextButton.click();
		// MiscUtils.sleep(2000);
	}

	@When("on the CGB Statement of Confidentiality page clicks next arrow button")
	public void on_the_CGB_Statement_of_Confidentiality_page_clicks_next_arrow_button() {
		MiscUtils.sleep(1500);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("on the CGB Instructions page clicks next arrow button")
	public void on_the_CGB_Instructions_page_clicks_next_arrow_button() {
		MiscUtils.sleep(1500);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("on the General Background Information section of IIQ Survey page clicks next arrow button")
	public void on_the_General_Background_Information_section_of_IIQ_Survey_page_clicks_next_arrow_button() {
		MiscUtils.sleep(1500);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the radio button labelled I am completing this form for someone else")
	public void selects_the_radio_button_labelled_I_am_completing_this_form_for_someone_else() {
		MiscUtils.sleep(1500);
		JavascriptUtils.clickByJS(cGBIIQPages.completingForSomeoneElseRadioButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("fills out the participant {string} for whom the user is completing the IIQ form.")
	public void fills_out_the_participant_for_whom_the_user_is_completing_the_IIQ_form(String probandName) {
		MiscUtils.sleep(1500);
		cGBIIQPages.probandsName.sendKeys(probandName);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Female as the biological sex of the participant assigned at birth")
	public void selects_as_the_biological_sex_of_the_participant_assigned_at_birth() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.probandFemaleSex);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects for which Sex the participant is identified")
	public void selects_for_which_the_participant_is_identified() {
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandFemaleSex);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects what the participant is considered to be")
	public void selects_what_the_participant_is_to_be() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsHispanicEthnicity);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the Race of the participant")
	public void selects_the_of_the_participant() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsWhiteRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsBlackRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsNativeHawaiianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsAmericanIndianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsAsianRace);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsOtherRace);
		MiscUtils.sleep(500);
		cGBIIQPages.probandsOtherRaceTextbox.sendKeys("Other Race");
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if the participant is from the Ashkenazi Eastern European JewishDescent - CGB IIQ")
	public void selects_if_the_participant_is_from_the_Ashkenazi_Eastern_European_JewishDescent() {

		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if the participant is Adopted - CGB IIQ")
	public void selects_if_the_participant_is_Adopted() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes for the participant raised by someone other than their biological parent - CGB IIQ")
	public void selects_for_the_participant_raised_by_someone_other_than_their_biological_blood_parent() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds Information regarding individuals who raised the participant {string},{string} - CGB IIQ")
	public void adds_Information_regarding_individuals_who_raised_the_participant__CGB_IIQ(String nameOfGuardian,
			String relationshipOfGuardian) {

		MiscUtils.sleep(2000);
		cGBIIQPages.guardianNameProxyFlow.sendKeys(nameOfGuardian);
		cGBIIQPages.guardianRelationshipToProbandProxyFlow.sendKeys(relationshipOfGuardian);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds Information regarding individuals who raised the participant {string},{string}")
	public void adds_Information_regarding_individuals_who_raised_the_participant(String nameOfGuardian,
			String relationshipOfGuardian) {

		MiscUtils.sleep(800);
		cGBIIQPages.guardianNameProxyFlow.sendKeys(nameOfGuardian);
		cGBIIQPages.guardianRelationshipToProbandProxyFlow.sendKeys(relationshipOfGuardian);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the participant DOB in MMDDYYYY format - CGB IIQ")
	public void adds_the_participant_DOB_in_MMDDYYYY_format() {
		MiscUtils.sleep(800);
		JavascriptUtils.clickByJS(cGBIIQPages.previousMonthButton);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsDOBDay);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the Demographic information of the participant {string}, {string}, {string} - CGB IIQ")
	public void adds_the_Demographic_information_of_the_participant_or(String City, String State, String Country) {

		MiscUtils.sleep(2000);
		cGBIIQPages.probandCityProxyFlow.sendKeys(City);
		cGBIIQPages.probandStateProxyFlow.sendKeys(State);
		cGBIIQPages.probandCountryProxyFlow.sendKeys(Country);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ")
	public void selects_the_participant_Biological_Mothers_Ancestral_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {

		MiscUtils.sleep(2000);
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
		cGBIIQPages.multipleAnswers.get(12).click();
		cGBIIQPages.multipleAnswers.get(13).click();
		cGBIIQPages.multipleAnswers.get(13).click();
		cGBIIQPages.multipleAnswers.get(14).click();
		cGBIIQPages.multipleAnswers.get(15).click();
		cGBIIQPages.multipleAnswers.get(16).click();
		cGBIIQPages.multipleAnswers.get(17).click();
		cGBIIQPages.multipleAnswers.get(18).click();
		cGBIIQPages.multipleAnswers.get(19).click();
		cGBIIQPages.multipleAnswers.get(20).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY - CGB IIQ")
	public void selects_the_participant_Biological_Fathers_Ancestral_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {

		MiscUtils.sleep(2000);
		cGBIIQPages.multipleAnswers.get(1).click();
		cGBIIQPages.multipleAnswers.get(2).click();
		cGBIIQPages.multipleAnswers.get(7).click();
		cGBIIQPages.multipleAnswers.get(8).click();
		cGBIIQPages.multipleAnswers.get(9).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY - CGB IIQ")
	public void selects_the_participant_Familys_Religious_Background_or_add_the_free_text_for_the_box_labelled_Other_SPECIFY() {

		MiscUtils.sleep(2000);
		cGBIIQPages.multipleAnswers.get(1).click();
		cGBIIQPages.multipleAnswers.get(2).click();
		cGBIIQPages.multipleAnswers.get(4).click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the participant Current Marital Status - CGB IIQ")
	public void selects_the_participant_Current_Marital_Status() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.marriedMaritalStatus);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the participant {string} - CGB IIQ")
	public void adds_the_participant_or_select_the_option(String Occupation) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsOccupation);
		cGBIIQPages.probandsOccupationTextBoxProxyFlow.sendKeys(Occupation);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if the participant currently have health insurance? - CGB IIQ")
	public void selects_if_the_participant_currently_have_health_insurance() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(1000);
	}

	@When("selects the total combined yearly income for all the persons in participant household - CGB IIQ")
	public void selects_the_total_combined_yearly_income_for_all_the_persons_in_participant_household() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.householdIncome);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(1000);
	}

	@When("selects the highest level of schooling participant has completed - CGB IIQ")
	public void selects_the_highest_level_of_schooling_participant_has_completed() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.educationLevel);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("on the medical history section of IIQ Survey page clicks on the forward arrow button - CGB IIQ")
	public void on_the_medical_history_section_of_IIQ_Survey_page_clicks_on_the_forward_arrow_button() {

		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("the user selects if the participant conceived using in vitro fertilization IVF - CGB IIQ")
	public void the_user_selects_if_the_participant_conceived_using_in_vitro_fertilization_IVF() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if the participant conceived through a donor egg or sperm - CGB IIQ")
	public void selects_if_the_participant_conceived_through_a_donor_egg_or_sperm() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.conceivedBySpermAndEggDonation);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if the participant Preimplantation Genetic Diagnosis PGD used - CGB IIQ")
	public void selects_if_the_participant_Preimplantation_Genetic_Diagnosis_PGD_used() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects option Yes if the participant is a twin or multiple birth - CGB IIQ")
	public void selects_option_Yes_if_the_participant_is_a_twin_or_multiple_birth() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the option Twin for what type of birth was the participant - CGB IIQ")
	public void selects_the_option_Twin_for_what_type_of_birth_was_the_participant() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandTwinBirth);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects whether the participant have a fraternal or identical twin - CGB IIQ")
	public void selects_whether_the_participant_have_a_fraternal_or_identical_twin() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.fraternalTwinValue);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the information for the names of the children in the twin or multiple birth {string},{string},{string},{string} - CGB IIQ")
	public void adds_the_information_for_the_names_of_the_children_in_the_twin_or_multiple_birth(String Twin,
			String SiblingFirstName, String SiblingLastInitial, String RelationshipToProband) {

		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(Twin, cGBIIQPages.siblingBirthTypeDropdown);
		cGBIIQPages.siblingFirstName.sendKeys(SiblingFirstName);
		CommonUtils.selectDropDownValue(SiblingLastInitial, cGBIIQPages.siblingLastNameInitial);
		CommonUtils.selectDropDownValue(RelationshipToProband, cGBIIQPages.siblingRelationshipToProband);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the option Yes for the participants biological parents blood-related to each other - CGB IIQ")
	public void selects_the_option_Yes_for_the_participants_biological_parents_blood_related_to_each_other() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds {string} of the participant how the biological parents blood-related to each other - CGB IIQ")
	public void adds_of_the_participant_how_the_biological_parents_blood_related_to_each_other(
			String RelationshipBetweenParents) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.parentsRelationshipToEachotherRadioButton);
		cGBIIQPages.parentsRelationshipToEachotherTextBox.sendKeys(RelationshipBetweenParents);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects how was the participant born - CGB IIQ")
	public void selects_how_was_the_participant_born() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.fullTermBirth);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the participants birth {string}, {string} and {string} Numerical Value and {string}, {string} and {string} for Unit Of Measure - CGB IIQ")
	public void adds_the_participants_birth_and_Numerical_Value_and_and_for_Unit_Of_Measure(String NumericalWeight,
			String NumericalLength, String NumericalHeadCircumference, String UnitMeasurementWeight,
			String UnitMeasurementLength, String UnitMeasurementHeadCircumference) {

		MiscUtils.sleep(2000);
		cGBIIQPages.numericalWeight.sendKeys(NumericalWeight);
		cGBIIQPages.numericalLength.sendKeys(NumericalLength);
		cGBIIQPages.numericalHeadCircumference.sendKeys(NumericalHeadCircumference);
		CommonUtils.selectDropDownValue(UnitMeasurementWeight, cGBIIQPages.unitOfMeasurementWeight);
		CommonUtils.selectDropDownValue(UnitMeasurementLength, cGBIIQPages.unitOfMeasurementLength);
		CommonUtils.selectDropDownValue(UnitMeasurementHeadCircumference,
				cGBIIQPages.unitOfMeasurementHeadCircumference);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(1000);
	}

	@When("the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page - CGB IIQ")
	public void the_user_clicks_the_forward_arrow_on_the_cancer_and_benign_tumor_history_section_of_IIQ_Survey_page() {

		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor - CGB IIQ")
	public void the_user_selects_option_Yes_if_participant_ever_been_diagnosed_with_any_cancer_and_or_benign_tumor() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects or adds the primary cancers or benign tumors that have been diagnosed - CGB IIQ")
	public void selects_or_adds_the_primary_cancers_or_benign_tumors_that_have_been_diagnosed() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.cancerBenignTumorAdrenalGlandValue);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds primary cancer or tumor information {string},{string},{string},{string} and selects what kind of the treatment received - CGB IIQ")
	public void adds_primary_cancer_or_tumor_information_and_selects_what_kind_of_the_treatment_received(
			String DateOfDiagnosisInYears, String AgeOfDiagnosisInYears, String NameAndAddressOfDiagnosisFacility,
			String NameAndAddressOfTreatingFacility) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.dateOfDiagnosisInYears);
		cGBIIQPages.dateOfDiagnosisInYears.sendKeys(DateOfDiagnosisInYears);
		MiscUtils.sleep(2000);
		cGBIIQPages.ageOfDiagnosisInYear.sendKeys(AgeOfDiagnosisInYears);
		cGBIIQPages.facilityAddressWhereProbandWasDiagnosed.sendKeys(NameAndAddressOfDiagnosisFacility);
		cGBIIQPages.facilityAddressWhereProbandWasTreated.sendKeys(NameAndAddressOfTreatingFacility);
		JavascriptUtils.clickByJS(cGBIIQPages.treatmentReceivedSurgery);
		JavascriptUtils.clickByJS(cGBIIQPages.treatmentReceivedChemotherapy);
		JavascriptUtils.clickByJS(cGBIIQPages.treatmentReceivedRadiation);
		JavascriptUtils.clickByJS(cGBIIQPages.treatmentReceivedImmunotherapy);
		JavascriptUtils.clickByJS(cGBIIQPages.treatmentReceivedOther);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(1000);
	}

	@When("selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome? - CGB IIQ")
	public void selects_Yes_if_the_participant_ever_been_evaluated_for_ANY_genetic_disease_or_syndrome() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects if participant ever had genetic counseling for ANY reason? - CGB IIQ")
	public void selects_if_participant_ever_had_genetic_counseling_for_ANY_reason() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the details for the genetic evaluations that have been completed includes {string} summarization of the evaluation and adds the information {string}, {string}, {string}, and {string} - CGB IIQ")
	public void selects_the_details_for_the_genetic_evaluations_that_have_been_completed_includes_summarization_of_the_evaluation_and_adds_the_information_and(
			String GeneOrSyndromeTested, String DateDiagnosedMonthYear, String AgeDiagnosed,
			String HospitalLocationOfEvaluation, String ResultsOfEvaluation) {

		MiscUtils.sleep(2000);
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
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire? - CGB IIQ")
	public void selects_Yes_if_the_participant_has_copy_of_the_genetic_test_results_and_would_like_to_upload_them_to_this_questionnaire() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	/** NO PDF HAS BEEN ATTACHED YET, THIS STEP IS JUST CLICKING THE NEXT BUTTON */
	@When("upload the genetic test results - CGB IIQ")
	public void upload_the_genetic_test_results() {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("the user adds the participant height and weight at the indicated ages {string},{string},{string},{string},{string} and selects {string}, {string}, {string}, {string} and {string} for Unit of Measurements - CGB IIQ")
	public void the_user_adds_the_participant_height_and_weight_at_the_indicated_ages_and_selects_and_for_Unit_of_Measurements(
			String CurrentWeight, String CurrentHeight, String WeightAt18YearsOld, String WeightAt30YearsOld,
			String WeightAt40YearsOld, String CurrentWeightUnits, String CurrentHeightUnits,
			String WeightAt18YearsOldUnits, String WeightAt30YearsOldUnits, String WeightAt40YearsOldUnits) {

		MiscUtils.sleep(2000);
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
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the most participant has ever weighed {string} EXCLUDING WEIGHT DURING PREGNANCY - CGB IIQ")
	public void selects_the_most_participant_has_ever_weighed_EXCLUDING_WEIGHT_DURING_PREGNANCY(
			String MostedEverWeighed) {

		MiscUtils.sleep(2000);
		cGBIIQPages.mostProbandHasEverWeighed.sendKeys(MostedEverWeighed);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects at what {string} was the participant at their highest weight? - CGB IIQ")
	public void selects_at_what_was_the_participant_at_their_highest_weight(String ageProbandWasTallestEver) {

		MiscUtils.sleep(2000);
		cGBIIQPages.ageProbandWeighedTheMost.sendKeys(ageProbandWasTallestEver);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("the user adds the {string} of the participant at first menstrual period - CGB IIQ")
	public void the_user_adds_the_of_the_participant_at_first_menstrual_period(String AgeofFirstMenstrualPeriod) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.ageInYears);
		cGBIIQPages.ageProbandHadFirstMenstrualPeriodTextBox.sendKeys(AgeofFirstMenstrualPeriod);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the last menstrual period {string} - CGB IIQ")
	public void adds_the_last_menstrual_period(String AgeofMostRecentMenstrualPeriod) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.ageProbandHadMostRecentMenstrualPeriod);
		MiscUtils.sleep(2000);
		cGBIIQPages.ageProbandHadMostRecentMenstrualPeriodTextBox.sendKeys(AgeofMostRecentMenstrualPeriod);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects the reason if participant period has not occurred for the last year or more - CGB IIQ")
	public void selects_the_reason_if_participant_period_has_not_occurred_for_the_last_year_or_more() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.stillHavingPeriodsRadioButton);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes if the participant ever been pregnant? - CGB IIQ")
	public void selects_Yes_if_the_participant_ever_been_pregnant() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the participant {string} at their first pregnancy? - CGB IIQ")
	public void adds_the_participant_at_their_first_pregnancy(String AgeOfFirstPregnancy) {

		MiscUtils.sleep(2000);
		cGBIIQPages.ageOfFirstPregnancy.sendKeys(AgeOfFirstPregnancy);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds the {string} the participant has been pregnant? - CGB IIQ")
	public void adds_the_the_participant_has_been_pregnant(String numberOfTimesProbandHasBeenPregnant) {

		MiscUtils.sleep(2000);
		cGBIIQPages.numberOfTimesProbandHasBeenPregnant.sendKeys(numberOfTimesProbandHasBeenPregnant);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes if the participant has ever tried to become pregnant for more than one year without success - CGB IIQ")
	public void selects_Yes_if_the_participant_has_ever_tried_to_become_pregnant_for_more_than_one_year_without_success() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant - CGB IIQ")
	public void selects_Yes_for_participant_ever_being_consulted_a_doctor_because_of_difficulty_in_getting_pregnant() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds {string} was participant when they first consulted a doctor about difficulty in getting pregnant - CGB IIQ")
	public void adds_was_participant_when_they_first_consulted_a_doctor_about_difficulty_in_getting_pregnant(
			String AgeProbandConsultedDrOverFailedPregnancies) {

		MiscUtils.sleep(2000);
		cGBIIQPages.ageWhenConsultedDrOverDifficultiesGettingPregnant
				.sendKeys(AgeProbandConsultedDrOverFailedPregnancies);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects all diagnosis that was made to explain the difficulties getting pregnant - CGB IIQ")
	public void selects_all_diagnosis_that_was_made_to_explain_the_difficulties_getting_pregnant() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.diagnosisPregnancyDifficultyLowSpermCount);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("on the Female Hormones section of IIQ Survey page clicks on the forward arrow button - CGB IIQ")
	public void on_the_Female_Hormones_section_of_IIQ_Survey_page_clicks_on_the_forward_arrow_button() {

		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason? - CGB IIQ")
	public void the_user_selects_if_participant_has_ever_taken_pills_injections_or_implants_for_birth_control_or_for_any_other_reason() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("selects Yes if participant has ever prescribed female hormones for this reason? - CGB IIQ")
	public void selects_Yes_if_participant_has_ever_prescribed_female_hormones_for_this_reason() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@When("adds at what {string} was participant prescribed female hormones for hormone replacement therapy? - CGB IIQ")
	public void adds_at_what_was_participant_prescribed_female_hormones_for_hormone_replacement_therapy(
			String AgeProbandWasPrescribedHormones) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.ageInYears);
		cGBIIQPages.ageProbandWasPrescribedHormonesTextBox.sendKeys(AgeProbandWasPrescribedHormones);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the total amount of time the participant has taken hormone replacement therapy {string} - CGB IIQ")
	public void adds_the_total_amount_of_time_the_participant_has_taken_hormone_replacement_therapy__CGB_IIQ(
			String WeeksProbandTookPrescribedHormones) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.weeksProbandTookPrescribedHormones);
		cGBIIQPages.weeksProbandTookPrescribedHormonesTextBox.sendKeys(WeeksProbandTookPrescribedHormones);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the total amount of time the participant has taken hormone replacement therapy {string}")
	public void adds_the_total_amount_of_time_the_participant_has_taken_hormone_replacement_therapy(
			String WeeksProbandTookPrescribedHormones) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.weeksProbandTookPrescribedHormones);
		cGBIIQPages.weeksProbandTookPrescribedHormonesTextBox.sendKeys(WeeksProbandTookPrescribedHormones);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@Then("the user lands on the {string} page - CGB IIQ")
	public void the_user_lands_on_the_page(String YouAreAlmostDoneText) {
		MiscUtils.sleep(2000);
		Assert.assertTrue(cGBIIQPages.youAreAlmostDoneText.getText().contains(YouAreAlmostDoneText));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user clicks the forward arrow button - CGB IIQ")
	public void the_user_clicks_the_forward_arrow_button() {

		MiscUtils.sleep(2000);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
	}

	@Then("the end of the IIQ survey page {string} is displayed - CGB IIQ")
	public void the_end_of_the_IIQ_survey_page_is_displayed(String EndOfScreenerText) {

		MiscUtils.sleep(2000);
		Assert.assertTrue(cGBIIQPages.endOfSurveyText.getAttribute("id").contentEquals(EndOfScreenerText));
		Assert.assertTrue(cGBIIQPages.endOfSurveyText.getAttribute("id").contentEquals(EndOfScreenerText));

	}

	@When("fills out the participants {string} for whom the user is completing the IIQ form. - CGB IIQ")
	public void fills_out_the_participants_for_whom_the_user_is_completing_the_IIQ_form(String probandName) {

		MiscUtils.sleep(2000);
		cGBIIQPages.probandsName.sendKeys(probandName);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects Male as the biological sex of the participant assigned at birth - CGB IIQ")
	public void selects_Male_as_the_biological_sex_of_the_participant_assigned_at_birth() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandMaleSex);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects for which Sex the participant identifies as - CGB IIQ")
	public void selects_for_which_Sex_the_participant_identifies_as() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandMaleSex);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects how many {string} the proband has gotten a women pregnant - CGB IIQ")
	public void selects_how_many_the_proband_has_gotten_a_women_pregnant(String numberOfPregnanciesFathered) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.numberOfPregnanciesFatheredRadioButton);
		cGBIIQPages.numberOfPregnanciesFatheredTextBox.sendKeys(numberOfPregnanciesFathered);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects if Proband or Partner have sought help with fertility - CGB IIQ")
	public void selects_if_Proband_or_Partner_have_sought_help_with_fertility() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.yesSelection);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("selects the radio button labelled I am completing this form for myself - CGB IIQ")
	public void selects_the_radio_button_labelled_I_am_completing_this_form_for_myself() {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.completingForSomeoneMyselfRadioButton);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds Information regarding the individual who raised the participant {string},{string} - CGB IIQ")
	public void adds_Information_regarding_the_individual_who_raised_the_participant(String nameOfGuardian,
			String relationshipOfGuardian) {

		MiscUtils.sleep(2000);
		cGBIIQPages.guardiansNameProbandFlow.sendKeys(nameOfGuardian);
		cGBIIQPages.guardiansRelationshipToProbandProbandFlow.sendKeys(relationshipOfGuardian);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the Demographic information of participant {string}, {string}, {string} - CGB IIQ")
	public void adds_the_Demographic_information_of_participant_or(String City, String State, String Country) {

		MiscUtils.sleep(2000);
		cGBIIQPages.probandCity.sendKeys(City);
		cGBIIQPages.probandState.sendKeys(State);
		cGBIIQPages.probandCountry.sendKeys(Country);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds participant {string} - CGB IIQ")
	public void adds_participant(String Occupation) {

		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cGBIIQPages.probandsOccupation);
		cGBIIQPages.probandsOccupationTextBox.sendKeys(Occupation);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds participants birth {string}, {string} and {string} Numerical Value and {string}, {string} and {string} for Unit Of Measure - CGB IIQ")
	public void adds_participants_birth_and_Numerical_Value_and_and_for_Unit_Of_Measure(String NumericalWeight,
			String NumericalLength, String NumericalHeadCircumference, String UnitMeasurementWeight,
			String UnitMeasurementLength, String UnitMeasurementHeadCircumference) {

		MiscUtils.sleep(2000);
		cGBIIQPages.numericalWeightProband.sendKeys(NumericalWeight);
		cGBIIQPages.numericalLengthProband.sendKeys(NumericalLength);
		cGBIIQPages.numericalHeadCircumferenceProband.sendKeys(NumericalHeadCircumference);
		CommonUtils.selectDropDownValue(UnitMeasurementWeight, cGBIIQPages.unitOfMeasurementWeightProband);
		CommonUtils.selectDropDownValue(UnitMeasurementLength, cGBIIQPages.unitOfMeasurementLengthProband);
		CommonUtils.selectDropDownValue(UnitMeasurementHeadCircumference,
				cGBIIQPages.unitOfMeasurementHeadCircumferenceProband);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);
		MiscUtils.sleep(1000);

	}

	@When("selects details for the genetic evaluations that have been completed includes {string} summarization of the evaluation and adds the information {string}, {string}, {string}, and {string} - CGB IIQ")
	public void selects_details_for_the_genetic_evaluations_that_have_been_completed_includes_summarization_of_the_evaluation_and_adds_the_information_and(
			String GeneOrSyndromeTested, String DateDiagnosedMonthYear, String AgeDiagnosed,
			String HospitalLocationOfEvaluation, String ResultsOfEvaluation) {

		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(GeneOrSyndromeTested, cGBIIQPages.geneOrSyndromeTestedProbandFlow);
		cGBIIQPages.dateOfTestingProbandFlow.sendKeys(DateDiagnosedMonthYear);
		MiscUtils.sleep(1000);
		cGBIIQPages.ageOfDiagnosisInYear.sendKeys(AgeDiagnosed);
		cGBIIQPages.hospitalLocationProbandFlow.sendKeys(HospitalLocationOfEvaluation);
		CommonUtils.selectDropDownValue(ResultsOfEvaluation, cGBIIQPages.bestSummaryOfEvaluationProbandFlow);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("the user adds participant height and weight at the indicated ages {string},{string},{string},{string},{string} and selects {string}, {string}, {string}, {string} and {string} for Unit of Measurements - CGB IIQ")
	public void the_user_adds_participant_height_and_weight_at_the_indicated_ages_and_selects_and_for_Unit_of_Measurements(
			String CurrentWeight, String CurrentHeight, String WeightAt18YearsOld, String WeightAt30YearsOld,
			String WeightAt40YearsOld, String CurrentWeightUnits, String CurrentHeightUnits,
			String WeightAt18YearsOldUnits, String WeightAt30YearsOldUnits, String WeightAt40YearsOldUnits) {

		MiscUtils.sleep(2000);
		cGBIIQPages.numericalCurrentWeightProbandFlow.sendKeys(CurrentWeight);
		cGBIIQPages.numericalCurrentHeightProbandFlow.sendKeys(CurrentHeight);
		cGBIIQPages.numericalWeightAt18ProbandFlow.sendKeys(WeightAt18YearsOld);
		cGBIIQPages.numericalWeightAt30ProbandFlow.sendKeys(WeightAt30YearsOld);
		cGBIIQPages.numericalWeightAt40ProbandFlow.sendKeys(WeightAt40YearsOld);
		CommonUtils.selectDropDownValue(CurrentWeightUnits, cGBIIQPages.UnitOfMeasurementCurrentWeightProbandFlow);
		CommonUtils.selectDropDownValue(CurrentHeightUnits, cGBIIQPages.UnitOfMeasurementCurrentHeightProbandFlow);
		CommonUtils.selectDropDownValue(WeightAt18YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt18ProbandFlow);
		CommonUtils.selectDropDownValue(WeightAt30YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt30ProbandFlow);
		CommonUtils.selectDropDownValue(WeightAt40YearsOldUnits, cGBIIQPages.UnitOfMeasurementWeightAt40ProbandFlow);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds participant {string} at their first pregnancy? - CGB IIQ")
	public void adds_participant_at_their_first_pregnancy(String AgeOfFirstPregnancy) {

		MiscUtils.sleep(2000);
		cGBIIQPages.ageOfFirstPregnancyProbandFlow.sendKeys(AgeOfFirstPregnancy);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}

	@When("adds the {string} participant has been pregnant? - CGB IIQ")
	public void adds_the_participant_has_been_pregnant(String numberOfTimesProbandHasBeenPregnant) {

		MiscUtils.sleep(2000);
		cGBIIQPages.numberOfTimesProbandHasBeenPregnantProbandFlow.sendKeys(numberOfTimesProbandHasBeenPregnant);
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollIntoView(cGBIIQPages.nextButton);
		JavascriptUtils.clickByJS(cGBIIQPages.nextButton);

	}
}