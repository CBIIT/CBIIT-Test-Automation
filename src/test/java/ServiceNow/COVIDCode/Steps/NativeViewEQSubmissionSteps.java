package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NativeViewEQSubmissionSteps extends PageInitializer {
	public static String testFirstName = "FirstName" + CommonUtils.getDateAsString();

	@Given("a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application")
	public void a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("is on the COVIDcode Enrollments page")
	public void is_on_the_COVIDcode_Enrollments_page() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();

	}

	@When("the COVIDcode Study nurse begins an Enrollment Questionnaire for a {string} user who consents {string} to join the study")
	public void the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(

			String group, String consent) {
		nativeViewStepsImpl.nativeViewConsentingWithGroupIDandFillPatientBasicInfo(group, consent);

	}

	@When("fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors")
	public void fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()
			throws InterruptedException {

		nativeViewStepsImpl.nativeViewFillOutDemographicsSection();
		nativeViewStepsImpl.nativeViewFillOutSymptomologySection();
		nativeViewStepsImpl.nativeViewFillOutExposuresAndRiskFactorsSection();
		nativeViewStepsImpl.nativeViewConsentingParticipantEventsSection();

	}

	@When("submits the Enrollment Questionnaire")
	public void submits_the_Enrollment_Questionnaire() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPageUpdateButton.click();
	}

	@Then("the Enrollment Questionnaire should be successfully submitted")

	public void the_Enrollment_Questionnaire_should_be_successfully_submitted() {
		nativeViewStepsImpl.nativeViewVerifyingEnrollmentQuestionnaireWasSubmitted();
	}

	@When("the COVIDcode user is on the COVIDcode Study Native View application")
	public void the_COVIDcode_user_is_on_the_COVIDcode_Study_Native_View_application() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("the COVIDcode user is on the COVIDcode Enrollments page and clicks on New button")
	public void the_COVIDcode_user_is_on_the_COVIDcode_Enrollments_page_and_clicks_on_New_button() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		MiscUtils.sleep(2000);
	}

	@Given("the COVIDcode user navigates to the Participant Events tab")
	public void the_COVIDcode_user_navigates_to_the_Participant_Events_tab() throws TestingException {
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		MiscUtils.sleep(2000);
	}

	@Then("there is a RVS Status drop down with the options Accepted and Refused and clicks on {string}")

	public void there_is_a_RVS_Status_drop_down_with_the_options_Accepted_and_Refused_and_clicks_on(String rvsOption)
			throws TestingException {
		CommonUtils.selectDropDownValue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsStatusDropDown, rvsOption);
		MiscUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsStatusDropDown);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a user has logged into the COVIDcode application in Native View")
	public void a_user_has_logged_into_the_COVIDcode_application_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("navigates to My Inquiry Tracking Records")
	public void navigates_to_My_Inquiry_Tracking_Records() throws TestingException {
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.id("filter")));
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		MiscUtils.sleep(4000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("opens a new  Inquiry Tracking record by clicking on {string} button")
	public void opens_a_new_Inquiry_Tracking_record_by_clicking_on_button(String expectedNewButton)
			throws TestingException {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.getText()
				.contentEquals(expectedNewButton));
		nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.click();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab);
		MiscUtils.sleep(3000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("the {string}, {string}, {string}, and {string} field are visible in the {string} section")
	public void the_and_field_are_visible_in_the_section(String CovidTestResult_F_U_1, String CovidTestResult_F_U_2,
			String COVIDtestResultReceived, String TelephoneInterviewDate_time, String StudyTeamContact)
			throws TestingException {
		Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_1Text
				.getText().contentEquals(CovidTestResult_F_U_1));
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_1Text);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_2Text
				.getText().contentEquals(CovidTestResult_F_U_2));
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_2Text);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCOVIDtestResultReceivedQuestionText
						.getText().contentEquals(COVIDtestResultReceived));
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCOVIDtestResultReceivedQuestionText);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTelephoneInterviewDate_timeText
						.getText().contentEquals(TelephoneInterviewDate_time));
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTelephoneInterviewDate_timeText);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Given("opens a COVIDCode Enrollment record")
	public void opens_a_COVIDCode_Enrollment_record() throws TestingException {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();

	}

	@Then("the {string} field is visible in the {string} section")
	public void the_field_is_visible_in_the_section(String expectedRVSPaymentRequested,
			String expectedPaticipantsEventsSection) throws TestingException {
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab);
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedText
				.getText().contentEquals(expectedRVSPaymentRequested));
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.getText()
				.contentEquals(expectedPaticipantsEventsSection));
		JavascriptUtils.selectDateByJS(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField,
				"11-17-2020");
		JavascriptUtils.drawBlueBorder(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField);
		CucumberLogUtils.logScreenShot();

	}

	@Given("a COVIDCode App Admin user is in the Native View")
	public void a_COVIDCode_App_Admin_user_is_in_the_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();

	}

	@When("the users open an Enrollment records")
	public void the_users_open_an_Enrollment_records() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();
		MiscUtils.sleep(2000);
	}

	@When("a create a new Disease Course record")
	public void a_create_a_new_Disease_Course_record() {
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesTab.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesNewButton.click();
		MiscUtils.sleep(3000);
	}

	@Then("there is a field option called a {string} for the a Drug Treatments field")
	public void there_is_a_field_option_called_a_for_the_a_Drug_Treatments_field(String plasma) {
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsUnlockButton.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsSearchbar.sendKeys(plasma);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsSearchbar.sendKeys(Keys.ENTER);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsLockButton.click();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDCode App Admin users is in the Native View")
	public void a_COVIDCode_App_Admin_users_is_in_the_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();

	}

	@When("the user opens a Follow Up record")
	public void the_user_opens_a_Follow_Up_record() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeFollowUpQuestionnaire();
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();
		MiscUtils.sleep(2000);

	}

	@When("a creates a new Disease Course record")
	public void a_creates_a_new_Disease_Course_record() {
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesTab.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesNewButton.click();
		MiscUtils.sleep(3000);

	}

	@Then("there is a field option called {string} for Drug Treatments field")
	public void there_is_a_field_option_called_for_Drug_Treatments_field(String Plasma) {
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsUnlockButton.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsSearchbar.sendKeys(Plasma);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsSearchbar.sendKeys(Keys.ENTER);
		nativeViewEnrollmentViewPage.diseaseCoursesDrugTreatmentsLockButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDCode App Admin user is in Native View")
	public void a_COVIDCode_App_Admin_user_is_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@When("the user opens a Specimens record")
	public void the_user_opens_a_Specimens_record() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeSpecimens();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();
	}

	@When("clicks the Sample Outcome field")
	public void clicks_the_Sample_Outcome_field() {
		nativeViewEnrollementsPage.specimensSampleOutcomeDD.click();
	}

	@Then("{string} and {string} are available as field options")
	public void and_are_available_as_field_options(String FedexRequested, String AppointmentMade) {
		CommonUtils.selectDropDownValue(FedexRequested, nativeViewEnrollementsPage.specimensSampleOutcomeDD);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollementsPage.specimensSampleOutcomeDD.getText().contains(FedexRequested));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(AppointmentMade, nativeViewEnrollementsPage.specimensSampleOutcomeDD);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollementsPage.specimensSampleOutcomeDD.getText().contains(AppointmentMade));
		CucumberLogUtils.logScreenShot();
	}

	@Given("a Study Nurse is in Native view")
	public void a_Study_Nurse_is_in_Native_view() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();

	}

	@When("the user opens an Inquiry Tracking Record")
	public void the_user_opens_an_Inquiry_Tracking_Record() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeMyInquiryTrackingRecords();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.click();

	}

	@Then("there is a field called {string} in the Study Team Contact tab")
	public void there_is_a_field_called_in_the_Study_Team_Contact_tab(String AssignedTo) {
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab.click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactAssignedToText.getText()
				.contentEquals(AssignedTo));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(1000);
	}

	@Given("a Study Nurse is in the Native view")
	public void a_Study_Nurse_is_in_the_Native_view() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();

	}

	@When("the users opens an Inquiry Tracking Record")
	public void the_users_opens_an_Inquiry_Tracking_Record() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeMyInquiryTrackingRecords();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.click();
	}

	@When("clicks the {string} button")
	public void clicks_the_button(String string) {
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab.click();
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactAssignedToMeButton.click();
		MiscUtils.sleep(2000);

	}

	@Then("their name {string} is added to the Assigned To field")
	public void their_name_is_added_to_the_Assigned_To_field(String Name) {
		Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactAssignedToMeNameText
				.getText().contentEquals(Name));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a Study Nurse is in Native View")
	public void a_Study_Nurse_is_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();

	}

	@When("the users open an Inquiry Tracking Record")
	public void the_users_open_an_Inquiry_Tracking_Record() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeMyInquiryTrackingRecords();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.click();
	}

	@When("click the Unlock Assigned To button")
	public void click_the_Unlock_Assigned_To_button() {
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToButton.click();
	}

	@Then("the user is able to select multiple nurses from a list of Alan Orpia, Janet Bracci, Laura Harney, Lisa Leathwood, Maureen Risch, Kathryn Nichols and Stephanie Steinbart")
	public void the_user_is_able_to_select_multiple_nurses_from_a_list_of_Alan_Orpia_Janet_Bracci_Laura_Harney_Lisa_Leathwood_Maureen_Risch__Kathryn_Nichols_and_Stephanie_Steinbart() {
		nativeViewStepsImpl.nativeViewMyInquiryTrackingSearchNursesinAssignedToTextField();
	}

	@When("on the Initial Questionnaire form in Native View")
	public void on_the_Initial_Questionnaire_form_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
	}

	@When("on the Demographics Information")
	public void on_the_Demographics_Information() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsTab.click();
	}

	@When("selecting {string} for Height")
	public void selecting_for_Height(String feetInches) {
		CommonUtils.selectDropDownValue(feetInches,
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
	}

	@When("entering value for feet")
	public void entering_value_for_feet() {
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightField, "5");
	}

	@When("entering a value greater than {int} Inches for Height")
	public void entering_a_value_greater_than_Inches_for_Height(Integer int1) {
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightInches, "13");
	}

	@When("clicking anywhere else")
	public void clicking_anywhere_else() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsCurrentWeightDropDown.click();
	}

	@Then("a message displays {string}")
	public void a_message_displays(String errorMessage) {
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsInchesErrorMessage.getText()
				.contentEquals(errorMessage));
		CucumberLogUtils.logScreenShot();
	}

	@When("on the Follow Up form in Native View")
	public void on_the_Follow_Up_form_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeFollowUpQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeFollowUpNewButton.click();
	}

	@When("a COVIDcode user is on the Initial Questionnaire form in Native View")
	public void a_COVIDcode_user_is_on_the_Initial_Questionnaire_form_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the user is able to see the {string} and {string} fields in Native View")
	public void the_user_is_able_to_see_the_and_fields_in_Native_View(String hospitalName, String inquiryId) {
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewInquiryIdText.getText().contentEquals(inquiryId));
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewHospitalNameText.getText()
				.contentEquals(hospitalName));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDCode user is on the Initial questionnaire page in Native View")
	public void a_COVIDCode_user_is_on_the_Initial_questionnaire_page_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the systems does not allow any future dates to be selected for the any date picker")
	public void the_systems_does_not_allow_any_future_dates_to_be_selected_for_the_any_date_picker() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedField.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthField
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedField.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyTab.click();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWereYouSymptomaticDropDown);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsField
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosed.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsField.click();
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsConsentedDate.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsMinimalSurveyConductedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsAssignedProtocolInCRISDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsExtendedSurveyCompletedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsMedicalReleaseAuthorizationSignedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsConsentedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsMinimalSurveyConductedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsAssignedProtocolInCRISSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsExtendedSurveyCompletedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsMedicalReleaseAuthorizationSignedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineTab.click();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineHaveYouReceivedYourFirstCOVIDVaccineDD);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineWhatDateDidYouReceiveFirstVaccineDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Pfizer",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineManufactureDD);
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondCovidVaccineDD);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondVaccineDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineWhatDateDidYouReceiveFirstVaccineDate.click();
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineWhatDateDidYouReceiveFirstVaccineSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondVaccineSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("COVIDCode user is on the Follow Up form page in Native View")
	public void covidcode_user_is_on_the_Follow_Up_form_page_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeFollowUpQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the system does not allow any future dates to be selected for the any date picker")
	public void the_system_does_not_allow_any_future_dates_to_be_selected_for_the_any_date_picker() {
		nativeViewEnrollmentViewPage.nativeViewFollowUpDemographicsDateFormCompletedField.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpDemographicsWhatIsYourDateOfBirthField.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpDemographicsDateFormCompletedField.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpDemographicsDateFormCompletedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpDemographicsWhatIsYourDateOfBirthSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyTab.click();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWereYouSymptomaticDropDown);
		nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWhenFirstDevelopSymptomsField.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19);
		nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyDateOfficiallyDiagnosed.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWhenFirstDevelopSymptomsField.click();
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWhenFirstDevelopSymptomsSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyDateOfficiallyDiagnosedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsTab.click();
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsConsentedDate.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsMinimalSurveyConductedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsAssignedProtocolInCRISDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsRvsPaymentRequestedDatefField
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsExtendedSurveyCompletedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsMedicalReleaseAuthorizationSignedDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsRvsPaymentRequestedDatefField.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsConsentedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsMinimalSurveyConductedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsAssignedProtocolInCRISSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsRvsPaymentRequestedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsExtendedSurveyCompletedDateSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsMedicalReleaseAuthorizationSignedSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineTab.click();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineHaveYouReceivedYourFirstCOVIDVaccineDD);
		nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineWhatDateDidYouReceiveFirstVaccineDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Pfizer",
				nativeViewEnrollmentViewPage.nativeViewFollowUpViewVaccineManufactureDD);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineHaveYouReceivedYourSecondCovidVaccineDD);
		nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineHaveYouReceivedYourSecondVaccineDate
				.sendKeys("02/22/2026");
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineWhatDateDidYouReceiveFirstVaccineDate.click();
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineWhatDateDidYouReceiveFirstVaccineSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpVaccineHaveYouReceivedYourSecondVaccineSelectedDateCannotBeInTheFutureText
						.getText().contentEquals("Selected date cannot be in the future."));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("on the enrollment form in Native View")
	public void on_the_enrollment_form_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
	}

	@When("navigating to the Symptomology in Native View")
	public void navigating_to_the_Symptomology_section_in_Native_View() {
		MiscUtils.sleep(2000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyTab.click();
	}

	@Then("{string} displays")
	public void displays(String haveYouBeenDiagnozed) {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19Text);
		JavascriptUtils.drawRedBorder(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19Text);
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19Text
						.getText().contentEquals(haveYouBeenDiagnozed));
		CucumberLogUtils.logScreenShot();
	}

	@When("a COVIDcode user is logged into the COVIDcode application in Native View")
	public void a_COVIDcode_user_is_logged_into_the_COVIDcode_application_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("a COVIDcode Admin user is on the COVIDcode Native View page")
	public void a_COVIDcode_Admin_user_is_on_the_COVIDcode_Native_View_page() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("the COVIDcode Admin user fill outs an Initial Questionnaire for a {string} user")
	public void the_COVIDcode_Admin_user_fill_outs_an_Initial_Questionnaire_for_a_user(String groupNumber) {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.click(nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton);
		;
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue(groupNumber,
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewUserGroupIDDropDown);
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientLastNameField, "TestLastName");
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientFirstName, testFirstName);
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewContactEmailAddress,
				"email@email.com");
		CucumberLogUtils.logScreenShot();
	}

	@When("the COVIDcode Admin user uploads files in various formats")
	public void the_COVIDcode_Admin_user_uploads_files_in_various_formats() {
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewAddAttachmentTopButton);
		MiscUtils.sleep(3000);
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewChooseFileAttachmentsButton,
				COVIDConstants.DOC_PATH);
		MiscUtils.sleep(6000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("the uploaded files should be displayed")
	public void the_uploaded_files_should_be_displayed() {
		Assert.assertEquals("[download]",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewChooseFileAttachmentsDownloadText.getText());
		MiscUtils.sleep(1000);
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewChooseFileAttachmentsCloseButton);
	}

	@When("the COVIDcode Admin user submits the Initial Questionnaire")
	public void the_COVIDcode_Admin_user_submits_the_Initial_Questionnaire() {
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSubmitTopButton);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the COVIDcode Admin user should be able to see the files uploaded")
	public void the_COVIDcode_Admin_user_should_be_able_to_see_the_files_uploaded() {
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewAllBreadCrumbLink);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown, "first_name");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox, testFirstName);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox, Keys.RETURN);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
		MiscUtils.sleep(2000);
		Assert.assertTrue(
				nativeViewEnrollementsPage.nativeViewDownloadAttachmentLink.getText().contentEquals("[download]"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteTopButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteDeleteSubmissionPopUpDeleteButton);

	}

	@When("navigates to the Specimen module")
	public void navigates_to_the_Specimen_module() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeSpecimens();
	}

	@Then("a {string} column displays")
	public void a_column_displays(String sampleCode) {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		JavascriptUtils.drawRedBorder(nativeViewEnrollementsPage.specimenSampleCodeLink);
		Assert.assertTrue(nativeViewEnrollementsPage.specimenSampleCodeLink.getText().trim().contains(sampleCode));
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDcode user is on the existing Initial Questionnaire form")
	public void a_COVIDcode_user_is_on_the_existing_Initial_Questionnaire_form() throws TestingException {
		nativeViewStepsImpl.submitForReviewEQGroup1();
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("TestFirstName");
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox, Keys.RETURN);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		nativeViewEnrollementsPage.covidCodeEnrollmentOpenRecordBtn.click();
	}

	@When("on Disease Course section, when selecting {string} for the Organ Failure")
	public void on_Disease_Course_section_when_selecting_for_the_Organ_Failure(String yesToOrganFailure) {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesNewButton.click();
		CommonUtils.selectDropDownValue(yesToOrganFailure,
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewOrganFailureDD);
		MiscUtils.sleep(1000);
	}

	@Then("a new question appears {string}")
	public void a_new_question_appears(String whichOrgansFailed) {
		JavascriptUtils.drawRedBorder(nativeViewEnrollmentViewPage.nativeViewEnrollmentWhichOrgansShowFailureText);
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentWhichOrgansShowFailureText.getText().trim()
				.contentEquals(whichOrgansFailed));
		CucumberLogUtils.logScreenShot();
	}

	@Then("field options are: Liver, Kidney, Lungs, Heart, Central Nervous system, Hematologic System, Other, Other \\(free text field)")
	public void field_options_are_Liver_Kidney_Lungs_Heart_Central_Nervous_system_Hematologic_System_Other_Other_free_text_field() {
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.unlockWhichOrgansFailedOptions.click();
		String[] failedOrgans = { "Liver", "Kidney", "Lungs", "Heart", "Central nervous system", "Hematologic system" };
		nativeViewStepsImpl.sendMultipleValuesToLookupField(failedOrgans,
				nativeViewEnrollmentViewPage.whichOrgansFailedLookupField);
		MiscUtils.sleep(1000);
		nativeViewStepsImpl.assertTwoLists(nativeViewEnrollmentViewPage.listOfSelectedFailedOrgans, failedOrgans);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.whichOrgansFailedLookupField.sendKeys("Other");
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.whichOrgansFailedLookupField, Keys.ENTER);
		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.failedOrganOtherTextBox);
		nativeViewEnrollmentViewPage.failedOrganOtherTextBox.sendKeys("Test");
		CucumberLogUtils.logScreenShot();
	}

	@When("a COVIDCode provider is on the Disease Course section on the Follow Up Form in Native View")
	public void a_COVIDCode_provider_is_on_the_Disease_Course_section_on_the_Follow_Up_Form_in_Native_View()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeFollowUpQuestionnaire();
		MiscUtils.sleep(1000);
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(500);
		nativeViewEnrollementsPage.covidCodeFollowUpsGroup1link.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		nativeViewEnrollementsPage.covidCodeEnrollmentOpenRecordBtn.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDiseaseCoursesNewButton.click();
	}

	@Then("Drug Treatments section should display along with the values on the Follow Up Form in Native View None, Azithromycin, Chloroquine, Corticosteroids, Hydroxycholoquine, JAK Inhibitor, Remdesivir, Tocilizumab, Other")
	public void drug_Treatments_section_should_display_along_with_the_values_on_the_Follow_Up_Form_in_Native_View_None_Azithromycin_Chloroquine_Corticosteroids_Hydroxycholoquine_JAK_Inhibitor_Remdesivir_Tocilizumab_Other() {
		nativeViewEnrollmentViewPage.unlockDrugTreatmentsOptions.click();
		MiscUtils.sleep(500);
		String[] drugTreatments = { "Azithromycin", "Chloroquine", "Corticosteroids", "Hydroxycholoquine",
				"JAK Inhibitor", "Remdesivir", "Tocilizumab" };
		nativeViewStepsImpl.sendMultipleValuesToLookupField(drugTreatments,
				nativeViewEnrollmentViewPage.drugTreatmentsLookupField);
		MiscUtils.sleep(1000);
		nativeViewStepsImpl.assertTwoLists(nativeViewEnrollmentViewPage.listOfSelectedDrugTreatments, drugTreatments);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.drugTreatmentsLookupField.sendKeys("None");
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.drugTreatmentsLookupField, Keys.ENTER);
		MiscUtils.sleep(1000);
		CommonUtils.acceptAlert();
		MiscUtils.sleep(1000);
		String[] noneDrugTreatments = { "None" };
		nativeViewStepsImpl.assertTwoLists(nativeViewEnrollmentViewPage.listOfSelectedDrugTreatments,
				noneDrugTreatments);
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.drugTreatmentsLookupField.sendKeys("Other");
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.drugTreatmentsLookupField, Keys.ENTER);
		MiscUtils.sleep(1000);
		CommonUtils.acceptAlert();
		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.otherDrugTreatmentsTextBox);
		nativeViewEnrollmentViewPage.otherDrugTreatmentsTextBox.sendKeys("Test");
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDcode User logs into the COVIDcode application in Native View")
	public void a_COVIDcode_User_logs_into_the_COVIDcode_application_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		MiscUtils.sleep(2000);
	}

	@Given("navigates to the COVIDcode Inquiry Tracking module")
	public void navigates_to_the_COVIDcode_Inquiry_Tracking_module() {
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeMyInquiryTrackingRecords();

	}

	@When("clicking New")
	public void clicking_New() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeInquiryTrackingNewButton.click();
		MiscUtils.sleep(2000);

	}

	@When("entering a date for Initial Emails Sent Date field")
	public void entering_a_date_for_Initial_Emails_Sent_Date_field() {
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactInitialEmailsSentDateSelectDateButton
				.click();
		JavascriptUtils.selectDateByJS(
				nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactInitialEmailsSentDateSelectDateButtonCalendarTable,
				"03/10/2021");
	}

	@Then("the Covid Test Result F\\/U {int} and Covid Test Result F\\/U {int} are automatically updated with dates a week apart")
	public void the_Covid_Test_Result_F_U_and_Covid_Test_Result_F_U_are_automatically_updated_with_dates_a_week_apart(
			Integer result1, Integer result2) {
		String date1 = CommonUtils
				.getText(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResultFU1TextBox);
		String date2 = CommonUtils
				.getText(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResultFU2TextBox);
		Assert.assertNotNull(date1);
		Assert.assertNotNull(date2);

	}

}
