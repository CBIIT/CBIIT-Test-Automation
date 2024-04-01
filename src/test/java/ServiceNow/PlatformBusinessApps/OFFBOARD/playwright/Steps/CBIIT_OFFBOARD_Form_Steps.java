package ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Steps;

import ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.Pages.OFFBOARD_Page;
import ServiceNow.PlatformBusinessApps.OFFBOARD.playwright.StepsImplementation.OFFBOARD_StepsImpl;
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
        assertThat(PlaywrightUtils.page.locator(OFFBOARD_Page.cbiit_OffBoardingTextOnTheTop)).containsText(expectedText);
    }
}
