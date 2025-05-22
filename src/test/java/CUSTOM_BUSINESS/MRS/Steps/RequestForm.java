package CUSTOM_BUSINESS.MRS.Steps;

import CUSTOM_BUSINESS.MRS.Utils.MRS_Constants;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Paths;
import static com.nci.automation.web.PlaywrightUtils.page;

public class RequestForm {

    @When("User clicks on Create Request button")
    public void user_clicks_on_create_request_button() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Submit a new request for")).locator("div").nth(4).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters the {string} as Request Title")
    public void user_enters_the_as_request_title(String RequestTitle) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Request Title:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Request Title:")).fill(RequestTitle);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} in Requestor field")
    public void user_enters_in_requestor_field(String Requestor) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Requestor:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Requestor:")).fill(Requestor);
        page.getByText(Requestor).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} as the requestor title")
    public void user_enters_as_the_requestor_title(String Title) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Title:").setExact(true)).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Title:").setExact(true)).fill(Title);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} for Do you want to submit On Behalf Of another NCI Division?")
    public void user_selects_for_do_you_want_to_submit_on_behalf_of_another_nci_division_office_center(String YesRadioButton) {
        page.locator("#requestorSummaryGroup").getByText(YesRadioButton).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User provides {string} in the organization field for which they are working on behalf of")
    public void user_provides_in_the_organization_field_for_which_they_are_working_on_behalf_of(String Organization) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Organization:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("  Organization:")).fill(Organization);
        page.getByText("NCI DCCPS BRP ( BEHAVIORAL").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} for Publication Type")
    public void user_selects_for_publication_type(String PublicationType) {
        page.getByLabel("Publication Type:").click();
        page.getByLabel("Publication Type:").selectOption(PublicationType);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} in Journal or Book Name")
    public void user_enters_in_journal_or_book_name(String BookName) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Journal or Book Name:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Journal or Book Name:")).fill(BookName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} for any associated fees")
    public void user_selects_for_any_associated_fees(String AssociatedFees) {
        page.locator("#publicationSummaryGroup").getByText(AssociatedFees).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} in the Amount field")
    public void user_enters_in_the_amount_field(String Amount) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Amount:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Amount:")).fill(Amount);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} as NIH Authors")
    public void user_selects_as_nih_authors(String NIHAuthors) {
        page.getByPlaceholder("Search and add NIH Authors").click();
        page.getByPlaceholder("Search and add NIH Authors").fill(NIHAuthors);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(NIHAuthors)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} as Non NIH Authors")
    public void user_enters_as_non_nih_authors(String NonNIHAuthors) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Non NIH Authors: (Separate")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Non NIH Authors: (Separate")).fill(NonNIHAuthors);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @When("User selects {string} as the Author Type")
    public void user_selects_nci_researchers_as_the_author_type(String AuthorType) {
        page.getByLabel("Author Type:").selectOption(AuthorType);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects No for the BIAS question")
    public void user_selects_for_the_bias_question() {
        page.locator("#biasNo").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} as NIH Represented Organizations")
    public void user_selects_as_nih_represented_organizations(String NIHRepresentedOrganizations) {
        page.getByPlaceholder("Search and add NIH").click();
        page.getByPlaceholder("Search and add NIH").fill(NIHRepresentedOrganizations);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(NIHRepresentedOrganizations)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} as the Grants or Contract Number")
    public void user_enters_as_the_grants_or_contract_number(String GrantsOrContractNumber) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Grants/Contract #:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Grants/Contract #:")).fill(GrantsOrContractNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User enters {string} as the Journal Impact Factor")
    public void user_enters_as_the_journal_impact_factor(String JournalImpactFactor) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Journal Impact Factor:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Journal Impact Factor:")).fill(JournalImpactFactor);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects No for Does this Request address any high profile or controversial content?")
    public void user_selects_no_for_does_this_request_address_any_high_profile_or_controversial_content() {
        page.locator("#highProfileNo").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects No for Does this manuscript involve clinical trial information?")
    public void user_selects_for_does_this_manuscript_involve_clinical_trial_information() {
        page.locator("#clinicalTrialRadioNo").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User clicks on Choose File button to upload a document")
    public void user_clicks_on_choose_file_button_to_upload_a_document() {
        page.locator("#upload").setInputFiles(Paths.get(MRS_Constants.TEST_FILE_PATH));
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects Serial as Approval Type")
    public void user_selects_serial_as_approval_type() {
        page.locator("xpath=//input[@name='mrsRequest.approvalType.id' and @id=51]").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @And("User selects {string} as additional approver")
    public void user_selects_as_additional_approver(String AdditionalApprover) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Add Additional Approvers:")).fill(AdditionalApprover);
        page.getByText(AdditionalApprover).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("User clicks on Submit for Verification button")
    public void user_clicks_on_submit_for_verification_button() {
        page.locator("#VerifyRequestAlt").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}

