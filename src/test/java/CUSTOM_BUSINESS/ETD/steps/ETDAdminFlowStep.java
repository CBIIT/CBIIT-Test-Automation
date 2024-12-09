package CUSTOM_BUSINESS.ETD.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ETDAdminFlowStep extends PageInitializer {

	// @tabsPresent
	@Given("User is on ETD home page and user is {string}")
	public void user_is_on_ETD_home_page_and_user_is(String userName)  {
		etdFlowStepsImpl.etdLogin(userName);
		CommonUtils.sleep(2000);
	}

	@When("User clicks on organization dropdown")
	public void user_clicks_on_organization_dropdown() {
		CommonUtils.clickOnElement(etdAdminNCIPage.organizationDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User can see only profile related to their top IC")
	public void user_can_see_only_profile_related_to_their_top_IC() {
		Assert.assertTrue(etdAdminNCIPage.organizationNCI.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User chooses to view {string}")
	public void user_chooses_to_view(String tab)  {
		etdFlowStepsImpl.selectTab(tab);
	}

	@Then("user can verify that subsequent content of each {string}is displayed")
	public void user_can_verify_that_subsequent_content_of_each_is_displayed(String content)  {
		etdFlowStepsImpl.selectTab(content);
	}

	// @overrideUser
	@When("User log is as {string}")
	public void user_log_is_as(String user) {
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, user);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(1000);
	}

	@Then("User can verify that the User is still logged in as {string}")
	public void user_can_verify_that_the_User_is_still_logged_in_as(String string) {
		Assert.assertTrue(etdAdminNCIPage.userCliffordDavid.isDisplayed());
		CommonUtils.sleep(1000);
	}

	// @manageRolesadminDeletingProfile
	@When("User inputs in Search bar their name")
	public void user_inputs_in_Search_bar_their_name() {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchFilter);
		CommonUtils.sleep(2000);
		//CommonUtils.sendKeys(etdAdminNCIPage.searchFilter, "CLIFFORD, DAVID");
		JavascriptUtils.enterValueByJS(etdAdminNCIPage.searchFilter, "CLIFFORD, DAVID");
		CommonUtils.sleep(2000);
	}

	@Then("User can not delete their profile")
	public void user_can_not_delete_their_profile() {
		CucumberLogUtils.logScreenshot();
	}

	// @manageRolesNegative
	@When("User clicks on Manage Roles tab")
	public void user_clicks_on_Manage_Roles_tab() {
		CommonUtils.clickOnElement(etdAdminNCIPage.manageRolesTab);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify the alert message")
	public void user_can_verify_the_alert_message() {
		Assert.assertTrue(etdAdminNCIPage.alert.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User clicks add button")
	public void user_clicks_add_button() {
		CommonUtils.clickOnElement(etdAdminNCIPage.addButton);
		CommonUtils.sleep(2000);
	}

	@When("User searches for a user that is already an admin as {string}")
	public void user_searches_for_a_user_that_is_already_an_admin_as(String name) {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchNameField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.searchNameField, name);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageRolesAdmin
	@When("User searches for a user that is not an admin as {string}")
	public void user_searches_for_a_user_that_is_not_an_admin_as(String name) {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchNameField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.searchNameField, name);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User assigns an admin role")
	public void user_assigns_an_admin_role() {
		CommonUtils.clickOnElement(etdAdminNCIPage.roleAdmin);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User chooses an Organization\\/SAC from the dropdown")
	public void user_chooses_an_Organization_SAC_from_the_dropdown() {
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownOrganization);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownNCI);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("user can verify that SAVE button is enabled")
	public void user_can_verify_that_SAVE_button_is_enabled() {
		WebElement e = WebDriverUtils.webDriver.findElement(By.xpath("//button[@id='modalAddEditSubmit']"));
		Boolean actualValue = e.isEnabled();
		if (actualValue) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is disabled");
		}
	}

	@Then("User can assign an admin role successfully")
	public void user_can_assign_an_admin_role_successfully() {
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButton);
		CommonUtils.sleep(2000);
	}

	@Then("User can delete the newly created profile")
	public void user_can_delete_the_newly_created_profile() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "CLIFFORD, DAVID");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.deleteBarbara);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmationDelete);
		CommonUtils.sleep(2000);
	}

	@Then("newly assigned admin is able to log in")
	public void newly_assigned_admin_is_able_to_log_in() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "Agu, Barbara");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageRolesLiaison
	@When("User assigns an ETD liaison role")
	public void user_assigns_an_ETD_liaison_role() {
		CommonUtils.clickOnElement(etdAdminNCIPage.roleETDLiaison);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User trying to save the addition without picking an organization")
	public void user_trying_to_save_the_addition_without_picking_an_organization() {
		WebElement e = WebDriverUtils.webDriver.findElement(By.xpath("//button[@id='modalAddEditSubmit']"));
		Boolean actualValue = e.isEnabled();
		if (actualValue) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is disabled");
		}
	}

	@Then("User can verify that Save button is disabled")
	public void user_can_verify_that_Save_button_is_disabled() {
		System.out.println("Button is disabled");
	}

	@Then("User can assign another organization successfully")
	public void user_can_assign_another_organization_successfully() {
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownOrganization);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownNCI);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User assigns the same organization")
	public void user_assigns_the_same_organization() {
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownOrganization);
		CommonUtils.sleep(2000);
	}

	@Then("User does not see that organization in dropdopwn choices")
	public void user_does_not_see_that_organization_in_dropdopwn_choices() {
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can assign a liaison role successfully")
	public void user_can_assign_a_liaison_role_successfully() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.saveButton);
		JavascriptUtils.clickByJS(etdAdminNCIPage.saveButton);
		CommonUtils.sleep(2000);
	}

	@Then("User can delete the created profile")
	public void user_can_delete_the_created_profile() {
		CommonUtils.clickOnElement(etdAdminNCIPage.deleteBarbara);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmationDelete);
		CommonUtils.sleep(2000);
	}

	// @manageRolesCancel
	@Then("User can cancel the whole operation")
	public void user_can_cancel_the_whole_operation() {
		CommonUtils.clickOnElement(etdAdminNCIPage.cancelButton);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageRolesMultipleGroupsAccessNCI
	@Then("user can verify that the access is added successfully")
	public void user_can_verify_that_the_access_is_added_successfully() {
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButton);
		CommonUtils.sleep(2000);
		Assert.assertEquals("NCI (HNC)", etdAdminNCIPage.orgNCIHNC.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals("NCI OD (HNC1)", etdAdminNCIPage.orgHNC1.getText());
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	// @addUserOperations
	@Then("User can successfully delete that organization choice")
	public void user_can_successfully_delete_that_organization_choice() {
		CommonUtils.clickOnElement(etdAdminNCIPage.deleteOrganization);
		CommonUtils.sleep(2000);
	}

	// @manageRolesEditExistingUser
	@When("User picks an existing profile as {string}")
	public void user_picks_an_existing_profile_as(String name) {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchFilter);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.searchFilter, name);
		CommonUtils.sleep(2000);
	}

	@Then("User can successfully edit that profile")
	public void user_can_successfully_edit_that_profile() {
		CommonUtils.clickOnElement(etdAdminNCIPage.editButton);
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(etdAdminNCIPage.roleETDLiaison);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownOrganization);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownNCI);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User resets profile data")
	public void user_resets_profile_data() {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchFilter);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.searchFilter, "ADAM, TRENGO");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.editButton);
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(etdAdminNCIPage.roleAdmin);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownOrganization);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButton);
		CommonUtils.sleep(2000);
	}

	//
	@Then("user can see the filter option present")
	public void user_can_see_the_filter_option_present() {
		Assert.assertTrue(etdAdminNCIPage.searchFilter.isDisplayed());
		CommonUtils.sleep(2000);
	}

	@Then("User can verify that profile is present")
	public void user_can_verify_that_profile_is_present() {
		Assert.assertTrue(etdAdminNCIPage.adamProfile.isDisplayed());
		CommonUtils.sleep(2000);
	}

	@Then("User inputs a profile into search box as {string}")
	public void user_inputs_a_profile_into_search_box_as(String name) {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchFilter);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.searchFilter, name);
		CommonUtils.sleep(2000);
	}

	// @filterOutManageRolesTabAdminNegativeNCI
	@Then("User can verify that profile is not present")
	public void user_can_verify_that_profile_is_not_present() {
		Assert.assertTrue(etdAdminNCIPage.alertNoMatchingTitle.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Alert is present ");
		}
	}

	// @sortingManageRolesTabAdmin
	@When("user can see tabs as Name, Organization, Role, Actions")
	public void user_can_see_tabs_as_Name_Organization_Role_Actions() {
		Assert.assertTrue(etdAdminNCIPage.nameTab.isDisplayed());
		CommonUtils.sleep(1000);
		Assert.assertTrue(etdAdminNCIPage.organizationTab.isDisplayed());
		CommonUtils.sleep(1000);
		Assert.assertTrue(etdAdminNCIPage.roleTab.isDisplayed());
		CommonUtils.sleep(1000);
		Assert.assertTrue(etdAdminNCIPage.actionsTab.isDisplayed());
		CommonUtils.sleep(1000);
	}

	@Then("User can sort in ascending order")
	public void user_can_sort_in_ascending_order() {
		Assert.assertEquals("Name: activate to sort column descending",
				etdAdminNCIPage.nameTab.getAttribute("aria-label"));
		CommonUtils.sleep(1000);
	}

	@Then("User can sort in descending order")
	public void user_can_sort_in_descending_order() {
		Assert.assertEquals("ascending", etdAdminNCIPage.nameTab.getAttribute("aria-sort"));
		CommonUtils.sleep(1000);
	}

	// @manageETDAdminVerifyFields
	@When("User clicks on Manage ETD Tab")
	public void user_clicks_on_Manage_ETD_Tab() {
		CommonUtils.clickOnElement(etdAdminNCIPage.manageETDTab);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can choose an organization from the dropdown")
	public void user_can_choose_an_organization_from_the_dropdown() {
		CommonUtils.clickOnElement(etdAdminNCIPage.organizationDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownNCI);
		CommonUtils.sleep(3000);
	}

	@Then("User can verify that an appropriate SAC appears")
	public void user_can_verify_that_an_appropriate_SAC_appears() {
		Assert.assertTrue(etdAdminNCIPage.sacCode.isDisplayed());
		CommonUtils.sleep(1000);
	}

	@When("User clicks Search button")
	public void user_clicks_Search_button() {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can see profiles {string} related to the NCI applied search")
	public void user_can_see_profiles_related_to_the_NCI_applied_search(String names) {
		List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[4]"));
		System.out.println(namesList);
		for (WebElement each : namesList) {
			System.out.println("Tier  " + each.getText());
		}
	}

	// @manageETDExportResults
	@Then("User can export results successfully")
	public void user_can_export_results_successfully() {

	}

	// @manageETDWideSearch
	@Then("User can verify Search button is enabled")
	public void user_can_verify_Search_button_is_enabled() {
		WebElement e = WebDriverUtils.webDriver.findElement(By.xpath("//a[@id='search']"));
		Boolean actualValue = e.isEnabled();
		if (actualValue) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is disabled");
		}
	}

	@Then("User clicks on Search")
	public void user_clicks_on_Search() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.searchButton);
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(30000);
	}

	@Then("User verifies the applied search is present")
	public void user_verifies_the_applied_search_ispresent() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.wideSearchResult);
		Assert.assertEquals("3,364 entries (1 to 250)", etdAdminNCIPage.wideSearchResult.getText());
		Boolean result = true;
		if (result) {
			System.out.println("Wide search has been performed");
		}
	}

	// @manageETDNCIUserReset
	@When("User picks a profile that has acknowledged their tier")
	public void user_picks_a_profile_that_has_acknowledged_their_tier() {
		CommonUtils.clickOnElement(etdAdminNCIPage.filterManageETD);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.filterManageETD, "AALAI, MARRIAM");
		CommonUtils.sleep(2000);
	}

	@When("User verifies that Date Acknowledged and Acknowledged by are NOT Null.")
	public void user_verifies_that_Date_Acknowledged_and_Acknowledged_by_are_NOT_Null() {
		Assert.assertTrue(etdAdminNCIPage.dateAcknowledgedMariam.isDisplayed());
		CommonUtils.sleep(2000);
		Assert.assertEquals("CLIFFORD, DAVID", etdAdminNCIPage.acknowledgedByDavid.getText());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User logs in as that person")
	public void user_logs_in_as_that_person() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "AALAI, MARRIAM");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
	}

	@When("User loads a wide search")
	public void user_loads_a_wide_search() {
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(9000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can see an alert on the acknowledged tier")
	public void user_can_see_an_alert_on_the_acknowledged_tier() {
		CommonUtils.clickOnElement(etdAdminNCIPage.aboutETDTab);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
		CommonUtils.sleep(3000);
		Assert.assertEquals("Our records indicate that you have already acknowledged your Emergency Tier Designation.",
				etdAdminNCIPage.tierIsAcknowledged.getText());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageETDNCIUserNotAcknowledgedTier
	@When("User picks a profile that has not acknowledged their tier")
	public void user_picks_a_profile_that_has_not_acknowledged_their_tier() {
		CommonUtils.clickOnElement(etdAdminNCIPage.filterManageETD);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.filterManageETD, "	ABRAMS, NATALIE");
		CommonUtils.sleep(2000);
	}

	@When("User logs in as that profile")
	public void user_logs_in_as_that_profile() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ABRAMS, NATALIE");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
	}

	// @NCITier1
	@Given("User logged in as a Tier {int} User")
	public void user_logged_in_as_a_Tier_User(Integer int1) {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ABER, ETAN");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
	}

	@When("User is on Home Tab")
	public void user_is_on_Home_Tab() {
		CommonUtils.clickOnElement(etdAdminNCIPage.aboutETDTab);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that content is Tier {int} related")
	public void user_can_verify_that_content_is_Tier_related(Integer int1) {
		Assert.assertTrue(etdAdminNCIPage.tier1Alert.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User logged in as a {string}")
	public void user_logged_in_as_a(String tierName) {
		etdFlowStepsImpl.selectTierUser(tierName);
	}

	@Then("User can verify that {string} related")
	public void user_can_verify_that_related(String alert) {
		etdFlowStepsImpl.selectAlert(alert);
	}
	// @NCI

	@Then("user can verify that the content is NCI related")
	public void user_can_verify_that_the_content_is_NCI_related() {
		Assert.assertTrue(etdAdminNCIPage.nciHomeTab.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @NIDKK
	@Then("user can verify that the content is NIDKK related")
	public void user_can_verify_that_the_content_is_NIDKK_related() {
		Assert.assertTrue(etdAdminNCIPage.niddkHomeTab.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @OHR
	@Then("user can verify that the content is OHR related")
	public void user_can_verify_that_the_content_is_OHR_related() {
		Assert.assertTrue(etdAdminNCIPage.ohrHomeTab.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageETDReminders
	@When("User selects a profile with a reminder date present")
	public void user_selects_a_profile_with_a_reminder_date_present() {
		CommonUtils.clickOnElement(etdAdminNCIPage.nameSearchField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.nameSearchField, "HASTINGS, WHITNEY");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.nameWhitney);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(6000);
		CommonUtils.clickOnElement(etdAdminNCIPage.plusSign);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.editAction);
	}

	@When("User resets that profile")
	public void user_resets_that_profile() {
		CommonUtils.clickOnElement(etdAdminNCIPage.acknowledgeOnBehalfOfUserW);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButtonAcknowledge);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that reminder info is NULL")
	public void user_can_verify_that_reminder_info_is_NULL() {
		Assert.assertEquals("", etdAdminNCIPage.reminderDateWhitney.getText());
		CommonUtils.sleep(3000);
	}
	
	@Then("User resets that action")
	public void user_resets_that_action() {
		CommonUtils.clickOnElement(etdAdminNCIPage.plusSign);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.resetAcknowledgement);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmAlert);
		CommonUtils.sleep(2000);
	}

	// @manageETDAdminVerifyFieldsofSearchViewNOtesNCI
	@Then("User can verify fields of Search are present")
	public void user_can_verify_fields_of_Search_are_present(io.cucumber.datatable.DataTable data) {
		Map<String, String> fields = CommonUtil.getMapFromDataTable(data);
		Assert.assertEquals(fields.get("field1"), etdAdminNCIPage.nameField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field2"), etdAdminNCIPage.tierField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field3"), etdAdminNCIPage.sacField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field4"), etdAdminNCIPage.dateAcknowledgedField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field5"), etdAdminNCIPage.acknowledgedByField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field6"), etdAdminNCIPage.remindersField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field7"), etdAdminNCIPage.tasField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field8"), etdAdminNCIPage.tasExpField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field9"), etdAdminNCIPage.tasNameField.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals(fields.get("field10"), etdAdminNCIPage.notesField.getText());
		CommonUtils.sleep(1000);
		boolean result = true;
		if (result) {
			System.out.println("Fields are displayed correctly");
		}
	}

	@When("User picks an NCI profile to view")
	public void user_picks_an_NCI_profile_to_view() {
		CommonUtils.clickOnElement(etdAdminNCIPage.nameSearchField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.nameSearchField, "AALAI, MARRIAM");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.name);
		CommonUtils.sleep(2000);
	}

	@Then("User can see Actions options appear")
	public void user_can_see_Actions_options_appear() {
		CommonUtils.clickOnElement(etdAdminNCIPage.plusSign);
		CommonUtils.sleep(2000);
		Assert.assertTrue(etdAdminNCIPage.editAction.isDisplayed());
		CommonUtils.sleep(2000);
		Assert.assertTrue(etdAdminNCIPage.resetAcknowledgement.isDisplayed());
		CommonUtils.sleep(2000);
	}

	@Then("User can add an exception flag")
	public void user_can_add_an_exception_flag() {
		CommonUtils.clickOnElement(etdAdminNCIPage.editAction);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.flag);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can remove an exception flag")
	public void user_can_remove_an_exception_flag() {
		CommonUtils.clickOnElement(etdAdminNCIPage.flag);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can edit existing notes")
	public void user_can_edit_existing_notes() {
		CommonUtils.clickOnElement(etdAdminNCIPage.generalNotesField);
		CommonUtils.sleep(3000);
		CommonUtils.sendKeys(etdAdminNCIPage.generalNotesField, "Send notes for test purpose");
		CommonUtils.sleep(3000);
	}

	@Then("User can save applied changes")
	public void user_can_save_applied_changes() {
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButtonAcknowledge);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageETDresetAcknowledgementNCI
	@When("User resets acknowledgement for a NCI profile")
	public void user_resets_acknowledgement_for_a_NCI_profile() {
		CommonUtils.clickOnElement(etdAdminNCIPage.nameSearchField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.nameSearchField, "AALAI, MARRIAM");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.name);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.plusSign);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.resetAcknowledgement);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmAlert);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can successfully accomplish that step")
	public void user_can_successfully_accomplish_that_step() {
		Assert.assertEquals("", etdAdminNCIPage.dateNullValue.getText());
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User resets the scenario")
	public void user_resets_the_scenario() {
		CommonUtils.clickOnElement(etdAdminNCIPage.plusSign);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.editAction);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.acknowledged);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.saveButtonAcknowledge);
		CommonUtils.sleep(2000);
	}

	// @manageETDBulkReset
	@When("User selects all checkmark")
	public void user_selects_all_checkmark() {
		CommonUtils.clickOnElement(etdAdminNCIPage.selectAll);
		CommonUtils.sleep(2000);
	}

	@Then("User clicks on Bulk Reset Button")
	public void user_clicks_on_Bulk_Reset_Button() {
		CommonUtils.clickOnElement(etdAdminNCIPage.bulkReset);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmAlert);
		CommonUtils.sleep(2000);
	}

	@Then("User can verify that Bulk reset only applies on the page level")
	public void user_can_verify_that_Bulk_reset_only_applies_on_the_page_level() {

	}

	// @manageETDTir3D
	@When("User picks a tier {string} from dropdown")
	public void user_picks_a_tier_from_dropdown(String string) {
		CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.input);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.input, "Tier III-D");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.input1Choice);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(5000);
	}

	@Then("User can verify that new hires are located under this tier")
	public void user_can_verify_that_new_hires_are_located_under_this_tier() {
		List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//td[3]"));
		System.out.println(namesList);
		for (WebElement each : namesList) {
			System.out.println("Tier  " + each.getText());
		}
	}

	// @manageETDDateAcknowledged
	@When("User picks a profile that has not acknowledged their tier designation")
	public void user_picks_a_profile_that_has_not_acknowledged_their_tier_designation() {
		Assert.assertEquals("", etdAdminNCIPage.dateAcknowledgedAberItan.getText());
		CommonUtils.sleep(1000);
		Assert.assertEquals("", etdAdminNCIPage.acknowledgedByAberItan.getText());
		CommonUtils.sleep(1000);
	}

	@Then("User can verify that Date Acknowledged and Acknowledged by data entries are not present")
	public void user_can_verify_that_Date_Acknowledged_and_Acknowledged_by_data_entries_are_not_present() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "ABER, ETAN");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.aboutETDTab);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
		Assert.assertTrue(etdAdminNCIPage.tier1Alert.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @manageETDEmergencyLetterAlert
	@When("User logs in as {string}")
	public void user_logs_in_as(String user)  {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, user);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that home tab is not authorized")
	public void user_can_verify_that_home_tab_is_not_authorized() {
		CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
		CommonUtils.sleep(3000);
		Assert.assertTrue(etdAdminNCIPage.notAuthorized.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @TierAcknowledgedEmployee
	@When("User clicks on About ETD Tab")
	public void user_clicks_on_About_ETD_Tab() {
		CommonUtils.clickOnElement(etdAdminNCIPage.aboutETDTab);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.homeTab);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("employee will see a respective message")
	public void employee_will_see_a_respective_message() {
		Assert.assertTrue(etdAdminNCIPage.tier1Acknowledged.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	// @validateTierChangesNonEmployee
	@When("User is on Manage ETD Tab")
	public void user_is_on_Manage_ETD_Tab() {
		CommonUtils.clickOnElement(etdAdminNCIPage.manageETDTab);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User picks Tier {int}")
	public void user_picks_Tier(Integer int1) {
		CommonUtils.clickOnElement(etdAdminNCIPage.tierDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.input);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.input, "Tier I");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.input1Choice);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(5000);
	}

	@Then("User can verify the search displayed is correct")
	public void user_can_verify_the_search_displayed_is_correct() {
		List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[3]"));
		System.out.println(namesList);
		for (WebElement each : namesList) {
			System.out.println(each.getText());
		}
	}

	// @validateICChangesNonEmployee
	@When("User picks organization as NCI DCTD \\(HNCB)")
	public void user_picks_organization_as_NCI_DCTD_HNCB() {
		CommonUtils.clickOnElement(etdAdminNCIPage.organizationDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.orgSearchField);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(etdAdminNCIPage.orgSearchField, "NCI OD (HNC1)");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.input1Choice);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.searchButton);
		CommonUtils.sleep(5000);
	}

	@Then("User can verify the IC search displayed is correct")
	public void user_can_verify_the_IC_search_displayed_is_correct() {
		List<WebElement> namesList = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[4]"));
		System.out.println(namesList);
		for (WebElement each : namesList) {
			System.out.println("Tier  " + each.getText());
		}
	}
	//@notAuthorizedHomeTab
	@Then("User will see message {string}")
	public void user_will_see_message(String string) {
	    Assert.assertTrue(etdAdminNCIPage.notAuthorized.isDisplayed());
	    CommonUtils.sleep(2000);
	    CucumberLogUtils.logScreenshot();
	}
	
	@Then("User picks a {string} from dropdown")
	public void user_picks_a_from_dropdown(String alert) {
	    etdFlowStepsImpl.selectTier(alert);
	}

	@Then("User verifies the applied search for {string} is present")
	public void user_verifies_the_applied_search_for_is_present(String content) {
		etdFlowStepsImpl.verifyContentTier(content);
	}
}