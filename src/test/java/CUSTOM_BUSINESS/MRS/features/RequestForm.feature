Feature: Request Form Flow

Background: common steps
Given User is logged in the application

@RequestForm @NESARH2 @Regression @playwright
Scenario: Submit a new Request Form
  Given the user is logged in
  When user clicks on Create Request button
  And User enters "RequestorName" in Requestor field
  And User enters "Title" of the requestor in the field if not populated
  And User selects No for "Do you want to submit On Behalf Of another NCI Division/Office/Center?"