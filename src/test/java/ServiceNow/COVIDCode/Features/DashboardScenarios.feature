Feature: COVIDCode Dashboard Scenarios
  
  Description: this feature file contains scenarios telated to the COVIDCode Dashboard

  @Smoke @New @juarezds
  Scenario: Verifying - Start new initial questionnaire button
    Given a Study Nurse has logged in
    When the user lands on the COVIDCode Home Page
    Then there is a button called "Start new initial questionnaire"

  @Smoke @New @juarezds
  Scenario: Verifying - Start new follow-up questionnaire button
    Given a Study Nurse has logged in
    When the user lands on the COVIDCode Home Page
    Then there is a button named "Start new follow-up questionnaire"

  @Smoke @New @juarezds
  Scenario: Verifying - Draft Initial Questionnaire table
    Given a user in the CovidCode App Admins group has logged in
    When the user lands on the COVIDCode Home Page
    Then there is a table called "Draft Initial Questionnaires"
    And the table contains the following columns, "Patient ID", "User Group ID", "NIH Medical Record #", "Last Updated", "Available Actions"

  @Smoke @New @juarezds
  Scenario: Verifying - Draft Follow-up Questionnaire table
    Given a user in the CovidCode App Admins group has logged in
    When the user lands on the COVIDCode Home Page
    Then there is a table named "Draft Follow-up Questionnaires"
    And the table contains the following: "Patient ID", "User Group ID", "NIH Medical Record #", "Last Updated", "Available Actions"

