Feature: Selecting All Cohorts on Biospecimen Tab

Description: This Scenario verifies the following ticket:

select 'Biospecimen Counts' tab -> 'Specimen Type' button -> 'All Types' check box. none of the options below will be selected. This issue might be the reason why submit button does not work in this filter setting

@SS-3436 @Smoke
Scenario: Selecting all Cohorts from the Biospecimen Tab


Given the user is on the CEDCD homepage
When the user clicks on the Biospecimen Counts tab
And the user clicks on the Specimen Type drop down
And the user clicks on the All Types check box
Then all Specimen tabs are selected