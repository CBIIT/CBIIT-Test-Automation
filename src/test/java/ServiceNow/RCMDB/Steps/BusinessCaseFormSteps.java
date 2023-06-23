package ServiceNow.RCMDB.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;

import ServiceNow.RCMDB.Pages.BusinessCaseFormPage;
import ServiceNow.RCMDB.Pages.LoginStepsImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessCaseFormSteps {

	private BusinessCaseFormPage businessCaseFormPage;
	private LoginStepsImpl loginStepsImpl;

	@Before
	public void before() {
		this.businessCaseFormPage = new BusinessCaseFormPage();
		this.loginStepsImpl = new LoginStepsImpl();
	}

	@Given("User opens IT Procurement Governance application in browser")
	public void openATOApp() {
		businessCaseFormPage.openApp();
	}

	@When("Click on {string}")
	public void navigateToQUickLin(String quickLinkOption) {
		try {
			businessCaseFormPage.selectOptionFromQuickLink(quickLinkOption);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("State is updated to {string}")
	public void verifystate(String expectedState) throws Exception {
		Thread.sleep(7000);
		String actualState = businessCaseFormPage.getState();
		CucumberLogUtils.logScreenShot("Request State");
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals(expectedState, actualState);
		}
	}

	@Then("Start a new idea case")
	public void startIdea() {
		businessCaseFormPage.startANewIdea();
	}

	@Then("Fill Idea case details")
	public void fillIdeaDetails() throws InterruptedException {
		businessCaseFormPage.selectDocDirector("Justin Cam");
		businessCaseFormPage.fillFITARATextBox();
		businessCaseFormPage.fillIDeaBox("Test IDea Form");
		businessCaseFormPage.programaticSUpportCheckBox();
	}

	@Then("Add comment")
	public void addComments() {
		businessCaseFormPage.enterComments("Test Comments");
	}

	@Then("Click on save and continue")
	public void saveContinue() {
		businessCaseFormPage.saveContinueButton();
	}

	@Then("User expands activity section and verify comment")
	public void verifyComment() throws Exception {
		businessCaseFormPage.expandActivity();
		businessCaseFormPage.verifyIfCommentIsThere();
	}

	@Then("Enter feedback")
	public void enterFeedback() throws Exception {
		Thread.sleep(10000);
		businessCaseFormPage.enterFeedback("Test Automation");
	}

	@Then("User rejects Request")
	public void rejectRequest() {
		businessCaseFormPage.rejectRequest();
	}

	@Then("Click On need more info")
	public void needMoreInfo() {
		businessCaseFormPage.needMoreInfoOnRequest();
	}

	@Then("Click on Approve request")
	public void approveRequest() {
		businessCaseFormPage.approveRequest();
	}

	@Then("Open latest Business Case")
	public void openLatestBusinessCase() {
		businessCaseFormPage.sortCreatedDateForBusinessCasesInDecendingOrder();
		businessCaseFormPage.clickOnFirstBusinessCase();
	}

	@Then("Open latest Idea Case")
	public void openLatestIdeaCase() {
		businessCaseFormPage.sortCreatedDateForIdeaCasesInDecendingOrder();
		businessCaseFormPage.clickOnFirstIdeaCase();
	}

	@Then("Update details on business form and submit")
	public void FillBusinessForm() throws InterruptedException {
		businessCaseFormPage.enterTextInBusinessNeedBox("TestingAutomtaionTesting");
	}

	@Then("Go to Native view of application")
	public void getNativeView() {
		businessCaseFormPage.clickOnNativeView();
	}

	@Then("Click on Elevate permision")
	public void elevatePermission() {
		businessCaseFormPage.elevateButton();
	}

	@Then("Open Request approval form and approve")
	public void approve() {
		businessCaseFormPage.approveRequestForm();
	}

	@Then("Open Request approval form and reject")
	public void reject() {
		businessCaseFormPage.rejectRequestForm();
	}

	@Then("Open Request approval form and ask for more info")
	public void askForMoreInfo() {
		businessCaseFormPage.askForMoreInfoOnRequestForm();
	}

	@Then("Verify Email notification with subject as {string}")
	public void verifyEmail(String subject) throws InterruptedException {
		boolean status = businessCaseFormPage.verifyEmail(subject);

		Assert.assertEquals(true, status);

	}

	@Given("user navigates to the Record management home page")
	public void user_navigates_to_the_Record_management_home_page() {
		businessCaseFormPage.openApp();
	}

	@Then("verify that the page has all the exsisting labels")
	public void verify_that_the_page_has_all_the_exsisting_labels() {
		businessCaseFormPage.validateLabels();

	}

	@Then("Validate tracking log")
	public void Validate_tracking_log() {
		businessCaseFormPage.validateTrackingLog();
		CucumberLogUtils.logScreenShot();

	}

	@Then("User clicks on Quaterly Costs")
	public void User_clicks_on_Quaterly_Costs() {
		businessCaseFormPage.clickOnQuaterlyCosts();

	}

	@Then("User clicks on RM Tracking Record Import")
	public void User_clicks_on_RM_Tracking_Record_Import() {
		businessCaseFormPage.clickOnCreateNewRMTrackingRecord();
		CucumberLogUtils.logScreenShot();

	}

	@Then("Click on new Quaterly Cost")
	public void Click_on_new_Quaterly_Cost() {
		businessCaseFormPage.clickOnNewQuaterlyCost();

	}

	@Then("Click on new RM Tracking record")
	public void Click_on_new_RM_Tracking_record() {
		businessCaseFormPage.clickOnNewRMTrackingRecordButton();
		CucumberLogUtils.logScreenShot();

	}

	@Then("Fill all the record details")
	public void Fill_all_the_record_details() {
		businessCaseFormPage.fillRMTrackingForm();

	}

	@Then("Fill all the Quaterly Cost details")
	public void Fill_all_the_Quaterly_Cost_details() throws InterruptedException {
		businessCaseFormPage.fillQuaterlyCostForm();
		CucumberLogUtils.logScreenShot();
	}

	@Then("Validate added recorded")
	public void Validate_added_recorded() throws InterruptedException {
		businessCaseFormPage.validateAddedRecorded();

	}

	@Then("Validate added new record")
	public void Validate_added_new_recorded() throws InterruptedException {
		businessCaseFormPage.validateAddedNewRecord();

	}

	@Then("User clicks on create new record button")
	public void User_clicks_on_create_new_record_button() {
		businessCaseFormPage.clickOnCreateNewRecord();

	}

	@Then("User clicks on all tracking records")
	public void User_clicks_on_all_tracking_record_button() {
		businessCaseFormPage.clickOnAllTrackingRecord();
		CucumberLogUtils.logScreenShot();

	}

	@Then("Click on submit")
	public void ClickOnSubmit() {
		businessCaseFormPage.ClickOnSubmit();
		CucumberLogUtils.logScreenShot();

	}

	@Then("Click on submit record")
	public void Click_on_submit_record() {
		businessCaseFormPage.ClickOnSubmitRecord();
		CucumberLogUtils.logScreenShot();
	}

	@Then("Click on submit button")
	public void Click_on_submit_button() {
		businessCaseFormPage.ClickOnSubmitButton();
		CucumberLogUtils.logScreenShot();

	}

	@Then("Enter Disposition Authority more than accepted limit")
	public void Enter_Disposition_Authority_more_than_accepted_limit() throws InterruptedException {
		businessCaseFormPage.enterInvalidDispositionAuthority();

	}

	@Then("Enter customer name manually")
	public void Enter_customer_name_manually() throws InterruptedException {
		businessCaseFormPage.enterCustomerNameManually();
		CucumberLogUtils.logScreenShot();

	}

	@Then("User should see error message")
	public void User_should_see_error_message() throws InterruptedException {
		businessCaseFormPage.validateErrorMessage();
		CucumberLogUtils.logScreenShot();
	}

	@Then("Fill all the details")
	public void Fill_all_the_details() throws InterruptedException {
		businessCaseFormPage.fillTrackingRecordForm();

	}

	@When("User logins to the application for RCMDB")
	public void login() throws Exception {
		if (loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
		}
		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
		String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		loginStepsImpl.enterPassword(decyptedPass);
		CucumberLogUtils.logScreenShot("Application login");
		loginStepsImpl.clickOnSignInButton();
	}
	
	
	
}
