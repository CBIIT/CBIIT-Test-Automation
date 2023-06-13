Feature: DUA Agreements

  @ODS-374_ODS-387 @ODS-233_ODS-240 @bucurgb @Regression @Smoke
  Scenario: Verifying SEER ODS Data Usage Agreements
    Given a user is on the SEER Data Access Request
    Then DUA Agreements are verified

  @ODS-344_@ODS-359 @ODS-377_ODS-390 @ODS-328_ODS-356 @bucurgb @Regression
  Scenario: Verifying SEER ODS Research Plus Data Usage Agreements
    Given a user is on the SEER Data Access Research Plus Request
    Then DUA Research Plus Agreements are verified