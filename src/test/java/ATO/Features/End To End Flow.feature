@EndToEndFlows
Feature: Validate the end to end flows for ATO & fast ATO

  @AToEndToEnd
  Scenario: Valdiate end to end flow
   Given User opens ATO application in browser
  When User will login to ato application
    Then User clicks on "Native View" in header menu
   And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "CLASS"
   And User selects the Application hosting solution as "NCI Cloud One"
   Then Switch to iframe id "gsft_main"
    And User clicks on save button without frame
    And User will select the state as "In progress"
    And User clicks on save button without frame
    Then User clicks on the contacts tab
    And User selects the dates
    And Set approved By to "Satya Gugulothu"
    And User clicks on save button without frame
    Then go back and sort packages
   Then Change system owner of first package to "Satya Gugulothu" from home page
    Then User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    Then user verifies all the forms in "CLASS" package but edits the last one
    Given User opens ATO application in browser
   Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then Switch to iframe id "gsft_main"
    Then Sort packages
    Then goto first package and click on verify button
    Then User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    Then user verifies all the forms in "CLASS" package
    Then verify all forms are complete and take screenshot
    Given User opens ATO application in browser
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then Switch to iframe id "gsft_main"
#    Then Sort packages
    Then complete the pending approvals for first package
    Then CLick On Renew Button
