package ANALYSIS_TOOLS.FORGEdb.playwright.steps;

import ANALYSIS_TOOLS.FORGEdb.playwright.pages.FORGEdbPage;
import ANALYSIS_TOOLS.FORGEdb.playwright.stepsImplementation.FORGEdbStepsImpl;
import ANALYSIS_TOOLS.FORGEdb.playwright.utils.FORGEdb_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getFORGEdbUrl;

public class FORGEdb_Steps extends PageInitializer {

    @Given("User navigates to the FORGEdb Website")
    public void user_navigates_to_the_forg_edb_website() {
        PlaywrightUtils.page.navigate(getFORGEdbUrl());
        CommonUtils.sleep(2000);
    }

    @Then("User clicks on the HOME tab in FORGEdb")
    public void user_clicks_on_the_home_tab_in_forg_edb() {
        FORGEdbStepsImpl.clickHomeTabInForgedb();
    }

    @Then("Verify User is on the Home tab")
    public void verify_user_is_on_the_home_tab() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(FORGEdbPage.forgedbText);
    }

    @Then("User clicks on the Genome Biology link and verify it")
    public void user_clicks_on_the_genome_biology_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.genomeLocator, FORGEdb_Constants.GENOME_BIOLOGY_PAGE_TITLE);
    }

    @Then("User clicks on the example analysis")
    public void user_clicks_on_the_example_analysis() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(FORGEdbPage.exampleAnalysis)).click();
    }

    @Then("User clicks on genome link and verify it.")
    public void user_clicks_on_genome_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.ucscGenome, FORGEdb_Constants.UCSC_GENOME_PAGE_TITLE);
    }

    @Then("User clicks on FORGEdb score link")
    public void user_clicks_on_forg_edb_score_link() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(FORGEdbPage.forgedbScore)).click();
    }

    @Then("Verify user is on the explore tab")
    public void verify_user_is_on_the_explore_tab() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(FORGEdbPage.summaryText);
    }

    @Then("User enters the rsid in the search box")
    public void user_enters_the_rsid_in_the_search_box() {
        PlaywrightUtils.page.locator(FORGEdbPage.searchBox).fill(FORGEdbPage.rsid);
    }

    @Then("User clicks on the search button")
    public void user_clicks_on_the_search_button() {
        PlaywrightUtils.page.locator(FORGEdbPage.searchButton).click();
    }

    @Then("Verify search query has given the results on the explore tab")
    public void verify_search_query_has_given_the_results_on_the_explore_tab() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(FORGEdbPage.searchResult);
    }

    @Then("User clicks on the explore tab")
    public void user_clicks_on_the_explore_tab() {
        PlaywrightUtils.page.locator(FORGEdbPage.exploreButton).click();
    }

    @Then("User enters text in the search box of explore tab")
    public void user_enters_text_in_the_search_box_of_explore_tab() {
        PlaywrightUtils.page.locator(FORGEdbPage.enterTextInExploreSearch).fill(FORGEdbPage.rsid);
    }

    @Then("User clicks on the search button in explore tab")
    public void user_clicks_on_the_search_button_in_explore_tab() {
        PlaywrightUtils.page.locator(FORGEdbPage.searchButtonInExploreTab).click();
    }

    @Then("User clicks on the about tab in the FORGEdb website")
    public void user_clicks_on_the_about_tab_in_the_forg_edb_website() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("About")).click();
    }

    @Then("User clicks on the image in about tab")
    public void user_clicks_on_the_image_in_about_tab() {
        PlaywrightUtils.page.getByAltText(FORGEdbPage.imgAttribute).click();
    }

    @Then("Verify the FORGEdb result text in the about tab")
    public void verify_the_forg_edb_result_text_in_the_about_tab() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.ARTICLE)).containsText(FORGEdb_Constants.FORGEDB_RESULT_TEXT);
    }

    @Then("Verify user is on the about tab in the FORGEdb website")
    public void verify_user_is_on_the_about_tab_in_the_forg_edb_website() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.ARTICLE)).containsText(FORGEdbPage.aboutTabText);
    }

    @Then("User clicks on the FORGE2 link and then click on run button")
    public void user_clicks_on_the_forge2_link() {
        FORGEdbStepsImpl.clickForge2LinkAndRunButton();
    }

    @Then("User clicks on the division of cancer link and verify title of it")
    public void user_clicks_on_the_division_of_cancer_link_and_verify_title_of_it() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.divisionOfCancer, FORGEdb_Constants.DIVISION_OF_CANCER_PAGE_TITLE);
    }

    @Then("User clicks on the youtube link for specific scores explanation")
    public void user_clicks_on_the_youtube_link_for_specific_scores_explanation() {
        Playwright_Common_Utils.clickAndAssertNewPage(FORGEdbPage.here, FORGEdb_Constants.YOUTUBE_LINK_SPECIFIC_SCORES);
    }

    @Then("User clicks on the Accessibility link and verify the opened page")
    public void user_clicks_on_the_accessibility_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.accessibility, FORGEdb_Constants.ACCESSIBILITY_PAGE_TITLE);
    }

    @Then("User clicks on the Disclaimer link and verify the opened page")
    public void user_clicks_on_the_disclaimer_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.disclaimer, FORGEdb_Constants.DISCLAIMER_PAGE_TITLE);
    }

    @Then("User clicks on the FOIA link and verify the opened page")
    public void user_clicks_on_the_foia_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.foia, FORGEdb_Constants.FOIA_PAGE_TITLE);
    }

    @Then("User clicks on the HHS Vulnerability Disclosure link and verify the opened page")
    public void user_clicks_on_the_hhs_vulnerability_disclosure_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.hhs, FORGEdb_Constants.HHS_PAGE_TITLE);
    }

    @Then("User clicks on the US Department of Health link and verify the opened page")
    public void user_clicks_on_the_us_department_of_health_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.healthDept, FORGEdb_Constants.HEALTH_DEPARTMENT_PAGE_TITLE);
    }

    @Then("User clicks on the NIH link and verify the opened page")
    public void user_clicks_on_the_nih_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.nih, FORGEdb_Constants.NIH_PAGE_TITLE);
    }

    @Then("User clicks on the NCI link and verify the opened page")
    public void user_clicks_on_the_nci_link_and_verify_the_opened_page() {
        FORGEdbStepsImpl.clickNCILinkAndVerify();
    }

    @Then("User clicks on the USA gov link and verify the opened page")
    public void user_clicks_on_the_usa_gov_link_and_verify_the_opened_page() {
        Playwright_Common_Utils.clickAndAssertNewPageTitle(FORGEdbPage.usagov, FORGEdb_Constants.USA_GOV_PAGE_TITLE);
    }

    @Given("User is able to set the env for all versioned datasets request")
    public void user_is_able_to_set_the_env_for_all_versioned_datasets_request() {
       FORGEdbStepsImpl.setApiBaseUrlForAllVersionedDataset();
    }

    @Then("User is able to send request and receive valid response back for FORGEdb Api for all versioned datasets")
    public void user_is_able_to_send_request_and_receive_valid_response_back_for_forg_edb_api_for_all_versioned_datasets() {
        FORGEdbStepsImpl.verifyAPIResponseForAllVersionedDataset();
    }

    @Given("User is able to set the env for a versioned dataset request")
    public void user_is_able_to_set_the_env_for_a_versioned_dataset_request() {
        FORGEdbStepsImpl.setBaseUrlForADataSet();
    }

    @Then("User is able to send request and receive valid response of the schema for a versioned dataset")
    public void user_is_able_to_send_request_and_receive_valid_response_of_the_schema_for_a_versioned_dataset() {
        FORGEdbStepsImpl.verifyAPIResponseForADataset();
    }

    @Given("User is able to set the env for a versioned dataset for an rsid request")
    public void user_is_able_to_set_the_env_for_a_versioned_dataset_for_an_rsid_request() {
        FORGEdbStepsImpl.setBaseUrlForAVersionedDataSetForAnRSID();
    }

    @Then("User is able to send request and receive valid response back for a versioned dataset for an rsid request")
    public void user_is_able_to_send_request_and_receive_valid_response_back_for_a_versioned_dataset_for_an_rsid_request() {
        FORGEdbStepsImpl.verifyAPIResponseForAVersionedDataSetForAnRSID();
    }
}