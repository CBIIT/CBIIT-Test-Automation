Feature: ETD Flow Admin OHR

Background: common steps
Given User is on ETD home page and user is "WARTONICK, JEAN"

@tabsPresentOHR @regression2
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

@manageRolesAddAnAdminOHR @regression2
Scenario: Managing Roles negative outcome
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is already an admin as "WARTONICK, JEAN"
Then User can verify the alert message 

@manageRolesAdminOHR @regression2
Scenario: Assign as an admin
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "HASKINS, APRILE"
And User assigns an admin role
And User chooses an Organization/SAC from the dropdown
Then user can verify that SAVE button is enabled
And User can assign an admin role successfully
Then newly assigned OHR admin is able to log in
And User can delete the newly created OHR profile



@manageRolesLiaisonOHR @regression2
Scenario: Assign as an ETD liaison
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "HASKINS, APRILE"
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
And User can assign a liaison role successfully
And User can delete the newly created OHR profile

@filterOutManageRolesTabAdminPostiveOHR @regression2
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "BANKS, CAROLYN"
Then User can verify that OHR profile is present


@filterOutManageRolesTabAdminNegativeNIDDK @regression2
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "YAGER, KELLY"
Then User can verify that NIDDK profile is not present


@manageETDTierOHR  @regression2
Scenario Outline: Wide Search
When User clicks on Manage ETD Tab
Then User can verify Search button is enabled
And User picks a '<tier>' from dropdown
When User clicks Search button
Then User verifies the applied search for '<tier>' is present

Examples:
|tier    |
|All     |
|Tier I  |
|Tier II |
|Tier III|
|Tier III-D|
|Advisory Committee/Board Members/Intern|
