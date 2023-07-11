package ServiceNow.ESR.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ESRDashboardPageSteps extends PageInitializer {
    @Given("a user is on the NCI at your service homepage")
    public void a_user_is_on_the_nci_at_your_service_homepage() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeViewSideDoor"));
    }
    @When("a user logs in with valid credentials")
    public void a_user_logs_in_with_valid_credentials() {
        loginImpl.loginToNativeViewSideDoor();
    }
    @When("user clicks on Native View")
    public void user_clicks_on_native_view() {

    }
    @When("user navigates to Engineering Service Request")
    public void user_navigates_to_engineering_service_request() {

    }
    @When("user clicks on Dashboard")
    public void user_clicks_on_dashboard() {

    }
    @Then("user is directed to the ESR Dashboard page")
    public void user_is_directed_to_the_esr_dashboard_page() {

    }

}
