Feature: This feature file contains SEER Data Requests Rejection Scenarios

  @ODS-320 @ODS-340 @ODS-369 @ODS-383 @ODS-326 @ODS-382 @bucurgb @Regression @Progression
  Scenario: Test Update rejection notification for institutional users
    Given an authenticated ODS SEER Data user with an eRA Commons account is on the SEER Data Access landing page
    And fills out all required fields on SEER Data registration form
    And submits the registration form
    And a SEER ODS Admin navigates the Native View portal
    When a SEER ODS Admin navigates to "SEER","Access Requests"
    And creates a new Access Request
    And when the admin rejects the Access Requests
    Then the user shall receive a rejection email