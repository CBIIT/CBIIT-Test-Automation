package GrantsApps.ChangePassword.Steps;

import java.util.Set;

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

    // @PasswordPolicySuccess
    @Given("User is on landing page")
    public void user_is_on_landing_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ChangePassword"));
        MiscUtils.sleep(1000);
        loginImpl.elizabethiTrustLogin();
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Landing page"); // do research
    }

    @Given("User fills in Enter New Password field according to the rules")
    public void user_fills_in_Enter_New_Password_field_according_to_the_rules() {
        newPassword = ChangePasswordStepsImpl.generateNewPassword();
        CommonUtils.sendKeys(changePasswordPage.passwordFieldOne, newPassword);
        MiscUtils.sleep(3000);
        ReportUtil.captureScreenshot("Entering the first field ");

    }

    @Given("User fills in Confirm New Password field according to the rules")
    public void user_fills_in_Confirm_New_Password_field_according_to_the_rules() {
        MiscUtils.sleep(3000);
        CommonUtils.click(changePasswordPage.passwordFieldTwo);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeys(changePasswordPage.passwordFieldTwo, newPassword);
        ReportUtil.captureScreenshot("Entering the second field ");
    }

    @Then("User can see the successfull outcome")
    public void user_can_see_the_successfull_outcome() {
        CommonUtils.click(changePasswordPage.changeButton);
        MiscUtils.sleep(5000);
        Assert.assertTrue(changePasswordPage.successMessage.isDisplayed());
        MiscUtils.sleep(1000);
        System.out.println("Password was changed successfully");
        ReportUtil.captureScreenshot("Successful message");
    }

    // @PasswordPolicyFailure
    @Given("User enters New Password {string} without following the character limit rule")
    public void user_enters_New_Password_without_following_the_character_limit_rule(String password) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, password);
        ReportUtil.captureScreenshot("Entering the first field without the character-limit rule");
    }

    @Given("User confirms New Password {string}")
    public void user_confirms_New_Password(String password) {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, password);
        ReportUtil.captureScreenshot("Entering the second field without the character-limit rule");
    }

    @Then("User can not see the successful outcome")
    public void user_can_not_see_the_successful_outcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageCharacterLimit.isDisplayed());
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Error Message");
    }

    //@PasswordPolicyLoginNameFailure
    @Given("User fills in Enter New Password field with his login name")
    public void user_fills_in_Enter_New_Password_field_with_his_login_name() {
        CommonUtils.sendKeys(changePasswordPage.passwordFieldOne, "Kaurs312345678990");
        MiscUtils.sleep(3000);
        ReportUtil.captureScreenshot("Entering first field with user's login name");

    }

    @Given("User fills in Confirm New Password field with his login name")
    public void user_fills_in_Confirm_New_Password_field_with_his_login_name() {
        MiscUtils.sleep(3000);
        CommonUtils.click(changePasswordPage.passwordFieldTwo);
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(changePasswordPage.passwordFieldTwo, "Kaurs312345678990");
        ReportUtil.captureScreenshot("Entering second field with user's login name");

    }

    //@PasswordPolicyReuseOldPasswordFailure
    @Given("User fills in Enter New Password field with his Old Password")
    public void user_fills_in_Enter_New_Password_field_with_his_Old_Password() {
        CommonUtils.sendKeys(changePasswordPage.passwordFieldOne, "ChangePassword!234");
        MiscUtils.sleep(2000);

    }

    @Given("User fills in Confirm New Password field with his Old Password")
    public void user_fills_in_Confirm_New_Password_field_with_his_Old_Password() {
        MiscUtils.sleep(2000);
        CommonUtils.click(changePasswordPage.passwordFieldTwo);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeys(changePasswordPage.passwordFieldTwo, "ChangePassword!234");
    }

    @Then("User can not reuse old password")
    public void user_can_not_reuse_old_password() {
        CommonUtils.click(changePasswordPage.changeButton);
        MiscUtils.sleep(5000);
        Assert.assertTrue(changePasswordPage.failureMessageOldPassword.isDisplayed());
        String text = changePasswordPage.failureMessageOldPassword.getText();
        System.out.println("Error message  " + text);
        MiscUtils.sleep(1000);
        ReportUtil.captureScreenshot("Error message");
    }

    //@PasswordPolicyUnallowedCharacters
    @Given("User fills in Enter New Password field with unallowed characters")
    public void user_fills_in_Enter_New_Password_field_with_unallowed_characters() {
        CommonUtils.sendKeys(changePasswordPage.passwordFieldOne, "ChangeePasswo& 1");
        MiscUtils.sleep(3000);
    }

    @Given("User fills in Confirm New Password field with unallowed characters")
    public void user_fills_in_Confirm_New_Password_field_with_unallowed_characters() {
        MiscUtils.sleep(2000);
        CommonUtils.click(changePasswordPage.passwordFieldTwo);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeys(changePasswordPage.passwordFieldTwo, "ChangeePasswo& 1");
    }

    //@PasswordPolicyWithoutAllAllowedCharacters
    @Given("User fills in Enter New Password field without all allowed characters")
    public void user_fills_in_Enter_New_Password_field_without_all_allowed_characters() {
        CommonUtils.sendKeys(changePasswordPage.passwordFieldOne, "changepassword12");
        MiscUtils.sleep(3000);
    }

    @Given("User fills in Confirm New Password field without all allowed characters")
    public void user_fills_in_Confirm_New_Password_field_without_all_allowed_characters() {
        MiscUtils.sleep(2000);
        CommonUtils.click(changePasswordPage.passwordFieldTwo);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeys(changePasswordPage.passwordFieldTwo, "changepassword12");
    }


}



