Feature: Managing User Accounts
  Description:  This Feature file contains Scenarios that verify User Account creation functionalities

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Progression
  Scenario: Verify Create Account for "Not Created" Account scenario
    Given User is logged in as Primary IC Coordinator
    And clicks Show Advanced Filters
    And selects "Not Created" in I2E Account Status drop down list
    And searches
    And gets the full NED name of the first record
    And clicks Create on the first record in the results
    And User can verify the page name is "Create New Account"
    And can verify that User's full name is displayed
    And can verify the respective wording of Full Name tooltip "Legal Name is always displayed first, followed by Preferred Name."