Feature: Test Cases on the Biospecimen Count Tab

Description: This is an automated suite for test cases under the Biospecimen Tab

		@SS-3453 @Smoke
	Scenario: The Clear All button clears all the selection on the Biospecimen Counts Tab
	
		Given the user is on the CEDCD Biospecimen Tab
		And the user selects All Types from the Specimen Type drop down
		And the user selects All Cancers from the Cancer Type drop down
		And the user selects All Cohorts from the Cohorts drop down
		And the user searches results
		When the user clicks on the Clear All button
		Then all previously selected fields are no longer selected

		@SS-3436 @Smoke
	Scenario: Selecting all Cohorts from the Biospecimen Tab
	
		Given the user is on the CEDCD Biospecimen Tab
		And the user clicks on the Specimen Type drop down
		And the user clicks on the All Types check box
		Then all Specimen tabs are selected
		
		@SS-3439 @Smoke
	Scenario: Select Type Sorted Alphabetically
		
		Given the user is on the CEDCD Biospecimen Tab
		And the user clicks on the Specimen Types drop down
		Then the alphabetized Specimen Types are displayed