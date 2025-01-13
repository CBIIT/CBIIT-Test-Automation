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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getJpSurvUrl;

public class JPSurvHomePagePlaywrightSteps extends PageInitializer {

    @Given("User navigates to JPSurv home page")
    public void user_navigates_to_jp_surv_home_page() {
        PlaywrightUtils.page.navigate(getJpSurvUrl());
        CommonUtils.sleep(2000);
    }

    @Then("User uploads file in the homepage")
    public void user_uploads_file_in_the_homepage() {
        JPSurvHomePagePlaywrightStepImp.uploadFile();
    }

    @Then("User clicks on the see article links and validate the title")
    public void user_clicks_on_the_see_article_links_and_validate_the_title() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle("See article.", JPSurvConstants.SEE_DETAILS_PAGE_TITLE);
    }

    @Then("User clicks on the journal link and validate the title")
    public void user_clicks_on_the_journal_link_and_validate_the_title() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(JPSurvHomePagePlaywright.doiOrg,JPSurvConstants.DOI_ORG_PAGE_TITLE);
    }

    @Then("User clicks on the help tab in the JPOSurv website")
    public void user_clicks_on_the_help_tab_in_the_jpo_surv_website() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.helpTabElement).click();
    }

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

    @Then("User uploads CSV file in the homepage")
    public void user_uploads_csv_file_in_the_homepage() {
        JPSurvHomePagePlaywrightStepImp.uploadCSVFile();
    }

    @Then("User clicks on the Surveillance Research Program link")
    public void user_clicks_on_the_surveillance_research_program_link() {
        PlaywrightUtils.page.locator("//a[@title='JPSurv Home']").click();
    }

    @Then("Verify user is in the NCI Analysis Tools Home Page")
    public void verify_user_is_in_the_nci_analysis_tools_home_page() {
        assertThat(PlaywrightUtils.page).hasTitle(JPSurvConstants.NCI_ANALYSIS_HOMEPAGE_TITLE);
    }

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

    @Then("User enters {string} as job name and {string} as email in the notification section")
    public void user_enters_as_job_name_and_as_email_in_the_notification_section(String string, String string2) {
        JPSurvHomePagePlaywrightStepImp.enterJobNameAndEmail(string, string2);
    }

    @Then("Verify the data is submitted to the email")
    public void verify_the_data_is_submitted_to_the_email() {
        assertThat(PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.jobSubmitted)).containsText(JPSurvConstants.JOB_SUBMITTED_TEXT);
    }

    @Then("User selects both on the NHL and CML checkbox")
    public void user_selects_both_on_the_nhl_and_cml_checkbox() {
        JPSurvHomePagePlaywrightStepImp.selectBothNhLAndCHL();
    }

    @Then("User changes cohort from NHL to CML")
    public void user_changes_cohort_from_nhl_to_cml() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.selectCohort).selectOption("Chronic Myeloid Leukemia");
    }

    @Then("User checks the relax proportionality and selects the cutpoint {string}")
    public void user_checks_the_relax_proportionality_and_selects_the_cutpoint(String string) {
        JPSurvHomePagePlaywrightStepImp.checkRelaxProportionalityAndCutPoint(string);
    }

    @Then("User changes the Cutpoint to {string}")
    public void user_changes_the_cutpoint_to(String string) {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.cutPointLocator).selectOption(string);
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

    @Then("User selects only CML checkbox only")
    public void user_selects_only_cml_checkbox_only() {
        JPSurvHomePagePlaywrightStepImp.selectOnlyCML();
    }

    @Then("User clicks on recalculate after selecting calendar year from {string} to {string}")
    public void user_clicks_on_recalculate_after_selecting_calendar_year_from_to(String startYear, String endYear) {
        JPSurvHomePagePlaywrightStepImp.reCalculateAfterSelectingYear(startYear, endYear);
    }

    @Then("Verify the user is getting result after recalculating")
    public void verify_the_user_is_getting_result_after_recalculating() {
        JPSurvHomePagePlaywrightStepImp.assertText();
    }

    @Then("User clicks on the accessibility link and verify it")
    public void user_clicks_on_the_accessibility_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.accessibilityPage, JPSurvConstants.ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the FOIA link and verify it")
    public void user_clicks_on_the_foia_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.FOIAPage, JPSurvConstants.FOIA_LINK);
    }

    @Then("User clicks on the cancer control link and verify")
    public void user_clicks_on_the_cancer_control_link_and_verify() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.cancerControl, JPSurvConstants.CANCER_CONTROL_LINK);
    }

    @Then("User clicks on death vs year at diagnosis")
    public void user_clicks_on_death_vs_year_at_diagnosis() {
        PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.deathVsYear).click();
    }

    @Then("Verify model is selected as {string}")
    public void verify_model_is_selected_as(String model) {
        assertThat(PlaywrightUtils.page.locator(JPSurvHomePagePlaywright.modelLocator)).containsText(JPSurvConstants.MODEL_TEXT);
    }

    @Then("User adds and remove interval after clicking on the conditional survival calculation")
    public void user_adds_and_remove_interval_after_clicking_on_the_conditional_survival_calculation() {
        JPSurvHomePagePlaywrightStepImp.addAndRemoveInterval();
    }

    @Then("User clicks on the HHS of US Department link and verify it")
    public void User_clicks_on_the_hhs_of_us_department_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.hhsLink, JPSurvConstants.HHS_LINK);
    }

    @Then("User clicks on the NIH link and verify it")
    public void User_clicks_on_the_nih_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.NIHPage, JPSurvConstants.NIH_LINK);
    }

    @Then("User clicks on the NCI link and verify it")
    public void User_clicks_on_the_nci_link_and_verify_it() {
        JPSurvHomePagePlaywrightStepImp.clickNCILinkAndVerify(JPSurvHomePagePlaywright.NCIPage, JPSurvConstants.NCI_LINK);
    }

    @Then("User clicks on the USA gov link and verify it")
    public void User_clicks_on_the_usa_gov_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.USAGov, JPSurvConstants.USA_GOV_LINK);
    }

    @Then("User clicks on the Disclaimer link and verify it")
    public void user_clicks_on_the_disclaimer_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.Disclaimer, JPSurvConstants.DISCLAIMER_LINK);
    }

    @Then("User clicks on the HHS Vulnerability Disclosure link and verify it")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(JPSurvHomePagePlaywright.HHSVulnerability, JPSurvConstants.HHS_VULNERABILITY_URL);
    }

    @Then("User clicks on the NCI link and verify it under div tag")
    public void user_clicks_on_the_nci_link_and_verify_it_under_div_tag() {
        JPSurvHomePagePlaywrightStepImp.clickNCILinkAndVerifyUnderDiv(JPSurvHomePagePlaywright.NCIPage, JPSurvConstants.NCI_LINK);
    }

    @Then("Validate that result page contains plots")
    public void validate_that_result_page_contains_plots() {
        JPSurvHomePagePlaywrightStepImp.validatePlotCount();
    }

    @Then("User calculates cohert and model specifications with Conditional Survival Model Using Truncated Data")
    public void user_calculates_cohert_and_model_specifications_with_conditional_survival_model_using_truncated_data() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithCSM();
    }

    @Then("Validate Conditional Survival Calculation button is not available after calculation.")
    public void validate_conditional_survival_calculation_button_is_not_available_after_calculation() {
        JPSurvHomePagePlaywrightStepImp.validateCSCButtonNotAvailable();
    }

    @Then("User calculates cohert and model specifications with Relax proportionality")
    public void user_calculates_cohert_and_model_specifications_with_relax_proportionality() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithRelaxProportionality();
    }

    @Then("User calculates cohert and model specifications with No Options")
    public void user_calculates_cohert_and_model_specifications_with_no_options() {
        JPSurvHomePagePlaywrightStepImp.calculateCohertAndModelSpecificationWithNoOptions();
    }

    @Then("Validate Conditional Survival Calculation button is available after calculation.")
    public void validate_conditional_survival_calculation_button_is_available_after_calculation() {
        JPSurvHomePagePlaywrightStepImp.validateCSCButtonAvailable();
    }

    @Then("User uploads files and adds other data with relax proportionality")
    public void user_uploads_files_and_adds_other_data_with_relax_proportionality() {
        JPSurvHomePagePlaywrightStepImp.uploadsFileAndSelectRelaxProportionality();
    }

    @Then("Validate that cut point is already selected with optimum value")
    public void validate_that_cut_point_is_already_selected_with_optimum_value() {
        JPSurvHomePagePlaywrightStepImp.validateCutpointAlreadySelected();
    }

    @Then("Validate that cut point text is visible")
    public void validate_that_cut_point_text_is_visible() {
        JPSurvHomePagePlaywrightStepImp.validateSpecifiedText();
    }
}