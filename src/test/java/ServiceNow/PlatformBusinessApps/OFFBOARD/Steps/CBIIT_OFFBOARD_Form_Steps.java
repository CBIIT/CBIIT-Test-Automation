package ServiceNow.PlatformBusinessApps.OFFBOARD.Steps;

import ServiceNow.PlatformBusinessApps.OFFBOARD.Pages.OFFBOARD_Page;
import ServiceNow.PlatformBusinessApps.OFFBOARD.StepsImplementation.OFFBOARD_StepsImpl;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

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
        OFFBOARD_StepsImpl.i_am_an_offboarding_requester();
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
}