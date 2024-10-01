Feature: These are the features on the Participant Portal

  @Regression @Smoke @matakevin @selenium
  Scenario: The Participant splash screen is display
    Given the participant on the ACT24 participant
    Then the splash screen is displayed

  @NeedsReview @matakevin @selenium
  Scenario: Participant adding a sleep entry
    Given the participant on the ACT24 participant
    When the user adds wake up time on splash screen
    And the user adds a Sleeping or in Bed entry
    Then the timeline displays a sleeping or in bed tile