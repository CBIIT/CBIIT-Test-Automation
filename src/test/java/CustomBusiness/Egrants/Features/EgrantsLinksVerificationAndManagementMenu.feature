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