Feature: Create ESR Page
  Description: This feature file contains scenarios relating to the create ESR ticket page

  @ESR-540 @ESR-541 @sarwarahmed1 @Regression @Smoke @playwright
  Scenario: Test an authenticated user access the create ESR page
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    Then user sees the create ESR page where "Customer Details" and "Project Details" are displayed