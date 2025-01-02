package CUSTOM_BUSINESS.OASYS.Steps;

import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import CUSTOM_BUSINESS.OASYS.StepsImplementation.OASYS_Steps_Implementation;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contracts {

    /**
     * This method is logging in the application and navigating to Contract Administration
    */
    @Given("User is logged in the application and navigated to Contract Administration")
    public void user_is_logged_in_the_application_and_navigated_to_contract_administration() {
        OASYS_Steps_Implementation.user_is_logged_in_oasys();
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
    @And("user selects {string} from the list of contracts")
    public void user_selects_from_the_list_of_contracts(String ITcommodities) {
        page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("IT Commodities and Solutions HHSN316201500067W Other SWORD & SHIELD ENTERPRISE")).locator("div").first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Edit Contract Information button
     */
    @And("user clicks on Edit Contract Information button")
    public void user_clicks_on_edit_contract_information_button() {
        page.getByRole(AriaRole.REGION, new Page.GetByRoleOptions().setName("Contract Information")).getByRole(AriaRole.BUTTON).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is changing the Severability to Severable
     */
    @And("user changes the Severability to Severable")
    public void user_changes_the_severability_to_severable() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Severability']").click();
        page.locator("xpath=//span[@class='mat-option-text'][normalize-space()='Severable']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Yes from the IT related dropdown
     */
    @And("User selects Yes from the IT related dropdown")
    public void user_selects_from_the_it_related_dropdown() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='IT Related *']").click();
        page.locator("xpath=//mat-option/span[contains(text(),'Yes')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Open Market for the Procurement Mechanism
     */
    @And("User selects Open Market for the Procurement Mechanism")
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
    @And("User selects No for Does the COR advise continued performance?")
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
     * This method is saving the changes made to the contract
     */
    @Then("User clicks on Save button to confirm the changes")
    public void user_clicks_on_save_button_to_confirm_the_changes() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
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

    /**
     * This method is clicking on Contract Messages
     */
    @And("User clicks on Contract Messages")
    public void user_clicks_on_contract_messages() {
       page.locator("xpath=//div/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[contains(text(),'Contract Messages')]").click();
       CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on NEW Message button
     */
    @When("User clicks on NEW Message button")
    public void user_clicks_on_new_message_button() {
        page.locator("xpath=//div/div/button/span[contains(text(), ' New Message')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing TEST CONTRACT MESSAGE in the Subject line
     */
    @When("User types TEST CONTRACT MESSAGE in the Subject line")
    public void user_types_test_message_in_the_subject() {
        page.locator("xpath=//div/input[@ng-reflect-name='Subject']").fill("TEST CONTRACT MESSAGE");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the message body
     */
    @When("User types a text in the message body")
    public void user_types_a_text_in_message_body() {
        page.locator("xpath=//div[@class='ql-editor ql-blank']").fill("*** THIS IS A TEST CONTRACT MESSAGE ***");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Submit button
     */
    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button() {
        page.locator("xpath=//mat-dialog-actions/button/span[contains(text(),'Submit')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is verifying the submitted message. It iterates through the list of messages and checks if the message with the expected subject line is present
     * @param messageSubject
     */
    @Then("User verifies the submitted message contains {string}")
    public void user_verifies_the_submitted_message(String messageSubject) {
        Locator contractMessages = page.locator("xpath=//div/div/div/div[@class='detail']");
        boolean contractMessageFound = false;
        for (int i = 0; i < contractMessages.count(); i++) {
            if (contractMessages.nth(i).innerText().contains(messageSubject)) {
                contractMessageFound = true;
                assertThat(contractMessages.nth(i)).containsText(messageSubject);
                break;
            }
        }
        if (!contractMessageFound) {
            throw new AssertionError("*** MESSAGE WITH SUBJECT LINE '" + messageSubject + "' NOT FOUND.***");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on Vendor Contacts
     */
    @And("User clicks on Vendor Contacts")
    public void user_clicks_on_vendor_contacts() {
        page.locator("xpath=//mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[contains(text(),'Vendor Contacts')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on ADD NEW button
     */
    @When("User clicks on ADD NEW button")
    public void user_clicks_on_add_new_button() {
        page.locator("xpath=//div/button/span[contains(text(),'Add New')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the First Name field
     * @param FirstName
     */
    @When("User types {string} in First Name field")
    public void user_types_in_first_name(String FirstName) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='First Name *']").fill(FirstName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the Last Name field
     * @param LastName
     */
    @When("User types {string} in Last Name field")
    public void user_types_in_last_name(String LastName) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Last Name *']").fill(LastName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the Email field
     * @param Email
     */
    @When("User types {string} in Email field")
    public void user_types_in_email(String Email) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Email *']").fill(Email);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the Title field
     * @param Title
     */
    @When("User types {string} in Title field")
    public void user_types_manager_in_title(String Title) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Title *']").fill(Title);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is typing a text in the Phone field
     * @param Phone
     */
    @When("User types {string} in Phone field")
    public void user_types_in_phone(String Phone) {
        page.locator("xpath=//div/input[@ng-reflect-placeholder='Phone *']").fill(Phone);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is selecting Business Representative from Contact Type
     */
    @When("User selects Business Representative from Contact Type")
    public void user_selects_business_representative_from_contact_type() {
        page.locator("xpath=//div/mat-select[@ng-reflect-placeholder='Contact Type *']").click();
        page.locator("xpath=//div/mat-option/span[contains(text(), 'Business Representative')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is clicking on SAVE button
     */
    @Then("User clicks on SAVE button")
    public void user_clicks_on_save_button() {
        page.locator("xpath=//span[contains(text(),'Save')]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}