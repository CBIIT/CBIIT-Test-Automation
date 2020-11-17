Feature: Test Cases on the Search Cohorts Tab
  
Description: This is an automated suite for test cases under the Search Cohorts Tab

  @SS-3428 @Smoke
  Scenario: Eligible Female Cohorts returned on the Search Cohorts Tab
  
    Given the user is on the CEDCD homepage
    When the user clicks on the CEDCD search cohorts tab
    And the user filters by females
    Then 53 results return for Female Cohort Filter Result

    @SS-3429 @Smoke
  Scenario: Eligible Male Cohorts returned on the Search Cohorts Tab
  
    Given the user is on the CEDCD homepage
    When the user clicks on the CEDCD search cohorts tab
    And the user filters by males
    Then 44 results return for Male cohort Filter results
    
    @SS-3430 @Smoke
	Scenario: Select All Cohorts
	
	Given the user is on the CEDCD homepage
	When the user clicks on the CEDCD search cohorts tab
	And the user clicks on the select all check box
	Then all studies are selected
    
    @SS-3437 @Smoke
	Scenario: Filtering Cohorts by Alcohol Consumption
	
	Given the user is on the CEDCD Search Cohorts Tab
	When the user searches cohorts through Alcohol Consumption filter
	Then the user sees 58 studies returned
	
		@SS-3432 @Smoke
	Scenario: Tests the new Search Cohorts Page Layout
	
	Given the user is on the CEDCD homepage
	When the user clicks on the CEDCD search cohorts
	Then the user sees updated Search Cohorts UI page