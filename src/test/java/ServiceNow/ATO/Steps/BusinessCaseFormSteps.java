package ServiceNow.ATO.Steps;

import io.cucumber.java.Before;
import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;

import ServiceNow.ATO.Pages.BusinessCaseFormPage;
import ServiceNow.ATO.StepsImplementation.LoginStepsImpl;
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

	@Given("User opens Business Case application in browser")
	public void openATOApp() {
		businessCaseFormPage.openApp();
	}

	@When("Navigate to {string}")
	public void navigateToQUickLin(String quickLinkOption) {
		try {
			businessCaseFormPage.selectOptionFromQuickLink(quickLinkOption);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("form state is updated to {string}")
	public void verifystate(String expectedState) throws Exception {
		Thread.sleep(5000);
		String actualState = businessCaseFormPage.getState();
		CucumberLogUtils.logScreenShot("Request State");
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals(expectedState, actualState);
		}
	}

	@When("User will login to the application")
	public void login() throws Exception {
		if (loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
			loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
			String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
			// loginStepsImpl.enterUsername(ConfUtils.getProperty("Username"));
			// decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("Password"));
			loginStepsImpl.enterPassword(decyptedPass);
			// loginPage.enterUsername(ConfigFileReader.getConfigFileReader().getUserName());
			// loginPage.enterPassword(ConfigFileReader.getConfigFileReader().getPassword());
			loginStepsImpl.clickOnSignInButton();
		}
	}

	@Then("Start a new idea")
	public void startIdea() {
		businessCaseFormPage.startANewIdea();
	}

	@Then("Fill Idea details")
	public void fillIdeaDetails() throws InterruptedException {
		businessCaseFormPage.selectDocDirector("Justin Cam");
		businessCaseFormPage.fillFITARATextBox();
		businessCaseFormPage.fillIDeaBox("Test IDea Form");
		businessCaseFormPage.programaticSUpportCheckBox();
	}

	@Then("Add comments")
	public void addComments() {
		businessCaseFormPage.enterComments("Test Comments");
	}

	@Then("save and continue")
	public void saveContinue() {
		businessCaseFormPage.saveContinueButton();
	}

	@Then("expand activity section and verify comment")
	public void verifyComment() throws Exception {
		businessCaseFormPage.expandActivity();
		businessCaseFormPage.verifyIfCommentIsThere();
	}

	@Then("User enters feedback")
	public void enterFeedback() throws Exception {
		Thread.sleep(5000);
		businessCaseFormPage.enterFeedback("Test Automation");
	}

	@Then("Reject Request")
	public void rejectRequest() {
		businessCaseFormPage.rejectRequest();
	}

	@Then("Click On need more info on idea button")
	public void needMoreInfo() {
		businessCaseFormPage.needMoreInfoOnRequest();
	}

	@Then("Approve request")
	public void approveRequest() {
		businessCaseFormPage.approveRequest();
	}

	@Then("open latest business case")
	public void openLatestBusinessCase() {
		businessCaseFormPage.sortCreatedDateForBusinessCasesInDecendingOrder();
		businessCaseFormPage.clickOnFirstBusinessCase();
	}

	@Then("Fill details on business form and submit")
	public void FillBusinessForm() throws InterruptedException {
		businessCaseFormPage.enterTextInBusinessNeedBox("TestingAutomtaionTesting");
	}

	@Then("Goto native view")
	public void getNativeView() {
		businessCaseFormPage.clickOnNativeView();
	}

	@Then("Elevate permision")
	public void elevatePermission() {
		businessCaseFormPage.elevateButton();
	}

	@Then("Open request approval form and approve")
	public void approve() {
		businessCaseFormPage.approveRequestForm();
	}

	@Then("Open request approval form and approve pending approval")
	public void approval() {
		businessCaseFormPage.approvePendingRequest();
	}

	@Then("Open request approval form and reject")
	public void reject() {
		businessCaseFormPage.rejectRequestForm();
	}

	@Then("Open request approval form and ask for more info")
	public void askForMoreInfo() {
		businessCaseFormPage.askForMoreInfoOnRequestForm();
	}
}
