package ServiceNow.ESR.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ESRDashboardPageSteps extends PageInitializer {

    @Given("a user logs in with valid credentials on the NCI at your service page")
    public void a_user_logs_in_with_valid_credentials_on_the_nci_at_your_service_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeViewSideDoor"));
        loginImpl.loginToNativeViewSideDoor();
        MiscUtils.sleep(10000);
    }

    @When("user is on the NCI Native View page")
    public void user_is_on_the_nci_native_view_page() {

    }

    @When("user searches {string} in the search bar")
    public void user_searches_in_the_search_bar(String string) {

    }

    @When("the user clicks on ESR Dashboard")
    public void the_user_clicks_on_esr_dashboard() {

    }

    @Then("user is directed to the ESR Dashboard page")
    public void user_is_directed_to_the_esr_dashboard_page() {

    }



}
