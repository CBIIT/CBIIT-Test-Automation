Feature: I want to use this template for my feature file
Background:
 Given User is on landing page "ChangePassword"

  @PasswordPolicySuccess  @andreyeve @CHANGPASS-8
  Scenario: User successfully changes Password
   And User enters New Password according to password policy
   And User confirms New Password
   Then User can see the successful outcome
   

 @PasswordPolicyCharacterLimitFailure @CHANGPASS-9 @andreyeve  @Regression @Smoke
  Scenario: Verify User is not able to Change Password due to Character limit failure
   And User enters New Password "ChangeePasswo" without following the character limit rule
   And User confirms New Password "ChangeePasswo"
   Then User can not see the successful outcome
   
   @PasswordPolicyLoginNameFailure @CHANGPASS-10 @andreyeve @Regression @Smoke
   Scenario: Verify User is not able to Change Password due to Login NameFailure
   And User enters New Password with their username "andreyeve123456"
   And User confirms New Password "andreyeve123456"
   Then User can not see the successful outcome
   
   @PasswordPolicyReuseOldPasswordFailure @CHANGPASS-11 @andreyeve @Regression
   Scenario: Verify User is not able to Change Password due to reuse of Old Password
   And User enters New Password according to password policy
   And User confirms New Password
   Then User can see the successful outcome
   And User is back on landing page
   And User enters New Password that is the same as their old Password
   And User confirms New Password
   Then User can not change password
  
   @PasswordPolicyUnallowedCharacters @CHANGPASS-12 @andreyeve @Regression
   Scenario: Verify User is not able to  Change Password successfully due to un-allowed characters
   And User fills in Enter New Password field with un-allowed characters "ChangeePasswo& 1"
   And User confirms New Password "ChangeePasswo& 1"
   Then User can not see the successful outcome

 @PasswordPolicyAllRequiredCharacters @CHANGPASS-13 @andreyeve @Regression
 Scenario: Verify user is not able to Change Password without required characters
  And User fills in Enter New Password field without all required characters "changepassword12"
  And User confirms New Password "changepassword12"
  Then User can not see the successful outcome


