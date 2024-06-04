Feature: Unauthenticated applicant Scenarios

  Background: common steps
    Given User is on SSJ home page and user is Unauthenticated Applicant

  @Regression @Nekrashevich @SSJ-124  @SSJ-365 @selenium
  Scenario: Not registered option
    And User clicks on Login Dropdown
    And User clicks "Not Registered" option
    Then User is redirected to Okta registration page

  @Regression @Nekrashevich  @SSJ-31 @selenium
  Scenario: Already Registered option
    And User clicks on Login Dropdown
    And User clicks "Already Registered" option
    Then User is redirected to sign in with existing credentials

  @Regression @Nekrashevich @SSJ-122 @SSJ-36 @selenium
  Scenario: Employee/Contractor Onl option
    And User clicks on Login Dropdown
    And User clicks "Employee/Contractor Only" option
    Then User is redirected to NIH Login Page

  @Regression @Nekrashevich @SSJ-298 @selenium
  Scenario: Okta error registration
    And User clicks on Login Dropdown
    And User clicks "Not Registered" option
    Then User is redirected to Okta registration page
    And User enters all the registration details
    Then User can verify that Okta account was not created

  @Regression @Nekrashevich @SSJ-27 @selenium
  Scenario: Okta registration error
    And User clicks on Login Dropdown
    And User clicks "Not Registered" option
    Then User is redirected to Okta registration page
    And User enters registration details
    And User enters an email that has an Okta account assigned to it
    Then User can see that error message "This account already exists. Please try logging in."