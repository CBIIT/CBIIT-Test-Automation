Feature: SNOWOBF Portal form Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Scenarios

  @SNOWOBF-11 @Chaudhryma @Regression
  Scenario: Test Create OBF Helpdesk Link on NCI ServiceNow Homepage
    Given I am an authenticated CBIIT user
    When I navigate to the NCI ServiceNow homepage 'OBF Systems Support' portal form
    Then I should see that I can navigate to the OBF Systems Support application.