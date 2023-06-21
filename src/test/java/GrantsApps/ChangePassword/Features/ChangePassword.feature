Feature: I want to use this template for my feature file

  @PasswordPolicySuccess  @andreyeve
  Scenario: User successfully changes Password
   Given User is on landing page
   And User fills in Enter New Password field according to the rules
   And User fills in Confirm New Password field according to the rules 
   Then User can see the successful outcome
   

 @PasswordPolicyCharacterLimitFailure @andreyeve  @Regression @Smoke
  Scenario: User unsuccessfully changes Password
   Given User is on landing page
   And User enters New Password "ChangeePasswo" without following the character limit rule
   And User confirms New Password "ChangeePasswo"
   Then User can not see the successful outcome
   
   @PasswordPolicyLoginNameFailure @andreyeve
   Scenario: User unsuccessfully changes Password
   Given User is on landing page
   And User fills in Enter New Password field with his login name
   And User fills in Confirm New Password field with his login name
   Then User can not see the successful outcome
   
   @PasswordPolicyReuseOldPasswordFailure @andreyeve
   Scenario: User unsuccessfully changes Password
   Given User is on landing page
   And User fills in Enter New Password field with his Old Password
   And User fills in Confirm New Password field with his Old Password
   Then User can not reuse old password
  
   @PasswordPolicyUnallowedCharacters @andreyeve
   Scenario: User unsuccessfully changes Password
   Given User is on landing page
   And User fills in Enter New Password field with unallowed characters
   And User fills in Confirm New Password field with unallowed characters
   Then User can not see the successful outcome
   
   @PasswordPolicyWithoutAllAllowedCharacters @andreyeve
   Scenario: User unsuccessfully changes Password
   Given User is on landing page
   And User fills in Enter New Password field without all allowed characters
   And User fills in Confirm New Password field without all allowed characters
   Then User can not see the successful outcome

   
