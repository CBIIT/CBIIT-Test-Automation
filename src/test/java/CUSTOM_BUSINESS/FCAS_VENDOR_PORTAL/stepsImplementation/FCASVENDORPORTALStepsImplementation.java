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
}