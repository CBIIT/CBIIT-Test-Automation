package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;

public class mSigPortalAssociation_Steps {

    @Then("User clicks on the load study button")
    public void user_clicks_on_the_load_study_button() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Load Study']").click();
    }

    @Then("User clicks on the load data button under univariable tab")
    public void user_clicks_on_the_load_data_button_under_univariable_tab() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Load Data']").click();
    }

    @Then("User clicks on the calculate button under the univariable tab")
    public void user_clicks_on_the_calculate_button_under_the_univariable_tab() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Calculate']").click();
    }

    @Then("User clicks on the download variable data button")
    public void user_clicks_on_the_download_variable_data_button() {

    }

    @Then("User clicks on the arrow and then clicks on the reset button")
    public void user_clicks_on_the_arrow_and_then_clicks_on_the_reset_button() {

    }

    @Then("Navigate to the multivariable tab under the association")
    public void navigate_to_the_multivariable_tab_under_the_association() {

    }

    @Then("Validate add association variable is enabled")
    public void validate_add_association_variable_is_enabled() {

    }

    @Then("User clicks on the add association variable button")
    public void user_clicks_on_the_add_association_variable_button() {

    }

    @Then("User clicks on the remove button to remove it")
    public void user_clicks_on_the_remove_button_to_remove_it() {

    }
}