package ServiceNow.OA_Intake.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.ArrayList;

public class OAIntakeSteps extends PageInitializer {

    /**
     * Logs in as a Submitter to OA Intake Portal.
     */
    @Given("Submitter User logged in to OA Intake Portal")
    public void submitter_user_logged_in_to_oa_intake_portal() {
        oaIntakeStepsImplementation.oaIntakeSubmitterUserLogin();
    }

    /**
     * Submitter verifies they are on OA Intake Request pag.
     */
    @Given("Submitter User can verify that they are on an OA Intake Request page")
    public void submitter_user_can_verify_that_they_are_on_an_oa_intake_request_page() {
        CommonUtils.sleep(1000);
        Assert.assertTrue(oaIntakePage.newRequestPageHeader.isDisplayed());
    }

    /**
     * Submitter verifies Requestor Queue hyperlink works
     */
    @Given("Submitter User can verify Requestor \\(Requested for) Queue working hyperlink")
    public void submitter_user_can_verify_requestor_requested_for_queue_working_hyperlink() {
        CommonUtils.clickOnElement(oaIntakePage.requestorQueueHyperlink);
        CommonUtils.waitForVisibility(oaIntakePage.newRequestPageHeader);
        Assert.assertTrue(oaIntakePage.newRequestPageHeader.isDisplayed());
        webDriver.navigate().back();
    }

    /**
     * Submitter verifies  User Guide link works
     */
    @Given("Submitter User can verify that clicking on User Guide link redirects User to a new User Guide tab")
    public void submitter_user_can_verify_that_clicking_on_user_guide_link_redirects_user_to_a_new_user_guide_tab() {
        CommonUtils.clickOnElement(oaIntakePage.userGuideHyperlink);
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(oaIntakePage.userGuideLoginText.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    /**
     * Submitter clicks on New Request tab
     */
    @Given("Submitter User clicks on New Request tab")
    public void submitter_user_clicks_on_new_request_tab() {
        CommonUtils.clickOnElement(oaIntakePage.newRequestTab);
    }

    /**
     * Submitter confirms draft status is default for a new request
     * @param statusDraft
     */
    @Given("Submitter User confirms that Status is {string} by default")
    public void submitter_user_confirms_that_status_is_by_default(String statusDraft) {
        Assert.assertEquals(statusDraft, oaIntakePage.requestStatus.getText());
    }

    /**
     * Submitter  fills in Request Title field
     * @param title
     */
    @Given("Submitter User fills in Request Title field as {string}")
    public void submitter_user_fills_in_request_title_field_as(String title) {
        CommonUtils.sendKeys(oaIntakePage.requestTitleField, title);
    }

    /**
     * Submitter  fills in Request Description field
     * @param description
     */
    @Given("Submitter User fills in Request Description field as {string}")
    public void submitter_user_fills_in_request_description_field_as(String description) {
        CommonUtils.sendKeys(oaIntakePage.requestDescriptionField, description);
    }

    /**
     * Submitter fills in Requested Award Date field
     * @param awardDate
     */
    @Given("Submitter User fills in Requested Award Date as {string}")
    public void submitter_user_fills_in_requested_award_date_as(String awardDate) {
        CommonUtils.sendKeys(oaIntakePage.awardDateField, awardDate);
    }

    /**
     * Submitter marks NAICS Code Status option as known
     */
    @When("Submitter User picks NAICS Code Status option as known")
    public void submitter_user_picks_naics_code_status_option_as_known() {
        CommonUtils.clickOnElement(oaIntakePage.drpdnNAICSCodeStatus);
        CommonUtils.clickOnElement(oaIntakePage.drpdnNAICSCodeKnownOption);
    }


    /**
     * Submitter fills in NAICS Code
     * @param code
     */
    @Then("Submitter User can fill in a NAICS Code Number field as {string}")
    public void submitter_user_can_fill_in_a_naics_code_number_field_as(String code) {
        CommonUtils.sendKeys(oaIntakePage.nAICSCodeField, code);
    }

    /**
     * Submitter chooses New or Re-compete Contract option as Re-compete
     */
    @When("Submitter User chooses New or Re-compete Contract option as Re-compete")
    public void submitter_user_chooses_new_or_re_compete_contract_option_as_re_compete() {
        CommonUtils.clickOnElement(oaIntakePage.drpdwnNewRecompeteContract);
        CommonUtils.clickOnElement(oaIntakePage.recompeteContract);
    }

    /**
     * Submitter confirms Previous Contract Number and Previous Buyer fields appear
     */
    @Then("Submitter User can see Previous Contract Number and Previous Buyer fields appear")
    public void submitter_user_can_see_previous_contract_number_and_previous_buyer_fields_appear() {
        Assert.assertTrue(oaIntakePage.previousContractNumberField.isDisplayed());
        Assert.assertTrue(oaIntakePage.previousBuyerField.isDisplayed());
    }

    /**
     * Submitter chooses option Internal NCI Call Task Order
     */
    @When("Submitter User chooses option Internal NCI Call Task Order on a BPA IDIQ from Recommended Contract Mechanism dropdown")
    public void submitter_user_chooses_option_internal_nci_call_task_order_on_a_bpa_idiq_from_recommended_contract_mechanism_dropdown() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRecomContractMechanism);
        CommonUtils.clickOnElement(oaIntakePage.externalCallOption);
    }

