Feature: Not an employee flow

@notAuthorizedHomeTab @Regression @Needs_review
Scenario: Not Authorized Home Tab
Given User is on ETD home page and user is "HECKMAN, DANA"
Then User will see message "Not Authorized"

@validateTierChanges @Regression @Needs_review
Scenario:  Validate the displayed content changes for different Tier levels
Given User is on ETD home page and user is "NEKRASHEVICH, ALENA"
When User is on Manage ETD Tab
And User picks Tier 1
Then User can verify the search displayed is correct

@validateICChanges @Regression @Needs_review
Scenario:  Validate the displayed content changes for different Tier levels
Given User is on ETD home page and user is "NEKRASHEVICH, ALENA"
When User is on Manage ETD Tab
And User picks organization as NCI DCTD (HNCB)
Then User can verify the IC search displayed is correct
