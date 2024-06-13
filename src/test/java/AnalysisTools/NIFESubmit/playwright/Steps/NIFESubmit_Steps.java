package AnalysisTools.NIFESubmit.playwright.Steps;

import AnalysisTools.NIFESubmit.playwright.Pages.NIFESubmitPage;
import AnalysisTools.NIFESubmit.playwright.StepsImplementation.NIFESubmitStepsImpl;
import AnalysisTools.NIFESubmit.playwright.Utils.NIFESubmit_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NIFESubmit_Steps extends PageInitializer {

    @Given("User navigates to the NIFE Website")
    public void user_navigates_to_the_nife_website() {
        PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("NIFESubmit"));
        MiscUtils.sleep(2000);
    }

    @Then("User clicks on the HOME tab")
    public void user_clicks_on_the_home_tab() {
        NIFESubmitStepsImpl.clickHomeTab();
    }

    @Then("Verify User is on the Home Tab")
    public void verify_user_is_on_the_home_tab() {
        NIFESubmitStepsImpl.verifyTitle();
    }

    @Then("User clicks on the Submit Metadata and View Images")
    public void User_clicks_on_the_submit_metadata_and_view_images() {
        NIFESubmitStepsImpl.clickSubmitMetadataAndViewImages();
    }

    @Then("User clicks on the SUBMIT METADATA tab")
    public void user_clicks_on_the_submit_metadata_tab() {
        NIFESubmitStepsImpl.clickSubmitMetaData();
    }

    @Then("Verify User is on the SUBMIT METADATA Tab")
    public void verify_user_is_on_the_submit_metadata_tab() {
        NIFESubmitStepsImpl.verifySubmitMetadata();
    }

    @Then("User imports the excel file")
    public void user_imports_the_excel_file() {
        NIFESubmitStepsImpl.importExcelFile();
    }

    @Then("User clicks on policies link and verify it in NIFE")
    public void user_clicks_on_policies_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.policies, NIFESubmit_Constants.POLICIES_LINK);
    }

    @Then("User clicks on the VDPolicy link and verify it in NIFE")
    public void user_clicks_on_the_vd_policy_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.vdpolicy, NIFESubmit_Constants.VD_POLICY_LINK);
    }

    @Then("User clicks on the Accessibility link and verify it in NIFE")
    public void user_clicks_on_the_accessibility_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.accessibility, NIFESubmit_Constants.ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the viewing file link and verify it in NIFE")
    public void user_clicks_on_the_viewing_file_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.viewingFileAccessibility, NIFESubmit_Constants.FILE_ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the FIOS link and verify it in NIFE")
    public void user_clicks_on_the_fios_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.FOIA, NIFESubmit_Constants.FOIA_LINK);
    }

    @Then("User clicks on hhs link and verify it in NIFE")
    public void user_clicks_on_hhs_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.HHS, NIFESubmit_Constants.HHS_LINK);
    }

    @Then("User clicks on NIH link and verify it in NIFE")
    public void user_clicks_on_nih_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.NIH, NIFESubmit_Constants.NIH_LINK);
    }

    @Then("User clicks on NCS link and verify it in NIFE")
    public void user_clicks_on_ncs_link_and_verify_it_in_NIFE() {
        NIFESubmitStepsImpl.verifyNCILink();
    }

    @Then("User clicks on USA gov link and verify it in NIFE")
    public void user_clicks_on_usa_gov_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.USAGov, NIFESubmit_Constants.USA_GOV_LINK);
    }

    @Then("User clicks on the About tab")
    public void user_clicks_on_the_about_tab() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("About")).click();
    }

    @Then("User clicks on the links and verify the associated title")
    public void user_clicks_on_the_links_and_verify_the_associated_title() {
        NIFESubmitStepsImpl.clickAndAssertNewPageTitle();
    }
}