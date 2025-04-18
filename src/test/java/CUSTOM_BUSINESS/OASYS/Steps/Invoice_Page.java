package CUSTOM_BUSINESS.OASYS.Steps;

import static CUSTOM_BUSINESS.OASYS.Utils.OASYS_CommonUtils.clickIfVisible;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import CUSTOM_BUSINESS.OASYS.Utils.OASYS_CommonUtils;
import CUSTOM_BUSINESS.OASYS.Utils.OASYS_Constants;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.regex.Pattern;

public class Invoice_Page {

    /**
     * This method is used to navigate to the Invoice page
     */
    @When("User clicks on Invoice Page")
    public void user_clicks_on_invoice_page() {
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
        OASYS_CommonUtils.waitForElementToBeVisible("text=Invoice Submitted");
        assertThat(page.getByText("Invoice Submitted")).isVisible();
        page.waitForSelector("dynamic-detail-header");
        assertThat(page.locator("dynamic-detail-header")).containsText(OASYS_Constants.INVOICE_NUMBER);
        assertThat(page.locator("dynamic-detail-header")).containsText(OASYS_Constants.INVOICE_STATUS);
    }

    /**
     * This method is used to click on a submitted Invoice
     */
    @And("User clicks on a submitted Invoice")
    public void user_clicks_on_a_submitted_invoice() {
        page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("INV-TEST001")).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to expand the members
     */
    @And("User expands the members")
    public void user_expands_the_members() {
        Playwright_Common_Utils.scrollIntoView("xpath=//span/mat-panel-title[contains(text(),'Members')]");
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
    }

