Feature: Managing User Accounts
  Description:  This Feature file contains Scenarios that verify User Account creation functionalities

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Progression
  Scenario: Verify Create Account for "Not Created" Account scenario
    Given User is logged in as Primary IC Coordinator
    And clicks Show Advanced Filters
    And selects "Not Created" in I2E Account Status drop down list
    And searches
    And clicks Create on the first record in the results