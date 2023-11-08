package GrantsApps.ChangePassword.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.nci.automation.xceptions.TestingException;
import GrantsApps.ChangePassword.StepsImplementation.ChangePasswordStepsImpl;
import appsCommon.PageInitializer;

public class ChangePasswordSteps extends PageInitializer {

    @Given("User is on landing page {string}")
    public void user_is_on_landing_page(String url) throws TestingException {
        ChangePasswordStepsImpl.userIsOnLandingPage(url);
    }

    @Given("User enters New Password according to password policy")
    public void user_enters_New_Password_according_to_password_policy() {
      ChangePasswordStepsImpl.userEntersNewPasswordAccordingToPasswordPolicy();
    }

    @Given("User confirms New Password")
    public void user_confirms_New_Password() {
       ChangePasswordStepsImpl.userConfirmsNewPassword();
    }

    @Then("User can see the successful outcome")
    public void user_can_see_the_successful_outcome() {
        ChangePasswordStepsImpl.userCanSeeTheSuccessfulOutcome();
    }

    @Given("User is back on landing page")
    public void user_is_back_on_landing_page() throws TestingException {
        ChangePasswordStepsImpl.userIsBackOnLandingPage();
    }

    @Given("User enters New Password that is the same as their old Password")
    public void user_enters_New_Password_that_is_the_same_as_their_old_Password() {
        ChangePasswordStepsImpl.userEntersNewPasswordThatIsTheSameAsTheirOldPassword();
    }

    @Then("User can not change password")
    public void user_can_not_change_password() {
        ChangePasswordStepsImpl.userCanNotChangePassword();
    }

    @Given("User enters New Password {string} without following the character limit rule")
    public void user_enters_New_Password_without_following_the_character_limit_rule(String password) {
        ChangePasswordStepsImpl.userEntersNewPasswordWithoutFollowingTheCharacterLimitRule(password);
    }

    @Given("User confirms New Password {string}")
    public void user_confirms_New_Password(String password) {
        ChangePasswordStepsImpl.userConfirmsNewPassword(password);
    }

    @Then("User can not see the successful outcome")
    public void user_can_not_see_the_successful_outcome() {
        ChangePasswordStepsImpl.userCanNotSeeTheSuccessfulOutcome();
    }

    @Given("User enters New Password with their username {string}")
    public void user_enters_New_Password_with_their_username(String username) {
        ChangePasswordStepsImpl.userEntersNewPasswordWithTheirUsername(username);
    }

    @Given("User fills in Enter New Password field with un-allowed characters {string}")
    public void user_fills_in_Enter_New_Password_field_with_un_allowed_characters(String characters) {
        ChangePasswordStepsImpl.userFillsInEnterNewPasswordFieldWithUnAllowedCharacters(characters);
    }

    @Given("User fills in Enter New Password field without all required characters {string}")
    public void user_fills_in_Enter_New_Password_field_without_all_required_characters(String reqCharacters) {
        ChangePasswordStepsImpl.userFillsInEnterNewPasswordFieldWithoutAllRequiredCharacters(reqCharacters);
    }
    @Given("Enters New Password according to password policy")
    public void enters_new_password_according_to_password_policy() {
        ChangePasswordStepsImpl.entersNewPasswordAccordingToPasswordPolicy();
    }
    @Given("Confirms New Password")
    public void confirms_new_password() {
        ChangePasswordStepsImpl.confirmsNewPassword();
    }
}