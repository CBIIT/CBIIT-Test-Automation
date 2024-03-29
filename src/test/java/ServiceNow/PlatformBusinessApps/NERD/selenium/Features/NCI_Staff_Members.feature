Feature: NCI Staff Member Test Scenarios

  @SS-4187 @SS-2218 @chaudhryma @Regression @Smoke
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"


  Scenario: Verifying a NCI/Program Staff member does not see Delete option for all submissions
    Given a Program Staff member is on the CRS Knowledge Management System page
    When the Program Staff Member clicks on "Create new Submission" for Top Accomplishments
    And fills out all required fields
    Then the Program Staff Member is able to Save the submission
    And on the CRS Knowledge Management System page, the Program Staff member sees options to Submit, Edit, and Delete



  @Progression
  Scenario Outline: Verifying a NCI/Program Staff member does not see Delete option for
                    non-Published submissions (Top Accomplishments, Other accomplishments, Collaborations, COVID-19 Activities, and Ad Hoc Data Call)
    Then there are five submission called "<submissionOne>", "<submissionTwo>", "<submissionThree>", "<submissionFour>" and "<submissionFive>"


    Examples:
      | knowledgeBaseOne | knowledgeBaseTwo | knowledgeBaseThree  | knowledgeCategory     |
      | NERD             | ROCK             | Moonshot Evaluation | Top Accomplishments   |
      | NERD             | ROCK             | Moonshot Evaluation | Other Accomplishments |
      | NERD             | ROCK             | Moonshot Evaluation | Collaborations        |