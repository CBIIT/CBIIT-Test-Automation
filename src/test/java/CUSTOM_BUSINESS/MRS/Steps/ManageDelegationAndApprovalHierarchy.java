package CUSTOM_BUSINESS.MRS.Steps;

import CUSTOM_BUSINESS.MRS.StepsImplementation.MRS_Steps_Implementation;
import CUSTOM_BUSINESS.MRS.Utils.MRS_CommonUtils;
import CUSTOM_BUSINESS.MRS.Utils.MRS_Constants;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class ManageDelegationAndApprovalHierarchy {

    /**
     * User is logging into MRS application
     */
    @Given("User is logged in MRS application")
    public static void user_is_logged_in_mrs() {
        MRS_Steps_Implementation.user_is_logged_in_mrs();
    }

    /**
     * This method is used to log in a user with a specific role.
     * @param Admin The role of the user to be logged in.
     */
    @When("a user with {string} role is logged in")
    public void a_user_with_role_is_logged_in(String Admin) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Change User")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter First or Last Name")).fill(MRS_Constants.ADMIN_USER);
        page.getByText(MRS_Constants.ADMIN_USER).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on Manage Delegation
     */
    @And("User clicks on Manage Delegation")
    public void user_clicks_on_manage_delegation() {
        page.getByText("Manage delegation for your").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to search for a specific person
     * @param DelegateOf
     */
    @And("User searches for a {string}")
    public void user_searches_for(String DelegateOf) {
        page.locator("xpath=//input[@id='assignDelegatesFor']").click();
        page.locator("xpath=//input[@id='assignDelegatesFor']").fill(MRS_Constants.DELEGATE_OF);
        page.getByText(MRS_Constants.DELEGATE_OF).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Temporary as Delegation Type
     */
    @And("User selects Temporary as Delegation Type")
    public void user_selects_temporary_as_delegation_type() {
        page.locator("#addDelegateForm_delegateTableBean_delegateTypeTemporary").check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select a Delegate for the person
     */
    @And("User selects a Delegate for the person")
    public void user_selects_a_delegate_for_the_person() {
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(MRS_Constants.APPROVER_OR_DELEGATE_USER + " [E]")).isVisible()) {
            page.locator("//tr[td[contains(text(), '" + MRS_Constants.APPROVER_OR_DELEGATE_USER + "')]]//a[@title='Delete']").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
            page.locator("#addDelegateForm_delegateTableBean_delegateTypeTemporary").check();
        }
        MRS_CommonUtils.addDelegateOrApproverUser("xpath=//input[@id='delegateSelect']", MRS_Constants.APPROVER_OR_DELEGATE_USER);
    }

    /**
     * This method is used to enter Start and End Dates for the temporary delegate
     */
    @And("User enters Start and End Dates for the temporary delegate")
    public void user_enters_start_and_end_dates_for_the_temporary_delegate() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Start Date")).click();
        for (int i = 0; i < 1; i++) {
            page.getByTitle("Next").click();
        }
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("2").setExact(true)).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("End Date")).click();
        for (int i = 0; i < 4; i++) {
            page.getByTitle("Next").click();
        }
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("28")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Add button
     */
    @Then("User clicks on Add button")
    public void user_clicks_on_add_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on Manage Approval Hierarchy
     */
    @And("User clicks on Manage Approval Hierarchy")
    public void user_with_role_clicks_on_manage_approval_hierarchy() {
        page.getByText("Maintain the Approval").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select an Organization from the list
     * @param Organization
     */
    @And("User selects {string} from the list")
    public void user_selects_from_the_list(String Organization) {
        page.locator("xpath=//span[@id='select2-selectedOrg-container']").click();
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(Organization)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select Default Approval Type
     */
    @And("User selects Default Approval Type")
    public void user_selects_default_approval_type() {
        page.getByText("Default Approval Type: Serial").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter the Approver Name
     */
    @And("User enters the Approver Name")
    public void user_enters_the_approver_name() {
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(MRS_Constants.APPROVER_OR_DELEGATE_USER + " [E]")).isVisible()) {
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1 " + MRS_Constants.APPROVER_OR_DELEGATE_USER + " [E] NCI DCCPS")).getByRole(AriaRole.LINK).nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        }
        MRS_CommonUtils.addDelegateOrApproverUser("xpath=//input[@id='searchApprover']", MRS_Constants.APPROVER_OR_DELEGATE_USER);
    }

    /**
     * This method is used to enter the Title.
     */
    @And("User enters the Title")
    public void user_enters_the_title() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Title")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName(" Title")).fill(MRS_Constants.APPROVER_TITLE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is to click on the Save button and verify the success message
     */
    @And("User clicks on Save button and verifies the success message")
    public void user_clicks_on_save_button_and_verifies_the_success_message() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        assertThat(page.locator("#messageId")).containsText(MRS_Constants.HIERARCHY_APPROVAL_SUCCESS_MESSAGE);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on My Delegation
     */
    @When("a user clicks on My Delegation")
    public void a_user_clicks_on_my_delegation() {
        page.getByText("View or update your").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Add button and verify the Delegate is added
     */
    @Then("User clicks on Add button and verifies the delegate is added")
    public void user_clicks_on_add_button_and_verifies_the_delegate_is_added() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
        assertThat(page.locator("#delegateTable")).containsText(MRS_Constants.SECOND_APPROVER+" [E]");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select a new Delegate and delete the existing if any
     */
    @And("User selects a Delegate")
    public void user_selects_a_delegate() {
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(MRS_Constants.SECOND_APPROVER + " [E]")).isVisible()) {
            page.locator("//tr[td[contains(text(), '" + MRS_Constants.SECOND_APPROVER + "')]]//a[@title='Delete']").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
            page.locator("#addDelegateForm_delegateTableBean_delegateTypeTemporary").check();
        }
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Name")).fill(MRS_Constants.SECOND_APPROVER);
        page.getByText(MRS_Constants.SECOND_APPROVER).click();
    }

    /**
     * This method is used to click on Search Requests
     */
    @And("User clicks on Search Requests section")
    public void user_clicks_on_search_requests_section() {
        page.getByText("Search for relevant Requests").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter a value in the Requestor field
     * @param Requestor
     */
    @And("User enters {string} in the Requestor field")
    public void user_enters_in_the_requestor_field(String Requestor) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Requestor Name")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Requestor Name")).fill(Requestor);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter a value in the Approver field
     * @param Approver
     */
    @And("User enters {string} in the Approver field")
    public void user_enters_in_the_approver_field(String Approver) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Approver Name")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Approver Name")).fill(Approver);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to enter a value in the Author field
     * @param Author
     */
    @And("User enters {string} in Author field")
    public void user_enters_in_author_field(String Author) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Approver Name")).press("Tab");
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Author Name")).fill(Author);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select an Organization from the Organization field
     * @param Organization
     */
    @And("User selects {string} from the Organization field")
    public void user_selects_from_the_organization_field(String Organization) {
        page.locator(".select2-selection").first().click();
        page.getByPlaceholder("Select organization").fill(Organization);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName("☐    NCI DCCPS EGRP EEB (")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Publication Type from the Publication Type field
     * @param PubType
     */
    @And("User selects {string} from the Publication Type field")
    public void user_selects_from_the_publication_type_field(String PubType) {
        page.getByPlaceholder("Select one or more publication types").click();
        page.getByPlaceholder("Select one or more publication types").fill(PubType);
        page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName("☐Original Journal Article")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the High Profile Request option
     * @param HighProfile
     */
    @And("User Selects {string} for High Profile Request")
    public void user_selects_for_high_profile_request(String HighProfile) {
        page.locator("#criteriaHighProfile"+HighProfile).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Covid Information option
     * @param CovidInfo
     */
    @And("User selects {string} for Includes Covid Information")
    public void user_selects_for_includes_covid_information(String CovidInfo) {
        page.locator("#covid19Flag"+CovidInfo).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Clinical Trial Information option
     * @param ClinicalTrialInfo
     */
    @And("User selects {string} for Includes Clinical Trial Information")
    public void user_selects_for_includes_clinical_trial_information(String ClinicalTrialInfo) {
        page.locator("#clinicalTrialInfoFlag"+ClinicalTrialInfo).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select the Extramural Co-Authors option
     * @param ExtramuralCoAuthors
     */
    @And("User selects {string} for Includes Extramural Co-Authors")
    public void user_selects_for_includes_extramural_co_authors(String ExtramuralCoAuthors) {
        page.locator("#extraMuralCoAuthorsFlag"+ExtramuralCoAuthors).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Search button
     */
    @Then("User clicks on Search button")
    public void user_clicks_on_search_button() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search").setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to click on the Export button to export the search results
     */
    @And("User clicks on Export button to export the search results")
    public void user_clicks_on_export_button_to_export_the_search_results() {
        Download download = page.waitForDownload(() ->{
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Export")).click();
        });
    }
}