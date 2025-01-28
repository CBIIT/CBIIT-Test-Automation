package PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Outside_Medical_Services_AOMS_NV_Steps {

    /**
     * Given that the user is an electronic approval (EA) Fulfiller,
     * It logs into the native view using the side door test account and impersonates as an electronic approval (EA) Fulfiller
     *
     * @param aubreyWachter the name of the user to impersonate
     */
    @Given("I am an  electronic approval \\(EA) Fulfiller {string}")
    public void i_am_an_electronic_approval_ea_fulfiller(String aubreyWachter) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(aubreyWachter);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to navigate to the native view
     */
    @When("I navigate to the native view")
    public void i_navigate_to_the_native_view() {
        page.locator("//span[normalize-space()='Native View']").waitFor();
        assertThat(page.locator("//span[normalize-space()='Native View']")).containsText("Native View");
        page.locator("//span[normalize-space()='Native View']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the user has access to a specific module and performs relevant actions
     *
     * @param ccrElectronicApprovals the name of the module to check access for
     */
    @Then("I should see that I have access to the {string} module")
    public void i_should_see_that_i_have_access_to_the_module(String ccrElectronicApprovals) {
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill(ccrElectronicApprovals);
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByLabel("CCR Electronic Approvals", new Page.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.getByLabel("CCR Electronic Approvals", new Page.GetByLabelOptions().setExact(true))).containsText(ccrElectronicApprovals);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify that the module contains specified elements.
     *
     * @param tickets the text to verify for "Tickets"
     * @param createNew the name to verify for "createNew" link
     * @param assignedToMe the name to verify for "assignedToMe" link
     * @param unassigned the name to verify for "unassigned" link
     * @param patientTravelExceptions the name to verify for "patientTravelExceptions" link
     * @param zero4C0165Requests the name to verify for "-C-0165 Requests" link
     * @param aOMS the name to verify for "AOMS" link
     * @param all the name to verify for "all" link
     */
    @Then("verify that module contains {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void verify_that_module_contains_and(String tickets, String createNew, String assignedToMe, String unassigned, String patientTravelExceptions, String zero4C0165Requests, String aOMS, String all) {
        assertThat(page.getByLabel("Tickets", new Page.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.getByLabel("Tickets", new Page.GetByLabelOptions().setExact(true))).containsText(tickets);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(createNew))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(createNew);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(assignedToMe))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(assignedToMe);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(unassigned))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(unassigned);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(patientTravelExceptions))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(patientTravelExceptions);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("-C-0165 Requests"))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(zero4C0165Requests);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("AOMS (Authorization of"))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(aOMS);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(all))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(all);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on a "Create New" element and selects an AOMS for Form Type
     *
     * @param createNew the name of the element to click on
     * @param aOMS the value to select for Form Type
     */
    @Then("when I click on {string} and select {string} for Form Type")
    public void when_i_click_on_and_select_for_form_type(String createNew, String aOMS) {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(createNew))).isVisible();
        assertThat(page.getByLabel("All menu", new Page.GetByLabelOptions().setExact(true))).containsText(createNew);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(createNew)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Form Type']").isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Form Type']")).containsText("Form Type");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Form Type", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption("amos");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Form Type", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("amos");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Form Type", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(aOMS);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the following mandatory fields appear in the Request Details Section
     *
     * @param docString String containing the details to verify
     */
    @Then("I should see that the following mandatory fields appear in the Request Details Section:")
    public void i_should_see_that_the_following_mandatory_fields_appear_in_the_request_details_section(String docString) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists").getByText("Request Details")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Section Tab Lists")).containsText("Request Details");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Patient Name")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("MRN")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.mrn\"]")).containsText("MRN");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.protocol_amos\"]")).containsText("AMOS Protocol ID");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.date_of_service\"]")).containsText("Date(s) of Service");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.team_point_of_contact\"]")).containsText("Team Point of Contact (POC)");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.quote_from_vendor\"]")).containsText("Quote/Estimate from Vendor");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.vendor_name\"]")).containsText("Vendor/Facility Name");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.vendor_poc_contact_information\"]")).containsText("Vendor/Facility Address");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.point_of_contact_from_vendor\"]")).containsText("Vendor POC Name");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.contact_information\"]")).containsText("Vendor POC Email/Phone");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.list_of_necessary_service_s\"]")).containsText("List of Requested Service(s)");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.required_test_procedure\"]")).containsText("Is this a protocol-required test/procedure?");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id=\"label\\.x_g_nci_ccr_electr_approval_tickets\\.justification_amos\"]")).containsText("Detailed Justification for Why Service(s) is/are Required");
        CucumberLogUtils.playwrightScreenshot(page);
    }
}