Feature: Employee flow

@TierAcknowledgedEmployee @regression3
Scenario: Tier not acknowledged
Given User is on ETD home page and user is "AALAI, MARRIAM"
When User clicks on About ETD Tab
Then employee will see a respective message


@validateTierChangesNonEmployee @regression3
Scenario:  Validate the displayed content changes for different Tier levels
Given User is on ETD home page and user is "KWOK, JENNIFER"
When User is on Manage ETD Tab
And User clicks Search button
And User picks Tier 1
Then User can verify the search displayed is correct


@validateICChangesNonEmployee @regression3
Scenario:  Validate the displayed content changes for different Tier levels
Given User is on ETD home page and user is "KWOK, JENNIFER"
When User is on Manage ETD Tab
And User picks organization as NCI DCTD (HNCB)
Then User can verify the IC search displayed is correct

