Feature: Female Discrepancy on the Search Cohorts Tab
  This tests the discrepancies in the amount of eligible females returned on search cohorts tab.

  @SS-3428 @Progression
  Scenario: Eligible Female Cohorts returned on the Search Cohorts Tab
    Given the user is on the CEDCD homepage
    When the user clicks on the CEDCD search cohorts tab
    And the user filters by females
    Then 53 results return for Female Cohort Filter Result
