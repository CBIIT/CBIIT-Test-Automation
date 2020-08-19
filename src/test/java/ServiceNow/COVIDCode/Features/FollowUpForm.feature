Feature: COVIDCode Follow Up Form Scenarios 

Description: This feature file contains scenarios related to the Follow Up Form

@Sprint7 @COVID-95
Scenario: RunDefined Follow Up Form - Verifying added education question - Service Portal
When a COVIDCode user accesses a Follow Up Form to update an existing enrollment
Then the question "What is the highest level of school that you/the patient completed?" should display in the demographics section
