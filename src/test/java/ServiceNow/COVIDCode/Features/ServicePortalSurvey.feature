Feature: Volunteer Survey
  Description: Volunteer Survery scenarios including both Service Portal and Native View

  @Smoke @Sprint9 @COVID-109 @juarezds
  Scenario: Volunteer Survey Self Submission_1 - Service Portal
    Given a user is on the COVIDCode home page
    And selects the option to Volunteer
    Then the "COVIDcode Volunteer Survey" page displays with the option to start the survey
    When starting the survey
    And the user selects option to fill out the survery for themselves
    Then the question "Have you tested positive for SARS-CoV-2 (the novel coronavirus)?" populates
    When selecting No
    Then the question "How was the sample taken?" displays
    When selecting "Nasal or throat swab"
    And selecting "Rapid testing (up to 2 hour turnaround)" checkbox
    Then the "Are you a National Institute of Health Employee?" question displays
    And selecting No from drop down
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

  @Smoke @Sprint9 @COVID-109 @juarezds
  Scenario Outline: Volunteer Survey Self Submission - Service Portal
    Given a user is on the COVIDCode home page
    And selects the option to Volunteer
    Then the "COVIDcode Volunteer Survey" page displays with the option to start the survey
    When starting the survey
    And the user selects option to fill out the survery for themselves
    Then the question "Have you tested positive for SARS-CoV-2 (the novel coronavirus)?" populates
    When "<HaveYouTestedPositive>" option is selected
    Then the question "How was the sample taken?" displays
    When "<sampleTypeTaken>" sample taken is selected
    And selecting "Rapid testing (up to 2 hour turnaround)" checkbox
    Then the "Are you a National Institute of Health Employee?" question displays
    And "<areYouANationalInstituteOfHealthEmployee>" option is selected for being able to choose
    Then "Were you tested by OMS?" required question is displays
    And "<wereYouTestedByOMS>" option is selected for being tested by OMS
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
      | HaveYouTestedPositive | sampleTypeTaken      | areYouANationalInstituteOfHealthEmployee | wereYouTestedByOMS | canYouProvideAcopyOfTest | wereYouHospitalized | howDidYouFindOutAboutTheStudy |
      | Yes                   | Saliva               | Yes - Employee                           | No                 | Yes                      | No                  | I prefer not to answer        |
      | Yes                   | Blood draw           | Yes - Employee                           | No                 | No                       | Yes                 | ClinicalTrials.gov            |
      | Yes                   | Nasal or throat swab | Yes - Employee                           | Yes                | No                       | No                  | COVID-19 prevention website   |

  @Smoke @Sprint9 @COVID-220 @juarezds
  Scenario: Verifying Volunteer Survey Landing page wording
    Given a user is on the COVIDCode home page
    Then the following header displays "WHY ARE WE DOING THIS STUDY?" followed by a body description "Coronavirus 2019 (COVID-19) is a serious public health problem."
    And the header "WHO CAN JOIN?" with the body description as "Anyone located in the United States who has tested positive for SARS-CoV-2 infection may be eligible to join. We will use the clinical history and biological samples provided by participants for our analyses."
    And also the header "Interested in volunteering?" with the body description "Fill out a COVID-19 Volunteer Survey to get started."
    And header "WHAT IS INVOLVED IN THE STUDY?" with the body description "We will ask you to"
    And a statement "Privacy and confidentiality are very important to us. All information shared with us will be coded. It is important to note that we intend for our study to benefit a large group of patients. In order to make this possible, we will be unable to return individual genetic results. We may recontact you for additional information over a period of a year after you have joined the study."

  @Smoke @Sprint9 @COVID-214 @juarezds
  Scenario: Verifying Survey Submitted data displays under the COVIDCode application - Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    When searching for "COVIDcode volunteer surveys" to view follow ups
    And clicking on a submitted Survey Number
    Then information submitted via the volunteer survey is displayed
    
    
    @Smoke @COVID-260 @juarezds
    Scenario: Verifying that Study Staff Nurses are able to see the volunteer submitted zip code in Native view
    Given a COVIDcode Volunteer Survey has been submitted with zip code "12345"
    Then Study Staff Nurses are able to see the volunteer's submitted zip code "12345" in a Inquiry Tracking record in native view
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
=======

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
