Feature: Explore Tab
  Description: This is the test case for the cProSite.

  @Smoke @uddins2
  Scenario: User submit default selection
    Given user is on cProSite explore Tab
    When user clicks submit
    Then results is displayed