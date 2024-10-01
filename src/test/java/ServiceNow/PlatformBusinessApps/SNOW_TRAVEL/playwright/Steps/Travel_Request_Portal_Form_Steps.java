package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.StepImpl.Travel_Request_Portal_Form_StepImpl;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @When("I am completing the Travel Planning System form,")
    public void i_am_completing_the_travel_planning_system_form() {
    }

    @Then("I will not see the Header on the form {string},")
    public void i_will_not_see_the_header_on_the_form(String travelCashAdvance) {
        Travel_Request_Portal_Form_StepImpl.i_will_not_see_the_header_on_the_form(travelCashAdvance);
    }

    @Then("the following fields {string} and {string} under Travel Cash Advance section will be removed")
    public void the_following_fields_and_under_travel_cash_advance_section_will_be_removed(String cashAdvanceRequested, String reasonForCashAdvance) {
        Travel_Request_Portal_Form_StepImpl.the_following_fields_and_under_travel_cash_advance_section_will_be_removed(cashAdvanceRequested, reasonForCashAdvance );
    }
}