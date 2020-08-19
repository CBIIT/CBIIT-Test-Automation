#Author: Diego Juarez
#Supports COVID-

@Smoke
Feature: Native View Scenarios

  Scenario: COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    And is on the COVIDcode Enrollments page
    When the COVIDcode Study nurse begins an Enrollment Questionnaire for a "Group 1" user who consents "Yes" to join the study
    And fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors
    And submits the Enrollment Questionnaire
    Then the Enrollment Questionnaire should be successfully submitted