    /**
     * Submitter chooses External Call Task Orders
     */
    @When("Submitter User chooses option External Call Task Orders \\(TOs)\\(NITAAC, GSA) from Recommended Contract Mechanism dropdown")
    public void submitter_user_chooses_option_external_call_task_orders_t_os_nitaac_gsa_from_recommended_contract_mechanism_dropdown() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRecomContractMechanism);
        CommonUtils.clickOnElement(oaIntakePage.internalCallOption);
    }

    /**
     * Submitter sees alert message for choosing Task Order Plans
     * @param alert
     */
    @Then("Submitter User can see alert message {string}")
    public void submitter_user_can_see_alert_message(String alert) {
        Assert.assertEquals(alert, oaIntakePage.alertMessageTaskOrderAcqPlans.getText());
    }

    /**
     * Submitter User chooses R&D Support as Yes
     */
    @Given("Submitter User chooses R&D Support as Yes")
    public void submitter_user_chooses_r_d_r_d_support_as_yes() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRD);
        CommonUtils.clickOnElement(oaIntakePage.RDYes);
    }

    /**
     * Submitter fills in Date Concept Peer Review Complete field
     * @param date
     */
    @Then("Submitter User can fill in a field Date Concept Peer Review Completed as {string}")
    public void submitter_user_can_fill_in_a_field_date_concept_peer_review_completed_as(String date) {
        CommonUtils.sendKeys(oaIntakePage.dateConceptPeerReviewComField, date);
    }

    /**
     * Submitter chooses PSC Code Status as known
     */
    @When("Submitter User chooses PSC Code Status as known")
    public void submitter_user_chooses_psc_code_status_as_known() {
        CommonUtils.clickOnElement(oaIntakePage.dropdownPSCCodeStatus);
        CommonUtils.clickOnElement(oaIntakePage.yesPSCCodeStatus);
    }

    /**
     * Submitter fills in PSC Code field
     * @param pscCode
     */
    @Then("Submitter User can fill in PSC Code field as {string}")
    public void submitter_user_can_fill_in_psc_code_field_as(String pscCode) {
        CommonUtils.sendKeys(oaIntakePage.PSCCodeField, pscCode);
    }

    /**
     * Submitter chooses FITARA Business Case Clearances as No
     */
    @When("Submitter User chooses FITARA Business Case Clearances as No")
    public void submitter_user_chooses_fitara_business_case_clearances_as_no() {
        CommonUtils.clickOnElement(oaIntakePage.dropdwnFITARA);
        CommonUtils.clickOnElement(oaIntakePage.noFITARA);
    }

    /**
     * Submitter fills in Please enter the estimated value of IT field
     * @param sum
     */
    @Then("Submitter User can enter {string} for Please enter the estimated value of IT and biomedical computing requirement")
    public void submitter_user_can_enter_for_please_enter_the_estimated_value_of_it_and_or_biomedical_computing_requirement_field(String sum) {
        CommonUtils.sendKeys(oaIntakePage.estValueITField, sum);
    }

    /**
     * Submitter chooses Yes for ISSO Clearance field
     */
    @When("Submitter User chooses Yes for ISSO Clearance field")
    public void submitter_user_chooses_yes_for_isso_clearance_field() {
        JavascriptUtils.scrollIntoView(oaIntakePage.dropdownISSO);
        CommonUtils.clickOnElement(oaIntakePage.dropdownISSO);
        CommonUtils.clickOnElement(oaIntakePage.yesISSO);
    }

    /**
     * Submitter fills in SSO Clearance Ticket field
     * @param ticket
     */
    @Then("Submitter User can enter {string} for SSO Clearance Ticket field")
    public void submitter_user_can_enter_for_sso_clearance_ticket_field(String ticket) {
        CommonUtils.sendKeys(oaIntakePage.ISSOClearanceTicketField, ticket);
    }

    /**
     * Submitter clicks Submit Request button
     */
    @When("Submitter User clicks Submit Request button")
    public void submitter_user_clicks_submit_request_button() {
        CommonUtils.clickOnElement(oaIntakePage.btnSubmitRequest);
    }

    /**
     * Submitter sees submission confirmation modal
     */
    @Then("Submitter User can verify a submission confirmation modal OA Intake form appears")
    public void submitter_user_can_verify_a_submission_confirmation_modal_oa_intake_form_appears() {
        Assert.assertTrue(oaIntakePage.textConfModalTaskOrderAcquisitionPlans.isDisplayed());
        Assert.assertTrue(oaIntakePage.textConfModalConceptSPL.isDisplayed());
        Assert.assertTrue(oaIntakePage.textConfModalDraftStWorkICGE.isDisplayed());
    }

    /**
     * Submitter chooses to submit a request
     */
    @Then("Submitter User chooses to submit a request")
    public void submitter_user_chooses_to_submit_a_request() {
        CommonUtils.clickOnElement(oaIntakePage.modalSubmitButton);
    }

    /**
     * Submitter confirms they are redirected to Requestor Queue page
     */
    @Then("Submitter User can confirm they are redirected to Requestor \\(Requested For) Queue for Negotiated Contracts page")
    public void submitter_user_can_confirm_they_are_redirected_to_requestor_requested_for_queue_for_negotiated_contracts_page() {
        Assert.assertTrue(oaIntakePage.requestorPageHeader.isDisplayed());
    }

    /**
     * Submitter User clicks on New Request button
     */
    @When("Submitter User clicks on New Request button")
    public void submitter_user_clicks_on_new_request_button() {
        CommonUtils.clickOnElement(oaIntakePage.newRequestTab);
    }
}