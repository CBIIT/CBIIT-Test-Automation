package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.steps;

import CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.constants.fcasVendorPortalConstants;
import CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.stepsImplementation.FCASVENDORPORTALStepsImplementation;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static APPS_COMMON.PageInitializers.PageInitializer.fCASVENDORPORTALPage;
import static Hooks.Hooks.softAssert;

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

    /**
     * Verify Existing Contracts Page title
     */
    @And("User is on Existing Contracts page")
    public void user_is_on_existing_contracts_page() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageHeader.isDisplayed());
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

    /**
     * Verify show closed contracts options
     */
    @And("User can see Show Closed Contracts option")
    public void user_can_see_show_closed_contracts_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.showClosedContractsOption.isDisplayed());
    }

    /**
     * Verify text Search Field Option
     */
    @And("User can see a search page text field")
    public void user_can_see_a_search_page_text_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.textSearchField.isDisplayed());
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

    /**
     * Verify Submit Invoice page header
     */
    @Then("User can see Submit Invoice page header")
    public void user_can_see_submit_invoice_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitInvoiceHeader.isDisplayed());
    }

    /**
     * Verify Invoice field
     */
    @Then("User can see Invoice field")
    public void user_can_see_invoice_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.invoiceFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Invoice Date field
     */
    @Then("User can see Invoice date field")
    public void user_can_see_invoice_date_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.invoiceDateFieldSubmitInvoice.isDisplayed());
        ;
    }

    /**
     * Verify Start Date field
     */
    @Then("User can see Start date field")
    public void user_can_see_start_date_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.startDateFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify End Date field
     */
    @Then("User can see End date field")
    public void user_can_see_end_date_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.endDateFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Amount field
     */
    @Then("User can see Amount field")
    public void user_can_see_amount_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.amountFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Submission Type Dropdown
     */
    @Then("User can see Submission Type dropdown")
    public void user_can_see_submission_type_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submissionTypeDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Primary Contact Dropdown
     */
    @Then("User can see Primary Contact dropdown")
    public void user_can_see_primary_contact_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.primaryContactDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Associates Contact Dropdown
     */
    @Then("User can see Associates dropdown")
    public void user_can_see_associates_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.associatesDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Comments Field
     */
    @Then("User can see Comments field")
    public void user_can_see_comments_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.commentsFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Choose File button
     */
    @Then("User can see Choose File button")
    public void user_can_see_choose_file_button() {
        softAssert.assertTrue(fCASVENDORPORTALPage.chooseFileButton.isDisplayed());
    }

    /**
     * User clicks Cancel button
     */
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

    /**
     * Verify Submit Deliverable Page Header
     */
    @Then("User can see Submit Deliverable page header")
    public void user_can_see_submit_deliverable_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitDeliverableHeader.isDisplayed());
    }

    /**
     * Verify Submit Status Filter Dropdown
     */
    @Then("User can see Status Filter dropdown")
    public void user_can_see_status_filter_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.statusFilterDropdownSubmitDeliverable.isDisplayed());
    }

    /**
     * Verify Scheduled Field
     */
    @Then("User can see Scheduled field")
    public void user_can_see_scheduled_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.scheduledFieldSubmitDeliverable.isDisplayed());
    }

    /**
     * Verify Unscheduled Field
     */
    @Then("User can see Unscheduled field")
    public void user_can_see_unscheduled_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.unscheduledFieldSubmitDeliverable.isDisplayed());
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

    /**
     * Verify Submit COA Page Header
     */
    @Then("User can see Submit COA page header")
    public void user_can_see_submit_coa_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitCOAHeader.isDisplayed());
    }

    /**
     * Verify COA Requirement Dropdown
     */
    @Then("User can see COA Requirement dropdown")
    public void user_can_see_coa_requirement_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.coaRequirementDropdownSubmitCOA.isDisplayed());
    }

    /**
     * Verify COA Field
     */
    @Then("User can see COA field")
    public void user_can_see_coa_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.coaFieldSubmitCOA.isDisplayed());
    }

    /**
     * Verify title Field
     */
    @Then("User can see Title field")
    public void user_can_see_title_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.titleFieldSubmitCOA.isDisplayed());
    }


    @Given("User chooses Existing Contracts Submit Work Order option")
    public void user_chooses_existing_contracts_submit_work_order_option() {
        FCASVENDORPORTALStepsImplementation.chooseExistingContractsSubmitWorkOrderOption();
    }

    /**
     * Verify Submit Work Order Page Header
     */
    @Then("User can see Submit Work Order page header")
    public void user_can_see_submit_work_order_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitWorkOrderHeader.isDisplayed());
    }

    /**
     * Verify Version field Submit Work Order
     */
    @Then("User can see Version Work Order field")
    public void user_can_see_version_work_order_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.versionFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Work Order field Submit Work Order
     */
    @Then("User can see Work Order field")
    public void user_can_see_work_order_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.workOrderFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Package Type dropdown Submit Work Order
     */
    @Then("User can see Package Type dropdown")
    public void user_can_see_package_type_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.packageTypeDropdownSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Estimate field Submit Work Order
     */
    @Then("User can see Estimate field")
    public void user_can_see_estimate_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.estimateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Beneficiary Occupant Date Field Submit Work Order
     */
    @Then("User can see Beneficiary Occupancy Date field")
    public void user_can_see_beneficiary_occupancy_date_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.beneficiaryOccupantDateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Project ID Field Submit Work Order
     */
    @Then("User can see Project ID field")
    public void user_can_see_project_id_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.projectIDFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Directorate Customer Field Submit Work Order
     */
    @Then("User can see Directorate Customer field")
    public void user_can_see_directorate_customer_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.directorateCustomerFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Directorate Field Submit Work Order
     */
    @Then("User can see Directorate field")
    public void user_can_see_directorate_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.directorateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Building Field Submit Work Order
     */
    @Then("User can see Building field")
    public void user_can_see_building_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.buildingFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Room Field Submit Work Order
     */
    @Then("User can see Room field")
    public void user_can_see_room_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.roomFieldSubmitWorkOrder.isDisplayed());
    }

    @Given("User chooses Existing Contracts Submit Notification option")
    public void user_chooses_existing_contracts_submit_notification_option() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitNotificationOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitNotificationOption);
    }

    /**
     * Verify User can see Submit Notification page header
     */
    @Then("User can see Submit Notification page header")
    public void user_can_see_submit_notification_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitNotificationHeader.isDisplayed());
    }

    /**
     * Verify Notifications Dropdown Submit Notification
     */
    @Then("User can see Notification Type dropdown")
    public void user_can_see_notification_type_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.notificationsDropdownSubmitNotification.isDisplayed());
    }

    /**
     * Verify User can see Notification Field
     */
    @Then("User can see Notification field")
    public void user_can_see_notification_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.notificationFieldSubmitNotification.isDisplayed());
    }

    /**
     * Verify Existing Contracts Title Column
     */
    @Given("User can see Title column")
    public void user_can_see_title_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageTitleColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts PIID Column
     */
    @Given("User can see PIID column")
    public void user_can_see_piid_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPagePIIDColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Ref PIID Column
     */
    @Given("User can see Ref PIID column")
    public void user_can_see_ref_piid_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageRefPIIDColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Severability Column
     */
    @Given("User can see Severability column")
    public void user_can_see_severability_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageSeverabilityColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Status Column
     */
    @Given("User can see Status column")
    public void user_can_see_status_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageStatusColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Est. Ultimate Completion Column
     */
    @Given("User can see Est Ultimate Completion column")
    public void user_can_see_est_ultimate_completion_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageEstUltimateCompletionColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts tab
     */
    @Given("User can see Existing Contracts tab")
    public void user_can_see_existing_contracts_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsTab.isDisplayed());
    }

    /**
     * Click on Planning tab
     */
    @When("User clicks on Planning tab")
    public void user_clicks_on_planning_tab() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.planningTab);
    }

    /**
     * Verify Planning tab page header
     */
    @Then("User can verify Planning tab page header")
    public void user_can_verify_planning_tab_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningTabPageHeader.isDisplayed());
    }

    /**
     * Click on Solicitation tab
     */
    @When("User clicks on Solicitations tab")
    public void user_clicks_on_solicitations_tab() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.solicitationsTab);
    }

    /**
     * Verify Solicitation tab page header
     */
    @Then("User can verify Solicitation tab page header")
    public void user_can_verify_solicitation_tab_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationsTabPageHeader.isDisplayed());
    }

    /**
     * Click on Company Account tab
     */
    @When("User clicks on Company Account tab")
    public void user_clicks_on_company_account_tab() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.companyAccountTab);
    }

    /**
     * Verify Company Account tab page header
     */
    @Then("User can verify Company Account tab page header")
    public void user_can_verify_company_account_tab_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.companyAccountTabPageHeader.isDisplayed());
    }

    /**
     * Click on leave feedback
     */
    @When("User chooses to leave feedback")
    public void user_chooses_to_leave_feedback() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.leaveFeedbackButton);
    }

    /**
     * Verify LeaveFeedbackModal page header
     */
    @Then("User is on Leave Feedback modal")
    public void user_is_on_leave_feedback_modal() {
        softAssert.assertTrue(fCASVENDORPORTALPage.leaveFeedbackModalPageHeader.isDisplayed());
    }

    /**
     * Click on Yes for The FCAS Vendor Portal application was user friendly
     */
    @Then("User chooses Yes for The FCAS Vendor Portal application was user friendly")
    public void user_chooses_yes_for_the_fcas_vendor_portal_application_was_user_friendly() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.yesRadioButtonWasApplicationFriendly);
    }

    @Then("User chooses No for {string}")
    public void user_chooses_no_for(String options) {
        FCASVENDORPORTALStepsImplementation.chooseNoAnswerLeaveFeedbackQuestions(options);
    }

    @Then("User chooses No answer for {string}")
    public void user_chooses_no_answer_for(String options) {
        FCASVENDORPORTALStepsImplementation.chooseNoAnswerLeaveFeedbackQuestions(options);
    }

    /**
     * Click on Yes for Is the FCAS Vendor Portal organized in a user-friendly way
     */

    @Then("User chooses Yes for portal being organized in a user-friendly way")
    public void user_chooses_yes_for_portal_being_organized_in_a_user_friendly_way() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.yesRadioButtonIsOrganized);
    }

    /**
     * User inputs comments for Is there anything else you think we should know regarding the FCAS Vendor Portal Application
     */
    @Then("User inputs comments for anything else field")
    public void user_inputs_comments_for_anything_else_field() {
        CommonUtils.sendKeys(fCASVENDORPORTALPage.textFieldAdditionalComments, fcasVendorPortalConstants.COMMENTS);
    }

    /**
     * User clicks Submit feedback button
     */
    @Then("User clicks Submit feedback button")
    public void user_clicks_submit_feedback_button() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.buttonSubmitFeedback);
    }

    /**
     * User clicks on Planning tab
     */
    @Given("User navigates to Planning page")
    public void user_navigates_to_planning_page() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.planningTab);
    }

    /**
     * Verify Planning page header
     */
    @Given("User can see Planning page header")
    public void user_can_see_planning_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageHeader.isDisplayed());
    }

    /**
     * Verify Search field Planning page
     */
    @Given("User can see Search field")
    public void user_can_see_search_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageSearchField.isDisplayed());
    }

    /**
     * Verify All Statuses dropdown Planning page
     */
    @Given("User can see All statuses dropdown")
    public void user_can_see_all_statuses_dropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.allStatusesDropdown.isDisplayed());
    }

    /**
     * Verify Title column Planning page
     */
    @Given("User can see Title Planning tab column")
    public void user_can_see_title_planning_tab_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageTitleColumn.isDisplayed());
    }

    /**
     * Verify ID column Planning page
     */
    @Given("User can see ID column")
    public void user_can_see_id_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageIDColumn.isDisplayed());
    }

    /**
     * Verify Requested By column Planning page
     */
    @Given("User can see Requested by column")
    public void user_can_see_requested_by_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageRequestedByColumn.isDisplayed());
    }

    /**
     * Verify Est. Award Date column Planning page
     */
    @Given("User can see Est. Award Date column")
    public void user_can_see_est_award_date_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageEstAwardDateColumn.isDisplayed());
    }

    /**
     * Verify Last Updated column Planning page
     */
    @Given("User can see Last Updated column")
    public void user_can_see_last_updated_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningPageLastUpdatedColumn.isDisplayed());
    }

    /**
     * User can verify Solicitations page header
     */
    @Given("User can verify Solicitations page header")
    public void user_can_verify_solicitations_page_header() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageHeader.isDisplayed());
    }

    /**
     * Verify Proposal Requested quick filter
     */
    @Given("User can see Proposal Requested quick filter")
    public void user_can_see_proposal_requested_quick_filter() {
        softAssert.assertTrue(fCASVENDORPORTALPage.quickFilterProposalRequested.isDisplayed());
    }

    /**
     * Verify Active quick filter
     */
    @Given("User can see Active quick filter")
    public void user_can_see_active_quick_filter() {
        softAssert.assertTrue(fCASVENDORPORTALPage.quickFilterActive.isDisplayed());
    }

    /**
     * Verify Submitted quick filter
     */
    @Given("User can see Submitted quick filter")
    public void user_can_see_submitted_quick_filter() {
        softAssert.assertTrue(fCASVENDORPORTALPage.quickFilterSubmitted.isDisplayed());
    }

    /**
     * Verify Rejected quick filter
     */
    @Given("User can see Rejected quick filter")
    public void user_can_see_rejected_quick_filter() {
        softAssert.assertTrue(fCASVENDORPORTALPage.quickFilterRejected.isDisplayed());
    }

    /**
     * User navigates to Solicitations page
     */
    @Given("User navigates to Solicitations page")
    public void user_navigates_to_solicitations_page() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.solicitationsTab);
    }

    /**
     * Verify Title Solicitation tab column
     */
    @Given("User can see Title Solicitation tab column")
    public void user_can_see_title_solicitation_tab_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageTitleColumn.isDisplayed());
    }

    /**
     * Verify Solicitation column
     */
    @Given("User can see Solicitation column")
    public void user_can_see_solicitation_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageSolicitationColumn.isDisplayed());
    }

    /**
     * Verify Division column
     */
    @Given("User can see Division column")
    public void user_can_see_division_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageDivisionColumn.isDisplayed());
    }

    /**
     * Verify Amendments column
     */
    @Given("User can see Amendments column")
    public void user_can_see_amendments_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageAmendmentsColumn.isDisplayed());
    }

    /**
     * Verify Price Type column
     */
    @Given("User can see Price Type column")
    public void user_can_see_price_type_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPagePriceTypeColumn.isDisplayed());
    }

    /**
     * Verify Q&A End Date column
     */
    @Given("User can see Q&A End Date column")
    public void user_can_see_q_a_end_date_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageQADateColumn.isDisplayed());
    }

    /**
     * Verify Proposal Due Date column
     */
    @Given("User can see Proposal Due Date column")
    public void user_can_see_proposal_due_date_column() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationPageProposalDueDateColumn.isDisplayed());
    }

    /**
     * User navigates to Company account page
     */
    @Given("User navigates to Company account page")
    public void user_navigates_to_company_account_page() {
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.companyAccountTab);
    }

    /**
     * User clicks Edit button for Company Details
     */
    @When("User clicks Edit button for Company Details")
    public void user_clicks_edit_button_for_company_details() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.editButtonBusinessSummary);
    }

    /**
     * Verify User is on Edit Company Details modal
     */
    @Then("User is on Edit Company Details modal")
    public void user_is_on_edit_company_details_modal() {
        softAssert.assertTrue(fCASVENDORPORTALPage.editCompanyDetailsModalHeader.isDisplayed());
    }

    /**
     * Verify User can see name Edit Company Details field
     */
    @Then("User can see name Edit Company Details field")
    public void user_can_see_name_edit_company_details_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.nameFieldEditCompanyDetails.isDisplayed());
    }

    /**
     * Verify User can see email Edit Company Details field
     */
    @Then("User can see email Edit Company Details field")
    public void user_can_see_email_edit_company_details_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.emailFieldEditCompanyDetails.isDisplayed());
    }

    /**
     * Verify User can see DUNS Edit Company Details field
     */
    @Then("User can see DUNS Edit Company Details field")
    public void user_can_see_duns_edit_company_details_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.dUNSFieldEditCompanyDetails.isDisplayed());
    }

    /**
     * Verify User can see mailing address Edit Company Details field
     */
    @Then("User can see mailing address Edit Company Details field")
    public void user_can_see_mailing_address_edit_company_details_field() {
        softAssert.assertTrue(fCASVENDORPORTALPage.mailingAddressFieldEditCompanyDetails.isDisplayed());
    }

    /**
     * User clicks on Users tab
     */
    @Given("User clicks on Users tab")
    public void user_clicks_on_users_tab() {
       CommonUtils.clickOnElement(fCASVENDORPORTALPage.usersTab);
    }

    /**
     * Verify User can see Add User button
     */
    @Given("User can see Add User button")
    public void user_can_see_add_user_button() {
        softAssert.assertTrue(fCASVENDORPORTALPage.addUserButton.isDisplayed());
    }

    /**
     * Verify User can see Show Inactive Users option
     */
    @Given("User can see Show Inactive Users option")
    public void user_can_see_show_inactive_users_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.showInactiveUsersOption.isDisplayed());
    }

    /**
     * Verify User can see name column of Users tab
     */
    @Given("User can see name column of Users tab")
    public void user_can_see_name_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.nameColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see job title column of Users tab
     */
    @Given("User can see job title column of Users tab")
    public void user_can_see_job_title_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.jobTitleColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see email column of Users tab
     */
    @Given("User can see email column of Users tab")
    public void user_can_see_email_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.emailColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see phone column of Users tab
     */
    @Given("User can see phone column of Users tab")
    public void user_can_see_phone_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.phoneColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see access to view column of Users tab
     */
    @Given("User can see access to view column of Users tab")
    public void user_can_see_access_to_view_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.accessToViewColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see admin column of Users tab
     */
    @Given("User can see admin column of Users tab")
    public void user_can_see_admin_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.adminToViewColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see account active column of Users tab
     */
    @Given("User can see account active column of Users tab")
    public void user_can_see_account_active_column_of_users_tab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.accountActiveColumnUsersTab.isDisplayed());
    }

    /**
     * Verify User can see account active column of Users tab
     */
    @Given("User clicks Add User button")
    public void user_clicks_add_user_button() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.addUserButton);
    }

    /**
     * Verify User can see First Name field to fill in
     */
    @Given("User can see First Name field to fill in")
    public void user_can_see_first_name_field_to_fill_in() {
        softAssert.assertTrue(fCASVENDORPORTALPage.firstNameAddUserModal.isDisplayed());
    }

    /**
     * Verify User can see Last Name field to fill in
     */
    @Given("User can see Last Name field to fill in")
    public void user_can_see_last_name_field_to_fill_in() {
        softAssert.assertTrue(fCASVENDORPORTALPage.lastNameAddUserModal.isDisplayed());
    }

    /**
     * Verify User can see Email field to fill in
     */
    @Given("User can see Email field to fill in")
    public void user_can_see_email_field_to_fill_in() {
        softAssert.assertTrue(fCASVENDORPORTALPage.emailAddUserModal.isDisplayed());
    }

    /**
     * Verify User can see Phone field to fill in
     */
    @Given("User can see Phone field to fill in")
    public void user_can_see_phone_field_to_fill_in() {
        softAssert.assertTrue(fCASVENDORPORTALPage.phoneNumberAddUserModal.isDisplayed());
    }

    /**
     * Verify User can see Job Title field to fill in
     */
    @Given("User can see Job Title field to fill in")
    public void user_can_see_job_title_field_to_fill_in() {
        softAssert.assertTrue(fCASVENDORPORTALPage.jobTitleAddUserModal.isDisplayed());
    }

    /**
     * Verify User can see Resend Vendor Portal Invite button
     */
    @Given("User can see Resend Vendor Portal Invite button")
    public void user_can_see_resend_vendor_portal_invite_button() {
        softAssert.assertTrue(fCASVENDORPORTALPage.resendVendorPortalButton.isDisplayed());
    }

    /**
     * User clicks Cancel button for Add User modal
     */
    @Given("User clicks Cancel button for Add User modal")
    public void user_clicks_cancel_button_for_add_user_modal() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.cancelButtonAddUserModal);
    }

    /**
     * Verify User can see Grant access to view Admin option
     */
    @Given("User can see Grant access to view Admin option")
    public void user_can_see_grant_access_to_view_admin_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.adminOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Business Representative option
     */
    @Given("User can see Grant access to view Business Representative option")
    public void user_can_see_grant_access_to_view_business_representative_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.businessRepresentativeOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Invoices option
     */
    @Given("User can see Grant access to view Invoices option")
    public void user_can_see_grant_access_to_view_invoices_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.invoicesOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Deliverables option
     */
    @Given("User can see Grant access to view Deliverables option")
    public void user_can_see_grant_access_to_view_deliverables_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.deliverablesOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view COAs option
     */
    @Given("User can see Grant access to view COAs option")
    public void user_can_see_grant_access_to_view_co_as_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.cOAsOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Notifications option
     */
    @Given("User can see Grant access to view Notifications option")
    public void user_can_see_grant_access_to_view_notifications_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.notificationsOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Planning option
     */
    @Given("User can see Grant access to view Planning option")
    public void user_can_see_grant_access_to_view_planning_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Solicitation option
     */
    @Given("User can see Grant access to view Solicitation option")
    public void user_can_see_grant_access_to_view_solicitation_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Grant access to view Work Orders option
     */
    @Given("User can see Grant access to view Work Orders option")
    public void user_can_see_grant_access_to_view_work_orders_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.workOrderOptionGrantAccess.isDisplayed());
    }

    /**
     * Verify User can see Planning Coordinator option
     */
    @Given("User can see Planning Coordinator option")
    public void user_can_see_planning_coordinator_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningCoordinatorOption.isDisplayed());
    }

    /**
     * Verify User can see Planning Coordinator description
     */
    @Given("User can see Planning Coordinator description")
    public void user_can_see_planning_coordinator_description() {
        softAssert.assertTrue(fCASVENDORPORTALPage.planningCoordinatorDescription.isDisplayed());
    }

    /**
     * Verify User can see Solicitation Coordinator option
     */
    @Given("User can see Solicitation Coordinator option")
    public void user_can_see_solicitation_coordinator_option() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationCoordinatorOption.isDisplayed());
    }

    /**
     * Verify User can see Solicitation Coordinator description
     */
    @Given("User can see Solicitation Coordinator description")
    public void user_can_see_solicitation_coordinator_description() {
        softAssert.assertTrue(fCASVENDORPORTALPage.solicitationCoordinatorDescription.isDisplayed());
    }
}