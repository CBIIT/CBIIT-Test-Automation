package GrantsApps.EM.Steps;

import appsCommon.DynamicLocators;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
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
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    @When("User inputs {string} into the Name field and clicks search")
    public void user_inputs_into_the_name_field_and_clicks_search(String name) {
        CommonUtils.sendKeys(manageI2EUsersPage.nameField, name);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
        CommonUtils.clickOnElement(manageI2EUsersPage.searchButtonI2ESearch);
        MiscUtils.sleep(3000);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String text) {
        CommonUtils.clickOnElement(DynamicLocators.dynamicContainsTextLocator(text));
        MiscUtils.sleep(1000);
    }

    @When("selects {string} from I2E Role drop down")
    public void selects_from_i2e_role_drop_down(String text) {
        CommonUtils.click(manageI2EUsersPage.I2ERoleDropD);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.I2ERoleDropDownTextBox, text);
        CommonUtils.sendKeys(manageI2EUsersPage.I2ERoleDropDownTextBox, Keys.ENTER);
    }

    @When("selects {string} from Role Organization drop down")
    public void selects_from_role_organization_drop_down(String text) {
        CommonUtils.clickOnElement(manageI2EUsersPage.roleOrganizationDropDown);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.roleOrganizationDropDown, text);
        CommonUtils.clickOnElement(DynamicLocators.dynamicContainsTextLocatorWithSpanTagName(text));

        //CommonUtils.sendKeys(manageI2EUsersPage.I2ERoleDropDownTextBox, Keys.ENTER);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}
