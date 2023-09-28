Feature: Stadtman Vacancy Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "Stadtman Vacancy Manager"

  @Regression @Smoke @Nekrashevich @APPTRACK-892
  Scenario: Create a vacancy as Stadtman Vacancy Manager
    When User is on SCSS landing page
    And User navigates to tab "Vacancy Dashboard"
    And User clicks button "Create vacancy"
    And User fills in Vacancy Title as "Project Manager"
    And User marks option as checked for Allow HR Specialist to Triage
    And User marks Enables Focus Area as checked
    And User fills in field Vacancy Description as "text"
    And User selects open date as "25" and close date as "75"
    And User confirms that Cover letter document is marked as optional
    And User selects "Senior Investigator" as a Position Classification choice
    And User verifies that "Roland Owens" is a contact for Appointment Package Initiator
    And User picks "HNA" for Organizational Code
    And User includes all available Mandatory Statements Page selections
    And User adds "Daniel Pine" as a Chair
    And User adds "Lisa Mirabello" as an Executive Secretary
    And User clicks button "Save"
    And User includes all available Email Templates selections
    Then User publishes a vacancy by clicking "Save and Finalize" button
    And User cav verify that a vacancy is finalized