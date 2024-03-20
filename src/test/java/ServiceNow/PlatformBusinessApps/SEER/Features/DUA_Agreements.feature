Feature: DUA Agreements

  @ODS-374 @ODS-387 @ODS-233 @ODS-240 @bucurgb @Regression @Smoke
  Scenario: Verifying SEER ODS Data Usage Agreements
    Given a user is on the SEER Data Access Request
    Then DUA Agreements are verified

  @ODS-344 @ODS-359 @ODS-342 @ODS-357 @ODS-343 @ODS-358 @ODS-377 @ODS-390 @ODS-328 @ODS-356 @bucurgb @Regression
  Scenario: Verifying SEER ODS Research Plus Data Usage Agreements
    Given a user is on the SEER Data Access Research Plus Request
    Then DUA Research Plus Agreements are verified