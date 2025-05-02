Feature: AAA flow

  Description: This feature file contains scenarios relating to AAA Portal

  @selenium @Alena @Regression @AAA-37
  Scenario: AAA log in from portal view
    Given  Submitter User logged in to AAA Portal
    And User navigates to AAA form via menu
    Then Submitter User can verify they are on the AAA form