package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.*;

public class FCASVENDORPORTALStepsImplementation extends PageInitializer {

    /**
     * User logs in as a Submitter to FCAS vendor Portal.
     */
    public static void userLoginFCASVendorPortal() {
        WebDriverUtils.webDriver.get(getFCASVendorPortalUrl());
        CommonUtils.sendKeys(nihLoginPage.username, I_TRUST_USERNAME);
        String decryptedPass = EncryptionUtils.decrypt(I_TRUST_PASSWORD);
        CommonUtils.sendKeys(nihLoginPage.password, decryptedPass);
        CommonUtils.clickOnElement(nihLoginPage.signInButton);
        CommonUtils.sleep(3000);
    }

    /**
     * Verify Existing Contracts Page title
     */
    public static void verifyExistingContractsPageTitle() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageHeader.isDisplayed());
    }

    /**
     * Verify All and My contracts options
     */
    public static void verifyAllMyContractsOptions() {
        softAssert.assertTrue(fCASVENDORPORTALPage.allContractsOption.isDisplayed());
        softAssert.assertTrue(fCASVENDORPORTALPage.myContractsOption.isDisplayed());
    }

    /**
     * Verify show closed contracts options
     */
    public static void verifyShowClosedContractsOption() {
        softAssert.assertTrue(fCASVENDORPORTALPage.showClosedContractsOption.isDisplayed());
    }

    /**
     * Verify text Search Field Option
     */
    public static void textSearchFieldOption() {
        softAssert.assertTrue(fCASVENDORPORTALPage.textSearchField.isDisplayed());
    }

    /**
     * Verify text Search Field Option
     */
    public static void verifySubmitInvoiceHeader() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitInvoiceHeader.isDisplayed());
    }

    /**
     * Verify Invoice field
     */
    public static void verifyInvoiceField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.invoiceFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Invoice Date field
     */
    public static void verifyInvoiceDateField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.invoiceDateFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Start Date field
     */
    public static void verifyStartDateField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.startDateFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify End Date field
     */
    public static void verifyEndDateField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.endDateFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Amount field
     */
    public static void verifyAmountField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.amountFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Submission Type Dropdown
     */
    public static void verifySubmissionTypeDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submissionTypeDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Primary Contact Dropdown
     */
    public static void verifyPrimaryContactDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.primaryContactDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Associates Contact Dropdown
     */
    public static void verifyAssociatesDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.associatesDropdownSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Comments Field
     */
    public static void verifyCommentsField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.commentsFieldSubmitInvoice.isDisplayed());
    }

    /**
     * Verify Choose File button
     */
    public static void verifyChooseFileButton() {
        softAssert.assertTrue(fCASVENDORPORTALPage.chooseFileButton.isDisplayed());
    }

    /**
     * Verify Submit Deliverables Page Header
     */
    public static void verifySubmitDeliverablesPageHeader() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitDeliverableHeader.isDisplayed());
    }

    /**
     * Verify Submit COA Page Header
     */
    public static void verifySubmitCOAPageHeader() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitCOAHeader.isDisplayed());
    }

    /**
     * Verify Submit Work Order Page Header
     */
    public static void verifySubmitWorkOrderPageHeader() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitWorkOrderHeader.isDisplayed());
    }

    /**
     * Verify Submit Status Filter Dropdown
     */
    public static void verifyStatusFilterDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.statusFilterDropdownSubmitDeliverable.isDisplayed());
    }

    /**
     * Verify Scheduled Field
     */
    public static void verifyScheduledField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.scheduledFieldSubmitDeliverable.isDisplayed());
    }

    /**
     * Verify Scheduled Field
     */
    public static void verifyUnscheduledField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.unscheduledFieldSubmitDeliverable.isDisplayed());
    }

    /**
     * Verify COA RequirementDropdown
     */
    public static void coaRequirementDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.coaRequirementDropdownSubmitCOA.isDisplayed());
    }

    /**
     * Verify COA Field
     */
    public static void verifyCOAField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.coaFieldSubmitCOA.isDisplayed());
    }

    /**
     * Verify title Field
     */
    public static void verifyTitleField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.titleFieldSubmitCOA.isDisplayed());
    }

    /**
     * Verify Work Order field Submit Work Order
     */
    public static void verifyWorkOrderField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.workOrderFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Version field Submit Work Order
     */
    public static void verifyVersionField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.versionFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Package Type dropdown Submit Work Order
     */
    public static void verifyPackageTypeDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.packageTypeDropdownSubmitWorkOrder.isDisplayed());
    }

    /**
     * Verify Estimate field Submit Work Order
     */
    public static void verifyEstimateField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.estimateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Beneficiary Occupant Date Field Submit Work Order
     */
    public static void verifyBeneficiaryOccupantDateField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.beneficiaryOccupantDateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Project ID Field Submit Work Order
     */
    public static void verifyProjectIdField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.projectIDFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Directorate Customer Field Submit Work Order
     */
    public static void verifyDirectorateCustomerIDField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.directorateCustomerFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Directorate Field Submit Work Order
     */
    public static void verifyDirectorateIDField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.directorateFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Building Field Submit Work Order
     */
    public static void verifyBuildingIDField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.buildingFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Room Field Submit Work Order
     */
    public static void verifyRoomIDField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.roomFieldSubmitWorkOrder.isDisplayed());
    }

    /**
     * Notifications Dropdown Submit Notification
     */
    public static void verifyNotificationsDropdown() {
        softAssert.assertTrue(fCASVENDORPORTALPage.notificationsDropdownSubmitNotification.isDisplayed());
    }

    /**
     * Notifications Field Submit Notification
     */
    public static void verifyNotificationField() {
        softAssert.assertTrue(fCASVENDORPORTALPage.notificationFieldSubmitNotification.isDisplayed());
    }

    /**
     * Verify User can see Submit Notification page header
     */
    public static void verifySubmitNotificationHeader() {
        softAssert.assertTrue(fCASVENDORPORTALPage.submitNotificationHeader.isDisplayed());
    }

    /**
     * Verify Existing Contracts Title Column
     */
    public static void verifyExistingContractsTitleColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageTitleColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts PIID Column
     */
    public static void verifyExistingContractsPIIDColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPagePIIDColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Ref PIID Column
     */
    public static void verifyExistingContractsRefPIIDColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageRefPIIDColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Severability Column
     */
    public static void verifyExistingContractsSeverabilityColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageSeverabilityColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Status Column
     */
    public static void verifyExistingContractsStatusColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageStatusColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts Est. Ultimate Completion Column
     */
    public static void verifyExistingEstUltimateCompletionColumn() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsPageEstUltimateCompletionColumn.isDisplayed());
    }

    /**
     * Verify Existing Contracts tab
     */
    public static void verifyExistingContractsTab() {
        softAssert.assertTrue(fCASVENDORPORTALPage.existingContractsTab.isDisplayed());
    }
}