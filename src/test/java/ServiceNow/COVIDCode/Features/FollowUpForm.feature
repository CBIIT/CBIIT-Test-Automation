Feature: COVIDCode Follow Up Form Scenarios 

Description: This feature file contains scenarios related to the Follow Up Form

@Sprint7 @COVID-95 @Smoke
Scenario: Follow Up Form - Verifying added education question - Service Portal
When a COVIDCode user accesses a Follow Up Form to update an existing enrollment
Then the question "What is the highest level of school that you/the patient completed?" should display in the demographics section

@Sprint7 @COVID-209 @Smoke
Scenario: Follow Up Form - Search Function - Service Portal
Given a COVIDCode user is on the Follow Up Form to update an existing enrollment
Then the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number
