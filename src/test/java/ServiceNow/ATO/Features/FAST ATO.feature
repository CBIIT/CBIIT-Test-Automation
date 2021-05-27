<<<<<<< HEAD
Feature: FAST ATO testing

  @FASTATO
  Scenario: Fast ATO
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "DRAP"
    And User selects the Application hosting solution as "NCI Cloud One"
    Then User clicks on the contacts tab
    And User selects the dates
    And User enters the note as "Test Automation"
    And User clicks on submit button
    #Given User opens ATO application in browser
    #When User will login to ato application
    #Then User clicks on "Native View" in header menu
    #And User filters value as "ATO"
    #And User clicks on "In Progress" package
    #And User will change the system owner of the first package to "Satya Gugulothu"
    Given User will login to the fast ato application
    When User clicks on "IN PROGRESS" tab of fast ato
    And User clicks on ato system
    And User verifies all system details
    Given User opens ATO application in browser
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    And User clicks on package link
    #And User enters renewal due date as "today"
    And User will select the state as "Complete"
    And User clicks on save button without frame
    Given user opens the fast ato page

  @HeaderValidate
  Scenario: User validates the header
    Given user opens the fast ato page
    Then User navigates to fast ato page and validates the header
=======

Feature: FAST ATO testing

@FASTATO
  Scenario: Fast ATO
  Given User opens ATO application in browser
  When User will login to ato application
  Then User clicks on "Native View" in header menu
  And User filters value as "ATO"
  And User clicks on "In Progress" package
  And User will change the system owner of the first package to "Satya Gugulothu"
  Given User will login to the fast ato application
  When User clicks on "IN PROGRESS" tab of fast ato
  And User clicks on ato system
  And User verifies all system details
  Given User opens ATO application in browser
  Then User clicks on "Native View" in header menu
  And User filters value as "ATO"
  And User clicks on "In Progress" package 
	And User clicks on package link
	And User enters renewal due date as "today"
	And User will select the state as "Complete"
	And User clicks on save button
  
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
