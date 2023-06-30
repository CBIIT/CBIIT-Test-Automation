package ServiceNow.ATO.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.StepsImplementation.AtoStepsImpl;
import ServiceNow.ATO.StepsImplementation.SecurityFormStepsImpl;
import ServiceNow.ATO.Utils.Constants;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import ServiceNow.ATO.Utils.ReportUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecurityFormSteps extends BasePage {

	private SecurityFormStepsImpl securityFormStepsImpl;
	private BasePage basePage;
	private Scenario scenario;
	private AtoStepsImpl atoStepsImpl;
	private CommonPage commonPage;

	@Before
	public void before(Scenario scenario) {
		this.securityFormStepsImpl = new SecurityFormStepsImpl();
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
		this.atoStepsImpl = new AtoStepsImpl();
		securityFormStepsImpl.scenario = scenario;
		this.scenario = scenario;
	}

	@Then("User click on {string} security form")
	public void useClickOnSecurityForm(String formName) throws InterruptedException {
		Thread.sleep(5000);
		securityFormStepsImpl.clickOnFormName(formName);
		basePage.captureScreenshot("Inside " + formName + " form");
		securityFormStepsImpl.scenario = scenario;
		this.scenario = scenario;
	}

	@Then("User change the form status to {string}")
	public void changeTheFormStatus(String status) {
		securityFormStepsImpl.selectFormStatus(status);
		securityFormStepsImpl.selectFormStatus(status);
	}

	@Then("User assigns the form to {string}")
	public void assignFormTo(String user) throws InterruptedException {
		securityFormStepsImpl.assignForm(user);
		basePage.captureScreenshot("Assign User");
	}

	@Then("User goto {string} tab")
	public void goToTab(String tabName) throws InterruptedException {
		securityFormStepsImpl.goToTab(tabName);
	}

	@Then("User fills the approval details")
	public void fillsApprovalDetails() throws InterruptedException {
		securityFormStepsImpl.fillApprovalDetais();
		basePage.captureScreenshot("Filled the approval details");
	}

	@Then("User fills the Security Category Impact Level details")
	public void user_fills_the_Security_Category_Impact_Level_details() {
		securityFormStepsImpl.fillSecurityCategoryImpactLevel();
	}

	@Then("User fills the eAuthentication Assessment Details")
	public void fillEauthenticationAssessmentDetails() {
		securityFormStepsImpl.filleAuthenticationDetails();
		basePage.captureScreenshot("eAuthentication Assessment");
	}

	@Then("User fills the Assurance Levels details")
	public void fillsTheAssuranceLevelsdetails() throws InterruptedException {
		securityFormStepsImpl.fillAssuranceLevels();
		basePage.captureScreenshot("Assurance Levels");
	}

	@Then("User fills the System Security Plan Controls")
	public void fillsSystemSecurityPlanControls() throws InterruptedException {
		securityFormStepsImpl.fillSystemSecurityPlan();
	}

	@Then("User fills the System Assets")
	public void fillsTheSystemAssets() throws InterruptedException {
		securityFormStepsImpl.clickOnSystemAssetTab();
		securityFormStepsImpl.fillSystemAsset();
	}

	@Then("User fills the Ports Protocols and services")
	public void fillsThePortsProtocolsServices() throws InterruptedException {
		securityFormStepsImpl.clickOnPortsProtocalAndServices();
		securityFormStepsImpl.fillPortsProtocolsAndServices();
		securityFormStepsImpl.fillPortsProtocolsAndServices();
	}

	@Then("User fills the System Interconnections")
	public void fillsTheSystemInterconnections() throws InterruptedException {
		securityFormStepsImpl.clickOnSystemInterconnectionsTab();
		securityFormStepsImpl.fillSystemInterConnections();
	}

	@When("User clicks on ato system")
	public void selectAtoSystemFromList() {
		String atoSystemName = Constants.packageName;
		// securityFormStepsImpl.clickOnAtoSystem("DCTD CVS");
		securityFormStepsImpl.clickOnFirstPackage();
		ReportUtil.takeScreenShot(scenario, "Package details");
	}

//	@When("User clicks on package link")
//	public void clickOnPackageLink() {
//		System.out.println("package link = " + Constants.packageLinkText);
//		atoStepsImpl.clickOnFirstPackage();
//		// securityFormStepsImpl.clickOnPackageLink(Constants.packageLinkText);
//
//	}
//
//	
//	@When("User clicks on ato system")
//	public void selectAtoSystemFromList() {
//		String atoSystemName = Constants.packageName;
//		securityFormStepsImpl.clickOnAtoSystem(atoSystemName);
//		ReportUtil.takeScreenShot(scenario, "Package details");
//	}

	@When("User clicks on package link")
	public void clickOnPackageLink() {
		System.out.println("package link = " + Constants.packageLinkText);
		securityFormStepsImpl.clickOnPackageLink(Constants.packageLinkText);
	}

	@When("User verifies all system details")
	public void verifyAllSystemDetails() {
		securityFormStepsImpl.verifyAllSystemDetails();
	}

	@When("User will change the system owner of the first package to {string}")
	public void changeSystemOwner(String ownerName) throws Exception {
		securityFormStepsImpl.changeSystemOwner(ownerName);
	}

	@Then("Change system owner of first package to {string} from home page")
	public void changeSystemOwnerFromHomePage(String ownerName) throws Exception {
		try {
			securityFormStepsImpl.changeSystemOwnerFromHomePage(ownerName);
		} catch (Exception e) {
			throw e;
		}
	}

	@When("User will select the state as {string}")
	public void selectState(String stateOption) {
		// securityFormStepsImpl.selectState(stateOption);
		securityFormStepsImpl.selectStateWithoutFrameSwicth(stateOption);
	}

	@When("User enters renewal due date as {string}")
	public void enterRenewalDueDate(String dateStr) throws Exception {
		if (!dateStr.equalsIgnoreCase("Today")) {
			securityFormStepsImpl.selectRenewalDueDate(dateStr);
		} else {
			securityFormStepsImpl.setRenewalDueDateAsToday();
		}
	}

	@Then("user enters comment in a {string} package")
	public void enterDataIntoPackage(String packageName) {
		securityFormStepsImpl.enterDataIntoPackage(packageName);
	}

	@Then("user verifies all the forms in {string} package but edits the last one")
	public void verifyAllButEditLast(String packageName) throws Exception {
		try {
			securityFormStepsImpl.verifyAllButEditLast(packageName);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("user verifies all the forms in {string} package")
	public void verifyAll(String packageName) throws Exception {
		try {
			securityFormStepsImpl.verifyAll(packageName);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("verify all forms are complete and take screenshot")
	public void completeAllForms() throws InterruptedException {
		Thread.sleep(5000);
		//commonPage.clickOnElement(By.xpath("(//div[@class=\"open-form-btn\"])[11]/*[contains(@text(),'')]"));
		basePage.captureScreenshot("Authority To Operate Letter");
	}

}