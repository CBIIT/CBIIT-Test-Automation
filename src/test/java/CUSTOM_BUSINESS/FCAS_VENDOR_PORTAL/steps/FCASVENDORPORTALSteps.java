package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.steps;

import CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.pages.FCASVENDORPORTALPage;
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
        FCASVENDORPORTALStepsImplementation.verifyVersionField();
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
        FCASVENDORPORTALStepsImplementation.verifyBeneficiaryOccupantDateField();
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

    @Given("User can see Title column")
    public void user_can_see_title_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsTitleColumn();
    }

    @Given("User can see PIID column")
    public void user_can_see_piid_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsPIIDColumn();
    }

    @Given("User can see Ref PIID column")
    public void user_can_see_ref_piid_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsRefPIIDColumn();
    }

    @Given("User can see Severability column")
    public void user_can_see_severability_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsSeverabilityColumn();
    }

    @Given("User can see Status column")
    public void user_can_see_status_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsStatusColumn();
    }

    @Given("User can see Est Ultimate Completion column")
    public void user_can_see_est_ultimate_completion_column() {
        FCASVENDORPORTALStepsImplementation.verifyExistingEstUltimateCompletionColumn();
    }

    @Given("User can see Existing Contracts tab")
    public void user_can_see_existing_contracts_tab() {
        FCASVENDORPORTALStepsImplementation.verifyExistingContractsTab();
    }

    @When("User clicks on Planning tab")
    public void user_clicks_on_planning_tab() {
        FCASVENDORPORTALStepsImplementation.clickOnPlanningTab();
    }

    @Then("User can verify Planning tab page header")
    public void user_can_verify_planning_tab_page_header() {
        FCASVENDORPORTALStepsImplementation.verifyPlanningTabPageHeader();
    }

    @When("User clicks on Solicitations tab")
    public void user_clicks_on_solicitations_tab() {
        FCASVENDORPORTALStepsImplementation.clickOnSolicitationTab();
    }

    @Then("User can verify Solicitation tab page header")
    public void user_can_verify_solicitation_tab_page_header() {
        FCASVENDORPORTALStepsImplementation.verifySolicitationTabPageHeader();
    }

    @When("User clicks on Company Account tab")
    public void user_clicks_on_company_account_tab() {
        FCASVENDORPORTALStepsImplementation.clickOnCompanyAccountTab();
    }

    @Then("User can verify Company Account tab page header")
    public void user_can_verify_company_account_tab_page_header() {
        FCASVENDORPORTALStepsImplementation.verifyCompanyAccountTabPageHeader();
    }

    /**
     * Click on leave feedback
     */
    @When("User chooses to leave feedback")
    public void user_chooses_to_leave_feedback() {
     CommonUtils.clickOnElement(fCASVENDORPORTALPage.leaveFeedbackButton);
    }

    @Then("User is on Leave Feedback modal")
    public void user_is_on_leave_feedback_modal() {
      FCASVENDORPORTALStepsImplementation.verifyLeaveFeedbackModalPageHeader();
    }

    /**
     * Click on Yes for The FCAS Vendor Portal application was user friendly
     */
    @Then("User chooses Yes for The FCAS Vendor Portal application was user friendly")
    public void user_chooses_yes_for_the_fcas_vendor_portal_application_was_user_friendly() {
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.yesRadioButtonWasApplicationFriendly);
    }

    /**
     * Click on No for was easy to upload document files to the FCAS Vendor Portal
     */
    @Then("User chooses No for was easy to upload document files to the FCAS Vendor Portal")
    public void user_chooses_no_for_was_easy_to_upload_document_files_to_the_fcas_vendor_portal() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.noRadioButtonWasUploadEasy);
    }

    /**
     * Click on No for Is there additional information you think should be included in the FCAS Vendor Portal User Guide
     */
    @Then("User chooses No for Is there additional information you think should be included in the FCAS Vendor Portal User Guide")
    public void user_chooses_no_for_is_there_additional_information_you_think_should_be_included_in_the_fcas_vendor_portal_user_guide() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.noRadioButtonIsGuideUseful);
    }

    /**
     * Click on Yes for Is the FCAS Vendor Portal organized in a user-friendly way
     */
    @Then("User chooses Yes for Is the FCAS Vendor Portal organized in a user-friendly way")
    public void user_chooses_yes_for_is_the_fcas_vendor_portal_organized_in_a_user_friendly_way() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.noRadioButtonIsOrganized);
    }

    /**
     * User inputs comments for Is there anything else you think we should know regarding the FCAS Vendor Portal Application
     */
    @Then("User inputs comments for Is there anything else you think we should know regarding the FCAS Vendor Portal Application question")
    public void user_inputs_comments_for_is_there_anything_else_you_think_we_should_know_regarding_the_fcas_vendor_portal_application_question() {
       CommonUtils.sendKeys(fCASVENDORPORTALPage.textFieldAdditionalComments,"Comments");
    }

    /**
     * User clicks Submit feedback button
     */
    @Then("User clicks Submit feedback button")
    public void user_clicks_submit_feedback_button() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage. buttonSubmitFeedback);
    }

    /**
     * User clicks on Planning tab
     */
    @Given("User navigates to Planning page")
    public void user_navigates_to_planning_page() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.planningTab);
    }

    @Given("User can see Planning page header")
    public void user_can_see_planning_page_header() {
      FCASVENDORPORTALStepsImplementation.verifyPlanningPageHeader();
    }

    @Given("User can see Search field")
    public void user_can_see_search_field() {
       FCASVENDORPORTALStepsImplementation.verifySearchFieldPlanningTab();
    }

    @Given("User can see All statuses dropdown")
    public void user_can_see_all_statuses_dropdown() {
      FCASVENDORPORTALStepsImplementation.verifyAllStatusesDropdown();
    }

    @Given("User can see Title Planning tab column")
    public void user_can_see_title_planning_tab_column() {
       FCASVENDORPORTALStepsImplementation.verifyTitleColumnPlanningTab();
    }

    @Given("User can see ID column")
    public void user_can_see_id_column() {
      FCASVENDORPORTALStepsImplementation.verifyIDColumnPlanningTab();
    }

    @Given("User can see Requested by column")
    public void user_can_see_requested_by_column() {
      FCASVENDORPORTALStepsImplementation.verifyRequestedByColumnPlanningTab();
    }

    @Given("User can see Est. Award Date column")
    public void user_can_see_est_award_date_column() {
     FCASVENDORPORTALStepsImplementation.verifyEstAwardDateColumnPlanningTab();
    }

    @Given("User can see Last Updated column")
    public void user_can_see_last_updated_column() {
       FCASVENDORPORTALStepsImplementation.verifyLastUpdatedColumnPlanningTab();
    }
}