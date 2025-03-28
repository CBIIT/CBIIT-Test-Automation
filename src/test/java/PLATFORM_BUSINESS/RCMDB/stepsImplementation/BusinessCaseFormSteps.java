package PLATFORM_BUSINESS.RCMDB.stepsImplementation;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import ITSM.ITPG.pages.BusinessCaseFormPage;
import ITSM.ITPG.stepsImplementation.LoginStepsImpl;
import io.cucumber.java.Before;
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

	@When("Click on {string}")
	public void navigateToQuickLin(String quickLinkOption) {
		try {
			businessCaseFormPage.selectOptionFromQuickLink(quickLinkOption);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("State is updated to {string}")
	public void verifyState(String expectedState) throws Exception {
		Thread.sleep(7000);
		String actualState = businessCaseFormPage.getState();
		CucumberLogUtils.logScreenshot();
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals(expectedState, actualState);
		}
	}

	@When("User logins to the application")
	public void login() throws Exception {
		if (loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
			loginStepsImpl.enterUsername("");
			String decryptedPass = EncryptionUtils.decrypt("");
			loginStepsImpl.enterPassword(decryptedPass);
			loginStepsImpl.clickOnSignInButton();
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
		businessCaseFormPage.fillIDeaBox("Test Idea Form");
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
		businessCaseFormPage.enterTextInBusinessNeedBox("TestingAutomationTesting");
	}

	@Then("Go to native view")
	public void getNativeView() {
		businessCaseFormPage.clickOnNativeView();
	}

	@Then("Click on Elevate permission")
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
}