package CUSTOM_BUSINESS.MRS.Steps;

import CUSTOM_BUSINESS.MRS.Utils.MRS_Constants;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Paths;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class RequestForm {

    public static String requestNumber;

    /**
     * This method is used to click on Create Request button
     */
    @When("User clicks on Create Request button")
    public void user_clicks_on_create_request_button() {
        page.getByText("Submit a new request for").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Request Title
     */
    @And("User enters a Request Title")
    public void user_enters_a_request_title() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Request Title:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Request Title:")).fill(MRS_Constants.REQUEST_TITLE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Requestor name
     * @param Requestor
     */
    @And("User enters {string} in Requestor field")
    public void user_enters_in_requestor_field(String Requestor) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Requestor:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Requestor:")).fill(Requestor);
        page.locator("div.ui-menu-item-wrapper", new Page.LocatorOptions().setHasText(Requestor)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Requestor title
     * @param Title
     */
    @And("User enters {string} as the requestor title")
    public void user_enters_as_the_requestor_title(String Title) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Title:").setExact(true)).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Title:").setExact(true)).fill(Title);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Yes radio button for Do you want to submit On Behalf Of another NCI Division?
     * @param RadioButton
     */
    @And("User selects {string} for Do you want to submit On Behalf Of another NCI Division?")
    public void user_selects_for_do_you_want_to_submit_on_behalf_of_another_nci_division_office_center(String RadioButton) {
        String OnBehalfOfLocator = "//input[@id='onBehalfOf" + RadioButton + "']";
        page.locator("xpath=" + OnBehalfOfLocator).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Organization name for which the user is working on behalf of
     * @param Organization
     */
    @And("User provides {string} in the organization field for which they are working on behalf of")
    public void user_provides_in_the_organization_field_for_which_they_are_working_on_behalf_of(String Organization) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Organization:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Organization:")).fill(Organization);
        page.getByText("NCI DCCPS BRP ( BEHAVIORAL").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Publication Type
     * @param PublicationType
     */
    @And("User selects {string} for Publication Type")
    public void user_selects_for_publication_type(String PublicationType) {
        page.getByLabel("Publication Type:").click();
        page.getByLabel("Publication Type:").selectOption(PublicationType);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Journal or Book Name
     * @param BookName
     */
    @And("User enters {string} in Journal or Book Name")
    public void user_enters_in_journal_or_book_name(String BookName) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Journal or Book Name:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Journal or Book Name:")).fill(BookName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is to select the Yes radio button for any associated fees
     * @param Fees
     */
    @And("User selects {string} for any associated fees")
    public void user_selects_for_any_associated_fees(String Fees) {
        page.locator("#associatedFees"+Fees).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Amount
     * @param Amount
     */
    @And("User enters {string} in the Amount field")
    public void user_enters_in_the_amount_field(String Amount) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Amount:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Amount:")).fill(Amount);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select NIH Authors
     * @param NIHAuthors
     */
    @And("User selects {string} as NIH Authors")
    public void user_selects_as_nih_authors(String NIHAuthors) {
        page.getByPlaceholder("Search and add NIH Authors").click();
        page.getByPlaceholder("Search and add NIH Authors").fill(NIHAuthors);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(NIHAuthors)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter Non NIH Authors
     * @param NonNIHAuthors
     */
    @And("User enters {string} as Non NIH Authors")
    public void user_enters_as_non_nih_authors(String NonNIHAuthors) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Non NIH Authors: (Separate")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Non NIH Authors: (Separate")).fill(NonNIHAuthors);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select NCI Researchers as Author Type
     * @param AuthorType
     */
    @And("User selects {string} as the Author Type")
    public void user_selects_nci_researchers_as_the_author_type(String AuthorType) {
        page.getByLabel("Author Type:").selectOption(AuthorType);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select No for the BIAS question
     */
    @And("User selects No for the BIAS question")
    public void user_selects_for_the_bias_question() {
        page.locator("#biasNo").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select NIH Represented Organizations
     * @param NIHRepresentedOrganizations
     */
    @And("User selects {string} as NIH Represented Organizations")
    public void user_selects_as_nih_represented_organizations(String NIHRepresentedOrganizations) {
        page.getByPlaceholder("Search and add NIH").click();
        page.getByPlaceholder("Search and add NIH").fill(NIHRepresentedOrganizations);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(NIHRepresentedOrganizations)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Grants or Contract Number
     * @param GrantsOrContractNumber
     */
    @And("User enters {string} as the Grants or Contract Number")
    public void user_enters_as_the_grants_or_contract_number(String GrantsOrContractNumber) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Grants/Contract #:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Grants/Contract #:")).fill(GrantsOrContractNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Journal Impact Factor
     * @param JournalImpactFactor
     */
    @And("User enters {string} as the Journal Impact Factor")
    public void user_enters_as_the_journal_impact_factor(String JournalImpactFactor) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Journal Impact Factor:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Journal Impact Factor:")).fill(JournalImpactFactor);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select No for the High Profile or Controversial Content question
     * @param YesOrNo
     */
    @And("User selects {string} for Does this Request address any high profile or controversial content?")
    public void user_selects_no_for_does_this_request_address_any_high_profile_or_controversial_content(String YesOrNo) {
        page.locator("#highProfile"+YesOrNo).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select No for the Clinical Trial Information question
     * @param ManuscriptInvolvement
     */
    @And("User selects {string} for Does this manuscript involve clinical trial information?")
    public void user_selects_for_does_this_manuscript_involve_clinical_trial_information(String ManuscriptInvolvement) {
        page.locator("#clinicalTrialRadio"+ManuscriptInvolvement).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to upload a document
     */
    @And("User clicks on Choose File button to upload a document")
    public void user_clicks_on_choose_file_button_to_upload_a_document() {
        page.locator("#upload").setInputFiles(Paths.get(MRS_Constants.TEST_FILE_PATH));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to Serial as Approval Type
     */
    @And("User selects {string} as Approval Type")
    public void user_selects_serial_as_approval_type(String ApprovalType) {
        page.getByText(ApprovalType).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Additional Approver
     * @param AdditionalApprover
     */
    @And("User selects {string} as additional approver")
    public void user_selects_as_additional_approver(String AdditionalApprover) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).fill(AdditionalApprover);
        page.getByText(AdditionalApprover).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Submit for verification button
     */
    @Then("User clicks on Submit for Verification button")
    public void user_clicks_on_submit_for_verification_button() {
        page.locator("#VerifyRequestAlt").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to impersonate as a different user
     * @param DCCPSUser
     */
    @When("User impersonates as {string}")
    public void user_impersonates_as(String DCCPSUser) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Change User")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter First or Last Name")).fill(DCCPSUser);
        page.getByText(DCCPSUser).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the explanation for the request
     * @param Explanation
     */
    @And("User enters {string} as the explanation")
    public void user_enters_as_the_explanation(String Explanation) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Comment(s) (Provide")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Comment(s) (Provide")).fill(Explanation);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the radio button for Does this manuscript or abstract involve a Clinical Study with a CTEP or NIH Trial?
     * @param Protocol
     */
    @And("User selects {string} for Does this manuscript or abstract involve a Clinical Study with a CTEP or NIH Trial?")
    public void user_selects_yes_for_does_this_manuscript_or_abstract_involve_a_clinical_study_with_a_ctep_or_nih_trial(String Protocol) {
        page.locator("#clinicalStudyProtocol"+Protocol).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the CTEP or NIH Clinical Trial Number
     * @param CTEPOrNIHClinicalTrialNumber
     */
    @And("User enters {string} as the CTEP or NIH Clinical Trial Number")
    public void user_enters_as_the_ctep_or_nih_clinical_trial_number(String CTEPOrNIHClinicalTrialNumber) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" CTEP/NIH Clinical Trial #:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" CTEP/NIH Clinical Trial #:")).fill(CTEPOrNIHClinicalTrialNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the radio button for Is the study exempt from being considered human subjects research?
     * @param ExemptedOrNot
     */
    @And("User selects {string} for Clinical Exemption: Is the study exempt from being considered human subjects research?")
    public void user_selects_yes_for_clinical_exemption_is_the_study_exempt_from_being_considered_human_subjects_research(String ExemptedOrNot) {
        page.locator("#clinicalExcemptionFlag"+ExemptedOrNot).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Submit for Approval button
     */
    @Then("User clicks on Submit for Approval button")
    public void user_clicks_on_submit_for_approval_button() {
        page.locator("#submitForApprovalRequestAlt").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to navigate to the Active Requests queue and select an existing request
     */
    @When("User selects an existing request")
    public void user_selects_an_existing_request() {
        page.getByText("View your active and/or").click();
        page.locator("(//*[@title='View Details'])[2]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
    *  This method is used to click on Additional Approver
    */
    @And("User clicks on Add Additional Approver")
    public void user_clicks_on_add_additional_approver() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select an additional approver from the list
     * @param AdditionalApprover
     */
    @And("User selects {string} as the additional approver")
    public void user_selects_as_the_additional_approver(String AdditionalApprover) {
         if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(AdditionalApprover)).isVisible()) {
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(AdditionalApprover)).getByRole(AriaRole.LINK).click();
            CucumberLogUtils.playwrightScreenshot(page);
        }
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).fill(AdditionalApprover);
        page.getByText("ELLISON, GARY [E] - NCI DCCPS").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Save button
     */
    @And("User clicks on Save button")
    public void user_clicks_on_save_button() {
        page.locator("#saveRequestAlt").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify that the additional approver is listed in the request details
     * @param AdditionalApprover
     */
    @Then("User verifies that {string} is listed as an additional approver in the request details")
    public void user_verifies_that_is_listed_as_an_additional_approver_in_the_request_details(String AdditionalApprover) {
        assertThat(page.locator("#mrsUserMessage")).containsText("has been Saved.");
        assertThat(page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(AdditionalApprover+" [E]"))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to delete a request
     */
    @When("the user selects the option to Delete the request")
    public void the_user_selects_the_option_to_the_request() {
        requestNumber = page.getByRole(AriaRole.GRIDCELL).first().textContent().trim();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("")).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to confirm the delete operation
     */
    @And("the user confirms the delete operation")
    public void the_user_confirms_the_delete_operation() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete Request")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify that the request has been deleted successfully
     */
    @And("the system displays a success message stating the request has been deleted")
    public void the_system_displays_a_success_message_stating_the_request_has_been_deleted() {
        assertThat(page.getByRole(AriaRole.PARAGRAPH)).containsText("Request " + requestNumber + " has been Deleted.");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify that the deleted request no longer appears in the Active Requests queue for the submitter or requestor and their delegates
     */
    @Then("the Active Requests queue for the submitter or requestor and their delegates no longer displays the deleted request")
    public void the_queue_for_the_submitter_requestor_and_their_delegates_no_longer_displays_the_deleted_request() {
        assertThat(page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName(requestNumber))).not().isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to log in as a requestor
     */
    @When("a requestor is logged in")
    public void a_requestor_is_logged_in() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Change User")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter First or Last Name")).fill(MRS_Constants.DELEGATE_OF);
        page.getByText(MRS_Constants.DELEGATE_OF).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select an existing request from the My Queue
     */
    @And("User selects an existing request from My Queue")
    public void user_selects_an_existing_request_from_my_queue() {
        page.getByText("View your active and/or").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("View Details")).first().click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the request status prior to submission
     * @param RequestStatusPriorSubmission
     */
    @And("User verifies that the request status is {string}")
    public void user_verifies_that_the_request_status_is(String RequestStatusPriorSubmission) {
        assertThat(page.locator("#requestForm")).containsText(RequestStatusPriorSubmission);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to verify the request status after submission
     * @param RequestStatusAfterSubmission
     */
    @And("User verifies the status is updated to {string}")
    public void user_verifies_the_status_is_updated_to(String RequestStatusAfterSubmission) {
        assertThat(page.locator("#panel10")).containsText(RequestStatusAfterSubmission);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select a request from the Approval Queue
     */
    @When("User selects a request from the Approval Queue")
    public void user_selects_a_request_from_the_approval_queue() {
        page.getByText("View your active and/or").click();
        page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("APPROVAL QUEUE")).click();
        page.locator("//tr[@class='odd']//img[@alt='Process Request']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Approve action from the dropdown
     */
    @And("User selects Approve action from the dropdown")
    public void user_selects_approve_action_from_the_dropdown() {
        page.locator("//select[@id='selectAction']").selectOption(new SelectOption().setLabel("Approve"));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter comments in the comment field
     * @param Comments
     */
    @And("User enters {string} in the comments field")
    public void user_enters_in_the_comments_field(String Comments) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Comments. Max length =")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter Comments. Max length =")).fill(Comments);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Process Action button
     */
    @Then("User clicks on Process Action button")
    public void user_clicks_on_process_action_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Process Action")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to log in as a second approver with an Admin role
     */
    @When("a second approver with Admin role is logged in")
    public void a_second_approver_with_admin_role_is_logged_in() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Change User")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter First or Last Name")).fill(MRS_Constants.SECOND_APPROVER);
        page.getByText(MRS_Constants.SECOND_APPROVER).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Return for Revision action from the dropdown
     */
    @And("User selects Return for Revision action from the dropdown")
    public void user_selects_return_for_revision_action_from_the_dropdown() {
        page.locator("//select[@id='selectAction']").selectOption(new SelectOption().setLabel("Return for Revision"));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to confirm the Return for Revision action
     */
    @Then("User confirms the Return for Revision")
    public void user_confirms_the_return_for_revision() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Return for Revision")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Disapprove action from the dropdown
     */
    @And("User selects Disapprove action from the dropdown")
    public void user_selects_disapprove_action_from_the_dropdown() {
        page.locator("//select[@id='selectAction']").selectOption(new SelectOption().setLabel("Disapprove"));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Withdraw button
     */
    @And("User clicks on Withdraw button")
    public void user_clicks_on_withdraw_button() {
        page.locator("#withdrawRequest").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to provide a reason for withdrawal
     */
    @And("User provides a reason for withdrawal")
    public void user_provides_a_reason_for_withdrawal() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Comments:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Comments:")).fill(MRS_Constants.COMMENTS);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Withdraw button on the Withdrawal window
     */
    @Then("User clicks on Withdraw Request button")
    public void user_clicks_on_withdraw_request_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Withdraw Request")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}