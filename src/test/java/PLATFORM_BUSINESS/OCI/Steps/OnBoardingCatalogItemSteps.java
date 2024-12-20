package PLATFORM_BUSINESS.OCI.Steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import PLATFORM_BUSINESS.OCI.pages.OnBoarding_Catalog_Item_Page;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.TestProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OnBoardingCatalogItemSteps {

    public static Page onBoardingNVPage;
    public static Page completedRequestPage;
    public static String ticketNumber;

    /**
     * Logs into the native view using the side door test account and impersonates "Umit Topaloglu".
     * Parameterize the username as a string argument.
     *
     * @param umitTopaloglu The name of the user to impersonate
     */
    @Given("I am a CBIIT Supervisor {string}")
    public void i_am_a_cbiit_supervisor(String umitTopaloglu) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(umitTopaloglu);
    }

    /**
     * Method to simulate the submission of an Onboarding Request for a New Hire (contractor).
     * for the CBIIT Onboarding form, selects options, fills out text fields, and submits the form.
     * Logs screenshots and scenarios for reference.
     */
    @When("a Onboarding Request submitted for a New Hire \\(contractor)")
    public void a_onboarding_request_submitted_for_a_new_hire_contractor() {
        page.navigate(TestProperties.getNCISPUrl());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Business Services")).first().click();
        assertThat(page.getByLabel("Category", new Page.GetByLabelOptions().setExact(true))).containsText("CBIIT Business Services");
        page.locator("//h4[normalize-space()='CBIIT Onboarding']").isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//h4[normalize-space()='CBIIT Onboarding']")).containsText("CBIIT Onboarding");
        page.locator("//h6[normalize-space()='New Employee Onboarding request']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//h1[normalize-space()='CBIIT Onboarding']").isVisible();

        CucumberLogUtils.scenario.log("---- FILL OUT THE MANDATORY FIELDS FOR CBIIT ONBOARDING FORM ----");
        assertThat(page.locator("//span[normalize-space()='Employee First Name']")).containsText("Employee First Name");
        page.getByLabel("Employee First Name").click();
        page.getByLabel("Employee First Name").fill("FirstName");
        assertThat(page.getByLabel("New Hire Information").getByText("Employee Last Name")).isVisible();
        page.getByLabel("Employee Last Name").click();
        page.getByLabel("Employee Last Name").fill("LastName");
        assertThat(page.locator("#positionTitle").getByText("Position Title")).isVisible();
        page.getByText("Position TitlePhone Number", new Page.GetByTextOptions().setExact(true)).click();
        page.getByLabel("Position Title", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Position Title", new Page.GetByLabelOptions().setExact(true)).fill("Title");
        assertThat(page.locator("#phoneNumber").getByText("Phone Number")).isVisible();
        page.getByLabel("Phone Number", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Phone Number", new Page.GetByLabelOptions().setExact(true)).fill("111-222-3333");
        assertThat(page.locator("#email").getByText("Email")).isVisible();
        page.getByLabel("Email", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Email", new Page.GetByLabelOptions().setExact(true)).fill("test@email.com");
        page.locator("//span[@aria-label='Required - Contractor Officer Representative (COR)']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Contractor Officer")).isVisible();
        page.locator("//div[@id='s2id_sp_formfield_contractor_officer_representative_cor']//a[@class='select2-choice select2-default form-control']").press("Enter");
        page.locator("//input[@id='s2id_autogen15']").fill("Abigail Joyce");
        page.locator("//div[normalize-space()='Abigail Joyce']").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SELECTS THE SUPERVISOR AS UMIT TOPALOGLU ----");
        page.locator("//span[@aria-label='Required - Federal Point of Contact (POC)/Supervisor']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Federal Point of")).isVisible();
        assertThat(page.getByLabel("Required - Federal Point of")).containsText("Federal Point of Contact (POC)/Supervisor");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.locator("#s2id_autogen11_search").fill("Umit Topaloglu");
        page.getByText("Umit Topaloglu").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[normalize-space()='Contract Company']").isVisible();
        page.locator("//input[@id='sp_formfield_contractCo']").fill(OnBoarding_Catalog_Item_Page.onBoarding_Request_Contract_Company_Field);
        page.locator("//span[normalize-space()='Start Date']").isVisible();
        page.locator("//input[@id='sp_formfield_startDate']").fill("11/10/2024");
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the new employee be located On Site\\?$")))).isVisible();
        assertThat(page.locator("#onsite")).containsText("Will the new employee be located On Site?");
        page.locator("#s2id_sp_formfield_onsite a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the New Hire Require a UC Video Phone or a Virtual Phone\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_uc_video_voice a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Virtual Phone (Softphone)")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will this user require an Administrative Account \\(AA\\)\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_require_aa a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Equipment Needs"))).isVisible();
        assertThat(page.getByLabel("Equipment Needs").getByText("Would you like to order a").first()).isVisible();
        assertThat(page.locator("#request_type")).containsText("Would you like to order a standard NCI model or request a non-standard exception?");
        page.locator("#s2id_sp_formfield_request_type a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Standard").setExact(true)).click();
        assertThat(page.locator("#order").getByText("What will you be ordering?", new Locator.GetByTextOptions().setExact(true))).isVisible();
        page.getByText("Monitor Only").click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^What Monitor do you want\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_monitor_v2 a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Dell 22\" Monitor (single)")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the equipment need to be setup\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_equipment_setup a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will this equipment be shipped to the new hire\\?$")))).isVisible();
        assertThat(page.locator("#equipment_shipped")).containsText("Will this equipment be shipped to the new hire?");
        page.locator("#s2id_sp_formfield_equipment_shipped a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CBIIT ONBOARD FORM SUBMITS ----");
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").isVisible();
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("How can we help, UMIT?"))).isVisible();
        assertThat(page.locator("#homepage-search")).containsText("How can we help, Umit?");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Sets up the environment for a CBIIT Supervisor to handle an Onboarding Request submitted for a new hire (contractor).
     *
     * @param umitTopaloglu The name of the CBIIT Supervisor as a String
     */
    @Given("I am a CBIIT Supervisor {string} for Onboarding Request submitted for a New Hire \\(contractor)")
    public void i_am_a_cbiit_supervisor_for_onboarding_request_submitted_for_a_new_hire_contractor(String umitTopaloglu) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(TestProperties.getNCISPUrl());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Business Services")).first().click();
        assertThat(page.getByLabel("Category", new Page.GetByLabelOptions().setExact(true))).containsText("CBIIT Business Services");
        page.locator("//h4[normalize-space()='CBIIT Onboarding']").isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//h4[normalize-space()='CBIIT Onboarding']")).containsText("CBIIT Onboarding");
        page.locator("//h6[normalize-space()='New Employee Onboarding request']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//h1[normalize-space()='CBIIT Onboarding']").isVisible();

        CucumberLogUtils.scenario.log("---- FILL OUT THE MANDATORY FIELDS FOR CBIIT ONBOARDING FORM ----");
        assertThat(page.locator("//span[normalize-space()='Employee First Name']")).containsText("Employee First Name");
        page.getByLabel("Employee First Name").click();
        page.getByLabel("Employee First Name").fill("FirstName");
        assertThat(page.getByLabel("New Hire Information").getByText("Employee Last Name")).isVisible();
        page.getByLabel("Employee Last Name").click();
        page.getByLabel("Employee Last Name").fill("LastName");
        assertThat(page.locator("#positionTitle").getByText("Position Title")).isVisible();
        page.getByText("Position TitlePhone Number", new Page.GetByTextOptions().setExact(true)).click();
        page.getByLabel("Position Title", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Position Title", new Page.GetByLabelOptions().setExact(true)).fill("Title");
        assertThat(page.locator("#phoneNumber").getByText("Phone Number")).isVisible();
        page.getByLabel("Phone Number", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Phone Number", new Page.GetByLabelOptions().setExact(true)).fill("111-222-3333");
        assertThat(page.locator("#email").getByText("Email")).isVisible();
        page.getByLabel("Email", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Email", new Page.GetByLabelOptions().setExact(true)).fill("test@email.com");
        page.locator("//span[@aria-label='Required - Contractor Officer Representative (COR)']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Contractor Officer")).isVisible();
        page.locator("//div[@id='s2id_sp_formfield_contractor_officer_representative_cor']//a[@class='select2-choice select2-default form-control']").press("Enter");
        page.locator("//input[@id='s2id_autogen15']").fill("Abigail Joyce");
        page.locator("//div[normalize-space()='Abigail Joyce']").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SELECTS THE SUPERVISOR AS UMIT TOPALOGLU ----");
        page.locator("//span[@aria-label='Required - Federal Point of Contact (POC)/Supervisor']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Federal Point of")).isVisible();
        assertThat(page.getByLabel("Required - Federal Point of")).containsText("Federal Point of Contact (POC)/Supervisor");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.locator("#s2id_autogen11_search").fill(umitTopaloglu);
        page.getByText("Umit Topaloglu").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[normalize-space()='Contract Company']").isVisible();
        page.locator("//input[@id='sp_formfield_contractCo']").fill(OnBoarding_Catalog_Item_Page.onBoarding_Request_Contract_Company_Field);
        page.locator("//span[normalize-space()='Start Date']").isVisible();
        page.locator("//input[@id='sp_formfield_startDate']").fill("11/10/2024");
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the new employee be located On Site\\?$")))).isVisible();
        assertThat(page.locator("#onsite")).containsText("Will the new employee be located On Site?");
        page.locator("#s2id_sp_formfield_onsite a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yes")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the New Hire Require a UC Video Phone or a Virtual Phone\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_uc_video_voice a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Virtual Phone (Softphone)")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will this user require an Administrative Account \\(AA\\)\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_require_aa a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Equipment Needs"))).isVisible();
        assertThat(page.getByLabel("Equipment Needs").getByText("Would you like to order a").first()).isVisible();
        assertThat(page.locator("#request_type")).containsText("Would you like to order a standard NCI model or request a non-standard exception?");
        page.locator("#s2id_sp_formfield_request_type a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Standard").setExact(true)).click();
        assertThat(page.locator("#order").getByText("What will you be ordering?", new Locator.GetByTextOptions().setExact(true))).isVisible();
        page.getByText("Monitor Only").click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^What Monitor do you want\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_monitor_v2 a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Dell 22\" Monitor (single)")).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will the equipment need to be setup\\?$")))).isVisible();
        page.locator("#s2id_sp_formfield_equipment_setup a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        assertThat(page.locator("span").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Will this equipment be shipped to the new hire\\?$")))).isVisible();
        assertThat(page.locator("#equipment_shipped")).containsText("Will this equipment be shipped to the new hire?");
        page.locator("#s2id_sp_formfield_equipment_shipped a").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("No").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- CBIIT ONBOARD FORM SUBMITS ----");
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").isVisible();
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("How can we help, CBIIT?")).waitFor();
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("How can we help, CBIIT?"))).isVisible();
        assertThat(page.locator("#homepage-search")).containsText("How can we help, CBIIT?");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to access the submitted Onboarding Request from the portal.
     * It verifies the visibility of certain elements such as the "Tickets" link,
     * clicks on the relevant ticket item, and validates the content of the request.
     */
    @When("I access to the submitted Onboarding Request from my portal")
    public void i_access_to_the_submitted_onboarding_request_from_my_portal() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Tickets"))).isVisible();
        page.locator("//span[@class='h2 _m-0'][normalize-space()='Tickets']").click();
        page.locator("(//div[contains(@ng-show,\"ticket.type == 'request'\")])[1]").isVisible();
        page.locator("(//div[contains(@ng-show,\"ticket.type == 'request'\")])[1]").click();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("New Employee Onboarding request");
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("Federal Point of Contact (POC)/Supervisor");
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("Umit Topaloglu");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to verify that the user has access to view the submitted onboarding request for a new hire in the Native View.
     * It scrolls to the onboarding request item, clicks on it, captures necessary information,
     * and performs assertions to validate the visibility and content of the onboarding request.
     */
    @Then("I should have access to view the submitted onboarding request for that new hire in the Native View.")
    public void i_should_have_access_to_view_the_submitted_onboarding_request_for_that_new_hire_in_the_native_view() {
        page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").scrollIntoViewIfNeeded();
        page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").isVisible();
        onBoardingNVPage = page.waitForPopup(() -> {
            page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").click();
        });
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByText("Number")).isVisible();
        ticketNumber = onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//input[@id='sys_readonly.sc_req_item.number']").getAttribute("value");
        System.out.println("---- TICKET NUMBER FOR CURRENT RUN: " + ticketNumber + " ----");

        CucumberLogUtils.scenario.log("---- VERIFYING THAT I AS A SUPERVISOR IS ABLE TO ACCESS THE ONBOARDING REQUEST IN NATIVE VIEW  ----");
        assertThat(onBoardingNVPage.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Umit Topaloglu: available"))).isVisible();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Number", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(ticketNumber);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("[id='sc_req_item\\.form_header']")).containsText(ticketNumber);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Read only - cannot be modifiedOpened by"))).hasValue("Umit Topaloglu");
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
    }

    /**
     * Method to simulate the completion of a new hire's onboarding process and close the onboarding request
     * state as Closed Complete.
     */
    @When("a new hires onboarding process has been completed and the Onboarding Request state is closed complete")
    public void a_new_hires_onboarding_process_has_been_completed_and_the_onboarding_request_state_is_closed_complete() {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Tickets"))).isVisible();
        page.locator("//span[@class='h2 _m-0'][normalize-space()='Tickets']").click();
        page.locator("(//div[contains(@ng-show,\"ticket.type == 'request'\")])[1]").isVisible();
        page.locator("(//div[contains(@ng-show,\"ticket.type == 'request'\")])[1]").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").scrollIntoViewIfNeeded();
        page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").isVisible();
        onBoardingNVPage = page.waitForPopup(() -> {
            page.locator("//span[@ng-if=\"data.table == 'sc_req_item'\"]").click();
        });
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByText("Number")).isVisible();
        ticketNumber = onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//input[@id='sys_readonly.sc_req_item.number']").getAttribute("value");
        System.out.println("---- TICKET NUMBER FOR CURRENT RUN: " + ticketNumber + " ----");
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Number", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(ticketNumber);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("[id='sc_req_item\\.form_header']")).containsText(ticketNumber);

        CucumberLogUtils.scenario.log("---- VERIFYING THAT REQUEST STATE IS OPEN ----");
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByText("State")).isVisible();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.sc_req_item\\.state']")).containsText("State");
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByLabel("State")).hasValue("1");

        CucumberLogUtils.scenario.log("---- SCROLL DOWN TO TASKS TAB AND CLOSED INCOMPLETE THE FIRST TASK ----");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (1)']").scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (1)']").click();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.GRIDCELL, new FrameLocator.GetByRoleOptions().setName("Open").setExact(true))).isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//td[normalize-space()='Open']").dblclick();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//select[@id='cell_edit_value']").selectOption("Closed Incomplete");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//a[@id='cell_edit_ok']").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").waitFor();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").click();

        CucumberLogUtils.scenario.log("---- SCROLL DOWN TO TASKS TAB AND CLOSED INCOMPLETE THE SECOND TASK ----");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (2)']").scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (2)']").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//td[normalize-space()='Open']").isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//td[normalize-space()='Open']").dblclick();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//select[@id='cell_edit_value']").selectOption("Closed Incomplete");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//a[@id='cell_edit_ok']").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").waitFor();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").click();

        CucumberLogUtils.scenario.log("---- SCROLL DOWN TO TASKS TAB AND CLOSED INCOMPLETE THE THIRD TASK ----");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (3)']").scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Tasks (3)']").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//td[normalize-space()='Open']").isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//td[normalize-space()='Open']").dblclick();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//select[@id='cell_edit_value']").selectOption("Closed Incomplete");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//a[@id='cell_edit_ok']").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").waitFor();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").click();

        CucumberLogUtils.scenario.log("---- CLOSED COMPLETE THE REQUEST ONCE ALL THE TASK ARE CLOSED INCOMPLETE AND VERIFY THAT REQUEST IS CLOSED COMPLETE NOW ----");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//select[@id='sc_req_item.state']").isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//select[@id='sc_req_item.state']").selectOption("Closed Complete");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").waitFor();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_update_and_stay']").click();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByLabel("State")).isVisible();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByLabel("State")).hasValue("3");
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Requested Item form section").getByLabel("State")).containsText("Closed Complete");
        onBoardingNVPage.reload();
    }

    /**
     * Verifies that an email notification is sent to the user who is CC'd, making them aware that a new hire's onboarding process has been completed.
     * It waits for the email notification to appear, clicks on the Notes tab, and performs validations to ensure the email content is displayed correctly.
     */
    @Then("I should see an email notifications to be sent to me \\(I am CC'd) making aware that a new hires onboarding process has been completed")
    public void i_should_see_an_email_notifications_to_be_sent_to_me_i_am_cc_d_making_aware_that_a_new_hires_onboarding_process_has_been_completed() {

        CucumberLogUtils.scenario.log("---- WAIT FOR AN EMAIL TO DISPLAY ON NOTES SECTION ----");
        CommonUtils.sleep(50000);
        onBoardingNVPage.reload();

        CucumberLogUtils.scenario.log("---- CLICKS ON NOTES TAB ----");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Notes']").scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Notes']").click();
        onBoardingNVPage.reload();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Cc:']").scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='umit.topaloglu@nih.gov']").isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Onboarding Request - Request" + ticketNumber + "is Completed']").isVisible();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("NotesAdditional comments (").locator("td")).containsText("Onboarding Request - Request " + ticketNumber + " is Completed");
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
    }

    /**
     * Verifies that the notification includes the contract company that the user works for.
     */
    @Then("the notification includes the contract company that they work for.")
    public void the_notification_includes_the_contract_company_that_they_work_for() {
        assertThat(onBoardingNVPage.getByPlaceholder("Filter")).isVisible();
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        onBoardingNVPage.getByPlaceholder("Filter").click();
        onBoardingNVPage.getByPlaceholder("Filter").fill("System Log");
        onBoardingNVPage.getByPlaceholder("Filter").press("Enter");
        assertThat(onBoardingNVPage.getByPlaceholder("Filter")).hasValue("System Log");
        assertThat(onBoardingNVPage.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails"))).isVisible();
        onBoardingNVPage.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails")).click();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Emails"))).isVisible();
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Emails");
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName(" Show / hide filter")).click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("#s2id_autogen1 a").click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("select2-results").getByRole(AriaRole.OPTION, new Locator.GetByRoleOptions().setName("Subject")).click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Operator For Condition 1:").selectOption("=");
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Subject", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Subject", new FrameLocator.GetByLabelOptions().setExact(true)).fill(OnBoarding_Catalog_Item_Page.onBoarding_Request_Complete_Email_Subject(ticketNumber));
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Run filter").click();
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Preview record: Onboarding")).isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Preview record: Onboarding").click();
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true))).isVisible();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName("Open Record").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.sys_email\\.subject']")).containsText("Subject");
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByLabel("Subject")).hasValue(OnBoarding_Catalog_Item_Page.onBoarding_Request_Complete_Email_Subject(ticketNumber));
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email")).scrollIntoViewIfNeeded();
        onBoardingNVPage.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email")).click();
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title='Preview Email']").locator("body")).containsText("Onboarding Request " + ticketNumber + " is Completed.");
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title='Preview Email']").locator("body")).containsText("Contract Company: " + OnBoarding_Catalog_Item_Page.onBoarding_Request_Contract_Company_Field);

        CucumberLogUtils.scenario.log("---- VERIFIES THAT CONTRACT COMPANY FIELD IS INCLUDED IN EMAIL NOTIFICATION ----");
        Assert.assertEquals("Contract Company",OnBoarding_Catalog_Item_Page.onBoarding_Request_Contract_Company_Field);
        assertThat(onBoardingNVPage.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title='Preview Email']").locator("#snc_uri_ref_link")).containsText(ticketNumber);
        CucumberLogUtils.playwrightScreenshot(onBoardingNVPage);
        completedRequestPage = onBoardingNVPage.waitForPopup(() -> {
            onBoardingNVPage.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title='Preview Email']").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(ticketNumber)).click();
        });
        CucumberLogUtils.playwrightScreenshot(completedRequestPage);
        assertThat(completedRequestPage.frameLocator("iframe[name='gsft_main']").getByLabel("Number", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue(ticketNumber);
        assertThat(completedRequestPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_delete']")).isVisible();
        assertThat(completedRequestPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_delete']")).containsText("Delete");
        completedRequestPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_delete']").click();
        CucumberLogUtils.playwrightScreenshot(completedRequestPage);
        assertThat(completedRequestPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='ok_button']")).containsText("Delete");
        completedRequestPage.frameLocator("iframe[name='gsft_main']").locator("//button[@id='ok_button']").click();
        CucumberLogUtils.playwrightScreenshot(completedRequestPage);
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
        CucumberLogUtils.playwrightScreenshot(completedRequestPage);
    }
}