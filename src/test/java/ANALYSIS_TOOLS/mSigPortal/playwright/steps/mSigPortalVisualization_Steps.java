package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations.mSigPortalVisualizationStepsImpl;

public class mSigPortalVisualization_Steps {

    /**
     * CLICKS ON THE SUBMIT BUTTON
     */
    @When("User clicks on the submit button in the visualization tab")
    public void user_clicks_on_the_submit_button_in_the_visualization_tab() {
        PlaywrightUtils.page.locator("//div[4]//div[2]//button[1]").click();
    }

    /**
     * CLICKS ON THE RESET BUTTON
     */
    @Then("User click on the reset button in the visualization tab")
    public void user_click_on_the_reset_button_in_the_visualization_tab() {
        mSigPortalVisualizationStepsImpl.clickResetButton();
    }

    /**
     * NAVIGATES TO THE MUTATIONAL PATTERN ENRICHMENT ANALYSIS TAB
     *
     * @param  string navigates enrichment analysis tab
     */
    @When("navigates to the {string} tab")
    public void navigates_to_the_tab(String enrichmentAnalysisTab) {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(enrichmentAnalysisTab)).click();
    }

    /**
     * CALCULATING WITH MINIMAL PROPORTIONS
     *
     * @param  string value on which minimal proportions calculated
     */
    @When("calculates with {string} minimal proportions")
    public void calculates_with_minimal_proportions(String string) {
        mSigPortalVisualizationStepsImpl.calculatesWithMinimalProportions(string);
    }

    @Then("Validates the bar graph is displayed")
    public void Validates_the_bar_graph_is_displayed() {
        mSigPortalVisualizationStepsImpl.validateBarGraph();
    }

    @Then("user clicks on the download the plotly data")
    public void user_clicks_on_the_download_the_plotly_data() {
        mSigPortalVisualizationStepsImpl.clickDownloadPlotlyData();
    }

    /**
     * VALIDATING THE ERROR MESSAGE
     *
     * @param  string validating the error message that enter a value between 0 and 1
     */
    @Then("Validate the error message {string}")
    public void validate_the_error_message(String string) {
        mSigPortalVisualizationStepsImpl.validateErrorMessage(string);
    }

    /**
     * MOVES TO THE MUTATIONAL PROFILE TAB
     *
     * @param  string moves to the mutational profile tab
     */
    @When("User moves to the {string} tab")
    public void user_moves_to_the_tab(String mutationalProfileTab) {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(mutationalProfileTab)).click();
    }

    /**
     * VERIFYING THE PROFILE TYPE AND MATRIX SIZE
     *
     * @param  string selects the profile type
     * @param string2 selects the matrix size
     *
     */
    @Then("verifies that profile type is selected {string} and matrix size as {string}")
    public void verifies_that_profile_type_is_selected_and_matrix_size_as(String string, String string2) {
        mSigPortalVisualizationStepsImpl.verifySelectedValueInVisualization(string, string2);
    }

    @Then("the SBS96 Plot is displayed")
    public void the_sbs96_plot_is_displayed() {
        mSigPortalVisualizationStepsImpl.verifyPlot();
    }

    /**
     * CLICKS ON THE DOWNLOAD PLOTLY DATA BUTTON UNDER MUTATIONAL PROFILES TAB
     */
    @Then("User clicks on the download plotly data button under Mutational Profiles tab")
    public void user_clicks_on_the_download_plotly_data_button_under_mutational_profiles_tab() {
        PlaywrightUtils.page.locator("//div[contains(@class,'bg-white border rounded p-0 container-fluid')]//button[contains(@type,'button')][normalize-space()='Download Plotly Data >']").click();
    }
}