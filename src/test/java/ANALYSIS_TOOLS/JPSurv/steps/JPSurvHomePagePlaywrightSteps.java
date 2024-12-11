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
}