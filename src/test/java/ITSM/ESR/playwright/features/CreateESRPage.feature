Feature: Create ESR Page
  Description: This feature file contains scenarios relating to the create ESR ticket page

  @ESR-540 @ESR-541 @sarwarahmed1 @Regression @Smoke @playwright
  Scenario: Test an authenticated user access on the create ESR page in Native View
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    Then user sees the create ESR page where "Customer Details", "Project Details" and "Team Details" are displayed

  @ESR-542 @sarwarahmed1 @Regression @Smoke @playwright
  Scenario: Test an authenticated user access on the create ESR page in Portal View
    Given a user logs into NCI at your service page
    And navigates to Engineering Support Requests
    Then user sees the ESR page where "Customer Details", "Project Details" and "Team Details" are displayed

  @ESR-551 @sarwarahmed1 @Regression @playwright
  Scenario: Test creating an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    Then user sees an ESR-Q ticket was created

  @ESR-552 @sarwarahmed1 @Regression @playwright
  Scenario: Test creating an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    Then user sees an ESR-I ticket was created

  @ESR-553 @sarwarahmed1 @Regression @playwright
  Scenario: Test creating an ESR-Q ticket from Portal View
    Given a user logs into NCI at your service page
    And navigates to Engineering Support Requests
    And fills out all required information for ESR-Q in portal view and clicks submit
    Then user sees an ESR-Q ticket was created in portal view

  @ESR-554 @sarwarahmed1 @Regression @playwright
  Scenario: Test creating an ESR-I ticket from Portal View
    Given a user logs into NCI at your service page
    And navigates to Engineering Support Requests
    And fills out all required information for ESR-I in portal view and clicks submit
    Then user sees an ESR-I ticket was created in portal view

  @ESR-719 @sarwarahmed1 @Regression @playwright
  Scenario: Validate creation of ESR-I ticket from ESR-Q ticket
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
    And the user navigates to the generated ESR-I ticket
    Then user validates an ESR-I ticket was created from an ESR-Q ticket