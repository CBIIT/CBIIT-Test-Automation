Feature: NCI Staff Member Test Scenarios

  @SS-4187 @SS-2218 @chaudhryma @Regression @Smoke @Progression
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"

  @In_Progress
  Scenario Outline: Verifying a NCI/Program Staff member does not see Delete option for
                    non-Published submissions (Top Accomplishments, Other accomplishments, Collaborations, COVID-19 Activities, and Ad Hoc Data Call)
    Then there are five submission called "<submissionOne>", "<submissionTwo>", "<submissionThree>", "<submissionFour>" and "<submissionFive>"

    Examples:
      | knowledgeBaseOne | knowledgeBaseTwo | knowledgeBaseThree  | knowledgeCategory     |
      | NERD             | ROCK             | Moonshot Evaluation | Top Accomplishments   |
      | NERD             | ROCK             | Moonshot Evaluation | Other Accomplishments |
      | NERD             | ROCK             | Moonshot Evaluation | Collaborations        |


  @In_Progress
  Scenario: Test 1: Remove 'Delete' Button in NERD For Specific Users
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    When they view Top Accomplishments submission category
    Then they DO NOT see the 'Delete' button for non-Published articles