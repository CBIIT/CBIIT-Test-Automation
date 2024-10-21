Feature: RAS Native View Verification Scenarios
  Description: This feature file contains scenarios which verify data in Native View.

  @muzipovay2 @RAS_STUDY @CP2-3938 @selenium @RAS_Regression @Progression
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