package CUSTOM_BUSINESS.Oasys.Steps;

import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import CUSTOM_BUSINESS.Oasys.StepsImplementation.Oasys_Steps_Implementation;
import static com.nci.automation.web.PlaywrightUtils.page;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contracts {

    /**
     * This method is logging in the application and navigating to Contract Administration
    */
    @Given("User is logged in the application and navigated to Contract Administration")
    public void user_is_logged_in_the_application_and_navigated_to_contract_administration() {
        Oasys_Steps_Implementation.user_is_logged_in_oasys();
        page.getByText("Contract Administrationkeyboard_arrow_down").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is navigating to Contracts page
     */
    @When("User clicks on Contracts")
    public void user_clicks_on_contracts() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contract").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting a contract from the list of contracts
     * @param ITcommodities
     */
    @When("user selects {string} from the list of contracts")
    public void user_selects_from_the_list_of_contracts(String ITcommodities) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("IT Commodities and Solutions HHSN316201500067W Other SWORD & SHIELD ENTERPRISE")).locator("div").first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Edit Contract Information button
     */
    @When("user clicks on Edit Contract Information button")
    public void user_clicks_on_edit_contract_information_button() {
        page.getByRole(AriaRole.REGION, new Page.GetByRoleOptions().setName("Contract Information")).getByRole(AriaRole.BUTTON).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is changing the Severability to Severable
     */
    @When("user changes the Severability to Severable")
    public void user_changes_the_severability_to_severable() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Severability']").click();
        //page.locator("xpath=/html[1]/body[1]/div[1]/div[4]/div[1]/mat-dialog-container[1]/edit-contract-details-modal[1]/div[1]/div[1]/compass-form[1]/div[1]/div[37]/ng-component[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]").click();
        page.locator("xpath=//span[@class='mat-option-text'][normalize-space()='Severable']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is saving the changes made to the contract
     */
    @Then("User clicks on Save button to confirm the changes")
    public void user_clicks_on_save_button_to_confirm_the_changes() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Yes from the IT related dropdown
     */
    @When("User selects Yes from the IT related dropdown")
    public void user_selects_from_the_it_related_dropdown() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='IT Related *']").click();
        page.locator("xpath=//mat-option/span[contains(text(),'Yes')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Open Market for the Procurement Mechanism
     */
    @When("User selects Open Market for the Procurement Mechanism")
    public void user_selects_for_the_procurement_mechanism() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Procurment Mechanism *']").click();
        page.locator("xpath=//mat-option/span[contains(text(),'Open Market')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting No for Will funding need to be added for expected activities within the next three months?
     */
    @When("User selects No for Will funding need to be added for expected activities within the next three months?")
    public void user_selects_No_for_will_funding_need_to_be_added_for_expected_activities_within_the_next_three_months() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Will funding need to be added ']").click();
        page.locator("xpath=//mat-option/span[contains(text(),'No')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting No for Does the COR advise continued performance?
     */
    @When("User selects No for Does the COR advise continued performance?")
    public void user_selects_for_does_the_cor_advise_continued_performance() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Does the COR Advise Continued ']").click();
        page.locator("xpath=//mat-option/span[contains(text(),'No')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Stop Work for What notice will be sent in the event of a shutdown?
     */
    @When("User selects Stop Work for What notice will be sent in the event of a shutdown?")
    public void user_selects_for_what_notice_will_be_sent_in_the_event_of_a_shutdown() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='What notice will be sent in th']").click();
        page.locator("xpath=//span[@class='mat-option-text'][normalize-space()='Stop Work']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Contract Assignment
     */
    @When("User clicks on Assignments")
    public void user_clicks_on_assignments() {
        Playwright_Common_Utils.scrollIntoView("xpath=//mat-expansion-panel-header/span/mat-panel-title[contains(text(),'Assignments')]");
        page.locator("xpath=//mat-expansion-panel-header/span/mat-panel-title[contains(text(),'Assignments')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Edit button
     */
    @When("User clicks on Edit button")
    public void user_clicks_on_edit_button() {
        page.locator("xpath=(//div/div/button/span[contains(text(), 'Edit')])[4]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Add Invoice Support Staff
     */
    @When("User clicks on ADD INVOICE Support Staff")
    public void user_clicks_on_add_invoice_support_staff() {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Add Invoice Support Staff']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing Test COR in Invoice Support Staff field
     * @param TestCor
     */
    @When("User types {string} in Invoice Support Staff field")
    public void user_types_in_invoice_support_staff_field(String TestCor) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Add Invoice Support Staff']").fill(TestCor);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Test COR
     */
    @When("User clicks on Test COR")
    public void user_clicks_on_test_cor() {
        page.locator("//span[contains(text(),'Test COR')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Save button
     */
    @Then("User will click on SAVE button")
    public void user_will_click_on_save_button() {
        page.locator("xpath=//span[contains(text(),'Save')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

}