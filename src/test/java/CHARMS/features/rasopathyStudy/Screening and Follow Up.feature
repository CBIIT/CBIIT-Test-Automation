Feature: Screening and Follow Up
  Description: This feature file contains scenarios where a Study Team member creates a new Screening and Follow Up record.

  @muzipovay2 @RAS_STUDY @CP2-4816 @CP2-4225 @CP2-4183 @CP2-4264 @Smoke @RAS_Regression1 @selenium
  Scenario: This scenario completes the screener, consent flow, and then creates a Screening and Follow Up record in NV.
  Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
  Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
  And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and completes consent call "screenerScenarioAdult" with Collection Method "Participant upload to portal"
    And logs out of Native View
    And creates a new Screening record for scenario "screenerScenarioAdult"