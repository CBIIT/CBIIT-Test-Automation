Feature: This Feature File contains Quick Link, logged in user verifications and Management menu
  Background: common steps
  Given User is logged in the application and is on the landing page

  @QuickLinkVerification @nesarh2 @selenium @Regression
  Scenario: Test Egrants Quick Links and logged in user
    And User expands Quick Links
    And User is able to navigate to "PMS" hyperlink
    And verifies that the logged in user "Logged in as:Diego Juarez" is shown

  @QCAssignmentReport @nesarh2 @selenium @Regression
  Scenario: Test QC Assignment Report
    Given User is on the Management menu
    When User selects "Change" as the QC Reason
    And User selects "Quality, Associates" as QC Person
    Then User clicks on Assign button to confirm the assignment

  @QCRouteReport @nesarh2 @selenium @Regression
  Scenario: Test routing documents from one QC person to another (QC Route Report)
    Given User is on the Management menu
    And User clicks on FROM dropdown to select "D'Avella, Joseph"
    And User clicks on To dropdown to select Quality Associates
    And User selects 10% of the documents
    Then User clicks on Route button to confirm the routing

  @FlagMaintenance-Add @nesarh2 @selenium @Regression
  Scenario: Test adding a flag to grant
    Given User is on the Admin menu
    And User selects Flag Maintenance from the dropdown
    And User clicks on Setup Flag link
    And User selects DS flag from the Flag Types
    And User provides 125123 as the grant serial number
    And User clicks on search button
    And User selects grant year 17
    Then User clicks on Setup Flags button to confirm adding DS flag for the selected grant year

  @FlagMaintenance-Remove @nesarh2 @selenium @Regression
  Scenario: Test removing a flag from a grant
    Given User is on the Admin menu
    And User selects Flag Maintenance from the dropdown
    And User selects DS flag from the Flag Types
    And User searches for 125123
    And User selects grant year 17 from the search results
    Then User clicks on Remove button to confirm removing the DS flag from the selected grant year

  @AddNewUser @nesarh2 @selenium @Regression @EGRANTS-586
  Scenario: Add a new user to the system through Admin menu > eGrants Access Control
    Given the IC Coordinator is on the Admin menu
    And the IC Coordinator selects eGrants Access Control from the dropdown
    And the IC Coordinator clicks on Add New button
    And the IC Coordinator provides a RandomUserId as the User ID
    And the IC Coordinator clicks on Check button
    And verifies that the system shows a message the provided user does not exist in the system and do you want to create a new account?
    And the IC Coordinator provides the First Name
    And the IC Coordinator provides the Last Name
    And the IC Coordinator provides the Email Address
    And the IC Coordinator provides access to Management and Dashboard tabs
    And the IC Coordinator selects Program Staff as the Role
    And the IC Coordinator selects "Qaulity, Associates" as the Coordinator
    Then the IC Coordinator clicks on Add New button to confirm adding the new user

  @AddExistingUser @nesarh2 @selenium @Regression @EGRANTS-586
  Scenario: Try adding an existing userid to verify if system restricts duplicate user ids
    Given the IC Coordinator is on the Admin menu
    And the IC Coordinator selects eGrants Access Control from the dropdown
    And the IC Coordinator clicks on Add New button
    And User provides "qa" as the User ID
    And the IC Coordinator clicks on Check button
    Then the system notifies the IC Coordinator that userid already exists in the system