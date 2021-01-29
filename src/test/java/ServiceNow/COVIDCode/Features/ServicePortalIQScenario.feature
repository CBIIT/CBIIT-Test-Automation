
Feature: COVIDCode Service Portal Draft Initial Questionnaires Scenarios

Description: This feature file contains scenarios related to Service Portal Draft Initial Questionnaires

@New @Smoke 
Scenario: A user in the CovidCode App Admins group is able to open a saved draft initial questionnarie - Service Portal
Given a user in the CovidCode App Admins group has saved a draft Initial Questionnaire
When the user comes to the COVIDCode Home Page
Then the draft is shown in the Draft Initial Questionnaires table
And the user can resume draft by clicking the Open button

@New @Smoke 
 Scenario: Initial Questionnaire add a field option Other,specify in Disease Course section under Symptoms
Given COVIDcode user is on the Disease Course section on the Initial Questionnaire form
When selecting "Other, specify" for Symptoms
Then free text field with "Specify" text is displayed
