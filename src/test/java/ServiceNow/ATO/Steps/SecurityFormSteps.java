package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.SecurityFormPage;
<<<<<<< HEAD
import ServiceNow.ATO.StepsImplementation.AtoStepsImpl;
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
import ServiceNow.ATO.StepsImplementation.SecurityFormStepsImpl;
import ServiceNow.ATO.Utils.Constants;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import ServiceNow.ATO.Utils.ReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityFormSteps {

	private SecurityFormStepsImpl securityFormStepsImpl;
	private BasePage basePage;
	private Scenario scenario;
<<<<<<< HEAD
	private AtoStepsImpl atoStepsImpl;

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@Before
	public void before(Scenario scenario) {
		this.securityFormStepsImpl = new SecurityFormStepsImpl();
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
<<<<<<< HEAD
		this.atoStepsImpl = new AtoStepsImpl();
		securityFormStepsImpl.scenario = scenario;
		this.scenario = scenario;
	}

	@Then("User click on {string} security form")
	public void useClickOnSecurityForm(String formName) {
		securityFormStepsImpl.clickOnFormName(formName);
		basePage.captureScreenshot("Inside " + formName + " form");
=======
		securityFormStepsImpl.scenario = scenario;
		this.scenario = scenario;
	}
	
	@Then("User click on {string} security form")
	public void useClickOnSecurityForm(String formName) {
	    securityFormStepsImpl.clickOnFormName(formName);
	    basePage.captureScreenshot("Inside "+formName+" form");
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	}

	@Then("User change the form status to {string}")
	public void changeTheFormStatus(String status) {
<<<<<<< HEAD
		securityFormStepsImpl.selectFormStatus(status);
=======
	    securityFormStepsImpl.selectFormStatus(status);
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	}

	@Then("User assigns the form to {string}")
	public void assignFormTo(String user) {
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
<<<<<<< HEAD
		securityFormStepsImpl.fillPortsProtocolsAndServices();
=======
	    securityFormStepsImpl.fillPortsProtocolsAndServices();
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	}

	@Then("User fills the System Interconnections")
	public void fillsTheSystemInterconnections() throws InterruptedException {
		securityFormStepsImpl.clickOnSystemInterconnectionsTab();
<<<<<<< HEAD
		securityFormStepsImpl.fillSystemInterConnections();
	}

	@When("User clicks on ato system")
	public void selectAtoSystemFromList() {
		String atoSystemName = Constants.packageName;
		// securityFormStepsImpl.clickOnAtoSystem("DCTD CVS");
		securityFormStepsImpl.clickOnFirstPackage();
		ReportUtil.takeScreenShot(scenario, "Package details");
	}

	@When("User clicks on package link")
	public void clickOnPackageLink() {
		System.out.println("package link = " + Constants.packageLinkText);
		atoStepsImpl.clickOnFirstPackage();
		// securityFormStepsImpl.clickOnPackageLink(Constants.packageLinkText);

	}

=======
	    securityFormStepsImpl.fillSystemInterConnections();
	}
	
	@When("User clicks on ato system")
	public void selectAtoSystemFromList() {
		String atoSystemName = Constants.packageName;
		securityFormStepsImpl.clickOnAtoSystem(atoSystemName);
		ReportUtil.takeScreenShot(scenario, "Package details");
	}
	
	@When("User clicks on package link")
	public void clickOnPackageLink() {
		System.out.println("package link = " + Constants.packageLinkText);
		securityFormStepsImpl.clickOnPackageLink(Constants.packageLinkText);
	}
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User verifies all system details")
	public void verifyAllSystemDetails() {
		securityFormStepsImpl.verifyAllSystemDetails();
	}
<<<<<<< HEAD

	@When("User will change the system owner of the first package to {string}")
	public void changeSystemOwner(String ownerName) throws Exception {
		securityFormStepsImpl.changeSystemOwner(ownerName);
	}

	@When("User will select the state as {string}")
	public void selectState(String stateOption) {
		//securityFormStepsImpl.selectState(stateOption);
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

	@When("User updated the approved by value as {string}")
	public void updateApprovedBy(String name) {

=======
	
	@When("User will change the system owner of the first package to {string}")
	public void changeSystemOwner(String ownerName) throws Exception{
		securityFormStepsImpl.changeSystemOwner(ownerName);
	}
	
	@When("User will select the state as {string}")
	public void selectState(String stateOption) {
		securityFormStepsImpl.selectState(stateOption);
	}
	
	@When("User enters renewal due date as {string}")
	public void enterRenewalDueDate(String dateStr) throws Exception{
		securityFormStepsImpl.selectRenewalDueDate(dateStr);
	}
	
	@When("User updated the approved by value as {string}")
	public void updateApprovedBy(String name) {
		
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	}

}
