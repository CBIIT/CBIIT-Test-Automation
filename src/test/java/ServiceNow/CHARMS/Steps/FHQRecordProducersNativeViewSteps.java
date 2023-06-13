package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Constants.FHQSurveyPageConstants;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.FHQUtil;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FHQRecordProducersNativeViewSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

	@Given("a user is on the Native View side door login page")
	public void a_user_is_on_the_Native_View_side_door_login_page() throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeViewSideDoor"));

	}

	@And("the user logs in the Native View using the Test Account credentials")
	public void a_user_logs_in_the_Native_View_using_the_Test_Account_credentials() throws TestingException {

		WebDriverUtils.webDriver.switchTo()
		.frame(WebDriverUtils.webDriver.findElement(By.xpath("//iframe[@id='gsft_main']")));

		CommonUtils.waitForClickability(nativeViewSideDoorLoginPage.nativeViewSideDoorLogInButton);

		nativeViewSideDoorLoginPage.enterUsername(nativeViewSideDoorLoginPage.nativeViewSideDoorUserName,
				"sideDoorUserName");

		nativeViewSideDoorLoginPage.enterPassword(nativeViewSideDoorLoginPage.nativeViewSideDoorPassword,
				"sideDoorPassword");

		nativeViewSideDoorLoginPage.clickSignInButton();

	}

	@When("the user navigates to CHARMS Native view and opens FHQ Record Producers")
	public void the_user_navigates_to_CHARMS_Native_view_and_opens_FHQ_Record_Producers() {

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQFilterNavigator);
		fHQSurveyPage.nVFHQFilterNavigator.sendKeys("Record Producers");

		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQRecordProducers);
		fHQSurveyPage.nVFHQRecordProducers.click();

		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQRecordProducersIframe);
		CommonUtils.switchToFrame(fHQSurveyPage.nVFHQRecordProducersIframe);

	}

	@Then("the user clicks the Preview link and open the FHQ Patient Personals Record Producer")
	public void the_user_clicks_the_Preview_link_and_open_the_FHQ_Patient_Personals_Record_Producer() {

		MiscUtils.sleep(1000);

		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQPreviewPatientPersonalslink);
		fHQSurveyPage.nVFHQPreviewPatientPersonalslink.click();

		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQPatientPersonalsOpenRecordButton);
		fHQSurveyPage.nVFHQPatientPersonalsOpenRecordButton.click();

		CommonUtils.waitForVisibility(fHQSurveyPage.nVFHQPatientPersonalsPreviewItemButton);
		fHQSurveyPage.nVFHQPatientPersonalsPreviewItemButton.click();

		CommonUtils.webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		CommonUtils.switchToAnotherTabWindow();
		CommonUtils.maximizeWindow();

	}

	@Then("verify the New Details of patient immediate family banner is visible")
	public void verify_the_New_Details_of_patient_immediate_family_banner_is_visible() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsNewDetailsBanner);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsNewDetailsBanner,
				"New Details of patient immediate family.&&&");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsNewDetailsBanner);

		StepTestResult stepTestResult = new StepTestResult(
				"verify the New Details of patient immediate family banner is visible");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("To confirm your identity, please indicate your relationship to the participant drop-down displays with values I am the participant,I am the legal guardian or legal representative for the participant")
	public void to_confirm_your_identity_please_indicate_your_relationship_to_the_participant_drop_down_displays_with_values_I_am_the_participant_I_am_the_legal_guardian_or_legal_representative_for_the_participant() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientLabel,
				"To confirm your identity, please indicate your relationship to the participant.");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientDropDown,
				FHQSurveyPageConstants.RELATIONSHIP_TO_PARTICIPANT);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientDropDown);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientDropDown, 2);

		StepTestResult stepTestResult = new StepTestResult(FHQSurveyPageConstants.CONFIRM_IDENTITY);
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Are you currently married or in a long term relationship? drop-down displays with values Yes, No, Prefer not to answer")
	public void are_you_currently_married_or_in_a_long_term_relationship_drop_down_displays_with_values_Yes_No_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedLabel,
				"Are you currently married or in a long-term relationship?");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedDropDown);
		MiscUtils.sleep(1000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedDropDown,
				FHQSurveyPageConstants.YES_NO_PREFER_NOT_TO_ANSWER_DONT_KNOW);

		StepTestResult stepTestResult = new StepTestResult(
				"Are you currently married or in a long term relationship? drop-down displays with values Yes, No, Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("selects the value Yes for Are you currently married or in a long term relationship? drop-down")
	public void selects_the_value_Yes_for_Are_you_currently_married_or_in_a_long_term_relationship_drop_down() {

		// fHQSurveyPage.nVFHQPatientPersonalsRelationshipToPatientDropDown.click();
		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedDropDown, "Yes");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentlyMarriedDropDown);

	}

	@Then("Please fill out the following about your current partner statement is displayed")
	public void please_fill_out_the_following_about_your_current_partner_statement_is_displayed() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerLabel,
				"Please fill out the following about your current partner.");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerLabel);

		StepTestResult stepTestResult = new StepTestResult(
				"Please fill out the following about your current partner statement is displayed");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("First Name text box displays")
	public void first_Name_text_box_displays() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameLabel, "First Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameTextBox);
		MiscUtils.sleep(2000);

		ComponentTestResult TextBoxTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameTextBox, "");

		fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameTextBox.sendKeys("Partner First Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerFirstNameTextBox);

		StepTestResult stepTestResult = new StepTestResult("First Name text box displays");
		stepTestResult.add(labelTest);
		stepTestResult.add(TextBoxTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("First Initial of Last Name drop-down displays with values A-Z, Prefer not to answer, Dont Know")
	public void first_Initial_of_Last_Name_drop_down_displays_with_values_A_Z_Prefer_not_to_answer_Dont_Know() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameLabel, "Initial of Last Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameDropDown);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName());

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameDropDown, 4);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerInitialLastNameDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"First Initial of Last Name drop-down displays with values A-Z, Prefer not to answer, Dont Know");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Vital Status drop-down displays with values Alive, Deceased, Dont know, Prefer not to answer")
	public void vital_Status_drop_down_displays_with_values_Alive_Deceased_Dont_know_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusLabel, "Vital Status");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusDropDown, "Alive");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsCurrentPartnerVitalStatusDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Vital Status drop-down displays with values Alive, Deceased, Dont know, Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Please identify the number of each of the following pregnancy results. statement displays")
	public void please_identify_the_number_of_each_of_the_following_pregnancy_results_statement_displays() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPregnancyResultsLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPregnancyResultsLabel,
				"Please identify the number of each of the following pregnancy results.");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPregnancyResultsLabel);

		StepTestResult stepTestResult = new StepTestResult(
				"Please identify the number of each of the following pregnancy results. statement displays");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("How many TOTAL pregnancies have you had or fathered? drop-down displays with values one to thirty,Dont Know, Prefer not to answer")
	public void how_many_TOTAL_pregnancies_have_you_had_or_fathered_drop_down_displays_with_values_one_to_thirty_Dont_Know_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredLabel,
				"How many TOTAL pregnancies have you had or fathered?");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredDropDown,
				FHQSurveyPageConstants.numberUpToN(30));

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"How many TOTAL pregnancies have you had or fathered? drop-down displays with different options");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("selects the value one to thirty or Dont Know for the How many TOTAL pregnancies have you had or fathered? drop-down")
	public void selects_the_value_one_to_thirty_or_Dont_Know_for_the_How_many_TOTAL_pregnancies_have_you_had_or_fathered_drop_down() {
		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalPregnanciesFatheredDropDown, 2);
	}

	@Then("Have all of your pregnancies been with your Current Partner? drop-down displays with values  Yes, No, Dont Know, Prefer not to answer")
	public void have_all_of_your_pregnancies_been_with_your_Current_Partner_drop_down_displays_with_values_Yes_No_Dont_Know_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerLabel,
				"Have all of your pregnancies been with Current Partner?");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerDropDown,
				FHQSurveyPageConstants.YES_NO_PREFER_NOT_TO_ANSWER_DONT_KNOW);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerDropDown);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsAllPregnanciesWithCurrentPartnerDropDown, 1);

		StepTestResult stepTestResult = new StepTestResult(
				"Have all of your pregnancies been with your Current Partner? drop-down displays with values  Yes, No, Dont Know, Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Total Number of Live Births drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void total_Number_of_Live_Births_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsLabel,
				"Total Number of Live Births");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsDropDown, FHQSurveyPageConstants.numberUpToN(20));

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsDropDown);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalLiveBirthsDropDown, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"Total Number of Live Births drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Total Number of Miscarriages drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void total_Number_of_Miscarriages_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesLabel,
				"Total Number of Miscarriages");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesDropDown, FHQSurveyPageConstants.numberUpToN(20));

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesDropDown, 2);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalMiscarriagesDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Total Number of Miscarriages drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Total number of stillbirths drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void total_number_of_stillbirths_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsLabel,
				"Total Number of Stillbirths");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsDropDown);
		MiscUtils.sleep(1000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsDropDown, FHQSurveyPageConstants.numberUpToN(20));

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsDropDown, 2);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalStillbirthsDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Total number of stillbirths drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Total Number of Induced Abortions drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void total_Number_of_Induced_Abortions_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsLabel, "Total Number of Induced Abortions");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsDropDown);
		MiscUtils.sleep(1000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsDropDown,
				FHQSurveyPageConstants.numberUpToN(20));

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsDropDown);
		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalInducedAbortionsDropDown, 2);

		StepTestResult stepTestResult = new StepTestResult(
				"Total Number of Induced Abortions drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Total number of Tubal,Ectopic,Molar Pregnancies drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void total_number_of_Tubal_Ectopic_Molar_Pregnancies_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesLabel,
				"Total Number of Tubal/Ectopic/Molar Pregnancies");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesDropDown);
		MiscUtils.sleep(1000);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesDropDown,
				FHQSurveyPageConstants.numberUpToN(20));

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalTubalEctopicMolarPregnanciesDropDown,
				1);

		StepTestResult stepTestResult = new StepTestResult(
				"Total number of Tubal,Ectopic,Molar Pregnancies drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("How many total children do you have? drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer")
	public void how_many_total_children_do_you_have_drop_down_displays_with_values_zero_to_twenty_Dont_Know_Prefer_Not_to_Answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveLabel,
				"How many total children do you have?");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLink);
		MiscUtils.sleep(1000);

		fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLink.click();

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLink);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLabel);
		MiscUtils.sleep(1000);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLabel);
		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveInformationLabel,
				"You may include biological, adopted, step, or donor-assisted children. We will ask for more details on their relationship to you later.");

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveDropDown);
		MiscUtils.sleep(1000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveDropDown, FHQSurveyPageConstants.numberUpToN(20));

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"How many total children do you have? drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("selects the value one to twenty or Dont Know for the How many total children do you have?")
	public void selects_the_value_one_to_twenty_or_Dont_Know_for_the_How_many_total_children_do_you_have() {
		
		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalChildrenHaveDropDown, 2);
	
	}

	@Then("The MRVS for children will show")
	public void The_MRVS_for_children_will_show() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSLabel, "Child");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSLabel);

		StepTestResult stepTestResult = new StepTestResult("The MRVS for children will show");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("The Add button in children MRVS is clicked then the Add Row window opens")
	public void The_Add_button_in_children_MRVS_is_clicked_then_the_Add_Row_window_opens() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddButton,
				"Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Add button in children MRVS is clicked then the Add Row window opens");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("First Name text box displays for patient child in the Add Row Page")
	public void first_Name_text_box_displays_for_patient_child_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowPageLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowPageLabel,
				"Add Row");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowPageLabel);

		CommonUtils.switchToFrame(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowPageIframe);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameLabel, "First Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameTextBox);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest2 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameTextBox, "");

		fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameTextBox.sendKeys("Patient Child FN");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstNameTextBox);

		StepTestResult stepTestResult = new StepTestResult(
				"First Name text box displays for patient child in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		scenarioReportList.add(stepTestResult);

	}

	@Then("First Initial of Last Name drop-down displays patient child with values A-Z, Prefer not to answer, Dont Know in the Add Row Page")
	public void first_Initial_of_Last_Name_drop_down_displays_patient_child_with_values_A_Z_Prefer_not_to_answer_Dont_Know_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameLabel, "Initial of Last Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameDropDown);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName());

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameDropDown,
				2);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowFirstInitialLastNameDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"First Initial of Last Name drop-down displays patient child with values A-Z, Prefer not to answer, Dont Know in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Vital Status drop-down displays patient child with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page")
	public void vital_Status_drop_down_displays_patient_child_with_values_Alive_Deceased_Dont_know_Prefer_not_to_answer_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusLabel, "Vital Status");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusDropDown,
				"Prefer not to answer");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowVitalStatusDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Vital Status drop-down displays patient child with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Click the Add Button in patient child Add Row Page")
	public void click_the_Add_Button_in_patient_child_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowCloseButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowCloseButton, "Close");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowCloseButton);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowAddButton,
				"Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsChildMRVSAddRowAddButton.click();

		StepTestResult stepTestResult = new StepTestResult("Click the Add Button in patient child Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Have all of your children been with Current Partner? drop-down displays with values Yes, No, Dont Know, Prefer not to answer")
	public void have_all_of_your_children_been_with_Current_Partner_drop_down_displays_with_values_Yes_No_Dont_Know_Prefer_not_to_answer() {

		WebDriverUtils.webDriver.switchTo().defaultContent();

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerLabel,
				"Have all of your children been with Current Partner?");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerDropDown);
		MiscUtils.sleep(1000);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerDropDown,
				FHQSurveyPageConstants.YES_NO_PREFER_NOT_TO_ANSWER_DONT_KNOW);

		StepTestResult stepTestResult = new StepTestResult(
				"Have all of your children been with Current Partner? drop-down displays with values Yes, No, Dont Know, Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("selects the value No, Dont Know or Prefer not to answer for the Have all of your children been with CurrentPartner?")
	public void selects_the_value_No_Dont_Know_or_Prefer_not_to_answer_for_the_Have_all_of_your_children_been_with_CurrentPartner() {

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsChildrenWithCurrentPartnerDropDown, 2);
		MiscUtils.sleep(1000);
	}

	@Then("How many total different partners have you had biological children with? drop-down displays with values one to ten, Don't Know, Prefer not to answer")
	public void how_many_total_different_partners_have_you_had_biological_children_with_drop_down_displays_with_values_one_to_ten_Don_t_Know_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithLabel,
				"How many total different partners have you had biological children with?");

		fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfoLabel.click();

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfotext);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfotext,
				"We will ask about donor materials (i.e. sperm, egg) as well as adoptive children in a later question. Please do not count them here.");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithMoreInfotext);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithdrpDown);
		MiscUtils.sleep(1000);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithdrpDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithdrpDown,
				FHQSurveyPageConstants.numberUpToN(10));

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalDiffPartnersBioChildrenWithdrpDown, 3);

		StepTestResult stepTestResult = new StepTestResult(
				"How many total different partners have you had biological children with? drop-down displays with values one to ten, Don't Know, Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("The MRVS for Partners will show")
	public void the_MRVS_for_Partners_will_show() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSLabel,
				"Partner");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSLabel);

		StepTestResult stepTestResult = new StepTestResult("The MRVS for Partners will show");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("The Add button in partners MRVS is clicked then the Add Row window opens")
	public void the_Add_button_in_partners_MRVS_is_clicked_then_the_Add_Row_window_opens() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddButton,
				"Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Add button in partners MRVS is clicked then the Add Row window opens");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("First Name text box displays for patient partner in the Add Row Page")
	public void first_Name_text_box_displays_for_patient_partner_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowPageLabel);
		MiscUtils.sleep(1000);

		System.out.println(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowPageLabel.getText());

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowPageLabel);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowPageLabel, "Add Row");

		CommonUtils.switchToFrame(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowPageIframe);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameLabel, "First Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameTextBox);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest2 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameTextBox, "");

		fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameTextBox.sendKeys("Patient Partner FN");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstNameTextBox);

		StepTestResult stepTestResult = new StepTestResult(
				"First Name text box displays for patient partner in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		scenarioReportList.add(stepTestResult);

	}

	@When("First Initial of Last Name for patient partner drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page")
	public void first_Initial_of_Last_Name_for_patient_partner_drop_down_displays_with_values_A_Z_Prefer_not_to_answer_Dont_Know_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameLabel, "Initial of Last Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameDropDown);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameDropDown,
				FHQSurveyPageConstants.firstInitialLastName());

		CommonUtils.selectDropDownValue(
				fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameDropDown, 2);
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowFirstInitialLastNameDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"First Initial of Last Name for patient partner drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("Vital Status drop-down for patient partner displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page")
	public void vital_Status_drop_down_for_patient_partner_displays_with_values_Alive_Deceased_Dont_know_Prefer_not_to_answer_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusLabel, "Vital Status");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusDropDown,
				"Prefer not to answer");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowVitalStatusDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Vital Status drop-down for patient partner displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Click the Add Button in patient partner Add Row Page")
	public void click_the_Add_Button_in_patient_partner_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowCloseButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowCloseButton, "Close");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowCloseButton);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowAddButton, "Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsPartnerMRVSAddRowAddButton.click();

		StepTestResult stepTestResult = new StepTestResult("Click the Add Button in patient partner Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		scenarioReportList.add(stepTestResult);

	}

	@Then("We would like to ask you some questions about Siblings details. statement displays")
	public void we_would_like_to_ask_you_some_questions_about_Siblings_details_statement_displays() {

		WebDriverUtils.webDriver.switchTo().defaultContent();

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingsDetailsBanner);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingsDetailsBanner,
				"We would like to ask you some questions about Siblings details");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingsDetailsBanner);

		StepTestResult stepTestResult = new StepTestResult(
				"We would like to ask you some questions about Siblings details. statement displays");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("How many siblings do you have? drop-down displays with values zero, one-to-twelve, Dont Know,Prefer not to answer")
	public void how_many_siblings_do_you_have_drop_down_displays_with_values_zero_one_to_twelve_Dont_Know_Prefer_not_to_answer() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveLabel,
				"How many siblings do you have?");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveDropDown);
		MiscUtils.sleep(1000);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveDropDown, FHQSurveyPageConstants.numberUpToN(12));

		StepTestResult stepTestResult = new StepTestResult(
				"How many siblings do you have? drop-down displays with values zero, one-to-twelve, Dont Know,Prefer not to answer");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("selects the value one-to-twelve or Dont Know for the How many siblings do you have?")
	public void selects_the_value_one_to_twelve_or_Dont_Know_for_the_How_many_siblings_do_you_have() {

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsTotalSiblingsHaveDropDown, 4);
		MiscUtils.sleep(1000);

	}

	@Then("The MRVS for siblings will show")
	public void the_MRVS_for_siblings_will_show() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSLabel,
				"Details of your siblings.");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSLabel);

		StepTestResult stepTestResult = new StepTestResult("The MRVS for siblings will show");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("The Add button in siblings MRVS is clicked then the Add Row window opens")
	public void the_Add_button_in_siblings_MRVS_is_clicked_then_the_Add_Row_window_opens() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddButton,
				"Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Add button in siblings MRVS is clicked then the Add Row window opens");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("Types of Siblings relation drop-down displays for patient parent in the Add Row Page")
	public void types_of_Siblings_relation_drop_down_displays_for_patient_parent_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowPageLabel);
		MiscUtils.sleep(1000);

		System.out.println(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowPageLabel.getText());

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowPageLabel, "Add Row");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowPageLabel);

		CommonUtils.switchToFrame(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowPageIframe);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeLabel, "Types of Siblings relation");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeDropDown);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeDropDown,
				FHQSurveyPageConstants.TYPES_OF_SIBLINGS);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeDropDown, 2);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowSiblingsTypeDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Types of Siblings relation drop-down displays for patient parent in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("First Name text box displays for patient sibling in the Add Row Page")
	public void first_Name_text_box_displays_for_patient_sibling_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingTextBox);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingTextBox, "");

		fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingTextBox.sendKeys("Patient Sibling FN");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowFirstNameSiblingTextBox);

		StepTestResult stepTestResult = new StepTestResult(
				"First Name text box displays for patient sibling in the Add Row Page");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);

	}

	@When("First Initial of Last Name for patient sibling drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page")
	public void first_Initial_of_Last_Name_for_patient_sibling_drop_down_displays_with_values_A_Z_Prefer_not_to_answer_Dont_Know_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameLabel, "Initial of Last Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameDropDopwn);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameDropDopwn,
				FHQSurveyPageConstants.firstInitialLastName());

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameDropDopwn, 6);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSFirstInitialLastNameDropDopwn);

		StepTestResult stepTestResult = new StepTestResult(
				"First Initial of Last Name for patient sibling drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("Vital Status drop-down for patient sibling displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page")
	public void vital_Status_drop_down_for_patient_sibling_displays_with_values_Alive_Deceased_Dont_know_Prefer_not_to_answer_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusLabel, "Vital Status OF Sibling");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusDropDown, 3);
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSVitalStatusDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Vital Status drop-down for patient sibling displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);

	}

	@Then("Click the Add Button in patient sibling Add Row Page")
	public void click_the_Add_Button_in_patient_sibling_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowCloseButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowCloseButton, "Close");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowCloseButton);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowAddButton, "Add");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSAddRowAddButton.click();

		StepTestResult stepTestResult = new StepTestResult("Click the Add Button in patient sibling Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		scenarioReportList.add(stepTestResult);
	}

	@Then("We would like to ask you some questions about your parents and grandparents. statement displays")
	public void we_would_like_to_ask_you_some_questions_about_your_parents_and_grandparents_statement_displays() {

		WebDriverUtils.webDriver.switchTo().defaultContent();

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner,
				"We would like to ask you some questions about your parents and grandparents.&&&");
		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner);

		StepTestResult stepTestResult = new StepTestResult(
				"We would like to ask you some questions about your parents and grandparents. statement displays");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("The MRVS for parents will show")
	public void the_MRVS_for_parents_will_show() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner,
				"We would like to ask you some questions about your parents and grandparents");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSBanner);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSMoreInformation);
		MiscUtils.sleep(1000);

		fHQSurveyPage.nVFHQPatientPersonalsParentMRVSMoreInformation.click();

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSMoreInformation);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSMoreInformationBanner);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsParentMRVSMoreInformationBanner,
				"Click add button to add your biological mother and father here");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest2 = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSLabel,
				"Parents");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSiblingMRVSLabel);

		StepTestResult stepTestResult = new StepTestResult("The MRVS for parents will show");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(labelTest2);
		scenarioReportList.add(stepTestResult);
	}

	@When("The Add button in parents MRVS is clicked then the Add Row window opens")
	public void the_Add_button_in_parents_MRVS_is_clicked_then_the_Add_Row_window_opens() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddButton,
				"Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"The Add button in parents MRVS is clicked then the Add Row window opens");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("Relationship drop-down displays for patient parent in the Add Row Page")
	public void relationship_drop_down_displays_for_patient_parent_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowPageLabel);
		MiscUtils.sleep(1000);

		System.out.println(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowPageLabel.getText());

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowPageLabel, "Add Row");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowPageLabel);

		CommonUtils.switchToFrame(fHQSurveyPage.nVFHQPatientPersonalsSParentMRVSAddRowPageIframe);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipLabel, "Relationship");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipDropDown);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipDropDown,
				FHQSurveyPageConstants.TYPES_OF_PARENTS);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipDropDown, 3);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowRelationshipDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Relationship drop-down displays for patient parent in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("First Name text box displays for patient parent in the Add Row Page")
	public void first_Name_text_box_displays_for_patient_parent_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameLabel, "First name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameTextBox);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameTextBox, "");

		fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameTextBox.sendKeys("Patient Parent FN");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowFirstNameTextBox);

		StepTestResult stepTestResult = new StepTestResult(
				"First Name text box displays for patient parent in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		scenarioReportList.add(stepTestResult);
	}

	@When("First Initial of Last Name for patient parent drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page")
	public void first_Initial_of_Last_Name_for_patient_parent_drop_down_displays_with_values_A_Z_Prefer_not_to_answer_Dont_Know_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameLabel);
		MiscUtils.sleep(2000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(
				fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameLabel, "Initial of Last Name");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameDropDopwn);
		MiscUtils.sleep(2000);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameDropDopwn,
				FHQSurveyPageConstants.firstInitialLastName());

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameDropDopwn, 10);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSFirstInitialLastNameDropDopwn);

		StepTestResult stepTestResult = new StepTestResult(
				"First Initial of Last Name for patient parent drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@When("Vital Status drop-down for patient parent displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page")
	public void vital_Status_drop_down_for_patient_parent_displays_with_values_Alive_Deceased_Dont_know_Prefer_not_to_answer_in_the_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusLabel);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusLabel, "Vital Status OF Sibling");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusLabel);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusDropDown);

		ComponentTestResult dropdownTest = FHQUtil.verifyDropDowns(
				fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusDropDown,
				FHQSurveyPageConstants.VITAL_STATUS_LIST);

		CommonUtils.selectDropDownValue(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusDropDown, 2);

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSVitalStatusDropDown);

		StepTestResult stepTestResult = new StepTestResult(
				"Vital Status drop-down for patient parent displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(dropdownTest);
		scenarioReportList.add(stepTestResult);
	}

	@Then("Click the Add Button in patient parent Add Row Page")
	public void click_the_Add_Button_in_patient_parent_Add_Row_Page() {

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowCloseButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest1 = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowCloseButton, "Close");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowCloseButton);

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowAddButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil
				.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowAddButton, "Add");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowAddButton);

		fHQSurveyPage.nVFHQPatientPersonalsParentMRVSAddRowAddButton.click();

		StepTestResult stepTestResult = new StepTestResult("Click the Add Button in patient parent Add Row Page");
		stepTestResult.add(labelTest);
		stepTestResult.add(labelTest1);
		scenarioReportList.add(stepTestResult);
	}

	@Then("the Submit Button displays for the FHQ Patient Personal Record Producer")
	public void the_Submit_Button_displays_for_the_FHQ_Patient_Personal_Record_Producer() {

		WebDriverUtils.webDriver.switchTo().defaultContent();

		FHQUtil.fHQLabelHighlight(fHQSurveyPage.nVFHQPatientPersonalsSubmitButton);
		MiscUtils.sleep(1000);

		ComponentTestResult labelTest = FHQUtil.verifyLabel(fHQSurveyPage.nVFHQPatientPersonalsSubmitButton, "Submit");

		FHQUtil.fHQLabelUnHighlight(fHQSurveyPage.nVFHQPatientPersonalsSubmitButton);

		fHQSurveyPage.nVFHQPatientPersonalsSubmitButton.click();

		StepTestResult stepTestResult = new StepTestResult(
				"the Submit Button displays for the FHQ Patient Personal Record Producer");
		stepTestResult.add(labelTest);
		scenarioReportList.add(stepTestResult);
	}

	@And("Generate Scenario Report")
	public void generate_scenario_report() {

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());
		}

	}

}
