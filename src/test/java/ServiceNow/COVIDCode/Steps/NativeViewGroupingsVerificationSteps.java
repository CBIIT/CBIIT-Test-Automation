package ServiceNow.COVIDCode.Steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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

public class NativeViewGroupingsVerificationSteps extends PageInitializer {

	@Given("an internal user is logged into native view and searches for {string}")
	public void an_internal_user_is_logged_into_native_view_and_searches_for(String covidCodeApplication)
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewEnrollementsPage.filterNavigator.sendKeys(covidCodeApplication);
		MiscUtils.sleep(3000);
	}

	@Then("the following groupings display:{string}, {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void the_following_groupings_display(String adminGuide, String enrollmentAndFollowUp,
			String formsAssignedToMe, String covidCodeEnrollments, String myDraftEnrollments, String covidCodeFollowUps,
			String myDraftFollowUps, String diseaseCourse, String specimens, String covidCodeDashboard,
			String inquiryTracking, String covidCodeVolunteerSurveys, String covidCodeInquiryTracking,
			String myInquiryTrackingRecords, String inquiryTrackingDashboard, String institutionContactTracking,
			String covidCodeInstitutionContactTracking, String admin, String geCoCovidMultiSelectChoices,
			String hospitalCodes, String notifications) {
		Assert.assertEquals(adminGuide, nativeViewEnrollementsPage.nativeViewPanelNavigatorAdminGuideLink.getText());
		Assert.assertEquals(enrollmentAndFollowUp,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorEnrollmentAndFollowUpLink.getText());
		Assert.assertEquals(formsAssignedToMe,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorFormsAssignedToMeLink.getText());
		Assert.assertEquals(covidCodeEnrollments,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.getText());
		Assert.assertEquals(myDraftEnrollments,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorMyDraftEnrollmentLink.getText());
		Assert.assertEquals(covidCodeFollowUps,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.getText());
		Assert.assertEquals(myDraftFollowUps,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorMyDraftFollowUpsLink.getText());
		Assert.assertEquals(diseaseCourse,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorDiseaseCourseLink.getText());
		Assert.assertEquals(specimens, nativeViewEnrollementsPage.nativeViewPanelNavigatorSpecimensLink.getText());
		Assert.assertEquals(covidCodeDashboard,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeDashboardLink.getText());
		Assert.assertEquals(inquiryTracking,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorInquiryTrackingLink.getText());
		Assert.assertEquals(covidCodeVolunteerSurveys,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeVolunteerSurveysLink.getText());
		Assert.assertEquals(covidCodeInquiryTracking,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInquiryTrackingLink.getText());
		Assert.assertEquals(myInquiryTrackingRecords,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.getText());
		Assert.assertEquals(inquiryTrackingDashboard,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorInquiryTrackingDashboardLink.getText());
		Assert.assertEquals(institutionContactTracking,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorInstitutionContactTrackingLink.getText());
		Assert.assertEquals(covidCodeInstitutionContactTracking,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInstitutionContactTrackingLink.getText());
		Assert.assertEquals(admin, nativeViewEnrollementsPage.nativeViewPanelNavigatorAdminLink.getText());
		Assert.assertEquals(geCoCovidMultiSelectChoices,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorGeCoCovidMultiSelectChoicesLink.getText());
		Assert.assertEquals(hospitalCodes,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorHospitalCodesLink.getText());
		Assert.assertEquals(notifications,
				nativeViewEnrollementsPage.nativeViewPanelNavigatorNotificationsLink.getText());
	}

	@When("an internal user clicks on COVIDCode Enrollments")
	public void an_internal_user_clicks_on_COVIDCode_Enrollments() {
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.click();
		MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Enrollments table with a list of records displays")
	public void a_COVIDCode_Enrollments_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("COVIDcode Enrollments",
				nativeViewEnrollementsPage.covidCodeEnrollmentsContextMenuLink.getText());
		WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on Disease Course")
	public void an_internal_user_clicks_on_Disease_Course() {
		nativeViewEnrollementsPage.nativeViewPanelNavigatorDiseaseCourseLink.click();
		MiscUtils.sleep(3000);
	}

	@Then("a Disease Course table with a list of records displays")
	public void a_Disease_Course_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("Disease Courses", nativeViewEnrollementsPage.diseaseCoursesContextMenuLink.getText());
		WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on COVIDCode Follow Ups")
	public void an_internal_user_clicks_on_COVIDCode_Follow_Ups() {
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.click();
		MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Follow Ups table with a list of records displays")
	public void a_COVIDCode_Follow_Ups_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("COVIDcode Follow Ups", nativeViewEnrollementsPage.followUpsContextMenuLink.getText());
		WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("an internal user clicks on COVIDCode Dashboard")
	public void an_internal_user_clicks_on_COVIDCode_Dashboard() {
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeDashboardLink.click();
		MiscUtils.sleep(3000);
	}

	@Then("a COVIDCode Dashboard table with a list of records displays")
	public void a_COVIDCode_Dashboard_table_with_a_list_of_records_displays() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("COVIDcode Dashboard",
				nativeViewEnrollementsPage.covidCodeDashboardContextMenuLink.getText());
		WebDriverUtils.webDriver.switchTo().defaultContent();
	}

	@When("navigating to the Specimens module in Native View")
	public void navigating_to_the_Specimens_module_in_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.click();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Opened by", nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("Diego Juarez");
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();
		MiscUtils.sleep(1000);
		nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsTab.click();
		MiscUtils.sleep(1000);
		JavascriptUtils.selectDateByJS(nativeViewEnrollmentViewPage.nativeViewFollowUpParticipantEventsConsentedDate,
				"01/20/2021");
		MiscUtils.sleep(3000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPageSaveButton.click();
		MiscUtils.sleep(10000);
		JavascriptUtils.scrollDown(2000);
		JavascriptUtils.clickByJS(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSpecimensTab);
		MiscUtils.sleep(5000);
		JavascriptUtils.clickByJS(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSpecimensNewButton);
		MiscUtils.sleep(3000);
		CommonUtils.selectDropDownValue("Saliva", nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSpecimensTypeDD);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSpecimensSubmitButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPageSaveButton.click();
		MiscUtils.sleep(2000);
		CommonUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorSpecimensLink.click();
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
	}

	@When("opening a Specimen record")
	public void opening_a_Specimen_record() {
		MiscUtils.sleep(5000);
		CommonUtils.webDriver.switchTo().frame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(5000);
		nativeViewEnrollementsPage.specimensPreviewButton.click();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.specimensOpenRecordButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("for Specimens records, a new field option for the Sample Outcome drop down {string} displays")
	public void for_Specimens_records_a_new_field_option_for_the_Sample_Outcome_drop_down_displays(String hold) {
		CommonUtils.selectDropDownValue(hold, nativeViewEnrollementsPage.specimensSampleOutcomeDD);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nativeViewEnrollementsPage.specimensSampleOutcomeDD.getText().contains(hold));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDcode user is logs into native view")
	public void a_COVIDcode_user_is_logs_into_native_view() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("searches for the COVIDcode application")
	public void searches_for_the_COVIDcode_application() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
	}

	@Given("navigates to COVIDcode Inquiry Tracking")
	public void navigates_to_COVIDcode_Inquiry_Tracking() {
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInquiryTrackingLink.click();
	}

	@Given("clicks on New")
	public void clicks_on_New() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeInquiryTrackingNewButton.click();
		MiscUtils.sleep(2000);
	}

	@When("selecting Constented to for Outcome")
	public void selecting_Constented_to_for_Outcome() {
		CommonUtils.selectDropDownValue("Consented", nativeViewEnrollementsPage.covidCodeInquiryTrackingOutcomeDD);
		MiscUtils.sleep(1000);
	}

	@Then("the user group ID is automatically set to {string}")
	public void the_user_group_ID_is_automatically_set_to(String group) {
		Select s = new Select(nativeViewEnrollementsPage.covidCodeInquiryTrackingUserGroupIdDD);
		String selectedValue = s.getFirstSelectedOption().getText();
		Assert.assertTrue(selectedValue.contentEquals(group));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("a COVIDcode User is on the Follow Up form")
	public void a_COVIDcode_User_is_on_the_Follow_Up_form() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeFollowUpQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(1000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("navigating to the Symptomology tab")
	public void navigating_to_the_Symptomology_tab() {
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyTab);
		nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyTab.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("the following fields display: {string}, {string}, {string}, {string}")
	public void the_following_fields_display(String wereYouSymptomatic, String howWasTheSampleTaken, String typeOfTest,
			String dateOfficiallyDiagnosed) {
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWereYouSymptomaticText.getText()
				.contentEquals(wereYouSymptomatic));
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyHowWasTheSampleTakenText.getText()
				.contentEquals(howWasTheSampleTaken));
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWhatTypeOfTestDidThePatientReceiveText
						.getText().contentEquals(typeOfTest));
		Assert.assertTrue(nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyHaveYouOfficiallyBeenDiagnosedText
				.getText().contentEquals(dateOfficiallyDiagnosed));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("when selecting {string} to Were you symptomatic?")
	public void when_selecting_to_Were_you_symptomatic(String yes) {
		CommonUtils.selectDropDownValue(yes,
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWereYouSymptomaticDD);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("when did you first develop symptoms of COVID{int}? date picker displays")
	public void when_did_you_first_develop_symptoms_of_COVID_date_picker_displays(Integer int1) {
		Assert.assertTrue(
				nativeViewEnrollmentViewPage.nativeViewFollowUpSymptomologyWhenDidYouFirstDevelopSymptomsTextLabel
						.getText().contentEquals("When did you first develop symptoms of COVID-19?"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

}
