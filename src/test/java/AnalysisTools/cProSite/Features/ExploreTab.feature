Feature: Explore Tab
  Description: This is the test case for the cProSite.

  @Smoke @uddins2
  Scenario: User submit default selection
    Given user is on cProSite explore Tab
    When user clicks submit
    Then results is displayed

  @Smoke @uddins2
  Scenario: User submit selection with dataset as phosphorylation site
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylation site
    And user clicks submit
    Then results is displayed

  @Smoke @uddins2
  Scenario: User submit selection with dataset as PhosphorylationProtein
    Given user is on cProSite explore Tab
    When user changes the dataset to phosphorylationprotein
    And user clicks submit
    Then results is displayed

  @Smoke @uddins2 @Progression
  Scenario: User submit selection with RNALevel CDK1 mRNa to another and DLC1
    Given user is on cProSite explore Tab
    When user changes the dataset to rnalevel
    And  user change analysis to correlation
    And user change correlated gene to DLC1
    And user clicks submit
    Then results is displayed