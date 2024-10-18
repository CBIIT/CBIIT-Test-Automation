package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import CustomBusiness.Egrants.Utils.Egrants_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	public void user_selects_as_qc_person() {
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
		CommonUtils.sleep(3000);
		CommonUtils.acceptAlert();
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
		CommonUtils.sleep(3000);
		CommonUtils.acceptAlert();
		CucumberLogUtils.logScreenshot();
	}
}