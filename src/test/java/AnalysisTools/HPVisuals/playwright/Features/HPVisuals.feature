Feature: These are all the features for the HPVisuals application

  @NCIATWP-7884 @matakevin @Smoke @playwright
  Scenario: Ability to create family history record
    Given the user is on the FHH home page
    When the user click "Create a Family Health History"
    And fills out the screener with "Kevin Mata", "Male", "11", "1996", "3", "6", "195"
    Then the "Check Your Familial Risk", "Colorectal Cancer", and "Heart Disease", and "Diabetes" link is displayed

  @NCIATWP-7972 @matakevin @Progression @playwright
  Scenario: Ability to create family history record
    Given the user is on the FHH home page
    When the user click "Use a Saved History"
    And user clicks the "Choose File" button
    When the user uploads "Kevin_Mata_Health_History Altered"
    Then the "Name", "Relationship to Me", "Still Living", "Update History", "Remove Relative" table headers are displayed
