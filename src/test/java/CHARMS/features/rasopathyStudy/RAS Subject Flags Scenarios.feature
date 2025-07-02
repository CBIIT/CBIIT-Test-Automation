Feature: Native View Subject Flags
  Description: This feature file contains subject flags related scenarios

  @muzipovay2 @RAS_STUDY @CP2-4256 @CP2-4172 @CP2-5133 @selenium @RAS_Regression2
  Scenario: This scenario completes screening and consent and then creates a Subject Flags record
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenario2"
    And the consent is submitted for "screenerScenario2" and "Complete" "Adult" "iMed" is verified in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    Then Study Team member fills in a new Subject Flags for "screenerScenario2"