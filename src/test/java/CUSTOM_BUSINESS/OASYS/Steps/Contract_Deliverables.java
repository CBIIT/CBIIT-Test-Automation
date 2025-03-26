package CUSTOM_BUSINESS.OASYS.Steps;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Contract_Deliverables {

    /**
     * This method navigates to the Contract Deliverables Tab
     */
    @And("User clicks on DELIVERABLE tab")
    public void user_clicks_on_deliverable_tab() {
        page.getByRole(AriaRole.LIST).getByText("Deliverables").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the Add button to add a new deliverable type
     */
    @And("User clicks on ADD button")
    public void user_clicks_on_add_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method types the deliverable type name in the Name field
     *
     * @param DeliverableTypeName
     */
    @And("User types {string} in Name field")
    public void user_types_in_name_field(String DeliverableTypeName) {
        page.getByPlaceholder("Type to Search...").click();
        page.getByPlaceholder("Type to Search...").fill(DeliverableTypeName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects the frequency from the Frequency dropdown
     * @param Frequency
     */
    @And("User selects {string} from the Frequency dropdown")
    public void user_selects_from_the_frequency_dropdown(String Frequency) {
        page.getByLabel("Frequency").locator("div").nth(3).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(Frequency)).locator("span").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects a Date
     */
    @And("User selects a Date")
    public void user_selects_a_date() {
        page.getByLabel("Open calendar").click();
        page.getByText("20", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies if Test CO is the Final Approver, else it selects Test CO as the Final Approver
     * @param FinalApprover
     */
    @And("User verifies {string} is the Final approver")
    public void user_verifies_is_the_final_approver(String FinalApprover) {
        if (!page.locator("#mat-chip-list-0").textContent().contains("Test COcancel")) {
            page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(FinalApprover).setExact(true)).locator("mat-icon").click();
            page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Final Approvers *")).fill("CO");
            page.getByText("Test CO", new Page.GetByTextOptions().setExact(true)).click();
        } else {
            assertThat(page.locator("#mat-chip-list-0")).containsText("Test COcancel");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on Save button
     */
    @Then("User will click on Save button")
    public void user_will_click_on_save_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
    }

    /**
     * This method clicks on a deliverable type from the list
     */
    @And("User clicks on a deliverable type from the list")
    public void user_clicks_on_a_deliverable_type_from_the_list() {
        page.locator("contract-info-deliverables").getByText("Automated Test - Deliverable").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects Version Effective From date
     */
    @And("User clicks on Version Effective From to select a date")
    public void user_clicks_on_version_effective_from_to_select_a_date() {
        page.locator("mat-form-field").filter(new Locator.FilterOptions().setHasText("Version Effective From *")).getByLabel("Open calendar").click();
        page.getByText("24", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects Version Effective Until date
     */
    @And("User clicks on Version Effective Until to select a date")
    public void user_clicks_on_version_effective_until_to_select_a_date() {
        page.locator("mat-form-field").filter(new Locator.FilterOptions().setHasText("Version Effective Until *")).getByLabel("Open calendar").click();
        page.getByLabel("Next month").click();
        page.getByLabel("Next month").click();
        page.getByText("16", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects a Final Approver
     * @param FinalApprover
     */
    @And("User selects {string} as Final Approver")
    public void user_selects_as_final_approver(String FinalApprover) {
        page.getByLabel("Final Approvers *").click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Final Approvers *")).fill(FinalApprover);
        page.getByText(FinalApprover).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects an Additional Reviewer
     * @param AdditionalReviewer
     */
    @And("User selects {string} as Additional Reviewer")
    public void user_selects_as_additional_reviewer(String AdditionalReviewer) {
        page.getByLabel("Additional Reviewers").click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Additional Reviewers")).fill(AdditionalReviewer);
        page.getByText(AdditionalReviewer).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the Add Version button
     */
    @And("User clicks on ADD VERSION button")
    public void user_clicks_on_add_version_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Version")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method updates the deliverable name in the Name field
     * @param DeliverableTypeName
     */
    @And("User updates the deliverable name to {string} in Name field")
    public void user_updates_the_deliverable_name_to_in_name_field(String DeliverableTypeName) {
        page.getByPlaceholder("Type to Search...").click();
        page.getByPlaceholder("Type to Search...").fill(DeliverableTypeName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects a Start date
     */
    @And("User selects a Start date")
    public void user_selects_a_start_date() {
        page.locator("mat-form-field").filter(new Locator.FilterOptions().setHasText("Start *")).getByLabel("Open calendar").click();
        page.getByText("18", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects an End date
     */
    @And("User selects an End date")
    public void user_selects_an_end_date() {
        page.locator("mat-form-field").filter(new Locator.FilterOptions().setHasText("End *")).getByLabel("Open calendar").click();
        page.getByLabel("Next month").click();
        page.getByLabel("Next month").click();
        page.getByText("22", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects a Frequency in One Month
     * @param FrequencyInOneMonth
     */
    @And("User selects {string} for Every How Many months?")
    public void user_selects_for_every_how_many_months(String FrequencyInOneMonth) {
        page.getByLabel("Every (How many Months?) *").click();
        page.getByLabel("Every (How many Months?) *").fill(FrequencyInOneMonth);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects a Day of the month
     * @param DayOfMonth
     */
    @And("User selects {string} for the Day of the month")
    public void user_selects_for_the_day_of_the_month(String DayOfMonth) {
        page.getByLabel("Day *").click();
        page.getByLabel("Day *").fill(DayOfMonth);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method selects deliverable version from the list
     * @param DeliverableTypeV1
     */
    @And("User clicks on {string} from the deliverable type list")
    public void user_clicks_on_from_the_deliverable_type_list(String DeliverableTypeV1) {
        page.locator("contract-info-deliverables").getByText(DeliverableTypeV1).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on Delete button to remove the Deliverable Type
     */
    @Then("User clicks on DELETE button to remove the Deliverable Type")
    public void user_clicks_on_delete_button_to_remove_the_deliverable_type() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
    }

    /**
     * This method clicks on the Deliverable from the Schedule list
     */
    @And("User clicks on a Deliverable from the Schedule list")
    public void user_clicks_on_a_deliverable_from_the_schedule_list() {
        page.locator("(//mat-cell/div[contains(text(),'Deliverable for Automated Test')])[1]").click();
        CucumberLogUtils.playwrightScreenshot(page);
        }

    /**
     * This method clicks on SUBMIT DELIVERABLE button in upper right corner of the page
     */
    @And("User clicks on SUBMIT DELIVERABLE button on upper right corner of the page")
    public void user_clicks_on_submit_deliverable_button_on_upper_right_corner_of_the_page() {
        CommonUtils.sleep(3000);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit Deliverable")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method types the Point of Contact Name
     * @param POCName
     */
    @And("User types {string} in Point of Contact Name")
    public void user_types_in_point_of_contact_name(String POCName) {
        page.getByLabel("Point of Contact Name").click();
        page.getByLabel("Point of Contact Name").fill(POCName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method types the Point of Contact Email
     * @param POCEmail
     */
    @And("User types {string} in Point of Contact Email")
    public void user_types_in_point_of_contact_email(String POCEmail) {
        page.getByLabel("Point of Contact Email").click();
        page.getByLabel("Point of Contact Email").fill(POCEmail);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method deselects the Include in Contract Files checkbox
      */
    @And("User will deselect Include in Contract Files")
    public void user_will_deselect_include_in_contract_files() {
        page.locator(".mat-checkbox-inner-container").first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the SUBMIT DELIVERABLE button
     */
    @Then("User will click on SUBMIT DELIVERABLE button")
    public void user_will_click_on_submit_deliverable_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit Deliverable")).click();
    }

    /**
     * This method clicks on the Deliverable module
     */
    @And("User clicks on Deliverable module")
    public void user_clicks_on_deliverable_module() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Deliverables")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the Deliverable from To Do list
     */
    @And("User clicks on the Deliverable from To Do list")
    public void user_clicks_on_the_deliverable_from_to_do_list() {
        page.locator("(//mat-cell/div[contains(text(),'Deliverable for Automated Test')])[1]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the APPROVE button on upper right corner of the page
     */
    @And("User clicks on APPROVE button on the upper right corner of the page")
    public void user_clicks_on_approve_button_on_the_upper_right_corner_of_the_page() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method types the Comments
     * @param Comments
     */
    @And("User types {string} in the Comments")
    public void user_types_in_the_comments(String Comments) {
        page.getByLabel("Comments").click();
        page.getByLabel("Comments").fill(Comments);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method checks the box for Confirm Approval
     */
    @And("User will check the box for Confirm Approval")
    public void user_will_check_the_box_for_confirm_approval() {
        page.locator(".mat-checkbox-inner-container").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the APPROVE button
     */
    @Then("User will click on APPROVE button")
    public void user_will_click_on_approve_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Approve")).click();
    }

    /**
     * This method clicks on Undo Review button for CO
     */
    @And("User clicks on Undo Review for CO")
    public void user_clicks_on_undo_review_for_co() {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Test CO CO - Final Reviewer")).getByRole(AriaRole.BUTTON).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method navigates back the Deliverable list and removes the review deliverable from the list
     */
    @Then("And User navigates back the Deliverable list")
    public void and_user_navigates_back_the_deliverable_list() {
        page.getByText("arrow_backIT Commodities and").click();
        page.locator("mat-cell").filter(new Locator.FilterOptions().setHasText("delete")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
    }
}