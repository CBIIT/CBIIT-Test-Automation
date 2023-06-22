package ServiceNow.ITPG.Steps;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.JavascriptUtils;

import ServiceNow.ITPG.Pages.BusinessCaseFormPage;
import ServiceNow.ITPG.StepsImplementation.LoginStepsImpl;
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

	@When("User logins to the application")
	public void login() throws Exception {
		if (loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
		}
		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
		String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		CucumberLogUtils.logScreenShot("Application login");
		// loginStepsImpl.enterUsername(ConfUtils.getProperty("Username"));
		// decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("Password"));
		loginStepsImpl.enterPassword(decyptedPass);
		CucumberLogUtils.logScreenShot("Application login");
		// loginPage.enterUsername(ConfigFileReader.getConfigFileReader().getUserName());
		// loginPage.enterPassword(ConfigFileReader.getConfigFileReader().getPassword());
		loginStepsImpl.clickOnSignInButton();

	}

	@Then("Start a new business case")
	public void startIdea() {
		businessCaseFormPage.startANewIdea();
	}

	@Then("verify that clone business case button is available and functional")
	public void closeBusinessCase() {
		businessCaseFormPage.cloneAndVerify();
	}

	@Then("verify Request Assistance button is present on the screen")
	public void requestAssistanceButton() {
		businessCaseFormPage.verifyRequestAssitanceButton();
	}

	@Then("enter today plus {int}days date in approval date requested field")
	public void enter_today_plus_days_date_in_approval_date_requested_field(Integer int1) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime todayplus8days = now.plusDays(8);
		System.out.println(dtf.format(todayplus8days).toString());
		businessCaseFormPage.SetApprovalRequestedDate(dtf.format(todayplus8days).toString());

	}

	@Then("validate the error message for approval date requested field")
	public void validate_the_error_message_for_approval_date_requested_field() {
		boolean popupavailable = businessCaseFormPage.errorPopupAvailable();
		Assert.assertTrue(popupavailable);
	}

	@Then("enter today plus {int} days in approval date requested field")
	public void enter_today_plus_days_in_approval_date_requested_field(Integer int1) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime todayplus8days = now.plusDays(13);
		System.out.println(dtf.format(todayplus8days).toString());
		businessCaseFormPage.SetApprovalRequestedDate(dtf.format(todayplus8days).toString());

	}

	@Then("validate no error message is displayed for approval date requested field")
	public void validate_no_error_message_is_displayed_for_approval_date_requested_field() {
		boolean popupavailable = businessCaseFormPage.errorPopupAvailable();
		Assert.assertFalse(popupavailable);
	}

	@Then("validate the text on the page")
	public void validate_the_text_on_the_page() {
		businessCaseFormPage.validateHeaderText();
	}

	@Then("validate that the hide assistance request button is not available on screen")
	public void validateMissingButton() {
		businessCaseFormPage.validateMissingButton();
	}

	@Then("Fill business case details")
	public void fillIdeaDetails() throws InterruptedException {
		businessCaseFormPage.selectDocDirector("Justin Cam");
		businessCaseFormPage.fillFITARATextBox();
		businessCaseFormPage.clickOnProgramaticApprover();
		businessCaseFormPage.selectProgramaticApprover("David Coat");
		businessCaseFormPage.setProjectName("Test222");
		businessCaseFormPage.fillIDeaBox("Test IDea Form");
		businessCaseFormPage.FillGoalScopeTextBox("Goal Scope");
		businessCaseFormPage.fillRiskBox("Risk Text Box");
	}

	@Then("Fill Alternatives and Analysis details")
	public void fillALternativesDeailts() {
		businessCaseFormPage.clickOnAlternativesAndAnalysisLink();
		businessCaseFormPage.SetApprovalRequestedDate();
		businessCaseFormPage.setAlternativesText("Alternatives");
		businessCaseFormPage.clickOnAcquisitionandFunding();
		businessCaseFormPage.setFinancialFundingSource("Tesitng 1232");
	}

	@Then("Fill Financial Considerations details")
	public void FillFinancial() {
		businessCaseFormPage.setFinancialConsiderations("Testing FinancialConsiderations");
		businessCaseFormPage.expectedAwardDate();
		businessCaseFormPage.anticipatedAcquisitionApproach("anticipatedAcquisitionApproach ");
	}

	@Then("click on save and close")
	public void saveAndCLose() {
		businessCaseFormPage.saveAndCLose();
	}

	@Then("verify that the ticket menu was closed")
	public void verifyThatTheTicketISclosed() {
		businessCaseFormPage.NewButtonAvailable();
	}

	@Then("Add comment")
	public void addComments() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		businessCaseFormPage.clickOnCommentsLink();
		businessCaseFormPage.expandActivity();
		businessCaseFormPage.enterComments("Test Comments");
	}

	@Then("Click on save and continue")
	public void saveContinue() {
		businessCaseFormPage.saveContinueButton();
	}

	@Then("User expands activity section and verify comment")
	public void verifyComment() throws Exception {
		// businessCaseFormPage.expandActivity();
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
		// businessCaseFormPage.sortCreatedDateForBusinessCasesInDecendingOrder();
		businessCaseFormPage.clickOnFirstBusinessCase();
	}

	@Then("Open latest business Case")
	public void openLatestIdeaCase() {
		// businessCaseFormPage.sortCreatedDateForIdeaCasesInDecendingOrder();
		businessCaseFormPage.clickOnFirstIdeaCase();
	}

	@Then("verify that Assistance Provided button is available and moves the business case back in open state")
	public void verifyStateAfterAssistanceProvided() {
		businessCaseFormPage.verifyStateAfterAssistanceProvided();
	}

	@Then("click on Request Assistance button and verify the state of the business case as Request Assistance")
	public void requestAssistance() {
		businessCaseFormPage.verifyStateAfterAssistanceRequested();
	}

	@Then("verify that user has read only access only")
	public void verifyReadOnlyAccess() {
		businessCaseFormPage.validateFieldIsReadOnly();
	}

	@Then("Approve the business case")
	public void approveBusinessCase() {
		businessCaseFormPage.approveBusinessCase();
	}

	@Then("click on view all approvals and then on take action")
	public void viewAllApprovalsAndTakeAction() {
		businessCaseFormPage.clickOnActionButton();
		businessCaseFormPage.viewAllApprovalsAndTakeAction();
	}

	@Then("Filter all casses")
	public void filterAllCasses() {
		businessCaseFormPage.filterALlCases();
	}

	@Then("validate the opened popup")
	public void validatePopup() {
		businessCaseFormPage.validatePopUp();
	}

	@Then("Update details on business form and submit")
	public void FillBusinessForm() throws InterruptedException {
		businessCaseFormPage.enterTextInBusinessNeedBox("TestingAutomtaionTesting");
	}

	@Then("Go to native view")
	public void getNativeView() {
		businessCaseFormPage.clickOnNativeView();
	}

	@Then("Impersonate User as {string}")
	public void impersonateUser(String userName) {
		businessCaseFormPage.impersonateUser(userName);
	}

	@Then("click on action menu option")
	public void actionMenu() {
		businessCaseFormPage.clickOnActionButton();
	}

	@Then("validate the test as requested")
	public void validateText() {
		businessCaseFormPage.validateTextOnPage();
	}

	@Then("along with the ticket number for the business case the project name")
	public void validateProjectName() {
		businessCaseFormPage.validateProjectNamePresense();
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
		// boolean status = businessCaseFormPage.verifyEmail(subject);

		// Assert.assertEquals(true, status);

	}

	@Then("I click on the My actions tab and click on latest request")
	public void openLatestCaseFromActionTab() {
		businessCaseFormPage.clickOnActionButton();
		businessCaseFormPage.clickOnLatestBusinessCaseFormFromActionTab();
	}

	@Then("I will be able to approve or reject")
	public void validateApproveRejectButtonIsAvailable() {
		businessCaseFormPage.approveButtonWithNewFlow();
	}

}
