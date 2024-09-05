Feature: SNOWTRAVEL Native View Form Scenarios
  Description: This Feature file contains SNOWTRAVEL Travle Planning System Form Scenarios in Native View

  @SNOWTRAVEL-124 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test Create Travel Request Application Module
    Given I am an authenticated DOC CGH Travel Request User
    When I search "Travel Planning System", in the filter navigator,
    Then I will see Modules created for the "Travel Requests", "Assigned to Me", "Assigned to My Group",and "My Approvals" underneath Travel Planning System Application