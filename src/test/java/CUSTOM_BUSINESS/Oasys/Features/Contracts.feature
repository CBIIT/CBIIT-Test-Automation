Feature: Contract Flow

Background: common steps
Given User is logged in the application and navigated to Contract Administration

@ContractInformation @NESARH2 @Regression @playwright
Scenario: Edit contract information
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And user clicks on Edit Contract Information button
  And user changes the Severability to Severable
  And User selects Yes from the IT related dropdown
  And User selects Open Market for the Procurement Mechanism
  And User selects No for Will funding need to be added for expected activities within the next three months?
  And User selects No for Does the COR advise continued performance?
  And User selects Stop Work for What notice will be sent in the event of a shutdown?
  Then User clicks on Save button to confirm the changes

@EditContractAssignments @NESARH2 @Regression @playwright
Scenario: Edit contract assignments
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on Assignments
  And User clicks on Edit button
  And User clicks on ADD INVOICE Support Staff
  And User types "Test COR" in Invoice Support Staff field
  And User clicks on Test COR
  Then User will click on SAVE button