package AnalysisTools.Soccer.playwright.Steps;

import AnalysisTools.Soccer.playwright.Pages.SoccerPage;
import AnalysisTools.Soccer.playwright.StepsImplementation.SoccerStepsImpl;
import AnalysisTools.Soccer.playwright.Utils.Soccer_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Soccer_Steps extends PageInitializer {

    @Given("User navigates to soccer home page")
    public void user_navigates_to_soccer_home_page() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
    }

    @Then("User click on run soccer button")
    public void user_click_on_run_soccer_button() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(SoccerPage.run_Soccer_Button)).click();
    }

    @Then("verify that user is on soccer page")
    public void verify_that_user_is_on_soccer_page() {
        assertThat(PlaywrightUtils.page).hasTitle(SoccerPage.soccer_Page_Title);
    }

    @Then("user click on the doi link")
    public void user_click_on_the_doi_link() {SoccerStepsImpl.clickDOILink();
    }

    @Then("verify that user is on oxford Academic page")
    public void verify_that_user_is_on_oxford_Academic_page() {SoccerStepsImpl.validateOxfordAcademicTab();
    }

    @Then("User click on model button")
    public void user_click_on_model_button() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.models_Button)).click();
    }

    @Then("verify that graph is getting displayed in model page")
    public void verify_graph_on_model_page() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(SoccerPage.graphs_Model))).isVisible();
    }

    @When("User click on socassign button")
    public void user_click_on_socassign_button() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.socassign_Button)).click();
    }

    @Then("User is able to click download button and download socassign jar file")
    public void User_is_able_to_click_download_button_and_download_socassign_jar_file() {SoccerStepsImpl.DownloadSocAssignJarFile();
    }

    @Then("User is able to click socassign and download jnlp file")
    public void User_is_able_to_click_socassign_and_download_jnlp_file() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.SOCAssignDownloadLink)).click();
    }

    @When("User click on resources button")
    public void user_click_on_resources_button() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.resources_Button)).click();
    }

    @Then("verify that all the hyperlinks are clickable and navigating to respective page.")
    public void verify_that_all_the_hyperlinks_are_clickable_and_navigating_to_respective_page() {SoccerStepsImpl.clickOnAllHyperlinksAndVerify();
    }

    @Then("user click on the doi link in models page")
    public void user_click_on_the_doi_link_in_models_page() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(SoccerPage.doi_Link)).click();
    }

    @Then("User click on the computer based coding link and verify it")
    public void User_click_on_the_computer_based_coding_link_and_verify_it() {SoccerStepsImpl.clickOnComputerBasedCodingLink();
    }

    @When("User click on help button")
    public void user_click_on_help_button() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.help_Button)).click();
    }

    @Then("verify that user is able to navigate to {int} different soccer section in help page")
    public void verify_that_user_is_able_to_navigate_to_different_soccer_section_in_help_page(Integer int1) {SoccerStepsImpl.validateAllSections(int1);
    }

    @Then("User click on FAQ button")
    public void User_click_on_FAQ_button() {
        PlaywrightUtils.page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(SoccerPage.FAQPage)).click();
    }

    @Then("verify that user is on the FAQ Page")
    public void Verify_That_User_Is_On_The_FAQ_Page() {
        assertThat(PlaywrightUtils.page.getByLabel(SoccerPage.FAQPage).getByRole(AriaRole.HEADING)).containsText(SoccerPage.FAQText);
    }

    @Then("User click on Soccer button")
    public void user_click_on_soccer_button() {SoccerStepsImpl.clickSoccerButton();
    }

    @Then("User choose a file and upload it")
    public void user_choose_a_file_and_upload_it() {SoccerStepsImpl.uploadFile();
    }

    @Then("User click on Submit button")
    public void user_click_on_submit_button() {SoccerStepsImpl.clickSubmitButton();
    }

    @Then("verify the result has graph plots")
    public void verify_the_result_has_graph_plots() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName(SoccerPage.resultPlots))).isVisible();
    }

    @Then("User download the results by clicking on Download Results")
    public void user_download_the_results_by_clicking_on_download_results() {SoccerStepsImpl.clickDownloadResults();
    }

    @Then("User selects first version of model")
    public void user_selects_first_version_of_model() {SoccerStepsImpl.selectFirstVersion();
    }

    @Then("User clicks on the job to add in the queue and enters the email")
    public void user_clicks_on_the_job_to_add_in_the_queue_and_enters_the_email() {SoccerStepsImpl.clicksOnJobCheckBoxAndAddsEmail();
    }

    @Then("Verify job has been submitted")
    public void verify_job_has_been_submitted() {SoccerStepsImpl.verifyJobSubmitted();
    }

    @Then("User clicks on policies link and verify it")
    public void user_clicks_on_policies_link_and_verify_it() {
        Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.policies, Soccer_Constants.POLICIES_LINK);
    }

    @Then("User clicks on the VDPolicy link and verify it")
    public void user_clicks_on_the_vd_policy_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.vdpolicy, Soccer_Constants.VD_POLICY_LINK);
    }

    @Then("User clicks on the Accessibility link and verify it")
    public void user_clicks_on_the_accessibility_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.accessibility, Soccer_Constants.ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the viewing file link and verify it")
    public void user_clicks_on_the_viewing_file_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.viewingFileAccessibility, Soccer_Constants.FILE_ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the FIOS link and verify it")
    public void user_clicks_on_the_fios_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.FOIA, Soccer_Constants.FOIA_LINK);
    }

    @Then("User clicks on hhs link and verify it")
    public void user_clicks_on_hhs_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.HHS, Soccer_Constants.HHS_LINK);
    }

    @Then("User clicks on NIH link and verify it")
    public void user_clicks_on_nih_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.NIH, Soccer_Constants.NIH_LINK);
    }

    @Then("User clicks on NCI link and verify it")
    public void user_clicks_on_nci_link_and_verify_it() {Playwright_Common_Utils.clickAndAssertNewPage(SoccerPage.NCI, Soccer_Constants.NCI_LINK);
    }

    @Then("User clicks on USA gov link and verify it")
    public void user_clicks_on_usa_gov_link_and_verify_it() {SoccerStepsImpl.verifyUSAgovLink();
    }
}