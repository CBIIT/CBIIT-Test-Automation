package ANALYSIS_TOOLS.LDLink.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static ANALYSIS_TOOLS.LDLink.utils.LDLinkConstants.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.LD_LINK_URL;

public class LDlinkSteps extends PageInitializer {

    /**
     * This step will navigate to the LDlink home page and select the LDscore module
     */
    @Given("the user is on the LDscore module on LDlink")
    public void the_user_is_on_the_l_dscore_module_on_l_dlink() {
        page.navigate(LD_LINK_URL);
        page.getByText("LDscore Calculate LDscore.").click();
    }

    /**
     * This step verifies the link is visible and contains the same texts as provided in FF
     * params @sampleFormatLink
     */
    @Then("the link {string} is displayed")
    public void the_link_is_displayed(String sampleFormatLink) {
        assertThat(page.locator("#ldheritSampleFormat")).containsText(sampleFormatLink);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(sampleFormatLink))).isVisible();
    }

    /**
     * This step clicks on the Sample Format Link on the LDscore submodules
     * params @sampleFormatLink
     */
    @When("the user clicks on {string}")
    public void the_user_clicks_on(String sampleFormatLink) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(sampleFormatLink)).click();
    }

    /**
     * This step navigate to the Documentation page and verifies all the intended texts are displayed
     */
    @Then("the user is on the Documentation page with the LDscore text displayed")
    public void the_user_is_on_the_documentation_page_with_the_l_dscore_text_displayed() {
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_1);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_2);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_3);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_4);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_5);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_6);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_7);
        assertThat(page.locator("#help-tab")).containsText(LDLINK_LDSCORE_DOCUMENTATION_BODYTEXT_8);
    }

    /**
     * This step clicks on the "LDscore Calculation" submodule on the LDscore module
     */
    @When("the user clicks on the LDscore Calculation link")
    public void the_user_clicks_on_the_ldscore_calculation_link() {
        page.locator("#home-tab-anchor").click();
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("LDscore Calculation")).click();
    }

    /**
     * This step clicks on the "Genetic Correlation" submodule on the LDscore module
     */
    @When("the user clicks on the Genetic Correlation link")
    public void the_user_clicks_on_the_genetic_correlation_link() {
        page.locator("#home-tab-anchor").click();
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Genetic Correlation")).click();
    }
}
