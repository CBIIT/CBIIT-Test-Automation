package GrantsApps.EM.StepImplementation;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.testng.Assert;

public class EMStepsImplementation extends PageInitializer {

    public void emLogin(String userName) throws TestingException {
        switch (userName) {
            case "Alena Nekrashevich":
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
                iTrustloginPage.enterPassword("nekrashevicha2Password");
                MiscUtils.sleep(3000);
                iTrustloginPage.clickSignInButton();
                MiscUtils.sleep(3000);
                break;
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

    public static void user_is_logged_in_as_primary_ic_coordinator(){
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
        iTrustLoginPageImpl.loginToITrust();
        CucumberLogUtils.logScreenshot();
    }

    public static void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user){
        String actualUser = ManageI2EUsersPage.dynamicUserTextLocator(user).getText();
        Assert.assertEquals(actualUser, user);
        CucumberLogUtils.logScreenshot();
    }

    public static void verifyingUserIsOnI2EPage(String expectedPageName){
        String actualPageName = manageI2EUsersPage.i2ePageTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        CucumberLogUtils.logScreenshot();
    }
}
