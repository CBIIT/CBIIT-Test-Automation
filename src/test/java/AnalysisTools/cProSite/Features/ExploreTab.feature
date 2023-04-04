Feature: Explore Tab
  Description: This is the test case for the cProSite.

  @Smoke @uddins2
  Scenario: User submit default selection
    Given user is on cProSite explore Tab
    When user clicks submit
    Then results is displayed

  @Smoke @uddins2 @Progression
  Scenario: User submit selection with dataset as phosphorylation site
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylation site
    And user clicks submit
    Then results is displayed
