package ServiceNow.COVIDDash.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageCache;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class COVIDHomePageSteps extends PageInitializer{

	private static PageCache pageCache = PageCache.getInstance();

	@Given("User navigates to the COVID{int} Biorepository login page")
	public void user_navigates_to_the_COVID_Biorepository_login_page(Integer int1) throws TestingException {
		covidHomePageImpl.navigateToCOVIDDashLoginPage();
	}

	@When("the User clicks on Login to access button")
	public void the_User_clicls_on_Login_to_access_button() {
		covidHomePageImpl.clickOnLoginToAccessBtn();
	}

	@When("the User is directed to the home page")
	public void the_User_is_directed_to_the_Submissions_home_page() {
		pageCache.getCOVIDHomePageImpl().verifyUserLoggedIn();
	}

	@Given("a User has logged in to the NIH COVID{int} Biorepository Dashboard Application")
	public void a_User_has_logged_in_to_the_NIH_COVID_Biorepository_Dashboard_Application(Integer int1)throws TestingException {
		pageCache.getCOVIDHomePageImpl().loginToCovidDashboard();
	}

	@Given("user validates that Institute, Division, Email Address, and Phone Number fields are not editable")
	public void user_validates_that_Institute_Division_Email_Address_and_Phone_Number_fields_are_not_editabel() {
		pageCache.getCOVIDHomePageImpl().verifyFieldsAreDiabled();
		CucumberLogUtils.logScreenShot();
	}

	@When("the User selects a principal Investigator by typing their name in the principal Investigator search box. {string}")
	public void the_User_selects_a_Primary_Investigator_by_typing_their_name_in_the_Primary_Investigator_search_box(
			String piName) {
		pageCache.getCOVIDHomePageImpl().enterInvestigatorName(piName);
	}

	@Then("the Institute, Division, Email Address, and Phone Number fields are auto-populated. {string},{string},{string},{string}")
	public void the_Institute_Division_Email_Address_and_Phone_Number_fields_are_auto_populated(String inst,String dvsn, String piEml, String piPhn) {
		pageCache.getCOVIDHomePageImpl().checkFieldsAutoPubulated(inst, dvsn, piEml, piPhn);
	}
	
	@Then("the user logs out")
	public void the_user_logs_out() {
	   pageCache.getCOVIDHomePage().logOutFromCovid();
	}

	@Given("the user verifies that the submit button is disbaled by default")
	public void the_user_verifies_that_the_submit_button_is_Disbaled() {
		pageCache.getCOVIDHomePageImpl().submitButtonIsDisbaled();
	}

	@When("the User selects a Principal Investigator {string}")
	public void the_User_selects_a_Principal_Investigator(String investgatorName) {
		pageCache.getCOVIDHomePageImpl().enterInvestigatorName(investgatorName);
	}

	@When("enters a unique IRB Protocol Number which can contain numbers and text such as {string}")
	public void enters_a_unique_IRB_Protocol_Number_which_can_contain_numbers_and_text_such_as(String ibrNumber) {
		pageCache.getCOVIDHomePage().enterIBRProtocolNumber(ibrNumber);
	}

	@When("enters a Study Title as {string}")
	public void enters_a_Study_Title_as(String studyTitle) {
		pageCache.getCOVIDHomePage().enterStudyTitle(studyTitle);
	}

	@When("selects any Biospecimen Type {string} and enters Other type as {string}")
	public void selects_any_Biospecimen_Type_than_enters_Other_type_as(String selectOther, String otherTypeValue) {
		pageCache.getCOVIDHomePageImpl().selectBiospaecimenTypeOtherAndEnterOther(selectOther, otherTypeValue);
	}

	@When("selects any Biospecimen Collection Frequency")
	public void selects_any_Biospecimen_Collection_Frequency() {
		MiscUtils.sleep(2000);
		pageCache.getCOVIDHomePage().selectCollectionFrequency();
	}

	@When("verifies that {string} text is displayed in the Repository Location text box")
	public void verifies_that_text_is_displayed_in_the_Repository_Location_text_box(String repoLocation) {
		pageCache.getCOVIDHomePage().verifiyRepositoryLocation(repoLocation);
	}

	@When("enters Study Specific Aims {string}")
	public void enters_Study_Specific_Aims(String aim) {
		pageCache.getCOVIDHomePage().enterStudySpecificAim(aim);
	}

	@When("attaches an IRB Protocol Document")
	public void attaches_an_IRB_Protocol_Document() {
		pageCache.getCOVIDHomePage().attachStudyDocument();
	}

	@When("attaches a Related URL")
	public void attaches_a_Related_URL() throws TestingException {
		pageCache.getCOVIDHomePage().attachURL();
	}

	@Then("the User is able to successfully submit the study {string}")
	public void the_User_is_able_to_successfully_submit_the_study(String ibrNumber) throws TestingException {
		pageCache.getCOVIDHomePage().clickSubmitAndConfirmSubButton();
		//enter step here

		pageCache.getSubmissionsPageImpl().rejectStudyUsingIbrNumber("Sharon Savage", ibrNumber);
	}

	@Given("a Reviewer navigates to the COVID{int} Biorepository login page")
	public void a_Reviewer_navigates_to_the_COVID_Biorepository_login_page(Integer int1) throws TestingException {
		pageCache.getCOVIDHomePageImpl().navigateToCOVIDDashLoginPage();
	}

	@When("the Reviewer selects Login to access button")
	public void the_Reviewer_selects_Login_to_access_button() {
		pageCache.getCOVIDHomePageImpl().clickOnLoginToAccessBtn();
	}


	@When("does not attach a Related URL")
	public void does_not_attach_a_Related_URL() {
		// NO CODE NEEDED FOR THIS STEP
	}

	@When("attaches multiple Related URL’s")
	public void attaches_multiple_Related_URL_s() {
		pageCache.getCOVIDHomePageImpl().attachingMultipleURLs();
	}

	@When("the User enters all required information")
	public void the_User_enters_all_required_information() {
		pageCache.getCOVIDHomePageImpl().submittingFormWithoutDocumentation();
	}

	@When("does not attach an IRB Protocol Document")
	public void does_not_attach_an_IRB_Protocol_Document() {
		CucumberLogUtils.logScreenShot();
	}

	@When("attempts to confirm and submit the study form")
	public void attempts_to_confirm_and_submit_the_study_form() {
		// CODE FOR THIS STEP IS ADDED IN submittingFormWithoutDocumentation() METHOD
	}

	@Then("the user is not able to successfully submit the study form")
	public void the_user_is_not_able_to_successfully_submit_the_study_form() {
		CucumberLogUtils.logScreenShot();
	}

	@Then("sees a pop up with a message indicating study documentation is required before submitting")
	public void sees_a_pop_up_with_the_message() {
		CucumberLogUtils.logScreenShot();
	}

	@Then("when selecting {string}")
	public void when_selecting(String string) {
		pageCache.getCOVIDHomePage().goBackButton().click();
	}

	@Then("under Study Documentation the user sees the message {string}")
	public void under_Study_Documentation_the_user_sees_the_message(String message) {
		String studyDocErrorMessage = pageCache.getCOVIDHomePage().studyDocumentationErrorMessage().getText();
		Assert.assertTrue(studyDocErrorMessage.contains("required"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the user is on the submissions home page")
	public void the_user_us_on_the_submissions_home_page() {
		// NO CODE NEEDED LOGIN FUNCTION DIRECTS TO HOMEPAGE
	}

	@Then("the user should see the home page below verbiage")
	public void the_user_should_see_the_home_page_verbiage(String verbage) {
		pageCache.getCOVIDHomePageImpl().verifyHomePageVerbiage(verbage);
	}

	@When("the User enters any IRB Protocol Number and immediately deletes it")
	public void the_User_enters_any_IRB_Protocol_Number_and_immediately_deletes_it() {
		pageCache.getCOVIDHomePage().ibrProtocolField().click();
	}

	@When("clicks on any other field on the page")
	public void clicks_on_any_other_field_on_the_page() {
		pageCache.getCOVIDHomePage().studyTileField().click();
	}

	@Then("an error message displays for IRB field with the message {string}")
	public void an_error_message_displays_for_IRB_field_with_the_message(String irbErrorMsge) {
		String IRBErrorMsg = pageCache.getCOVIDHomePage().irbProtocolNumberErrormsg().getText();
		Assert.assertTrue(IRBErrorMsg.contains(irbErrorMsge));
		CucumberLogUtils.logInfo(IRBErrorMsg);
	}

	@When("the User enters any Study Title and immediately deletes it")
	public void the_User_enters_any_Study_Title_and_immediately_deletes_it() {
		pageCache.getCOVIDHomePage().ibrProtocolField().click();
	}

	@Then("an error message displays for title with the message {string}")
	public void an_error_message_displays_for_title_with_the_message(String errorMsge) {
		String StudyTitleErrormsg = pageCache.getCOVIDHomePage().studyTitleErrorMsg().getText();
		Assert.assertTrue(StudyTitleErrormsg.contains(errorMsge));
		CucumberLogUtils.logInfo(StudyTitleErrormsg);
	}

	@When("the User selects a Biospecimen Collection Frequency and then immediately selects no option")
	public void the_User_selects_a_Biospecimen_Type_and_then_immediately_selects_no_option() {
		// NO CODE
	}

	@Then("an error message displays for colection with the message {string}")
	public void an_error_message_displays_for_colection_with_the_message(String string) {
		// NO CODE
	}

	@When("the User enters any Study Specific Aim and immediately deletes it")
	public void the_User_enters_any_Study_Specific_Aim_and_immediately_deletes_it() {
		pageCache.getCOVIDHomePage().studySpecificAims().click();
		pageCache.getCOVIDHomePage().ibrProtocolField().click();
	}

	@Then("an error message displays for aims with the message {string}")
	public void an_error_message_displays_for_aims_with_the_message(String aimErrorMsge) {
		String studySpecifAimsErrMsg = pageCache.getCOVIDHomePage().studySpecificAimsErrorMessage().getText();
		Assert.assertTrue(studySpecifAimsErrMsg.contains(aimErrorMsge));
		CucumberLogUtils.logInfo(studySpecifAimsErrMsg);
	}

	@Given("successfully submits a Study Form")
	public void successfully_submits_a_Study_Form() {
		pageCache.getCOVIDHomePageImpl().successfullFormSubmission("Diego Juarez", "Automation Test", "Automation Test",
				"Automation Test");
	}

	@When("the user impersonates Sharon Savage to reject the study")
	public void impersonating_a_reviewer() throws TestingException {
		pageCache.getSubmissionsPageImpl().rejectStudyUsingIbrNumber("Sharon Savage", "Automation Test");
	}

}
