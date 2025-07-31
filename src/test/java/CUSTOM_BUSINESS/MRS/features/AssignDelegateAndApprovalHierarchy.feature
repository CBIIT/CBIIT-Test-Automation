Feature: Manage Delegation and Approval Hierarchy

Background: common steps
Given User is logged in MRS application

@ManageOrganizationalDelegation @NESARH2 @playwright @Regression
Scenario: Assign a delegate for a user - Manage Organizational Delegation
  When a user with "Admin" role is logged in
  And User clicks on Manage Delegation
  And User searches for a "Person - Delegate of"
  And User selects Temporary as Delegation Type
  And User selects a Delegate for the person
  And User enters Start and End Dates for the temporary delegate
  Then User clicks on Add button

@SetupApprovalHierarchy @NESARH2 @playwright @Regression
Scenario: Setup Approval Hierarchy as an Admin - Manage Approval Hierarchy
  When a user with "Admin" role is logged in
  And User clicks on Manage Approval Hierarchy
  And User selects "OFFICE OF THE DIRECTOR (OD)" from the list
  And User selects Default Approval Type
  And User enters the Approver Name
  And User enters the Title
  And User clicks on Add button
  Then User clicks on Save button and verifies the success message

@AssignMyDelegate @NESARH2 @playwright @Regression1
Scenario: Assign My Delegate as a user
  When a user clicks on My Delegation
  And User selects Temporary as Delegation Type
  And User selects a Delegate
  And User enters Start and End Dates for the temporary delegate
  Then User clicks on Add button

@SearchRequests @NESARH2 @playwright @Regression
Scenario: Search and Export requests in the MRS application
  When a user with "Admin" role is logged in
  And User clicks on Search Requests section
  And User enters "LAM" in the Requestor field
  And User enters "BUCKLEY" in the Approver field
  And User enters "ELLISON" in Author field
  And User selects "EGRP EEB" from the Organization field
  And User selects "Original Journal Article" from the Publication Type field
  And User Selects "No" for High Profile Request
  And User selects "No" for Includes Covid Information
  And User selects "No" for Includes Clinical Trial Information
  And User selects "No" for Includes Extramural Co-Authors
  Then User clicks on Search button
  And User clicks on Export button to export the search results