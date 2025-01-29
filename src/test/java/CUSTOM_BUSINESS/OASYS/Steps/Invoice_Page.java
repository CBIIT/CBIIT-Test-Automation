package CUSTOM_BUSINESS.OASYS.Steps;

import static CUSTOM_BUSINESS.OASYS.Utils.OASYS_CommonUtils.clickIfVisible;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import CUSTOM_BUSINESS.OASYS.Utils.OASYS_Constants;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.regex.Pattern;

public class Invoice_Page {

    /**
     * This method is used to navigate to the Invoice page
     */
    @When("User clicks on Invoice")
    public void user_clicks_on_invoice() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Invoice")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Submit Invoice button
     */
    @And("User clicks on Submit button and the Submit Invoice pop up is displayed")
    public void user_clicks_on_submit_button_and_the_submit_invoice_pop_up_is_displayed() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the PIID-RefPIID of the contract
     *
     * @param PIID_REFPIID
     */
    @And("User enters the PIID-RefPIID {string} of the contract")
    public void user_enters_the_piid_ref_piid_of_the_contract(String PIID_REFPIID) {
        page.getByPlaceholder("Filter PIID or RefPIID").click();
        page.getByPlaceholder("Filter PIID or RefPIID").fill(PIID_REFPIID);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the contract
     */
    @And("User clicks on the contract")
    public void user_clicks_on_the_contract() {
        page.locator("xpath=//span[normalize-space()='HHSN316201500067W']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Invoice number
     */
    @And("User enters the Invoice number")
    public void user_enters_the_invoice_number() {
        page.getByLabel("Invoice # *").click();
        page.getByLabel("Invoice # *").fill(OASYS_Constants.INVOICE_NUMBER);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Invoice date
     */
    @And("User enters the Invoice date")
    public void user_enters_the_invoice_date() {
        page.getByLabel("Invoice Date *").click();
        page.locator(".cdk-overlay-container > div:nth-child(5)").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Invoice Date *")).fill(OASYS_Constants.INVOICE_DATE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the invoice Start date
     */
    @And("User selects the Start Date")
    public void user_selects_the_start_date() {
        page.getByLabel("Start Date *").click();
        page.locator(".cdk-overlay-container > div:nth-child(5)").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Start Date *")).fill(OASYS_Constants.INVOICE_START_DATE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the invoice End date
     */
    @And("User selects the End Date")
    public void user_selects_the_end_date() {
        page.getByLabel("End Date *").click();
        page.locator(".cdk-overlay-container > div:nth-child(5)").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("End Date *")).fill(OASYS_Constants.INVOICE_END_DATE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Invoice amount
     *
     * @param Amount
     */
    @And("User enters {string} as Invoice amount")
    public void user_enters_as_invoice_amount(String Amount) {
        page.getByLabel("Amount *").click();
        page.getByLabel("Amount *").type(Amount);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Point of Contact Name
     *
     * @param POCName
     */
    @And("User enters {string} as the Point of Contact Name")
    public void user_enters_as_the_point_of_contact_name(String POCName) {
        page.getByLabel("Point of Contact Name").click();
        page.getByLabel("Point of Contact Name").fill(POCName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Point of Contact Email
     *
     * @param POCEmail
     */
    @And("User enters {string} as the Point of Contact Email")
    public void user_enters_as_the_point_of_contact_email(String POCEmail) {
        page.getByLabel("Point of Contact Name").press("Tab");
        page.getByLabel("Point of Contact Email").fill(POCEmail);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Type of the invoice
     *
     * @param Type
     */
    @And("User selects {string} from the Type dropdown")
    public void user_selects_from_the_type_dropdown(String Type) {
        page.getByText("TypeType").click();
        page.getByText(Type).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Status of the invoice
     *
     * @param Status
     */
    @And("User selects {string} from the Status dropdown")
    public void user_selects_from_the_status_dropdown(String Status) {
        page.getByLabel("Status", new Page.GetByLabelOptions().setExact(true)).getByText("Status").click();
        page.getByText(Status).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Submit Invoice button
     */
    @And("User clicks on SUBMIT INVOICE button")
    public void user_clicks_on_submit_invoice_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit Invoice")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the invoice is in submitted status
     */
    @Then("User verifies the invoice is in submitted status")
    public void user_verifies_the_invoice_is_in_submitted_status() {
        page.waitForSelector("dynamic-detail-header");
        assertThat(page.locator("dynamic-detail-header")).containsText(OASYS_Constants.INVOICE_NUMBER);
        assertThat(page.locator("dynamic-detail-header")).containsText(OASYS_Constants.INVOICE_STATUS);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on a submitted Invoice
     */
    @And("User clicks on a submitted Invoice")
    public void user_clicks_on_a_submitted_invoice() {
        page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("INV-TEST001")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to expand the members
     */
    @And("User expands the members")
    public void user_expands_the_members() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Members")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the EDIT button and delete the existing Additional Final Approver and Additional Reviewer if it exists
     */
    @And("User clicks on EDIT button")
    public void user_clicks_on_edit_button() {
        Locator membersSection = page.getByLabel("Members");
        membersSection.getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Edit")).click();
        Locator deleteButtonForAdditionalFinalApprover = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^User Name \\*deleteUser Name \\*deleteaddAdd Additional Final Approvers$"))).getByRole(AriaRole.BUTTON).nth(1);
        clickIfVisible(deleteButtonForAdditionalFinalApprover);
        Locator deleteButtonForTestCS2 = page.locator("xpath=(//mat-icon[@role='img'][normalize-space()='delete'])[8]");
        clickIfVisible(deleteButtonForTestCS2);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the ADD ADDITIONAL FINAL APPROVERS button
     */
    @And("User clicks on ADD ADDITIONAL FINAL APPROVERS button")
    public void user_clicks_on_add_additional_final_approvers_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Additional Final Approvers")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Final Approver for the invoice
     *
     * @param AdditionalFinalApprover
     */
    @And("User selects {string} as Final Approver for the invoice")
    public void user_selects_test_co_as_final_approver_for_the_invoice(String AdditionalFinalApprover) {
        page.locator("xpath=(//div/input[@ng-reflect-placeholder='Type to Search...'])[2]").click();
        page.locator("xpath=(//div/input[@ng-reflect-placeholder='Type to Search...'])[2]").fill(AdditionalFinalApprover);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Test Manager")).locator("span").first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the ADD ADDITIONAL REVIEWERS button
     */
    @And("User clicks on ADD ADDITIONAL REVIEWERS button")
    public void user_clicks_on_add_additional_reviewers_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Additional Reviewers")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Additional Reviewer for the invoice
     *
     * @param AdditionalReviewer
     */
    @And("User selects {string} as Additional Reviewer for the invoice")
    public void user_selects_test_cor_as_additional_reviewer_for_the_invoice(String AdditionalReviewer) {
        page.waitForSelector("xpath=(//div/input[@ng-reflect-placeholder='Type to Search...'])[9]");
        page.locator("xpath=(//div/input[@ng-reflect-placeholder='Type to Search...'])[9]").click();
        page.locator("xpath=(//div/input[@ng-reflect-placeholder='Type to Search...'])[9]").fill(AdditionalReviewer);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Test CS2")).locator("span").first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Save button
     */
    @Then("User clicks on Save button")
    public void user_clicks_on_save_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}