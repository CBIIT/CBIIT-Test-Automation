Feature:  Invoice workflow

Background: common steps
Given User is logged in the application and navigated to Contract Administration

@SubmitInvoice @NESARH2 @Regression @playwright
Scenario: Submit an invoice
  When User clicks on Invoice Page
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
  When User clicks on Invoice Page
  And User clicks on a submitted Invoice
  And User expands the members
  And User clicks on EDIT button
  And User clicks on ADD ADDITIONAL FINAL APPROVERS button
  And User selects "Test Manager" as Final Approver for the invoice
  And User clicks on ADD ADDITIONAL REVIEWERS button
  And User selects "Test CS2" as Additional Reviewer for the invoice
  Then User clicks on Save button

@VoidInvoice @NESARH2 @Regression @playwright
Scenario: Voiding an invoice
  When User clicks on Invoice Page
  And User clicks on an invoice in Submitted status
  And User clicks on VOID INVOICE button
  And User selects Duplicate Invoice as the reason from the drop down
  Then User clicks on Void button

@VoidingReviewedInvoice @NESARH2 @Regression @playwright
Scenario: Verify the user can not void a reviewed invoice
  When User clicks on Invoice Page
  And User clicks on the reviewed Invoice
  And User verifies the invoice status
  Then User tries to click on Void button

@RestoreInvoice @NESARH2 @Regression @playwright
Scenario: Restoring an invoice
  When User clicks on Invoice Page
  And User clicks on the voided invoice
  And User clicks on RESTORE INVOICE button
  And User clicks on Continue button to acknowledge the message
  Then User verifies the invoice status is changed to "SUBMITTED"

@AssignPLINS @NESARH2 @Regression @playwright
Scenario: Assign PLINS for the invoice
  When User logs in as Test CO on the side login page
  And User clicks on Contract Administration
  And User clicks on Invoice Page
  And User clicks on a submitted Invoice
  And User clicks on Assigned PLINS tab
  And User clicks on Assign PLINS button
  And User clicks on ADD PLIN
  And User selects the PLIN Number
  And User selects the CAN Number
  And User enters the amount
  Then User clicks on SAVE button

@ReviewInvoiceAsTestCOR @NESARH2 @Regression @playwright
Scenario: Review the invoice as a reviewer (Test COR)
  When User logs in as Test COR on the side login page
  And User clicks on Contract Administration
  And User clicks on Invoice Page
  And User clicks on a submitted Invoice
  And User clicks on APPROVE button in the upper right corner of the page
  And User types "TEST APPROVAL" in Comments
  And User clicks on CHOOSE FILE button on New Files page
  And User checks the box for Confirm Approval
  Then User clicks on APPROVE button

@ReviewInoviceAsFinalReviewer @NESARH2 @Regression @playwright
Scenario: Review the invoice as a Final reviewer (Test CO)
  When User logs in as Test CO on the side login page
  And User clicks on Contract Administration
  And User clicks on Invoice Page
  And User clicks on a submitted Invoice
  And User clicks on APPROVE button in the upper right corner of the page
  And User clicks on Approved radiobutton
  And User types "TEST CO APPROVED" in Comments
  And User clicks on CHOOSE FILE button on New Files page
  And User checks the box for Confirm Approval
  And User clicks on APPROVE button
  Then User verifies the invoice status is updated to Approved

@DeleteInvoice @NESARH2 @Regression @playwright
Scenario: Delete an invoice as a System Admin
  When User clicks on Invoice Page
  And User verifies an invoice in Approved status is present
  And User clicks on DELETE button
  Then User verifies the invoice is deleted successfully