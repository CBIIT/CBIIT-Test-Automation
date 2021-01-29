Feature: Service Portal Enrollment Questionnaire Submissions

  @Smoke @updatedJan282021 @Progression
  Scenario: COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User
    Given a COVIDcode Study Provider user has logged in to the COVIDcode Study application
    When the COVIDcode Study Provider fills out an Enrollment Questionnaire for a " User Group 1" who says "Yes" to join the study
    And enters users full name, required information, and demographics information
    But does not enter Disease Course and Exposures and Risk Factors information
    And Submits the enrollment questionnaire
    Then the enrollment questionnaire should be successfully submitted

  @New @Smoke @updatedJan282021 
  Scenario: Verifying Spelling in Confirmation Submission
    Given an enrollment form has been filled out
    When submitting
    Then a pop up with the message "Are you sure you want to submit this questionnaire? Please make sure you review each tab and double-check your input for accuracy." displays
