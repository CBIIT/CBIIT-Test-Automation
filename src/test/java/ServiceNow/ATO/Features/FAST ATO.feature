
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
  