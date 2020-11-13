Feature: Selecting All on the Cohort Studies Tab
	This test case is to ensure the "select all" button on the search cohorts tab will select all returned studies.
@Progression
Scenario: Select All Cohorts
	Given the user is on the CEDCD homepage
	When the user clicks on the CEDCD search cohorts tab
	And the user clicks on the select all check box
	Then all studies are selected
