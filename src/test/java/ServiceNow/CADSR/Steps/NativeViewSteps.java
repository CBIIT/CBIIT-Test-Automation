package ServiceNow.CADSR.Steps;

import io.cucumber.java.Before;
import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;
import ServiceNow.CADSR.Pages.NativeViewPage;
import ServiceNow.CADSR.StepsImplementation.LoginStepsImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NativeViewSteps {

	private NativeViewPage nativeViewPage;
	private LoginStepsImpl loginStepsImpl;

	@Before
	public void before() {
		this.nativeViewPage = new NativeViewPage();
		this.loginStepsImpl = new LoginStepsImpl();
	}

	@Given("User opens IT Procurement Governance Application")
	public void openATOApp() {
		nativeViewPage.openApp();
	}

	@When("User Logins to the CADSR application")
	public void login() throws Exception {
		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
		String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		loginStepsImpl.enterPassword(decyptedPass);
		loginStepsImpl.clickOnSignInButton();
	}

	@Then("Go to Native view of the application")
	public void getNativeView() {
		nativeViewPage.clickOnNativeView();
	}


	
	
	@Then("Go to CADSR Requests")
	public void clickonCADSRRequest() throws InterruptedException {
		nativeViewPage.clickOnCADSRRequest();
	}

	@Then("User should see default columns for incident grid")
	public void viewDefaultColumns() throws InterruptedException {
		nativeViewPage.viewDefaultColumns();
		
	}

	@Then("Go to All Business Case")
	public void clickOnAllBusinessCase() {
		nativeViewPage.clickOnAllBusiness();
	}

	@Then("start a new request")
	public void startNewRequest() {
		nativeViewPage.startANewRequest();
	}

	@Then("Enter request details only")
	public void enterIdeaDetails2() throws InterruptedException {
		nativeViewPage.selectTaskAndOtherDetails();
	}

	@Then("Click on Save and Continue")
	public void saveContinue() throws InterruptedException {
		Thread.sleep(3000);
		nativeViewPage.saveContinueButton();
	}

	@Then("Open Latest Idea Case")
	public void openLatestIdeaCase() {
		nativeViewPage.clickOnFirstIdeaCase();
	}

	@Then("Click on approve request")
	public void approveRequest() throws InterruptedException {
		Thread.sleep(2000);
		nativeViewPage.approveRequest();
	}

	@Then("State is Updated to {string}")
	public void verifystate(String expectedState) throws Exception {
		Thread.sleep(2000);
		String actualState = nativeViewPage.getState();
		CucumberLogUtils.logScreenShot("Request State");
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals(expectedState, actualState);
		}
	}

	@Then("Open Latest Business Case")
	public void openLatestBusinessCase() {
		nativeViewPage.clickOnFirstBusinessCase();
	}

	@Then("Update details on Business form and submit")
	public void FillBusinessForm() throws InterruptedException {
		nativeViewPage.enterTextInBusinessNeedBox("TestingAutomtaionTesting");
	}

	@Then("Open Request Approval form and approve")
	public void approve() throws InterruptedException {
		nativeViewPage.approveRequestForm();
	}

	@Then("Click on Elevate Permision")
	public void elevatePermission() throws InterruptedException {
		nativeViewPage.elevateButton();
	}

	@Then("User should see Save, Add Attachments and Submit button")
	public void user_should_see_Save_Add_Attachments_and_Submit_button() {
		nativeViewPage.switchToFrame();
		
		Assert.assertTrue("Save button is not present on the screen",
				nativeViewPage.isElementPresent(nativeViewPage.saveButton));
		Assert.assertTrue("Add Attachement button is not present on the screen",
				nativeViewPage.isElementPresent(nativeViewPage.addAttachemdnBottom));
		Assert.assertTrue("Submit button is not present on the screen",
				nativeViewPage.isElementPresent(nativeViewPage.submitButtonOnNewRequestForm));
		

	}

	@Then("Start a new request on nativ view")
	public void start_new_Requst() {
		nativeViewPage.startANewRequest();
	}
	
	
	@Then("User should see available different choices of status")
	public void validateStatusCHoices() throws Exception {
		nativeViewPage.allSelectOptions();
		
	}
	
	@Then("take the final page screenshot and add it to the report")
	public void takeScreenshot() {
		
	}

	@Then("Set Assigned to and save")
	public void set_assigned_to() {
		nativeViewPage.selectAssignedTo("Janice Knable");
		nativeViewPage.justSaveTicket();

	}

	@Then("Validate assigned to value in child ticket")
	public void validate_assigned_to() throws InterruptedException {
		
		String value = nativeViewPage.getAssignedToValue();
		Assert.assertTrue("Assigned to value in child ticket is not correct", "Janice Knable".equalsIgnoreCase(value));
	}

	@Then("User should see Status field")
	public void user_should_see_Status_field() {
		nativeViewPage.validateTheLabelAsStatus();
		
	}

	@Then("Validate parent ticket reference")
	public void validatePerenetTicketReference() {
		
		nativeViewPage.validateParentTicketReference();
	}

	@Then("validate text on landing page")
	public void validateTextOnLandingPage() {
		nativeViewPage.validateTextOnLandingPage();
	}

	@Then("validate text on request form page")
	public void validateTextonRequestFormPage() {
		
		nativeViewPage.validateTextOnRequestFormPage();
	}

	@Then("try adding one more email id")
	public void enterOneMoreEmailId() {
		nativeViewPage.enterEMailId();
	}

	@Then("validate page footer")
	public void validatePageFooter() {
		nativeViewPage.checkIfPageFooterISasExpected();
		
	}

	@Then("validate that the list of organiation is as expected")
	public void validateTheListOfOrganization() throws Exception {
		nativeViewPage.validateTheListOfOrganization();
		
	}
}
