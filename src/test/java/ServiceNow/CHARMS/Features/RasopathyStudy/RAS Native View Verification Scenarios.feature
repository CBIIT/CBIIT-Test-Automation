Feature: RAS Native View Verification Scenarios
  Description: This feature file contains scenarios which verify data in Native View.

  @muzipovay2 @RAS_STUDY @CP2-3938 @selenium @RAS_Regression
  Scenario Outline: Verifying FSID after adding a New Participant in Native View.
    Given Study Team member logs in to Native View and navigates to All Participant Details
    And Study Team member clicks Add New Participant and completes the form with:  FSID "<Existing FSID>", Study "<Study>", Relationship to Proband "<Relationship to Proband>", First Name "<First Name>", Last Name "<Last Name>"
    And Study Team member deletes record so that the test can be run again
    Examples:
      | Existing FSID | Study     | Relationship to Proband | First Name         | Last Name      |
      |               | RASopathy | Proband                 | ParticipantProband | NoExistingFSID |
      |               | Metformin | Other                   | ParticipantOther   | NoExistingFSID |
      |               | Fanconi   | Unknown                 | ParticipantUnknown | NoExistingFSID |
      | 09949-01-001  | RASopathy | Other                   | ParticipantOther   | ExistingFSID   |

  @muzipovay2 @RAS_STUDY @CP2-3898 @selenium @RAS_Regression @Progression
  Scenario Outline: Verifying that IBMFS Affected Status displays in the Subject Flags record when the study is "Fanconi" or "Bone Marrow Failure Syndrome".
    Given Study Team member logs in to Native View and navigates to All Participant Details
    And Study Team member clicks Add New Participant and completes the form with:  FSID "<Existing FSID>", Study "<Study>", Relationship to Proband "<Relationship to Proband>", First Name "<First Name>", Last Name "<Last Name>"
    And Study Team member navigates to Participant Study
    Then Study Team member creates a new Subject Flags and verifies that the field IBMFS Affected Status displays if the "<Study>" is Fanconi or Bone Marrow Failure Syndrome
    Examples:
      | Existing FSID | Study                        | Relationship to Proband | First Name                       | Last Name |
      |               | Fanconi                      | Proband                 | FanconiProband                   | TestIBMFS |
      |               | RASopathy                    | Proband                 | RASopathyProband                 | TestIBMFS |
      |               | Bone Marrow Failure Syndrome | Proband                 | BoneMarrowFailureSyndromeProband | TestIBMFS |
