Feature: Service Portal Enrollment Questionnaire Submissions

@Progression
Scenario: COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User
Given a COVIDcode Study Provider user has logged in to the COVIDcode Study application
When the COVIDcode Study Provider fills out an Enrollment Questionnaire for a "Group 1" who says "Yes" to join the study
And enters users full name, required information, and demographics information
But does not enter Disease Course and Exposures and Risk Factors information
And Submits the enrollment questionnaire
Then the enrollment questionnaire should be successfully submitted

