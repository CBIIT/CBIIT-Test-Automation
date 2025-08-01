Feature: RAS Consent Scenarios
  Description: This feature file contains scenarios which verify data in myRas portal and Native View Participant Details/Consent Record.

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @CP2-3680 @CP2-3825 @CP2-3640 @CP2-3805 @CP2-3935 @selenium @RAS_Regression1
  Scenario Outline: Verifying e-consent workflow, and then verifying that a Download Study Consent widget shows on portal and when clicked downloads the most recent Consent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And Study Team member logs in to Native View and completes consent call "<ScreenerScenario>" with Collection Method "<CollectionMethod>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And participant clicks on Study Consent and completes form with "<Password>"
    Then PI completes consent and verifies "<ScreenerScenario>" "<CollectionMethod>" in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    And consent record data is verified for scenario "<ScreenerScenario>" and collection method "<CollectionMethod>"
    Examples:
      | Email                           | Password   | ScreenerScenario      | CollectionMethod | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult screenerScenarioAdult| CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3680 @selenium @RAS_Regression1
  Scenario Outline: Verifying consent workflows for an adult participant, and then verifying that a Download Study Consent widget shows on portal and when clicked downloads the most recent Consent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And Study Team member logs in to Native View and completes consent call "<ScreenerScenario>" with Collection Method "<CollectionMethod>"
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    Examples:
      | Email                           | Password   | ScreenerScenario      | CollectionMethod             | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Participant upload to portal | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | iMed                         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAdult | Mail/Fax/Email/Other         | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3603 @CP2-3637 @CP2-3738 @CP2-3751 @CP2-3738 @CP2-3808 @CP2-3758 @selenium @RAS_Regression1
  Scenario Outline: Verifying e-consent workflow for minors aged 11-13, and then verifying that Download Study Consent/Assent widgets show on portal and when clicked download the most recent Consent/Assent Record
    Given test automation account "<AccountResetScriptURL>" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge11-13"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And selects "Other Guardian - 2" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Guardian One" as the Parent Guardian 1 name
    And selects "Yes" for Parent Guardian 2 Signed
    And enters "Guardian Two" as the Parent Guardian 2 name
    And verifies that Consent Assent category auto-populated to "Aged 11 - 13, signed assent required"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And participant clicks on Study Assent and completes form with "<Password>"
    And proxy clicks on Study Consent and completes form with "<Password>" "<ScreenerScenario>"
    And participant logs out of RAS portal
    Then PI completes consent and verifies "<ScreenerScenario>" "<CollectionMethod>" in Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And "Download Study Consent" text shows on participant portal and when clicked downloads "Consent Record"
    And "Download Study Assent" text shows on participant portal and when clicked downloads "Assent Record"
    And participant logs out of RAS portal
    Then data submitted for scenario is verified in native from the excel sheet "<ScreenerScenario>"
    And consent record data is verified for scenario "<ScreenerScenario>" and collection method "<CollectionMethod>"
    Examples:
      | Email                       | Password   | ScreenerScenario         | CollectionMethod | AccountResetScriptURL                                                                                    |
      | consent_participant@yopmail.com | Charms123$ | screenerScenarioAge11-13 | CHARMS e-consent | https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597 |

  @muzipovay2 @RAS_STUDY @CP2-3730 @CP2-3746 @CP2-3747 @selenium @RAS_Regression1
  Scenario: Verifying that when a minor aged 11-13 has completed Assent, the field Assent signed is true in their Native View Consent Record
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAge11-13"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge11-13"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And selects "Parents, Married" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And verifies that Consent Assent category auto-populated to "Aged 11 - 13, signed assent required"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Assent and completes form with "Charms123$"
    And participant logs out of RAS portal
    Then Study Team member logs in to Native View and verifies that the field Assent signed is true "screenerScenarioAge11-13"
    Then Study Team member logs out of Native View

  @muzipovay2 @RAS_STUDY @CP2-3703 @selenium @RAS_Regression1
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

  @muzipovay2 @RAS_STUDY @CP2-3737 @CP2-3908 @CP2-3909 @selenium @RAS_Regression1
  Scenario: Verifying that sign consent dialog adds a checkbox if the consent type is Aged 14 - 17 in SN portal
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAge14-17"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge14-17"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And selects "Parent, Separated or Widowed - Single Custody" for Parent Guardian Status
    And selects "Yes" for Parent Guardian 1 Signed
    And enters "Parent One" as the Parent Guardian 1 name
    And verifies that Consent Assent category auto-populated to "Aged 14 - 17, signed consent required"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And proxy clicks on Study Consent and completes form with "Charms123$" "screenerScenarioAge14-17"

  @muzipovay2 @RAS_STUDY @CP2-3725 @CP2-993 @selenium @RAS_Regression1
  Scenario: Verifying that two new fields display below the Interpreter Used? selection in the Participant's Consent Record in SN when the Response Type is not iMed
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And selects "Yes" was Interpreter used
    And enters "Interpreter test" for Interpreter Name or ID
    And enters "Spanish" for Interpreter Language
    And selects "Yes" for Interpreter Witness
    And selects "Yes" for Interpreter Signed
    And clicks the "Consent Information" tab
    And verifies that Consent Assent category auto-populated to "Adult"
    And presses the Call Complete button

  @muzipovay2 @RAS_STUDY @CP2-3794 @selenium @RAS_Regression1
  Scenario: Verifying that Parent/Guardian 1 Signed, Parent/Guardian 2 Signed fields for Adult consent type are disabled.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and completes consent call "screenerScenarioAdult" with Collection Method "CHARMS e-consent"
    And Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    Then Study Team member verifies that Consent Status equals "Awaiting PI Signature", Consent Type equals "Adult", and that Parent Guardian fields are disabled

  @muzipovay2 @RAS_STUDY @CP2-3949 @CP2-3950 @selenium @RAS_Regression1
  Scenario: Verifying that "Consent/Assent Obtained Before Study Procedures" and "Copy of Signed/Dated Consent/Assent Given to Participant" dropdowns are mandatory when Sign and Complete (for E-Consent) is clicked.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and completes consent call "screenerScenarioAdult" with Collection Method "CHARMS e-consent"
    And Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And PI verifies that the fields ConsentAssent Obtained Before Study Procedures and Copy of SignedDated ConsentAssent Given to Participant must be answered before clicking Sign and Complete

  @muzipovay2 @RAS_STUDY @CP2-3982 @selenium @RAS_Regression1
  Scenario: Verifying that when Consent/Assent category is "Aged 7 - 10, verbal assent required", then a new field "Was verbal assent obtained?" displays on the Consent Form in Native View.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    Then the participant submits a screener from excel sheet "screenerScenarioAge7-10"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAge7-10"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Was verbal assent obtained
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
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
    And clicks the "Consent Information" tab
    And verifies Consent Assent status is "Consented and Assented"
    And clicks the "Consent Signed" tab
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    And selects "Yes" for Age-appropriate assent obtained
    And clicks the "Consent Information" tab
    And verifies that Consent Assent category auto-populated to "Aged 7 - 10, verbal assent required"
    Then Study Team member presses Sign and Complete

  @muzipovay2 @RAS_STUDY @CP2-3794 @selenium @RAS_Regression2
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
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And selects "2" for the Number of LARs
    And selects "Yes" for LAR 1 Signed
    And enters "LAR One" as the LAR 1 Name
    And selects "Yes" for LAR 2 Signed
    And enters "LAR Two" as the LAR 2 Name
    And verifies that Consent Assent category auto-populated to "Adult - Needs LAR"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And proxy clicks on Study Consent and completes form with "Charms123$" "screenerScenarioAdult-NeedsLAR"
    Then participant logs out of RAS portal
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult-NeedsLAR"
    And verifies Consent Assent status is "Consented only"
    And clicks the "Consent Signed" tab
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete

  @muzipovay2 @RAS_STUDY @CP2-4088 @CP2-4198 @selenium @RAS_Regression2
  Scenario: Completing Physical Activities Survey
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And verifies that Consent Assent category auto-populated to "Adult"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And verifies Consent Assent status is "Consented only"
    And clicks the "Consent Signed" tab
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete
    And clicks the Back button
    And Study Team member navigates to Participant Studies
    And adds "Physical Activities Survey" from the Available Questionnaires
    And Study Team member publishes questionnaires
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Physical Activities Survey" to begin survey
    And submits the Physical Activities Survey
    And participant logs out of RAS portal
    And Study Team members logs in to Native View and verifies "Physical Activities Survey" QBank data

  @muzipovay2 @RAS_STUDY @CP2-4000 @selenium @RAS_Regression2
  Scenario: Completing Patient Smoking History survey
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "CHARMS e-consent" as the Collection Method
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And clicks the "Consent Information" tab
    And verifies that Consent Assent category auto-populated to "Adult"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And verifies Consent Assent status is "Consented only"
    And clicks the "Consent Signed" tab
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete
    And clicks the Back button
    And Study Team member navigates to Participant Studies
    And adds "Patient Smoking History" from the Available Questionnaires
    And Study Team member publishes questionnaires
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Smoking Survey" to begin survey
    And submits the Smoking Survey Survey
    And participant logs out of RAS portal
    And Study Team members logs in to Native View and verifies "Patient Smoking History" QBank data

  @muzipovay2 @RAS_STUDY @CP2-3821 @CP2-5153 @CP2-5235 @selenium @@RAS_Regression2
  Scenario Outline: Completing the re-consent process
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=0e9497c587161ad0ad46326d3fbb35c7" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "<ScreenerScenario>"
    And Study Team member logs in to Native View and completes consent call "<ScreenerScenario>" with Collection Method "<CollectionMethod>"
    And Study Team member completes re-consent for "<ScreenerScenario>" with Collection Method "<CollectionMethod>"
    Examples:
      | Email                           | Password   | ScreenerScenario  | CollectionMethod |
      | consent_participant@yopmail.com | Charms123$ | screenerScenario2 | iMed             |

  @muzipovay2 @RAS_STUDY @CP2-5154 @CP2-5155 @selenium @@RAS_Regression2
  Scenario: Verifying that Preview Study Consent tile displays on Portal when the Collection Method is CHARMS e-consent
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    Then Consent Call is completed for "screenerScenarioAdult" and Participant verifies logs in to portal with username "consent_participant@yopmail.com" and password "Charms123$" and the Preview Study Consent tile displays