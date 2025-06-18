package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.steps;

import CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.stepsImplementation.FCASVENDORPORTALStepsImplementation;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static APPS_COMMON.PageInitializers.PageInitializer.fCASVENDORPORTALPage;
import static APPS_COMMON.PageInitializers.PageInitializer.fCASVENDORPORTALStepsImplementation;

public class FCASVENDORPORTALSteps {

    @Given("User is logged in to the FCAS Vendor Portal")
    public void user_is_logged_in_to_the_fcas_vendor_portal() {
        FCASVENDORPORTALStepsImplementation.userLoginFCASVendorPortal();
    }

    /**
     * User accepts PII Disclaimer
     */
    @Given("User accepts PII Disclaimer")
    public void user_accepts_pii_disclaimer() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.acceptWelcomeScreen);
    }

    @And("User is on Existing Contracts page")
    public void user_is_on_existing_contracts_page() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsPageTitle();
    }

    /**
     * User clicks on All Contracts dropdown
     */
    @When("User clicks on All Contracts dropdown")
    public void user_clicks_on_all_contracts_dropdown() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.allContractsDropdown);
    }

    @Then("User can see All Contracts and My Contracts options")
    public void user_can_see_all_contracts_and_my_contracts_options() {
        FCASVENDORPORTALStepsImplementation.verifyAllMyContractsOptions();
    }

    @And("User can see Show Closed Contracts option")
    public void user_can_see_show_closed_contracts_option() {
        FCASVENDORPORTALStepsImplementation.verifyShowClosedContractsOption();
    }

    @And("User can see a search page text field")
    public void user_can_see_a_search_page_text_field() {
        FCASVENDORPORTALStepsImplementation.textSearchFieldOption();
    }

    /**
     * User chooses Existing Contracts Submit Invoice option
     */
    @Given("User chooses Existing Contracts Submit Invoice option")
    public void user_chooses_existing_contracts_submit_invoice_option() {
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
       CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitInvoiceOption);
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitInvoiceOption);
    }

    @Then("User can see Submit Invoice page header")
    public void user_can_see_submit_invoice_page_header() {
        FCASVENDORPORTALStepsImplementation.verifySubmitInvoiceHeader();
    }

    @Then("User can see Invoice field")
    public void user_can_see_invoice_field() {
      FCASVENDORPORTALStepsImplementation.verifyInvoiceField();
    }

    @Then("User can see Invoice date field")
    public void user_can_see_invoice_date_field() {
       FCASVENDORPORTALStepsImplementation.verifyInvoiceDateField();
    }

    @Then("User can see Start date field")
    public void user_can_see_start_date_field() {
        FCASVENDORPORTALStepsImplementation.verifyStartDateField();
    }

    @Then("User can see End date field")
    public void user_can_see_end_date_field() {
     FCASVENDORPORTALStepsImplementation.verifyEndDateField();
    }

    @Then("User can see Amount field")
    public void user_can_see_amount_field() {
       FCASVENDORPORTALStepsImplementation.verifyAmountField();
    }

    @Then("User can see Submission Type dropdown")
    public void user_can_see_submission_type_dropdown() {
       FCASVENDORPORTALStepsImplementation.verifySubmissionTypeDropdown();
    }

    @Then("User can see Primary Contact dropdown")
    public void user_can_see_primary_contact_dropdown() {
        FCASVENDORPORTALStepsImplementation.verifyPrimaryContactDropdown();
    }

    @Then("User can see Associates dropdown")
    public void user_can_see_associates_dropdown() {
        FCASVENDORPORTALStepsImplementation.verifyAssociatesDropdown();
    }

    @Then("User can see Comments field")
    public void user_can_see_comments_field() {
       FCASVENDORPORTALStepsImplementation.verifyCommentsField();
    }

    @Then("User can see Choose File button")
    public void user_can_see_choose_file_button() {
        FCASVENDORPORTALStepsImplementation.verifyChooseFileButton();
    }

    @Then("User clicks Cancel button")
    public void user_clicks_cancel_button() {
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.cancelButton);
    }

    /**
     * User chooses Existing Contracts Submit Deliverable option
     */
    @Given("User chooses Existing Contracts Submit Deliverable option")
    public void user_chooses_existing_contracts_submit_deliverable_option() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitDeliverableOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitDeliverableOption);
    }

    @Then("User can see Submit Deliverable page header")
    public void user_can_see_submit_deliverable_page_header() {
    FCASVENDORPORTALStepsImplementation.verifySubmitDeliverablesPageHeader();
    }

    @Then("User can see Status Filter dropdown")
    public void user_can_see_status_filter_dropdown() {
        FCASVENDORPORTALStepsImplementation.verifyStatusFilterDropdown();
    }

    @Then("User can see Scheduled field")
    public void user_can_see_scheduled_field() {
        FCASVENDORPORTALStepsImplementation.verifyScheduledField();
    }

    @Then("User can see Unscheduled field")
    public void user_can_see_unscheduled_field() {
        FCASVENDORPORTALStepsImplementation.verifyUnscheduledField();
    }

    /**
     * User chooses Existing Contracts Submit COA option
     */
    @Given("User chooses Existing Contracts Submit COA option")
    public void user_chooses_existing_contracts_submit_coa_option() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitCOAOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitCOAOption);
    }

    @Then("User can see Submit COA page header")
    public void user_can_see_submit_coa_page_header() {
     FCASVENDORPORTALStepsImplementation.verifySubmitCOAPageHeader();
    }

    @Then("User can see COA Requirement dropdown")
    public void user_can_see_coa_requirement_dropdown() {
        FCASVENDORPORTALStepsImplementation.coaRequirementDropdown();
    }

    @Then("User can see COA field")
    public void user_can_see_coa_field() {
       FCASVENDORPORTALStepsImplementation.verifyCOAField();
    }

    @Then("User can see Title field")
    public void user_can_see_title_field() {
        FCASVENDORPORTALStepsImplementation.verifyTitleField();
    }

    /**
     * User chooses Existing Contracts Submit Work Order option
     */
    @Given("User chooses Existing Contracts Submit Work Order option")
    public void user_chooses_existing_contracts_submit_work_order_option() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitWorkOrderOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitWorkOrderOption);
    }

    @Then("User can see Submit Work Order page header")
    public void user_can_see_submit_work_order_page_header() {
       FCASVENDORPORTALStepsImplementation.verifySubmitWorkOrderPageHeader();
    }

    @Then("User can see Version Work Order field")
    public void user_can_see_version_work_order_field() {
        FCASVENDORPORTALStepsImplementation.verifyWorkOrderField();
    }

    @Then("User can see Work Order field")
    public void user_can_see_work_order_field() {
        FCASVENDORPORTALStepsImplementation.verifyWorkOrderField();
    }

    @Then("User can see Package Type dropdown")
    public void user_can_see_package_type_dropdown() {
     FCASVENDORPORTALStepsImplementation.verifyPackageTypeDropdown();
    }

    @Then("User can see Estimate field")
    public void user_can_see_estimate_field() {
       FCASVENDORPORTALStepsImplementation.verifyEstimateField();
    }

    @Then("User can see Beneficiary Occupancy Date field")
    public void user_can_see_beneficiary_occupancy_date_field() {
       FCASVENDORPORTALStepsImplementation.verifyBeneficiaryOccupantDateFieldField();
    }

    @Then("User can see Project ID field")
    public void user_can_see_project_id_field() {
      FCASVENDORPORTALStepsImplementation.verifyProjectIdField();
    }

    @Then("User can see Directorate Customer field")
    public void user_can_see_directorate_customer_field() {
        FCASVENDORPORTALStepsImplementation.verifyDirectorateCustomerIDField();
    }

    @Then("User can see Directorate field")
    public void user_can_see_directorate_field() {
        FCASVENDORPORTALStepsImplementation.verifyDirectorateIDField();
    }

    @Then("User can see Building field")
    public void user_can_see_building_field() {
        FCASVENDORPORTALStepsImplementation.verifyBuildingIDField();
    }

    @Then("User can see Room field")
    public void user_can_see_room_field() {
        FCASVENDORPORTALStepsImplementation.verifyRoomIDField();
    }

    @Given("User chooses Existing Contracts Submit Notification option")
    public void user_chooses_existing_contracts_submit_notification_option() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitNotificationOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitNotificationOption);
    }

    @Then("User can see Submit Notification page header")
    public void user_can_see_submit_notification_page_header() {
     FCASVENDORPORTALStepsImplementation.verifySubmitNotificationHeader();
    }

    @Then("User can see Notification Type dropdown")
    public void user_can_see_notification_type_dropdown() {
     FCASVENDORPORTALStepsImplementation.verifyNotificationsDropdown();
    }

    @Then("User can see Notification field")
    public void user_can_see_notification_field() {
       FCASVENDORPORTALStepsImplementation.verifyNotificationField();
    }
}