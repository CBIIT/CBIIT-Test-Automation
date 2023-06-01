Feature: DUA Agreements

  @ODS-374 @juarezds @Regression @Smoke
  Scenario: Verifying SEER ODS Data Usage Agreements
    Given a user is on the SEER Data Access Request
    Then DUA Agreements are verified
