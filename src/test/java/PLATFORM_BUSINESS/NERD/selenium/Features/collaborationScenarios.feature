Feature: Collaboration Scenerios

  @SS-4265 @SS-4296 @juarezds @Regression @selenium
  Scenario: NIH strategic alignment (Secondary Optional) and HHS Strategic Plan Alignment (Secondary Optional) field should not be visible
    Given a Regular User has submitted a Collaboration
    When the DOC Planning Contact "Abigail Joyce" locates the record in their Collaboration queue
    And clicks the Edit button for the record
    And lands on the submission edit page for author "CBIIT Test Account"
    Then the Rank field is not visible

  @SS-4264 @juarezds @Regression @selenium
  Scenario: NIH strategic alignment (Secondary Optional) and HHS Strategic Plan Alignment (Secondary Optional) field should not be visible
    Given a DOC Planning Contact "Abigail Joyce" clicks the Submit to CRS button for a Collaboration
    When the CRS Reviewer "hoffmanela@nih.gov" locates the record in the Submissions page
    And clicks the Edit button for the record
    And lands on the submission edit page for author "CBIIT Test Account"
    Then the Rank field is not visible and collaboration is deleted