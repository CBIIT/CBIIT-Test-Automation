Feature: This Feature File contains Search Scenarios

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Progression
  Scenario: Test UI Page Header
    Given User is logged in as Primary IC Coordinator
    And verifies that first and last name of logged in user "Diego Juarez" are shown
    And is on "Manage I2E Users" page
    And is able to navigate to "IMPAC II " hyperlink
    And is able to navigate to "I2E Home" hyperlink
    And is able to navigate to "Workbench" hyperlink
    And user is able to confirm that the "Help " drop down has the following options "User Guide", "Video Tutorials", "Release Notes"
    And User can open respective hyperlinks "User Guide", "Video Tutorials", "Release Notes" successfully
