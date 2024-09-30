package ServiceNow.COVIDCode.Steps;

import java.util.List;
import appsCommon.Utils.ServiceNow_Login_Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicePortalSurveySteps extends PageInitializer {

	@Given("a user is on the COVIDCode home page")
	public void a_user_is_on_the_COVIDCode_home_page() {
		WebDriverUtils.webDriver.get("");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("selects the option to Volunteer")
	public void selects_the_option_to_Volunteer() {
		CommonUtils.waitForClickability(covidCodeLoginPage.volunteerForTheStudyButton);
		JavascriptUtils.clickByJS(covidCodeLoginPage.volunteerForTheStudyButton);
		
	}

	@Then("the {string} page displays with the option to start the survey")
	public void the_page_displays_with_the_option_to_start_the_survey(String covidCodeVolunteerSurveyText) {
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(
				servicePortalSurveyPage.covidCodeVolunteerSurvey.getText().contentEquals(covidCodeVolunteerSurveyText));
		System.out.println(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText());
		CucumberLogUtils.logScreenshot();
	}

	@When("starting the survey")
	public void starting_the_survey() {
		JavascriptUtils.clickByJS(servicePortalSurveyPage.getStartedButton);
	}

	@When("the user selects option to fill out the survery for themselves")
	public void the_user_selects_option_to_fill_out_the_survery_for_themselves() {
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDown);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDownValues, "Myself");
	}

	@Then("the question {string} populates")
	public void populates(String haveYouTestedPositiveForSARS) {
		CommonUtils.sleep(1000);
		Assert.assertTrue(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText()
				.contentEquals(haveYouTestedPositiveForSARS));
		System.out.println(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText());
	}

	@When("selecting No")
	public void selecting_No() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown);
		CommonUtils.sleep(1000);
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
		CommonUtils.clickOnElement(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDown);
	    CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDownValues, "No");
	}

	@When("selecting {string}")
	public void selecting(String nasalOrThroatSwab) {
		CommonUtils.clickOnElement(servicePortalSurveyPage.howWasTheSampleTakenDropDown);
		CommonUtils.sleep(1000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.howWasTheSampleTakenDropDownValues, nasalOrThroatSwab);
		CucumberLogUtils.logScreenshot();
	}

	@When("selecting {string} checkbox")
	public void selecting_checkbox(String rapidTesting) {
		CommonUtils.clickOnElement(servicePortalSurveyPage.rapidTestingCheckbox);
		CucumberLogUtils.logScreenshot();
	}

	@When("selecting No for being able to provide a copy of test report")
	public void selecting_No_for_being_able_to_provide_a_copy_of_test_report() {
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		CommonUtils.clickOnElement(servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown);
		CommonUtils.sleep(1000);
		CommonUtils.sendKeys(servicePortalSurveyPage.canYouProvideACopyOfYourTestReportTextBox, "No");
		CommonUtils.sendKeys(servicePortalSurveyPage.canYouProvideACopyOfYourTestReportTextBox, Keys.RETURN);
		CucumberLogUtils.logScreenshot();
	}

	@When("selecting No for for ever being hospitalized")
	public void selecting_No_for_for_ever_being_hospitalized() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.wereYouEverHospitalizedDropDown);
		CommonUtils.sleep(1000);
		CommonUtils.sendKeys(servicePortalSurveyPage.wereYouEverHospitalizedTextBox, "No");
		CommonUtils.sendKeys(servicePortalSurveyPage.wereYouEverHospitalizedTextBox, Keys.RETURN);
		CucumberLogUtils.logScreenshot();
	}

	@When("clicking next")
	public void clicking_next() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.nextButton);
	}

	@Then("the {string} displays where the user is able to enter their contact information")
	public void the_displays_where_the_user_is_able_to_enter_their_contact_information(String contactInformation) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.contactInformationTxt);
		Assert.assertTrue(servicePortalSurveyPage.contactInformationTxt.getText().contentEquals(contactInformation));
		CucumberLogUtils.logScreenshot();
	}

	@When("entering required information")
	public void entering_required_information() {
		CommonUtils.sendKeys(servicePortalSurveyPage.firstNameTextBox, "AutomatedFirstName");
		CommonUtils.sendKeys(servicePortalSurveyPage.lastNameTextBox, "AutomatedLastName");
		CommonUtils.sendKeys(servicePortalSurveyPage.phoneNumberTextBox, "703-687-5816");
		CommonUtils.sendKeys(servicePortalSurveyPage.emailAddressTextBox, "automatedtest@test.com");
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		CommonUtils.waitForVisibility(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		CommonUtils.clickOnElement(servicePortalSurveyPage.preferredMethodOfContactDropDown);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.preferredMethodOfContactDropDownValues, "Phone");
		CommonUtils.sendKeys(servicePortalSurveyPage.yearOfBirthTextBox, "1990");
		CommonUtils.sendKeys(servicePortalSurveyPage.homeZipCodeTextBox, "22015");
	}

	@When("clicking next to proceed")
	public void clicking_next_to_proceed() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.nextButton);
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
		CommonUtils.clickOnElement(servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown);
		CommonUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues, preferNotToAnswer);
	}

	@When("clicking Submit")
	public void clicking_Submit() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.submitButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
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
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(2000);
	}

	@When("the user selects OK")
	public void the_user_selects_OK() {
		CommonUtils.clickOnElement(servicePortalSurveyPage.okButton);
		CommonUtils.sleep(2000);
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
		CucumberLogUtils.logScreenshot();
	}

	@When("searching for {string} to view follow ups")
	public void searching_for_to_view_follow_ups(String covidCodeVolunteerSurveysTxt) {
		CommonUtils.sleep(3000);
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.id("filter")));
		CommonUtils.sleep(3000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys(covidCodeVolunteerSurveysTxt);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(3000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeVolunteerSurveysLink.click();
	}

	@When("clicking on a submitted Survey Number")
	public void clicking_on_an_existing_follow_up_surverys_Group_ID() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeSurveyNumberFirstLink.click();
	}

	@Then("information submitted via the volunteer survey is displayed")
	public void information_submitted_via_the_volunteer_survey_is_displayed() {
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	
	@When("{string} option is selected")
	public void option_is_selected(String haveYouTestedPositiveYesOrNo) {
		servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, haveYouTestedPositiveYesOrNo);
	}

	@When("{string} sample taken is selected")
	public void sample_taken_is_selected(String howWasTheSampleTaken) {
		servicePortalSurveyPage.howWasTheSampleTakenDropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.howWasTheSampleTakenDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howWasTheSampleTaken);
		CucumberLogUtils.logScreenshot();
	}
	
	@When("{string} option is selected for being able to choose")
	public void option_is_selected_for_being_able_to_choose(String areYouANationalInstituteOfHealthEmployee) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeText);
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDown);
		CommonUtils.sleep(3000);
		CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.areYouANationalInstituteOfHealthEmployeeDropDownValues, areYouANationalInstituteOfHealthEmployee);
	    CucumberLogUtils.logScreenshot();
	}
	
	@Then("{string} required question is displays")
	public void required_question_is_displays(String wereYouTestedByOMSText) {
	    Assert.assertEquals(wereYouTestedByOMSText, servicePortalSurveyPage.wereYouTestedByOMSText.getText());
	}

	@When("{string} option is selected for being tested by OMS")
	public void option_is_selected_for_being_tested_by_OMS(String wereYouTestedByOMS) {
	    CommonUtils.clickOnElement(servicePortalSurveyPage.wereYouTestedByOMSDropDown);
	    CommonUtils.sleep(3000);
	    CommonUtils.selectValueFromBootStrapDropDown(servicePortalSurveyPage.wereYouTestedByOMSDropDownValues, wereYouTestedByOMS);
	    CucumberLogUtils.logScreenshot();
	}

	@When("{string} option is selected for being able to provide a copy of test report")
	public void option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String canYouProvideAcopyOfTestYesOrNo) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.canYouProvideCopyofTestReportDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, canYouProvideAcopyOfTestYesOrNo);
		CucumberLogUtils.logScreenshot();
	}

	@When("{string} option is selected for being hospitalized")
	public void option_is_selected_for_being_hospitalized(String wereYouHospitalizedYesOrNo) {
		servicePortalSurveyPage.wereYouEverHospitalizedDropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.wereYouEverHospitalizedDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, wereYouHospitalizedYesOrNo);
		CucumberLogUtils.logScreenshot();
	}

	@Then("{string} option is selected for finding out about the study")
	public void option_is_selected_for_finding_out_about_the_study(String howDidYouFindOutAboutStudy) {
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> values = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howDidYouFindOutAboutStudy);
	}
	
	@Given("a COVIDcode Volunteer Survey has been submitted with zip code {string}")
	public void a_COVIDcode_Volunteer_Survey_has_been_submitted_with_zip_code(String zipCode)  {
		WebDriverUtils.webDriver.get("");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForClickability(covidCodeLoginPage.volunteerForTheStudyButton);
		JavascriptUtils.clickByJS(covidCodeLoginPage.volunteerForTheStudyButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText().contains("COVIDcode Volunteer Survey"));
		System.out.println(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText());
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(servicePortalSurveyPage.getStartedButton);
		CommonUtils.sleep(1000);
		servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDown.click();
		List<WebElement> areYouFillingThisOutForYourselValues = servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(areYouFillingThisOutForYourselValues, "Myself");
		CommonUtils.sleep(1000);
		servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown.click();
		CommonUtils.sleep(1000);
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
		CommonUtils.sleep(3000);
		List<WebElement> preferredMethodOfContactValues = servicePortalSurveyPage.preferredMethodOfContactDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(preferredMethodOfContactValues, "Phone");
		servicePortalSurveyPage.homeZipCodeTextBox.sendKeys(zipCode);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		servicePortalSurveyPage.nextButton.click();
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		CommonUtils.sleep(3000);
		List<WebElement> howDidYouFindOutAboutOurStudyValues = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(howDidYouFindOutAboutOurStudyValues, "I prefer not to answer");
		servicePortalSurveyPage.submitButton.click();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(servicePortalSurveyPage.yourSurveyHasBeenSubmittedTxt.getText().contains("Your survey has been submitted successfully!"));
		servicePortalSurveyPage.okButton.click();
		CommonUtils.sleep(2000);	
	}

	@Then("Study Staff Nurses are able to see the volunteer's submitted zip code {string} in a Inquiry Tracking record in native view")
	public void study_Staff_Nurses_are_able_to_see_the_volunteer_s_submitted_zip_code_in_a_Inquiry_Tracking_record_in_native_view(String submittedZipCode)  {
		ServiceNow_Login_Methods.nativeViewLogin();
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("COVIDCode Application");
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeInquiryTrackingLink.click();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		CommonUtils.sleep(2000);
		CommonUtils.selectDropDownValue(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown, "contact_email_address");
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("testVolunteerSurvey@test.com");
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox,Keys.RETURN);
		CommonUtils.sleep(1000);
		JavascriptUtils.clickByJS(nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
		CommonUtils.sleep(2000);
		JavascriptUtils.drawRedBorder(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		Assert.assertEquals(submittedZipCode,nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode.getAttribute("value"));
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteTopButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDeleteDeleteSubmissionPopUpDeleteButton);
	}



}
