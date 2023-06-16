package ServiceNow.RCMDB.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;

import ServiceNow.ITPG.Pages.BusinessCaseFormPage;
import ServiceNow.ITPG.Pages.PortalViewPage;
import ServiceNow.ITPG.StepsImplementation.LoginStepsImpl;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PortalViewSteps {
	
	private PortalViewPage portalViewPage;
	private LoginStepsImpl loginStepsImpl;

	@Before
	public void before() {
		this.portalViewPage = new PortalViewPage();
		this.loginStepsImpl = new LoginStepsImpl();
	}
	
	@Given("User opens IT Procurement Governance Application in browser")
	public void openATOApp() {
		portalViewPage.openApp();
	}
	
	@When("User Logins to the application")
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
	
	@Then("Go to Native view")
	public void getNativeView() {
		portalViewPage.clickOnNativeView();
	}
	
	@Then("Go to All Ideas")
	public void clickonAllIdeaCase() {
		portalViewPage.clickOnAllIdeas();
	}
	
	@Then("Go to All Business Case")
	public void clickOnAllBusinessCase() {
		portalViewPage.clickOnAllBusiness();
	}
	
	@Then("start a new idea case")
	public void startIdea() {
		portalViewPage.startANewIdea();
	}
	
	@Then("Enter Idea case details")
	public void enterIdeaDetails() throws InterruptedException {
		portalViewPage.selectDocDirector("Justin Campany");
		portalViewPage.fillFITARATextBox();
		portalViewPage.fillIDeaBox("Test IDea Form");
		portalViewPage.programaticSUpportCheckBox();
	}
	
	@Then("Click on Save and Continue")
	public void saveContinue() {
		portalViewPage.saveContinueButton();
	}
	
	@Then("Open Latest Idea Case")
	public void openLatestIdeaCase() {
		portalViewPage.clickOnFirstIdeaCase();
	}
	
	@Then("Click on approve request")
	public void approveRequest() throws InterruptedException {
		Thread.sleep(2000);
		portalViewPage.approveRequest();
	}
	
	@Then("State is Updated to {string}")
	public void verifystate(String expectedState) throws Exception {
		Thread.sleep(2000);
		String actualState = portalViewPage.getState();
		CucumberLogUtils.logScreenShot("Request State");
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals(expectedState, actualState);
		}
	}
	
	@Then("Open Latest Business Case")
	public void openLatestBusinessCase() {
		portalViewPage.clickOnFirstBusinessCase();
	}
	
	@Then("Update details on Business form and submit")
	public void FillBusinessForm() throws InterruptedException {
		portalViewPage.enterTextInBusinessNeedBox("TestingAutomtaionTesting");
	}
	
	@Then("Open Request Approval form and approve")
	public void approve() throws InterruptedException {
		portalViewPage.approveRequestForm();
	}
	
	@Then("Click on Elevate Permision")
	public void elevatePermission() throws InterruptedException {
		portalViewPage.elevateButton();
	}

}
