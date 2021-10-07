Feature: TEST ACCOUNT RESET
  
  Description: This feature resets CHARMS test accounts used for Automation

  @TestAccountReset @INVALID
  Scenario: Test Account Reset
    Given logged in to ServiceNow Native View
    When searching for "Studio" in the filter navigator
    And click on Studio
    Then a new tab opens with ServiceNow Studios applications filter search box
    When searching for "Family Cohort Study"
    And clicking on the Family Cohort Study application link
    Then the "Welcome to Studio" page displays with CHARMS application explorer
    Then on the tables drop down navigate to CHARMS Referrals
    And under "Related Links" click on Show List
    Then search for test account email address "diegojuarezbusiness@gmail.com"
    Then select the account and delete it - this will reset the screener form
    Then on the tables drop down navigate to Family Member Details
    Then navigate to Show List
    Then search by testers name "Diego TestAccount2"
    Then select the account and delete it - this will reset Family Member Details
    Then on the tables drop down navigate to FCSMS Form Access
    Then navigate to  FCSMS Show List
    Then search for test account email address for FCSMS form "diegojuarezbusiness@gmail.com"
    Then select the account and delete it - this will reset FCSMS Form Access
