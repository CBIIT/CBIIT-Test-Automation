package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.CreateESRPageStepsImplementation;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateESRPageSteps {

    @Given("a user logs into Native View on the NCI at your service page")
    public void a_user_logs_into_native_view_on_the_nci_at_your_service_page() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    @And("navigates to create ESR")
    public void navigates_to_create_esr() {
        CreateESRPageStepsImplementation.navigateToCreateESRPage();
    }

    @Then("user sees the create ESR page where {string}, {string} and {string} are displayed")
    public void user_sees_the_create_esr_page_where_and_are_displayed(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        CreateESRPageStepsImplementation.verifyTextOnCreateESRPage(customerDetailsText, projectDetailsText, teamDetailsText);
    }

    @Given("a user logs into NCI at your service page")
    public void a_user_logs_into_nci_at_your_service_page() {
        CreateESRPageStepsImplementation.navigateToNCIPortalView();
    }

    @And("navigates to Engineering Support Requests")
    public void navigates_to_engineering_support_requests() {
        CreateESRPageStepsImplementation.navigateToCreateESRPortalView();
    }

    @Then("user sees the ESR page where {string}, {string} and {string} are displayed")
    public void user_sees_the_esr_page_where_and_are_displayed(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        CreateESRPageStepsImplementation.verifyTextOnESRPage(customerDetailsText, projectDetailsText, teamDetailsText);
    }

    @And("fills out all required information and clicks submit")
    public void fills_out_all_required_information_and_clicks_submit() {
        CreateESRPageStepsImplementation.fillRequiredInfoForESRQCreation();
    }

    @Then("user sees an ESR-Q ticket was created")
    public void user_sees_an_esr_q_ticket_was_created() {

    }

}
