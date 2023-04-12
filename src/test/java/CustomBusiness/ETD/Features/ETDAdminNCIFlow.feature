Feature: ETD Flow Admin NCI

Background: common steps
Given User is on ETD home page and user is "CLIFFORD, DAVID"

@manageRolesAddAnAdminNCI  @regression
Scenario: Managing Roles negative outcome
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is already an admin as "Nekrashevich, Alena"
Then User can verify the alert message

@tabsPresentNCI @regression
Scenario Outline: Verify Present Tabs
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

@overrideUser @regression
Scenario:Login as the same User Negative Outcome
When User log is as "CLIFFORD, DAVID"
Then User can verify that the User is still logged in as "CLIFFORD, DAVID"


@manageRolesadminDeletingProfile @regression
Scenario: Admin deletes profile
When User clicks on Manage Roles tab
And User inputs in Search bar their name
Then User can not delete their profile


@manageRolesAdminNCI  @regression
Scenario: Assign as an admin
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "Agu, Barbara"
And User assigns an admin role
And User chooses an Organization/SAC from the dropdown
Then user can verify that SAVE button is enabled
And User can assign an admin role successfully
Then newly assigned admin is able to log in
And User can delete the newly created profile

@manageRolesLiaisonNCI @regression
Scenario: Assign as an ETD liaison
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "Agu, Barbara"
When User trying to save the addition without picking an organization
Then User can verify that Save button is disabled
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
And User can assign another organization successfully
When User assigns the same organization
Then User does not see that organization in dropdopwn choices
And User can assign a liaison role successfully
And User can delete the created profile

@manageRolesAddUserOperationsNCI @regression
Scenario: assigning operations
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "Agu, Barbara"
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
Then User can successfully delete that organization choice

@manageRolesCancelNCI @regression
Scenario: Cancel operation
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "Agu, Barbara"
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
And User can assign another organization successfully
Then user can verify that SAVE button is enabled
And User can cancel the whole operation

@manageRolesMultipleGroupsAccessNCI @regression
Scenario: Multiple groups access
When User clicks on Manage Roles tab
And User clicks add button
And User searches for a user that is not an admin as "Agu, Barbara"
And User assigns an ETD liaison role
And User chooses an Organization/SAC from the dropdown
And User can assign another organization successfully
Then user can verify that the access is added successfully
And User can delete the newly created profile

@manageRolesEditExistingUserNCI @regression
Scenario: Edit existing user
When User clicks on Manage Roles tab
And User picks an existing profile as "ADAM, TRENGO"
Then User can successfully edit that profile
And User resets profile data


@filterOutManageRolesTabAdminPostiveNCI @regression
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "ADAM, TRENGO"
Then User can verify that profile is present


@filterOutManageRolesTabAdminNegativeNCI @regression
Scenario: filter out profiles
When User clicks on Manage Roles tab
Then user can see the filter option present
And User inputs a profile into search box as "EGGERT, BILL"
Then User can verify that profile is not present

@manageRolesSortingAdminNCI @regression
Scenario: sorting
When User clicks on Manage Roles tab
And user can see tabs as Name, Organization, Role, Actions
Then User can sort in ascending order 
And User can sort in descending order 


@manageETDAdminOrganizationChoiceNCI @regression
Scenario: Managing ETD fields
When User clicks on Manage ETD Tab
And User can choose an organization from the dropdown
And User can verify that an appropriate SAC appears
When User clicks Search button
Then User can see profiles "names" related to the NCI applied search
And User can export results successfully


@manageETDWideSearchPerNCI  @regression
Scenario: Wide Search applied
When User clicks on Manage ETD Tab
Then User can verify Search button is enabled
Then User clicks on Search
Then User verifies the applied search is present


@NCITierUsersNCIs @regression
Scenario Outline: Home Tab for Tier 1
Given User logged in as a '<Tier User>'
When User is on Home Tab
Then User can verify that '<content of Tier>' related
Examples:
|Tier User |content of Tier |
|Tier User1|content of Tier1|             
|Tier User2|content of Tier2|                
|Tier User3|content of Tier3|
|Tier Use3D|content of Tier4|


@manageETDReminders @regression 
Scenario: Reminders count is reset
When User clicks on Manage ETD Tab
And User selects a profile with a reminder date present
When User resets that profile
Then User can verify that reminder info is NULL
And User resets that action

@manageETDTier  @regression
Scenario Outline: Wide Search
When User clicks on Manage ETD Tab
Then User can verify Search button is enabled
And User picks a '<tier>' from dropdown
When User clicks Search button
Then User verifies the applied search for '<content>' is present

Examples:
|tier      |content   |
|All       |contentAll|
|Tier II   |content2  |
|Tier III  |content3  |
|Tier III-D|content4  |



@manageETDAdminVerifyFieldsofSearchViewNOtesNCI @regression
Scenario: Managing ETD fields
When User clicks on Manage ETD Tab
And User loads a wide search
Then User can verify fields of Search are present
|field1|field2 |field3|field4           |field5         |field6     |field7                           |field8                               |field9                     |field10|  
|Name  |Tier   |SAC   |Date Acknowledged|Acknowledged By|Reminder(s)|Current Telework Agreement Status|Current Telework Agreement Expiration|Telework Approving Official|Notes  |
When User picks an NCI profile to view 
Then User can see Actions options appear
And User can add an exception flag
And User can remove an exception flag
And User can edit existing notes
Then User can save applied changes


@manageETDNCIUserAcknowledgedTier @regression
Scenario: User acknowledged Tier
When User clicks on Manage ETD Tab
And User loads a wide search
And User picks a profile that has acknowledged their tier
And User verifies that Date Acknowledged and Acknowledged by are NOT Null. 
And User logs in as that person
Then User can see an alert on the acknowledged tier

@manageETDresetAcknowledgementNCI @regression
Scenario: Reset Acknowledgement
When User clicks on Manage ETD Tab
And User loads a wide search
And User resets acknowledgement for a NCI profile
Then User can successfully accomplish that step
And User resets the scenario



@manageETDBulkReset @regression
Scenario: Bulk reset
When User clicks on Manage ETD Tab
And User loads a wide search
And User selects all checkmark
Then User clicks on Bulk Reset Button
#And User can verify that Bulk reset only applies on the page level 


@manageETDTier3D @regression
Scenario: Tier III-D
When User clicks on Manage ETD Tab
And User picks a tier "Tier III-D" from dropdown
Then User can verify that new hires are located under this tier


@manageETDDateAcknowledged @regression
Scenario: Reset Acknowledgement
When User clicks on Manage ETD Tab
And User loads a wide search
And User picks a profile that has not acknowledged their tier designation
Then User can verify that Date Acknowledged and Acknowledged by data entries are not present


@manageETDEmergencyLetterAlert @regression
Scenario: Reset Acknowledgement
When User clicks on Manage ETD Tab
And User loads a wide search
And User logs in as "DAVIS, BRIAN"
Then User can verify that home tab is not authorized
































