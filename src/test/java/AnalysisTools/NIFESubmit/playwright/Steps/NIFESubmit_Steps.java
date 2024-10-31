package AnalysisTools.NIFESubmit.playwright.Steps;

import AnalysisTools.NIFESubmit.playwright.Pages.NIFESubmitPage;
import AnalysisTools.NIFESubmit.playwright.StepsImplementation.NIFESubmitStepsImpl;
import AnalysisTools.NIFESubmit.playwright.Utils.NIFESubmit_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getNifeUrl;

public class NIFESubmit_Steps extends PageInitializer {

    @Given("User navigates to the NIFE Website")
    public void user_navigates_to_the_nife_website() {
        PlaywrightUtils.page.navigate(getNifeUrl());
        CommonUtils.sleep(2000);
    }

    @Then("User clicks on the HOME tab")
    public void user_clicks_on_the_home_tab() {
        NIFESubmitStepsImpl.clickHomeTab();
    }

    @Then("Verify User is on the Home Tab")
    public void verify_user_is_on_the_home_tab() {
        assertThat(PlaywrightUtils.page).hasTitle(NIFESubmitPage.NIFEPageTitle);
    }

    @Then("User clicks on the Submit Metadata and View Images")
    public void User_clicks_on_the_submit_metadata_and_view_images() {
        NIFESubmitStepsImpl.clickSubmitMetadataAndViewImages();
    }

    @Then("User clicks on the SUBMIT METADATA tab")
    public void user_clicks_on_the_submit_metadata_tab() {
        PlaywrightUtils.page.locator(NIFESubmitPage.submitMetadataTab).click();
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
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.policiesPage, NIFESubmit_Constants.POLICIES_LINK);
    }

    @Then("User clicks on the VDPolicy link and verify it in NIFE")
    public void user_clicks_on_the_vd_policy_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.vdpolicy, NIFESubmit_Constants.VD_POLICY_LINK);
    }

    @Then("User clicks on the Accessibility link and verify it in NIFE")
    public void user_clicks_on_the_accessibility_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.accessibilityPage, NIFESubmit_Constants.ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the viewing file link and verify it in NIFE")
    public void user_clicks_on_the_viewing_file_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.viewingFileAccessibility, NIFESubmit_Constants.FILE_ACCESSIBILITY_LINK);
    }

    @Then("User clicks on the FIOS link and verify it in NIFE")
    public void user_clicks_on_the_fios_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.FOIAPage, NIFESubmit_Constants.FOIA_LINK);
    }

    @Then("User clicks on hhs link and verify it in NIFE")
    public void user_clicks_on_hhs_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.HHSPage, NIFESubmit_Constants.HHS_LINK);
    }

    @Then("User clicks on NIH link and verify it in NIFE")
    public void user_clicks_on_nih_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.NIHPage, NIFESubmit_Constants.NIH_LINK);
    }

    @Then("User clicks on NCI link and verify it in NIFE")
    public void user_clicks_on_nci_link_and_verify_it_in_NIFE() {
        NIFESubmitStepsImpl.verifyNCILink();
    }

    @Then("User clicks on USA gov link and verify it in NIFE")
    public void user_clicks_on_usa_gov_link_and_verify_it_in_NIFE() {
        Playwright_Common_Utils.clickAndAssertNewPage(NIFESubmitPage.USAGov, NIFESubmit_Constants.USA_GOV_LINK);
    }

    @Then("User clicks on the About tab")
    public void user_clicks_on_the_about_tab() {
        PlaywrightUtils.page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(NIFESubmitPage.aboutTab)).click();
    }

    @Then("User clicks on the links and verify the associated title")
    public void user_clicks_on_the_links_and_verify_the_associated_title() {
        NIFESubmitStepsImpl.clickAndAssertNewPageTitle();
    }

    @Then("User enters all the required details in study information section")
    public void user_enters_all_the_required_details_in_study_information_section() {
        NIFESubmitStepsImpl.enterRequiredDetails();
    }

    @Then("User clicks on the submit button in NIFESubmit")
    public void user_clicks_on_the_submit_button_in_NIFESubmit() {
        PlaywrightUtils.page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit").setExact(true)).click();
        CommonUtils.sleep(2000);
    }

    @Then("Verify the validation error message in the submit metadata tab")
    public void verify_the_validation_error_message_in_the_submit_metadata_tab() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(NIFESubmit_Constants.SUBMIT_BUTTON_ERROR_MESSAGE);
    }

    @Then("Verify metadata has been submitted successfully")
    public void verify_metadata_has_been_submitted_successfully() {
        assertThat(PlaywrightUtils.page.getByRole(AriaRole.MAIN)).containsText(NIFESubmit_Constants.SUBMIT_METADATA_SUCCESS_MESSAGE);
    }

    @Then("User clicks on the reset button")
    public void user_clicks_on_the_reset_button() {
        PlaywrightUtils.page.locator(NIFESubmitPage.resetButtonLocator).click();
    }

    @Then("Verify user is not able to submit metadata successfully")
    public void verify_user_is_not_able_to_submit_metadata_successfully() {
        NIFESubmitStepsImpl.verifyErrorMessageOnSubmmitAfterReset();
    }

    @Then("User downloads the metadata file using download button")
    public void user_downloads_the_metadata_file_using_download_button() {
        NIFESubmitStepsImpl.clickDownloadButton();
    }

    @Then("User clicks on the add biosample")
    public void user_clicks_on_the_add_biosample() {
        NIFESubmitStepsImpl.addBiosample();
    }

    @Then("User enters all the required details in the biosample section")
    public void user_enters_all_the_required_details_in_the_biosample_section() {
        NIFESubmitStepsImpl.addAllRequiredDetailsInBiosample();
    }

    @Then("User clicks on the NIFE IMAGE SERVER tab")
    public void user_clicks_on_the_nife_image_server_tab() {
        PlaywrightUtils.page.locator(NIFESubmitPage.nifeImageServer).click();
    }

    @Then("Verify User is on the OMERO login page")
    public void verify_user_is_on_the_omero_login_page() {
        assertThat(PlaywrightUtils.page).hasTitle(NIFESubmit_Constants.OMERO_PAGE_TITLE);
    }
}