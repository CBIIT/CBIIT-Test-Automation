Feature: NCI Staff Member Test Scenarios

  @SS-4187 @SS-2218 @chaudhryma @Regression @Smoke @selenium @Progression
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"

  @NERDSNOW-686 @chaudhryma @Regression
  Scenario: Test 1: Remove 'Delete' Button in NERD For Specific Users
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new Top Accomplishments submission
    And DOC Planning Contact returning the Top Accomplishments submission back to NCI Staff Member
    And NCI Staff Member views Top Accomplishments submission category
    Then NCI Staff Member DOES NOT see the 'Delete' button for returned record