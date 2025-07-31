Feature: Request Form Flow

Background: common steps
Given User is logged in MRS application

@SubmitRequestForm @NESARH2 @playwright @Regression12
Scenario: Submit a request form on behalf of another person
  When User clicks on Create Request button
  And User enters the "Creating a request through automated test" as Request Title
  And User enters "Lam, Tram" in Requestor field
  And User enters "Team Member" as the requestor title
  And User selects "Yes" for Do you want to submit On Behalf Of another NCI Division?
  And User provides "NCI DCCPS BRP" in the organization field for which they are working on behalf of
  And User selects "Original Journal Article" for Publication Type
  And User enters "Test Journal" in Journal or Book Name
  And User selects "Yes" for any associated fees
  And User enters "100" in the Amount field
  And User selects "Klein, William" as NIH Authors
  And User enters "QA Team Members" as Non NIH Authors
  And User selects "NCI Researchers" as the Author Type
  And User selects No for the BIAS question
  And User selects "NCI CCR CBL" as NIH Represented Organizations
  And User enters "12345" as the Grants or Contract Number
  And User enters "None" as the Journal Impact Factor
  And User selects "No" for Does this Request address any high profile or controversial content?
  And User selects "No" for Does this manuscript involve clinical trial information?
  And User clicks on Choose File button to upload a document
  And User selects "Serial" as Approval Type
  And User selects "Buckley, Denise" as additional approver
  Then User clicks on Submit for Verification button

  @SubmitRequestFormForYourself @NESARH2 @playwright @Regression
  Scenario: Submit a request form for yourself
    When User impersonates as "ELLISON, GARY"
    And User clicks on Create Request button
    And User enters the "Creating a request through for myself automated test" as Request Title
    And User enters "ELLISON, GARY" in Requestor field
    And User enters "Team Member" as the requestor title
    And User selects "No" for Do you want to submit On Behalf Of another NCI Division?
    And User selects "Reviews" for Publication Type
    And User enters "Test Reviews" in Journal or Book Name
    And User selects "No" for any associated fees
    And User selects "LAM, TRAM" as NIH Authors
    And User selects "Both NCI and External Researchers" as the Author Type
    And User selects No for the BIAS question
    And User selects "NCI DCCPS BRP BBPSB" as NIH Represented Organizations
    And User selects "Yes" for Does this Request address any high profile or controversial content?
    And User enters "Test explanation in the text area" as the explanation
    And User selects "Yes" for Does this manuscript involve clinical trial information?
    And User selects "Yes" for Does this manuscript or abstract involve a Clinical Study with a CTEP or NIH Trial?
    And User enters "CTEP12345" as the CTEP or NIH Clinical Trial Number
    And User selects "Yes" for Clinical Exemption: Is the study exempt from being considered human subjects research?
    And User clicks on Choose File button to upload a document
    And User selects "Parallel" as Approval Type
    Then User clicks on Submit for Approval button

  @AddAdditionalApprover @NESARH2 @playwright @Regression
  Scenario: Add an additional approver to a request
    When User selects an existing request
    And User clicks on Add Additional Approver
    And User selects "ELLISON, GARY" as the additional approver
    And User clicks on Save button
    Then User verifies that "ELLISON, GARY" is listed as an additional approver in the request details

  @SubmitForApproval @NESARH2 @playwright @Regression
  Scenario: Submit a request for approval as a requestor
    When a requestor is logged in
    And User selects an existing request from My Queue
    Then User verifies that the request status is "REQUEST STATUS: SUBMITTED FOR VERIFICATION"
    And User clicks on Submit for Approval button
    Then User verifies the status is updated to "REQUEST STATUS: PENDING APPROVER DECISION"

  @ApproveRequest @NESARH2 @playwright @Regression
  Scenario: Approve a request as a first approver
    When a user with "Admin" role is logged in
    And User selects a request from the Approval Queue
    And User selects Approve action from the dropdown
    And User enters "Approved by first approver" in the comments field
    Then User clicks on Process Action button

  @ApproveRequest @NESARH2 @playwright @Regression
  Scenario: Approve a request as a second approver
    When a second approver with Admin role is logged in
    And User selects a request from the Approval Queue
    And User selects Approve action from the dropdown
    And User enters "Approved by second approver" in the comments field
    Then User clicks on Process Action button

  @ReturnForRevision @NESARH2 @playwright @Regression
  Scenario: Return a request for revision
    When a user with "Admin" role is logged in
    And User selects a request from the Approval Queue
    And User selects Return for Revision action from the dropdown
    And User enters "Needs more information" in the comments field
    Then User clicks on Process Action button
    And User confirms the Return for Revision

  @DeleteRequest @NESARH2 @playwright @Regression
  Scenario: Verify that a user can delete a request and it is no longer accessible in the MRS application
    When the user selects the option to Delete the request
    And the user confirms the delete operation
    Then the system displays a success message stating the request has been deleted
    And the Active Requests queue for the submitter or requestor and their delegates no longer displays the deleted request

  @DisapproveRequest @NESARH2 @playwright @Regression
  Scenario: Disapprove a request as a first approver
    When a user with "Admin" role is logged in
    And User selects a request from the Approval Queue
    And User selects Disapprove action from the dropdown
    And User enters "Disapproved by first approver" in the comments field
    Then User clicks on Process Action button

  @WithdrawRequest @NESARH2 @playwright @Regression
  Scenario: Withdraw a submitted request
    When a requestor is logged in
    And User selects an existing request from My Queue
    And User clicks on Withdraw button
    And User provides a reason for withdrawal
    Then User clicks on Withdraw Request button