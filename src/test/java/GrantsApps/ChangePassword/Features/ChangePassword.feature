Feature: The following scenarios verify the functionality on Change Password page

  Background:
    Given User is on landing page "ChangePassword"

  @PASSWORD_POLICY_SUCCESS  @ANDREYEVE @CHANGPASS-8 @Regression @Smoke @selenium @SmokeTest @FAILED_SEP_12_2024 @BugReported
  Scenario: User successfully changes Password
    And User enters New Password according to password policy
    And User confirms New Password
    Then User can see the successful outcome

  @PASSWORD_POLICY_CHARACTER_LIMIT_FAILURE @CHANGPASS-9 @ANDREYEVE  @Regression @Smoke @selenium
  Scenario: Verify User is not able to Change Password due to Character limit failure
    And User enters New Password "ChangeePasswo" without following the character limit rule
    And User confirms New Password "ChangeePasswo"
    Then User can not see the successful outcome

  @PASSWORD_POLICY_LOGIN_NAME_FAILURE @CHANGPASS-10 @ANDREYEVE @Regression @Smoke @selenium
  Scenario: Verify User is not able to Change Password due to Login NameFailure
    And User enters New Password with their username "andreyeve123456"
    And User confirms New Password "andreyeve123456"
    Then User can not see the successful outcome

  @PASSWORD_POLICY_REUSE_OLD_PASSWORD_FAILURE @CHANGPASS-11 @ANDREYEVE @Regression @Smoke @selenium
  Scenario: Verify User is not able to Change Password due to reuse of Old Password
    And Enters New Password according to password policy
    And Confirms New Password
    Then User can see the successful outcome
    And User is back on landing page
    And User enters New Password that is the same as their old Password
    And Confirms New Password
    Then User can not change password

  @PASSWORD_POLICY_UNALLOWED_CHARACTERS @CHANGPASS-12 @ANDREYEVE @Regression @Smoke @selenium
  Scenario: Verify User is not able to  Change Password successfully due to un-allowed characters
    And User fills in Enter New Password field with un-allowed characters "ChangeePasswo& 1"
    And User confirms New Password "ChangeePasswo& 1"
    Then User can not see the successful outcome

  @PASSWORD_POLICY_ALL_REQUIRED_CHARACTERS @CHANGPASS-13 @ANDREYEVE @Regression @Smoke @selenium
  Scenario: Verify user is not able to Change Password without required characters
    And User fills in Enter New Password field without all required characters "changepassword12"
    And User confirms New Password "changepassword12"
    Then User can not see the successful outcome