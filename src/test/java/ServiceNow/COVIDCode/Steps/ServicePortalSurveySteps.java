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

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServicePortalSurveySteps extends PageInitializer {

	@Given("a user is on the COVIDCode home page")
	public void a_user_is_on_the_COVIDCode_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("selects the option to Volunteer")
	public void selects_the_option_to_Volunteer() {
		CommonUtils.waitForClickability(covidCodeLoginPage.volunteerForTheStudyButton);
		JavascriptUtils.clickByJS(covidCodeLoginPage.volunteerForTheStudyButton);
		
	}

	@Then("the {string} page displays with the option to start the survey")
	public void the_page_displays_with_the_option_to_start_the_survey(String covidCodeVolunteerSurveyText) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(
				servicePortalSurveyPage.covidCodeVolunteerSurvey.getText().contentEquals(covidCodeVolunteerSurveyText));
		System.out.println(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText());
		CucumberLogUtils.logScreenShot();
	}

	@When("starting the survey")
	public void starting_the_survey() {
		JavascriptUtils.clickByJS(servicePortalSurveyPage.getStartedButton);
	}

	@When("the user selects option to fill out the survery for themselves")
	public void the_user_selects_option_to_fill_out_the_survery_for_themselves() {
		MiscUtils.sleep(1000);
		CommonUtils.click(servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDown);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDownValues, "Myself");
	}

	@Then("the question {string} populates")
	public void populates(String haveYouTestedPositiveForSARS) {
		MiscUtils.sleep(1000);
		Assert.assertTrue(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText()
				.contentEquals(haveYouTestedPositiveForSARS));
		System.out.println(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText());
	}

	@When("selecting No")
	public void selecting_No() {
		CommonUtils.click(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown);
		MiscUtils.sleep(1000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues, "No");
	}

	@Then("the question {string} displays")
	public void the_question_displays(String howWasSampleTakenTxt) {
		Assert.assertTrue(
				servicePortalSurveyPage.howWasTheSampleTakenTxt.getText().contentEquals(howWasSampleTakenTxt));
	}
	
	@Then("the {string} question displays")
	public void the_question_display(String areYouANationalInstituteOfHealthEmployeeText) {
		Assert.assertTrue(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeText.getText().contentEquals(areYouANationalInstituteOfHealthEmployeeText));
	}

	@Then("selecting No from drop down")
	public void selecting_No_from_drop_down() {
		CommonUtils.click(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDown);
	    CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDownValues, "No");
	}

	@When("selecting {string}")
	public void selecting(String nasalOrThroatSwab) {
		CommonUtils.click(servicePortalSurveyPage.howWasTheSampleTakenDropDown);
		MiscUtils.sleep(1000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.howWasTheSampleTakenDropDownValues, nasalOrThroatSwab);
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} checkbox")
	public void selecting_checkbox(String rapidTesting) {
		CommonUtils.click(servicePortalSurveyPage.rapidTestingCheckbox);
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting No for being able to provide a copy of test report")
	public void selecting_No_for_being_able_to_provide_a_copy_of_test_report() {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		CommonUtils.click(servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown);
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(servicePortalSurveyPage.canYouProvideACopyOfYourTestReportTextBox, "No");
		CommonUtils.sendKeys(servicePortalSurveyPage.canYouProvideACopyOfYourTestReportTextBox, Keys.RETURN);
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting No for for ever being hospitalized")
	public void selecting_No_for_for_ever_being_hospitalized() {
		CommonUtils.click(servicePortalSurveyPage.wereYouEverHospitalizedDropDown);
		MiscUtils.sleep(1000);
		CommonUtils.sendKeys(servicePortalSurveyPage.wereYouEverHospitalizedTextBox, "No");
		CommonUtils.sendKeys(servicePortalSurveyPage.wereYouEverHospitalizedTextBox, Keys.RETURN);
		CucumberLogUtils.logScreenShot();
	}

	@When("clicking next")
	public void clicking_next() {
		CommonUtils.click(servicePortalSurveyPage.nextButton);
	}

	@Then("the {string} displays where the user is able to enter their contact information")
	public void the_displays_where_the_user_is_able_to_enter_their_contact_information(String contactInformation) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.contactInformationTxt);
		Assert.assertTrue(servicePortalSurveyPage.contactInformationTxt.getText().contentEquals(contactInformation));
		CucumberLogUtils.logScreenShot();
	}

	@When("entering required information")
	public void entering_required_information() {
		CommonUtils.sendKeys(servicePortalSurveyPage.firstNameTextBox, "AutomatedFirstName");
		CommonUtils.sendKeys(servicePortalSurveyPage.lastNameTextBox, "AutomatedLastName");
		CommonUtils.sendKeys(servicePortalSurveyPage.phoneNumberTextBox, "703-687-5816");
		CommonUtils.sendKeys(servicePortalSurveyPage.emailAddressTextBox, "automatedtest@test.com");
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		CommonUtils.click(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		MiscUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.preferredMethodOfContactDropDownValues, "Phone");
		CommonUtils.sendKeys(servicePortalSurveyPage.yearOfBirthTextBox, "1990");
		CommonUtils.sendKeys(servicePortalSurveyPage.homeZipCodeTextBox, "22015");
	}

	@When("clicking next to proceed")
	public void clicking_next_to_proceed() {
		CommonUtils.click(servicePortalSurveyPage.nextButton);
	}

	@Then("the {string} page displays with a question regarding the discovery of the survey")
	public void the_page_displays_with_a_question_regarding_the_discovery_of_the_survey(
			String howDidYouHearAboutUsTxt) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.howDidYouHearAboutUsTxt);
		Assert.assertTrue(
				servicePortalSurveyPage.howDidYouHearAboutUsTxt.getText().contentEquals(howDidYouHearAboutUsTxt));
	}

	@When("selecting option {string}")
	public void selecting_option(String preferNotToAnswer) {
		CommonUtils.click(servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown);
		MiscUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues, preferNotToAnswer);
	}

	@When("clicking Submit")
	public void clicking_Submit() {
		CommonUtils.click(servicePortalSurveyPage.submitButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} page displays")
	public void the_page_displays(String surveySubmittedSuccessfully) {
		Assert.assertTrue(servicePortalSurveyPage.yourSurveyHasBeenSubmittedTxt.getText()
				.contentEquals(surveySubmittedSuccessfully));
	}

	@Then("the user is able to see a message {string}")
	public void the_user_is_able_to_see_a_message_followed_the_by_email_address(String ifYouHaveQuestionsTxt) {
		Assert.assertTrue(
				servicePortalSurveyPage.ifYouHaveQuestionsText.getText().contentEquals(ifYouHaveQuestionsTxt));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
	}

	@When("the user selects OK")
	public void the_user_selects_OK() {
		CommonUtils.click(servicePortalSurveyPage.okButton);
		MiscUtils.sleep(2000);
	}

	@Then("the user is prompted back to the COVIDCode Study Home Page")
	public void the_user_is_prompted_back_to_the_COVIDCode_Study_Home_Page() {
		Assert.assertTrue(covidCodeLoginPage.whyAreWeDoingThisStudyHeader.getText().contains("WHY ARE WE DOING"));
	}

	@Then("the following header displays {string} followed by a body description {string}")
	public void the_following_header_displays_followed_by_a_body_description(String whyAreWeDoingThisStudyHeader,
			String coronavirus2019Paragraph) {
		Assert.assertTrue(
				covidCodeLoginPage.whyAreWeDoingThisStudyHeader.getText().contentEquals(whyAreWeDoingThisStudyHeader));
		Assert.assertTrue(covidCodeLoginPage.coronavirus2019Paragraph.getText().contains(coronavirus2019Paragraph));

	}

	@Then("the header {string} with the body description as {string}")
	public void the_header_with_the_body_description_as(String whoCanJoin, String anyoneWhoHasTestedPositive) {
		Assert.assertTrue(covidCodeLoginPage.whoCanJoinHeader.getText().contains(whoCanJoin));
		Assert.assertTrue(
				covidCodeLoginPage.anyoneWhoHasTestedPositiveParagraph.getText().contains(anyoneWhoHasTestedPositive));

	}

	@Then("also the header {string} with the body description {string}")
	public void also_the_header_with_the_body_description(String interestedInVolunteeringHeader,
			String selectingTheButtonBelowParagraph) {
		Assert.assertTrue(covidCodeLoginPage.interestedInVolunteeringHeader.getText()
				.contentEquals(interestedInVolunteeringHeader));
		Assert.assertTrue(covidCodeLoginPage.fillOutACOVIDVolunteerSurveyParagraph.getText()
				.contentEquals(selectingTheButtonBelowParagraph));
	}

	@Then("header {string} with the body description {string}")
	public void header_with_the_body_description(String whatIsInvolvedInTheStudyHeader,
			String provideAbloodSampleParagraph) {
		Assert.assertTrue(
				covidCodeLoginPage.whatIsInvolvedInTheStudyHeader.getText().contains(whatIsInvolvedInTheStudyHeader));
		Assert.assertTrue(
				covidCodeLoginPage.provideAbloodSampleParagraph.getText().contains(provideAbloodSampleParagraph));
	}

	@Then("a statement {string}")
	public void a_statement(String privacyStatement) {
		Assert.assertTrue(covidCodeLoginPage.privacyStatement.getText().contains(privacyStatement));
		CucumberLogUtils.logScreenShot();
	}

	@When("searching for {string} to view follow ups")
	public void searching_for_to_view_follow_ups(String covidCodeVolunteerSurveysTxt) {
		MiscUtils.sleep(3000);
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.id("filter")));
		MiscUtils.sleep(3000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys(covidCodeVolunteerSurveysTxt);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeVolunteerSurveysLink.click();
	}

	@When("clicking on a submitted Survey Number")
	public void clicking_on_an_existing_follow_up_surverys_Group_ID() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeSurveyNumberFirstLink.click();
	}

	@Then("information submitted via the volunteer survey is displayed")
	public void information_submitted_via_the_volunteer_survey_is_displayed() {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	@When("{string} option is selected")
	public void option_is_selected(String haveYouTestedPositiveYesOrNo) {
		servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, haveYouTestedPositiveYesOrNo);
	}

	@When("{string} sample taken is selected")
	public void sample_taken_is_selected(String howWasTheSampleTaken) {
		servicePortalSurveyPage.howWasTheSampleTakenDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.howWasTheSampleTakenDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howWasTheSampleTaken);
		CucumberLogUtils.logScreenShot();
	}
	
	@When("{string} option is selected for being able to choose")
	public void option_is_selected_for_being_able_to_choose(String areYouANationalInstituteOfHealthEmployee) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeText);
		MiscUtils.sleep(1000);
		CommonUtils.click(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDown);
		MiscUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDownValues, areYouANationalInstituteOfHealthEmployee);
	    CucumberLogUtils.logScreenShot();
	}
	
	@Then("{string} required question is displays")
	public void required_question_is_displays(String wereYouTestedByOMSText) {
	    Assert.assertEquals(wereYouTestedByOMSText, servicePortalSurveyPage.wereYouTestedByOMSText.getText());
	}

	@When("{string} option is selected for being tested by OMS")
	public void option_is_selected_for_being_tested_by_OMS(String wereYouTestedByOMS) {
	    CommonUtils.click(servicePortalSurveyPage.wereYouTestedByOMSDropDown);
	    MiscUtils.sleep(3000);
	    CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.wereYouTestedByOMSDropDownValues, wereYouTestedByOMS);
	    CucumberLogUtils.logScreenShot();
	}

	@When("{string} option is selected for being able to provide a copy of test report")
	public void option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String canYouProvideAcopyOfTestYesOrNo) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.canYouProvideCopyofTestReportDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, canYouProvideAcopyOfTestYesOrNo);
		CucumberLogUtils.logScreenShot();
	}

	@When("{string} option is selected for being hospitalized")
	public void option_is_selected_for_being_hospitalized(String wereYouHospitalizedYesOrNo) {
		servicePortalSurveyPage.wereYouEverHospitalizedDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.wereYouEverHospitalizedDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, wereYouHospitalizedYesOrNo);
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} option is selected for finding out about the study")
	public void option_is_selected_for_finding_out_about_the_study(String howDidYouFindOutAboutStudy) {
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howDidYouFindOutAboutStudy);
	}
	
	@Given("a COVIDcode Volunteer Survey has been submitted with zip code {string}")
	public void a_COVIDcode_Volunteer_Survey_has_been_submitted_with_zip_code(String zipCode) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForClickability(covidCodeLoginPage.volunteerForTheStudyButton);
		JavascriptUtils.clickByJS(covidCodeLoginPage.volunteerForTheStudyButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText().contains("COVIDcode Volunteer Survey"));
		System.out.println(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText());
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(servicePortalSurveyPage.getStartedButton);
		MiscUtils.sleep(1000);
		servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDown.click();
		List<WebElement> areYouFillingThisOutForYourselValues = servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(areYouFillingThisOutForYourselValues, "Myself");
		MiscUtils.sleep(1000);
		servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown.click();
		MiscUtils.sleep(1000);
		List<WebElement> TestedPositiveForSARSValues = servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(TestedPositiveForSARSValues, "No");
		servicePortalSurveyPage.nextButton.click();
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.contactInformationTxt);
		Assert.assertTrue(servicePortalSurveyPage.contactInformationTxt.getText().contains("Contact Information"));
		System.out.println(servicePortalSurveyPage.contactInformationTxt.getText());
		servicePortalSurveyPage.firstNameTextBox.sendKeys("TestVolunteerSurvey");
		servicePortalSurveyPage.lastNameTextBox.sendKeys("Test");
		servicePortalSurveyPage.phoneNumberTextBox.sendKeys("123-456-7891");
		servicePortalSurveyPage.emailAddressTextBox.sendKeys("testVolunteerSurvey@test.com");
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		servicePortalSurveyPage.preferredMethodOfContactDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> preferredMethodOfContactValues = servicePortalSurveyPage.preferredMethodOfContactDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(preferredMethodOfContactValues, "Phone");
		servicePortalSurveyPage.homeZipCodeTextBox.sendKeys(zipCode);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		servicePortalSurveyPage.nextButton.click();
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		MiscUtils.sleep(3000);
		List<WebElement> howDidYouFindOutAboutOurStudyValues = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(howDidYouFindOutAboutOurStudyValues, "I prefer not to answer");
		servicePortalSurveyPage.submitButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(servicePortalSurveyPage.yourSurveyHasBeenSubmittedTxt.getText().contains("Your survey has been submitted successfully!"));
		servicePortalSurveyPage.okButton.click();
		MiscUtils.sleep(2000);	
	}

	@Then("Study Staff Nurses are able to see the volunteer's submitted zip code {string} in a Inquiry Tracking record in native view")
	public void study_Staff_Nurses_are_able_to_see_the_volunteer_s_submitted_zip_code_in_a_Inquiry_Tracking_record_in_native_view(String submittedZipCode) throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("COVIDCode Application");
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInquiryTrackingLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown, "contact_email_address");
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("testVolunteerSurvey@test.com");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox,Keys.RETURN);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
		MiscUtils.sleep(2000);
		JavascriptUtils.drawRedBorder(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(submittedZipCode,nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode.getAttribute("value"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteTopButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteDeleteSubmissionPopUpDeleteButton);	
	}



}
