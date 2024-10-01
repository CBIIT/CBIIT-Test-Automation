Feature: ESR Short Description Fields
  Description: This feature file contains scenarios relating to short description fields in an ESR ticket

  @ESR-525 @sarwarahmed1 @Regression @playwright
  Scenario: Test the listed short descriptions fields in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    Then user confirms the following fields: ESR ID, Stage, Short Description and Project Name

  @ESR-526 @sarwarahmed1 @Regression @playwright
  Scenario: Test the listed short descriptions fields in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    Then user confirms the following fields: ESR ID, Stage, Short Description and Project Name

  @ESR-527 @sarwarahmed1 @Progression @playwright
  Scenario: Test the listed short descriptions fields in an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-Q and clicks submit
    Then user confirms the following fields: Number, Approval, State and Requested For

  @ESR-528 @sarwarahmed1 @Progression @playwright
  Scenario: Test the listed short descriptions fields in an ESR-I ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information for ESR-I and clicks submit
    Then user confirms the following fields: Number, Approval, State and Requested For