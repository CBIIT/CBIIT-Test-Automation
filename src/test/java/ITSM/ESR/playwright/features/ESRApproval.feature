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

  @ESR-569 @sarwarahmed1 @Regression @playwright
  Scenario: Test "Need more info" rejection from a Federal Lead in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is rejected from a federal lead with a need more info
    And user clicks on Intake Preparation catalog task and completes it again
    And the user is approved from a federal lead
    Then the user confirms the Federal Intake Approval is completed

  @ESR-571 @sarwarahmed1 @Regression @playwright
  Scenario: Test "Rejected" from a Federal Lead in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user receives a rejection from a federal lead for intake approval in ESR-Q
    Then the user confirms the Federal Intake Approval was rejected for the ESR-Q ticket

  @ESR-575 @sarwarahmed1 @Regression @playwright
  Scenario: Test "Rejected Incorrect Approver" from a Federal Lead in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user receives a rejection for incorrect approver from a federal lead for intake approval in ESR-Q
    Then the user confirms the Federal Intake Approval was rejected for an incorrect approver in the ESR-Q ticket

  @ESR-570 @sarwarahmed1 @Regression @playwright
  Scenario: Test "Need more info" rejection from a Federal Lead in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is rejected from a federal lead with a need more info
    And user clicks on Intake Preparation catalog task and completes it again
    And the user is approved from a federal lead
    Then the user confirms the Federal Intake Approval is completed

  @ESR-574 @sarwarahmed1 @Regression @playwright
  Scenario: Test "Rejected" from a Federal Lead in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user receives a rejection from a federal lead for intake approval in ESR-I
    Then the user confirms the Federal Intake Approval was rejected for the ESR-I ticket

  @ESR-576 @sarwarahmed1 @Progression @playwright
  Scenario: Test "Rejected Incorrect Approver" from a Federal Lead in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user receives a rejection for incorrect approver from a federal lead for intake approval in ESR-I
    Then the user confirms the Federal Intake Approval was rejected for an incorrect approver in the ESR-I ticket

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

  @ESR-716 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need More Info" from ESR Board Intake Review approvals in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is rejected from the ESR Board approvers with a need more info for ESR-Q
    Then the user confirms more information is needed for the ESR-Q ticket

  @ESR-718 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" from ESR Board Intake Review approvals in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-Q Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is rejected from the ESR Board approvers with a rejection approval for ESR-Q
    Then the user confirms the ESR Board Intake Approval was rejected for the ESR-Q ticket

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

  @ESR-717 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need More Info" from ESR Board Intake Review approvals in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is rejected from the ESR Board approvers with a need more info for ESR-I
    Then the user confirms more information is needed for the ESR-I ticket

  @ESR-720 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" from ESR Board Intake Review approvals in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is rejected from the ESR Board approvers with a rejection approval for ESR-I
    Then the user confirms the ESR Board Intake Approval was rejected for the ESR-I ticket

  @ESR-702 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Federal Lead Closeout Approval in an ESR-Q ticket
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
    And the user is approved from a federal lead for closeout approval
    Then the user confirms the Federal Lead Closeout Approval is completed

  @ESR-706 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need more Info" for Federal Lead Closeout Approval in an ESR-Q ticket
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
    And the user is rejected from a federal lead for closeout approval with a need more info
    And user clicks on Closeout Preparation catalog task and completes it again
    And the user is approved from a federal lead for closeout approval
    Then the user confirms the Federal Lead Closeout Approval is completed

  @ESR-701 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" approval for Federal Lead Closeout in an ESR-Q ticket
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
    And the user is rejected from a federal lead for closeout approval for ESR-Q
    Then the user confirms the Federal Lead Closeout Approval was rejected for the ESR-Q ticket

  @ESR-703 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Operational POC Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    Then the user confirms the Operational POC Approval is completed

  @ESR-700 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need more Info" for the Operational POC Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is rejected from an Operational POC with a need more info
    Then the user confirms the Operational POC Approval needs more information

  @ESR-705 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" Approval for the Operational POC Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is rejected from an Operational POC
    Then the user confirms the Operational POC Approval is rejected

  @ESR-704 @sarwarahmed1 @Regression @playwright
  Scenario: Test the Federal Lead Closeout Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    And the user is approved from a federal lead for ESR-I closeout approval
    Then the user confirms the Federal Lead Closeout Approval is completed

  @ESR-709 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need more Info" for Federal Lead Closeout Approval in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    And the user is rejected from a federal lead for closeout approval with a need more info for ESR-I
    And user clicks on Closeout Preparation catalog task and completes it again for ESR-I
    And the user is approved from a federal lead for ESR-I closeout approval
    Then the user confirms the Federal Lead Closeout Approval is completed

  @ESR-712 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Closeout Review approvals in an ESR-Q ticket
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
    And the user is approved from a federal lead for closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is approved for ESR Board Closeout Review for ESR-Q
    Then the user confirms the ESR Board Closeout Review approvals are completed

  @ESR-713 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need more Info" from ESR Board Closeout Review approvals in an ESR-Q ticket
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
    And the user is approved from a federal lead for closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is rejected from ESR Board Closeout Review with a need more info for ESR-Q
    Then the user confirms more information is needed for the ESR-Q ticket

  @ESR-721 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" approval from ESR Board Closeout Review in an ESR-Q ticket
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
    And the user is approved from a federal lead for closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is rejected from the ESR Board Closeout approvers with a rejection approval for ESR-Q
    Then the user confirms the ESR Board Closeout Approval was rejected for the ESR-Q ticket

  @ESR-714 @sarwarahmed1 @Regression @playwright
  Scenario: Test the ESR Board Closeout Review approvals in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    And the user is approved from a federal lead for ESR-I closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is approved for ESR Board Closeout Review for ESR-I
    Then the user confirms the ESR Board Closeout Review approvals are completed

  @ESR-715 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Need more Info" from ESR Board Closeout Review approvals in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    And the user is approved from a federal lead for ESR-I closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is rejected from ESR Board Closeout Review with a need more info for ESR-I
    Then the user confirms more information is needed for the ESR-I ticket

  @ESR-722 @sarwarahmed1 @Regression @playwright
  Scenario: Test the "Rejected" approval from ESR Board Closeout Review in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    And user clicks on Intake Preparation catalog task
    And user fills out all required information for ESR-I Intake Preparation
    And the user is approved from a federal lead
    And ESR Board Intake Review catalog task is completed
    And the user is approved from the ESR Board approvers
    And the Engineering Project Execution catalog task is completed
    And the Closeout Preparation catalog task for ESR-I is completed
    And the user is approved from the Operational POC
    And the user is approved from a federal lead for ESR-I closeout approval
    And the ESR Board Closeout Review catalog task is completed
    And the user is rejected from the ESR Board Closeout approvers with a rejection approval for ESR-I
    Then the user confirms the ESR Board Closeout Approval was rejected for the ESR-I ticket
