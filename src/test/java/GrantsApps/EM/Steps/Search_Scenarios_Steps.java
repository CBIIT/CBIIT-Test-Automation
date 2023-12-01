package GrantsApps.EM.Steps;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.StepImplementation.EMStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Search_Scenarios_Steps extends PageInitializer {

    @Given("User is logged in as Primary IC Coordinator")
    public void user_is_logged_in_as_primary_ic_coordinator() {
        EMStepsImplementation.user_is_logged_in_as_primary_ic_coordinator();
    }

    @Given("verifies that first and last name of logged in user {string} are shown")
    public void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user) {
        EMStepsImplementation.verifies_that_first_and_last_name_of_logged_in_user_are_shown(user);
    }

    @Given("is on {string} page")
    public void is_on_page(String expectedPageName) {
        EMStepsImplementation.verifyingUserIsOnI2EPage(expectedPageName);
    }

    @Given("is able to navigate to {string} hyperlink")
    public void is_able_to_navigate_to_hyperlink(String linkText) {
        String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();

        switch (linkText){
            case "IMPAC II ":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicFooterLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualIMPACIIPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedIMPACIIPageTitle = "eRA Modules and Services | eRA Intranet";
                Assert.assertEquals(actualIMPACIIPageTitle, expectedIMPACIIPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                break;
            case "I2E Home":
                CommonUtils.clickOnElement(manageI2EUsersPage.i2eHomeHyperlink);
                MiscUtils.sleep(3000);
                String actual_I2E_PageTitle = WebDriverUtils.webDriver.getTitle();
                String expected_I2E_PageTitle = "NCI’s IMPAC II Extension (I2E) System";
                Assert.assertEquals(actual_I2E_PageTitle, expected_I2E_PageTitle);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                MiscUtils.sleep(2000);
                break;
            case "Workbench":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicFooterLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualWorkbenchPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedWorkbenchPageTitle = "Workbench";
                Assert.assertEquals(actualWorkbenchPageTitle, expectedWorkbenchPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                MiscUtils.sleep(3000);
                break;
        }
    }

    @Given("user is able to confirm that the {string} drop down has the following options {string}, {string}, {string}")
    public void user_is_able_to_confirm_that_the_drop_down_has_the_following_options(String helpDropDown, String option1, String option2, String option3) {
        CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicFooterLinkLocator(helpDropDown));
        MiscUtils.sleep(2000);

        List<String> actualHelpDropDownValues = new ArrayList<>();
        for(WebElement option : manageI2EUsersPage.i2eHelpDropDownValues){
            actualHelpDropDownValues.add(option.getText());
        }

        List<String> expectedValues = new ArrayList<>();
        expectedValues.add(option1);
        expectedValues.add(option2);
        expectedValues.add(option3);

        Assert.assertEquals(actualHelpDropDownValues, expectedValues);

    }

    @Given("User can open respective hyperlinks {string}, {string}, {string} successfully")
    public void user_can_open_respective_hyperlinks_successfully(String userGuide, String videoTutorials, String releaseNotes) {
        String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
        for(WebElement option : manageI2EUsersPage.i2eHelpDropDownValues){
            if (option.getText().equals(userGuide)){
                option.click();
                MiscUtils.sleep(1000);
                CommonUtils.switchToNextWindow();
                String actual_EM_UserGuideTitle = webDriver.getCurrentUrl();
                System.out.println(actual_EM_UserGuideTitle);

            }
        }
    }
}
