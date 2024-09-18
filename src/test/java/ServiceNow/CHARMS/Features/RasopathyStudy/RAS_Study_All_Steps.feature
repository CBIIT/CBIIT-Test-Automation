Feature: All RAS Steps

  @muzipovay2 @RAS_STUDY @CP2-3603 @selenium @Progression
  Scenario Outline: E-consent - create a new clickable widget to download the latest completed consent
#    Given test automation account "<AccountResetScriptURL>" has been reset
#    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
#    And logs in via Okta with username "<Email>" and password "<Password>"
#    And clicks on "Eligibility Questionnaire" to begin survey
#    When the participant submits a screener from excel sheet "<ScreenerScenario>"
#    And the e-consent is submitted for "<ScreenerScenario>"
#    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
#    And logs in via Okta with username "<Email>" and password "<Password>"
#    And clicks on Study Consent to begin form "<Password>"
#    And PI completes consent and verifies "<ScreenerScenario>" "<ConsentStatus>" "<ConsentType>" "<ResponseType>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" shows on participant portal
    And when clicked downloads "Consent Record"


#    And Consent Status is "Complete"
#    And Consent Type is "Adult" or "Aged 14-17, signed consent required" or "Aged 11-13, signed assent required" or "Aged 7-10, verbal assent required" or "Under 7"
#    And Response Type is "CHARMS E-Consent" or "iMed" or "Mail/Fax/Email/Other" or "Participant Upload to Portal"
#    And accesses their Portal
#    Then a widget "Download Study Consent" shows on Portal
#    And when clicked downloads the most recent Consent record
    Examples:
      | Email                           | Password   | ScreenerScenario  | ConsentScenario               | ConsentStatus | ConsentType | ResponseType     | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario1 | RASScenario_Consent_Age_Adult | Complete      | Adult           | CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
