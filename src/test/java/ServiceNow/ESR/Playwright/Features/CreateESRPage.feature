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

  @ESR-551 @sarwarahmed1 @Progression @playwright
  Scenario: Test creating an ESR-Q ticket
    Given a user logs into Native View on the NCI at your service page
    And navigates to create ESR
    And fills out all required information and clicks submit
    Then user sees an ESR-Q ticket was created
#
#  @ESR-??? @ESR-??? @sarwarahmed1 @Progression @playwright
#  Scenario: Test creating an ESR-I ticket
#    Given a user logs into Native View on the NCI at your service page
#    And navigates to create ESR
#    And fills out all required information including {string} and clicks submit
#    Then user sees an ESR-I ticket was created