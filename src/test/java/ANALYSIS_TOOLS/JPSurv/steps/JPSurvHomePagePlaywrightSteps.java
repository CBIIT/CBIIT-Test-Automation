package ANALYSIS_TOOLS.JPSurv.steps;

import ANALYSIS_TOOLS.JPSurv.pages.JPSurvHomePagePlaywright;
import ANALYSIS_TOOLS.JPSurv.stepsImplementations.JPSurvHomePagePlaywrightStepImp;
import ANALYSIS_TOOLS.JPSurv.utils.JPSurvConstants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getJpSurvUrl;

public class JPSurvHomePagePlaywrightSteps extends PageInitializer {

    @Given("User navigates to JPSurv home page")
    public void user_navigates_to_jp_surv_home_page() {
        PlaywrightUtils.page.navigate(getJpSurvUrl());
        CommonUtils.sleep(2000);
    }

    /**
     * Uploading the files for the calculation.
     */
    @Then("User uploads file in the homepage")
    public void user_uploads_file_in_the_homepage() {
        JPSurvHomePagePlaywrightStepImp.uploadFile();
    }

    /**
     * Asserting the "See Details" page title.
     */
    @Then("User clicks on the see article links and validate the title")
    public void user_clicks_on_the_see_article_links_and_validate_the_title() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle("See article.", JPSurvConstants.SEE_DETAILS_PAGE_TITLE);
    }

    /**
     * Validating the page title for the journal link
     */
    @Then("User clicks on the journal link and validate the title")
    public void user_clicks_on_the_journal_link_and_validate_the_title() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(JPSurvHomePagePlaywright.doiOrg,JPSurvConstants.DOI_ORG_PAGE_TITLE);
    }

    @Then("User clicks on the help tab in the JPOSurv website")
    public void user_clicks_on_the_help_tab_in_the_jpo_surv_website() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.helpTabElement).click();
    }

    /**
     * Validating the help section url in the website.
     */
    @Then("Verify user is in the help section of the website")
    public void verify_user_is_in_the_help_section_of_the_website() {
        assertThat(PlaywrightUtils.page).hasURL(JPSurvHomePagePlaywright.helpWebsite);
    }

    @Then("User selects start year of diagnosis")
    public void user_selects_start_year_of_diagnosis() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.startYear).selectOption("5");
    }

    @Then("User selects end year of diagnosis")
    public void user_selects_end_year_of_diagnosis() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.endYear).selectOption("15");
    }

    @Then("User selects interval of maximum years of diagnosis")
    public void user_selects_interval_of_maximum_years_of_diagnosis() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.intervalForDiagnosis).selectOption("5");
    }

    @Then("User clicks on the NHL checkbox")
    public void user_clicks_on_the_nhl_checkbox() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.nhlLocator).click();
    }

    @Then("User clicks on the submit button to calculate cohert and model specifications")
    public void user_clicks_on_the_submit_button_to_calculate_cohert_and_model_specifications() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        CommonUtils.sleep(10000);
    }

    @Then("User clicks on the reset button to reset the selected data")
    public void user_clicks_on_the_reset_button_to_reset_the_selected_data() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
    }

    @Then("User expands the conditional survival calculation field")
    public void user_expands_the_conditional_survival_calculation_field() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cscLocator).click();
    }

    @Then("User clicks on the conditional survival recalculation checkbox")
    public void user_clicks_on_the_conditional_survival_recalculation_checkbox() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cscCheckBoxLocator).click();
    }

    /**
     * Selected the start and end conditional intervals
     */
    @Then("User selects the start and end conditional intervals")
    public void user_selects_the_start_and_end_conditional_intervals() {
        JPSurvHomePagePlaywrightStepImp.selectStartAndEndInterval();
    }

    @Then("User clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.recalculateButton).click();
    }

    @Then("User clicks on the add interval")
    public void user_clicks_on_the_add_interval() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.addInterval).click();
    }

    /**
     * Selected the new start and end conditional intervals again.
     */
    @Then("User selects the start and end conditional intervals in the new interval")
    public void user_selects_the_start_and_end_conditional_intervals_in_the_new_interval() {
        JPSurvHomePagePlaywrightStepImp.selectNewStartAndEndInterval();
    }

    @Then("User clicks on the download full dataset link")
    public void user_clicks_on_the_download_full_dataset_link() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.downloadDataset).click();
    }

    @Then("User click on the save workspace link")
    public void user_click_on_the_save_workspace_link() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.exportWorkspace).click();
    }

    @Then("User selects CSV file as input type")
    public void user_selects_csv_file_as_input_type() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.inputType).selectOption("CSV File");
        CommonUtils.sleep(2000);
    }

    /**
     * Uploaded the CSV file in the homepage
     */
    @Then("User uploads CSV file in the homepage")
    public void user_uploads_csv_file_in_the_homepage() {
        JPSurvHomePagePlaywrightStepImp.uploadCSVFile();
    }

    @Then("User clicks on the Surveillance Research Program link")
    public void user_clicks_on_the_surveillance_research_program_link() {
        PlaywrightUtils.page.locator("//a[@title='JPSurv Home']").click();
    }

    /**
     * Validating the page title "NCI Analysis Tools Home Page"
     */
    @Then("Verify user is in the NCI Analysis Tools Home Page")
    public void verify_user_is_in_the_nci_analysis_tools_home_page() {
        assertThat(PlaywrightUtils.page).hasTitle(JPSurvConstants.NCI_ANALYSIS_HOMEPAGE_TITLE);
    }

    /**
     * Clicking on every presentation.
     */
    @Then("User clicks on every presentation of nav item")
    public void user_clicks_on_every_presentation_of_nav_item() {
        JPSurvHomePagePlaywrightStepImp.clickEveryPresentation();
    }

    @Then("Verify user is able to hide the configuration panel")
    public void verify_user_is_able_to_hide_the_configuration_panel() {
        PlaywrightUtils.page.locator(".set-absolute").click();
    }

    @Then("User selects workspace as input type")
    public void user_selects_workspace_as_input_type() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.inputType).selectOption("Workspace");
        CommonUtils.sleep(2000);
    }

    /**
     * Uploaded the zip file in the homepage
     */
    @Then("User uploads the ZIP file in the homepage")
    public void user_uploads_the_zip_file_in_the_homepage() {
        JPSurvHomePagePlaywrightStepImp.uploadZIPFile();
    }

    @Then("User clicks on the submit button after uploading file")
    public void user_clicks_on_the_submit_button_after_uploading_file() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.submitButtonLocator).click();
    }

    @Then("User selects the long running job checkbox")
    public void user_selects_the_long_running_job_checkbox() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.sendNotification).click();
    }

    /**
     * Entering the name and email in the notification section.
     *
     * @param name    The name to be entered.
     * @param email    The email to be entered.
     */
    @Then("User enters {string} as job name and {string} as email in the notification section")
    public void user_enters_as_job_name_and_as_email_in_the_notification_section(String name, String email) {
        JPSurvHomePagePlaywrightStepImp.enterJobNameAndEmail(name, email);
    }

    /**
     * Verifying the text "Your job has been submitted"
     */
    @Then("Verify the data is submitted to the email")
    public void verify_the_data_is_submitted_to_the_email() {
        assertThat(PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.jobSubmitted)).containsText(JPSurvConstants.JOB_SUBMITTED_TEXT);
    }

    /**
     * Selected both NHL and CML checkboxes.
     */
    @Then("User selects both on the NHL and CML checkbox")
    public void user_selects_both_on_the_nhl_and_cml_checkbox() {
        JPSurvHomePagePlaywrightStepImp.selectBothNhLAndCHL();
    }

    @Then("User changes cohort from NHL to CML")
    public void user_changes_cohort_from_nhl_to_cml() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.selectCohort).selectOption("Chronic Myeloid Leukemia");
    }

    /**
     * Selecting the cutpoint after clicking on the relax proportionality.
     *
     * @param cutpoint    The cutpoint to be selected.
     */
    @Then("User checks the relax proportionality and selects the cutpoint {string}")
    public void user_checks_the_relax_proportionality_and_selects_the_cutpoint(String cutpoint) {
        JPSurvHomePagePlaywrightStepImp.checkRelaxProportionalityAndCutPoint(cutpoint);
    }

    /**
     * Selecting the cutpoint.
     *
     * @param cutpoint    The cutpoint to be selected.
     */
    @Then("User changes the Cutpoint to {string}")
    public void user_changes_the_cutpoint_to(String cutpoint) {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cutPointLocator).selectOption(cutpoint);
    }

    @Then("User changes the Cutpoint to optimal")
    public void user_changes_the_cutpoint_to_optimal() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cutPointLocator).selectOption("1");
    }

    @Then("Verify Cutpoint is coming next to Cohort and Model table headings")
    public void verify_cutpoint_is_coming_next_to_cohort_and_model_table_headings() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText("cut-point");
    }

    @Then("User downloads the plot")
    public void user_downloads_the_plot() {
        CommonUtils.sleep(2000);
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.toolTipLocator).click();
    }

    /**
     * Selected only CML checkbox.
     */
    @Then("User selects only CML checkbox only")
    public void user_selects_only_cml_checkbox_only() {
        JPSurvHomePagePlaywrightStepImp.selectOnlyCML();
    }

    /**
     * Selecting the start and end year from the dropdown.
     *
     * @param startYear    The startYear to be selected.
     * @param endYear      The endYear to be selected.
     */
    @Then("User clicks on recalculate after selecting calendar year from {string} to {string}")
    public void user_clicks_on_recalculate_after_selecting_calendar_year_from_to(String startYear, String endYear) {
        JPSurvHomePagePlaywrightStepImp.reCalculateAfterSelectingYear(startYear, endYear);
    }

    /**
     * Validating the text "Trend Measures for User Selected Years" availability on the page.
     */
    @Then("Verify the user is getting result after recalculating")
    public void verify_the_user_is_getting_result_after_recalculating() {
        JPSurvHomePagePlaywrightStepImp.assertText();
    }

    /**
     * Clicked on the "Accessibility" link and asserted it.
     */
    @Then("User clicks on the accessibility link and verify it")
    public void user_clicks_on_the_accessibility_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.accessibilityPage, JPSurvConstants.ACCESSIBILITY_LINK);
    }

    /**
     * Clicked on the "FOIA" link and asserted it.
     */
    @Then("User clicks on the FOIA link and verify it")
    public void user_clicks_on_the_foia_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.FOIAPage, JPSurvConstants.FOIA_LINK);
    }

    /**
     * Clicked on the "Division of Cancer Control and Population Sciences" link and asserted it.
     */
    @Then("User clicks on the cancer control link and verify")
    public void user_clicks_on_the_cancer_control_link_and_verify() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.cancerControl, JPSurvConstants.CANCER_CONTROL_LINK);
    }

    @Then("User clicks on death vs year at diagnosis")
    public void user_clicks_on_death_vs_year_at_diagnosis() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.deathVsYear).click();
    }

    /**
     * Verify the selected model labelled as "1 (final selected model)".
     *
     * @param model     The model to be selected.
     */
    @Then("Verify model is selected as {string}")
    public void verify_model_is_selected_as(String model) {
        assertThat(PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.modelLocator)).containsText(JPSurvConstants.MODEL_TEXT);
    }

    /**
     * Adding and removing interval under conditional survival calculation.
     */
    @Then("User adds and remove interval after clicking on the conditional survival calculation")
    public void user_adds_and_remove_interval_after_clicking_on_the_conditional_survival_calculation() {
        JPSurvHomePagePlaywrightStepImp.addAndRemoveInterval();
    }

    /**
     * Clicked on the "U.S. Department of Health and Human Services" link and asserted it.
     */
    @Then("User clicks on the HHS of US Department link and verify it")
    public void User_clicks_on_the_hhs_of_us_department_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.hhsLink, JPSurvConstants.HHS_LINK);
    }

    /**
     * Clicked on the "National Institutes of Health" link and asserted it.
     */
    @Then("User clicks on the NIH link and verify it")
    public void User_clicks_on_the_nih_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.NIHPage, JPSurvConstants.NIH_LINK);
    }

    /**
     * Clicked on the "National Cancer Institute" link and asserted it.
     */
    @Then("User clicks on the NCI link and verify it")
    public void User_clicks_on_the_nci_link_and_verify_it() {
        JPSurvHomePagePlaywrightStepImp.clickNCILinkAndVerify(JPSurvHomePagePlaywright.NCIPage, JPSurvConstants.NCI_LINK);
    }

    /**
     * Clicked on the "USA.gov" link and asserted it.
     */
    @Then("User clicks on the USA gov link and verify it")
    public void User_clicks_on_the_usa_gov_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.USAGov, JPSurvConstants.USA_GOV_LINK);
    }

    /**
     * Clicked on the "Disclaimer" link and asserted it.
     */
    @Then("User clicks on the Disclaimer link and verify it")
    public void user_clicks_on_the_disclaimer_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.Disclaimer, JPSurvConstants.DISCLAIMER_LINK);
    }

    /**
     * Clicked on the "HHS Vulnerability Disclosure" link and asserted it.
     */
    @Then("User clicks on the HHS Vulnerability Disclosure link and verify it")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.HHSVulnerability, JPSurvConstants.HHS_VULNERABILITY_URL);
    }

    /**
     * Clicked on the "National Cancer Institute" link and asserted it.
     */
    @Then("User clicks on the NCI link and verify it under div tag")
    public void user_clicks_on_the_nci_link_and_verify_it_under_div_tag() {
        JPSurvHomePagePlaywrightStepImp.clickNCILinkAndVerifyUnderDiv(JPSurvHomePagePlaywright.NCIPage, JPSurvConstants.NCI_LINK);
    }

    /**
     * Validating that page contains plot
     */
    @Then("Validate that result page contains plots")
    public void validate_that_result_page_contains_plots() {
        JPSurvHomePagePlaywrightStepImp.validatePlotCount();
    }

    /**
     * Calculated cohert and model specifications with Conditional Survival Model Using Truncated Data
     */
    @Then("User calculates cohert and model specifications with Conditional Survival Model Using Truncated Data")
    public void user_calculates_cohert_and_model_specifications_with_conditional_survival_model_using_truncated_data() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithCSM();
    }

    /**
     * Validating Conditional Survival Calculation button unavailability after calculation.
     */
    @Then("Validate Conditional Survival Calculation button is not available after calculation.")
    public void validate_conditional_survival_calculation_button_is_not_available_after_calculation() {
        JPSurvHomePagePlaywrightStepImp.validateCSCButtonNotAvailable();
    }

    /**
     * Calculated cohert and model specifications with Relax proportionality
     */
    @Then("User calculates cohert and model specifications with Relax proportionality")
    public void user_calculates_cohert_and_model_specifications_with_relax_proportionality() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithRelaxProportionality();
    }

    /**
     * Calculated cohert and model specifications with no options.
     */
    @Then("User calculates cohert and model specifications with No Options")
    public void user_calculates_cohert_and_model_specifications_with_no_options() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithNoOptions();
    }

    /**
     * Validating Conditional Survival Calculation button is available after calculation.
     */
    @Then("Validate Conditional Survival Calculation button is available after calculation.")
    public void validate_conditional_survival_calculation_button_is_available_after_calculation() {
        JPSurvHomePagePlaywrightStepImp.validateCSCButtonAvailable();
    }

    /**
     * Selecting relax proportionality checkbox after uploading the files.
     */
    @Then("User uploads files and adds other data with relax proportionality")
    public void user_uploads_files_and_adds_other_data_with_relax_proportionality() {
        JPSurvHomePagePlaywrightStepImp.uploadsFileAndSelectRelaxProportionality();
    }

    /**
     * Validating that cutpoint is selected with optimal value
     */
    @Then("Validate that cut point is already selected with optimum value")
    public void validate_that_cut_point_is_already_selected_with_optimum_value() {
        JPSurvHomePagePlaywrightStepImp.validateCutpointAlreadySelected();
    }

    /**
     * Asserting the text "Cut point" visibility.
     */
    @Then("Validate that cut point text is visible")
    public void validate_that_cut_point_text_is_visible() {
        JPSurvHomePagePlaywrightStepImp.validateSpecifiedText();
    }

    /**
     * Checking if Add Annotation button is visible and clickable
     */
    @And("Verify add annotation button is visible and clickable")
    public void verify_add_annotation_button_is_visible_and_clickable() {
        JPSurvHomePagePlaywrightStepImp.checkAddAnnotationButton();
    }

    /**
     * Click on the Add Annotation button
     */
    @Then("Click on the Add Annotation button")
    public void click_on_the_add_annotation_button() {
        PlaywrightUtils.page.locator("//*[@data-testid='MainPanel']//div[@role='tabpanel']//div//button[contains(text(),'+ Add Annotation')]").first().click();
    }

    /**
     * Click on Advanced options and changes the minimum year value
     *
     * @param minYear     The minYear to be selected.
     */
    @And("User clicks on the Advanced options and changes the entry to {string}")
    public void user_clicks_on_the_advanced_options_and_changes_the_entry_to(String minYear) {
        PlaywrightUtils.page.locator("//button[normalize-space()='Advanced Options']").click();
        PlaywrightUtils.page.locator("//input[@id='numbetwn']").fill("");
        PlaywrightUtils.page.locator("//input[@id='numbetwn']").fill(minYear);
    }

    /**
     * Reset the advanced option and validate the minimum year entry
     *
     * @param expectedMinYear     The expectedMinYear to be selected.
     */
    @Then("User clicks on the reset advanced options and validates entry is not {string}")
    public void user_clicks_on_the_reset_advanced_options_and_validates_entry_is_not(String expectedMinYear) {
        PlaywrightUtils.page.locator("//button[normalize-space()='Reset Advanced Options']").click();
        String minYear = PlaywrightUtils.page.locator("//input[@id='numbetwn']").inputValue();
        Assert.assertNotEquals(minYear, expectedMinYear);
        Assert.assertEquals(minYear, "2");
    }

    /**
     * User clicks on the model estimatess
     */
    @Then("User clicks on the model estimates")
    public void user_clicks_on_the_model_estimates() {
        PlaywrightUtils.page.locator("//ul//li//button[contains(text(),'Model Estimates')]").click();
    }

    /**
     * Asserting the specified text in the model estimates after calculation
     */
    @Then("Validates the model estimates contains mentioned texts")
    public void validates_the_model_estimates_contains_mentioned_texts() {
        String[] str = {" EstimatesJoinpoint 0", "ParameterEstimate (%)Standard Error (%)"};
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN).locator("//table//thead//tr")).containsText(str);
    }

    /**
     * Validating BIC text is displayed after calculations
     */
    @Then("Validate BIC text is been displayed after calculation")
    public void validate_bic_text_is_been_displayed_after_calculation() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN).locator("//th[normalize-space()='Bayesian Information Criterion (BIC)']")).containsText("Bayesian Information Criterion (BIC)");
    }

    /**
     * Selecting specification with NHL and relax proportionality checkboxes
     */
    @Given("User add specifications with NHL and Relax proportionality checkboxes")
    public void user_add_specifications_with_nhl_and_relax_proportionality_checkboxes() {
        JPSurvHomePagePlaywrightStepImp.addSpecificationWithNHLAndRelaxProportionality();
    }

    /**
     * Validating whether Relax Proportionality text is visible or not
     */
    @Then("Validate Relax Proportionality text is visible")
    public void validate_relax_proportionality_text_is_visible() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN).locator("//b[normalize-space()='Relax Proportionality']")).containsText("Relax Proportionality");
    }

    /**
     * Validating the title of all the column headings of the model table
     */
    @Then("Validate the title of all the columns of the model table after calculation")
    public void validate_the_title_of_all_the_columns_of_the_model_table_after_calculation() {
        JPSurvHomePagePlaywrightStepImp.columnTitleOfModelTable();
    }

    /**
     * Validating the title of all the column headings of the model table
     */
    @When("User calculates cohert and model specifications with joinpoints")
    public void user_calculates_cohert_and_model_specifications_with_joinpoints() {
        JPSurvHomePagePlaywrightStepImp.calculateWithJoinPoints();
    }

    /**
     * Validating the location column availability and value text under the location column
     */
    @Then("Validate location column is visible and final selected model has joinpoints location separated by commas")
    public void validate_location_column_is_visible_and_final_selected_model_has_joinpoints_location_separated_by_commas() {
        JPSurvHomePagePlaywrightStepImp.ValidateTextAndJoinPoints();
    }

    /**
     * calculating cohert and model specifications with given joinpoints
     *
     * @param joinpoint     The joinpoint to be selected.
     */
    @And("User calculates again cohert and model specifications with {string} joinpoints")
    public void user_calculates_again_cohert_and_model_specifications_with_joinpoints(String joinpoint) {
        JPSurvHomePagePlaywrightStepImp.calculateWithGivenJoinPoints(joinpoint);
    }

    /**
     * Validating location column value as None if selected join points is 0 before calculation
     *
     * @param none     The none text to be visible.
     */
    @Then("Validate location column is having text {string} as value")
    public void validate_location_column_is_having_text_as_value(String none) {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("None"))).containsText(none);
    }

    /**
     * Validating the title of specification section
     */
    @Then("validate the title for specification section")
    public void validate_the_title_for_specification_section() {
        assertThat(PlaywrightUtils.page.locator("//legend[@class='legend fw-bold legend-wrap']")).containsText("Cohort and Model Specifications");
    }

    /**
     * User clicks on the checkbox labelled as between join points
     */
    @Then("User clicks on the check box for between joinpoints")
    public void user_clicks_on_the_check_box_for_between_joinpoints() {
        PlaywrightUtils.page.locator("//input[@id='jpTrend']").click();
    }

    /**
     * Validating the recalculate button is enabled
     */
    @Then("Validate that recalculate button is enabled")
    public void validate_that_recalculate_button_is_enabled() {
        assertThat(PlaywrightUtils.page.locator("//form[@class='border rounded m-1']//div[@class='d-flex justify-content-center align-items-center col-sm-2']//button[@type='submit'][normalize-space()='Recalculate']")).isEnabled();
    }
}