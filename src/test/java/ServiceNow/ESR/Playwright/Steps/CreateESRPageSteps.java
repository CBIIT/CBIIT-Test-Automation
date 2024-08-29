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

    @And("user sees the create ESR page where {string}, {string} and {string} are displayed")
    public void user_sees_the_create_esr_page_where_and_are_displayed(String customerDetailsText, String projectDetailsText, String teamDetailsText) {
        CreateESRPageStepsImplementation.verifyTextOnCreateESRPage(customerDetailsText, projectDetailsText, teamDetailsText);
    }
}
