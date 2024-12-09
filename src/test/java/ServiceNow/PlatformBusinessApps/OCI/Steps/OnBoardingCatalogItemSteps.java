package ServiceNow.PlatformBusinessApps.OCI.Steps;

import ServiceNow.PlatformBusinessApps.OFFBOARD.Constants.CBIIT_OFFBOARD_FORM_Constants;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.TestProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.regex.Pattern;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OnBoardingCatalogItemSteps {

    /**
     * CBIIT User logs into Test and submits an Onboarding Request submitted for a new hire contractor.
     * and selects "Umit Topaloglu" as a supervisor and the impersonated as a "Umit Topaloglu"
     *
     * @param umitTopaloglu The name of the Supervisor
     */
    @Given("I am a CBIIT Supervisor {string} for Onboarding Request submitted for a New Hire \\(contractor)")
    public void i_am_a_cbiit_supervisor_for_onboarding_request_submitted_for_a_new_hire_contractor(String umitTopaloglu) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(TestProperties.getNCISPUrl());
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CBIIT Business Services")).first().click();
        assertThat(page.getByLabel(CBIIT_OFFBOARD_FORM_Constants.CATEGORY_TEXT, new Page.GetByLabelOptions().setExact(true))).containsText("CBIIT Business Services");
        page.locator("//h4[normalize-space()='CBIIT Onboarding']").isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//h4[normalize-space()='CBIIT Onboarding']")).containsText("CBIIT Onboarding");
        page.locator("//h4[normalize-space()='CBIIT Onboarding']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//h1[normalize-space()='CBIIT Onboarding']").isVisible();

        CucumberLogUtils.scenario.log("---- FILL OUT THE MANDATORY FIELDS FOR CBIIT ONBOARDING FORM ----");
        assertThat(page.locator("#firstName")).containsText("Employee First Name");
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

        CucumberLogUtils.scenario.log("---- SELECTS THE SUPERVISOR AS UMIT TOPALOGLU ----");
        page.locator("//span[@aria-label='Required - Federal Point of Contact (POC)/Supervisor']").scrollIntoViewIfNeeded();
        assertThat(page.getByLabel("Required - Federal Point of")).isVisible();
        assertThat(page.getByLabel("Required - Federal Point of")).containsText("Federal Point of Contact (POC)/Supervisor");
        page.locator("#s2id_sp_formfield_fedSupervisor").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Lookup using list")).click();
        page.locator("#s2id_autogen11_search").fill(umitTopaloglu);
        page.getByText("Umit Topaloglu").click();
        page.locator("//span[normalize-space()='Contract Company']").isVisible();
        page.locator("//input[@id='sp_formfield_contractCo']").fill("Contract Company");
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

        CucumberLogUtils.scenario.log("---- CBIIT ONBOARD FORM SUBMITS ----");
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").isVisible();
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        CommonUtils.sleep(5000);
        assertThat(page.locator("#uiNotificationContainer")).containsText("Unique Key violation detected by database ((conn=531235) Duplicate entry 'ac379fe987161ed0ad46326d3fbb35f3' for key 'PRIMARY')");
        assertThat(page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("How can we help, CBIIT?"))).isVisible();
        assertThat(page.locator("#homepage-search")).containsText("How can we help, CBIIT?");
    }

    @When("I access to the submitted Onboarding Request from my portal")
    public void i_access_to_the_submitted_onboarding_request_from_my_portal() {
    }

    @Then("I should have access to view the submitted onboarding request for that new hire in the Native View.")
    public void i_should_have_access_to_view_the_submitted_onboarding_request_for_that_new_hire_in_the_native_view() {
    }
}
