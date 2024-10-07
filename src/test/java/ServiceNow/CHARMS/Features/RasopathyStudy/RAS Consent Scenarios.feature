Feature: RAS Consent Scenarios

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @selenium @RAS_Regression
  Scenario Outline: Verifying e-consent workflow, and then verifying that a Download Study Consent widget shows on portal and when clicked downloads the most recent Consent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the e-consent is submitted for "<ScreenerScenario>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And participant clicks on Study Consent and completes form with "<Password>"
    Then PI completes consent and verifies "<ScreenerScenario>" "<ConsentStatus>" "<ConsentType>" "<ResponseType>" in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    Examples:
      | Email                           | Password   | ScreenerScenario  | ConsentStatus | ConsentType | ResponseType     | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario1 | Complete      | Adult       | CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @selenium @RAS_Regression
  Scenario Outline: Verifying consent workflows for an adult participant, and then verifying that a Download Study Consent widget shows on portal and when clicked downloads the most recent Consent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And the consent is submitted for "<ScreenerScenario>" and "<ConsentStatus>" "<ConsentType>" "<ResponseType>" is verified in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    Examples:
      | Email                           | Password   | ScreenerScenario  | ConsentStatus | ConsentType | ResponseType                 | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario1 | Complete      | Adult       | Participant upload to portal | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario1 | Complete      | Adult       | iMed                         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario1 | Complete      | Adult       | Mail/Fax/Email/Other         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @CP2-3738 @selenium @RAS_Regression
  Scenario Outline: Verifying e-consent workflow for minors aged 11-13, and then verifying that Download Study Consent/Assent widgets show on portal and when clicked download the most recent Consent/Assent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    Then Study Team member logs in to Native View and completes consent call "<ScreenerScenario>", "<ConsentStatus>", "<ConsentType>", "<ResponseType>", "<ParentGuardianStatus>", "<NumberOfGuardianSignaturesRequired>", "<NumberOfParentGuardianSignaturesReceived>"
    And Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And participant clicks on Study Assent and completes form with "<Password>"
    And proxy clicks on Study Consent and completes form with "<Password>"
    Then PI completes consent and verifies "<ScreenerScenario>" "<ConsentStatus>" "<ConsentType>" "<ResponseType>" in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    And "Download Study Assent" text shows on participant portal and when clicked downloads "Assent Record"
    Examples:
      | Email                           | Password   | ScreenerScenario         | ConsentStatus | ConsentType                          | ResponseType     | ParentGuardianStatus | NumberOfGuardianSignaturesRequired | NumberOfParentGuardianSignaturesReceived | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge11-13 | Complete      | Aged 11 - 13, signed assent required | CHARMS e-consent | Parents, Married     | 1                                  | 1                                        | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @selenium @CP2-3730 @RAS_Regression
  Scenario: Verifying that when a minor aged 11-13 has completed Assent, the field Assent signed is true in their Native View Consent Record
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAge11-13"
    Then Study Team member logs in to Native View and completes consent call "screenerScenarioAge11-13", "Complete", "Aged 11 - 13, signed assent required", "CHARMS e-consent", "Parents, Married", "1", "0"
    And Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Assent and completes form with "Charms123$"
    And participant logs out of RAS portal
    Then Study Team member logs in to Native View and verifies that the field Assent signed is true "screenerScenarioAge11-13"

  @muzipovay2 @RAS_STUDY @selenium @CP2-3703 @RAS_Regression
  Scenario Outline: Verifying that Adult/Minor participants can complete the Eligibility Questionnaire
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And Study Team member logs in to Native View and verifies that a new screener has been submitted "<ScreenerScenario>"
    Examples:
      | Email                           | Password   | ScreenerScenario               | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult          | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult-NeedsLAR | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAgeUnder7      | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge7-10        | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge11-13       | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge14-17       | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
