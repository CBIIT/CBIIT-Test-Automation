package PLATFORM_BUSINESS.CTRP_CTRO.playwright.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class CTRPCTROHelpdesk_NV_Steps {

    /**
     * This step is used to log in to the ServiceNow instance using the side door test account.
     */
    @Given("the CTRP-Cloud One user group")
    public void the_ctrp_cloud_one_user_group() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Test Account: available"))).isVisible();
    }

    /**
     * This step is used to navigate to the User Groups page in ServiceNow and search for the "System Security" group.
     */
    @When("defining which user roles it has")
    public void defining_which_user_roles_it_has() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter search term to filter")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter search term to filter")).fill("System Security");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter search term to filter")).press("Enter");
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups 2 of"))).isVisible();
        assertThat(page.getByLabel("Groups 2 of")).containsText("Groups");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Groups 2 of")).click();
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByLabel("Search a specific field of")).hasValue("name");
    }

    /**
     * This step is used to verify that the "CTRP-Cloud One" role is added to the "CTRP-Cloud One" group in ServiceNow.
     * It checks that the group is searchable and that the role is visible in the Roles tab of the group record.
     *
     * @param cTRPRole
     * @param cTRPCloudOne
     */
    @Then("the {string} role is added to the {string} group")
    public void the_role_is_added_to_the_group(String cTRPRole, String cTRPCloudOne) {
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Search").setExact(true))).isEmpty();
        page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Search").setExact(true)).click();
        page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Search").setExact(true)).fill("CTRP-Cloud One");
        page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Search").setExact(true)).press("Enter");
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open record: CTRP-Cloud One"))).isVisible();
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByLabel("Open record: CTRP-Cloud One")).containsText(cTRPCloudOne);
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@aria-label='Preview record: CTRP-Cloud One']").click();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("//input[@id='sys_user_group.name']")).hasValue(cTRPCloudOne);
        assertThat(page.locator("iframe[name='gsft_main']").contentFrame().getByRole(AriaRole.TAB, new FrameLocator.GetByRoleOptions().setName("Roles (1)"))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Roles (1)']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='x_naci_ctrp_ctro.case_user']")).containsText(cTRPRole);
    }
}