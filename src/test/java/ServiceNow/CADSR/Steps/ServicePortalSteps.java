package ServiceNow.CADSR.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.Assert;

import com.nci.automation.common.QcTestResult;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CADSR.Pages.ServicePortalPage;
import ServiceNow.CADSR.StepsImplementation.LoginStepsImpl;
import appsCommon.PageCache;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicePortalSteps {
	private ServicePortalPage servicePortalPage;
	private LoginStepsImpl loginStepsImpl;

	@Before
	public void before() {
		this.servicePortalPage = new ServicePortalPage();
		this.loginStepsImpl = new LoginStepsImpl();
	}

	@Given("User opens caDSR Application")
	public void opencaDSRApp() {
		servicePortalPage.openApp();
	}

	@Given("User opens caDSR Home Page")
	public void opencaDSRHomePage() {
		servicePortalPage.openHomePage();
	}

	@Given("Validate caDSR portal URL")
	public void validatePortalURL() {
		servicePortalPage.validatePortalURL();
	}

	@When("User Logins to the caDSR application")
	public void login() throws Exception {
		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
		String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		loginStepsImpl.enterPassword(decyptedPass);
		loginStepsImpl.clickOnSignInButton();
	}

	@Then("Start a new request")
	public void start_a_new_request() throws InterruptedException {
		servicePortalPage.startANewRequest();
		Thread.sleep(5000);
	}

	@Then("User should see Requested for field")
	public void user_should_See_requested_by_field() {
		Assert.assertTrue(servicePortalPage.user_should_See_requested_for_field(), "Requested for field is missing");
	}

	@Then("User should see request form")
	public void seeUserRequestFor() throws InterruptedException {
		// This will fail if the form is not there
		servicePortalPage.submitandContinue();
	}

	@Then("Select Curation task and Varify help text")
	public void selectCuration() throws InterruptedException {
		servicePortalPage.selectRandomTask("Curation");
		servicePortalPage.verifyCurationHelpText();

	}

	@Then("User should see multiple widget")
	public void validateWidget() {
		servicePortalPage.validateWidget();
	}

	@Then("User should see default columns for incident list")
	public void viewDefaultColumns() throws InterruptedException {
		servicePortalPage.viewDefaultColumns();
	}

	@Then("User click on view my tickets")
	public void view_my_tickets() {
		servicePortalPage.viewMyTickets();
	}

	@Then("Verify content to caDSR homepage")
	public void verify_Content() {
		servicePortalPage.verifyContent();
	}

	@Then("Verify ticket link shouldnt be available")
	public void verify_links() {
		servicePortalPage.verifyMenu();
	}

	@Then("User shouldnt see Services, Knowledge, QuickLinks menu")
	public void verify_Link() {
		servicePortalPage.verifyLink();
	}

	@Then("Verify if POC field is available")
	public void verify_POC_field() throws InterruptedException {
		servicePortalPage.verifyPOCField();
	}

	@Then("Verify Operations")
	public void verify_Operation_field() throws InterruptedException {
		servicePortalPage.verifyOperation();
	}

	@Then("User should see caSDR Fulfiller group assigned to the operations selected")
	public void verifyMapping() {
		servicePortalPage.verifyTaskVsOperationMapping();
	}

	@Then("User should see all the available attribute fields to select")
	public void user_should_see_all_the_available_attribute_fields_to_select() {
		servicePortalPage.verifyAllAttributesOnPage();
	}

	@Then("verify that the customer details are already populated")
	public void verify_that_the_customer_details_are_already_populated() {
		String actualRequestForValue = servicePortalPage.getDataFromRequestForField();
		String actualOrganizationValue = servicePortalPage.getDataFromOrganizationField();
		String actualPhoneNoValue = servicePortalPage.getDataFromphoneNoField();
		String actualEmailIdValue = servicePortalPage.getDataFromEmailField();
		Assert.assertEquals(actualRequestForValue, "Satya Gugulothu");
		Assert.assertEquals(actualOrganizationValue, "CDH (Cancer Data Harmonization)");
		Assert.assertEquals(actualPhoneNoValue, "+1 240 276 6125");
		Assert.assertEquals(actualEmailIdValue, "satya.gugulothu@nih.gov");
	}

	@Then("Enter CADSR request details without curation tasks")
	public void enterRequestDetails() throws InterruptedException {
		servicePortalPage.fillShortDescription("Test Request Form");
		servicePortalPage.selectRandomTask("Curation");
		servicePortalPage.selectCuration("Curation");
		servicePortalPage.selectDate("06/02/2023");
	}

	@Then("Enter CADSR request details")
	public void enterIdeaDetails() throws InterruptedException {
		servicePortalPage.fillShortDescription("Test Request Form");
		servicePortalPage.selectTask("Curation");
		servicePortalPage.selectCurationTask("Curation");
		servicePortalPage.selectDate("06/02/2023");
	}

	@Then("Select multipl curation operations")
	public void selectMultipleCurations() throws InterruptedException {
		servicePortalPage.selectCurationTask("Curation");
	}

	@Then("Clear default phone number")
	public void clearPhoneNumber() throws InterruptedException {
		servicePortalPage.clearPhoneNumber();

	}

	@Then("Select multiple curation operations")
	public void selectMultipleCuration() throws InterruptedException {
		servicePortalPage.selectCuration("Curation");

	}

	@Then("Close latest child ticket")
	public void close_latest_child_ticket() {
		servicePortalPage.updateTicketStatusToClose();
	}

	@Then("Validate parent ticket status")
	public void CheckParentTicketStatus() {
		servicePortalPage.getTheCurrentoFTicket();
	}

	@Then("User should be able to reopen child ticket")
	public void user_should_be_able_to_reopen_child_ticket() {
		servicePortalPage.reopenTicket();
	}

	@Then("Update Requested For and validated updated Phone , email and organisation based on selection")
	public void updateRequestedFor() throws InterruptedException {
		servicePortalPage.updateRequestedFor();

	}

	@Then("Click on Save button")
	public void clickOnSaveButton() throws InterruptedException {
		servicePortalPage.submitandContinue();
	}

	@Then("select the organization name as {string}")
	public void select_the_organization_name_as(String string) {
		servicePortalPage.selectOrganization(string);
	}

	@Then("User should see assignment group as {string}")
	public void user_should_see_assignment_group_as(String string) {
		String actual = servicePortalPage.getTheAssignmentGroup();
		Assert.assertTrue(string.equalsIgnoreCase(actual),
				"Excpeted assignment group was " + string + " but found" + actual);
	}

	@Then("User should have option to upload attachment")
	public void uploadOptionAvailable() {
		Assert.assertTrue(servicePortalPage.isUploadOptionAvailable(), "Upload Option not available on screen");
	}

	@Then("User should see request submitted confirmation page")
	public void user_should_see_request_submitted_confirmation_page() {
		Assert.assertTrue(servicePortalPage.isCompleteButtonPresent(), "Submit confirmation page not present");
	}

	@Then("Click on Complete button")
	public void clickOnCompleteButton() throws InterruptedException {
		servicePortalPage.complete();
	}

	@Then("validate that user is able to complete the form without entering data in details form")
	public void clickOnCompleteButtonWithoutDetails() throws InterruptedException {
		servicePortalPage.complete();
	}

	@Then("Click on View my Ticket")
	public void clickOnViewMyTicket() throws InterruptedException {
		servicePortalPage.viewMyTicketButton();
	}

	@Then("Go to View My Tickets")
	public void clickOnViewMyTicketButton() throws InterruptedException {
		servicePortalPage.viewMyTicket();

	}

	@Then("Go to View My Historical Ticket")
	public void clickOnViewMyHistoricalTicketButton() throws InterruptedException {
		servicePortalPage.clickOnViewMyHistoricalTicketButton();

	}

	@Then("Validate close incomplete and resolved tickets")
	public void validateCloseAndResolvedTicket() throws InterruptedException {
		servicePortalPage.validateCloseAndResolvedTicket();

	}

	@Then("Validate resolved and close incomplete tickets")
	public void validateResolvedAndClosedTicket() throws InterruptedException {
		servicePortalPage.validateResolvedAndClosedTicket();

	}

	@Then("Validate resolved confirmed status")
	public void validateResolvedTicket() throws InterruptedException {
		servicePortalPage.validateResolvedTicket();

	}

	@Then("User should see new request button")
	public void viewNewRequestButton() throws InterruptedException {
		servicePortalPage.viewNewRequestButton();

	}

	@Then("Validate ticket ID in native view")
	public void validateTicketInNativeView() throws InterruptedException {
		servicePortalPage.validateTicketInNativeView();

	}

	@Then("Sort the tickets by requested date")
	public void sortTickets() {
		servicePortalPage.sortTicketsByRequestedDate();

	}

	@Then("Open latest caDSR ticket")
	public void openLatestTicket() throws InterruptedException {
		servicePortalPage.openLatestTicket();

	}

	@Then("Click on Resolve")
	public void click_on_Resolve() {
		servicePortalPage.updateTicketTo("Resolved");
	}

	@Then("Start a new request on service now portal")
	public void startNewOnServiceNow() {
		servicePortalPage.startNew();
	}

	@Then("Reference it to previous ticket")
	public void reference_it_to_previous_ticket() throws Exception {
		servicePortalPage.checkReference();
	}

	@Then("Update request due date")
	public void update_request_due_date() {
		// Write code here that turns the phrase above into concrete actions
		servicePortalPage.updateRequestedDateTextBox();
	}

	@Then("Goto curation task and open first curation task")
	public void openCurationTask() {
		servicePortalPage.openCurationTabAndTicket();
	}

	@Then("Validate update of caDSR to caDSR II")
	public void validatecaDSRFilteredMenuName() throws InterruptedException {
		servicePortalPage.validatecaDSRFilteredMenuName();

	}

	@Then("Open Latest Ticket")
	public void openMyLatestTicket() throws InterruptedException {
		servicePortalPage.openMyLatestTicket();

	}

	@Then("User shouldnt have Add watcher and Add Attachments button")
	public void validateAddWatcherButton() throws InterruptedException {
		servicePortalPage.validateAddWatcherButton();

	}

	@Then("User should see read only view of the ticket")
	public void validateReadOnlyAccess() throws InterruptedException {
		servicePortalPage.validateReadOnlyAccess();

	}

	@Then("User should see default SOW number selected")
	public void validateSOWNumber() throws InterruptedException {
		servicePortalPage.validateSOWNumber();

	}

	@Then("Close ticket without filling resolution info")
	public void closeTicket() throws InterruptedException {
		servicePortalPage.closeTicket();

	}

	@Then("Complete child ticket and update")
	public void completeChildTicket() throws InterruptedException {
		servicePortalPage.completeChildTicket();

	}

	@Then("Close parent ticket without curation count and update")
	public void completeParentTicket() throws InterruptedException {
		servicePortalPage.completeTicket();

	}

	@Then("verify that the fields are disabled")
	public void verifyDisabledFields() throws Exception {
		servicePortalPage.verifyDisabledFields();
	}

	@Then("Resolve parent ticket without curation count and update")
	public void resolveParentTicket() throws InterruptedException {
		servicePortalPage.resolveTicket();

	}

	@Then("Validate autofill of user record information")
	public void validateAutoFillOfUserInformation() throws InterruptedException {
		servicePortalPage.validateAutoFillOfUserInformation();

	}

	@Then("User should see new format of add attachment page with matching current caDSR format")
	public void validateAddAttachmentPage() throws InterruptedException {
		servicePortalPage.validateAddAttachmentPage();

	}

	@Then("User shouldnt see hyperlink on the Request Form")
	public void validateRequestFormHyperlink() throws InterruptedException {
		servicePortalPage.validateRequestFormHyperlink();

	}

	@Then("User shouldnt see Get Help Footer")
	public void validateGetHelpFooter() throws InterruptedException {
		servicePortalPage.validateGetHelpFooter();

	}

	@Then("User should be able to enter additional contact email addresses")
	public void validateAdditionalEmail() throws InterruptedException {
		servicePortalPage.validateAdditionalEmail();

	}

	@Then("User should see error message when he enter invalid additional contact email addresses")
	public void enterAdditionalEmail() throws InterruptedException {
		servicePortalPage.enterAdditionalEmail();

	}

	@Then("User should see default priority as Moderate")
	public void validatePriority() throws InterruptedException {
		servicePortalPage.validatePriority();

	}

	@Then("Go to native view")
	public void getNativeView() {
		servicePortalPage.clickOnNativeView();
	}

	@Then("Impersonate user as service now user")
	public void impersonate_a_user() {
		servicePortalPage.impersonateUser();
		System.out.println();
	}

	@Then("Impersonate Dianna Kelly as service now user")
	public void impersonate_a_use2r() {
		servicePortalPage.impersonateUser("Dianna Kelly");
		System.out.println();
	}

	@Then("Validate static text in request form")
	public void validateStaticText() {
		servicePortalPage.validateStaticText();
	}

	@Then("validate child tickets")
	public void validateChildTickets() throws InterruptedException {
		servicePortalPage.validateChildTickets();
	}

	@Then("Open child ticket")
	public void openChildTicket() throws InterruptedException {
		servicePortalPage.openChildTicket();
	}

	@Then("Update curation count")
	public void updateCurationCOunt() {
		servicePortalPage.updateCurationCount();
		servicePortalPage.updateStatusOfTicket();
	}

	@Then("User should see updated curation count for parent ticket")
	public void assertCurationCountAs10() {
		servicePortalPage.verifyCurationCOunt();

	}

	@Then("Verify Email notification with subject as {string}")
	public void verifyEmail(String subject) throws InterruptedException {
		boolean status = servicePortalPage.verifyEmail(subject);

		Assert.assertEquals(true, status);

	}

	@Then("Go to view my tickets")
	public void go_to_view_my_tickets() throws InterruptedException {
		try {
			servicePortalPage.viewMyTickets();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw e;
		}
	}

	@Then("Open latest ticket")
	public void open_latest_ticket() {
		servicePortalPage.clickOnMyHistoricalTickets();
		servicePortalPage.clickOnAllFilter();
		servicePortalPage.openFirstTicket();
	}

	@Then("User should see workflow progress indicator")
	public void user_should_see_workflow_progress_indicator() {
		Assert.assertTrue(servicePortalPage.isWorkFlowProgressBarAvailable(), "Workflow Progress bar is not available");
	}

	@Then("Check if breadcrumb is present as {string}")
	public void check_if_breadcrumb_is_present_as(String string) {
		Assert.assertTrue(servicePortalPage.isBreadCrumTrailAvailable(), "BreadCrumTrail is not available");
	}

	@Then("User shouldnt see Ticket detail link")
	public void ticketDetailsLinkMissing() {
		Assert.assertTrue(servicePortalPage.isBreadCrumTrailAvailable(), "Ticket details link might be present");

	}

	@After
	public void genericTearDown(Scenario s) throws TestingException {
		CucumberLogUtils.logScreenShot();
		if (WebDriverUtils.webDriver != null) {
			WebDriverUtils.closeWebDriver();
			PageCache.getInstance().destroyInstances();
		}
	}

}
