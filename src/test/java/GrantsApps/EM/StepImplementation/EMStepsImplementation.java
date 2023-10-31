package GrantsApps.EM.StepImplementation;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

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
}
