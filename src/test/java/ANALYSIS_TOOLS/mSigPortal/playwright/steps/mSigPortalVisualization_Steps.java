package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations.mSigPortalVisualizationStepsImpl;

public class mSigPortalVisualization_Steps {

    @When("User clicks on the submit button in the visualization tab")
    public void user_clicks_on_the_submit_button_in_the_visualization_tab() {
        PlaywrightUtils.page.locator("//div[4]//div[2]//button[1]").click();
    }

    @Then("User click on the reset button in the visualization tab")
    public void user_click_on_the_reset_button_in_the_visualization_tab() {
        mSigPortalVisualizationStepsImpl.clickResetButton();
    }

    @When("navigates to the {string} tab")
    public void navigates_to_the_tab(String string) {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(string)).click();
    }

    @When("calculates with {string} minimal proportions")
    public void calculates_with_minimal_proportions(String string) {
        mSigPortalVisualizationStepsImpl.calculatesWithMinimalProportions(string);
    }

    @Then("Validate the bar graph is displayed")
    public void Validate_the_bar_graph_is_displayed() {
        mSigPortalVisualizationStepsImpl.validateBarGraph();
    }

    @Then("user clicks on the download the plotly data")
    public void user_clicks_on_the_download_the_plotly_data() {
        mSigPortalVisualizationStepsImpl.clickDownloadPlotlyData();
    }

    @Then("Validate the error message {string}")
    public void validate_the_error_message(String string) {
        mSigPortalVisualizationStepsImpl.validateErrorMessage(string);
    }

    @When("User moves to the {string} tab")
    public void user_moves_to_the_tab(String string) {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(string)).click();
    }

    @Then("Verify that profile type is selected {string} and matrix size as {string}")
    public void verify_that_profile_type_is_selected_and_matrix_size_as(String string, String string2) {
        mSigPortalVisualizationStepsImpl.verifySelectedValueInVisualization(string, string2);
    }

    @Then("the SBS96 Plot is displayed")
    public void the_sbs96_plot_is_displayed() {
        mSigPortalVisualizationStepsImpl.verifyPlot();
    }

    @Then("User clicks on the download plotly data button under Mutational Profiles tab")
    public void user_clicks_on_the_download_plotly_data_button_under_mutational_profiles_tab() {
        PlaywrightUtils.page.locator("//div[contains(@class,'bg-white border rounded p-0 container-fluid')]//button[contains(@type,'button')][normalize-space()='Download Plotly Data >']").click();
    }
}