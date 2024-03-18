Feature: Unauthenticated applicant Scenarios

  Background: common steps
    Given User is on AppTracker home page and user is Unauthenticated Applicant

  @Regression  @Nekrashevich @APPTRACK-124 @APPTRACK-31  @APPTRACK-365
  Scenario: Okta registration error and message handling
    When User  clicks on the register for Okta within the Login dropdown
    And User enters registration details
    And User enters an email that has an Okta account assigned to it
    Then User can see that error message "This account already exists. Please try logging in."

  @Regression  @Nekrashevich @APPTRACK-293
  Scenario: Okta error registration
    When User  clicks on the register for Okta within the Login dropdown
    And User can see Login button for existing Okta accounts
    And User enters all the registration details
    Then User can verify that Okta account was not created

  @Regression  @Nekrashevich  @APPTRACK-328
  Scenario: Applying for a vacancy
    And User can verify that User can browse through open vacancies
    When User applies for an open vacancy as unauthenticated applicant
    And User clicks Sign In and Apply Button
    Then User is redirected to Okta registration page