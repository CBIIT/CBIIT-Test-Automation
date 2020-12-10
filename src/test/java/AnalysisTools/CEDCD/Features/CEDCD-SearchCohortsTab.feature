Feature: Test Cases on the Search Cohorts Tab
  
Description: This is an automated suite for test cases under the Search Cohorts Tab

  @SS-3428 @Smoke
  Scenario: Eligible Female Cohorts returned on the Search Cohorts Tab
  
    Given the user is on the CEDCD Search Cohorts Tab
    And the user filters by females
    Then 53 results return for Female Cohort Filter Result

    @SS-3429 @Smoke
  Scenario: Eligible Male Cohorts returned on the Search Cohorts Tab
  
    Given the user is on the CEDCD Search Cohorts Tab
    And the user filters by males
    Then 44 results return for Male cohort Filter results
    
    @SS-3430 @Smoke
	Scenario: Select All Cohorts
	
	Given the user is on the CEDCD Search Cohorts Tab
	And the user clicks on the select all check box
	Then all studies are selected
    
    @SS-3437 @Smoke
	Scenario: Filtering Cohorts by Alcohol Consumption
	
	Given the user is on the CEDCD Search Cohorts Tab
	When the user searches cohorts through Alcohol Consumption filter
	Then the user sees 58 studies returned
	
		@SS-3432 @Smoke
	Scenario: Tests the new Search Cohorts Page Layout
	
	Given the user is on the CEDCD Search Cohorts Tab
	Then the user sees updated Search Cohorts UI page
	
		@SS-3446 @Smoke
	Scenario: Restoring Search Criteria after Switching Tabs.
	
	Given the user is on the CEDCD Search Cohorts Tab
	When the user filters for a certain study
	And the user clicks on a different tab
	And the user click back on the previous tab
	Then the user is filtered result from before are still populated
	
		@SS-3438 @Smoke
	Scenario: Categories of Data Collected sorted Alphabetically
	
	Given the user is on the CEDCD Search Cohorts Tab
	When the user clicks on the Categories of Data Collected drop down
	Then all selections are sorted alphabetically
	
		@SS-3503 @Progression
	Scenario: Cohort Study URL functions properly
	
	Given the user is on the CEDCD Search Cohorts Tab
	When the user clicks Agricultural Health Study	
	Then the Agricultural Health Study icon is shown on the web page
	
	
	
	
	
	
	