package ServiceNow.COVIDCode.Steps;



import org.junit.Assert;
import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NativeViewEQSubmissionSteps extends PageInitializer {

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
	public void the_COVIDcode_user_is_on_the_COVIDcode_Study_Native_View_application() throws TestingException{
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
		JavascriptUtils.drawBlueBorder(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsStatusDropDown);
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
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("opens a new  Inquiry Tracking record by clicking on {string} button")
	public void opens_a_new_Inquiry_Tracking_record_by_clicking_on_button(String expectedNewButton) throws TestingException{
	 CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
	 Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.getText().contentEquals(expectedNewButton));
	 nativeViewEnrollementsPage.myInquiryTrackingRecordsNewButton.click();
	 MiscUtils.sleep(2000);
	 JavascriptUtils.scrollIntoView(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab);
	 MiscUtils.sleep(3000);
	 nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTab.click();
	 MiscUtils.sleep(2000);
	 CucumberLogUtils.logScreenShot();
	
	}

	@Then("the {string}, {string}, {string}, and {string} field are visible in the {string} section")
	public void the_and_field_are_visible_in_the_section(String CovidTestResult_F_U_1, String CovidTestResult_F_U_2, String COVIDtestResultReceived, String TelephoneInterviewDate_time,
			String StudyTeamContact) throws TestingException {
		 Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_1Text.getText().contentEquals(CovidTestResult_F_U_1));
		 JavascriptUtils.drawBlueBorder(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_1Text);
		 MiscUtils.sleep(2000);
		 CucumberLogUtils.logScreenShot();
		 Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_2Text.getText().contentEquals(CovidTestResult_F_U_2));
		 JavascriptUtils.drawBlueBorder(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCovidTestResult_F_U_2Text);
		 MiscUtils.sleep(2000);
		 CucumberLogUtils.logScreenShot();
		 Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCOVIDtestResultReceivedQuestionText.getText().contentEquals(COVIDtestResultReceived));
		 JavascriptUtils.drawBlueBorder(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactCOVIDtestResultReceivedQuestionText);
		 MiscUtils.sleep(2000);
		 CucumberLogUtils.logScreenShot();
		 Assert.assertTrue(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTelephoneInterviewDate_timeText.getText().contentEquals(TelephoneInterviewDate_time));
		 JavascriptUtils.drawBlueBorder(nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactTelephoneInterviewDate_timeText);
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
	public void the_field_is_visible_in_the_section(String expectedRVSPaymentRequested,String expectedPaticipantsEventsSection) throws TestingException {
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab);
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedText.getText().contentEquals(expectedRVSPaymentRequested));
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.getText().contentEquals(expectedPaticipantsEventsSection));
		JavascriptUtils.selectDateByJS(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField,"11-17-2020");
		JavascriptUtils.drawBlueBorder(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField);
		CucumberLogUtils.logScreenShot();

	}

}
