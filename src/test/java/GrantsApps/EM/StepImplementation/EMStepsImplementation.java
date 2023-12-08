package GrantsApps.EM.StepImplementation;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.Utils.EM_Constants;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class EMStepsImplementation extends PageInitializer {

    public void emLogin(String userName) throws TestingException {
        switch (userName) {
            case "Elizabeth Andreyev":
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "andreyeveUsername");
                iTrustloginPage.enterPassword("andreyevePassword");
                MiscUtils.sleep(3000);
                iTrustloginPage.clickSignInButton();
                MiscUtils.sleep(3000);
                break;
            case "Diego Juarez":
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
                iTrustloginPage.enterPassword("Password");
                MiscUtils.sleep(3000);
                iTrustloginPage.clickSignInButton();
                MiscUtils.sleep(3000);
                break;
            default:
                throw new RuntimeException("***** NOT VALID USER *****");
        }
    }

    public static void user_is_logged_in_as_primary_ic_coordinator() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
        iTrustLoginPageImpl.loginToITrust();
        CucumberLogUtils.logScreenshot();
    }

    public static void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user) {
        String actualUser = ManageI2EUsersPage.dynamicUserTextLocator(user).getText();
        Assert.assertEquals(actualUser, user);
        CucumberLogUtils.logScreenshot();
    }

    public static void verifyingUserIsOnI2EPage(String expectedPageName) {
        String actualPageName = manageI2EUsersPage.i2ePageTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        CucumberLogUtils.logScreenshot();
    }

    public static void is_able_to_navigate_to_hyperlink(String linkText) {
        String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();

        switch (linkText) {
            case "IMPAC II ":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualIMPACIIPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedIMPACIIPageTitle = EM_Constants.IMPAC_II_PAGE_TITLE;
                Assert.assertEquals(actualIMPACIIPageTitle, expectedIMPACIIPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                break;
            case "I2E Home":
                CommonUtils.clickOnElement(manageI2EUsersPage.i2eHomeHyperlink);
                MiscUtils.sleep(3000);
                String actual_I2E_PageTitle = WebDriverUtils.webDriver.getTitle();
                String expected_I2E_PageTitle = EM_Constants.I2E_HOME_PAGE_TITLE;
                Assert.assertEquals(actual_I2E_PageTitle, expected_I2E_PageTitle);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                MiscUtils.sleep(2000);
                break;
            case "Workbench":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualWorkbenchPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedWorkbenchPageTitle = EM_Constants.WORKBENCH_PAGE_TITLE;
                Assert.assertEquals(actualWorkbenchPageTitle, expectedWorkbenchPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                MiscUtils.sleep(3000);
                break;
        }
    }

    public static void verifyingHelpDropDownOptions(String helpDropDown, String option1, String option2, String option3) {
        CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(helpDropDown));
        MiscUtils.sleep(2000);

        List<String> actualHelpDropDownValues = new ArrayList<>();
        for (WebElement option : manageI2EUsersPage.i2eHelpDropDownValues) {
            actualHelpDropDownValues.add(option.getText());
        }

        List<String> expectedValues = new ArrayList<>();
        expectedValues.add(option1);
        expectedValues.add(option2);
        expectedValues.add(option3);

        Assert.assertEquals(actualHelpDropDownValues, expectedValues);
    }

    public static void verifyingHelpDropDownUrls(String hyperlinkText, String URL) {
        String emMainWindowHandle = webDriver.getWindowHandle();
        ManageI2EUsersPage.dynamicLinkLocator("Help ").click();
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(ManageI2EUsersPage.dynamicLinkLocator(hyperlinkText));
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(webDriver.getCurrentUrl(), URL);
        webDriver.switchTo().window(emMainWindowHandle);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
    }

    public static void verifyingContactOptions(String option1, String option2) {
        ManageI2EUsersPage.dynamicLinkLocator("Contact ").click();
        MiscUtils.sleep(2000);
        String actualEmailTechnicalSupportText = ManageI2EUsersPage.dynamicLinkLocator(option1).getText();
        Assert.assertEquals(actualEmailTechnicalSupportText, option1.trim());
        String actualEmailBusinessPolicyText = ManageI2EUsersPage.dynamicLinkLocator(option2).getText();
        Assert.assertEquals(actualEmailBusinessPolicyText, option2.trim());
        CucumberLogUtils.logScreenshot();
    }

    public static void selects_values_in_i2e_account_status_drop_down_list(String text) {
        CommonUtils.waitForVisibility(manageI2EUsersPage.i2eAccountStatus);
        manageI2EUsersPage.i2eAccountStatus.click();
        CommonUtils.selectValueFromBootStrapDropDown(manageI2EUsersPage.i2eAccountStatusValues, text);
        MiscUtils.sleep(2000);
    }

    public static void clicks_create_on_the_first_record_in_the_results() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        JavascriptUtils.clickByJS(manageI2EUsersPage.createButton);
        MiscUtils.sleep(2000);
    }

    public static void user_can_verify_the_page_name_is(String expectedPageName) {
        String actualPageName = manageI2EUsersPage.createNewAccountTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        CucumberLogUtils.logScreenshot();
    }
}