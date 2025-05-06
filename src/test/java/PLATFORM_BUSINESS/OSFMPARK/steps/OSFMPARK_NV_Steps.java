package PLATFORM_BUSINESS.OSFMPARK.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static APPS_COMMON.Pages.Playwright_Common_Locators.iframeLocator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OSFMPARK_NV_Steps {

    /**
     * This method initiates access requests for OSFM Parking Garage based on the given request.
     *
     * @param osfm_Parking_Garage_Access_Requests The type of request to be made for OSFM Parking Garage access
     */
    @Given("the {string} request")
    public void the_request(String osfm_Parking_Garage_Access_Requests) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("OSFM Parking Garage Access Requests");
        page.getByPlaceholder("Filter").press("Enter");
        page.getByLabel("OSFM Parking Garage Access Requests 1 of").click();
        assertThat(page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("OSFM Parking Garage Access"))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("OSFM Parking Garage Access Requests, filtering toolbar").locator("a")).containsText(osfm_Parking_Garage_Access_Requests);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method defines which users should be responsible for reports in the OSFM Parking Garage system.
     */
    @When("defining which users should be responsible for reports")
    public void defining_which_users_should_be_responsible_for_reports() {
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("system security");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByLabel("System Security", new Page.GetByLabelOptions().setExact(true))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByLabel("Users and Groups")).isVisible();
        page.getByLabel("Groups 2 of").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Groups 2 of")).containsText("Groups");
        page.getByLabel("Groups 2 of").click();
        page.getByLabel("Groups 2 of").press("Enter");
        assertThat(page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Groups"))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Groups, filtering toolbar").locator("a")).containsText("Groups");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method creates a group in the OSFM Parking Garage system with the specified name.
     * 
     * @param parking_Garage_Request_Report_Users
     */
    @Then("a group called {string} is created")
    public void a_group_called_is_created(String parking_Garage_Request_Report_Users) {
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).isVisible();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).click();
        page.locator(iframeLocator).contentFrame().locator("a").filter(new Locator.FilterOptions().setHasText("-- choose field --")).click();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option")).fill("Name");
        page.locator(iframeLocator).contentFrame().getByLabel("select2-results").getByText("Name").click();
        page.locator(iframeLocator).contentFrame().getByLabel("Operator For Condition 1:").selectOption("=");
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).click();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).fill(parking_Garage_Request_Report_Users);
        page.locator(iframeLocator).contentFrame().getByLabel("Run filter").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().getByText("All>Name = Parking Garage")).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().locator("#sys_user_group_breadcrumb")).containsText("All>Name = Parking Garage Request Report Users");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Preview record: Parking")).isVisible();
        page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Report Users']").hover();
        assertThat(page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Report Users']")).isVisible();
        page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Report Users']").click();
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='Open Record']").isVisible();
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified users are displayed in the system and validates their information.
     *
     * @param tsegaye_Ayele The name of the user Tsegaye Ayele to verify
     * @param melvin_Pirkle The name of the user Melvin Pirkle to verify
     * @param shane_Hebert The name of the user Shane Hebert to verify
     * @param delimo_Samuel The name of the user Delimo Samuel to verify
     */
    @Then("contains the following users:{string},{string},{string},{string}")
    public void contains_the_following_users(String tsegaye_Ayele, String melvin_Pirkle, String shane_Hebert, String delimo_Samuel) {
        page.locator(iframeLocator).contentFrame().getByLabel("Section Tab Lists").getByText("Roles (1)").scrollIntoViewIfNeeded();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Section Tab Lists").getByText("Roles (1)")).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Section Tab Lists")).containsText("Roles (1)");
        page.locator(iframeLocator).contentFrame().getByLabel("Section Tab Lists").getByText("Roles (1)").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='x_g_nci_osfm_park.osfm_parking_garage_ac...']").isVisible();
        assertThat(page.frameLocator(iframeLocator).locator("//a[normalize-space()='x_g_nci_osfm_park.osfm_parking_garage_ac...']")).containsText("x_g_nci_osfm_park.osfm_parking_garage_ac...");
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator(iframeLocator).locator("//span[normalize-space()='Group Members (4)']").isVisible();
        page.frameLocator(iframeLocator).locator("//span[normalize-space()='Group Members (4)']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Tsegaye Ayele", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Group Members.").locator("tbody")).containsText(tsegaye_Ayele);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Melvin Pirkle", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Melvin Pirkle", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(melvin_Pirkle);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Shane Hebert", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Shane Hebert", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(shane_Hebert);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Delimo Samuel", new FrameLocator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Open record: Delimo Samuel", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(delimo_Samuel);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Determines if the shane_Hebert user is the Group Manager.
     *
     * @param shane_Hebert The name of the user to check if they are the Group Manager
     */
    @Then("{string} is the Group Manager")
    public void is_the_group_manager(String shane_Hebert) {
        page.frameLocator(iframeLocator).locator("//span[@class='label-text'][normalize-space()='Manager']").scrollIntoViewIfNeeded();
        page.frameLocator(iframeLocator).locator("//span[@class='label-text'][normalize-space()='Manager']").isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().locator("[id='label\\.sys_user_group\\.manager']")).containsText("Manager");
        assertThat(page.locator(iframeLocator).contentFrame().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName(" Manager"))).hasValue(shane_Hebert);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the specified user is the Group Co-Manager in the system.
     *
     * @param delimo_Samuel The name of the user expected to be the Group Co-Manager
     */
    @Then("{string} is the Group Co-Manager")
    public void is_the_group_co_manager(String delimo_Samuel) {
        assertThat(page.locator(iframeLocator).contentFrame().getByText("Co-Manager")).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().locator("[id='label\\.sys_user_group\\.u_co_manager']")).containsText("Co-Manager");
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Co-Manager", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(delimo_Samuel);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Creates a Fulfillers group in the OSFM Parking Garage system with the specified name.
     * @param parking_Garage_Request_Fulfillers
     */
    @Then("a Fulfillers group called {string} is created")
    public void a_fulfillers_group_called_is_created(String parking_Garage_Request_Fulfillers) {
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).isVisible();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).click();
        page.locator(iframeLocator).contentFrame().locator("a").filter(new Locator.FilterOptions().setHasText("-- choose field --")).click();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Choose option")).fill("Name");
        page.locator(iframeLocator).contentFrame().getByLabel("select2-results").getByText("Name").click();
        page.locator(iframeLocator).contentFrame().getByLabel("Operator For Condition 1:").selectOption("=");
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).click();
        page.locator(iframeLocator).contentFrame().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).fill(parking_Garage_Request_Fulfillers);
        page.locator(iframeLocator).contentFrame().getByLabel("Run filter").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().getByText("All>Name = Parking Garage")).isVisible();
        assertThat(page.locator(iframeLocator).contentFrame().locator("#sys_user_group_breadcrumb")).containsText("All>Name = Parking Garage Request Fulfillers");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(iframeLocator).contentFrame().getByLabel("Preview record: Parking")).isVisible();
        page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Fulfillers']").hover();
        assertThat(page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Fulfillers']")).isVisible();
        page.frameLocator(iframeLocator).locator("//a[@aria-label='Preview record: Parking Garage Request Fulfillers']").click();
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='Open Record']").isVisible();
        page.frameLocator(iframeLocator).locator("//a[normalize-space()='Open Record']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}