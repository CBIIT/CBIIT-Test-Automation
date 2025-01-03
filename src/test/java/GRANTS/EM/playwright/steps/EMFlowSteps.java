package GRANTS.EM.playwright.steps;

import GRANTS.EM.playwright.stepsImplementation.EM_Steps_Implementation;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class EMFlowSteps {

    @Given("User is logged in as Primary ITwoE Coordinator - PW")
    public void user_is_logged_in_as_primary_i_two_e_coordinator_pw() {
        EM_Steps_Implementation.user_is_logged_in_as_primary_i_two_e_coordinator_pw();
    }

    @When("User inputs {string} into the Name field and clicks search - PW")
    public void user_inputs_into_the_name_field_and_clicks_search_pw(String user) {
        EM_Steps_Implementation.user_inputs_into_the_name_field_and_clicks_search_pw(user);
    }

    @When("User clicks {string} button - PW")
    public void user_clicks_button_pw(String value) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(value)).click();
    }

    @When("tester deletes {string} role to re-run test before adding role - PW")
    public void tester_deletes_role_to_re_run_test_before_adding_role_pw(String value) {
        EM_Steps_Implementation.tester_deletes_role_to_re_run_test_before_adding_role_pw(value);
    }

    @When("user adds {string} role and verifies role was successfully saved")
    public void user_adds_role_and_verifies_role_was_successfully_saved(String value) {
        EM_Steps_Implementation.user_adds_role_and_verifies_role_was_successfully_saved(value);
    }

    @When("user types in {string} in ITwoE role drop down")
    public void user_types_in_in_i_two_e_role_drop_down(String roleText) {
        EM_Steps_Implementation.user_types_in_in_i_two_e_role_drop_down(roleText);
    }

    @Then("the following roles should display {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive, String valueSix, String valueSeven) {
        EM_Steps_Implementation.the_following_roles_should_display(valueOne, valueTwo, valueThree, valueFour, valueFive, valueSix, valueSeven);
    }

    @When("User chooses Administrative option from Business Area dropdown - PW")
    public void user_chooses_administrative_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.user_chooses_administrative_option_from_business_area_dropdown_pw();
    }

    @Then("the following roles should display {string}, {string}, {string}, {string}")
    public void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour) {
        EM_Steps_Implementation.the_following_roles_should_display(valueOne, valueTwo, valueThree, valueFour);
    }

    @Then("user can select {string} role - PW")
    public void user_can_select_role_pw(String value) {
        EM_Steps_Implementation.user_can_select_role_pw(value);
    }

    @Then("user can remove eGrants Access Representative role - PW")
    public void user_can_remove_e_grants_access_representative_role_pw() {
        EM_Steps_Implementation.user_can_remove_e_grants_access_representative_role_pw();
    }

    @Then("user clears Administrative option form Business Area choice - PW")
    public void user_clears_administrative_option_form_business_area_choice_pw() {
        EM_Steps_Implementation.user_clears_administrative_option_form_business_area_choice_pw();
    }

    @Then("ItwoE roles choices are cleared with message {string}")
    public void itwo_e_roles_choices_are_cleared_with_message(String value) {
        EM_Steps_Implementation.itwo_e_roles_choices_are_cleared_with_message(value);
    }

    @When("the user chooses Financial option from Business Area dropdown - PW")
    public void the_user_chooses_administrative_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.the_user_chooses_administrative_option_from_business_area_dropdown_pw();
    }

    @Then("the following roles should display {string}, {string}, {string}, {string}, {string}")
    public void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        EM_Steps_Implementation.the_following_roles_should_display(valueOne, valueTwo, valueThree, valueFour, valueFive);
    }

    @When("the user chooses General option from Business Area dropdown - PW")
    public void the_user_chooses_general_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.the_user_chooses_general_option_from_business_area_dropdown_pw();
    }

    @Then("the following role should display {string}")
    public void the_following_role_should_display(String text) {
        EM_Steps_Implementation.the_following_role_should_display(text);
    }

    @When("the user chooses Grants Management option from Business Area dropdown - PW")
    public void the_user_chooses_grants_management_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.the_user_chooses_grants_management_option_from_business_area_dropdown_pw();
    }

    @Then("the following roles should display {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive, String valueSix, String valueSeven, String valueEight, String valueNine, String valueTen) {
        EM_Steps_Implementation.the_following_roles_should_display(valueOne, valueTwo, valueThree, valueFour, valueFive, valueSix, valueSeven, valueEight, valueNine, valueTen);
    }

    @When("the user chooses Program option from Business Area dropdown - PW")
    public void the_user_chooses_program_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.the_user_chooses_program_option_from_business_area_dropdown_pw();
    }

    @When("the user chooses Referral option from Business Area dropdown - PW")
    public void the_user_chooses_referral_option_from_business_area_dropdown_pw() {
        EM_Steps_Implementation.the_user_chooses_referral_option_from_business_area_dropdown_pw();
    }

    @Then("the following roles should display {string}, {string}, {string}")
    public void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree) {
        EM_Steps_Implementation.the_following_roles_should_display(valueOne, valueTwo, valueThree);
    }

    @When("user can verify Business Area dropdown tool tip text {string}")
    public void user_can_verify_business_area_dropdown_tool_tip_text(String toolTipText) {
        EM_Steps_Implementation.user_can_verify_business_area_dropdown_tool_tip_text(toolTipText);
    }

    @When("user clicks on Business Area drop down")
    public void user_clicks_on_business_area_drop_down() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("All")).click();
    }

    @Then("user is on Manage I2E Users page")
    public void user_is_on_manage_i2e_users_page() {
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(page.url(), "https://i2e-test.nci.nih.gov/em/#/search");
    }

    @Then("{string} option contains the description expected {string}")
    public void option_contains_the_description_expected(String optionHeader, String expectedOptionText) {
        EM_Steps_Implementation.option_contains_the_description_expected(optionHeader, expectedOptionText);
    }

    @Then("verifies NIH IMPAC II hyperlink")
    public void verifies_nih_impac_ii_hyperlink() {
        String actualLink = page.locator("//a[@title='National Cancer Institute IMPAC II Extension Suite (I2E)']").getAttribute("href");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualLink, "https://i2e.nci.nih.gov/");
    }

    @Then("verifies Workbench hyperlink")
    public void verifies_workbench_hyperlink() {
        String actualLink = page.locator("//a[normalize-space()='Workbench']").getAttribute("href");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualLink, "https://i2e-test.nci.nih.gov/workbench/WorkbenchView");
    }

    @Then("verifies IMPAC II hyperlink")
    public void verifies_impac_ii_hyperlink() {
        String actualLink = page.locator("//a[@class='nav-link'][normalize-space()='IMPAC II']").getAttribute("href");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualLink, "https://inside.era.nih.gov/index.htm");
    }

    @Then("verifies that the Other Modules dropdown contains PD Assignment option")
    public void verifies_that_the_other_modules_dropdown_contains_pd_assignment_option() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Other Modules")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByLabel("Other Modules").getByRole(AriaRole.LINK)).containsText("PD Assignment");
    }

    @Then("verifies that the Help dropDown has the following options User Guide, Video Tutorials and Release Notes")
    public void verifies_that_the_help_drop_down_has_the_following_options_user_guide_video_tutorials_and_release_notes() {
        page.getByText("Help").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByLabel("Help")).containsText("User Guide");
        assertThat(page.getByLabel("Help")).containsText("Video Tutorials");
        assertThat(page.getByLabel("Help")).containsText("Release Notes");
    }

    @Then("verifies that Contact contains Email Technical support and Email business policy questions")
    public void verifies_that_contact_contains_email_technical_support_and_email_business_policy_questions() {
        page.getByText("Contact").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByLabel("Contact")).containsText("Email Technical Support");
        assertThat(page.getByLabel("Contact")).containsText("Email Business Policy Questions");
    }


    @When("user selects Administrative option")
    public void user_selects_administrative_option() {
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Administrative Facilitates")).click();
    }

    @When("when user selects All option")
    public void when_user_selects_all_option() {
        EM_Steps_Implementation.when_user_selects_all_option();
    }

    @Then("user can verify that Administrative option is no longer selected")
    public void user_can_verify_that_administrative_option_is_no_longer_selected() {
        EM_Steps_Implementation.user_can_verify_that_administrative_option_is_no_longer_selected();
    }

    @Then("user Removes selected value from business area drop down")
    public void user_removes_selected_value_from_business_area_drop_down() {
        EM_Steps_Implementation.user_removes_selected_value_from_business_area_drop_down();
    }

    @Then("user can verify that the value is no longer present")
    public void user_can_verify_that_the_value_is_no_longer_present() {
        EM_Steps_Implementation.user_can_verify_that_the_value_is_no_longer_present();
    }

    @Then("first and last name {string} of logged in user are displayed")
    public void first_and_last_name_of_logged_in_user_are_displayed(String expectedFirstAndLastName) {
        EM_Steps_Implementation.first_and_last_name_of_logged_in_user_are_displayed(expectedFirstAndLastName);
    }

    @Then("user can navigate to {string} hyperlink and verify hyperlink URL {string}")
    public void user_can_navigate_to_hyperlink_and_verify_hyperlink_url(String hyperlinkText, String expectedURL) {
        EM_Steps_Implementation.user_can_navigate_to_hyperlink_and_verify_hyperlink_url(hyperlinkText, expectedURL);
    }

    @Then("user can navigate to {string} hyperlink and verifies hyperlink URL {string}")
    public void user_can_navigate_to_hyperlink_and_verifies_hyperlink_url(String hyperlinkText, String expectedURL) {
        EM_Steps_Implementation.user_can_navigate_to_hyperlink_and_verifies_hyperlink_url(hyperlinkText, expectedURL);
    }

    @Then("user can confirm the application version number {string}")
    public void user_can_confirm_the_application_version_number(String applicationVersionNumber) {
        EM_Steps_Implementation.user_can_confirm_the_application_version_number(applicationVersionNumber);
    }

    @Then("user can verify NIH motto {string}")
    public void user_can_verify_nih_motto(String nihMottoText) {
        EM_Steps_Implementation.user_can_verify_nih_motto(nihMottoText);
    }

    @Then("clicks on the Show Advanced Filters link")
    public void clicks_on_the_show_advanced_filters_link() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Show Advanced Filters")).click();
    }

    @Then("selects Deactivated in ITwoE Account Status dropdown list")
    public void selects_deactivated_in_i_two_e_account_status_dropdown_list() {
        page.locator("app-i2e-account-status").getByRole(AriaRole.LIST).click();
        assertThat(page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Deactivated"))).isVisible();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Deactivated")).click();
    }

    @Then("clicks on the Search")
    public void clicks_on_the_search() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
    }

    String name;

    @Then("views the first record")
    public void views_the_first_record() {
        page.waitForSelector("(//div[contains(@class,'ng-star-inserted')])[1]");
        name = page.locator("(//div[contains(@class,'ng-star-inserted')])[1]").innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(name)).getByRole(AriaRole.BUTTON).click();
    }

    @Then("verifies that the page title is View Account")
    public void verifies_that_the_page_title_is_view_account() {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("h3")).containsText("View Account");
    }

    @Then("verifies the account full name")
    public void verifies_the_account_full_name() {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("app-user-information")).containsText(name);
    }

    @Then("User can verify the respective wording of Full Name tooltip")
    public void user_can_verify_the_respective_wording_of_full_name_tooltip() {
        page.locator("app-user-information").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        String actualText = page.getByText("Legal Name is always").innerText();
        Assert.assertEquals(actualText, "Legal Name is always displayed first, followed by Preferred Name.");
    }

    @Then("verifies that Account Status is displayed as Deactivated")
    public void verifies_that_account_status_is_displayed_as_deactivated() {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("app-i2e-account-information")).containsText("Account Status: Deactivated");
    }
}