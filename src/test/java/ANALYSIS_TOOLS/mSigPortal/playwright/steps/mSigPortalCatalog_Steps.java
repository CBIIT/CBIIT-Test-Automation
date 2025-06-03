package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations.mSigPortalCatalogStepsImpl;

public class mSigPortalCatalog_Steps {

    /**
     * CLICKING ON THE CATEGORY OF ENVIRONMENTAL MUTAGENESIS
     */
    @Then("User clicks on the environmental mutagenesis category")
    public void user_clicks_on_the_environmental_mutagenesis_category() {
        PlaywrightUtils.page.locator("//div[normalize-space()='Environmental Mutagenesis']").click();
    }

    /**
     * CLICKING AND THEN SELECTING PROPOSED ETIOLOGY
     */
    @Then("User clicks on the aromatic amines and then selects etiology")
    public void user_clicks_on_the_aromatic_amines_and_then_selects_etiology() {
        mSigPortalCatalogStepsImpl.clickAndSelectEtiology();
    }

    /**
     * CLICKING DOWNLOAD PLOTLY DATA BUTTON
     */
    @Then("User clicks on the download plotly data button under the category")
    public void user_clicks_on_the_download_plotly_data_button_under_the_category() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Download Plotly Data >']").click();
    }

    /**
     * CLICKING ON THE REFERENCE SIGNATURE UNDER CATALOG
     */
    @Then("User clicks on the reference signature under catalog")
    public void user_clicks_on_the_reference_signature_under_catalog() {
        PlaywrightUtils.page.locator("//a[@class='secondary-navlinks px-2 py-1 d-inline-block text-catalog']").click();
    }

    /**
     * CLICKING ON THE PROFILE TAB AND THEN CALCULATED TO VISUALIZE MUTATIONAL PROFILE
     */
    @Then("User clicks on the RS profile tab and calculates to visualize the mutational signature profile")
    public void user_clicks_on_the_rs_profile_tab_and_calculates_to_visualize_the_mutational_signature_profile() {
        mSigPortalCatalogStepsImpl.clickProfileAndCalculates();
    }

    /**
     * VALIDATING THE MUTATIONAL PROFILE PLOT
     */
    @Then("Verify that mutational profile plot is shown")
    public void verify_that_mutational_profile_plot_is_shown() {
        mSigPortalCatalogStepsImpl.validateMutationalProfilePlot();
    }
    /**
     * DOWNLOADS PLOT DATA THOUGH DOWNLOAD PLOTLY DATA BUTTON
     */
    @Then("User downloads the plot data through the Download Plotly Data button")
    public void user_downloads_the_plot_data_through_the_download_plotly_data_button() {
        PlaywrightUtils.page.locator("//div[contains(@id,'plotForms')]//button[@type='button'][normalize-space()='Download Plotly Data >']").click();
    }

    /**
     * CLICKING ON NEW PLOT BUTTON AND THEN CALCULATES ON SELECTED RESOURCE
     */
    @Then("User adds a new plot and calculates the data for the selected resource")
    public void user_adds_a_new_plot_and_calculates_the_data_for_the_selected_resource() throws InterruptedException {
        mSigPortalCatalogStepsImpl.addNewPlotAndCalculates();
    }

    /**
     * CLICKING ON NEW PLOT BUTTON AND THEN CALCULATES ON SELECTED RESOURCE
     */
    @Then("Verify the new plot displayed and download the data")
    public void verify_the_new_plot_displayed_and_download_the_data() throws InterruptedException {
        mSigPortalCatalogStepsImpl.verifyNewPlotAndDownloadData();
    }

    /**
     * CLICKING ON REMOVE PLOT BUTTON
     */
    @Then("User clicks on the remove plot")
    public void user_clicks_on_the_remove_plot() {
        PlaywrightUtils.page.locator("//span[@title='Remove Plot']").click();
    }

    /**
     * CLICKING ON DOWNLOAD BUTTON UNDER CATALOG
     */
    @Then("User clicks on the download under catalog")
    public void user_clicks_on_the_download_under_catalog() {
        PlaywrightUtils.page.locator("//strong[normalize-space()='Download']").click();
    }

    /**
     * CLICKING ON DOWNLOAD MATRIX FOR ALL AVAILABLE MUTATIONAL SIGNATURE
     */
    @Then("User clicks on the download matrix for all available mutational signatures")
    public void user_clicks_on_the_download_matrix_for_all_available_mutational_signatures() {
        PlaywrightUtils.page.locator("//button[contains(text(),'Download matrixes for all available mutational sig')]").click();
    }
}