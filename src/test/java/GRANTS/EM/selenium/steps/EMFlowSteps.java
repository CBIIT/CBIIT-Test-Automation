package GRANTS.EM.selenium.steps;

import GRANTS.EM.selenium.stepImplementation.EMStepsImplementation;
import GRANTS.EM.selenium.utils.EM_Common_Methods;
import APPS_COMMON.Utils.Dynamic_Locators;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class EMFlowSteps extends PageInitializer {

    @Given("User is logged in as Primary ITwoE Coordinator {string}")
    public void user_is_logged_in_as_Primary_ITwoE_Coordinator(String userName) {
        emStepsImplementation.emLogin(userName);
    }

    @Given("User is on Manage I{int}E Users page")
    public void user_is_on_Manage_I_E_Users_page(Integer unusedParameter) {
        EMStepsImplementation.user_is_on_Manage_I_E_Users_page(unusedParameter);
    }

    @When("User inputs {string} into the Name field and clicks search")
    public void user_inputs_into_the_name_field_and_clicks_search(String name) {
        EMStepsImplementation.user_inputs_into_the_name_field_and_clicks_search(name);
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String text) {
        CommonUtils.clickOnElement(Dynamic_Locators.dynamicContainsTextLocator(text));
    }

    @When("selects {string} from I2E Role drop down")
    public void selects_from_i2e_role_drop_down(String text) {
        EMStepsImplementation.selects_from_i2e_role_drop_down(text);
    }

    @When("selects {string} from Role Organization drop down")
    public void selects_from_role_organization_drop_down(String text) {
        EMStepsImplementation.selects_from_role_organization_drop_down(text);
    }

    @Then("User clicks on Add Role button Inside Module")
    public void user_clicks_on_Add_Role_button_Inside_Module() {
        EMStepsImplementation.user_clicks_on_Add_Role_button_Inside_Module();
    }

    @Then("User can verify that the ItwoE Technical Support Role is displayed in the Active User Roles grid")
    public void user_can_verify_that_the_I_E_Technical_Support_Role_is_displayed_in_the_Active_User_Roles_grid() {
        Assert.assertTrue(accountDetailsPage.i2eTechSupportRoleDisplayed.isDisplayed());
    }

    @When("User clicks Add Role button")
    public void user_clicks_Add_Role_button() {
        EMStepsImplementation.user_clicks_Add_Role_button();
    }

    @When("tester deletes {string} role to re-run test before adding role")
    public void tester_deletes_role_to_re_run_test_before_adding_role(String role) {
        EMStepsImplementation.tester_deletes_role_to_re_run_test_before_adding_role(role);
    }

    @When("User clicks I2E Role drop down")
    public void user_clicks_I_E_Role_drop_down() {
        EMStepsImplementation.user_clicks_I_E_Role_drop_down();
    }

    @When("User selects  I2E Technical Support Role")
    public void user_selects_I_E_Technical_Support_Role() {
        EMStepsImplementation.user_selects_I_E_Technical_Support_Role();
    }

    @Then("warning message with user {string} displays with {string}")
    public void warning_message_with_user_displays_with(String user, String message) {
        EMStepsImplementation.warning_message_with_user_displays_with(user, message);
    }

    @Then("User saves ITwoE Technical Support Role that was added role")
    public void user_saves_ITwoE_Technical_Support_Role_that_was_added_role() {
        EMStepsImplementation.user_saves_ITwoE_Technical_Support_Role_that_was_added_role();
    }

    @Given("User can verify that first and last name of logged in user {string} are shown")
    public void user_can_verify_that_first_and_last_name_of_logged_in_user_are_shown(String expectedName) {
        EMStepsImplementation.user_can_verify_that_first_and_last_name_of_logged_in_user_are_shown(expectedName);
    }

    @When("user clicks on My DOC Discrepancies")
    public void user_clicks_on_My_DOC_Discrepancies() {
        EMStepsImplementation.user_clicks_on_My_DOC_Discrepancies();
    }

    @Then("User is able to navigate to and verify My DOC Discrepancies page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_my_doc_discrepancies_page_in_different_browser_tab_with_url(String expectedURL) {
        EM_Common_Methods.switchWindowAndVerifyPageTitle(expectedURL);
    }

    @When("user clicks on IMPAC II Portfolio Analysis")
    public void user_clicks_on_IMPAC_II_Portfolio_Analysis() {
        EMStepsImplementation.user_clicks_on_IMPAC_II_Portfolio_Analysis();
    }

    @Then("User is able to navigate to and verify IMPAC II page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_impac_ii_page_in_different_browser_tab_with_url(String expectedURL) {
        EM_Common_Methods.switchWindowAndVerifyPageTitle(expectedURL);
    }

    @When("user clicks on I{int}E Portfolio Analysis")
    public void user_clicks_on_I_E_Portfolio_Analysis(Integer unusedParameter) {
        EMStepsImplementation.user_clicks_on_I_E_Portfolio_Analysis(unusedParameter);
    }

    @Then("User is able to navigate to and verify ITWoE page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_it_wo_e_page_in_different_browser_tab_with_url(String expectedURL) {
        EM_Common_Methods.switchWindowAndVerifyPageTitle(expectedURL);
    }

    @When("user clicks on Accounts Audit")
    public void user_clicks_on_Accounts_Audit() {
        EMStepsImplementation.user_clicks_on_Accounts_Audit();
    }

    @Then("User is able to navigate to and verify Admin page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_admin_page_in_different_browser_tab_with_url(String expectedURL) {
        EM_Common_Methods.switchWindowAndVerifyPageTitle(expectedURL);
    }

    @When("user clicks on NEAR")
    public void user_clicks_on_NEAR() {
        EMStepsImplementation.user_clicks_on_NEAR();
    }

    @Then("User is able to navigate to and verify NEAR page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_near_page_in_different_browser_tab_with_url(String expectedURL) {
        EM_Common_Methods.switchWindowAndVerifyPageTitle(expectedURL);
    }

    @When("user now logs in as EM Representative Bin,Li")
    public void user_now_logs_in_as_EM_Representative_Bin_Li() {
        emStepsImplementation.loginAsLiBin();
    }

    @Then("User can verify that the GM Action Manager Role is displayed in the Active User Roles grid")
    public void user_can_verify_that_the_gm_action_manager_role_is_displayed_in_the_active_user_roles_grid() {
        Assert.assertTrue(accountDetailsPage.gmActionManagerRoleText.isDisplayed());
    }

    @Then("User Saves Changes")
    public void user_Saves_Changes() {
        EMStepsImplementation.user_Saves_Changes();
    }

    @When("User can verify that predictive search {string} is available for ITwoE Role dropdown")
    public void user_can_verify_that_predictive_search_is_available_for_i_two_e_role_dropdown(String role) {
        EMStepsImplementation.user_can_verify_that_predictive_search_is_available_for_i_two_e_role_dropdown(role);
    }

    @When("User chooses Administrative option from Business Area dropdown")
    public void user_chooses_administrative_option_from_business_area_dropdown() {
        EMStepsImplementation.user_chooses_administrative_option_from_business_area_dropdown();
    }

    @Then("User can verify that appropriate ITwoE roles are available via ITwoE Role dropdown")
    public void user_can_verify_that_appropriate_i_two_e_roles_are_available_via_i_two_e_role_dropdown() {
        EMStepsImplementation.user_can_verify_that_appropriate_i_two_e_roles_are_available_via_i_two_e_role_dropdown();
    }

    @Then("User can pick eGrants Access Representative role")
    public void user_can_pick_e_grants_access_representative_role() {
        EMStepsImplementation.user_can_pick_e_grants_access_representative_role();
    }

    @Then("User can remove eGrants Access Representative role")
    public void user_can_remove_e_grants_access_representative_role() {
        EMStepsImplementation.user_can_remove_e_grants_access_representative_role();
    }

    @When("User clears Administrative option form Business Area choice")
    public void user_clears_Administrative_option_form_Business_Area_choice() {
        EMStepsImplementation.user_clears_Administrative_option_form_Business_Area_choice();
    }

    @Then("ItwoE roles choices are cleared too with message {string}")
    public void itwo_e_roles_choices_are_cleared_too_with_message(String message) {
        EMStepsImplementation.itwo_e_roles_choices_are_cleared_too_with_message(message);
    }

    @When("User chooses Administrative option from Business Area dropdown again")
    public void user_chooses_administrative_option_from_business_area_dropdown_again() {
        EMStepsImplementation.user_chooses_administrative_option_from_business_area_dropdown_again();
    }

    @Then("User can verify that Administrative related roles {string}, {string}, {string}, {string} are reflected in I2E Role dropdown")
    public void user_can_verify_that_administrative_related_roles_are_reflected_in_i2e_role_dropdown(String role1, String role2, String role3, String role4) {
        EMStepsImplementation.user_can_verify_that_administrative_related_roles_are_reflected_in_i2e_role_dropdown(role1, role2, role3, role4);
    }

    @When("User picks Financial from Business Area dropdown")
    public void user_picks_financial_from_business_area_dropdown() {
        EMStepsImplementation.user_picks_financial_from_business_area_dropdown();
    }
}