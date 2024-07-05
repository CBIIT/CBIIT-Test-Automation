package ServiceNow.ESR.Selenium.Steps;

import ServiceNow.ESR.Selenium.StepsImplementation.CreateESRPageStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateESRPageSteps extends PageInitializer {

    @Given("a user logs in with valid credentials for Native View on the NCI at your service page {string}")
    public void a_user_logs_in_with_valid_credentials_for_native_view_on_the_nci_at_your_service_page(String appID) {
        CreateESRPageStepsImplementation.nativeViewSideDoorLogInHomePage(appID);
    }

    @And("user searches {string} in the filter bar")
    public void user_searches_in_the_filter_bar(String searchValue) {
        nciNativeViewPage.nativeViewFilterNavigator.sendKeys(searchValue);
    }

    @And("the user clicks on create ESR")
    public void the_user_clicks_on_create_esr() {
        CreateESRPageStepsImplementation.clickCreateTicketAndSwitchToFrame();
    }

    @Then("user is directed to the create ESR page where {string} and {string} are displayed")
    public void user_is_directed_to_the_create_esr_page_where_and_are_displayed(String expectedOrganizationalAffiliationTextForESR, String expectedShoppingCartTextESR) {
        CreateESRPageStepsImplementation.textConfirmedOnCreateESRPage(expectedOrganizationalAffiliationTextForESR, expectedShoppingCartTextESR);
    }
}
