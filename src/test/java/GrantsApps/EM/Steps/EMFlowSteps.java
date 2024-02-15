package GrantsApps.EM.Steps;

import appsCommon.Utils.Dynamic_Locators;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class EMFlowSteps extends PageInitializer {

    @Given("User is logged in as Primary ITwoE Coordinator {string}")
    public void user_is_logged_in_as_Primary_ITwoE_Coordinator(String userName) throws TestingException {
        emStepsImplementation.emLogin(userName);
    }

    @Given("User is on Manage I{int}E Users page")
    public void user_is_on_Manage_I_E_Users_page(Integer int1) {
        CommonUtils.assertTrue(manageI2EUsersPage.i2EPageTitle.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    @When("User inputs {string} into the Name field and clicks search")
    public void user_inputs_into_the_name_field_and_clicks_search(String name) {
        CommonUtils.sendKeys(manageI2EUsersPage.nameField, name);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(manageI2EUsersPage.searchButtonI2ESearch);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String text) {
        CommonUtils.clickOnElement(Dynamic_Locators.dynamicContainsTextLocator(text));
        MiscUtils.sleep(1000);
    }

    @When("selects {string} from I2E Role drop down")
    public void selects_from_i2e_role_drop_down(String text) {
        CommonUtils.clickOnElement(manageI2EUsersPage.I2ERoleDropD);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.I2ERoleDropDownTextBox, text);
        CommonUtils.sendKeys(manageI2EUsersPage.I2ERoleDropDownTextBox, Keys.ENTER);
    }

    @When("selects {string} from Role Organization drop down")
    public void selects_from_role_organization_drop_down(String text) {
        CommonUtils.clickOnElement(manageI2EUsersPage.roleOrganizationDropDown);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.roleOrganizationDropDown, text);
        CommonUtils.clickOnElement(Dynamic_Locators.dynamicContainsTextLocatorWithSpanTagName(text));
        CucumberLogUtils.logScreenshot();
    }

    @Then("User clicks on Add Role button Inside Module")
    public void user_clicks_on_Add_Role_button_Inside_Module() {
        CommonUtils.clickOnElement(manageI2EUsersPage.addRoleButtonInsideModule);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User can verify that the ItwoE Technical Support Role is displayed in the Active User Roles grid")
    public void user_can_verify_that_the_I_E_Technical_Support_Role_is_displayed_in_the_Active_User_Roles_grid() {
        Assert.assertTrue(accountDetailsPage.i2eTechSupportRoleDisplayed.isDisplayed());
    }

    @When("User clicks Add Role button")
    public void user_clicks_Add_Role_button() {
        CommonUtils.clickOnElement(accountDetailsPage.addRole);
        CucumberLogUtils.logScreenshot();
    }

    @When("User clicks I2E Role drop down")
    public void user_clicks_I_E_Role_drop_down() {
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(accountDetailsPage.I2ERoleDropDown);
    }

    @When("User selects  I2E Technical Support Role")
    public void user_selects_I_E_Technical_Support_Role() {
        CommonUtils.clickOnElement(accountDetailsPage.technicalSupportRole);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("warning message with user {string} displays with {string}")
    public void warning_message_with_user_displays_with(String user, String message) {
        System.out.println(accountDetailsPage.duplicateRoleWarningMessage.getText());
        Assert.assertTrue(accountDetailsPage.duplicateRoleWarningMessage.getText().contains(user));
        Assert.assertTrue(accountDetailsPage.duplicateRoleWarningMessage.getText().contains(message));
        CucumberLogUtils.logScreenshot();
    }

    @Then("User saves ITwoE Technical Support Role that was added role")
    public void user_saves_ITwoE_Technical_Support_Role_that_was_added_role() {
        CommonUtils.clickOnElement(accountDetailsPage.addRoleModalClose);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(accountDetailsPage.saveChangesButton);
        MiscUtils.sleep(2000);
    }
}

