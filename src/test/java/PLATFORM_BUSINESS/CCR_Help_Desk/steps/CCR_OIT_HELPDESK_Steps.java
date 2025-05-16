package PLATFORM_BUSINESS.CCR_Help_Desk.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CCR_OIT_HELPDESK_Steps {

    /**
     * Logs into native view using the side door test account and impersonates an NCI Frederick user.
     *
     * @param ellenVolkmar The name of the NCI Frederick user to impersonate
     */
    @Given("I am an authenticated NCI Frederick user {string},")
    public void i_am_an_authenticated_nci_frederick_user(String ellenVolkmar) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(ellenVolkmar);
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        assertThat(page.locator("//a[@role='button'][normalize-space()='Services']")).containsText("Services");
        page.locator("//a[@role='button'][normalize-space()='Services']").click();
        page.locator("//a[@class='level-2-link ng-binding dropdown-toggle dropdown'][normalize-space()='CCR Services']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates to the CCR OIT Help Desk catalog item by clicking on the OIT Help Desk link,
     */
    @When("I go to the CCR OIT Help Desk catalog item,")
    public void i_go_to_the_ccr_oit_help_desk_catalog_item() {
        page.locator("//h4[normalize-space()='OIT Help Desk']").waitFor();
        assertThat(page.getByText("OIT Help Desk Get assistance")).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("OIT Help Desk");
        page.locator("//h4[normalize-space()='OIT Help Desk']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to access the help desk to submit a request.
     * This method performs the necessary actions to access the OIT Help Desk in order to submit a request.
     * It waits for the OIT Help Desk page to load, checks visibility of required elements, fills in necessary information,
     * and submits the request. Finally, it asserts the presence of a confirmation message.
     */
    @Then("I should be able to access the help desk to submit a request.")
    public void i_should_be_able_to_access_the_help_desk_to_submit_a_request() {
        page.locator("//h1[normalize-space()='OIT Help Desk']").waitFor();
        page.locator("//h1[normalize-space()='OIT Help Desk']").isVisible();
        page.locator("//span[@aria-label='Required - Requested for']").scrollIntoViewIfNeeded();
        page.locator("//span[@aria-label='Required - Requested for']").isVisible();
        assertThat(page.getByLabel("Required - Application")).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Lookup using list")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("ADTool")).click();
        assertThat(page.locator("#short_description").getByText("Short description")).isVisible();
        page.getByLabel("Short description").click();
        page.getByLabel("Short description").fill("Test");
        assertThat(page.locator("#description").getByText("Details")).isVisible();
        page.frameLocator("iframe[title=\"Rich Text Area\"]").getByRole(AriaRole.PARAGRAPH).click();
        page.frameLocator("iframe[title=\"Rich Text Area\"]").getByLabel("Details").fill("Test");
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true))).isVisible();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true)).click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("How can we help, Ellen?"))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Logs into the application as an authenticated user with the specified username.
     *
     * @param rohitPaul
     */
    @Given("I am an authenticated user {string} on the CCR OIT Help Desk form")
    public void i_am_an_authenticated_user_on_the_ccr_oit_help_desk_form(String rohitPaul) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(rohitPaul);
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        assertThat(page.locator("//a[@role='button'][normalize-space()='Services']")).containsText("Services");
        page.locator("//a[@role='button'][normalize-space()='Services']").click();
        page.locator("//a[@class='level-2-link ng-binding dropdown-toggle dropdown'][normalize-space()='CCR Services']").click();
        page.locator("//h4[normalize-space()='OIT Help Desk']").waitFor();
        assertThat(page.getByText("OIT Help Desk Get assistance")).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("OIT Help Desk");
        page.locator("//h4[normalize-space()='OIT Help Desk']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the "Labmatrix" option for the "Application" field in the CCR OIT Help Desk form.
     */
    @Given("I have selected Labmatrix for Application")
    public void i_have_selected_labmatrix_for_application() {
        page.locator("//span[@aria-label='Required - Application']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Application")).isVisible();
        assertThat(page.getByLabel("Required - Application")).containsText("Application");
        page.getByLabel("Required - Application").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Lookup using list")).click();
        page.locator("#s2id_autogen4_search").fill("lab");
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Labmatrix")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects "Protocol Build" for the Request Type.
     */
    @When("I select Protocol Build for Request Type")
    public void i_select_protocol_build_for_request_type() {
        page.locator("//span[normalize-space()='Request Type']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#u_request_type")).containsText("Request Type");
        page.locator("a").filter(new Locator.FilterOptions().setHasText("-- None --")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Protocol Build")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the fields: "Principal Investigator" and "Protocol Number".
     *
     * @param principalInvestigator The name of the principal investigator to be validated.
     * @param protocolNumber The protocol number to be validated.
     */
    @Then("I will see the Required fields, {string} and {string}")
    public void i_will_see_the_required_fields_and(String principalInvestigator, String protocolNumber) {
        page.locator("//span[@aria-label='Principal Investigator']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#s2id_autogen5-label").getByLabel("Principal Investigator")).isVisible();
        assertThat(page.locator("#s2id_autogen5-label")).containsText(principalInvestigator);
        page.locator("//span[normalize-space()='Protocol Number']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#protocol_number").getByText("Protocol Number")).isVisible();
        assertThat(page.locator("#protocol_number")).containsText(protocolNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}