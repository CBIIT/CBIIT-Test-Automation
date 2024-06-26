Feature: NCI Staff Member Test Scenarios

  @SS-4187 @SS-2218 @chaudhryma @Regression @Smoke @selenium
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"

  @NERDSNOW-686 @chaudhryma @Regression @selenium
  Scenario: Test 1: Remove 'Delete' Button in NERD For Specific Users (Top Accomplishments submission)
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new Top Accomplishments submission
    And DOC Planning Contact returning the Top Accomplishments submission back to NCI Staff Member
    And NCI Staff Member views Top Accomplishments submission category
    Then NCI Staff Member DOES NOT see the 'Delete' button for Top Accomplishments submission returned record

  @NERDSNOW-687 @chaudhryma @Regression @selenium
  Scenario: Test 2: Remove 'Delete' Button in NERD For Specific Users (Other Accomplishments submission)
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new Other Accomplishments submission
    And DOC Planning Contact returning the Other Accomplishments submission back to NCI Staff Member
    And NCI Staff Member views the returned Other Accomplishments submission
    Then NCI Staff Member DOES NOT see the 'Delete' button for Other Accomplishments submission returned record

  @NERDSNOW-688 @chaudhryma @Regression @selenium
  Scenario: Test 3: Remove 'Delete' Button in NERD For Specific Users (Collaborations submission)
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new Collaborations submission
    And DOC Planning Contact returning the Collaborations submission back to NCI Staff Member
    And NCI Staff Member views the returned Collaborations submission
    Then NCI Staff Member DOES NOT see the 'Delete' button for Collaborations submission returned record

  @NERDSNOW-689 @chaudhryma @Regression @selenium
  Scenario: Test 4: Remove 'Delete' Button in NERD For Specific Users (COVID-19 Activities submission)
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new COVID19 Activities submission
    And DOC Planning Contact returning the COVID19 Activities submission back to NCI Staff Member
    And NCI Staff Member views the returned COVID19 Activities submission
    Then NCI Staff Member DOES NOT see the 'Delete' button for COVID19 Activities submission returned record

  @NERDSNOW-690 @chaudhryma @Regression @selenium
  Scenario: Test 5: Remove 'Delete' Button in NERD For Specific Users (Ad Hoc Data Call submission)
    Given an NCI Staff Member not on the NERD table is on the NERD CRS Knowledge Base
    When NCI Staff Member submits new Ad Hoc Data Call submission
    And DOC Planning Contact returning the Ad Hoc Data Call submission back to NCI Staff Member
    And NCI Staff Member views the returned Ad Hoc Data Call submission
    Then NCI Staff Member DOES NOT see the 'Delete' button for Ad Hoc Data Call submission returned record