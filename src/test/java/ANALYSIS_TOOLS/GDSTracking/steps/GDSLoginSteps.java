package ANALYSIS_TOOLS.GDSTracking.steps;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import static com.nci.automation.web.TestProperties.getGdsTrackingUrl;

public class GDSLoginSteps extends PageInitializer {

    @Given("the user is on the GDS Tracking home page")
    public void the_user_is_on_the_gds_tracking_home_page() {
        WebDriverUtils.webDriver.get(getGdsTrackingUrl());
        CommonUtils.sleep(2000);
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        gdsLoginPage.username.sendKeys("username");
        gdsLoginPage.password.sendKeys("Password");
        gdsLoginPage.signInButton.click();
        CommonUtils.sleep(2000);
    }

    @Then("the user is on the Find Submissions tab")
    public void the_user_is_on_the_find_submissions_tab() {
    }
}