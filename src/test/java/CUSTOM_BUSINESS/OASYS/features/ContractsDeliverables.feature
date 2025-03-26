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

@SubmitDeliverable @NESARH2 @Regression @playwright
 Scenario: Submit a Deliverable for Review
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on a Deliverable from the Schedule list
  And User clicks on SUBMIT DELIVERABLE button on upper right corner of the page
  And User types "Test CO" in Point of Contact Name
  And User types "testco@nih.gov" in Point of Contact Email
  And User clicks on CHOOSE FILE button on New Files page
  And User types "Test Document" in Description
  And User selects "Assumptions" from the Type dropdown
  And User selects "Ready For Review" from the Status dropdown
  And User will deselect Include in Contract Files
  Then User will click on SUBMIT DELIVERABLE button

@DeliverableReviewCOR @NESARH2 @Regression @playwright
 Scenario: Review the deliverable as a reviewer (Test COR)
  When User logs in as Test COR on the side login page
  And User clicks on Contract Administration
  And User clicks on Deliverable module
  And User clicks on the Deliverable from To Do list
  And User clicks on APPROVE button on the upper right corner of the page
  And User types "COR Approved" in the Comments
  And User clicks on CHOOSE FILE button on New Files page
  And User will check the box for Confirm Approval
  Then User will click on APPROVE button

@DeliverableReviewCO @NESARH2 @Regression @playwright
 Scenario: Review the deliverable as a Final reviewer (Test CO)
  When User logs in as Test CO on the side login page
  And User clicks on Contract Administration
  And User clicks on Deliverable module
  And User clicks on the Deliverable from To Do list
  And User clicks on APPROVE button on the upper right corner of the page
  And User types "CO Approved" in the Comments
  And User clicks on CHOOSE FILE button on New Files page
  And User will check the box for Confirm Approval
  And User will click on APPROVE button

@ResetDeliverableStatus @NESARH2 @Regression @playwright
 Scenario: Reset a deliverable status
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on DELIVERABLE tab
  And User clicks on a Deliverable from the Schedule list
  And User expands the members
  And User clicks on Undo Review for CO
  Then And User navigates back the Deliverable list