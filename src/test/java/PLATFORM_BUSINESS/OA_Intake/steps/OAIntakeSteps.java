package PLATFORM_BUSINESS.OA_Intake.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import PLATFORM_BUSINESS.OA_Intake.utilities.OAIntakeCommonUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Map;
import static Hooks.Hooks.softAssert;

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
        CommonUtils.clickOnElement(oaIntakePage.tabNewRequest);
    }

    /**
     * Submitter confirms draft status is default for a new request
     *
     * @param statusDraft
     */
    @Given("Submitter User confirms that Status is {string} by default")
    public void submitter_user_confirms_that_status_is_by_default(String statusDraft) {
        Assert.assertEquals(statusDraft, oaIntakePage.requestStatus.getText());
    }

    /**
     * Submitter  fills in Request Title field
     *
     * @param title
     */
    @Given("Submitter User fills in Request Title field as {string}")
    public void submitter_user_fills_in_request_title_field_as(String title) {
        CommonUtils.sendKeys(oaIntakePage.requestTitleField, title);
    }

    /**
     * Submitter  fills in Request Description field
     *
     * @param description
     */
    @Given("Submitter User fills in Request Description field as {string}")
    public void submitter_user_fills_in_request_description_field_as(String description) {
        CommonUtils.sendKeys(oaIntakePage.requestDescriptionField, description);
    }

    /**
     * Submitter fills in Requested Award Date field
     *
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
     *
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
        CommonUtils.clickOnElement(oaIntakePage.internalCallOption);
    }

    /**
     * Submitter chooses External Call Task Orders
     */
    @When("Submitter User chooses option External Call Task Orders \\(TOs)\\(NITAAC, GSA) from Recommended Contract Mechanism dropdown")
    public void submitter_user_chooses_option_external_call_task_orders_t_os_nitaac_gsa_from_recommended_contract_mechanism_dropdown() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRecomContractMechanism);
        CommonUtils.clickOnElement(oaIntakePage.externalCallOption);
    }

    /**
     * Submitter sees alert message for choosing Task Order Plans
     *
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
     *
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
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(oaIntakePage.yesPSCCodeStatus);
    }

    /**
     * Submitter fills in PSC Code field
     *
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
     *
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
     *
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
        CommonUtils.sleep(2000);
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
        CommonUtils.clickOnElement(oaIntakePage.tabNewRequest);
    }

    /**
     * Leadership User logs in to OA Intake Portal
     */
    @Given("Leadership User logged in to OA Intake Portal")
    public void leadership_user_logged_in_to_oa_intake_portal() {
        oaIntakeStepsImplementation.oaIntakeLeadershipUserLogin();
    }

    /**
     * User verifies the Home page header
     */
    @Then("User can verify the Home page header")
    public void user_can_verify_the_home_page_header() {
        CommonUtils.waitForVisibility(oaIntakePage.pageHeaderOAIntake);
        Assert.assertTrue(oaIntakePage.pageHeaderOAIntake.isDisplayed());
    }

    /**
     * User verifies the Home page header text
     */
    @Then("User can verify Home page header text")
    public void user_can_verify_home_page_header_text() {
        CommonUtils.waitForVisibility(oaIntakePage.pageHeaderTextOAIntake);
        Assert.assertTrue(oaIntakePage.pageHeaderTextOAIntake.isDisplayed());
    }

    /**
     * User verifies the text for Important info
     */
    @Then("User can verify text for Important info part")
    public void user_can_verify_text_for_important_info_part() {
        CommonUtils.waitForVisibility(oaIntakePage.importantTextOAIntake);
        Assert.assertTrue(oaIntakePage.importantTextOAIntake.isDisplayed());
    }

    /**
     * User verifies various tabs are displayed
     *
     * @param option
     */
    @Given("User can verify {string} tab is displayed")
    public void user_can_verify_tab_is_displayed(String option) {
        oaIntakeStepsImplementation.verifyTabDisplayed(option);
    }

    /**
     * User clicks on Menu dropdown
     */
    @When("User clicks on Menu dropdown")
    public void user_clicks_on_menu_dropdown() {
        CommonUtils.clickOnElement(oaIntakePage.menuDrpdwn);
    }

    /**
     * Leadership User verifies Menu options are displayed
     */
    @Then("Leadership User can verify the menu options displayed")
    public void leadership_user_can_verify_the_menu_options_displayed() {
        CommonUtils.waitForVisibility(oaIntakePage.menuHome);
        Assert.assertTrue(oaIntakePage.menuHome.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuRequestorQueue);
        Assert.assertTrue(oaIntakePage.menuRequestorQueue.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuLeadershipQueue);
        Assert.assertTrue(oaIntakePage.menuLeadershipQueue.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuCOCSQueue);
        Assert.assertTrue(oaIntakePage.menuCOCSQueue.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuManagementDashboard);
        Assert.assertTrue(oaIntakePage.menuManagementDashboard.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuUserGuide);
        Assert.assertTrue(oaIntakePage.menuUserGuide.isDisplayed());
    }

    /**
     * User clicks on Instructions
     */
    @When("User clicks on Instructions Page")
    public void user_clicks_on_instructions_page() {
        CommonUtils.clickOnElement(oaIntakePage.hyperlinkInstructions);
    }

    /**
     * User can verify they are redirected to Instructions page
     */
    @Then("User can verify they are redirected to Instructions page")
    public void user_can_verify_they_are_redirected_to_instructions_page() {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(oaIntakePage.pageHeaderInstructions.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    /**
     * User clicks on New Request tab
     */
    @Then("User clicks on New Request tab")
    public void user_clicks_on_new_request_tab() {
        CommonUtils.clickOnElement(oaIntakePage.tabNewRequest);
    }

    /**
     * User clicks on  OA Intake Home button
     */
    @When("User clicks on  OA Intake Home button")
    public void user_clicks_on_oa_intake_home_button() {
        CommonUtils.clickOnElement(oaIntakePage.homeButton);
    }

    /**
     * User can verify they are redirected to Home Page
     */
    @Then("User can verify they are redirected to Home Page")
    public void user_can_verify_they_are_redirected_to_home_page() {
        CommonUtils.waitForVisibility(oaIntakePage.pageHeaderOAIntake);
        Assert.assertTrue(oaIntakePage.pageHeaderOAIntake.isDisplayed());
        ;
    }

    /**
     * User clicks on their username
     */
    @When("User clicks on their username")
    public void user_clicks_on_their_username() {
        CommonUtils.clickOnElement(oaIntakePage.profileUsername);
    }

    /**
     * User can see menu options as Profile and Log Out
     */
    @Then("User can see menu options as Profile and Log Out")
    public void user_can_see_menu_options_as_profile_and_log_out() {
        CommonUtils.waitForVisibility(oaIntakePage.profileProfileOption);
        Assert.assertTrue(oaIntakePage.profileProfileOption.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.profileLogOutOption);
        Assert.assertTrue(oaIntakePage.profileLogOutOption.isDisplayed());
    }

    /**
     * User logs out of OA Intake application
     */
    @Then("User logs out of OA Intake application")
    public void user_logs_out_of_oa_intake_application() {
        CommonUtils.clickOnElement(oaIntakePage.profileUsername);
        CommonUtils.waitForVisibility(oaIntakePage.profileLogOutOption);
        CommonUtils.clickOnElement(oaIntakePage.profileLogOutOption);
    }

    /**
     * Submitter User can verify the menu options displayed
     */
    @Then("Submitter User can verify the menu options displayed")
    public void submitter_user_can_verify_the_menu_options_displayed() {
        CommonUtils.waitForVisibility(oaIntakePage.menuHome);
        Assert.assertTrue(oaIntakePage.menuHome.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuRequestorQueue);
        Assert.assertTrue(oaIntakePage.menuRequestorQueue.isDisplayed());
        CommonUtils.waitForVisibility(oaIntakePage.menuUserGuide);
        Assert.assertTrue(oaIntakePage.menuUserGuide.isDisplayed());
    }

    /**
     * click on (Requested For) Queue tab
     */
    @Given("User clicks on Requestor \\(Requested For) Queue tab")
    public void user_clicks_on_requestor_requested_for_queue_tab() {
        CommonUtils.clickOnElement(oaIntakePage.tabRequestorQueue);
    }

    /**
     * verify Requestor \(Requested For) Queue tab is displayed
     */
    @Given("User can verify page header as {string}")
    public void user_can_verify_page_header_as(String string) {
        softAssert.assertTrue(oaIntakePage.pageHeaderRequestedFor.isDisplayed());
    }

    /**
     * verify New request button is displayed
     */
    @Given("User can see New Request button")
    public void user_can_see_new_request_button() {
        softAssert.assertTrue(oaIntakePage.buttonNewRequest.isDisplayed());
    }

    /**
     * verify Contact Support button is displayed
     */
    @Given("User can see Contact Support button")
    public void user_can_see_contact_support_button() {
        softAssert.assertTrue(oaIntakePage.buttonContactSupport.isDisplayed());
    }

    /**
     * verify POTS hyperlink is displayed
     */
    @Given("User can verify Purchasing Online Tracking System \\(POTS) hyperlink is displayed")
    public void user_can_verify_purchasing_online_tracking_system_pots_hyperlink_is_displayed() {
        softAssert.assertTrue(oaIntakePage.hyperlinkPOTS.isDisplayed());
    }

    /**
     * verify (FCAS) hyperlink is displayed
     */
    @Then("User can verify FFRDC Contract Administration System \\(FCAS) hyperlink is displayed")
    public void user_can_verify_ffrdc_contract_administration_system_fcas_hyperlink_is_displayed() {
        softAssert.assertTrue(oaIntakePage.hyperlinkFCAS.isDisplayed());
    }

    /**
     * verify that OA Intakes are pre-filtered for a logged in Leadership User
     */
    @Then("User can verify that OA Intakes are pre-filtered for a logged in Leadership User")
    public void user_can_verify_that_oa_intakes_are_pre_filtered_for_a_logged_in_leadership_user() {
        softAssert.assertTrue(oaIntakePage.requestorBreadcrumbs.isDisplayed());
    }

    /**
     * Request ID column can be sorted in descending and ascending order
     */
    @Then("User can verify that Request ID column can be sorted in descending and ascending order")
    public void user_can_verify_that_request_id_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestID);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestID);
    }

    /**
     * Status column can be sorted in descending and ascending order
     */
    @Then("User can verify that Status column can be sorted in descending and ascending order")
    public void user_can_verify_that_status_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingStatus);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingStatus);
    }

    /**
     * Request Title column can be sorted in descending and ascending order
     */
    @Then("User can verify that Request Title column can be sorted in descending and ascending order")
    public void user_can_verify_that_request_title_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestTitle);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestTitle);
    }

    /**
     * Requestor \(Requested For)column can be sorted in descending and ascending order
     */
    @Then("User can verify that Requestor \\(Requested For) column can be sorted in descending and ascending order")
    public void user_can_verify_that_requestor_requested_for_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestedFor);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestedFor);
    }

    /**
     * Submitter column can be sorted in descending and ascending order
     */
    @Then("User can verify that Submitter column can be sorted in descending and ascending order")
    public void user_can_verify_that_submitter_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingSubmitter);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingSubmitter);
    }

    /**
     * Created On column can be sorted in descending and ascending order
     */
    @Then("User can verify that Created On column can be sorted in descending and ascending order")
    public void user_can_verify_that_created_on_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingCreatedOn);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingCreatedOn);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingCreatedOn);
    }

    /**
     * Status Date column can be sorted in descending and ascending order
     */
    @Then("User can verify that Status Date column can be sorted in descending and ascending order")
    public void user_can_verify_that_status_date_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingStatusDate);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingStatusDate);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingStatusDate);
    }

    /**
     * User clicks on CO CS Queue tab
     */
    @Given("User clicks on CO CS Queue tab")
    public void user_clicks_on_co_cs_queue_tab() {
        CommonUtils.clickOnElement(oaIntakePage.tabCOCSQueue);
        CommonUtils.sleep(5000);
    }

    /**
     * User can see OA Intakes - Assigned section
     */
    @Given("User can see OA Intakes - Assigned section")
    public void user_can_see_oa_intakes_assigned_section() {
        softAssert.assertTrue(oaIntakePage.sectionOAIntakesAssigned.isDisplayed());
    }

    /**
     * User clicks on OA Intakes - Assigned menu
     */
    @When("User clicks on OA Intakes - Assigned menu")
    public void user_clicks_on_oa_intakes_assigned_menu() {
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesAssignedMenu);
    }

    /**
     * User verifies options for OA Intakes - Assigned requests
     */
    @Then("User can see the following options for OA Intakes - Assigned requests")
    public void user_can_see_the_following_options_for_oa_intakes_assigned_requests(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> options = OAIntakeCommonUtils.getMapFromDataTable(dataTable);
        softAssert.assertTrue(oaIntakePage.exportAsPDFOAIntakesAssignedMenu.isDisplayed(), options.get("option1"));
        softAssert.assertTrue(oaIntakePage.exportAsExcelOAIntakesAssignedMenu.isDisplayed(), options.get("option2"));
        softAssert.assertTrue(oaIntakePage.exportAsCSVOAIntakesAssignedMenu.isDisplayed(), options.get("option3"));
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesAssignedMenu);
    }

    /**
     * User verifies OA Intakes - Assigned filter is preset with assigned requests
     */
    @Then("User can see OA Intakes - Assigned filter is preset with assigned requests")
    public void user_can_see_oa_intakes_assigned_filter_is_preset_with_assigned_requests() {
        String expectedTextFilter = "Status = Assigned";
        softAssert.assertEquals(oaIntakePage.presetFilterAssigned.getText(), expectedTextFilter);
    }

    /**
     * User clicks to remove filters for OA Intakes - Assigned requests
     */
    @Then("User can remove filters for OA Intakes - Assigned requests")
    public void user_can_remove_filters_for_oa_intakes_assigned_requests() {
        CommonUtils.clickOnElement(oaIntakePage.removeSubsequentConditionsAssigned);
    }

    /**
     * User verifies OA Intakes - Accepted section is displayed
     */
    @Then("User can see OA Intakes - Accepted section")
    public void user_can_see_oa_intakes_accepted_section() {
        softAssert.assertTrue(oaIntakePage.sectionOAIntakesAccepted.isDisplayed());
    }

    /**
     * User clicks on OA Intakes - Accepted menu
     */
    @When("User clicks on OA Intakes - Accepted menu")
    public void user_clicks_on_oa_intakes_accepted_menu() {
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesAcceptedMenu);
    }

    /**
     * User verifies options for OA Intakes - Accepted requests
     */
    @Then("User can see the following options for OA Intakes - Accepted requests")
    public void user_can_see_the_following_options_for_oa_intakes_accepted_requests(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> options = OAIntakeCommonUtils.getMapFromDataTable(dataTable);
        softAssert.assertTrue(oaIntakePage.exportAsPDFOAIntakesAcceptedMenu.isDisplayed(), options.get("option1"));
        softAssert.assertTrue(oaIntakePage.exportAsExcelOAIntakesAcceptedMenu.isDisplayed(), options.get("option2"));
        softAssert.assertTrue(oaIntakePage.exportAsCSVOAIntakesAcceptedMenu.isDisplayed(), options.get("option3"));
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesAcceptedMenu);
    }

    /**
     * User verifies OA Intakes - Accepted filter is preset with accepted requests
     */
    @Then("User can see OA Intakes - Accepted filter is preset with accepted requests")
    public void user_can_see_oa_intakes_accepted_filter_is_preset_with_accepted_requests() {
        String expectedTextFilter = "Status = Accepted";
        softAssert.assertEquals(oaIntakePage.presetFilterAccepted.getText(), expectedTextFilter);
    }

    /**
     * User removes filters for OA Intakes - Accepted requests
     */
    @Then("User can remove filters for OA Intakes - Accepted requests")
    public void user_can_remove_filters_for_oa_intakes_accepted_requests() {
        CommonUtils.clickOnElement(oaIntakePage.removeSubsequentConditionsAccepted);
    }

    /**
     * User verifies OA Intakes - Cancelled section is displayed
     */
    @Then("User can see OA Intakes - Cancelled section")
    public void user_can_see_oa_intakes_cancelled_section() {
        softAssert.assertTrue(oaIntakePage.sectionOAIntakesCancelled.isDisplayed());
    }

    /**
     * User clicks on OA Intakes - Cancelled menu
     */
    @When("User clicks on OA Intakes - Cancelled menu")
    public void user_clicks_on_oa_intakes_cancelled_menu() {
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesCancelledMenu);
    }

    /**
     * User verifies options for OA Intakes - Cancelled requests
     */
    @Then("User can see the following options for OA Intakes - Cancelled requests")
    public void user_can_see_the_following_options_for_oa_intakes_cancelled_requests(io.cucumber.datatable.DataTable dataTable) {
        CommonUtils.sleep(3000);
        Map<String, String> options = OAIntakeCommonUtils.getMapFromDataTable(dataTable);
        softAssert.assertTrue(oaIntakePage.exportAsPDFOAIntakesCancelledMenu.isDisplayed(), options.get("option1"));
        softAssert.assertTrue(oaIntakePage.exportAsExcelOAIntakesCancelledMenu.isDisplayed(), options.get("option2"));
        softAssert.assertTrue(oaIntakePage.exportAsCSVOAIntakesCancelledMenu.isDisplayed(), options.get("option3"));
        CommonUtils.clickOnElement(oaIntakePage.sectionOAIntakesCancelledMenu);
    }

    /**
     * User verifies options for OA Intakes - Cancelled requests
     */
    @Then("User can see OA Intakes - Cancelled filter is preset with cancelled requests")
    public void user_can_see_oa_intakes_cancelled_filter_is_preset_with_cancelled_requests() {
        String expectedTextFilter = "Status = Cancelled";
        softAssert.assertEquals(oaIntakePage.presetFilterCancelled.getText(), expectedTextFilter);
    }

    /**
     * User removes filters for OA Intakes - Cancelled request
     */
    @Then("User can remove filters for OA Intakes - Cancelled requests")
    public void user_can_remove_filters_for_oa_intakes_cancelled_requests() {
        CommonUtils.clickOnElement(oaIntakePage.removeSubsequentConditionsCancelled);
    }

    /**
     * User clicks on Leadership Queue tab
     */
    @Given("User clicks on Leadership Queue tab")
    public void user_clicks_on_leadership_queue_tab() {
        CommonUtils.clickOnElement(oaIntakePage.tabLeadershipQueue);
    }

    /**
     * User clicks on OA Intake Leadership Queue menu
     */
    @When("User clicks on OA Intake Leadership Queue menu")
    public void user_clicks_on_oa_intake_leadership_queue_menu() {
        CommonUtils.clickOnElement(oaIntakePage.oAIntakesContextMenu);
    }

    /**
     * User  verifies options for OA Intake Leadership Queue menu
     */
    @Then("User can see the following options for OA Intake Leadership Queue menu")
    public void user_can_see_the_following_options_for_oa_intake_leadership_queue_menu(io.cucumber.datatable.DataTable dataTable) {
        CommonUtils.sleep(3000);
        Map<String, String> options = OAIntakeCommonUtils.getMapFromDataTable(dataTable);
        softAssert.assertTrue(oaIntakePage.exportAsPDFLeadershipQueueMenu.isDisplayed(), options.get("option1"));
        softAssert.assertTrue(oaIntakePage.exportAsExcelLeadershipQueueMenu.isDisplayed(), options.get("option2"));
        softAssert.assertTrue(oaIntakePage.exportAsCSVLeadershipQueueMenu.isDisplayed(), options.get("option3"));
        CommonUtils.clickOnElement(oaIntakePage.oAIntakesContextMenu);
    }

    /**
     * User can see OA Intakes filter is preset with submitted requests
     */
    @Then("User can see OA Intakes filter is preset with submitted requests")
    public void user_can_see_oa_intakes_accepted_filter_is_preset_with_submitted_requests() {
        String expectedTextFilter = "Status = Submitted";
        softAssert.assertEquals(oaIntakePage.presetSubmittedStatusLeadershipQueue.getText(), expectedTextFilter);
    }

    /**
     * User verifies that Leadership Queue Request ID column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Request ID column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_request_id_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestIDLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestIDLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Status column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Status column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_status_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingStatusLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingStatusLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Branch column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Branch column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_branch_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingBranchLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingBranchLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Request Title column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Request Title column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_request_title_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestTitleLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestTitleLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Requestor column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Requestor \\(Requested For) column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_requestor_requested_for_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestorLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestorLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Estimated Amount column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Estimated Amount column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_estimated_amount_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingEstimatedAmountLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingEstimatedAmountLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Recommended Contract Mechanism column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Recommended Contract Mechanism column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_recommended_contract_mechanism_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingRecommendedContractMechanismLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRecommendedContractMechanismLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Requested Award Date column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Requested Award Date column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_requested_award_date_column_can_be_sorted_in_descending_and_ascending_order() {
        for (int i = 0; i < 2; i++) {
            CommonUtils.clickOnElement(oaIntakePage.sortAscendingRequestedAwardDateLeadershipQueue);
            CommonUtils.sleep(1000);
        }
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingRequestedAwardDateLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue  Submitter column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Submitter column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_submitter_column_can_be_sorted_in_descending_and_ascending_order() {
        CommonUtils.clickOnElement(oaIntakePage.sortAscendingSubmitterLeadershipQueue);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingSubmitterLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Status Date column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Status Date column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_status_date_column_can_be_sorted_in_descending_and_ascending_order() {
        for (int i = 0; i < 2; i++) {
            CommonUtils.clickOnElement(oaIntakePage.sortAscendingStatusDateLeadershipQueue);
            CommonUtils.sleep(1000);
        }
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingStatusDateLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User verifies that Leadership Queue Created On column can be sorted in descending and ascending order
     */
    @Then("User can verify that Leadership Queue Created On column can be sorted in descending and ascending order")
    public void user_can_verify_that_leadership_queue_created_on_column_can_be_sorted_in_descending_and_ascending_order() {
        for (int i = 0; i < 2; i++) {
            CommonUtils.clickOnElement(oaIntakePage.sortAscendingCreatedOnLeadershipQueue);
            CommonUtils.sleep(1000);
        }
        CommonUtils.clickOnElement(oaIntakePage.sortDescendingCreatedOnLeadershipQueue);
        CommonUtils.sleep(1000);
    }

    /**
     * User clicks on recently submitted OA Intake request
     */
    @Given("User picks recently submitted OA Intake request")
    public void user_picks_recently_submitted_oa_intake_request() {
        CommonUtils.clickOnElement(oaIntakePage.lastSubmittedOAIntakeRequest);
    }

    /**
     * User adds Team Lead
     */
    @Given("User adds Team Lead as {string}")
    public void user_adds_team_lead_as(String text) {
        CommonUtils.clickOnElement(oaIntakePage.dropdownTeamLead);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(oaIntakePage.searchFieldTeamLead, text);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(oaIntakePage.activeElement, Keys.TAB);
        CommonUtils.sleep(1000);
    }

    /**
     * User adds Contracting Officer
     */
    @Given("User adds Contracting Officer as {string}")
    public void user_adds_contracting_officer_as(String text) {
        CommonUtils.clickOnElement(oaIntakePage.dropdownContractOfficer);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeys(oaIntakePage.searchFieldContractOfficer, text);
        CommonUtils.sleep(3000);
        CommonUtils.sendKeys(oaIntakePage.activeElement, Keys.TAB);
        CommonUtils.sleep(1000);
    }

    /**
     * User clicks Send To Branch button"
     */
    @When("User clicks Send To Branch button")
    public void user_clicks_send_to_branch_button() {
        CommonUtils.clickOnElement(oaIntakePage.buttonSendToBranch);
        CommonUtils.sleep(2000);
    }

    /**
     * User verifies alert
     */
    @Then("User can verify confirmation modal This request has been successfully assigned to Branch Review appears")
    public void user_can_verify_confirmation_modal_this_request_has_been_successfully_assigned_to_branch_review_appears() {
        try {
            Alert alert = webDriver.switchTo().alert();
            String alertTextBrReview = alert.getText();
            softAssert.assertTrue(alertTextBrReview.equals("This request has been successfully assigned to Branch Review"));
            alert.dismiss();
        } catch (Exception e) {
            CommonUtils.sleep(3000);
        }
    }

    /**
     * User clicks Send CO CS button
     */
    @When("User clicks Send To CO CS button")
    public void user_clicks_send_to_co_cs_button() {
        CommonUtils.clickOnElement(oaIntakePage.buttonSendToCOCS);
        CommonUtils.sleep(2000);
    }

    @Then("User can verify confirmation modal This request has been successfully assigned to CO CS review")
    public void user_can_verify_confirmation_modal_this_request_has_been_successfully_assigned_to_co_cs_review() {
        try {
            Alert alert = webDriver.switchTo().alert();
            String alertText = alert.getText();
            softAssert.assertTrue(alertText.equals("This request has been successfully assigned to CO/CS review."));
            alert.dismiss();
        } catch (Exception e) {
            CommonUtils.sleep(3000);
        }
    }

    @Given("User logs in as Contracting Officer to OA Intake Portal")
    public void user_logs_in_as_contracting_officer_to_oa_intake_portal() {
        oaIntakeStepsImplementation.oaIntakeContrOfficerUserLogin();
    }

    /**
     * User clicks Accept Submission button
     */
    @Given("User clicks Accept Submission")
    public void user_clicks_accept_submission() {
        CommonUtils.clickOnElement(oaIntakePage.buttonAcceptSubmission);
        CommonUtils.sleep(2000);
        try {
            Alert alert = webDriver.switchTo().alert();
            alert.dismiss();
        } catch (Exception e) {
            CommonUtils.sleep(3000);
        }
    }

    /**
     * User can verify the status of the request is Accepted
     */
    @Then("User can verify the status of the request is Accepted")
    public void user_can_verify_the_status_of_the_request_is_accepted() {
        String actualStatus = oaIntakePage.statusTextField.getText();
        System.out.println(actualStatus);
        softAssert.assertEquals(actualStatus, "Accepted");
    }

    /**
     * User picks last accepted request
     */
    @Given("User picks recently accepted OA Intake request")
    public void user_picks_recently_accepted_oa_intake_request() {
        CommonUtils.clickOnElement(oaIntakePage.lastAcceptedOAIntakeRequest);
        CommonUtils.sleep(1000);
    }

    /**
     * Submitter can verify text
     *
     * @param expText
     */
    @Then("Submitter User can verify {string} text is displayed")
    public void submitter_user_can_verify_text_is_displayed(String expText) {
        String actualText = oaIntakePage.textFormEnables.getText();
        softAssert.assertEquals(actualText, expText);
    }

    /**
     * User get redirected to Requestor tab within the same web page
     */
    @Then("Submitter User can verify clicking on hyperlink Requestor \\(Requested for) Queue redirects to Requestor tab within the same web page")
    public void submitter_user_can_verify_clicking_on_hyperlink_requestor_requested_for_queue_redirects_to_requestor_tab_within_the_same_web_page() {
        CommonUtils.clickOnElement(oaIntakePage.hyperlinkRequestorQueue);
        softAssert.assertTrue(oaIntakePage.requestorPageHeader.isDisplayed());
    }

    /**
     * Submitter User can navigate back to New Request page
     */
    @Then("Submitter User can navigate back to New Request page")
    public void submitter_user_can_navigate_back_to_new_request_page() {
        WebDriverUtils.webDriver.navigate().back();
        softAssert.assertTrue(oaIntakePage.newRequestPageHeader.isDisplayed());
    }

    /**
     * Submitter can verify text
     *
     * @param expText
     */
    @Then("Submitter User can verify  Important section text as {string}")
    public void submitter_user_can_verify_important_section_text_as(String expText) {
        String actualText = oaIntakePage.textImportant.getText();
        softAssert.assertEquals(actualText, expText);
    }

    /**
     * Submitter User can navigate to Office of Acquisitions
     */
    @Then("Submitter User can navigate to Office of Acquisitions")
    public void submitter_user_can_navigate_to_office_of_acquisitions() {
        CommonUtils.clickOnElement(oaIntakePage.hyperlinkOA);
        CommonUtils.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        ;
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    /**
     * Submitter User can navigate to User Guide page
     */
    @Then("Submitter User can navigate to User Guide page")
    public void submitter_user_can_navigate_to_user_guide_page() {
        CommonUtils.clickOnElement(oaIntakePage.userGuideHyperlink);
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(oaIntakePage.userGuideLoginText.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    /**
     * Submitter User clicks instructions question mark
     */
    @When("Submitter User clicks instructions question mark")
    public void submitter_user_clicks_instructions_question_mark() {
        CommonUtils.clickOnElement(oaIntakePage.questionMarkAdInstructions);
    }

    /**
     * Submitter User is redirected to OA Intake Request Instructional Page
     */
    @Then("Submitter User is redirected to OA Intake Request Instructional Page")
    public void submitter_user_is_redirected_to_oa_intake_request_instructional_page() {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        softAssert.assertTrue(oaIntakePage.headerInstructionalPage.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    /**
     * Submitter can verify CO CS text
     */
    @Then("Submitter User can see CO CS text reference {string}")
    public void submitter_user_can_see_co_cs_text_reference(String expText) {
        String actualText = oaIntakePage.textOnceOAReceives.getText();
        softAssert.assertEquals(actualText, expText);
    }

    /**
     * Submitter Users sees New Request tab
     */
    @Given("Submitter Users sees New Request tab")
    public void submitter_users_sees_new_request_tab() {
        softAssert.assertTrue(oaIntakePage.tabNewRequest.isDisplayed());
    }

    /**
     * Submitter Users sees (Requested For) Queue tab
     */
    @Given("Submitter User sees Requestor \\(Requested For) Queue tab")
    public void submitter_user_sees_requestor_requested_for_queue_tab() {
        softAssert.assertTrue(oaIntakePage.tabRequestorQueue.isDisplayed());
    }

    /**
     * Submitter Users clicks on User Profile
     */
    @When("Submitter User clicks on User Profile")
    public void submitter_user_clicks_on_user_profile() {
        CommonUtils.clickOnElement(oaIntakePage.userProfileModule);
    }

    /**
     * User sees Profile option
     */
    @Then("Submitter User sees Profile option")
    public void submitter_user_sees_profile_option() {
        softAssert.assertTrue(oaIntakePage.optionProfile.isDisplayed());
    }

    /**
     * User sees Log Out option
     */
    @Then("Submitter User sees Log Out option")
    public void submitter_user_sees_log_out_option() {
        softAssert.assertTrue(oaIntakePage.optionLogOut.isDisplayed());
    }

    /**
     * User clicks Profile option
     */
    @When("Submitter User clicks Profile option")
    public void submitter_user_clicks_profile_option() {
        CommonUtils.clickOnElement(oaIntakePage.optionProfile);
    }

    /**
     * User clicks Profile option
     *
     * @param text
     */
    @Then("Submitter User can confirm {string} page header")
    public void submitter_user_can_confirm_page_header(String text) {
        softAssert.assertTrue(oaIntakePage.pageHeaderUserProfile.getText().equals(text));
    }

    /**
     * User can see Search field is displayed
     */
    @Then("Submitter User can see Search field is displayed")
    public void submitter_user_can_see_search_field_is_displayed() {
        softAssert.assertTrue(oaIntakePage.searchField.isDisplayed());
    }

    /**
     * User can see Upload Picture button
     */
    @Then("Submitter User can see Upload Picture button")
    public void submitter_user_can_see_upload_picture_button() {
        softAssert.assertTrue(oaIntakePage.uploadPictureButton.isDisplayed());
    }

    /**
     * User can see About section
     */
    @Then("Submitter User can see About section")
    public void submitter_user_can_see_about_section() {
        softAssert.assertTrue(oaIntakePage.aboutSection.isDisplayed());
        ;
    }

    /**
     * User can see the fields of About section
     */
    @Then("Submitter User can see the following fields of About section")
    public void submitter_user_can_see_the_following_fields_of_about_section(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> options = OAIntakeCommonUtils.getMapFromDataTable(dataTable);
        softAssert.assertTrue(oaIntakePage.aboutSectionEmail.isDisplayed(), options.get("option1"));
        softAssert.assertTrue(oaIntakePage.aboutSectionPhone.isDisplayed(), options.get("option2"));
        softAssert.assertTrue(oaIntakePage.aboutSectionMobilePhone.isDisplayed(), options.get("option3"));
    }

    /**
     * User can see User preferences section
     */
    @Then("Submitter User can see User preferences section")
    public void submitter_user_can_see_user_preferences_section() {
        softAssert.assertTrue(oaIntakePage.userPreferencesSection.isDisplayed());
    }

    /**
     * Submitter User can see Accessibility enabled button
     */
    @Then("Submitter User can see Accessibility enabled button")
    public void submitter_user_can_see_accessibility_enabled_button() {
        softAssert.assertTrue(oaIntakePage.accessibilityEnabledButton.isDisplayed());
    }

    /**
     * Submitter User can see Time zone dropdown
     */
    @Then("Submitter User can see Time zone dropdown")
    public void submitter_user_can_see_time_zone_dropdown() {
        softAssert.assertTrue(oaIntakePage.timezoneDropdn.isDisplayed());
    }

    /**
     * Submitter User can see Refresh To See Changes button
     */
    @Then("Submitter User can see Refresh To See Changes button")
    public void submitter_user_can_see_refresh_to_see_changes_button() {
        softAssert.assertTrue(oaIntakePage.refreshChangesButton.isDisplayed());
    }

    /**
     * Submitter User chooses R&D Support as No
     */
    @When("Submitter User chooses R&D Support as No")
    public void submitter_user_chooses_r_d_support_as_no() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRD);
        CommonUtils.clickOnElement(oaIntakePage.RDNo);
    }

    /**
     * Submitter User chooses PSC Code Status as unknown
     */
    @When("Submitter User chooses PSC Code Status as unknown")
    public void submitter_user_chooses_psc_code_status_as_unknown() {
        softAssert.assertTrue(oaIntakePage.unknownPSCCodeStatus.getText().equals("Unknown"));
    }

    /**
     * Submitter User chooses FITARA Business Case Clearances as Yes
     */
    @When("Submitter User chooses FITARA Business Case Clearances as Yes")
    public void submitter_user_chooses_fitara_business_case_clearances_as_yes() {
        JavascriptUtils.scrollIntoView(oaIntakePage.dropdwnFITARA);
        CommonUtils.clickOnElement(oaIntakePage.dropdwnFITARA);
        CommonUtils.sleep(3000);
        //  JavascriptUtils.clickByJS(oaIntakePage.yesFITARA);
        CommonUtils.clickOnElement(oaIntakePage.yesFITARA);
        Actions action = new Actions(webDriver);
        action.moveByOffset(0, 0).click().build().perform();
    }

    /**
     * User chooses Have you already submitted a Business Case as Yes
     */
    @When("Submitter User chooses Have you already submitted a Business Case as Yes")
    public void submitter_user_chooses_have_you_already_submitted_a_business_case_as_yes() {
        CommonUtils.clickOnElement(oaIntakePage.drpdnHaveYouSubmittedBusCase);
        CommonUtils.clickOnElement(oaIntakePage.yesHaveYouSubmittedBusCase);
    }

    /**
     * User chooses Have you already submitted a Business Case as Yes
     *
     * @param number
     */
    @When("Submitter User inputs Business ticket number as {string}")
    public void submitter_user_inputs_business_ticket_number_as(String number) {
        CommonUtils.sendKeys(oaIntakePage.fieldBusTicketNumber, number);
    }

    /**
     * Submitter User chooses No for ISSO Clearance field
     */
    @When("Submitter User chooses No for ISSO Clearance field")
    public void submitter_user_chooses_no_for_isso_clearance_field() {
        JavascriptUtils.scrollIntoView(oaIntakePage.dropdownISSO);
        CommonUtils.clickOnElement(oaIntakePage.dropdownISSO);
        CommonUtils.clickOnElement(oaIntakePage.noISSO);
    }

    /**
     * User can enter additional comments
     */
    @When("User can enter additional comments")
    public void user_can_enter_additional_comments() {
        CommonUtils.sendKeys(oaIntakePage.fieldAdComments, "Comments");
    }

    /**
     * User can verify section text is displayed
     */
    @When("Submitter User can verify that section text is displayed")
    public void submitter_user_can_verify_that_section_text_is_displaye() {
        softAssert.assertTrue(oaIntakePage.textOAIntakeNewRecord.isDisplayed());
    }

    /**
     * User unchecks Requestor is same as Submitter option
     */
    @When("Submitter User unchecks Requestor \\(Requested For) is same as Submitter option")
    public void submitter_user_unchecks_requestor_requested_for_is_same_as_submitter_option() {
        CommonUtils.clickOnElement(oaIntakePage.checkboxRequestorSameAsSubmitter);
    }

    /**
     * User fills in Requestor field
     */
    @Then("Submitter User can fill in Requestor \\(Requested For) field as Aad Tibben")
    public void submitter_user_can_fill_in_requestor_requested_for_field_as_aad_tibben() {
        CommonUtils.clickOnElement(oaIntakePage.dropdownRequestor);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(oaIntakePage.dropdownRequestorAadTibben);
    }

    /**
     * User picks NAICS Code Status option as unknown
     */
    @When("Submitter User picks NAICS Code Status option as unknown")
    public void submitter_user_picks_naics_code_status_option_as_unknown() {
        softAssert.assertTrue(oaIntakePage.unknownOptionNAICS.isDisplayed());
    }

    /**
     * User fills in Previous Contract Number
     */
    @When("User can fill in Previous Contract Number as 263201500284B\\/75N91019F90001")
    public void user_can_fill_in_previous_contract_number_as_263201500284b_75n91019f90001() {
        CommonUtils.clickOnElement(oaIntakePage.previousContractNumberField);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(oaIntakePage.contractNumber263201500284B75N91019F90001);
        CommonUtils.sleep(5000);
    }

    /**
     * User chooses option Blanket Purchase Agreement from Recommended Contract Mechanism dropdown
     */
    @When("Submitter User chooses option Multiple Award IDIQ from Recommended Contract Mechanism dropdown")
    public void submitter_user_chooses_option_blanket_purchase_agreement_bpa_from_recommended_contract_mechanism_dropdown() {
        CommonUtils.clickOnElement(oaIntakePage.drpdownRecomContractMechanism);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(oaIntakePage.multipleAwardIDIQOption);
        ;
    }

    /**
     * User chooses Estimated Amount as two hundred fifty to seven hunderd fifty thousand
     */
    @When("User chooses Estimated Amount as two hundred fifty to seven hunderd fifty thousand")
    public void user_chooses_estimated_amount_as_two_hundred_fifty_to_seven_hunderd_fifty_thousand() {
        CommonUtils.clickOnElement(oaIntakePage.estimatedAmountDropdown);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(oaIntakePage.twoFiftySevenFifty);
    }
}