Feature: Service Portal Enrollment Questionnaire Submissions


  @Smoke @updatedJan282021
  Scenario: COVIDcode Study Provider Enrollment Questionnaire Submission Group 1 User
    Given a COVIDcode Study Provider user has logged in to the COVIDcode Study application
    When the COVIDcode Study Provider fills out an Enrollment Questionnaire for a " User Group 1" who says "Yes" to join the study
    And enters users full name, required information, and demographics information
    But does not enter Disease Course and Exposures and Risk Factors information
    And Submits the enrollment questionnaire
    Then the enrollment questionnaire should be successfully submitted

  @Smoke @New  
  Scenario: On the Enrollment Form, in the Exposures and Risk Factors tab, change the field options for following questions
    Given a user is on the Exposures and Risk Factors tab on  COVIDcode Enrollment Questionnaire
    Then the options for the following questions Non-steroidal anti-inflammatory drugs, Myocardial infarction or stroke medication, Paracetamol/acetaminophen, Blood thinners, Asthma medication, ACE-inhibitors for blood pressure, Pollen allergy medication, ARBs, Antibiotics penicillin, azithromycin are: -- None --, Day of or day before onset of symptoms/diagnosis (if asymptomatic), 2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic), 1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic), 1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic), Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic), Never, Don’t know, Prefer not to answer 

  @Smoke @New
  Scenario: Verifying Spelling in Confirmation Submission
    Given an enrollment form has been filled out
    When submitting
    Then a pop up with the message "Are you sure you want to submit this questionnaire? Please make sure you review each tab and double-check your input for accuracy." displays

  @Smoke @New 
  Scenario: Verify Drug Treatments - Add Convalescent Plasma on Enrollment Questionnaire
    Given a COVIDCode App Admin user is in the Portal
    When the user creates a draft Enrollment questionnaire
    And creates a new Disease Course record
    Then there is a field option called "Convalescent plasma" for the Drug Treatments field
