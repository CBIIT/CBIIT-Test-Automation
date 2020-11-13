Feature: Male Discrepancy on the Search Cohorts Tab.
  This tests the discrepancies in the amount of eligible males returned on "search cohorts" tab.
	
	@SS-3429 @Progression
  Scenario: Eligible Male Cohorts returned on the Search Cohorts Tab
    Given the user is on the CEDCD homepage
    When the user clicks on the CEDCD search cohorts tab
    And the user filters by males
    Then 44 results return for Male cohort Filter results
