Feature: OWM Vacancy Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "OWM Vacancy Manager"

    @Regression @Smoke @Nekrashevich @Progression
    Scenario: Create a vacancy as OWM Vacancy Manager
      And User is on SCSS landing page
      And User navigates to tab "Vacancy Dashboard"
      And User clicks button "Create vacancy"
      And User fills in Vacancy Title as "Project Manager"
      And User marks option as checked for Allow HR Specialist to Triage
      And User fills in field Vacancy Description as "text"
      And User selects open and close date
      And User confirms that Cover letter document is marked as optional
      And User selects "Scientific Executive" as a Position Classification choice
      And User verifies that "Susan Greenhouse" is a contact for Appointment Package Initiator
      And User picks "HNC" for Organizational Code
      And User clicks button "Save"

