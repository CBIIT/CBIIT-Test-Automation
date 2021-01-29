
Feature: COVIDCode Service Portal Draft Follow-Up Questionnaires Scenarios

Description: This feature file contains scenarios related to Service Portal Draft Follow-Up Questionnaires

@New @FAIL @REVIEW @DANIYAR
Scenario:  A user in the CovidCode App Admins group is able to open a saved draft follow up questionnarie - Service Portal
Given a user in the CovidCode App Admins group has saved a draft Follow-up Questionnaire
When the user in the CovidCode App Admins group comes to the COVIDCode Home Page
Then the draft is shown in the Draft Follow up Questionnaires table on the Home Page
And the user can resume draft follow up questionnaire by clicking the Open button


@New @FAIL @REVIEW @DANIYAR 
Scenario: Follow Up Questionnaire add a field option Other,specify in Disease Course section under Symptoms
Given a COVIDcode user is on the Disease Course section on the Follow Up form
When select "Other, specify" for the Symptoms
Then a free text field "Specify" text is displayed

