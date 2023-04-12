Feature: ETD Flow NIDDK Admin

Background: common steps
Given User is on ETD home page and user is "BULL, MELBOURNE"

@tabsPresentNIDDK @regression1
Scenario Outline: Verify Present Tabs NIDDK
When User clicks on organization dropdown
And User can see only profile related to their top IC
When User chooses to view '<tab>'
And user can verify that subsequent content of each '<tab >'is displayed

Examples:
|tab|
|Home|
|About ETD|
|Manage ETD|
|Manage Roles|

@manageRolesAddAnAdminNIDDK @regression1
Scenario: Managing Roles negative outcome
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is already an admin as "BULL, MELBOURNE"
Then User can verify the alert message 

@manageRolesAdminNIDDK @regression1
Scenario: Assign as an admin
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "DORSEY, NOVELLA"
And User assigns an admin role
And User chooses an Organization/SAC from the dropdown
Then user can verify that SAVE button is enabled
And User can assign an admin role successfully
Then newly assigned NIDDK admin is able to log in
And User can delete the newly created NIDDK profile


@manageRolesLiaisonNIDDK @regression1
Scenario: Assign as an ETD liaison
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "DORSEY, NOVELLA"
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
And User can assign another organization successfully
When User assigns the same organization
Then User does not see that organization in dropdopwn choices
And User can assign a liaison role successfully
And User can delete the newly created NIDDK profile

@filterOutManageRolesTabAdminPostiveNIDDK @regression1
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "GRIMME, ACADIA"
Then User can verify that NIDDK profile is present


@filterOutManageRolesTabAdminNegativeNIDDK @regression1
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "ADAM, TRENGO"
Then User can verify that NIDDK profile is not present

@manageETDTierNIDKK  @regression1
Scenario Outline: Wide Search
When User clicks on Manage ETD Tab
Then User can verify Search button is enabled
And User picks a '<tier>' from dropdown
When User clicks Search button
Then User verifies the applied search for '<tier>' is present

Examples:
|tier    |
|All     |
|Tier II |
|Tier III|
|Tier III-D|







