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
}