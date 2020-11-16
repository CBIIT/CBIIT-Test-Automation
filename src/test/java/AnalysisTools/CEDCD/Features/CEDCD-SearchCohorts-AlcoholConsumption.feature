Feature: Alcohol Consumption
Description: when search cohorts using 'Alcohol consumption' filter, old nci shows 58 entries, while new nci shows 46 entries

@Progression
Scenario: Filtering Cohorts by Alcohol Consumption
Given the user is on the CEDCD Search Cohorts Tab
When the user searches cohorts through Alcohol Consumption filter
Then the user see 46 studies returned