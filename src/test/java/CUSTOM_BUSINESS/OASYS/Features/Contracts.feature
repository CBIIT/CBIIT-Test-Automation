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

@CreateContractMessage @NESARH2 @Regression @playwright
Scenario: Verify that a User can create a contract message
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on Contract Messages
  And User clicks on NEW Message button
  And User types TEST CONTRACT MESSAGE in the Subject line
  And User types a text in the message body
  And User clicks on Submit button
  Then User verifies the submitted message contains "TEST CONTRACT MESSAGE"

@VendorContacts @NESARH2 @Regression @playwright
Scenario: Verify that a User can add vendor contacts to a contract
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on Vendor Contacts
  And User clicks on ADD NEW button
  And User types "Test" in First Name field
  And User types "Manager" in Last Name field
  And User types "testman@nih.gov" in Email field
  And User types "Manager" in Title field
  And User types "111-222-3344" in Phone field
  And User selects Business Representative from Contact Type
  Then User clicks on SAVE button