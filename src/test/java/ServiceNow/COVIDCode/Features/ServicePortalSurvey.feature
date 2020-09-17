Feature: Volunteer Survey
  Description: Volunteer Survery scenarios including both Service Portal and Native View

  @Sprint9 @COVID-109 @INPROGRESS
  Scenario: Volunteer Survey Self Submission_1 - Service Portal
    Given a user is on the COVIDCode home page
    And selects the option to Volunteer
    Then the "COVIDcode" page displays with the option to start the survey
    When starting the survey
    And the user selects option to fill out the survery for themselves
    Then the question "Have you tested positive for" populates
    When selecting No
    Then the question "How was the sample taken?" displays
    When selecting "Nasal or throat swab"
    And selecting "Rapid testing (up to 2 hour turnaround)" checkbox
    And selecting No for being able to provide a copy of test report
    And selecting No for for ever being hospitalized
    When clicking next
    Then the "Contact Information " displays where the user is able to enter their contact information
    When entering required information
    And clicking next to proceed
    Then the "How did you hear about us? " page displays with a question regarding the discovery of the survey
    When selecting option "I prefer not to answer"
    And clicking Submit
    Then the "Your survey has been submitted successfully!" page displays
    And the user is able to see a message "If you have any questions, please feel free to email us at covidcode@mail.nih.gov"
    When the user selects OK
    Then the user is prompted back to the COVIDCode Study Home Page

  @Sprint9 @COVID-109 @Smoke
  Scenario Outline: Volunteer Survey Self Submission - Service Portal
    Given a user is on the COVIDCode home page
    And selects the option to Volunteer
    Then the "COVIDcode Volunteer Survey" page displays with the option to start the survey
    When starting the survey
    And the user selects option to fill out the survery for themselves
    Then the question "Have you tested positive for" populates
    When "<HaveYouTestedPositive>" option is selected
    Then the question "How was the sample taken?" displays
    When "<sampleTypeTaken>" sample taken is selected
    And selecting "Rapid testing (up to 2 hour turnaround)" checkbox
    And "<canYouProvideAcopyOfTest>" option is selected for being able to provide a copy of test report
    And "<wereYouHospitalized>" option is selected for being hospitalized
    When clicking next
    Then the "Contact Information " displays where the user is able to enter their contact information
    When entering required information
    And clicking next to proceed
    Then the "How did you hear about us? " page displays with a question regarding the discovery of the survey
    And "<howDidYouFindOutAboutTheStudy>" option is selected for finding out about the study
    And clicking Submit
    Then the "Your survey has been submitted successfully!" page displays
    And the user is able to see a message "If you have any questions, please feel free to email us at covidcode@mail.nih.gov"
    When the user selects OK
    Then the user is prompted back to the COVIDCode Study Home Page

    Examples: 
      | HaveYouTestedPositive | sampleTypeTaken      | canYouProvideAcopyOfTest | wereYouHospitalized | howDidYouFindOutAboutTheStudy |
      | Yes                   | Saliva               | Yes                      | No                  | I prefer not to answer        |
      | Yes                   | Blood draw           | No                       | Yes                 | ClinicalTrials.gov            |
      | Yes                   | Nasal or throat swab | No                       | No                  | COVID-19 prevention website   |

  @Sprint9 @COVID-220 @Smoke
  Scenario: Verifying Volunteer Survey Landing page wording
    Given a user is on the COVIDCode home page
    Then the following header displays "Why are we doing this study?" followed by a body description "Coronavirus 2019 (COVID-19) is a serious public health problem."
    And the header "Who can join?" with the body description as "Anyone who has tested positive for SARS-CoV-2 infection may be eligible to join. We will use the clinical history and biological samples provided by participants for our analyses."
    And also the header "Interested in volunteering for the COVID-19 Study?" with the body description "Selecting the button below will take you to the COVID-19 Volunteer Survey"
    And header "What is involved in the study?" with the body description "● Provide a blood sample."
    And a statement "Privacy and confidentiality are very important to us. All information shared with us will be anonymized. It is important to note that we intend for our study to benefit a large group of patients. In order to make this possible, we will be unable to return individual genetic results. We may recontact you for this information over a period of a year after you have joined the study."

  @Sprint9 @COVID-214 @Smoke
  Scenario: Verifying Survey Submitted data displays under the COVIDCode application - Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    When searching for "COVIDcode volunteer surveys" to view follow ups
    And clicking on a submitted Survey Number
    Then information submitted via the volunteer survey is displayed
