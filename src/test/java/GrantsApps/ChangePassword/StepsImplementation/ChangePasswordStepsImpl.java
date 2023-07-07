package GrantsApps.ChangePassword.StepsImplementation;

import java.util.Random;
import GrantsApps.ChangePassword.Steps.HooksSteps;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;

public class ChangePasswordStepsImpl extends PageInitializer {
    public static String newPassword = generateNewPassword();
    public static String newPasswordTwo = generateNewPassword();

    public static String generateNewPassword() {
        int len = 20;
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                + "jklmnopqrstuvwxyz!";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public static void userIsOnLandingPage(String url) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(url));
        loginImpl.elizabethiTrustLogin();
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userEntersNewPasswordAccordingToPasswordPolicy() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPassword);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userConfirmsNewPassword() {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, newPassword);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userCanSeeTheSuccessfulOutcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.successMessage.isDisplayed());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userIsBackOnLandingPage() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ChangePassword"));
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userEntersNewPasswordThatIsTheSameAsTheirOldPassword() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPasswordTwo);
    }

    public static void userCanNotChangePassword() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageOldPassword.isDisplayed());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userEntersNewPasswordWithoutFollowingTheCharacterLimitRule(String password) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, password);
    }

    public static void userConfirmsNewPassword(String password) {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, password);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userCanNotSeeTheSuccessfulOutcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageCharacterLimit.isDisplayed());
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void userEntersNewPasswordWithTheirUsername(String username) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, username);
    }

    public static void userFillsInEnterNewPasswordFieldWithUnAllowedCharacters(String characters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, characters);
    }

    public static void userFillsInEnterNewPasswordFieldWithoutAllRequiredCharacters(String reqCharacters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, reqCharacters);
    }

    public static void entersNewPasswordAccordingToPasswordPolicy() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPasswordTwo);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }

    public static void confirmsNewPassword() {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, newPasswordTwo);
        CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
    }
}