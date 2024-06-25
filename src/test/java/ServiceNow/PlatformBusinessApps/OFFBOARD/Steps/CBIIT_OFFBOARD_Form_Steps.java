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

    @Then("I should see {string} field")
    public void i_should_see_field(String departureOrTransferField) {
        OFFBOARD_StepsImpl.i_should_see_field(departureOrTransferField);
    }

    @Then("If user selects “NO” for the “Is the employee located On Site?” field, then show the “FedEx Label Needed” field.")
    public void if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field()  {
        OFFBOARD_StepsImpl.if_user_selects_no_for_the_isTheEmployeeLocatedOnSiteField_then_show_the_fedexLabelNeeded_field();
    }

    @Then("the “FedEx Label Needed” field should be under “Employee Address” field.")
    public void the_fedexLabelNeeded_field_should_be_under_employee_address_field() throws Exception{
        OFFBOARD_StepsImpl.the_fedexLabelNeeded_field_should_be_under_employeeAddress_field();
    }

    @Then("If user selects “Yes” for the “FedEx Label Needed” field, then show the “Are Boxes Needed for Items to be returned?” field.")
    public void if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_fedexLabelNeeded_field_then_show_the_areBoxesNeededForItemsToBeReturned_field();
    }

    @Then("If user selects “Yes”, for the “Are Boxes Needed for Items to be returned?” field, then show “Number of Boxes Needed?” field")
    public void if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_areBoxesNeededForItemsToBeReturned_field_then_show_numberOfBoxesNeeded_field();
    }

    @Then("If user selects “Yes”, for the “ Hardware Return Ticket Already Created” field , then just show “Hardware Return Ticket Number” field.")
    public void if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field() {
        OFFBOARD_StepsImpl.if_user_selects_yes_for_the_hardwareReturnTicketAlreadyCreated_field_then_just_show_hardwareReturnTicketNumber_field();
    }
}