Feature: ESR Tasks
  Description: This feature file contains scenarios relating to catalog tasks in ESR tickets

  @ESR-560 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Intake Preparation catalog task in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for Intake Preparation
    Then the user confirms the Intake Preparation task is completed

  @ESR-561 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Intake Preparation catalog task in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for Intake Preparation
    Then the user confirms the Intake Preparation task is completed