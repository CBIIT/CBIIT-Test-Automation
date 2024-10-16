package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.playwright.Constants.Travel_Request_Portal_Form_Constants;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.Assert;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class Travel_Request_Portal_Form_StepImpl {

    /**
     * Navigates to the NCI at Your Service Portal.
     */
    public static void i_navigate_to_the_nci_at_your_service_portal() {
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on a SERVICES link on NCI page.
     *
     * @param services the name of the service
     */
    public static void i_click_on(String services) {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(services).setExact(true))).isVisible();
        assertThat(page.locator("#fresponsive")).containsText(services);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(services).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on a CBIIT Business Services link on NCI page under SERVICES.
     *
     * @param cbiitBusinessServices the name of the button
     */
    public static void i_click(String cbiitBusinessServices) {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(cbiitBusinessServices)).first()).isVisible();
        assertThat(page.locator("#fresponsive")).containsText(cbiitBusinessServices);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(cbiitBusinessServices)).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that Travel Request is updated to Travel Planning System
     *
     * @param travelRequest the name of the travel request
     * @param travelPlanningSystem the name of the travel planning system
     */
    public static void i_will_see_the_current_form_updated_to(String travelRequest, String travelPlanningSystem) {
        page.getByRole(AriaRole.MAIN).locator("li").filter(new Locator.FilterOptions().setHasText("Travel Planning System")).scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText(travelRequest))).isHidden();
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText(travelPlanningSystem))).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(travelPlanningSystem);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method navigates to the trip information section of the form
     * and fills out required fields of the form till trip information field
     */
    public static void i_navigate_to_the_trip_information_section_of_the_form() {
        page.navigate(Travel_Request_Portal_Form_Constants.TRAVEL_PLANNING_SYSTEM_PORTAL_FORM_URL);
        CucumberLogUtils.playwrightScreenshot(page);
        page.waitForSelector("#traveler_accomodations");
        assertThat(page.locator("#traveler_accomodations")).containsText(Travel_Request_Portal_Form_Constants.TRAVELER_ACCOMODATIONS_FIELD_TEXT);
        page.locator("#s2id_sp_formfield_traveler_accomodations a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Travel_Request_Portal_Form_Constants.REQUESTING_BUSINESS_CLASS_SELECTED_DROP_DOWN_OPTION)).click();
        assertThat(page.locator("#sp_grp_checkbox_destination_type")).containsText(Travel_Request_Portal_Form_Constants.DESTINATION_TYPE_FIELD_TEXT);
        page.getByText("Local", new Page.GetByTextOptions().setExact(true)).click();
        assertThat(page.locator("#is_event_hybrid")).containsText(Travel_Request_Portal_Form_Constants.IS_THIS_MEETING_OR_EVENT_HYBRID_FIELD_TEXT);
        page.getByLabel("Event", new Page.GetByLabelOptions().setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        assertThat(page.locator("#event_name")).containsText(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT);
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).click();
        page.getByLabel(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_TEXT).fill(Travel_Request_Portal_Form_Constants.NAME_OF_EVENT_FIELD_ENTERED_VALUE);
        assertThat(page.locator("#event_start_date")).containsText(Travel_Request_Portal_Form_Constants.EVENT_START_DATE_FIELD_TEXT);
        page.getByLabel("Show Calendar for Event Start").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
        page.getByLabel("Show Calendar for Event End").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
        assertThat(page.locator("#registration_fees")).containsText(Travel_Request_Portal_Form_Constants.REGISTRATION_FEES_FIELD_TEXT);
        CommonUtils.sleep(2000);
        page.getByRole(AriaRole.GROUP, new Page.GetByRoleOptions().setName("Registration Fee").setExact(true)).locator("a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("#trip_information").scrollIntoViewIfNeeded();
        assertThat(page.locator("#trip_information")).containsText(Travel_Request_Portal_Form_Constants.TRIP_INFORMATION_HEADER_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the required field to enter the travel start date is visible on the page.
     * and also enters the date for travel start date field
     *
     * @param travelStartDate the value entered for the travel start date
     */
    public static void i_should_see_the_required_field_to_enter_date(String travelStartDate) {
        assertThat(page.locator("#travel_start_date").getByLabel("Required")).isVisible();
        page.locator("#travel_start_date").getByText(travelStartDate).click();
        assertThat(page.locator("#travel_start_date")).containsText(travelStartDate);
        page.getByLabel("Show Calendar for Travel Start Date").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the required field to enter the travel end date is visible on the page.
     * Enters the date for the travel end date field.
     *
     * @param travelEndDate the value entered for the travel end date
     */
    public static void also_see_the_required_field_to_enter_date(String travelEndDate) {
        assertThat(page.locator("#travel_end_date").getByLabel("Required")).isVisible();
        assertThat(page.locator("#travel_end_date")).containsText(travelEndDate);
        page.getByLabel("Show Calendar for Travel End").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK").setExact(true)).click();
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
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * The field maps to the travel start date field in the variables section of the RITM in NV.
     *
     * @param travelStartDate the value to be entered for the travel start date field
     */
    public static void the_field_will_map_to_the_travel_start_date_field_in_the_variables_section_of_the_ritm_in_nv(String travelStartDate) {
        page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']").waitFor();
        page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']").isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        page.locator("//span[normalize-space()='Native View']").isVisible();
        page.locator("//span[normalize-space()='Native View']").click();
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("Travel Planning System");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Travel Requests")).click();
        CucumberLogUtils.playwrightScreenshot(page);

        //click on the most top record and click on open record button
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("(//*[@class='list_decoration_cell col-small col-center ']//a)[1]").hover();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("(//*[@class='list_decoration_cell col-small col-center ']//a)[1]").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//*[@class='btn btn-sm btn-default pop-over-button pull-right']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("#tabs2_section").getByText(Travel_Request_Portal_Form_Constants.VARIABLES_TAB).click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//span[@aria-label='Trip Information']").scrollIntoViewIfNeeded();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Trip Information", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(Travel_Request_Portal_Form_Constants.TRIP_INFORMATION_HEADER_TEXT);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.HEADING, new FrameLocator.GetByRoleOptions().setName(travelStartDate))).isVisible();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Variables form section")).containsText(travelStartDate);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the given field will map to the Travel End Date in the variables section of the RITM in NV.
     *
     * @param travelEndDate the value entered for the travel end date
     */
    public static void the_field_will_map_to_the_travel_end_date_in_the_variables_section_of_the_ritm_in_nv(String travelEndDate) {
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.HEADING, new FrameLocator.GetByRoleOptions().setName(travelEndDate))).isVisible();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Variables form section")).containsText(travelEndDate);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates to the travel planning system form
     *
     * @param travelPlanningSystem the name of the travel planning system
     */
    public static void i_am_on_the_form(String travelPlanningSystem) {
        page.navigate(Travel_Request_Portal_Form_Constants.TRAVEL_PLANNING_SYSTEM_PORTAL_FORM_URL);
        assertThat(page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName(travelPlanningSystem))).isVisible();
        assertThat(page.locator("#catItemTop")).containsText(travelPlanningSystem);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the first four questions on the form under the Travel Questions Section.
     *
     * @param travelQuestions - The name of the section.
     */
    public static void i_verify_the_first_four_questions_on_the_form_under_section(String travelQuestions) {
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(travelQuestions))).isVisible();
        assertThat(page.locator("#container_questions_container")).containsText(travelQuestions);
        assertThat(page.getByLabel(travelQuestions).getByLabel("Required", new Locator.GetByLabelOptions().setExact(true))).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the first question on the form under the Travel Questions Section is optional.
     *
     * @param travelQuestionOne The question to be verified.
     */
    public static void the_first_question_is_optional(String travelQuestionOne) {
        assertThat(page.locator("#questions_defined_role").getByLabel("Required")).isHidden();
        assertThat(page.locator("#questions_defined_role")).containsText(Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_ONE);
        Assert.assertEquals(travelQuestionOne,Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_ONE,"--VERIFY THAT FIRST QUESTION UNDER TRAVEL QUESTIONS SECTION IS OPTIONAL FOR CGH USER--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify that the second question in the form is optional.
     *
     * @param travelQuestionTwo The question to be verified.
     */
    public static void the_second_question_is_optional(String travelQuestionTwo) {
        assertThat(page.locator("#questions_strategic_plan").getByLabel("Required")).isHidden();
        assertThat(page.locator("#questions_strategic_plan")).containsText(Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_TWO);
        Assert.assertEquals(travelQuestionTwo, Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_TWO,"--VERIFY THAT SECOND QUESTION UNDER TRAVEL QUESTIONS SECTION IS OPTIONAL FOR CGH USER--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the third question on the form under the Travel Questions Section is optional.
     *
     * @param travelQuestionThree The question to be verified.
     */
    public static void the_third_question_is_optional(String travelQuestionThree) {
        assertThat(page.locator("#questions_travel_deadlines").getByLabel("Required")).isHidden();
        assertThat(page.locator("#questions_travel_deadlines")).containsText(Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_THREE);
        Assert.assertEquals(travelQuestionThree, Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_THREE,"--VERIFY THAT THIRD QUESTION UNDER TRAVEL QUESTIONS SECTION IS OPTIONAL FOR CGH USER--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the fourth question in the form under the Travel Questions Section is also optional.
     *
     * @param travelQuestionFour The question to be verified.
     */
    public static void i_verify_that_the_fourth_question_is_also_optional(String travelQuestionFour) {
        assertThat(page.locator("#questions_advisory_level").getByLabel("Required")).isHidden();
        assertThat(page.locator("#questions_advisory_level")).containsText(Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_FOUR);
        Assert.assertEquals(travelQuestionFour, Travel_Request_Portal_Form_Constants.TRAVEL_QUESTION_FOUR,"--VERIFY THAT FOURTH QUESTION UNDER TRAVEL QUESTIONS SECTION IS OPTIONAL FOR CGH USER--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that the specified help text language is not visible under
     * the Destination Type field under the Event section.
     *
     * @param destinationType the type of destination
     * @param event the event section
     * @param helpText the help text language
     */
    public static void i_will_not_see_the_following_help_text_language_under_the_field_under_the_section(String destinationType, String event, String helpText) {
        page.locator("#container_event_section").waitFor();
        page.locator("#container_event_section").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName(event))).isVisible();
        assertThat(page.locator("#container_event_section")).containsText(event);
        assertThat(page.getByLabel(event, new Page.GetByLabelOptions().setExact(true)).getByText(destinationType)).isVisible();
        assertThat(page.locator("#sp_grp_checkbox_destination_type")).containsText(destinationType);
        assertThat(page.locator("#destination div").filter(new Locator.FilterOptions().setHasText("Destination")).nth(2)).isVisible();
        assertThat(page.locator("#destination_type")).containsText(destinationType);
        assertThat(page.locator("#destination div").filter(new Locator.FilterOptions().setHasText(helpText)).nth(2)).isHidden();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByText("Local", new Page.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.locator("#local")).containsText("Local");
        page.getByText("Local", new Page.GetByTextOptions().setExact(true)).click();
        page.getByText("Domestic").click();
        page.getByText("Foreign", new Page.GetByTextOptions().setExact(true)).click();
        page.getByText("Virtual", new Page.GetByTextOptions().setExact(true)).click();
        page.getByText("Sponsored", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that "Travel Cash Advance" header on the form is not visible.
     *
     * @param travelCashAdvance the travel cash advance value
     */
    public static void i_will_not_see_the_header_on_the_form(String travelCashAdvance) {
        assertThat(page.locator("//span[@id='container_travel_cash_advance']")).containsText(travelCashAdvance);
        boolean isHidden = page.locator("//span[@id='container_travel_cash_advance']").isHidden();

        if(isHidden) {
            System.out.println("Element is hidden");
        } else {
            System.out.println("Element is visible");
        }
        assertThat(page.locator("//span[@id='container_travel_cash_advance']")).isHidden();
    }

    /**
     * The following method is used to verify that specific fields under the Travel Cash Advance section are removed.
     *
     * @param cashAdvanceRequested The value of the Cash Advance Requested field.
     * @param reasonForCashAdvance The value of the Reason for Cash Advance field.
     */
    public static void the_following_fields_and_under_travel_cash_advance_section_will_be_removed(String cashAdvanceRequested, String reasonForCashAdvance) {
        assertThat(page.locator("//span[normalize-space()='Cash (Direct Deposit) Advance Requested']")).containsText(cashAdvanceRequested);
        assertThat(page.locator("//span[normalize-space()='Cash (Direct Deposit) Advance Requested']")).isHidden();
        assertThat(page.locator("//span[normalize-space()='Reason for Cash Advance']")).containsText(reasonForCashAdvance);
        assertThat(page.locator("//span[normalize-space()='Reason for Cash Advance']")).isHidden();
    }
}