    /**
     * This method is used to click on an invoice in Submitted status
     */
    @And("User clicks on an invoice in Submitted status")
    public void user_clicks_on_an_invoice_in_submitted_status() {
        page.getByText("PLEASE DO NOT DELETE").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the VOID INVOICE button
     */
    @And("User clicks on VOID INVOICE button")
    public void user_clicks_on_void_invoice_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Void Invoice").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the reason for voiding the invoice
     */
    @And("User selects Duplicate Invoice as the reason from the drop down")
    public void user_selects_duplicate_invoice_as_the_reason_from_the_drop_down() {
        page.getByLabel("Select Void Reason").locator("span").click();
        page.locator("xpath=//span[normalize-space()='Duplicate invoice']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Void button
     */
    @Then("User clicks on Void button")
    public void user_clicks_on_void_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Void")).click();
    }

    /**
     * This method is used to click on the invoice in voided status
     */
    @And("User clicks on the reviewed Invoice")
    public void user_clicks_on_the_reviewed_invoice() {
        page.getByText("PLEASE DO NOT DELETE").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the invoice status
     */
    @And("User verifies the invoice status")
    public void user_verifies_the_invoice_status() {
        String actualStatus = page.locator("dynamic-detail-header").innerText();
        if (!actualStatus.contains("VOIDED")) {
            System.out.println("*** ACTUAL STATUS: " + actualStatus + " ***");
        }
        assertThat(page.locator("dynamic-detail-header")).containsText("VOIDED");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the VOID INVOICE button when the invoice is in voided status
     */
    @Then("User tries to click on Void button")
    public void user_tries_to_click_on_void_button() {
        boolean isVoidInvoiceButtonVisible = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Void Invoice").setExact(true)).isVisible();
        if (isVoidInvoiceButtonVisible) {
            System.out.println("*** THE INVOICE IS NOT IN VOIDED STATUS ***");
        }
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Void Invoice").setExact(true))).isHidden();
    }

    /**
     * This method is used to click the voided invoice
     */
    @And("User clicks on the voided invoice")
    public void user_clicks_on_the_voided_invoice() {
        page.getByText("PLEASE DO NOT DELETE").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the RESTORE INVOICE button
     */
    @And("User clicks on RESTORE INVOICE button")
    public void user_clicks_on_restore_invoice_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Restore Invoice").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to acknowledge the message by clicking on the Continue button
     */
    @And("User clicks on Continue button to acknowledge the message")
    public void user_clicks_on_continue_button_to_acknowledge_the_message() {
        assertThat(page.locator("restore-invoice-dialog")).containsText("Are you sure you want to restore this invoice?");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the invoice status is changed to Submitted
     *
     * @param Status
     */
    @Then("User verifies the invoice status is changed to {string}")
    public void user_verifies_the_invoice_status_is_changed_to_submitted(String Status) {
        assertThat(page.locator("dynamic-detail-header")).containsText(Status);
    }

    /**
     * This method is signing in the application as TEST CO
     */
    @When("User logs in as Test CO on the side login page")
    public void user_logs_in_as_test_co_on_the_side_login_page() {
        page.navigate(OASYS_Constants.OASYS_SIDE_LOGIN);
        page.getByLabel("UserName").click();
        page.getByLabel("UserName").fill(OASYS_Constants.OASYS_TEST_CO);
        page.getByLabel("Password").click();
        page.getByLabel("Password").fill(OASYS_Constants.OASYS_TEST_PASSWORD);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
    }

    /**
     * This method is used to click on the Contract Administration
     */
    @When("User clicks on Contract Administration")
    public void user_clicks_on_contract_administration() {
        page.getByText("Contract Administrationkeyboard_arrow_down").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on Assigned PLINS tab
     */
    @When("User clicks on Assigned PLINS tab")
    public void user_clicks_on_assigned_plins_tab() {
        page.getByText("Assigned Plins").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on Assing PLINS button
     */
    @When("User clicks on Assign PLINS button")
    public void user_clicks_on_assign_plins_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Assign PLINs")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on ADD PLIN button
     */
    @When("User clicks on ADD PLIN")
    public void user_clicks_on_add_plin() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add PLIN")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the PLIN Number, if there is already one, then select the next one
     */
    @When("User selects the PLIN Number")
    public void user_selects_the_plin_number() {
        page.getByLabel("PLIN # *").getByText("PLIN # *").click();
        if (page.getByText("1PLIN # *").isVisible()) {
            page.getByText("2", new Page.GetByTextOptions().setExact(true)).first().click();
        } else {
            page.getByText("1", new Page.GetByTextOptions().setExact(true)).first().click();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the CAN Number, if there is already one, then select the next one
     */
    @When("User selects the CAN Number")
    public void user_selects_the_can_number() {
        page.getByLabel("CAN # *").getByText("CAN # *").click();
        if (page.getByText("8021461CAN # *").isVisible()) {
            page.getByText("8019057").click();
        } else {
            page.getByText("8021461").click();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Amount, if there is already one, then enter the next one
     */
    @When("User enters the amount")
    public void user_enters_the_amount() {
        Locator amountInputs = page.getByLabel("Amount *");
        if (amountInputs.count() == 2) {
            if (!amountInputs.nth(0).inputValue().isEmpty()) {
                amountInputs.nth(1).clear();
                amountInputs.nth(1).type("0");
            } else {
                amountInputs.nth(0).clear();
                amountInputs.nth(0).type("200");
            }
        } else {
            amountInputs.first().clear();
            amountInputs.first().type("200");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the APPROVE button in the upper right corner of the page
     */
    @When("User clicks on APPROVE button in the upper right corner of the page")
    public void user_clicks_on_approve_button_in_the_upper_right_corner_of_the_page() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Comments
     * @param Comments
     */
    @When("User types {string} in Comments")
    public void user_types_approved_in_comments(String Comments) {
        page.getByLabel("Comments").click();
        page.getByLabel("Comments").fill(Comments);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to check the box for Confirm Approval
     */
    @When("User checks the box for Confirm Approval")
    public void user_will_check_the_box_for_confirm_approval() {
        page.locator(".mat-checkbox-inner-container").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the APPROVE button
     */
    @Then("User clicks on APPROVE button")
    public void user_will_click_on_approve_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve")).click();
    }

    /**
     * This method is used to click on Approved radiobutton
     */
    @And("User clicks on Approved radiobutton")
    public void user_clicks_on_approved_radiobutton() {
        page.getByLabel("Approve Invoice").getByText("Approved").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the invoice status is updated to Approved
     */
    @Then("User verifies the invoice status is updated to Approved")
    public void user_verifies_the_invoice_status_is_updated_to_approved() {
        OASYS_CommonUtils.waitForElementToBeVisible("text=Status Updated");
        assertThat(page.getByText("Status Updated")).isVisible();
        page.waitForSelector("span.status.done:has-text('APPROVED')", new Page.WaitForSelectorOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("dynamic-detail-header")).containsText("APPROVED");
    }

    /**
     * This method is used to verify an invoice in Approved status is present on the page
     */
    @And("User verifies an invoice in Approved status is present")
    public void user_verifies_an_invoice_in_approved_status_is_present() {
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Approved")).first().isVisible()) {
            assertThat(page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Approved")).first()).isVisible();
        } else if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("INV-TEST001")).nth(1).isVisible()) {
            assertThat(page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Approved")).nth(1)).isVisible();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Delete button for an invoice in Approved status
     */
    @And("User clicks on DELETE button")
    public void user_clicks_on_delete_button() {
        page.locator("mat-cell:nth-child(12)").first().click();
        assertThat(page.locator("ng-component")).containsText("Are you sure you would like to Delete?");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the invoice is deleted successfully
     */
    @Then("User verifies the invoice is deleted successfully")
    public void user_verifies_the_invoice_is_deleted_successfully() {
        OASYS_CommonUtils.waitForElementToBeVisible("text=Invoice Deleted");
        assertThat(page.getByText("Invoice Deleted")).isVisible();
    }

    /**
     * This method is used to provide Invoice Number in the Invoice number field
     *
     * @param InvoiceNumber
     */
    @And("User types {string} in Invoice number field")
    public void user_types_in_invoice_number_field(String InvoiceNumber) {
        page.getByLabel("Invoice #").click();
        page.getByLabel("Invoice #").fill(InvoiceNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Staff Assignment from the dropdown
     *
     * @param StaffAssignment
     */
    @And("User selects {string} from the Staff Assignment dropdown")
    public void user_selects_from_the_staff_assignment_dropdown(String StaffAssignment) {
        page.getByLabel("Staff Assignment").click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Staff Assignment")).fill(StaffAssignment);
        page.getByText("(I) WILKISON Paula (paula.").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Review Status from the dropdown
     *
     * @param ReviewStatus
     */
    @And("User selects {string} from review status")
    public void user_selects_from_review_status(String ReviewStatus) {
        page.getByLabel("Review Status").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(ReviewStatus)).locator("span").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select OA Branch from the dropdown
     *
     * @param Branch
     */
    @And("User selects {string} as OA Branch")
    public void user_selects_as_oa_branch(String Branch) {
        page.getByLabel("OA Branch").click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("OA Branch")).fill(Branch);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Branch)).locator("span").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to provide the invoice amount - From
     *
     * @param FromAmount
     */
    @And("User types ${int} in From Amount")
    public void user_types_in_from_amount(Integer FromAmount) {
        page.getByLabel("From ($ Amount)").click();
        page.getByLabel("From ($ Amount)").fill(String.valueOf(FromAmount));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to provide the invoice amount - To
     *
     * @param ToAmount
     */
    @And("User types ${int} in To Amount")
    public void user_types_in_to_amount(Integer ToAmount) {
        page.getByLabel("To ($ Amount)").click();
        page.getByLabel("To ($ Amount)").fill(String.valueOf(ToAmount));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select From Date
     *
     * @param FromDate
     */
    @And("User selects {string} from Date Uploaded \\(From)")
    public void user_selects_a_date_from_date_uploaded_from(String FromDate) {
        page.getByLabel("Date Uploaded (From)").click();
        page.locator(".cdk-overlay-backdrop").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Date Uploaded (From)")).fill(FromDate);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select To Date
     *
     * @param ToDate
     */
    @And("User selects {string} from Date Uploaded \\(To)")
    public void user_selects_a_date_from_date_uploaded_to(String ToDate) {
        page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Date Uploaded \\(To\\)$"))).nth(2).click();
        page.locator(".cdk-overlay-backdrop").click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Date Uploaded (To)")).fill(ToDate);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the SEARCH button
     */
    @And("User clicks on SEARCH button")
    public void user_clicks_on_search_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify if search results are within the search criteria
     */
    @And("User will verify if search results are within the search criteria")
    public void user_will_verify_if_search_results_are_within_the_search_criteria() {
        assertThat(page.getByRole(AriaRole.TABLE)).containsText("Submitted");
        assertThat(page.getByRole(AriaRole.TABLE)).containsText("NBB");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the CLEAR FILTERS button
     */
    @Then("User clicks on CLEAR FILTERS button")
    public void user_clicks_on_clear_filters_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Clear Filters")).click();
    }

    /**
     * This method is used to selects All Invoices from the dropdown
     */
    @And("User selects All Invoices from the dropdown")
    public void user_selects_all_invoices_from_the_dropdown() {
        page.getByText("All Invoices").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("All Invoices")).locator("span").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify if search results are within the specified amount range
     */
    @And("User will verify if search results are within the specified amount range")
    public void user_will_verify_if_search_results_are_within_the_specified_amount_range() {
        assertThat(page.getByRole(AriaRole.TABLE)).containsText("$100.00");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the EXPORT SEARCH RESULT button
     */
    @Then("User clicks on EXPORT SEARCH RESULT button")
    public void user_clicks_on_export_search_result_button() {
        page.locator("xpath=//span[normalize-space()='Export Search Result']").click();
        CommonUtils.sleep(3000);
    }
}