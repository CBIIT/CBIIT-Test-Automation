package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.Pages.EgrantsSearchAndFileManagementScenariosPage;
import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import CustomBusiness.Egrants.Utils.Egrants_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EgrantsSearchAndFileManagementSteps extends PageInitializer {

    @Given("searches for {string}")
    public void searches_for(String grantSerial) {
       EgrantsStepImplementation.searches_for(grantSerial);
    }

    @Given("verifies the Project title as BAYLOR COLLEGE OF MEDICINE CANCER CENTER-CANCER CENTER SUPPO…")
    public void verifies_the_project_title_as_baylor_college_of_medicine_cancer_center_cancer_center_suppo() {
        EgrantsStepImplementation.verifies_the_project_title_as();
    }

    @Given("verifies the Institution name as BAYLOR COLLEGE OF MEDICINE")
    public void verifies_the_institution_name_as_baylor_college_of_medicine () {
        EgrantsStepImplementation.verifies_the_institution_name_as();
    }

    @Given("clicks on year {int}")
    public void clicks_on_year(Integer year) {
       EgrantsStepImplementation.clicks_on_year(year);
    }

    @Given("verifies {string} is the landed grant folder")
    public void verifies_is_the_landed_grant_folder(String landedGrantFolder) {
        EgrantsStepImplementation.verifies_is_the_landed_grant_folder(landedGrantFolder);
    }

    @Given("clicks on Add Document button")
    public void clicks_on_add_document_button() {
        EgrantsStepImplementation.clicks_on_add_document_button();
    }

    @Given("searches for grant {string}")
    public void searches_for_grant(String grantSerialNum) {
        EgrantsStepImplementation.searches_for_grant(grantSerialNum);
    }

    @Given("selects grant year 18")
    public void selects_grant_year_18() {
        EgrantsStepImplementation.selects_grant_year();
    }

    @Given("selects category as Application File")
    public void selects_category_as_application_file() {
        EgrantsStepImplementation.selects_category_as_application_file();
    }

    @Given("passes {string} as subcategory")
    public void passes_as_subcategory(String subCatText) {
        EgrantsStepImplementation.passes_as_subcategory(subCatText);
    }

    @Given("clicks on Locate File and Upload tab")
    public void clicks_on_locate_file_and_upload_tab() {
       EgrantsStepImplementation.clicks_on_locate_file_and_upload_tab();
    }

    @Given("uploads a file")
    public void uploads_a_file() {
        EgrantsStepImplementation.uploads_a_file();
    }

    @Then("verifies the success message {string}")
    public void verifies_the_success_message(String successMessage) {
       EgrantsStepImplementation.verifies_the_success_message(successMessage);
    }

    @Given("clicks on uploaded document")
    public void clicks_on_uploaded_document() {
        EgrantsStepImplementation.clicks_on_uploaded_document();
    }

    @When("selects grant year 18 from Years")
    public void selects_year_18() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.year18);
        MiscUtils.sleep(2000);
    }

    @When("clicks on update icon")
    public void clicks_on_update_icon() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.gearIcon);
        MiscUtils.sleep(2000);
    }

    @When("selects Funding from Category dropdown")
    public void selects_from_category_dropdown() {
        EgrantsStepImplementation.selects_funding_category();
    }

    @When("selects Transition Approval as Subcategory")
    public void selects_as_subcategory_and_date() {
        EgrantsStepImplementation.selects_transition_approval_subCategory_and_date();
    }

    @Then("clicks on update icon to submit the changes")
    public void clicks_on_update_icon_to_submit_the_changes() {
        EgrantsStepImplementation.click_on_update_document_category_button();
    }

    @When("clicks on Replace icon")
    public void clicks_on_replace_icon() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.replaceButton);
    }
    @Then("clicks on Check Document button to view the uploaded document")
    public void clicks_on_check_document_button_to_verify_the_uploaded_document() {
        EgrantsStepImplementation.clicks_on_uploaded_document();
    }

    @Given("expands the document details and clicks on Delete button")
    public void expands_the_document_details_and_clicks_on_delete_button() {
        EgrantsStepImplementation.expand_document_rows();
    }

    @Then("clicks on OK button to confirm Deletion")
    public void clicks_on_ok_button_to_confirm_deletion() {
        EgrantsStepImplementation.confirm_document_deletion();
    }

    @Given("clicks on Institutional Files menu")
    public void clicks_on_institutional_files_menu() {
        EgrantsStepImplementation.user_clicks_on_institutional_files();
    }

    @Given("clicks on AAVOGEN, INC.")
    public void clicks_on_aavogen_inc() {
        EgrantsStepImplementation.user_selects_aavogen();
    }

    @Given("clicks on Create New Document link")
    public void clicks_on_create_new_document_link() {
        EgrantsStepImplementation.clicks_on_create_new_document_link();
    }

    @Given("selects Organization Document from category dropdown")
    public void selects_organization_document_from_category_dropdown() {
        EgrantsStepImplementation.selects_organization_document_from_category_dropdown();
    }

    @Given("provides {string} as a subcategory")
    public void provides_as_a_subcategory(String subCategory) {
        EgrantsStepImplementation.provides_as_a_subcategory(subCategory);
    }

    @Then("clicks on Create New button")
    public void clicks_on_create_new_button() {
        EgrantsStepImplementation.clicks_on_create_new_button();
    }

    @Given("searches for {string} on Add New Document page")
    public void searches_for_on_add_new_document_page(String grantNum) {
        EgrantsStepImplementation.searches_for_grant_on_add_document_page(grantNum);
    }

    @Given("clicks Update icon for an uploaded Organization Document")
    public void clicks_update_icon_for_an_uploaded_organization_document() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.updateIconInstitutionalFiles);
        CucumberLogUtils.logScreenshot();
    }

    @Given("selects Follow-Up as the new category")
    public void selects_follow_up_as_the_new_category() {
        CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.documentCategoryDropdown, Egrants_Constants.FOLLOWUP_CATEGORY);
        CucumberLogUtils.logScreenshot();
     }

    @Given("enters Follow-up facility visit Test as subcategory")
    public void enters_new_subcategory() {
        EgrantsStepImplementation.enters_subcategory_for_institutional_file();
    }

    @Then("clicks on Save Update button")
    public void clicks_on_save_update_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.saveUpdateButton);
        CucumberLogUtils.logScreenshot();
    }

    @Given("clicks on Delete button to delete an uploaded document")
    public void clicks_on_delete_button_for_an_uploaded_organization_document() {
        EgrantsStepImplementation.click_on_delete_button_institutional_files();
    }
}