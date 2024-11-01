Feature: ESR Tasks
  Description: This feature file contains scenarios relating to catalog tasks in ESR tickets

  @ESR-560 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Intake Preparation catalog task in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    Then the user confirms the Intake Preparation task is completed

  @ESR-561 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Intake Preparation catalog task in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    Then the user confirms the Intake Preparation task is completed

  @ESR-572 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Intake Review catalog task in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    Then the user confirms the ESR Board Intake Review catalog task is completed

  @ESR-573 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Intake Review catalog task in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    Then the user confirms the ESR Board Intake Review catalog task is completed

  @ESR-602 @sarwarahmed1 @Progression @playwright
  Scenario: Test the Engineering Project Execution catalog task in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    Then the user confirms the Engineering Project Execution catalog task is completed

  @ESR-603 @sarwarahmed1 @Progression @playwright
  Scenario: Test the Engineering Project Execution catalog task in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    Then the user confirms the Engineering Project Execution catalog task is completed