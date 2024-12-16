Feature: Contract Flow

@CONTRACT_INFORMATION @NESARH2 @Regression @playwright
Scenario: Edit contract information
Given User is logged in as Contracting Officer
When User clicks on Contract Administration
And User clicks on Contracts
And user selects "IT Commodities and Solutions" from the list of contracts
And user clicks on Edit Contract Information button
And user changes the Severability to Severable
Then User clicks on Save button to confirm the changes