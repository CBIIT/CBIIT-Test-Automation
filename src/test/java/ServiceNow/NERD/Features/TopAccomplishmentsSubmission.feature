Feature: Top Accomplishments Submission

  @SS-4188 @bucurgb @Regression @Smoke
  Scenario: Verifying a Program Staff member sees options to Submit, Edit, and Delete for Top Accomplishments
    Given a Program Staff member is on the CRS Knowledge Management System page
    When the Program Staff Member clicks on "Create new Submission" for Top Accomplishments
    And fills out all required fields
    Then the Program Staff Member is able to Save the submission
    And on the CRS Knowledge Management System page, the Program Staff member sees options to Submit, Edit, and Delete

