Feature: SEER Research Plus Login Scenarios

  @ODS-349 @ODS-515 @chaudhryma @Regression @selenium
  Scenario: Verifying that "SEER Research Plus" button land on log in page for sanity check
    Given a user is on the SEER Data Access landing page
    When the user clicks the SEER Research Plus button
    Then the user will be brought to the Sign in Page