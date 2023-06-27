package GrantsApps.ChangePassword.Steps;

import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import GrantsApps.ChangePassword.StepsImplementation.ChangePasswordStepsImpl;
import GrantsApps.ChangePassword.Util.ReportUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChangePasswordSteps extends PageInitializer {
    public String newPassword;

    // @PasswordPolicySuccess @CHANGPASS-8
    @Given("User is on landing page")
    public void user_is_on_landing_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ChangePassword"));
        MiscUtils.sleep(1000);
        loginImpl.elizabethiTrustLogin();
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Landing page"); // do research
    }

    @Given("User enters New Password according to password policy")
    public void user_enters_New_Password_according_to_password_policy() {
        newPassword = ChangePasswordStepsImpl.generateNewPassword();
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPassword);
        ReportUtil.captureScreenshot("Entering the first field according to password policy");
    }

    @Given("User confirms New Password")
    public void user_confirms_New_Password() {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, newPassword);
        ReportUtil.captureScreenshot("Confirming the password");
    }

    @Then("User can see the successful outcome")
    public void user_can_see_the_successful_outcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.successMessage.isDisplayed());
        MiscUtils.sleep(1000);
        System.out.println("Password was changed successfully");
        ReportUtil.captureScreenshot("Successful message");
    }

    //@PasswordPolicyReuseOldPasswordFailure @CHANGPASS-11

    @Given("User is back on landing page")
    public void user_is_back_on_landing_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ChangePassword"));
    }

    @Given("User enters New Password that is the same as their old Password")
    public void user_enters_New_Password_that_is_the_same_as_their_old_Password() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPassword);
        ReportUtil.captureScreenshot("Entering the old password");
    }

    @Then("User can not change password")
    public void user_can_not_change_password() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageOldPassword.isDisplayed());
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Error Message");
    }

    // @PasswordPolicyCharacterLimitFailure @CHANGPASS-9
    @Given("User enters New Password {string} without following the character limit rule")
    public void user_enters_New_Password_without_following_the_character_limit_rule(String password) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, password);
        ReportUtil.captureScreenshot("Entering the first field without the character-limit rule");
    }

    @Given("User confirms New Password {string}")
    public void user_confirms_New_Password(String password) {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, password);
        ReportUtil.captureScreenshot("Confirming the password");
    }

    @Then("User can not see the successful outcome")
    public void user_can_not_see_the_successful_outcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageCharacterLimit.isDisplayed());
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Error Message");
    }

    //@PasswordPolicyLoginNameFailure @CHANGPASS-10
    @Given("User enters New Password with their username {string}")
    public void user_enters_New_Password_with_their_username(String username) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, username);
        ReportUtil.captureScreenshot("Entering first field that contains username");
    }


    //@PasswordPolicyUnallowedCharacters @CHANGPASS-12
    @Given("User fills in Enter New Password field with un-allowed characters {string}")
    public void user_fills_in_Enter_New_Password_field_with_un_allowed_characters(String characters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, characters);
        ReportUtil.captureScreenshot("Entering first field with un-allowed characters");
    }

    //@PasswordPolicyAllRequiredCharacters @CHANGPASS-13
    @Given("User fills in Enter New Password field without all required characters {string}")
    public void user_fills_in_Enter_New_Password_field_without_all_required_characters(String reqCharacters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, reqCharacters);
        ReportUtil.captureScreenshot("Entering first field without all required characters");
    }


}



