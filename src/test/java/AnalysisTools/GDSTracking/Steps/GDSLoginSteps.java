package AnalysisTools.GDSTracking.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GDSLoginSteps extends PageInitializer {

    @Given("the user is on the GDS Tracking home page")
    public void the_user_is_on_the_gds_tracking_home_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("GDSTracking"));
        MiscUtils.sleep(2000);
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        gdsLoginPage.username.sendKeys("username");
        gdsLoginPage.password.sendKeys("Password");
        gdsLoginPage.signInButton.click();
        MiscUtils.sleep(2000);
    }

    @Then("the user is on the Find Submissions tab")
    public void the_user_is_on_the_find_submissions_tab() {
    }
}