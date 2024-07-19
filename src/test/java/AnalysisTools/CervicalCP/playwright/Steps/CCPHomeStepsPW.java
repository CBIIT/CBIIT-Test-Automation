package AnalysisTools.CervicalCP.playwright.Steps;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CCPHomeStepsPW {
    @Given("the user is on the CCP home page")
    public void the_user_is_on_the_ccp_home_page() {
        PlaywrightUtils.page.navigate("https://globalcxca-qa.cancer.gov/");
        assertThat(PlaywrightUtils.page.getByLabel("Select Language:")).isVisible();
    }
    @Then("the navbar reads {string}, {string}, {string}, {string} in order")
    public void the_navbar_reads_in_order(String string, String string2, String string3, String string4) {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Home"))).isVisible();
        assertThat(PlaywrightUtils.page.getByLabel("CC3S Navigation").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("About"))).isVisible();
        assertThat(PlaywrightUtils.page.getByLabel("CC3S Navigation").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Run Scenario"))).isVisible();
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Compare Scenarios"))).isVisible();
    }
}