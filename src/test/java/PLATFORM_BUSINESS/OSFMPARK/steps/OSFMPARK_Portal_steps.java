package PLATFORM_BUSINESS.OSFMPARK.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.Locator;
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

public class OSFMPARK_Portal_steps {

    /**
     * Executes the process of accessing the Parking Garage Access Request Catalog Item.
     * This method performs the necessary actions such as logging in with the side door test account,
     *
     */
    @Given("the Parking Garage Access Request Catalog Item")
    public void the_parking_garage_access_request_catalog_item() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Includes verifying visibility of elements, clicking buttons, scrolling, and checking text contents.
     *
     */
    @When("users are attempting to access it to create a request")
    public void users_are_attempting_to_access_it_to_create_a_request() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        assertThat(page.locator("#fresponsive")).containsText("Services");
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Enterprise IT Services")).first().click();
        page.locator("//span[contains(text(),'Facilities')]").scrollIntoViewIfNeeded();
        assertThat(page.locator("//span[contains(text(),'Facilities')]")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[contains(text(),'Facilities')]").click();
        assertThat(page.getByLabel("Page breadcrumbs").getByRole(AriaRole.LIST)).containsText("Home Enterprise IT Services Facilities");
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("SG Parking Registration (Non-"))).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("SG Parking Registration (Non-NCI Staff Only)");
        page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("SG Parking Registration (Non-")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified item is available on the NCI ServiceNow Portal via the provided breadcrumb path.
     *
     * @param name_SG_Parking_Register_Non_NCI_Staff_Only The name of the item to verify.
     */
    @Then("it is available on the NCI ServiceNow Portal via the following breadcrumb path: Services >> Enterprise IT Services >> Facilities >> {string}")
    public void it_is_available_on_the_nci_service_now_portal_via_the_following_breadcrumb_path_services_enterprise_it_services_facilities(String name_SG_Parking_Register_Non_NCI_Staff_Only) {
        page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName("SG Parking Registration (Non-"))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(name_SG_Parking_Register_Non_NCI_Staff_Only);
        page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName("SG Parking Registration (Non-"))).isVisible();
        assertThat(page.getByLabel("Page breadcrumbs").getByRole(AriaRole.LIST)).containsText("Home Enterprise IT Services Facilities SG Parking Registration (Non-NCI Staff Only)");
        assertThat(page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']")).containsText(name_SG_Parking_Register_Non_NCI_Staff_Only);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the first given name does not exist on the NCI ServiceNow Portal
     * via the breadcrumb path: Services >> Enterprise IT Services >> Facilities.
     *
     * @param parking_Garage_Access_Request The name to verify non-existence for.
     */
    @Then("verify that {string} name does not exist on the NCI ServiceNow Portal via the following breadcrumb path: Services >> Enterprise IT Services >> Facilities")
    public void verify_that_name_does_not_exist_on_the_nci_service_now_portal_via_the_following_breadcrumb_path_services_enterprise_it_services_facilities(String parking_Garage_Access_Request) {
        page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#catItemTop")).containsText("SG Parking Registration (Non-NCI Staff Only)");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- VERIFYING THAT THE OLD NAME 'PARKING GARAGE ACCESS REQUEST' DOES NOT EXIST. ----");
        int oldNameParkingGarageAccessNOYExists = page.locator("text=Parking Garage Access Request").count();
        Assert.assertEquals(oldNameParkingGarageAccessNOYExists, 0, "-- OLD NAME 'PARKING GARAGE ACCESS REQUEST' SHOULD NOT EXIST --");

        CucumberLogUtils.scenario.log("---- VERIFYING THAT THE NEW NAME 'SG PARKING PERMIT (NON-NCI STAFF ONLY)' EXISTS.----");
        int newNameExists = page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").count();
        Assert.assertEquals(newNameExists, 1, "-- NEW NAME 'SG PARKING PERMIT (NON-NCI STAFF ONLY)' SHOULD EXIST --");

        CucumberLogUtils.scenario.log("---- VERIFYING BY THE ASSERTION FALSE THAT THE OLD NAME 'PARKING GARAGE ACCESS REQUEST' IS RENAMED TO 'SG PARKING PERMIT (NON-NCI STAFF ONLY)' AND DOES NOT CONTAIN THE OLD NAME.----");
        String renamedFormText = page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").innerText();
        Assert.assertFalse(renamedFormText.contains(parking_Garage_Access_Request), "-- TEXT 'PARKING GARAGE ACCESS REQUEST' SHOULD NOT BE PRESENT. --");
        System.out.println("Renamed text: " + renamedFormText);  //PRINT THE RENAMED APP TEXT TO THE CONSOLE
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified item has been renamed to the provided name "SG Parking Permit (Non-NCI Staff Only)"
     * Performs a series of actions such as checking text, clicking elements, and taking screenshots for verification
     *
     * @param name_SG_Parking_Permit_Non_NCI_Staff_Only The new name of the item to verify.
     */
    @Then("it has renamed to {string}")
    public void it_has_renamed_to(String name_SG_Parking_Permit_Non_NCI_Staff_Only) {
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(name_SG_Parking_Permit_Non_NCI_Staff_Only);
        page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName("SG Parking Registration (Non-"))).isVisible();
        assertThat(page.getByLabel("Page breadcrumbs").getByRole(AriaRole.LIST)).containsText("Home Enterprise IT Services Facilities SG Parking Registration (Non-NCI Staff Only)");
        assertThat(page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']")).containsText(name_SG_Parking_Permit_Non_NCI_Staff_Only);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * A Non-NCI user access to the SG Parking Registration (Non-NCI Only) catalog item.
     *
     * @param aliyaTaranath The name of the Non-NCI user to impersonate while accessing the catalog item.
     */
    @Given("a Non-NCI user {string} access the SG Parking Registration \\(Non-NCI Only) catalog item")
    public void a_non_nci_user_access_the_sg_parking_registration_non_nci_only_catalog_item(String aliyaTaranath) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(aliyaTaranath);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates the user to the portal of the SG Parking Registration (Non-NCI Only) catalog item.
     *
     */
    @When("the user is on the portal of the SG Parking Registration \\(Non-NCI Only) catalog item")
    public void the_user_is_on_the_portal_of_the_sg_parking_registration_non_nci_only_catalog_item() {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true))).isVisible();
        assertThat(page.locator("#fresponsive")).containsText("Services");
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Enterprise IT Services")).first().click();
        page.locator("//span[contains(text(),'Facilities')]").scrollIntoViewIfNeeded();
        assertThat(page.locator("//span[contains(text(),'Facilities')]")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator("//span[contains(text(),'Facilities')]").click();
        assertThat(page.getByLabel("Page breadcrumbs").getByRole(AriaRole.LIST)).containsText("Home Enterprise IT Services Facilities");
        assertThat(page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("SG Parking Registration (Non-"))).isVisible();
        assertThat(page.getByRole(AriaRole.MAIN)).containsText("SG Parking Registration (Non-NCI Staff Only)");
        page.getByRole(AriaRole.MAIN).locator("a").filter(new Locator.FilterOptions().setHasText("SG Parking Registration (Non-")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified verbiage appears just below the catalog name header on the page.
     * This method checks the presence of the expected text
     * and performs assertions to confirm its visibility and accuracy.
     *
     * @param expectedText The expected verbiage string that should appear below the catalog name header.
     */
    @Then("the user verifies that the verbiage {string} should appear just below the catalog name Header")
    public void the_user_verifies_that_the_verbiage_should_appear_just_below_the_catalog_name_header(String expectedText) {
        page.locator("//h1[normalize-space()='SG Parking Registration (Non-NCI Staff Only)']").scrollIntoViewIfNeeded();
        assertThat(page.locator("#catItemTop")).containsText("SG Parking Registration (Non-NCI Staff Only)");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.MAIN)).containsText(expectedText);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- VERIFYING THAT THE VERBIAGE DISPLAYS ON TOP OF THE 'SG PARKING PERMIT (NON-NCI STAFF ONLY)' CATALOG ITEM ----");
        String actualText = page.locator("//div[@class='sc-item-description ng-binding']").textContent();
        Assert.assertEquals(actualText, expectedText, "-- THE VERBIAGE DISPLAYS ON TOP OF THE 'SG PARKING PERMIT (NON-NCI STAFF ONLY)' CATALOG ITEM  --");
    }
}