#Author: Diego Juarez
#Supports COVID-33, COVID-64, COVID-86
Feature: COVIDcode Study Provider Service Portal Login Scenarios

  @Smoke @juarezds
  Scenario: COVIDcode Study Provider Login when clicking 'Log In' button, clicks on Start new initial questionnaire button and verifies expected header text
    Given a COVIDcode Study Provider user is on the COVIDcode study homepage
    When the COVIDcode Study Provider user logs in by clicking Log In button
    Then the COVIDcode Study Provider user should see the header NIH User Dashboard
    Then the COVIDcode Study Provider starts new initial questionnaire by clicking on Start new initial questionnaire button and choose User Group ID "1"
    Then the COVIDcode Study Provider user should see the header "COVIDcode Enrollment Questionnaire"
    And the COVIDcode Study Provider also sees the header text as "Please fill out each data element to the best of your abilities. If you do not know the answer to a question, select “Don’t know”, do not leave it blank. Some fields are required and denoted by an asterisk. If you have any questions about completing this survey, please contact the study team at covidcode@mail.nih.gov or (240) 274-6777."
