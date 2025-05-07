package CUSTOM_BUSINESS.MRS.Steps;

import CUSTOM_BUSINESS.MRS.StepsImplementation.MRS_Steps_Implementation;
import CUSTOM_BUSINESS.MRS.Utils.MRS_CommonUtils;
import CUSTOM_BUSINESS.MRS.Utils.MRS_Constants;
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
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(MRS_Constants.DELEGATE_USER + " [E]")).isVisible()) {
            page.locator("//tr[td[contains(text(), '" + MRS_Constants.DELEGATE_USER + "')]]//a[@title='Delete']").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
            page.locator("#addDelegateForm_delegateTableBean_delegateTypeTemporary").check();
        }
        MRS_CommonUtils.addDelegateOrApproverUser("xpath=//input[@id='delegateSelect']", MRS_Constants.DELEGATE_USER);
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
        if (page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName(MRS_Constants.DELEGATE_USER + " [E]")).isVisible()) {
            page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("1 " + MRS_Constants.DELEGATE_USER + " [E] NCI DCCPS")).getByRole(AriaRole.LINK).nth(1).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        }
        MRS_CommonUtils.addDelegateOrApproverUser("xpath=//input[@id='searchApprover']", MRS_Constants.DELEGATE_USER);
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
}