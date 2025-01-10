package PLATFORM_BUSINESS.CCR_Help_Desk.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
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
    }
}