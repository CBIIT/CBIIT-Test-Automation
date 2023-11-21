package GrantsApps.EM.Steps;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.StepImplementation.EMStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import org.testng.Assert;

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
        System.out.println(WebDriverUtils.webDriver.getWindowHandle());
        CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicFooterLinkLocator(linkText));
        CommonUtils.switchToNextWindow();
        String actualPageTitle = WebDriverUtils.webDriver.getTitle();
        String expectedPageTitle = "eRA Modules and Services | eRA Intranet";
        Assert.assertEquals(actualPageTitle, expectedPageTitle);

        WebDriverUtils.webDriver.switchTo().window(emWindowHandle);

        MiscUtils.sleep(3000);
    }
}
