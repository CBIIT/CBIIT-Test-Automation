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
  And User types "Test AO" in Invoice Support Staff field
  And User clicks on Test AO
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

@AddContractFolder @NESARH2 @Regression @playwright
Scenario: Add a folder to a contract
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on FILES tab
  And User clicks on ADD button on the Files tab
  And User clicks on Folder
  And User types "Testing Folder" in the Name field
  Then User clicks on SAVE button

@AddContractFiles @NESARH2 @Regression @playwright
Scenario: Add a file to a contract
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on FILES tab
  And User double clicks on Testing Folder
  And User clicks on ADD button on the Files tab
  And User clicks on FILE
  And User clicks on CHOOSE FILE button on New Files page
  And User types "Test Document" in Description
  And User selects Acquisition Plan from the Type dropdown
  And User selects Ready For Review from the Status dropdown
  Then User will upload the file by clicking on the SAVE button

@DeleteContractFolder @NESARH2 @Regression @playwright
Scenario: Verify that Test COR can not access All Contracts
  When User clicks on Contracts
  And user selects "IT Commodities and Solutions" from the list of contracts
  And User clicks on FILES tab
  And User selects Testing Folder and clicks on DELETE icon
  Then User clicks on DELETE button to confirm the deletion

@ImportContract @NESARH2 @Regression @playwright
Scenario: Verify that a user can create a contract
  When User clicks on Contracts
  And User clicks on Import button on the contract page
  And User clicks on Contract
  And User types the Contract Number
  And User selects a Vendor
  And User clicks on Open to Correspondence
  And User selects Non Severable for the Severability
  And User selects "Yes" from the IT related dropdown
  And User selects "No" from IDIQ
  And User types the Project title
  And User selects "No" from Conference Support
  And User selects "Yes" from Government Oversight Required
  And User selects "Not Applicable" from High Risk
  And User selects "Core IT" from Excepted Contracts
  And User selects "FFP" from Type of Contract
  And User selects GSA for the Procurement Mechanism
  And User selects "BPA Call" from Award Type
  And User selects "NITAAC" from Internal Issuing Agency
  And User selects "DoD" from External Issuing Agency
  And User selects "Other" from Services Rendered for Federal Employees
  And User selects "Yes" from Multiple Year
  And User selects a date for Funded Through Date
  And User selects "Yes" for Will funding need to be added for expected activities within the next three months?
  And User selects "Yes" for Does the COR advise continued performance?
  And User selects "Partial Stop Work" for What notice will be sent in the event of a shutdown?
  And User will click on SAVE button
  Then User verifies the contract header

@ContractSearchFilters @NESARH2 @Regression @playwright
Scenario: Using search filters to narrow down search results
  When User clicks on Contracts
  And User types "Dell EMC Isilon Hardware and Software Support and Maintenance" in the Contract Title field
  And User selects "RUSSELL John" from the Staff Assignment dropdown on the contract page
  And User selects Show inactive contracts
  And User clicks on SEARCH button to search for defined contracts
  Then User will verify if "Dell EMC Isilon Hardware and Software Support and Maintenance" is listed in the search results

@ContractSliderDetails @NESARH2 @Regression @playwright
Scenario: Verify a contract details on the slider matches the main contract page
  When User clicks on Contracts
  And User clicks on the eye icon for IT Commodities and Solutions
  And User verifies the project title
  And User verifies the REFPIID-PIID
  And User verifies the CO assigned on the contract
  And User verifies the CS assigned on the contract
  And User verifies the COR assigned on the contract
  Then User closes the slider

@ExportContractSearchResults @NESARH2 @Regression @playwright
Scenario: Export search results
  When User clicks on Contracts
  And User selects Show inactive contracts
  And User types "IT Commodities" in the Contract Title field
  And User clicks on SEARCH button to search for defined contracts
  Then User will click on EXPORT SEARCH RESULT button

@TestCORUserAccessLevel @NESARH2 @Regression @playwright
Scenario: Verify that Test COR can not access All Contracts
  When User logs in as Test COR on the side login page
  And User navigates to Contracts
  Then User will verify that Test COR can not access All Contracts