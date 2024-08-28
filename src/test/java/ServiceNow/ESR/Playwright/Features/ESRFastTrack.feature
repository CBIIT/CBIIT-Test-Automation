Feature: ESR Fast Track
  Description: This feature file contains scenarios iterating through an ESR ticket quickly

  @ESR-??? @ESR-??? @sarwarahmed1 @Progression @Smoke @playwright
  Scenario: Test ESR-I ticket completion without board approvals
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And user sees the create ESR page where "Customer Details", "Project Details" and "Team Details" are displayed