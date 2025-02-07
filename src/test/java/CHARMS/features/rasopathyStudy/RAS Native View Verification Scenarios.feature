Feature: RAS Native View Verification Scenarios
  Description: This feature file contains scenarios which verify data in Native View.

  @muzipovay2 @RAS_STUDY @CP2-3938 @CP2-3921 @selenium @RAS_Regression2
  Scenario Outline: Verifying FSID after adding a New Participant in Native View.
    Given Study Team member logs in to Native View and navigates to All Participant Details
    And Study Team member clicks Add New Participant and completes the form with:  FSID "<Existing FSID>", Study "<Study>", Study Subcategory "<Study Subcategory>", Relationship to Proband "<Relationship to Proband>", First Name "<First Name>", Last Name "<Last Name>"
    And Study Team member deletes record so that the test can be run again
    Examples:
      | Existing FSID | Study     | Study Subcategory | Relationship to Proband | First Name         | Last Name      |
      |               | RASopathy | All               | Proband                 | ParticipantProband | NoExistingFSID |
      |               | Metformin | All               | Other                   | ParticipantOther   | NoExistingFSID |
      |               | Fanconi   | All               | Unknown                 | ParticipantUnknown | NoExistingFSID |
      | 09949-01-001  | RASopathy | All               | Other                   | ParticipantOther   | ExistingFSID   |

  @muzipovay2 @RAS_STUDY @CP2-3898 @selenium @RAS_Regression2
  Scenario Outline: Verifying that IBMFS Affected Status displays in the Subject Flags record when the study is "Fanconi" or "Bone Marrow Failure Syndrome".
    Given Study Team member logs in to Native View and navigates to All Participant Details
    And Study Team member clicks Add New Participant and completes the form with:  FSID "<Existing FSID>", Study "<Study>", Study Subcategory "<Study Subcategory>", Relationship to Proband "<Relationship to Proband>", First Name "<First Name>", Last Name "<Last Name>"
    And Study Team member navigates to Participant Studies
    Then Study Team member creates a new Subject Flags and verifies that the field IBMFS Affected Status displays if the "<Study>" is Fanconi or Bone Marrow Failure Syndrome
    Examples:
      | Existing FSID | Study                        | Study Subcategory | Relationship to Proband | First Name                       | Last Name |
#      |               | Fanconi                      | All               | Proband                 | FanconiProband                   | TestIBMFS |
      |               | RASopathy                    | All               | Proband                 | RASopathyProband                 | TestIBMFS |
#      |               | Bone Marrow Failure Syndrome | All               | Proband                 | BoneMarrowFailureSyndromeProband | TestIBMFS |

  @muzipovay2 @RAS_STUDY @CP2-3959 @CP2-3958 @CP2-3961 @CP2-3760 @CP2-3861 @selenium @In-Progress
  Scenario Outline: Verifying that that an empty Hold/Non-Participation Date field does not remove the date from other synced records.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=0e9497c587161ad0ad46326d3fbb35c7" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "ras_progression@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And verifies that Consent Assent category auto-populated to "Adult"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "ras_progression@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And verifies Consent Assent status is "Consented only"
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete
    And clicks the Back button
    And Study Team member navigates to Participant Studies
    And Study Team member creates a new Subject Flags with the values: Study "<Study>", Participation Status "<Participation Status Row 1>", Hold Non-Participation Date "<Hold/Non-Participation Date Row 1>"
    And Study Team member creates a new Subject Flags with the values: Study "<Study>", Participation Status "<Participation Status Row 2>", Hold Non-Participation Date "<Hold/Non-Participation Date Row 2>"
    Then Study Team syncs fields and verifies their values: Participant Name "<First Name> <Last Name>", Study "<Study>", Participation Status "<Participation Status Row 1>" "<Participation Status Row 2>", Hold Non-Participation Date "<Hold/Non-Participation Date Row 1>" "<Hold/Non-Participation Date Row 2>"
    Examples:
      | Existing FSID | Study     | Relationship to Proband | First Name   | Last Name            | Participation Status Row 1 | Hold/Non-Participation Date Row 1 | Participation Status Row 2 | Hold/Non-Participation Date Row 2 |
      |               | RASopathy | Proband                 | SubjectFlags | HoldTest             | Hold                       | Today                             | Participating              |                                   |
#      |               | RASopathy | Proband                 | SubjectFlags | NotParticipatingTest | Participating              |                                   | Not Participating          | 1st of Next Month                 |
#      |               | RASopathy | Proband                 | SubjectFlags | NotParticipatingTest | Hold                       | 1st of Next Month                 | Not Participating          | Today                             |

  @muzipovay2 @RAS_STUDY @CP2-3960 @selenium @RAS_Regression2
  Scenario: Verifying that audit trail history is visible to users.
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenarioAdult"
    And Study Team member logs in to Native View and navigates to participant's record "screenerScenarioAdult"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And selects "CHARMS e-consent" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And verifies that Consent Assent category auto-populated to "Adult"
    And presses the Call Complete button
    Then Study Team member logs out of Native View
    And a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And participant clicks on Study Consent and completes form with "Charms123$"
    And Study Team member logs in to Native View and navigates to Participant Consent record "screenerScenarioAdult"
    And verifies Consent Assent status is "Consented only"
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    Then Study Team member presses Sign and Complete
    And clicks the Back button
    And Study Team member navigates to Participant Studies
    Then Study Team member creates new Subject Flags and verifies that the audit trail history displays

  @muzipovay2 @RAS_STUDY @CP2-4037 @selenium @RAS_Regression2
  Scenario: Verifying fields in the Participant Studies record and list view.
    Given Study Team member logs in to Native View and types "Participant Studies" into the Filter Navigator
    And clicks the link for the "Participant Studies" table
    And Study Team member verifies the columns displayed in the list view of the Participant Studies table
    And Study Team member opens the first Participant Studies record
    Then verifies fields in the Participant Studies record