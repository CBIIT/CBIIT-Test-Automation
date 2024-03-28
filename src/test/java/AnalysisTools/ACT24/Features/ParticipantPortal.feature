Feature: These are the features on the Participant Portal

  Background: Participant is logged in
    Given the participant on the ACT24 participant

  @Smoke @matakevin
  Scenario: The Participant splash screen is display
    Then the splash screen is displayed

  @Progression @matakevin
    Scenario: Participant adding a sleep entry
    When the user adds wake up time on splash screen
    And the user adds a Sleeping or in Bed entry
    Then the timeline displays a sleeping or in bed tile