Feature: This Feature File contains Search Scenarios

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Regression
  Scenario: Test UI Page Header
    Given User is logged in as Primary IC Coordinator
    And verifies that first and last name of logged in user "Diego Juarez" are shown
    And is on "Manage I2E Users" page
    And is able to navigate to "IMPAC II " hyperlink
    And is able to navigate to "I2E Home" hyperlink
    And is able to navigate to "Workbench" hyperlink
    And user is able to confirm that the "Help " drop down has the following options "User Guide", "Video Tutorials", "Release Notes"
    And User can open and verify respective hyperlink " User Guide" with URL "https://i2e-test.nci.nih.gov/documentation/application/EMUsersGuideforI2E.pdf"
    And User can open and verify respective hyperlink " Video Tutorials" with URL "https://i2e-test.nci.nih.gov/i2e-video.html#EnterpriseMaintenance"
    And User can open and verify respective hyperlink " Release Notes" with URL "https://i2e-test.nci.nih.gov/releaseNotes/em.html"
    And User can verify that Contact has the following options " Email Technical Support" and " Email Business Policy Questions"
