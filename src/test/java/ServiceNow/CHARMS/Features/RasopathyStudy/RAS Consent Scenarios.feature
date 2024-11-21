Feature: RAS Consent Scenarios
  Description: This feature file contains scenarios which verify data in myRas portal and Native View Participant Details/Consent Record.

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @CP2-3680 @CP2-3825 @CP2-3640 @CP2-3805 @CP2-3935 @selenium @RAS_Regression
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
      | Email                           | Password   | ScreenerScenario      | ConsentStatus | ConsentType | ResponseType     | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Complete      | Adult       | CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3680 @selenium @RAS_Regression
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
      | Email                           | Password   | ScreenerScenario      | ConsentStatus | ConsentType | ResponseType                 | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Complete      | Adult       | Participant upload to portal | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Complete      | Adult       | iMed                         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Complete      | Adult       | Mail/Fax/Email/Other         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @CP2-3738 @CP2-3751 @CP2-3738 @CP2-3808 @CP2-3758 @selenium @RAS_Regression
  Scenario Outline: Verifying e-consent workflow for minors aged 11-13, and then verifying that Download Study Consent/Assent widgets show on portal and when clicked download the most recent Consent/Assent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge11-13"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Yes" for Was verbal assent obtained
    And selects "Other Guardian - 2" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And selects "Yes" for Parent Guardian 2 Signed
    And enters "Parent Two" as the Parent Guardian 2 name
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And participant clicks on Study Assent and completes form with "<Password>"
    And proxy clicks on Study Consent and completes form with "<Password>" "<ScreenerScenario>"
    And participant logs out of RAS portal
    Then PI completes consent and verifies "<ScreenerScenario>" "<ConsentStatus>" "<ConsentType>" "<ResponseType>" in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    And "Download Study Assent" text shows on participant portal and when clicked downloads "Assent Record"
    Examples:
      | Email                           | Password   | ScreenerScenario         | ConsentStatus | ConsentType                          | ResponseType     | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge11-13 | Complete      | Aged 11 - 13, signed assent required | CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3730 @CP2-3746 @CP2-3747 @selenium @RAS_Regression
  Scenario: Verifying that when a minor aged 11-13 has completed Assent, the field Assent signed is true in their Native View Consent Record
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAge11-13"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge7-10"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Parents, Married" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Assent and completes form with "Charms123$"
    And participant logs out of RAS portal
    Then Study Team member logs in to Native View and verifies that the field Assent signed is true "screenerScenarioAge11-13"

  @muzipovay2 @RAS_STUDY @CP2-3703 @selenium @RAS_Regression
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

  @muzipovay2 @RAS_STUDY @CP2-3737 @CP2-3908 @CP2-3909 @selenium @RAS_Regression
  Scenario: Verifying that sign consent dialog adds a checkbox if the consent type is Aged 14 - 17 in SN portal
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAge14-17"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge7-10"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Parent, Separated or Widowed - Single Custody" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And proxy clicks on Study Consent and completes form with "Charms123$" "screenerScenarioAge14-17"

  @muzipovay2 @RAS_STUDY @CP2-3725 @CP2-993 @selenium @RIn-Progress
  Scenario: Verifying that two new fields display below the Interpreter Used? selection in the Participant's Consent Record in SN when the Response Type is not iMed
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
#    Then Study Team member navigates to the Consent Record and selects "CHARMS e-consent" for the response type, "Yes" for Interpreter Used, and verifies that two new fields "Interpreter Name or ID" and "Interpreter Language" display
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Yes" for Was verbal assent obtained
    And selects "Yes" was Interpreter used
    And enters "Interpreter test" for Interpreter Name or ID
    And enters "Spanish" for Interpreter Language
    And selects "Yes" for Interpreter Witness
    And selects "Yes" for Interpreter Signed
    And presses the Call Complete button

  @muzipovay2 @RAS_STUDY @CP2-3794 @selenium @RAS_Regression
  Scenario: Verifying that Parent/Guardian 1 Signed, Parent/Guardian 2 Signed fields for Adult consent type are disabled.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and completes consent call "screenerScenarioAdult" "rasE-ConsentAdult"
    And Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    Then Study Team member verifies that Consent Status equals "Awaiting PI Signature", Consent Type equals "Adult", and that Parent Guardian fields are disabled

  @muzipovay2 @RAS_STUDY @CP2-3949 @CP2-3950 @selenium @RAS_Regression
  Scenario: Verifying that "Consent/Assent Obtained Before Study Procedures" and "Copy of Signed/Dated Consent/Assent Given to Participant" dropdowns are mandatory when Sign and Complete (for E-Consent) is clicked.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and completes consent call "screenerScenarioAdult" "rasE-ConsentAdult"
    And Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And PI verifies that the fields ConsentAssent Obtained Before Study Procedures and Copy of SignedDated ConsentAssent Given to Participant must be answered before clicking Sign and Complete

  @muzipovay2 @RAS_STUDY @CP2-3982 @selenium @RAS_Regression
  Scenario: Verifying that when Consent/Assent category is "Aged 7 - 10, verbal assent required", then a new field "Was verbal assent obtained?" displays on the Consent Form in Native View.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    Then the participant submits a screener from excel sheet "screenerScenarioAge7-10"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge7-10"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Yes" for Was verbal assent obtained
    And selects "Parents, Separated - Joint Custody" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And selects "Yes" for Parent Guardian 2 Signed
    And enters "Parent Two" as the Parent Guardian 2 name
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And proxy clicks on Study Consent and completes form with "Charms123$" "screenerScenarioAge7-10"
    Then participant logs out of RAS portal
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAge7-10"
    And verifies Consent Assent status is "Consented and Assented"
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    And verifies Age-appropriate assent obtained value is "Yes"
    Then Study Team member presses Sign and Complete

  @muzipovay2 @RAS_STUDY @CP2-3794 @selenium @RAS_Regression
  Scenario: Verifying consent workflow for Consent/Assent Category "Adult-Needs LAR".
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult-NeedsLAR"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult-NeedsLAR"
    And selects "Yes, adult needing LAR" for does participant does need legal representation
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And verifies that Consent Assent category auto-populated to "Adult - Needs LAR"
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "2" for the Number of LARs
    And selects "Yes" for LAR 1 Signed
    And enters "LAR One" as the LAR 1 Name
    And selects "Yes" for LAR 2 Signed
    And enters "LAR Two" as the LAR 2 Name
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And proxy clicks on Study Consent and completes form with "Charms123$" "screenerScenarioAge7-10"
    Then participant logs out of RAS portal
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult-NeedsLAR"
    And verifies Consent Assent status is "Consented only"
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete