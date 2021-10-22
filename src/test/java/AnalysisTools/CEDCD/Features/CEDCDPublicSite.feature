Feature: Test Cases on the Public Site
  
  Description: This is an automated suite for test cases under the Public Site

	@SS-3453 @Smoke @matarodriguezko @Progression
  Scenario: The Clear All button clears all the selection on the Biospecimen Counts Tab
    Given the user is on the CEDCD Biospecimen Tab
    And the user selects All Types from the Specimen Type drop down
    And the user selects All Cancers from the Cancer Type drop down
    And the user selects All Cohorts from the Cohorts drop down
    And the user searches results
    When the user clicks on the Clear All button
    Then all previously selected fields are no longer selected

  @SS-3436 @Smoke @matarodriguezko 
  Scenario: Selecting all Cohorts from the Biospecimen Tab
    Given the user is on the CEDCD Biospecimen Tab
    And the user clicks on the Specimen Type drop down
    And the user clicks on the All Types check box
    Then all Specimen tabs are selected

  @SS-3439 @Smoke @matarodriguezko 
  Scenario: Select Type Sorted Alphabetically
    Given the user is on the CEDCD Biospecimen Tab
    And the user clicks on the Specimen Types drop down
    Then the alphabetized Specimen Types are displayed

  @SS-3509 @Smoke @matarodriguezko
  Scenario: Cancer Type Drop Down is sorted Alphabetically
    Given the user is on the CEDCD Biospecimen tab
    When the user clicks on the Cancer Types drop down
    Then the drop down is sorted alphabetically

  @SS-3428 @Smoke @matarodriguezko
  Scenario: Eligible Female Cohorts returned on the Search Cohorts Tab
    Given the user is on the CEDCD Search Cohorts Tab
    When the user filters by females
    Then the results returned are for Female or All Cohorts

  @SS-3430 @matarodriguezko 
  Scenario: Select All Cohorts
    Given the user is on the CEDCD Search Cohorts Tab
    And the user clicks on the select all check box
    Then all studies are selected

  @SS-3432 @Smoke @matarodriguezko
  Scenario: Tests the new Search Cohorts Page Layout
    Given the user is on the CEDCD Search Cohorts Tab
    Then the user sees updated Search Cohorts UI page

  @SS-3446 @Smoke @matarodriguezko 
  Scenario: Restoring Search Criteria after Switching Tabs.
    Given the user is on the CEDCD Search Cohorts Tab
    When the user filters by Depression study
    And the user clicks on a different tab
    And the user click back on the previous tab
    Then the user is filtered result from before are still populated

  @SS-3438 @Smoke @matarodriguezko
  Scenario: Categories of Data Collected sorted Alphabetically
    Given the user is on the CEDCD Search Cohorts Tab
    When the user clicks on the Categories of Data Collected drop down
    Then all selections are sorted alphabetically

  @SS-3503 @Smoke @matarodriguezko
  Scenario: Cohort Study URL functions properly
    Given the user is on the CEDCD Search Cohorts Tab
    When the user clicks Agricultural Health Study
    Then the Agricultural Health Study icon is shown on the web page
    
    @Progression	@matarodriguezko
    Scenario: Compare Production and QA sites Cancer Counts
    Given the user is on the CEDCD Production Site
    When The user navigates to Cancer Counts and selects the AHS cohort
