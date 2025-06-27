Feature: Native View Subject Flags
  Description: This feature file contains subject flags related scenarios

  @muzipovay2 @RAS_STUDY @CP2-4256 @CP2-4172 @CP2-5133 @selenium @RAS_Regression2 @Progression
  Scenario Outline: This scenario completes screening and consent and then creates a Subject Flags record
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the consent is submitted for "<ScreenerScenario>" and "<ConsentStatus>" "<ConsentType>" "<ResponseType>" is verified in Native View
#    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
#    And logs in via Okta with username "<Email>" and password "<Password>"
#    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
#    Then Study Team member fills in a new Subject Flags for "<ScreenerScenario>"
    Examples:
      | Email                           | Password   | ScreenerScenario      | ConsentStatus | ConsentType | ResponseType                 | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario2 | Complete      | Adult       | iMed                         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
#      | ras_progression@yopmail.com | Charms123$ | screenerScenario2 | Complete      | Adult       | iMed                         |https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=0e9497c587161ad0ad46326d3fbb35c7|
