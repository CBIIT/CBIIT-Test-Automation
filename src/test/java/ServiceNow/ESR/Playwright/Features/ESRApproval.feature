Feature: ESR Approvals
  Description: This feature file contains scenarios relating to approvals in ESR tickets

  @ESR-562 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Federal Intake Approval in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    Then the user confirms the Federal Intake Approval is completed

  @ESR-563 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Federal Intake Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    Then the user confirms the Federal Intake Approval is completed

  @ESR-578 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Intake Review approvals in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    Then the user confirms the ESR Board Intake Approvals are completed

  @ESR-579 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Intake Review approvals in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    Then the user confirms the ESR Board Intake Approvals are completed

  @ESR-702 @sarwarahmed1 @In-Progress @playwright
  Scenario: Test the Federal Lead CLoseout Approval in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-Q is completed