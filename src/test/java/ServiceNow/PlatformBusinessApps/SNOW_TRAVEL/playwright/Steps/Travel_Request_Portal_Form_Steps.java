package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Constants.Travel_Request_Portal_Form_Constants;
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
import org.testng.Assert;
import java.util.regex.Pattern;
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

    @Given("I am an authenticated DOC CGH Travel Request User {string}")
    public void i_am_an_authenticated_doc_cgh_travel_request_user(String cghUserDimetria) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(cghUserDimetria);
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

    /**
     * Impersonates a non-CGH user.
     *
     * The method impersonates a non-CGH user by logging in with a test account using the Playwright_ServiceNow_Common_Methods class.
     */
    @Given("I am not a CGH user {string}")
    public void i_am_not_a_cgh_user(String nonCGHUser) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(nonCGHUser);
    }

    /**
     * Logs in to the NCI at Your Service Portal.
     */
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

        CucumberLogUtils.scenario.log("----  TRAVEL PLANNING SYSTEM REQUEST DO NOT EXIST IN THE CATALOGUE ITEM FOR NON-CGH USER ----");
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("Travel Planning System"))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  INSERTED THE TRAVEL PLANNING SYSTEM URL FOR NON-CGH USER AND VERIFIED THAT USER DO NOT HAVE ACCESS TO TRAVEL PLANNING SYSTEM REQUEST ----");
        page.navigate("https://service-test.nci.nih.gov/ncisp?id=nci_sc_cat_item&sys_id=b246963e1b2a7d50344042e2b24bcb64");
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("You are either not authorized to view this content or the record is not valid.");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Completes a travel planning request form as a CGH User.
     */
    @Given("I am a CGH User {string} who is Completing a Travel Planning Request form,")
    public void i_am_a_cgh_user_who_is_completing_a_travel_planning_request_form(String cghUserAnn) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(cghUserAnn);
        page.navigate(Travel_Request_Portal_Form_Constants.TRAVEL_PLANNING_SYSTEM_PORTAL_FORM_URL);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  TRAVELER ACCOMODATIONs -- A REQUIRED FIELD ----");
        page.waitForSelector("#traveler_accomodations");
        assertThat(page.locator("#traveler_accomodations")).containsText(Travel_Request_Portal_Form_Constants.TRAVELER_ACCOMODATIONS_FIELD_TEXT);
        page.locator("#s2id_sp_formfield_traveler_accomodations a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Travel_Request_Portal_Form_Constants.REQUESTING_BUSINESS_CLASS_SELECTED_DROP_DOWN_OPTION)).click();

        CucumberLogUtils.scenario.log("----  DESTINATION TYPE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#sp_grp_checkbox_destination_type")).containsText(Travel_Request_Portal_Form_Constants.DESTINATION_TYPE_FIELD_TEXT);
        page.getByText("Local", new Page.GetByTextOptions().setExact(true)).click();

        CucumberLogUtils.scenario.log("---- IS THIS MEETING/EVENT HYBRID? -- A REQUIRED FIELD ----");
        assertThat(page.locator("#is_event_hybrid")).containsText(Travel_Request_Portal_Form_Constants.IS_THIS_MEETING_OR_EVENT_HYBRID_FIELD_TEXT);
        page.getByLabel("Event", new Page.GetByLabelOptions().setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();

        CucumberLogUtils.scenario.log("---- NAME OF EVENT -- A REQUIRED FIELD ----");
        assertThat(page.locator("#event_name")).containsText(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT);
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).click();
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).fill(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_ENTERED_VALUE);

        CucumberLogUtils.scenario.log("---- EVENT START DATE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#event_start_date")).containsText(Travel_Request_Portal_Form_Constants.EVENT_START_DATE_FIELD_TEXT);
        page.getByLabel("Show Calendar for Event Start").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();

        CucumberLogUtils.scenario.log("---- EVENT END DATE -- A REQUIRED FIELD ----");
        page.getByLabel("Show Calendar for Event End").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
    }

    /**
     * Navigates to the EVENT TYPE field on the page.
     *
     * @param eventType The type of event to navigate to
     */
    @When("I navigate to the field  {string},")
    public void i_navigate_to_the_field(String eventType) {

        CucumberLogUtils.scenario.log("----  EVENT TYPE -- A REQUIRED FIELD ----");
        page.locator("#sp_grp_checkbox_event_type_label").scrollIntoViewIfNeeded();
        assertThat(page.locator("#sp_grp_checkbox_event_type_label")).containsText(eventType);
    }

    @Then("I will see that the field is now required,")
    public void i_will_see_that_the_field_is_now_required() {

        CucumberLogUtils.scenario.log("----  EVENT TYPE IS NOW A REQUIRED FIELD -LEAVE IT UNCHECK FOR THIS TEST CASE ----");
        assertThat(page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Mandatory Event Type")).getByLabel("Mandatory")).isVisible();
        page.getByLabel("Event", new Page.GetByLabelOptions().setExact(true)).getByText("Event Type").click();
    }

    /**
     * This method ensures that the form cannot be submitted without completing a Event Type field.
     */
    @Then("I will not be able to submit the form without completing this field.")
    public void i_will_not_be_able_to_submit_the_form_without_completing_this_field() {

        CucumberLogUtils.scenario.log("----  REGISTRATION FEE -- A REQUIRED FIELD ----");
        page.locator("#registration_fees").scrollIntoViewIfNeeded();
        assertThat(page.locator("#registration_fees")).containsText(Travel_Request_Portal_Form_Constants.REGISTRATION_FEES_FIELD_TEXT);
        CommonUtils.sleep(2000);
        page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("#trip_information").scrollIntoViewIfNeeded();
        assertThat(page.locator("#trip_information")).containsText(Travel_Request_Portal_Form_Constants.TRIP_INFORMATION_HEADER_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  TRAVEL START DATE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#travel_start_date").getByLabel("Required")).isVisible();
        page.locator("#travel_start_date").getByText("Travel Start Date").click();
        assertThat(page.locator("#travel_start_date")).containsText("Travel Start Date");
        page.getByLabel("Show Calendar for Travel Start Date").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  TRAVEL END DATE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#travel_end_date").getByLabel("Required")).isVisible();
        assertThat(page.locator("#travel_end_date")).containsText("Travel End Date");
        page.getByLabel("Show Calendar for Travel End").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();

        CucumberLogUtils.scenario.log("----  SELECT THE TRANSPORTATION MODE -- A REQUIRED FIELD ----");
        page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select the Transportation Mode$"))).scrollIntoViewIfNeeded();
        assertThat(page.locator("#select_the_transportation_mode")).containsText(Travel_Request_Portal_Form_Constants.SELECT_THE_TRANSPORTATION_MODE_TEXT);
        page.getByLabel("Travel Expenses").locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Travel_Request_Portal_Form_Constants.SELECT_THE_TRANSPORTATION_MODE_DROP_DOWN_SELECTED_AIR)).click();
        page.getByLabel(Travel_Request_Portal_Form_Constants.ENTER_THE_ESTIMATED_COST_FIELD_TEXT).click();
        page.getByLabel(Travel_Request_Portal_Form_Constants.ENTER_THE_ESTIMATED_COST_FIELD_TEXT).fill(Travel_Request_Portal_Form_Constants.ENTER_THE_ESTIMATED_COST_FIELD_VALUE_ENTERED);
        page.getByText("Transportation Mode & Estimated CostSelect the Transportation Mode Air Select").click();
        assertThat(page.getByLabel("Read only - Sum of All Costs")).containsText(Travel_Request_Portal_Form_Constants.SUM_OF_ALL_COSTS_ENTERED_FIELD_TEXT);
        page.waitForSelector("#total_costs div");
        page.locator("#total_costs div").filter(new Locator.FilterOptions().setHasText(Travel_Request_Portal_Form_Constants.TOTAL_COSTS_FIELD_TEXT)).isVisible();
        page.locator("#total_costs div").filter(new Locator.FilterOptions().setHasText(Travel_Request_Portal_Form_Constants.TOTAL_COSTS_FIELD_TEXT)).click();
        assertThat(page.getByLabel("Sum of All Costs Entered", new Page.GetByLabelOptions().setExact(true))).hasValue("$100.00");
        page.locator("//span[normalize-space()='Comments']").scrollIntoViewIfNeeded();
        assertThat(page.getByText("Comments")).isVisible();
        page.getByLabel("Comments").click();
        page.getByLabel("Comments").fill("Test Comments");

        CucumberLogUtils.scenario.log("----  SUBMIT BUTTON ----");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  A REQUIRED FIELD 'EVENT TYPE 'IS NOT COMPLETED TO SUBMIT THE FORM ----");
        page.getByText("Please provide a value for these needed fields: Event Type").click();
        assertThat(page.locator("#catItemTop")).containsText("Please provide a value for these needed fields: Event Type");
        assertThat(page.getByText("Event Type").nth(2)).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- VERIFY THAT ERROR IS OCCURED AND THE REQUEST FORM IS NOT SUBMITTED ----");
        page.locator("#uiNotificationContainer").scrollIntoViewIfNeeded();
        assertThat(page.locator("#uiNotificationContainer")).containsText("Error Some fields are incomplete: Event Type");
        assertThat(page.getByText("Error Some fields are")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Sets up the test scenario for a CGH User.
     *
     * @param cghUserAnn The identifier for the CGH User.
     */
    @Given("I am a CGH User {string}")
    public void i_am_a_cgh_user(String cghUserAnn) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(cghUserAnn);
    }

    /**
     * Navigates to the travel planning request form URL and fill the form by required fields
     */
    @Given("I am Completing a Travel Planning Request form,")
    public void i_am_completing_a_travel_planning_request_form() {
        page.navigate(Travel_Request_Portal_Form_Constants.TRAVEL_PLANNING_SYSTEM_PORTAL_FORM_URL);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  TRAVELER ACCOMODATIONS -- A REQUIRED FIELD ----");
        page.waitForSelector("#traveler_accomodations");
        assertThat(page.locator("#traveler_accomodations")).containsText(Travel_Request_Portal_Form_Constants.TRAVELER_ACCOMODATIONS_FIELD_TEXT);
        page.locator("#s2id_sp_formfield_traveler_accomodations a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Travel_Request_Portal_Form_Constants.REQUESTING_BUSINESS_CLASS_SELECTED_DROP_DOWN_OPTION)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  DESTINATION TYPE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#sp_grp_checkbox_destination_type")).containsText(Travel_Request_Portal_Form_Constants.DESTINATION_TYPE_FIELD_TEXT);
        page.getByText("Local", new Page.GetByTextOptions().setExact(true)).click();

        CucumberLogUtils.scenario.log("---- IS THIS MEETING/EVENT HYBRID? -- A REQUIRED FIELD ----");
        assertThat(page.locator("#is_event_hybrid")).containsText(Travel_Request_Portal_Form_Constants.IS_THIS_MEETING_OR_EVENT_HYBRID_FIELD_TEXT);
        page.getByLabel("Event", new Page.GetByLabelOptions().setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- NAME OF EVENT -- A REQUIRED FIELD ----");
        assertThat(page.locator("#event_name")).containsText(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT);
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).click();
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).fill(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_ENTERED_VALUE);

        CucumberLogUtils.scenario.log("---- EVENT START DATE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#event_start_date")).containsText(Travel_Request_Portal_Form_Constants.EVENT_START_DATE_FIELD_TEXT);
        page.getByLabel("Show Calendar for Event Start").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();

        CucumberLogUtils.scenario.log("---- EVENT END DATE -- A REQUIRED FIELD ----");
        page.getByLabel("Show Calendar for Event End").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  EVENT TYPE -- A REQUIRED FIELD ----");
        page.locator("#sp_grp_checkbox_event_type_label").scrollIntoViewIfNeeded();
        assertThat(page.locator("#sp_grp_checkbox_event_type_label")).containsText("Event Type");
        assertThat(page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Mandatory Event Type")).getByLabel("Mandatory")).isVisible();
        page.getByLabel("Event", new Page.GetByLabelOptions().setExact(true)).getByText("Event Type").click();
        page.locator("#advisory_board").isVisible();
        page.getByText("Advisory Board").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify and select '' Yes' for the 'Registration Fees?' field on the page.
     *
     * @param yes The value to be selected for the field
     * @param RegistrationFeeField The field identifier to be interacted with
     */
    @When("{string} is selected for the {string} field,")
    public void is_selected_for_the_field(String yes, String RegistrationFeeField) {

        CucumberLogUtils.scenario.log("----  REGISTRATION FEES? -- A REQUIRED FIELD ----");
        page.locator("#registration_fees").scrollIntoViewIfNeeded();
        assertThat(page.locator("#registration_fees")).containsText(RegistrationFeeField);
        page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(yes)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  TYPE OF REGISTRATION RATE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#type_of_registration_rate")).containsText("Type of Registration Rate");
        page.getByText("Early Bird").click();

        CucumberLogUtils.scenario.log("----  REGISTRATION FEE -- A REQUIRED FIELD ----");
        assertThat(page.locator("#registration_fee")).containsText("Registration Fee");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).fill("12");

        CucumberLogUtils.scenario.log("----  REGISTRATION FEE DUE DATE  -- A REQUIRED FIELD ----");
        assertThat(page.locator("#registration_fee_due_date")).containsText("Registration Fee Due Date");
        page.getByLabel("Registration Fee Due Date", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Registration Fee Due Date", new Page.GetByLabelOptions().setExact(true)).fill("12/01/2024");
        page.getByLabel("Registration Fee Due Date", new Page.GetByLabelOptions().setExact(true)).press("Enter");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * The 'URL of Registration Site' field will be required when 'Yes' is selected for Registration Fees field.
     *
     * @param urlOfRegistrationSite The URL of the registration site to be checked as required
     */
    @Then("the {string} field will be required.")
    public void the_field_will_be_required(String urlOfRegistrationSite) {

        CucumberLogUtils.scenario.log("----  URL OF REGISTRATION SITE  -- A REQUIRED FIELD ----");
        assertThat(page.locator("#url_of_registration_site")).containsText(urlOfRegistrationSite);
        assertThat(page.locator("#url_of_registration_site").getByLabel("Required")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects 'No' for the REGISTRATION FEES? field on the page.
     *
     * @param no The value to be selected for the field
     * @param RegistrationFeeField The field identifier to be interacted with
     */
    @When("I select {string} for the {string} field")
    public void i_select_for_the_field(String no, String RegistrationFeeField) {

        CucumberLogUtils.scenario.log("----  REGISTRATION FEES? -- A REQUIRED FIELD ----");
        page.locator("#registration_fees").scrollIntoViewIfNeeded();
        assertThat(page.locator("#registration_fees")).containsText(RegistrationFeeField);
        page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(no).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * The 'URL of Registration Site' field will not be required when 'No' is selected for REGISTRATION FEES? field.
     *
     * @param urlOfRegistrationSite The URL of the registration site
     */
    @Then("the {string} field will not be required.")
    public void the_field_will_not_be_required(String urlOfRegistrationSite) {

        CucumberLogUtils.scenario.log("----  URL OF REGISTRATION SITE - A FIELD IS NOT REQUIRED WHEN 'No' IS SELECTED FOR 'REGISTRATION FEE?' FIELD ----");
        assertThat(page.getByText(urlOfRegistrationSite)).isVisible();
        assertThat(page.locator("#url_of_registration_site")).containsText(urlOfRegistrationSite);
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Required"))).isHidden();
        String actualAttributeValue = page.locator("//label[@for='sp_formfield_url_of_registration_site']").getAttribute("ng-if");
        Assert.assertNotEquals(actualAttributeValue, "field.mandatory",
                "-- VERIFY THAT 'URL of Registration Site' FIELD IS NOT REQUIRED WHEN 'No' IS SELECTED FOR REGISTRATION FEE FIELD --");
        CucumberLogUtils.playwrightScreenshot(page);
    }
}