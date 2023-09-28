Feature: OWM Vacancy Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "OWM Vacancy Manager"

    @Regression @Smoke @Nekrashevich @APPTRACK-7 @Progression
    Scenario: Create a vacancy as OWM Vacancy Manager
      And User is on SCSS landing page
      And User navigates to tab "Vacancy Dashboard"
      And User clicks button "Create vacancy"
      And User submits the "Basic Vacancy Information"
      And user is selecting the "Mandatory Statements"
      And user is adding "Vacancy Committee" members
      And user chooses "Email Templates"
      And User includes all available Email Templates selections
      Then User publishes a vacancy
      And User verify that a vacancy is finalized


