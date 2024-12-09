package GRANTS.EM.selenium.steps;

import GRANTS.EM.selenium.stepImplementation.EMStepsImplementation;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class Managing_User_Accounts_Steps extends PageInitializer {

    @Given("clicks Show Advanced Filters")
    public void clicks_show_advanced_filters() {
        EMStepsImplementation.clicks_show_advanced_filters();
    }

    @Given("selects {string} in I2E Account Status drop down list")
    public void selects_in_i2e_account_status_drop_down_list(String text) {
        EMStepsImplementation.selects_values_in_i2e_account_status_drop_down_list(text);
    }

    @Given("searches")
    public void searches() {
        EMStepsImplementation.searches();
    }

    @And("gets the full NED name of the first record")
    public void user_can_verify_that_user_s_full_name_is_displayed() {
        EMStepsImplementation.user_can_verify_that_user_s_full_name_is_displayed();
    }

    @Given("clicks Create on the first record in the results")
    public void clicks_create_on_the_first_record_in_the_results() {
        EMStepsImplementation.clicks_create_on_the_first_record_in_the_results();
    }

    @Given("User can verify the page name is {string}")
    public void user_can_verify_the_page_name_is(String expectedName) {
        EMStepsImplementation.user_can_verify_the_page_name_is(expectedName);
    }

    @Given("can verify that User's full name is displayed")
    public void can_verify_that_user_s_full_name_is_displayed() {
        EMStepsImplementation.user_can_verify_that_users_full_name_is_displayed();
    }

    @Given("can verify the respective wording of Full Name tooltip {string}")
    public void can_verify_the_respective_wording_of_full_name_tooltip(String expectedWording_of_full_name_tooltip) {
        EMStepsImplementation.user_can_verify_the_respective_wording_of_full_name_tooltip(expectedWording_of_full_name_tooltip);
    }

    @Given("can verify that the following fields have values displayed: NIH \\(Network) ID, E-mail, NED Organization, SAC Code, NED Classification")
    public void can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification() {
        EMStepsImplementation.user_can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification();
    }

    @Given("can verify that Account Status is set to {string}")
    public void can_verify_that_account_status_is_set_to(String expectedAccountStatus) {
        EMStepsImplementation.user_can_verify_that_account_status_is_set_to(expectedAccountStatus);
    }

    @Given("can verify the table title is {string}")
    public void can_verify_the_table_title_is(String expectedI2ErolesTableTitle) {
        EMStepsImplementation.user_can_verify_the_table_title_is(expectedI2ErolesTableTitle);
    }

    @Given("can verify the PDF document link {string} opens upon clicking on the List of I2E Roles hyperlink")
    public void can_verify_the_pdf_document_link_opens_upon_clicking_on_the_list_of_i2e_roles_hyperlink(String expected_I2E_roles_pdf_url) {
        EMStepsImplementation.user_can_verify_the_pdf_document_link_opens_upon_clicking_on_the_list_of_i2e_roles_hyperlink(expected_I2E_roles_pdf_url);
    }

    @Given("can verify that the following fields {string}, {string}, {string}, {string}, {string} are present")
    public void can_verify_that_the_following_fields_are_present(String expectedRoleText, String expectedRoleOrganisationText, String expectedAssignedCAtext, String expectedStartDateText, String expectedAction) {
        EMStepsImplementation.user_can_verify_that_the_following_fields_are_present(expectedRoleText, expectedRoleOrganisationText, expectedAssignedCAtext, expectedStartDateText, expectedAction);
    }

    @Given("can verify that {string} title is present")
    public void can_verify_that_title_is_present(String expectedTitle) {
        EMStepsImplementation.user_can_verify_that_title_is_present(expectedTitle);
    }

    @Given("clicks Add Role button")
    public void clicks_add_role_button() {
        EMStepsImplementation.user_clicks_add_role_button();
    }

    @Given("clicks I2E Role drop down")
    public void clicks_i2e_role_drop_down() {
        EMStepsImplementation.user_clicks_i2e_role_drop_down();
    }

    @Given("selects {string} Role")
    public void selects_role(String roleText) {
        CommonUtils.selectValueFromBootStrapDropDown(createNewAccountPage.i2e_role_drop_down_values, roleText);
    }

    @Given("can verify that Business Area drop down is pre-populated with {string} value")
    public void can_verify_that_business_area_drop_down_is_pre_populated_with_value(String expectedAdministrativeText) {
        EMStepsImplementation.user_can_verify_that_business_area_drop_down_is_pre_populated_with_value(expectedAdministrativeText);
    }

    @Given("can verify that all the DOCs contain {string} in Role Organization drop down list")
    public void can_verify_that_all_the_docs_contain_in_role_organization_drop_down_list(String expectedCBIITtext) {
        EMStepsImplementation.user_can_verify_that_all_the_docs_contain_in_role_organization_drop_down_list(expectedCBIITtext);
    }

    @Given("selects CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY \\(OD CBIIT) value in the Role Organization drop down list")
    public void selects_center_for_biomedical_informatics_information_technology_od_cbiit_value_in_the_role_organization_drop_down_list() {
        createNewAccountPage.role_organization_first_cbiit_value.click();
    }

    @Given("clicks Add Role button within Add Role pop up")
    public void clicks_add_role_button_within_add_role_pop_up() {
        createNewAccountPage.add_role_button_pop_up.click();
    }

    @Given("saves changes")
    public void saves_changes() {
        EMStepsImplementation.user_saves_changes();
    }

    @Given("can verify the success message is displayed {string}")
    public void can_verify_the_success_message_is_displayed(String expectedSuccessMessage) {
        EMStepsImplementation.user_can_verify_the_success_message_is_displayed(expectedSuccessMessage);
    }

    @Given("can verify that Return to Manage I2E Users hyperlink directs to url {string}")
    public void can_verify_that_return_to_manage_i2e_users_hyperlink_directs_to_url(String searchPageExpectedURL) {
        EMStepsImplementation.user_can_verify_that_return_to_manage_i2e_users_hyperlink_directs_to_url(searchPageExpectedURL);
    }

    @Given("can verify that I2E Account History is not present")
    public void can_verify_that_i2e_account_history_is_not_present() {
        Assert.assertFalse(createNewAccountPage.changeHistoryText.isDisplayed());
    }

    @Given("can verify that Save Changes button is disabled")
    public void can_verify_that_save_changes_button_is_disabled() {
        Assert.assertFalse(createNewAccountPage.save_changes_button.isEnabled());
    }

    @Given("can verify that Cancel button is enabled")
    public void can_verify_that_cancel_button_is_enabled() {
        Assert.assertTrue(createNewAccountPage.cancelButton.isEnabled());
    }

    @Given("can verify the Add Role button")
    public void can_verify_the_add_role_button() {
        EMStepsImplementation.can_verify_the_add_role_button();
    }

    @Given("can verify that {string} title is present with tooltip {string}")
    public void can_verify_that_title_is_present_with_tooltip(String expectedTitle, String text, String expectedToolTipText) {
        EMStepsImplementation.can_verify_that_title_is_present_with_tooltip(expectedTitle, text, expectedToolTipText);
    }

    @Given("user can verify that {string} button is enabled")
    public void user_can_verify_that_button_is_enabled(String text) {
        EMStepsImplementation.user_can_verify_that_button_is_enabled(text);
    }

    @Given("user can verify that {string} button is disabled")
    public void user_can_verify_that_button_is_disabled(String text) {
        EMStepsImplementation.user_can_verify_that_button_is_disabled(text);
    }

    @Given("user can verify that {string} section is displayed")
    public void user_can_verify_that_section_is_displayed(String text) {
        EMStepsImplementation.user_can_verify_that_section_is_displayed(text);
    }

    @Given("user clicks on Show for {string}")
    public void user_clicks_on_show_for(String text) {
        EMStepsImplementation.user_clicks_on_show_for(text);
    }

    @Given("user verifies Inactive I2E Roles column header names {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_inactive_i2e_roles_column_header_names(String expectedRoleText, String expectedRoleOrganizationText, String expectedStartDateText, String expectedEndDateText, String expectedUpdateByText) {
        EMStepsImplementation.user_verifies_inactive_i2e_roles_column_header_names(expectedRoleText, expectedRoleOrganizationText, expectedStartDateText, expectedEndDateText, expectedUpdateByText);
    }

    @Given("user verifies that Start Dates are displayed in descending order")
    public void user_verifies_that_start_dates_are_displayed_in_descending_order() {
        EMStepsImplementation.user_verifies_that_start_dates_are_displayed_in_descending_order();
    }

    @Given("user verifies Inactive Cancer Activities column header names {string}, {string}, {string}, {string}, {string}")
    public void user_verifies_inactive_cancer_activities_column_header_names(String expectedCancerActivityText, String expectedTypeText, String expectedStartDateText, String expectedEndDateText, String expectedUpdatedByText) {
        EMStepsImplementation.user_verifies_inactive_cancer_activities_column_header_names(expectedCancerActivityText, expectedTypeText, expectedStartDateText, expectedEndDateText, expectedUpdatedByText);
    }

    @Given("user verifies Change History column header names {string}, {string}, {string}")
    public void user_verifies_change_history_column_header_names(String expectedDateText, String expectedChangesMadeText, String expectedUpdatedByText) {
        EMStepsImplementation.user_verifies_change_history_column_header_names(expectedDateText, expectedChangesMadeText, expectedUpdatedByText);
    }

    @Given("user verifies that Start Dates for Change History table are displayed in descending order")
    public void user_verifies_that_start_dates_for_change_history_table_are_displayed_in_descending_order() {
        EMStepsImplementation.user_verifies_that_start_dates_for_change_history_table_are_displayed_in_descending_order();
    }

    @Given("user is able to click on the hyperlink {string}")
    public void user_is_able_to_click_on_the_hyperlink(String text) {
        EMStepsImplementation.user_is_able_to_click_on_the_hyperlink(text);
    }
}