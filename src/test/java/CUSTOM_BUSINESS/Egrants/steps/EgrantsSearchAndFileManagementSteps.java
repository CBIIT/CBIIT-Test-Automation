package CUSTOM_BUSINESS.Egrants.steps;

import CUSTOM_BUSINESS.Egrants.stepsImplementation.EgrantsStepImplementation;
import CUSTOM_BUSINESS.Egrants.utils.Egrants_CommonUtils;
import CUSTOM_BUSINESS.Egrants.utils.Egrants_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import static Hooks.Hooks.softAssert;

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

    @Given("selects a replacement file")
    public void selects_a_replacement_file() {
        EgrantsStepImplementation.replaces_a_file();
    }

    @Then("verifies the success message {string}")
    public void verifies_the_success_message(String successMessage) {
       EgrantsStepImplementation.verifies_the_success_message(successMessage);
    }

    /**
     * This method is used to click on Check Document button
     */
    @Given("clicks on uploaded document")
    public void clicks_on_uploaded_document() {
        EgrantsStepImplementation.clicks_on_uploaded_document();
    }

    /**
     * This method is used to click on year 18 from the Years
     */
    @When("selects grant year 18 from Years")
    public void selects_year_18() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.year18);
        CommonUtils.sleep(2000);
    }

    /**
     * This method is used to click on Update icon
     */
    @When("clicks on update icon")
    public void clicks_on_update_icon() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.gearIcon);
        CommonUtils.sleep(2000);
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

    /**
     * This method is used to click on Replace icon
     */
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

    /**
     * This method is used to click on update icon for an uploaded Organization Document
     */
    @Given("clicks Update icon for an uploaded Organization Document")
    public void clicks_update_icon_for_an_uploaded_organization_document() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.updateIconInstitutionalFiles);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select Follow-Up as the new category
     */
    @Given("selects Follow-Up as the new category")
    public void selects_follow_up_as_the_new_category() {
        CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.documentCategoryDropdown, Egrants_Constants.FOLLOWUP_CATEGORY);
        CucumberLogUtils.logScreenshot();
     }

    @Given("enters Follow-up facility visit Test as subcategory")
    public void enters_new_subcategory() {
        EgrantsStepImplementation.enters_subcategory_for_institutional_file();
    }

    /**
     * This method is used to click on Save Update button to save the changes
     */
    @Then("clicks on Save Update button")
    public void clicks_on_save_update_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.saveUpdateButton);
        CucumberLogUtils.logScreenshot();
    }

    @Given("clicks on Delete button to delete an uploaded document")
    public void clicks_on_delete_button_for_an_uploaded_organization_document() {
        EgrantsStepImplementation.click_on_delete_button_institutional_files();
    }

    @Given("selects create grant year from Grant dropdown")
    public void selects_create_grant_year_from_grant_dropdown() {
        EgrantsStepImplementation.selects_create_grant_year();
    }

    @Given("selects type {int} as the grant type")
    public void selects_type_as_the_grant_type(Integer type) {
        EgrantsStepImplementation.selects_application_type(type);
    }

    @Given("selects P30 as the activity code")
    public void selects_p30_as_the_activity_code() {
        EgrantsStepImplementation.selects_activity_code();
    }

    @Given("enters {int} as the Year")
    public void enters_as_the_year(Integer year) {
        EgrantsStepImplementation.enters_grant_year();
    }

    @Given("enters S1 as the Suffix Code")
    public void enters_s1_as_the_suffix_code() {
        EgrantsStepImplementation.enters_suffix_code();
    }

    /**
     * This method is used to click on Create New button to create grant year
     */
    @Given("clicks on Create New button to create grant year")
    public void clicks_on_create_new_button_to_create_grant_year() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.createNewGrantYearButton);
        CucumberLogUtils.logScreenshot();
    }

    @Then("verifies the grant year is created")
    public void verifies_the_grant_year_is_created() {
        EgrantsStepImplementation.verifies_the_created_grant_year();
    }

    /**
     * This method is used to activate audit file download mode
     */
    @Given("activates the download mode")
    public void activates_the_download_mode() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.resourcesMenu);
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.auditFileDownloadMode);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select year 18S1 from the Years
     */
    @Given("selects grant year 18S1 from Years")
    public void selects_grant_year_18s1_from_years() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.year18S1);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select all the files within the grant folder
     */
    @Given("selects all files within the grant folder")
    public void selects_all_files_within_the_grant_folder() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.checkAllCheckbox);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Download button
     */
    @Given("clicks on Download button")
    public void clicks_on_download_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.downloadButton);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to verify the success icon for downloaded files
     */
    @Then("verifies the success icon for downloaded files")
    public void verifies_the_success_icon_for_downloaded_files() {
        EgrantsStepImplementation.verifies_the_success_message_for_downloaded_files();
    }

    /***
     * This method is used to select the number of years text box
     * @param year
     */
    @Given("selects {int} for number grant years")
    public void selects_for_number_grant_years(Integer year) {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.numberOfYearsTextBox);
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.numberOfYearsTextBox, year.toString());
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to click on the Category filter icon to select document types
     */
    @Given("clicks on category filter icon")
    public void clicks_on_category_filter_icon() {
       CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.categoryFilterIcon);
       CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to select Activation Notice and Application File from the list of available documents
     */
    @Given("selects Activation Notice and Application File from the category dropdown")
    public void selects_activation_notice_and_application_file_from_the_category_dropdown() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.activationNoticeCategory);
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.ApplicationFileCategory);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to click on the search icon to filter the documents
     */
    @Given("clicks on search icon")
    public void clicks_on_search_icon() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.searchIcon);
    }

    /***
     * This method is used to verify the filtered documents are displayed
     */
    @Then("verifies the filtered documents are displayed")
    public void verifies_the_filtered_documents_are_displayed() {
        softAssert.assertTrue(egrantsSearchandFileManagementScenariosPage.getActivationNoticeCategoryText.getText().contains(Egrants_Constants.ACTIVATION_NOTICE), "*** ACTIVATION NOTICE TEXT IS NOT PRESENT ***");
        softAssert.assertTrue(egrantsSearchandFileManagementScenariosPage.getApplicationFileCategoryText.getText().contains(Egrants_Constants.APPLICATION_FILE), "*** APPLICATION FILE TEXT IS NOT PRESENT ***");
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to click on the Update icon for a document
     */
    @Given("clicks on Update icon for a document")
    public void clicks_on_update_icon_for_an_application_file() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.gearIcon);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to select year 17 from the Grants dropdown. The user will keep selecting the year until it is selected
     */
    @Given("selects grant year 5P30CA125123-17 from the Grant dropdown")
    public void selects_grant_year_from_the_grant_dropdown() {
        Select grantsDropdown = new Select(egrantsSearchandFileManagementScenariosPage.grantsDropdown);
        boolean isSelected = false;
        while (!isSelected) {
            grantsDropdown.selectByVisibleText(Egrants_Constants.YEAR_17);
            CommonUtils.sleep(3000);
            String selectedOption = grantsDropdown.getFirstSelectedOption().getText();
            if (selectedOption.equals(Egrants_Constants.YEAR_17)) {
                isSelected = true;
            }
        }
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to select the current date
     */
    @Given("selects the current date")
    public void selects_the_current_date() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.calendar);
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.calendar, Egrants_CommonUtils.getCurrentDate());
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.datePicker);
        CucumberLogUtils.logScreenshot();
    }

    /***
     * This method is used to click on the Update button to move the document to a different grant year
     */
    @Then("clicks on Update button to move the document to a different grant year")
    public void clicks_on_update_button_to_move_the_document_to_a_different_grant_year() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.updateButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Expand All Grant Years button
     */
    @And("expands all grant years")
    public void expands_all_grant_years() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.expandAllGrantYearsButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on year 18 from the Years
     */
    @When("selects grant year 18 from list of Years")
    public void selects_expanded_grant_year_18() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.grantYear18);
        CommonUtils.sleep(2000);
    }

    /**
     * This method is used to click on Add Funding Document button
     */
    @And("clicks on Add Funding Document button")
    public void clicks_on_add_funding_document_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addFundingDocumentButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select Co-Funding Secondary as the document category
     */
    @And("selects category as Co-Funding Secondary")
    public void selects_category_as_co_funding_secondary() {
        CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.documentCategoryDropdown, 0);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to enter the subcategory text
     * @param subCategory
     */
    @And("passes {string} as Funding Subcategory")
    public void passes_as_funding_subcategory(String subCategory) {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.fundingSubCategory);
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.fundingSubCategory, subCategory);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Supplement sandbox on the grant header. The user will keep clicking on the button until it is clicked
     */
    @And("clicks on Supplement sandbox on the grant header")
    public void clicks_on_supplement_sandbox_on_the_grant_header() {
        boolean isClicked = false;
        int attempts = 0;
        while (!isClicked && attempts < 3) {
            try {
                CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.supplementSandBox);
                isClicked = true;
            } catch (Exception e) {
                attempts++;
                CommonUtils.sleep(2000);
            }
        }
        if (!isClicked) {
            throw new RuntimeException("*** FAILED TO CLICK ON SUPPLEMENT SANDBOX BUTTON AFTER 3 ATTEMPTS ***");
        }
        CommonUtils.switchToNextWindow();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select the Application File from the list
     */
    @And("selects the Application File from the list")
    public void selects_the_application_file_from_the_list() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.supplementApplicationFileCheckbox);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select Pay in Parent from Process Type dropdown
     */
    @And("selects Pay in Parent from Process Type dropdown")
    public void selects_pay_in_parent_from_process_type_dropdown() {
        CommonUtils.selectDropDownValue(egrantsSearchandFileManagementScenariosPage.processTypeDropdown, 2);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Move to Parent button to move the application
     */
    @Then("clicks on Move to Parent button to move the application")
    public void clicks_on_move_to_parent_button_to_move_the_application() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.moveToParentButton);
        Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Year 17S1 from the list of Years
     */
    @And("selects grant year 17S1 from list of Years")
    public void selects_grant_year_17s1_from_list_of_years() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.grantYear17S1);
        CommonUtils.sleep(900);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on the Add Request Name button
     */
    @And("clicks on Add Request Name button")
    public void clicks_on_add_request_name_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.addRequestNameButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to provide a label for the request name
     * @param automated
     */
    @And("provides {string} as the label")
    public void provides_as_the_label(String automated) {
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.requestNameTextBox, automated);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Save Request Name button
     */
    @And("clicks on Save Request Name button")
    public void clicks_on_save_request_name_button() {
       CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.requestNameSaveButton);
         CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to verify the added label
     */
    @Then("verifies the added label")
    public void verifies_the_added_label() {
        String addedLabel = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.labelText);
        softAssert.assertTrue(egrantsSearchandFileManagementScenariosPage.labelText.getText().contains(addedLabel), "*** REQUEST NAME TEXT DOES NOT MATCH ***");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Edit Request Name button
     */
    @And("clicks on Edit Edit Request Name button")
    public void clicks_on_edit_edit_request_name_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.editRequestNameButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to provide a new label for the request name
     * @param newLabel
     */
    @And("provides new {string} as the label")
    public void provides_new_as_the_label(String newLabel) {
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.requestNameTextBox, newLabel);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Save Request Name button
     */
    @Then("verifies the edited label")
    public void verifies_the_edited_label() {
        String editedLabel = CommonUtils.getText(egrantsSearchandFileManagementScenariosPage.labelText);
        softAssert.assertTrue(egrantsSearchandFileManagementScenariosPage.labelText.getText().contains(editedLabel), "*** REQUEST NAME TEXT DOES NOT MATCH ***");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Delete button to delete the label
     */
    @Then("clicks on Delete button to delete the label")
    public void clicks_on_delete_button_to_delete_the_label() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.requestNameDeleteButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select Supplement from the dropdown
     */
    @And("User selects Supplements from the dropdown")
    public void user_selects_supplements_from_the_dropdown() {
        CommonUtils.clickOnElement(egrantsQuickLinkAndManagementMenuPage.menuOptions);
        CommonUtils.selectDropDownValue(egrantsQuickLinkAndManagementMenuPage.menuOptions, Egrants_Constants.SUPPLEMENT);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on the Edit Notification button
     */
    @And("the user clicks on Edit button")
    public void the_user_clicks_on_edit_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.editButtonSupplementNotification);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to select the PA field
     * @param paNumber
     */
    @And("the user provides {string} in the PA field")
    public void the_user_provides_in_the_pa_field(String paNumber) {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.paTextField);
        CommonUtils.sendKeys(egrantsSearchandFileManagementScenariosPage.paTextField, paNumber);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on Save button and confirm the changes
     */
    @Then("the user clicks on Save button and confirms the changes")
    public void the_user_clicks_on_save_button_and_confirms_the_changes() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.saveButtonSupplementNotification);
        Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on the eRA Notification tab
     */
    @Given("the user clicks on eRA Notificaton tab")
    public void the_user_clicks_on_e_ra_notificaton_tab() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.eRANotificationTab);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to click on the Delete button and accept the alert if prompted more than once
     */
    @And("the user clicks on Delete button")
    public void the_user_clicks_on_delete_button() {
        CommonUtils.clickOnElement(egrantsSearchandFileManagementScenariosPage.deleteButtonSupplementNotification);
        for (int i = 0; i < 2; i++) {
            try {
                Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
            } catch (Exception e) {
            }
        }
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method is used to confirm the deletion of the notification
     */
    @Then("the user confirms deletion of the notification")
    public void the_user_confirms_deletion_of_the_notification() {
        Egrants_CommonUtils.waitForAlertAndAccept(WebDriverUtils.webDriver);
        CucumberLogUtils.logScreenshot();
    }
}