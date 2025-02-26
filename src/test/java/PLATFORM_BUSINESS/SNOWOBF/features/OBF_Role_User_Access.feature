Feature: SNOWOBF Roles related User Access Scenarios
  Description: This feature file contains user access scenarios for the SNOWOBF OBF Systems Support Form.

@SNOWOBF-190 @Chaudhryma @playwright @Regression
Scenario: Test: Enhancement: Add new Team member - Tim Siford to OBF Fulfiller group
  Given I am an authenticated OBF user "Ashley Eng"
  When a user submits an obf request where the application is BUS & topic is New Request for Access
  And that request gets approved
  Then a Requested Item should get created
  And "Tim Siford" should be added to the watchlist of the requested item
  And when an authenticated user "Tim Siford" access to an existing OBF ticket submitted above
  And Tim should have Read and Write Access to all OBF tickets by updating the submitted ticket