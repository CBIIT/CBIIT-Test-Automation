Feature: Process Actions Scenarios

  Description: This feature file is to test the Process Actions functionality in GPMATS application

  @Progression @playwright
  Scenario: Test Process/GM Reviewer/Returned to Reviewer to Reviewed, Ready for Release
    Given a user is logged in with the role of GM Action Manager
    And clicks on Show Advanced Filters link
    And for the Action Status drop-down selects "New" option
    And clicks on the Search button
#    Then search results with the New Actions status display
#    When the user clicks on the Process button for the first Action regardless of the View Notes tooltip status
    When test step