package GrantsApps.EM.Steps;

import appsCommon.Utils.Dynamic_Locators;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
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

    @When("tester deletes {string} role to re-run test before adding role")
    public void tester_deletes_role_to_re_run_test_before_adding_role(String role) {

        try {
            if (WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),'"+ role + "')]//parent::td//parent::tr/td)[5]/span/button")).isDisplayed()) {
                WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),'I2E Technical Support')]//parent::td//parent::tr/td)[5]/span/button")).click();
                WebDriverUtils.webDriver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
            }
        } catch (WebDriverException e) {
            System.out.println("*** ACCOUNT NOT PRESENT -- TEST CONTINUES ***");
        }


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

    @Given("User can verify that first and last name of logged in user {string} are shown")
    public void user_can_verify_that_first_and_last_name_of_logged_in_user_are_shown(String expectedName) {

        // I2E User Name locator
       String actualName = WebDriverUtils.webDriver.findElement(By.xpath("//body/app-root/app-header/lib-header/header/nav/div/div/ul/li/span[1]")).getText();
       Assert.assertEquals(actualName, expectedName);
    }

    @When("user clicks on My DOC Discrepancies")
    public void user_clicks_on_My_DOC_Discrepancies() {
        JavascriptUtils.clickByJS(manageI2EUsersPage.myDOCDiscrepancies);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User is able to navigate to and verify My DOC Discrepancies page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_my_doc_discrepancies_page_in_different_browser_tab_with_url(String expectedURL) {
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }

        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("user clicks on IMPAC II Portfolio Analysis")
    public void user_clicks_on_IMPAC_II_Portfolio_Analysis() {
        CommonUtils.clickOnElement(manageI2EUsersPage.impac2PortfolioAnalysis);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User is able to navigate to and verify IMPAC II page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_impac_ii_page_in_different_browser_tab_with_url(String expectedURL) {
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }

        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("user clicks on I{int}E Portfolio Analysis")
    public void user_clicks_on_I_E_Portfolio_Analysis(Integer int1) {
        CommonUtils.clickOnElement(manageI2EUsersPage.i2EPortfolioAnalysis);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User is able to navigate to and verify ITWoE page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_it_wo_e_page_in_different_browser_tab_with_url(String expectedURL) {
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }

        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("user clicks on Accounts Audit")
    public void user_clicks_on_Accounts_Audit() {
        CommonUtils.clickOnElement(manageI2EUsersPage.accountsAudit);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User is able to navigate to and verify Admin page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_admin_page_in_different_browser_tab_with_url(String expectedURL) {
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }

        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("user clicks on NEAR")
    public void user_clicks_on_NEAR() {
        CommonUtils.clickOnElement(manageI2EUsersPage.near);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @Then("User is able to navigate to and verify NEAR page in different browser tab with URL {string}")
    public void user_is_able_to_navigate_to_and_verify_near_page_in_different_browser_tab_with_url(String expectedURL) {
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }

        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        MiscUtils.sleep(3000);
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    @When("user now logs in as EM Representative Bin,Li")
    public void user_now_logs_in_as_EM_Representative_Bin_Li() {
        MiscUtils.sleep(5000);
        emStepsImplementation.loginAsLiBin();
    }
}

