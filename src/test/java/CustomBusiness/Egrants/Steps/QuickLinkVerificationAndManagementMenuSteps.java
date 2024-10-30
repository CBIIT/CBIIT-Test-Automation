package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import CustomBusiness.Egrants.Utils.Egrants_CommonUtils;
import CustomBusiness.Egrants.Utils.Egrants_Constants;
import Hooks.Hooks;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class QuickLinkVerificationAndManagementMenuSteps extends PageInitializer {

	@Given("User is logged in the application and is on the landing page")
	public void user_is_logged_in_the_application_and_is_on_the_landing_page() {
		EgrantsStepImplementation.user_is_logged_in_the_application_and_is_on_the_landing_page();
	}

	@Given("User expands Quick Links")
	public void user_expands_quick_links() {
		EgrantsStepImplementation.clicks_on_quickLinks();
	}

	@Given("verifies that the logged in user {string} is shown")
	public void verifies_that_the_logged_in_user_is_shown(String user) {
		EgrantsStepImplementation.verifies_that_the_logged_in_user_is_shown(user);
	}

	@Given("User is able to navigate to {string} hyperlink")
	public void user_is_able_to_navigate_to_hyperlink(String linkText) {
		EgrantsStepImplementation.is_able_to_navigate_to_hyperlink(linkText);
	}

	@Given("User is on the Management menu")
	public void user_is_on_the_management_menu() {
		EgrantsStepImplementation.clicks_on_management_menu();
	}

	@When("User selects {string} as the QC Reason")
	public void user_selects_as_the_qc_reason(String change) {
		EgrantsStepImplementation.selects_qc_reason();
	}

	@When("User selects {string} as QC Person")
	public void user_selects_as_qc_person(String qcPerson) {
		EgrantsStepImplementation.selects_qc_person();
	}

	@When("User clicks on Assign button to confirm the assignment")
	public void user_clicks_on_assign_button_to_confirm_the_assignment() {
		EgrantsStepImplementation.clicks_on_assign_button();
	}

	@Given("User clicks on FROM dropdown to select {string}")
	public void user_clicks_on_from_dropdown_to_select(String string) {
		EgrantsStepImplementation.clicks_on_from_dropdown();
	}

	@Given("User clicks on To dropdown to select Quality Associates")
	public void user_clicks_on_to_dropdown_to_select_quality_associates() {
		EgrantsStepImplementation.clicks_on_to_dropdown();
	}

	@Given("User selects {int}% of the documents")
	public void user_selects_of_the_documents(Integer int1) {
		EgrantsStepImplementation.clicks_on_percentage_dropdown();
	}

	@Given("User clicks on Route button to confirm the routing")
	public void user_clicks_on_route_button() {
		EgrantsStepImplementation.clicks_on_route_button();
	}

	/**
	 * This method is used to click on Admin Menu
	 *
	 */
	@Given("User is on the Admin menu")
	public void user_is_on_the_admin_menu() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.adminMenu);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Flag Maintenance from the dropdown
	 *
	 */
	@Given("User selects Flag Maintenance from the dropdown")
	public void user_selects_flag_maintenance_from_the_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.menuOptions);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.menuOptions, Egrants_Constants.FLAG_MAINTENANCE);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Setup Flag link
	 *
	 */
	@Given("User clicks on Setup Flag link")
	public void user_clicks_on_setup_flag_link() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.setupFlagsLink);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to select DS flag from the Flag Types
	 *
	 */
	@Given("User selects DS flag from the Flag Types")
	public void user_selects_ds_flag_from_the_flag_types() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.flagType);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.flagType, Egrants_Constants.FLAG_TYPE_DS);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide grant serial number
	 *
	 */
	@Given("User provides {int} as the grant serial number")
	public void user_provides_as_the_grant_serial_number(Integer serialNumber) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.serialNumberTextBox);
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.serialNumberTextBox, Egrants_Constants.SERIAL_NUMBER);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on search button
	 *
	 */
	@Given("User clicks on search button")
	public void user_clicks_on_search_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.flagMaintenanceSearchButton);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to select grant year 17
	 *
	 * @param year17
	 */
	@Given("User selects grant year {int}")
	public void user_selects_grant_year(Integer year17) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.year17CheckBox);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Setup Flags button and confirm adding DS flag for the selected grant year
	 *
	 */
	@Then("User clicks on Setup Flags button to confirm adding DS flag for the selected grant year")
	public void user_clicks_on_setup_flags_button_to_confrim_adding_ds_flag_for_the_selected_grant_year() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.setupFlagsButton);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
 		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Flag Maintenance from the dropdown
	 *
	 * @param grantYear
	 */
	@Given("User searches for {int}")
	public void user_searches_for(Integer grantYear) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.serialNumberTextBox);
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.serialNumberTextBox, Egrants_Constants.SERIAL_NUMBER);
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.searchButtonFlagMaintenance);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to select grant year 17 from the search results
	 *
	 * @param year17
	 */
	@Given("User selects grant year {int} from the search results")
	public void user_selects_grant_year_from_the_search_results(Integer year17) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.year17CheckBoxRemoveFlag);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Remove button and confirm removing the DS flag from the selected grant year
	 *
	 */
	@Then("User clicks on Remove button to confirm removing the DS flag from the selected grant year")
	public void user_clicks_on_remove_button_to_confirm_removing_ds_flag_for_the_selected_grant_year() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.removeButtonFlagMaintenance);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}
	/**
	 * This method is used to click on Admin Menu
	 *
	 */
	@Given("the IC Coordinator is on the Admin menu")
	public void the_ic_coordinator_is_on_the_admin_menu() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.adminMenu);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on eGrants Access Control from the dropdown
	 *
	 */
	@Given("the IC Coordinator selects eGrants Access Control from the dropdown")
	public void the_ic_coordinator_selects_e_grants_access_control_from_the_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.menuOptions);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.menuOptions, Egrants_Constants.EGRANTS_ACCESS_CONTROL);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Add New button
	 *
	 */
	@Given("the IC Coordinator clicks on Add New button")
	public void the_ic_coordinator_clicks_on_add_new_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.addNewUserButton);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide a RandomUserId as the User ID
	 *
	 */
	@Given("the IC Coordinator provides a RandomUserId as the User ID")
	public void the_ic_coordinator_provides_a_randomuserid_as_the_user_id() {
		String randomUserId = Egrants_CommonUtils.generateRandomUserId();
		System.out.println("Random User ID: " + randomUserId);
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.userIdTextBox, randomUserId);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Check button
	 *
	 */
	@Given("the IC Coordinator clicks on Check button")
	public void the_ic_coordinator_clicks_on_check_button() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.checkButton);
		CommonUtils.sleep(2000);
	}

	/**
	 * This method is used to verify that the system shows a message the provided user does not exist in the system and do you want to create a new account?
	 *
	 */
	@Given("verifies that the system shows a message the provided user does not exist in the system and do you want to create a new account?")
	public void verifies_that_the_system_shows_a_message() {
		String alertText = WebDriverUtils.webDriver.switchTo().alert().getText();
		Hooks.softAssert.assertTrue(alertText.contains(Egrants_Constants.ADD_USER_CONFIRMATION_MESSAGE), "*** VALIDATION TEXT DOES NOT MATCH ***");
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide the First Name
	 *
	 */
	@Given("the IC Coordinator provides the First Name")
	public void the_ic_coordinator_provides_the_first_name() {
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.first_NameTextBox, Egrants_Constants.FIRST_NAME);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide the Last Name
	 *
	 */
	@Given("the IC Coordinator provides the Last Name")
	public void the_ic_coordinator_provides_the_last_name() {
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.last_NameTextBox, Egrants_Constants.LAST_NAME);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide the Email Address
	 *
	 */
	@Given("the IC Coordinator provides the Email Address")
	public void the_ic_coordinator_provides_the_email_address() {
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.emailTextBox, Egrants_Constants.EMAIL_ADDRESS);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide access to Management and Dashboard tabs
	 *
	 */
	@Given("the IC Coordinator provides access to Management and Dashboard tabs")
	public void the_ic_coordinator_provides_access_to_management_and_dashboard_tabs() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.dashboardCheckBox);
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.managementCheckBox);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to select Program Staff role from the dropdown
	 *
	 */
	@Given("the IC Coordinator selects Program Staff as the Role")
	public void the_ic_coordinator_selects_program_staff_as_the_role() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.positionType);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.positionType, Egrants_Constants.PROGRAM_STAFF_ROLE);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to select Quality Associates as the Coordinator
	 * @param qualityAssociates
	 */
	@Given("the IC Coordinator selects {string} as the Coordinator")
	public void the_ic_coordinator_selects_as_the_coordinator(String qualityAssociates) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.coordinatorDropDown);
		CommonUtils.selectDropDownValue(Egrants_Constants.QUALITY_ASSOCIATES_COORDINATOR, egrantsQuickLinkAndManagementMenuPage.coordinatorDropDown);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Add New button to confirm adding the new user and accept the alert if thrown
	 *
	 */
	@Then("the IC Coordinator clicks on Add New button to confirm adding the new user")
	public void the_ic_coordinator_clicks_on_add_new_button_to_confirm_adding_the_new_user() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.addNewButton);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to provide the User ID
	 *
	 * @param qa
	 */
	@Given("User provides {string} as the User ID")
	public void user_provides_as_the_user_id(String qa) {
		CommonUtils.sendKeys(egrantsQuickLinkAndManagementMenuPage.userIdTextBox, qa);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Check button to verify if the user exists in the system
	 *
	 */
	@Then("the system notifies the IC Coordinator that userid already exists in the system")
	public void the_system_notifies_the_ic_coordinator_that_userid_already_exists_in_the_system() {
		String alertText = WebDriverUtils.webDriver.switchTo().alert().getText();
		Hooks.softAssert.assertTrue(alertText.contains(Egrants_Constants.USER_EXISTS_MESSAGE), "*** VALIDATION TEXT DOES NOT MATCH ***");
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Index U
	 *
	 */
	@Given("the IC Coordinator navigates to the index U")
	public void the_ic_coordinator_navigates_to_the_index_u() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.indexU);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on the Status dropdown and select Inactive
	 *
	 */
	@Given("the IC Coordinator selects Inactive from the Status dropdown")
	public void the_ic_coordinator_selects_inactive_from_the_status_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.accountStatusDropDown);
		CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.accountStatusDropDown, Egrants_Constants.INACTIVE_STATUS);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on the Edit User Information button
	 *
	 * @param userAccount
	 */
	@Given("the IC Coordinator clicks on the green arrow to edit the user information for {string}")
	public void the_ic_coordinator_clicks_on_the_green_arrow_to_edit_the_user_information_for(String userAccount) {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.editUserInformationButton);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on the Status dropdown and select Active to activate the selected user account
	 *
	 */
	@Given("the IC Coordinator selects Active from the Status dropdown")
	public void the_ic_coordinator_selects_active_from_the_status_dropdown() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.activeInactiveDropDown);
		CommonUtils.selectDropDownValue(Egrants_Constants.ACTIVATE, egrantsQuickLinkAndManagementMenuPage.activeInactiveDropDown);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Update button to confirm activating the account
	 *
	 */
	@Then("the IC Coordinator clicks on Update button to confirm activating the account")
	public void the_ic_coordinator_clicks_on_update_button_to_confirm_activating_the_account() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.updateAccountButton);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on the Status dropdown and select Inactive to deactivate the selected user account
	 *
	 */
	@Given("the IC Coordinator selects Inactive to deactivate the selected user account")
	public void the_ic_coordinator_selects_inactive_to_deactivate_the_selected_user_account() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.activeInactiveDropDown);
		CommonUtils.selectDropDownValue(Egrants_Constants.DEACTIVATE, egrantsQuickLinkAndManagementMenuPage.activeInactiveDropDown);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}

	/**
	 * This method is used to click on Update button to confirm deactivating the account
	 *
	 */
	@Then("the IC Coordinator clicks on Update button to confirm deactivating the account")
	public void the_ic_coordinator_clicks_on_update_button_to_confirm_deactivating_the_account() {
		CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.updateAccountButton);
		Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
		CucumberLogUtils.logScreenshot();
	}
}