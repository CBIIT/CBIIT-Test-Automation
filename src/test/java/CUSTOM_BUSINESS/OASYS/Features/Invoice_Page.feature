Feature:  Invoice workflow

Background: common steps
Given User is logged in the application and navigated to Contract Administration

@SubmitInvoice @NESARH2 @Regression @playwright
Scenario: Submit an invoice
  When User clicks on Invoice
  And User clicks on Submit button and the Submit Invoice pop up is displayed
  And User enters the PIID-RefPIID "HHSN316201500067W" of the contract
  And User clicks on the contract
  And User enters the Invoice number
  And User enters the Invoice date
  And User selects the Start Date
  And User selects the End Date
  And User enters "200.00" as Invoice amount
  And User enters "Test User" as the Point of Contact Name
  And User enters "testuser@test.com" as the Point of Contact Email
  And User clicks on CHOOSE FILE button on New Files page
  And User types "Test Document" in Description
  And User selects "Assumptions" from the Type dropdown
  And User selects "Ready For Review" from the Status dropdown
  And User clicks on SUBMIT INVOICE button
  Then User verifies the invoice is in submitted status

@AssignAdditionalInvoiceReviewer @NESARH2 @Regression @playwright
Scenario: Assign Additional Reviewers for the submitted invoice
  When User clicks on Invoice
  And User clicks on a submitted Invoice
  And User expands the members
  And User clicks on EDIT button
  And User clicks on ADD ADDITIONAL FINAL APPROVERS button
  And User selects "Test Manager" as Final Approver for the invoice
  And User clicks on ADD ADDITIONAL REVIEWERS button
  And User selects "Test CS2" as Additional Reviewer for the invoice
  Then User clicks on Save button