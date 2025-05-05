Feature: Request Form Flow

Background: common steps
Given User is logged in the application

@SubmitRequestForm @NESARH2 @playwright @In-Progress
Scenario: Submit a request form
  When User clicks on Create Request button
  And User enters the "Request Title"
  And User enters "RequestorName" in Requestor field
  And User enters "Title" of the requestor in the field if not populated
  And User selects Yes for "Do you want to submit On Behalf Of another NCI Division/Office/Center?"
  And User provides "Organization" name in the field for which they are working on behalf of