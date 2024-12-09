package PLATFORM_BUSINESS.CCR_ELECTRONIC_APPROVAL.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class Outside_Medical_AOMS_Form_Steps {

    /**
     * This method logs into the system, impersonate an authenticated EA Ful filler
     */
    @Given("I am an authenticated Electronic Approval user or a EA Fulfiller")
    public void i_am_an_authenticated_electronic_approval_user_or_a_ea_fulfiller() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Aubrey Wachter");
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method for navigating to the Outside Medical Services (AOMS) Portal Form.
     */
    @When("I navigate to the AOMS Portal Form")
    public void i_navigate_to_the_aoms_portal_form() {
        assertThat(page.locator("#fresponsive")).containsText("Services");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CCR Services")).first().click();
        assertThat(page.getByText("Outside Medical Services (AOMS) Authorization for Payment of Outside Medical")).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("Outside Medical Services (AOMS)");
        page.getByText("Outside Medical Services (AOMS) Authorization for Payment of Outside Medical").click();
        assertThat(page.locator("#catItemTop")).containsText("Outside Medical Services (AOMS)");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that a Requested For field is updated to the expected value 'Principal Investigator (PI)'.
     *
     * @param requestedFor The value of the field before the update.
     * @param expectedValue The expected updated value of the field.
     */
    @Then("I should see that {string} is updated to {string}")
    public void i_should_see_that_is_updated_to(String requestedFor, String expectedValue) {
        CucumberLogUtils.scenario.log("---- TEXT LABEL FOR FIELD 'Principal Investigator (PI)' ----");
        String actualValue = page.locator("//span[contains(@aria-label,'Principal Investigator (PI)')]").textContent();
        Assert.assertNotEquals(actualValue, requestedFor,
                "---- VERIFY THAT 'Requested For' FIELD IS UPDATED TO ACTUAL VALUE 'Principal Investigator (PI)' VALUE ----");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//span[contains(@aria-label,'Principal Investigator (PI)')]")).containsText(expectedValue);
        Assert.assertEquals(actualValue, expectedValue,
                "-- VERIFY THAT ACTUAL VALUE IS SAME AS EXPECTED VALUE 'Principal Investigator (PI)'--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the Catalog name and Form Title for a specific entity is updated to the expected value.
     *
     * @param aOMS The current value of the Catalog name and Form Title before the update.
     * @param expectedValue The expected updated value of the Catalog name and Form Title.
     */
    @Then("the Catalog name and Form Title for {string} is updated to {string}")
    public void the_catalog_name_and_form_title_for_is_updated_to(String aOMS, String expectedValue) {
        CucumberLogUtils.scenario.log("---- TEXT LABEL FOR FIELD 'Outside Medical Services (AOMS)' ----");
        String actualValue = page.locator("//h1[normalize-space()='Outside Medical Services (AOMS)']").textContent();
        System.out.println(actualValue);
        Assert.assertNotEquals(actualValue, aOMS,
                "---- VERIFY THAT 'Authorization for Payment of Outside Medical Services (AOMS)' FIELD IS UPDATED TO ACTUAL VALUE 'Outside Medical Services (AOMS)' VALUE ----");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//h1[normalize-space()='Outside Medical Services (AOMS)']")).containsText(expectedValue);
        Assert.assertEquals(actualValue, expectedValue,
                "-- VERIFY THAT ACTUAL VALUE IS SAME AS EXPECTED VALUE 'Outside Medical Services (AOMS)'--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method sets up the environment for an authenticated CBIIT user by logging in using the side door test account.
     */
    @Given("I am an authenticated CBIIT User")
    public void i_am_an_authenticated_cbiit_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates to the outside medical service application.
     *
     * @param services The name of the service section to navigate to.
     * @param ccrServices The name of the ccr service section to navigate to.
     * @param outsideMedicalServices The name of the outside medical service section to navigate to.
     */
    @When("I navigate to the {string} > {string} > {string}")
    public void i_navigate_to_the(String services, String ccrServices, String outsideMedicalServices) {
        assertThat(page.locator("#fresponsive")).containsText(services);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(services).setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(ccrServices)).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByText("Outside Medical Services (AOMS) Authorization for Payment of Outside Medical").scrollIntoViewIfNeeded();
        assertThat(page.getByText("Outside Medical Services (AOMS) Authorization for Payment of Outside Medical")).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(outsideMedicalServices);
        page.getByText("Outside Medical Services (AOMS) Authorization for Payment of Outside Medical").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the application title has been changed to the 'Outside Medical Services (AOMS)' value.
     *
     * @param aOMS The previous value of the application before the change.
     * @param outsideMedicalServices The expected updated value of the application.
     */
    @Then("I should see that {string} Appication has been changes to: {string}")
    public void i_should_see_that_appication_has_been_changes_to(String aOMS, String outsideMedicalServices) {
        assertThat(page.locator("#catItemTop")).containsText(outsideMedicalServices);
        CucumberLogUtils.scenario.log("---- TEXT LABEL FOR FIELD 'Outside Medical Services (AOMS)' ----");
        String actualValue = page.locator("//h1[normalize-space()='Outside Medical Services (AOMS)']").textContent();
        System.out.println(actualValue);
        Assert.assertNotEquals(actualValue, aOMS,
                "---- VERIFY THAT 'Authorization for Payment of Outside Medical Services (AOMS)' FIELD IS UPDATED TO ACTUAL VALUE 'Outside Medical Services (AOMS)' VALUE ----");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//h1[normalize-space()='Outside Medical Services (AOMS)']")).containsText(outsideMedicalServices);
        Assert.assertEquals(actualValue, outsideMedicalServices,
                "-- VERIFY THAT ACTUAL VALUE IS SAME AS EXPECTED VALUE 'Outside Medical Services (AOMS)'--");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the form title reflects the expected text 'Outside Medical Services (AOMS)'
     *
     * @param outsideMedicalServices The expected text that the form title should reflect.
     */
    @Then("the Form Title should reflect: {string}")
    public void the_form_title_should_reflect(String outsideMedicalServices) {
        assertThat(page.locator("//h1[normalize-space()='Outside Medical Services (AOMS)']")).containsText(outsideMedicalServices);
    }
}