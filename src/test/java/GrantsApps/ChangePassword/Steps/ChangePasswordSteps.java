package GrantsApps.ChangePassword.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import GrantsApps.ChangePassword.StepsImplementation.ChangePasswordStepsImpl;
import appsCommon.PageInitializer;
public class ChangePasswordSteps extends PageInitializer {
    public String newPassword = ChangePasswordStepsImpl.generateNewPassword();
    @Given("User is on landing page {string}")
    public void user_is_on_landing_page(String url) throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(url));
        MiscUtils.sleep(1000);
        loginImpl.elizabethiTrustLogin();
        MiscUtils.sleep(1000);
    }
    @Given("User enters New Password according to password policy")
    public void user_enters_New_Password_according_to_password_policy() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPassword);
    }
    @Given("User confirms New Password")
    public void user_confirms_New_Password() {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, newPassword);
    }
    @Then("User can see the successful outcome")
    public void user_can_see_the_successful_outcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.successMessage.isDisplayed());
        MiscUtils.sleep(1000);
        System.out.println("Password was changed successfully");
    }
    @Given("User is back on landing page")
    public void user_is_back_on_landing_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ChangePassword"));
    }
    @Given("User enters New Password that is the same as their old Password")
    public void user_enters_New_Password_that_is_the_same_as_their_old_Password() {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, newPassword);
    }
    @Then("User can not change password")
    public void user_can_not_change_password() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageOldPassword.isDisplayed());
        MiscUtils.sleep(1000);
    }
    @Given("User enters New Password {string} without following the character limit rule")
    public void user_enters_New_Password_without_following_the_character_limit_rule(String password) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, password);
    }
    @Given("User confirms New Password {string}")
    public void user_confirms_New_Password(String password) {
        CommonUtils.clickOnElement(changePasswordPage.passwordFieldTwo);
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldTwo, password);
    }
    @Then("User can not see the successful outcome")
    public void user_can_not_see_the_successful_outcome() {
        CommonUtils.clickOnElement(changePasswordPage.changeButton);
        Assert.assertTrue(changePasswordPage.failureMessageCharacterLimit.isDisplayed());
        MiscUtils.sleep(1000);
    }
    @Given("User enters New Password with their username {string}")
    public void user_enters_New_Password_with_their_username(String username) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, username);
    }
    @Given("User fills in Enter New Password field with un-allowed characters {string}")
    public void user_fills_in_Enter_New_Password_field_with_un_allowed_characters(String characters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, characters);
    }
    @Given("User fills in Enter New Password field without all required characters {string}")
    public void user_fills_in_Enter_New_Password_field_without_all_required_characters(String reqCharacters) {
        CommonUtils.sendKeysToElement(changePasswordPage.passwordFieldOne, reqCharacters);
    }
}



