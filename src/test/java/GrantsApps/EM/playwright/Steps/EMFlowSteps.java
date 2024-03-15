package GrantsApps.EM.playwright.Steps;

import GrantsApps.EM.playwright.Pages.ITrust_Page;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EMFlowSteps {

    @Given("User is logged in as Primary ITwoE Coordinator - PW")
    public void user_is_logged_in_as_primary_i_two_e_coordinator_pw() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("EM"));
        PlaywrightUtils.page.locator(ITrust_Page.usernameTextBox).fill(ConfUtils.getProperty("Username"));
        PlaywrightUtils.page.locator("#PASSWORD").fill(EncryptionUtils.decrypt(ConfUtils.getProperty("Password")));
        PlaywrightUtils.page.locator("#PASSWORD").press("Enter");
    }

    @When("User inputs {string} into the Name field and clicks search - PW")
    public void user_inputs_into_the_name_field_and_clicks_search_pw(String user) {
        PlaywrightUtils.page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).click();
        PlaywrightUtils.page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).fill(user);
        PlaywrightUtils.page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(user)).click();
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
    }

}
