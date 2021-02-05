Feature: Alcohol Consumption
Description: when search cohorts using "Alcohol consumption" filter, old nci shows 58 entries, while new nci shows 58 entries

@SS-3437 @Smoke
Scenario: Filtering Cohorts by Alcohol Consumption
Given the user is on the CEDCD Search Cohorts Tab
When the user searches cohorts through Alcohol Consumption filter
Then the user sees 58 studies returned