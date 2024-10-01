package ServiceNow.PlatformBusinessApps.OFFBOARD.Steps;

import ServiceNow.PlatformBusinessApps.OFFBOARD.Constants.CBIIT_OFFBOARD_FORM_Constants;
import ServiceNow.PlatformBusinessApps.OFFBOARD.Pages.OFFBOARD_Page;
import ServiceNow.PlatformBusinessApps.OFFBOARD.StepsImplementation.OFFBOARD_StepsImpl;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CBIIT_OFFBOARD_Form_Steps {

    @Given("I am logged in as a authenticated employee \\(Federal, Contractor, Volunteer, Fellow etc.)")
    public void i_am_logged_in_as_a_authenticated_employee_federal_contractor_volunteer_fellow_etc() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    @When("I navigate to to the Offboarding request form to put in a request to off-board or transfer an employee")
    public void i_navigate_to_to_the_offboarding_request_form_to_put_in_a_request_to_off_board_or_transfer_an_employee() {
        OFFBOARD_StepsImpl.i_navigate_to_to_the_offboarding_request_form_to_put_in_a_request_to_off_board_or_transfer_an_employee();
    }

    @Then("I expect to see the following Text at the top of the Request Form:")
    public void i_expect_to_see_the_following_text_at_the_top_of_the_request_form(String expectedText) {
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingFormTitleTextOnTheTopLocator)).containsText(expectedText);
    }

    @Given("I am an Offboarding requester")
    public void i_am_an_offboarding_requester() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    @When("I open the Offboarding request form")
    public void i_open_the_offboarding_request_form() {
        OFFBOARD_StepsImpl.i_open_the_offboarding_request_form();
    }

    @Then("I should see {string} field to put in a {string} Request for an employee")
    public void i_should_see_field_to_put_in_a_request_for_an_employee(String departureOrTransferField, String departure) {
        OFFBOARD_StepsImpl.i_should_see_field_to_put_in_a_request_for_an_employee(departureOrTransferField, departure);
    }

    @Then("If user selects “NO” for the “Is the employee located On Site?” field, then show the “FedEx Label Needed” field.")
    public void if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field()  {
        OFFBOARD_StepsImpl.if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field();
    }

    @Then("the “FedEx Label Needed” field should be under “Employee Address” field.")
    public void the_fedexLabelNeeded_field_should_be_under_employee_address_field() {
        OFFBOARD_StepsImpl.the_fedexLabelNeeded_field_should_be_under_employeeAddress_field();
    }

    @Then("If user selects “Yes” for the “FedEx Label Needed” field, then show the “Are Boxes Needed for Items to be returned?” field.")
    public void if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field();
    }

    @Then("the “Are Boxes Needed for Items to be returned?” field should be under “FedEx Label Needed” field.")
    public void the_areBoxesNeededForItemsToBeReturned_field_should_be_under_fedexLabelNeeded(){
        OFFBOARD_StepsImpl.the_areBoxesNeededForItemsToBeReturned_field_should_be_under_fedexLabelNeeded();
    }

    @Then("If user selects “No”, for the “Are Boxes Needed for Items to be returned?” field, then “Number of Boxes Needed?” field does not display")
    public void if_user_selects_no_for_the_areBoxesNeededForItemsToBeReturned_field_then_numberOfBoxesNeeded_field_does_not_display() {
        OFFBOARD_StepsImpl.if_user_selects_no_for_the_areBoxesNeededForItemsToBeReturned_field_then_numberOfBoxesNeeded_field_does_not_display();
    }

    @Then("If user selects “Yes”, for the “Are Boxes Needed for Items to be returned?” field, then show “Number of Boxes Needed?” field")
    public void if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field();
    }

    @Then("If user selects “Yes”, for the “ Hardware Return Ticket Already Created” field , then just show “Hardware Return Ticket Number” field.")
    public void if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field();
    }

    @Then("I should see {string} field to put in a {string} Request")
    public void i_should_see_field_to_put_in_a_request(String departureOrTransferField, String transfer) {
        OFFBOARD_StepsImpl.i_should_see_field_to_put_in_a_request(departureOrTransferField, transfer);
    }

    @Then("If user select “Yes” for the answer to “Is the employee located On Site?” field, show “Onsite Location” field.")
    public void if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field() {
        OFFBOARD_StepsImpl.if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field();
    }

    @Then("If user selects “No”, for the “ Hardware Return Ticket Already Created” field , then show both the “Return Hardware Request” link  and “Hardware Return Ticket Number” field.")
    public void if_user_selects_no_for_the_hardwareReturnTicketAlreadyCreated_field_then_show_both_the_returnHardwareRequest_link_and_hardwareReturnTicketNumber_field() {
        OFFBOARD_StepsImpl.if_user_selects_no_for_the_hardwareReturnTicketAlreadyCreated_field_then_show_both_the_returnHardwareRequest_link_and_hardwareReturnTicketNumber_field();
    }

    @Then("verify that the Hardware Request link URL should be {string}")
    public void verify_that_the_hardware_request_link_url_should_be(String expectedURL) {
        OFFBOARD_StepsImpl.verify_that_the_hardware_request_link_url_should_be(expectedURL);
    }

    @Given("I am an authenticated user with NCI credential")
    public void i_am_an_authenticated_user_with_nci_credential() {
        OFFBOARD_StepsImpl.i_am_an_authenticated_user_with_nci_credential();
    }

    @When("I fill out an offboarding form for {string} request under the {string} field")
    public void i_fill_out_an_offboarding_form_for_request_under_the_field(String departure, String departureOrTransferRequest) {
        OFFBOARD_StepsImpl.i_fill_out_an_offboarding_form_for_request_under_the_field(departure, departureOrTransferRequest);
    }

    @When("select {string} for {string} field")
    public void select_for_field(String yes, String hardwareReturnTicketAlreadyCreated) {
        OFFBOARD_StepsImpl.select_for_field(yes, hardwareReturnTicketAlreadyCreated);
    }

    @Then("{string} should be required only for departure Request")
    public void should_be_required_only_for_departure_request(String hardwareReturnTicketNumbers) {
        OFFBOARD_StepsImpl.should_be_required_only_for_departure_request(hardwareReturnTicketNumbers);
    }

    @When("I fill out an offboarding form for {string} under the {string} field")
    public void i_fill_out_an_offboarding_form_for_under_the_field(String transfer, String departureOrTransferRequest) {
        OFFBOARD_StepsImpl.i_fill_out_an_offboarding_form_for_under_the_field(transfer, departureOrTransferRequest);
    }

    @Then("{string} should NOT be required for transfer Request")
    public void should_not_be_required_for_transfer_request(String hardwareReturnTicketNumbers) {
        OFFBOARD_StepsImpl.should_not_be_required_for_transfer_request(hardwareReturnTicketNumbers);
    }

    @When("I select {string} under the {string} field")
    public void i_select_under_the_field(String transfer, String departureOrTransferRequest) {
        page.waitForSelector(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator);
        assertThat(page.locator(OFFBOARD_Page.cbiit_OffBoardingRequestFormDepartureOrTransferFieldTextLocator)).containsText(departureOrTransferRequest);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(OFFBOARD_Page.cbiit_OffBoardingDepartureOrTransferRequestDropDownLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(transfer)).click();
    }

    /**
     * Verify the dropdown options for "Is this transfer within or outside of NCI?" field.
     *
     * @param withInNCI                          The option for "Within NCI".
     * @param outsideOfNCI                       The option for "Outside of NCI".
     * @param isThisTransferWithinOrOutsideOfNCI The field name for which the dropdown options should be verified.
     */
    @Then("I should see {string},{string} drop down options for {string} field")
    public void i_should_see_drop_down_options_for_field(String withInNCI, String outsideOfNCI, String isThisTransferWithinOrOutsideOfNCI) {
        assertThat(page.locator("//span[normalize-space()='Is this transfer within or outside of NCI?']")).containsText("Is this transfer within or outside of NCI?");
        page.locator("//div[@id='s2id_sp_formfield_within_or_outside_transfer']//b").click();

        //I should see "Within NCI","Outside of NCI" drop down options for "Is this transfer within or outside of NCI?" field
        assertThat(page.getByText("Is this transfer within or outside of NCI? -- None --Within NCIOutside of NCI")).isVisible();
        assertThat(page.locator("#select2-drop")).containsText("Is this transfer within or outside of NCI? -- None --Within NCIOutside of NCI");
        CucumberLogUtils.playwrightScreenshot(page);

        // When user selects "Transfer", "Hardware Return Ticket Number(s)" field is hidden.
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_NUMBER_TEXT)).isHidden();

        // First selected "Outside of NCI" and then "Within NCI" option for the above field to display to verify the non-required assertion
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(outsideOfNCI)).click();
        page.locator("//div[@id='s2id_sp_formfield_within_or_outside_transfer']//b").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(withInNCI)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        //Verify that "Hardware Return Ticket Number(s)" field is not required when transfer within NCI
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText("Hardware Return Ticket Number(s)");
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_TEXT))).isHidden();
        String actualAttributeValue = page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Non_Required_FieldLocator).getAttribute(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldAttribute);
        Assert.assertNotEquals(actualAttributeValue, CBIIT_OFFBOARD_FORM_Constants.MANDATORY_FIELD,
                "-- VERIFY THAT 'HARDWARE RETURN TICKET NUMBER(S)' FIELD IS NOT REQUIRED WHEN AN EMPLOYEE SUBMITS TRANSFER REQUEST WITHIN NCI--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the "Outside of NCI" option in the dropdown field "Is this transfer within or outside of NCI?".
     *
     * @param outsideOfNCI The option to be selected
     */
    @Then("If I select {string} option")
    public void if_i_select_option(String outsideOfNCI) {
        page.locator("//div[@id='s2id_sp_formfield_within_or_outside_transfer']//b").scrollIntoViewIfNeeded();
        page.locator("//div[@id='s2id_sp_formfield_within_or_outside_transfer']//b").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(outsideOfNCI)).click();
        assertThat(page.locator("a").filter(new Locator.FilterOptions().setHasText(outsideOfNCI))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the given field "Hardware Return Ticket Number(s)" becomes required.
     * Also, fill out all required fields and submit the request successfully
     *
     * @param hardwareReturnTicketNumbers the ticket number of the field
     */
    @Then("{string} field should become required.")
    public void field_should_become_required(String hardwareReturnTicketNumbers) {
        page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldLocator).scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(hardwareReturnTicketNumbers);
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_TEXT))).isVisible();
        String actualAttributeValue = page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldLocator).getAttribute(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Number_Required_FieldAttribute);
        Assert.assertEquals(actualAttributeValue, CBIIT_OFFBOARD_FORM_Constants.MANDATORY_FIELD,
                "---- VERIFY THAT 'HARDWARE RETURN TICKET NUMBER(S)' FIELD IS REQUIRED WHEN AN EMPLOYEE SUBMITS TRANSFER REQUEST OUTSIDE OF NCI----");
        assertThat(page.locator("#hardware_ticket_number")).containsText("Hardware Return Ticket Number(s)");
        CucumberLogUtils.playwrightScreenshot(page);

        //fill out the Transfer Outside of NCI Request form without filling out Required field to get en error and then fill out all required fields and submit successfully
        page.locator(OFFBOARD_Page.cbiit_DateOfTransferFieldLocator).scrollIntoViewIfNeeded();
        assertThat(page.getByLabel(OFFBOARD_Page.cbiit_RequestDetails).getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT)).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_DateOfTransferFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_DATE_OF_TRANSFER_TEXT);
        page.getByLabel(OFFBOARD_Page.cbiit_ShowCalendarForDateOfTransferFieldLocator).click();
        page.getByLabel(OFFBOARD_Page.cbiit_DatePickerIsOpenedFieldLocator).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_OK_OPTION_SELECTED)).click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_HnSacTransferToFieldLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).click();
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).fill(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT_BOX_Value);
        page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CBIIT_HN_SAC_CODE_TRANSFER_TO_TEXT).press(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_FORM_ENTER_KEY);
        assertThat(page.getByLabel("Required - Point of Contact")).containsText("Point of Contact");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARD_POINT_OF_CONTACT_NAME).click();
        CucumberLogUtils.playwrightScreenshot(page);
        if_user_select_yes_for_the_answer_to_isTheEmployeeLocatedOnSite_field_show_onsiteLocation_field();
        assertThat(page.locator(OFFBOARD_Page.cbiit_SpanLocator).filter(new Locator.FilterOptions().setHasText(Pattern.compile(CBIIT_OFFBOARD_FORM_Constants.CBIIT_OFFBOARDING_HARDWARE_RETURN_TICKET_ALREADY_CREATED_FIELD_TEXT)))).isVisible();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Already_CreatedFieldLocator)).containsText("Hardware Return Ticket Already Created");
        page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_Already_CreatedTextBoxFieldLocator).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator).getByText(hardwareReturnTicketNumbers)).isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.locator(OFFBOARD_Page.cbiit_Hardware_Return_Ticket_NumberFieldLocator)).containsText(hardwareReturnTicketNumbers);
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_TEXT))).isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        assertThat(page.locator(OFFBOARD_Page.cbiit_ErrorLocator)).containsText(CBIIT_OFFBOARD_FORM_Constants.CBIIT_REQUIRED_FIELDS_ARE_INCOMPLETE_TEXT);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#hardware_ticket_number")).containsText("Hardware Return Ticket Number(s)");
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Required Hardware Return")).click();
        page.getByText("NCI-RITM0472474").click();
        assertThat(page.locator("#additional_info")).containsText("Additional Information");
        page.getByLabel("Additional Information", new Page.GetByLabelOptions().setExact(true)).fill("test");
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").scrollIntoViewIfNeeded();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//button[contains(@class,'btn btn-primary ng-binding ng-scope')]").click();
        page.waitForSelector("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']");
        assertThat(page.locator("//h1[@class='text-center text-4x m-b-lg sp-tagline-color _700']")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}