package CUSTOM_BUSINESS.Oasys.Steps;

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
     * This method is logging in as Contracting Officer
    */
    @Given("User is logged in as Contracting Officer")
    public void user_is_logged_in_as_contracting_officer() {
        Oasys_Steps_Implementation.user_is_logged_in_oasys();
    }

    /**
     * This method is navigating to Contract Administration
     */
    @When("User clicks on Contract Administration")
    public void user_clicks_on_contract_administration() {
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
        page.locator("xpath=/html[1]/body[1]/div[1]/div[4]/div[1]/mat-dialog-container[1]/edit-contract-details-modal[1]/div[1]/div[1]/compass-form[1]/div[1]/div[37]/ng-component[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]").click();
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
}

