package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.StepImpl.Travel_Request_Portal_Form_StepImpl;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.TestProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Travel_Request_Portal_Form_Steps {

    @Given("I am an authenticated NCI user,")
    public void i_am_an_authenticated_nci_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    @When("I navigate to the NCI at Your Service Portal,")
    public void i_navigate_to_the_nci_at_your_service_portal() {
        Travel_Request_Portal_Form_StepImpl.i_navigate_to_the_nci_at_your_service_portal();
    }

    @When("I click on {string}")
    public void i_click_on(String services) {
        Travel_Request_Portal_Form_StepImpl.i_click_on(services);
    }

    @When("I click {string},")
    public void i_click(String cbiitBusinessServices) {
        Travel_Request_Portal_Form_StepImpl.i_click(cbiitBusinessServices);
    }

    @Then("I will see the current form {string} updated to {string}")
    public void i_will_see_the_current_form_updated_to(String travelRequest, String travelPlanningSystem) {
        Travel_Request_Portal_Form_StepImpl.i_will_see_the_current_form_updated_to(travelRequest, travelPlanningSystem);
    }

    @Given("I am an authenticated DOC CGH Travel Request User")
    public void i_am_an_authenticated_doc_cgh_travel_request_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Dimetria Branch");
    }

    @When("I navigate to the Trip Information section of the form,")
    public void i_navigate_to_the_trip_information_section_of_the_form() {
        Travel_Request_Portal_Form_StepImpl.i_navigate_to_the_trip_information_section_of_the_form();
    }

    @Then("I should see the required {string} field to enter date")
    public void i_should_see_the_required_field_to_enter_date(String travelStartDate) {
        Travel_Request_Portal_Form_StepImpl.i_should_see_the_required_field_to_enter_date(travelStartDate);
    }

    @Then("also see the required {string} field to enter date")
    public void also_see_the_required_field_to_enter_date(String travelEndDate) {
        Travel_Request_Portal_Form_StepImpl.also_see_the_required_field_to_enter_date(travelEndDate);
    }

    @Then("the {string} field will map to the Travel Start Date field in the variables section of the RITM in NV")
    public void the_field_will_map_to_the_travel_start_date_field_in_the_variables_section_of_the_ritm_in_nv(String travelStartDate) {
        Travel_Request_Portal_Form_StepImpl.the_field_will_map_to_the_travel_start_date_field_in_the_variables_section_of_the_ritm_in_nv(travelStartDate);
    }

    @Then("the {string} field will map to the Travel End Date in the variables section of the RITM in NV")
    public void the_field_will_map_to_the_travel_end_date_in_the_variables_section_of_the_ritm_in_nv(String travelEndDate) {
        Travel_Request_Portal_Form_StepImpl.the_field_will_map_to_the_travel_end_date_in_the_variables_section_of_the_ritm_in_nv(travelEndDate);
    }

    @When("I am on the {string} form")
    public void i_am_on_the_form(String travelPlanningSystem) {
        Travel_Request_Portal_Form_StepImpl.i_am_on_the_form(travelPlanningSystem);
    }

    @Then("I verify the first four questions on the form under {string} section")
    public void i_verify_the_first_four_questions_on_the_form_under_section(String travelQuestions) {
        Travel_Request_Portal_Form_StepImpl.i_verify_the_first_four_questions_on_the_form_under_section(travelQuestions);
    }

    @Then("the first question {string} is optional")
    public void the_first_question_is_optional(String travelQuestionOne) {
        Travel_Request_Portal_Form_StepImpl.the_first_question_is_optional(travelQuestionOne);
    }

    @Then("the second question {string} is optional")
    public void the_second_question_is_optional(String travelQuestionTwo) {
        Travel_Request_Portal_Form_StepImpl.the_second_question_is_optional(travelQuestionTwo);
    }

    @Then("the third question {string} is optional")
    public void the_third_question_is_optional(String travelQuestionThree) {
        Travel_Request_Portal_Form_StepImpl.the_third_question_is_optional(travelQuestionThree);
    }

    @Then("I verify that the fourth question {string} is also optional")
    public void i_verify_that_the_fourth_question_is_also_optional(String travelQuestionFour) {
        Travel_Request_Portal_Form_StepImpl.i_verify_that_the_fourth_question_is_also_optional(travelQuestionFour);
    }

    @Then("I will not see the following help text language under the field {string} under the {string} section:{string}")
    public void i_will_not_see_the_following_help_text_language_under_the_field_under_the_section(String destinationType, String event, String helpText) {
        Travel_Request_Portal_Form_StepImpl.i_will_not_see_the_following_help_text_language_under_the_field_under_the_section(destinationType, event, helpText);
    }

    @Then("I will not see the Header on the form {string},")
    public void i_will_not_see_the_header_on_the_form(String travelCashAdvance) {
        Travel_Request_Portal_Form_StepImpl.i_will_not_see_the_header_on_the_form(travelCashAdvance);
    }

    @Then("the following fields {string} and {string} under Travel Cash Advance section will be removed")
    public void the_following_fields_and_under_travel_cash_advance_section_will_be_removed(String cashAdvanceRequested, String reasonForCashAdvance) {
        Travel_Request_Portal_Form_StepImpl.the_following_fields_and_under_travel_cash_advance_section_will_be_removed(cashAdvanceRequested, reasonForCashAdvance );
    }

    @Given("I am not a CGH user")
    public void i_am_not_a_cgh_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Warren Kibbe");
    }

    @When("I log in to the NCI at Your Service Portal,")
    public void i_log_in_to_the_nci_at_your_service_portal() {
        page.navigate(TestProperties.getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify that the Travel Planning System is not visible in the catalog item.
     */
    @Then("I should not see the Travel Planning System in the catalog item.")
    public void i_should_not_see_the_travel_planning_system_in_the_catalog_item() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        assertThat(page.locator("#fresponsive")).containsText("Services");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//a[@class='level-2-link ng-binding dropdown-toggle dropdown'][normalize-space()='CBIIT Business Services']").isHidden();
        CucumberLogUtils.playwrightScreenshot(page);

        //Travel Planning System Request do not exist in the catalogue item for non-CGH user
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("Travel Planning System"))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);

        //inserted the Travel Planning System URL for Non-CGH user and verified that user do not have access to Travel Planning System Request
        page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_sc_cat_item&sys_id=b246963e1b2a7d50344042e2b24bcb64");
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("You are either not authorized to view this content or the record is not valid.");
        CucumberLogUtils.playwrightScreenshot(page);
        CommonUtils.sleep(6000);
    }
}