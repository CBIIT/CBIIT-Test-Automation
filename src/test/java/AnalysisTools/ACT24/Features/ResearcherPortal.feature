Feature: These are the features on the Researcher Portal

  @Regression @Smoke @matakevin
  Scenario: The Researcher can log in
    Given the user is on the ACT24 Researcher site
    When the user enters "Kevin.MataRodriguez@nih.gov" as email and "ACT24Test!" as password and clicks Login
    Then the Researcher is logged in

  @NEEDSREVIEW @matakevin
  Scenario Outline: The Researcher creates a new study
    Given the Researcher is logged in "Kevin.MataRodriguez@nih.gov" and "ACT24Test!"
    When the user creates a new study "<StudyName>", "<StudyDescription>", "<Abbreviation>", "<ExpectedParticipants>", "<ExpectedRecallsPerParticipant>", "<StudyStartDate>", "<StudyEndDate>"
    Then the screen is displayed
    Examples:
      | StudyName     | StudyDescription                    | Abbreviation | ExpectedParticipants | ExpectedRecallsPerParticipant | StudyStartDate | StudyEndDate |
      | Kevin's Study | This is the test study descriptions | KTS17        | 17                   | 1                             | 01/01/2023     | 01/01/2024   |