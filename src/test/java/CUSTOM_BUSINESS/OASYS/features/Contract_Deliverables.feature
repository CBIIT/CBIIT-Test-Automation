Feature: Contract Deliverable Flow

Background: common steps
Given User is logged in the application and navigated to Contract Administration

@AddDeliverableType @NESARH2 @Regression @playwright
 Scenario: Add a new Deliverable Type
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on ADD button
  And User types "Automated Test - Deliverable Type" in Name field
  And User selects "One Time" from the Frequency dropdown
  And User selects a Date
  And User verifies "Test CO" is the Final approver
  Then User will click on Save button
    
@UpdateDeliverableType @NESARH2 @Regression @playwright
 Scenario: Update an existing Deliverable Type
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on a deliverable type from the list
  And User clicks on Version Effective From to select a date
  And User clicks on Version Effective Until to select a date
  And User selects "Test FA" as Final Approver
  And User selects "Test AO" as Additional Reviewer
  Then User will click on Save button
  	
@DeliverableTypeVersioning @NESARH2 @Regression @playwright
 Scenario: Versioning a Deliverable Type
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on a deliverable type from the list
  And User clicks on ADD VERSION button
  And User updates the deliverable name to "Automated Testing - Deliverable Type V1" in Name field
  And User selects "Monthly" from the Frequency dropdown
  And User selects a Start date
  And User selects an End date
  And User selects "1" for Every How Many months?
  And User selects "1" for the Day of the month
  And User selects "Test Manager" as Final Approver
  And User selects "Test CS2" as Additional Reviewer
  Then User will click on Save button

@DeleteDeliverableType @NESARH2 @Regression @playwright
 Scenario: Versioning a Deliverable Type
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on "Automated Testing - Deliverable Type V1" from the deliverable type list
  Then User clicks on DELETE button to remove the Deliverable Type