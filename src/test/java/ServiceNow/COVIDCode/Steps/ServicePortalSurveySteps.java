package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
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
		CommonUtils.waitForClickability(covidCodeLoginPage.volunteerForTheStudy);
		JavascriptUtils.clickByJS(covidCodeLoginPage.volunteerForTheStudy);
		
	}

	@Then("the {string} page displays with the option to start the survey")
	public void the_page_displays_with_the_option_to_start_the_survey(String covidCodeVolunteerSurveyText) {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(
				servicePortalSurveyPage.covidCodeVolunteerSurvey.getText().contains(covidCodeVolunteerSurveyText));
		System.out.println(servicePortalSurveyPage.covidCodeVolunteerSurvey.getText());
		CucumberLogUtils.logScreenShot();
	}

	@When("starting the survey")
	public void starting_the_survey() {
		JavascriptUtils.clickByJS(servicePortalSurveyPage.getStartedButton);
	//	servicePortalSurveyPage.getStartedButton.click();
	}

	@When("the user selects option to fill out the survery for themselves")
	public void the_user_selects_option_to_fill_out_the_survery_for_themselves() {
		servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.areYouFillingThisOutForYourselfDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, "Myself");
	}

	@Then("the question {string} populates")
	public void populates(String haveYouTestedPositiveForSARS) {
		Assert.assertTrue(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText()
				.contains(haveYouTestedPositiveForSARS));
		System.out.println(servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2Text.getText());
	}

	@When("selecting No")
	public void selecting_No() {
		servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDown.click();
		List<WebElement> values = servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, "No");
	}

	@Then("the question {string} displays")
	public void the_question_displays(String howWasSampleTakenTxt) {
		Assert.assertTrue(
				servicePortalSurveyPage.howWasTheSampleTakenTxt.getText().contentEquals(howWasSampleTakenTxt));
	}

	@When("selecting {string}")
	public void selecting(String nasalOrThroatSwab) {
		servicePortalSurveyPage.howWasTheSampleTakenDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.howWasTheSampleTakenDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, nasalOrThroatSwab);
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting {string} checkbox")
	public void selecting_checkbox(String rapidTesting) {
		servicePortalSurveyPage.rapidTestingCheckbox.click();
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting No for being able to provide a copy of test report")
	public void selecting_No_for_being_able_to_provide_a_copy_of_test_report() {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.canYouProvideCopyofTestReportDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, "No");
		CucumberLogUtils.logScreenShot();
	}

	@When("selecting No for for ever being hospitalized")
	public void selecting_No_for_for_ever_being_hospitalized() {
		servicePortalSurveyPage.wereYouEverHospitalizedDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.wereYouEverHospitalizedDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, "No");
		CucumberLogUtils.logScreenShot();
	}

	@When("clicking next")
	public void clicking_next() {
		servicePortalSurveyPage.nextButton.click();
	}

	@Then("the {string} displays where the user is able to enter their contact information")
	public void the_displays_where_the_user_is_able_to_enter_their_contact_information(String contactInformation) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.contactInformationTxt);
		Assert.assertTrue(servicePortalSurveyPage.contactInformationTxt.getText().contentEquals(contactInformation));
		CucumberLogUtils.logScreenShot();
	}

	@When("entering required information")
	public void entering_required_information() {
		servicePortalSurveyPage.firstNameTextBox.sendKeys("AutomatedFirstName");
		servicePortalSurveyPage.lastNameTextBox.sendKeys("AutomatedLastName");
		servicePortalSurveyPage.phoneNumberTextBox.sendKeys("703-687-5816");
		servicePortalSurveyPage.emailAddressTextBox.sendKeys("automatedtest@test.com");
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.preferredMethodOfContactTxt);
		servicePortalSurveyPage.preferredMethodOfContactDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.preferredMethodOfContactDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, "Phone");
		servicePortalSurveyPage.yearOfBirthTextBox.sendKeys("1990");
		servicePortalSurveyPage.homeZipCodeTextBox.sendKeys("22015");
	}

	@When("clicking next to proceed")
	public void clicking_next_to_proceed() {
		servicePortalSurveyPage.nextButton.click();
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
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, preferNotToAnswer);
	}

	@When("clicking Submit")
	public void clicking_Submit() {
		servicePortalSurveyPage.submitButton.click();
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
		servicePortalSurveyPage.okButton.click();
		MiscUtils.sleep(2000);
	}

	@Then("the user is prompted back to the COVIDCode Study Home Page")
	public void the_user_is_prompted_back_to_the_COVIDCode_Study_Home_Page() {
		// Why are we doing this study? text on home page
		Assert.assertTrue(covidCodeLoginPage.whyAreWeDoingThisStudyTxt.getText().contains("WHY ARE WE DOING"));
	}

	@Then("the following header displays {string} followed by a body description {string}")
	public void the_following_header_displays_followed_by_a_body_description(String whyAreWeDoingThisStudyHeader,
			String coronavirus2019Paragraph) {
		Assert.assertTrue(
				covidCodeLoginPage.whyAreWeDoingThisStudyTxt.getText().contentEquals(whyAreWeDoingThisStudyHeader));
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
		nativeViewEnrollementsPage.covidCodeVolunteerSurveysLink.click();
	}

	@When("clicking on a submitted Survey Number")
	public void clicking_on_an_existing_follow_up_surverys_Group_ID() {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.frame);
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
		List<WebElement> values = servicePortalSurveyPage.haveYouTestedPositiveForSARSCoV2DropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, haveYouTestedPositiveYesOrNo);
	}

	@When("{string} sample taken is selected")
	public void sample_taken_is_selected(String howWasTheSampleTaken) {
		servicePortalSurveyPage.howWasTheSampleTakenDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.howWasTheSampleTakenDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howWasTheSampleTaken);
		CucumberLogUtils.logScreenShot();
	}

	@When("{string} option is selected for being able to provide a copy of test report")
	public void option_is_selected_for_being_able_to_provide_a_copy_of_test_report(String canYouProvideAcopyOfTestYesOrNo) {
		JavascriptUtils.scrollIntoView(servicePortalSurveyPage.canYouProvideCopyofTestReportTxt);
		servicePortalSurveyPage.canYouProvideCopyofTestReportDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.canYouProvideCopyofTestReportDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, canYouProvideAcopyOfTestYesOrNo);
		CucumberLogUtils.logScreenShot();
	}

	@When("{string} option is selected for being hospitalized")
	public void option_is_selected_for_being_hospitalized(String wereYouHospitalizedYesOrNo) {
		servicePortalSurveyPage.wereYouEverHospitalizedDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.wereYouEverHospitalizedDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, wereYouHospitalizedYesOrNo);
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} option is selected for finding out about the study")
	public void option_is_selected_for_finding_out_about_the_study(String howDidYouFindOutAboutStudy) {
		servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDown.click();
		List<WebElement> values = servicePortalSurveyPage.howDidYouFindOutAboutOurStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, howDidYouFindOutAboutStudy);
	}



}
