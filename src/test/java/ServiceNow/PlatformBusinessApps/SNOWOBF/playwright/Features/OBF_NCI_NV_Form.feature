Feature: SNOWOBF Native View form Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Scenarios

    @SNOWOBF-13 @Chaudhryma @Regression
    Scenario:Test Create OBF Helpdesk Module
    Given I am an authenticated OBF fulfiller user
    When I navigate to the Native View and type 'OBF Systems Support' in the navigation search window
    Then I should see the following options in the OBF Systems Support Module: "All Tickets", "Open Tickets", "Closed Tickets", "OneStream/BUS"