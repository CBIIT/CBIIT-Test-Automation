Feature: This Feature File contains Search Scenarios

  @ENTMAINT-492 @ENTMAINT-943 @puzikovam2 @andreyeve @Progression
  Scenario: Test UI Page Header
    Given User is logged in as Primary IC Coordinator
    And verifies that first and last name of logged in user "Diego Juarez" are shown
    And is on "Manage I2E Users" page
    And is able to navigate to "IMPAC II" hyperlink
