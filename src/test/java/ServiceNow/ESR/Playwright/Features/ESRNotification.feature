Feature: ESR Notifications
  Description: This feature file contains scenarios relating to notifications in ESR

  @ESR-533 @sarwarahmed1 @Regression @playwright
  Scenario: Test a submitted request notification for the creation of an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    Then user confirms a request notification is sent in the activity feed

  @ESR-534 @sarwarahmed1 @Regression @playwright
  Scenario: Test a submitted request notification for the creation of an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    Then user confirms a request notification is sent in the activity feed

  @ESR-574 @sarwarahmed1 @Progression @playwright
  Scenario: Test a watchlist update notification for the creation of an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    Then the user confirms a watchlist update notification is sent in the activity feed

  @ESR-575 @sarwarahmed1 @Progression @playwright
  Scenario: Test a watchlist update notification for the creation of an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    Then the user confirms a watchlist update notification is sent in the activity feed