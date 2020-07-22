Feature: COVID Dashboard
  
  Description: This feature file tests COVIDDASH-7, 8, 20, 134, 135, 138, 136, 137, 140, 142, 143, 148

  @smoke @progression
  Scenario Outline: Validate Autopulation
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    And user validates that Institute, Division, Email Address, and Phone Number fields are not editable
    When the User selects a principal Investigator by typing their name in the principal Investigator search box. "<PI Name>"
    Then the Institute, Division, Email Address, and Phone Number fields are auto-populated. "<istitName>","<dvsnName>","<piEmail>","<piPhonNum>"
    Then user validates that Institute, Division, Email Address, and Phone Number fields are not editable
    And the user logs out

    Examples: 
      | PI Name      | istitName | dvsnName | piEmail  | piPhonNum  |
      | Sohil Zalmay | NCI       | OD       | @nih.gov | 2402766573 |


  
  Scenario: Validate Study Submission
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    And the user verifies that the submit button is disbaled by default
    When the User selects a Principal Investigator "Sohil Zalmay"
    And enters a unique IRB Protocol Number which can contain numbers and text such as "65YUT55"
    And enters a Study Title as "COVID Study"
    And selects any Biospecimen Type "Other" and enters Other type as "tissue"
    And selects any Biospecimen Collection Frequency
    And verifies that "NCI Frederick" text is displayed in the Repository Location text box
    And enters Study Specific Aims "Prevent the development or recurrence of disease"
    And attaches an IRB Protocol Document
    And attaches a Related URL
    Then the User is able to successfully submit the study "65YUT55"

  @regression 
  Scenario: Validating Study Submission without attaching a Related URL
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    When the User selects a Principal Investigator "Diego Juarez"
    And enters a unique IRB Protocol Number which can contain numbers and text such as "77YXB33"
    And enters a Study Title as "Automation Test"
    And selects any Biospecimen Type "Other" and enters Other type as "Automation Test"
    And selects any Biospecimen Collection Frequency
    And verifies that "NCI Frederick" text is displayed in the Repository Location text box
    And enters Study Specific Aims "Test Automation"
    And attaches an IRB Protocol Document
    And does not attach a Related URL
    Then the User is able to successfully submit the study "77YXB33"

  @regression
  Scenario: Validating Study Submission with attaching multiple Related URL's
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    When the User selects a Principal Investigator "Diego Juarez"
    And enters a unique IRB Protocol Number which can contain numbers and text such as "77DJ88"
    And enters a Study Title as "Automation Test"
    And selects any Biospecimen Type "Other" and enters Other type as "Automation Test"
    And selects any Biospecimen Collection Frequency
    And verifies that "NCI Frederick" text is displayed in the Repository Location text box
    And enters Study Specific Aims "Test Automation"
    And attaches an IRB Protocol Document
    And attaches multiple Related URL’s
    Then the User is able to successfully submit the study "77DJ88"

 @regression 
  Scenario: Verifying a user is not able to submit a study form when not attaching an IRB Protocol Document
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    When the User enters all required information
    But does not attach an IRB Protocol Document
    And attempts to confirm and submit the study form
    Then the user is not able to successfully submit the study form
    And sees a pop up with a message indicating study documentation is required before submitting
    And when selecting "Go Back"
    Then under Study Documentation the user sees the message " Study documentation is required. Please attach the appropriate file(s). "
		And the user logs out

  @regression 
  Scenario: Verifying Home Page verbiage
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    When the user is on the submissions home page
    Then the user should see the home page below verbiage
      """
      The COVID-19 Biorepository is available to all Intramural Research Program (IRP) Investigators with an IRB
      approved COVID-19 related study. This biorepository will serve two primary functions:
      
      1. Storage for biospecimens collected as part of an IRP IRB approved COVID-19 protocol in the NCI-Frederick 
      Central Repository
      2. Provide a catalogue of COVID-related studies with biospecimens to facilitate COVID-19 research for the 
      wider scientific community
      
      To ship and store biospecimens in the NCI-Frederick Repository, please complete the form to the left.
      All fields are required. The IRB approved protocol must be submitted and please include any other 
      supporting documentation. Your request will be reviewed within 2 business days (as feasible). If approved,
      you will be contacted with instructions on how to proceed with the transfer of your specimens with a 
      manifest to the Repository.
      
      If you have any questions, please contact Mandy Black blacka@mail.nih.gov.
      
      Thank you for your interest in the COVID-19 Biorepository
      """

  @regression
  Scenario: Verifying empty field messages
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    When the User enters any IRB Protocol Number and immediately deletes it
    And clicks on any other field on the page
    Then an error message displays for IRB field with the message "Please enter an IRB protocol number"
    When the User enters any Study Title and immediately deletes it
    And clicks on any other field on the page
    Then an error message displays for title with the message "Please enter a title for this study. This field is required."
    When the User selects a Biospecimen Collection Frequency and then immediately selects no option
    And clicks on any other field on the page
    Then an error message displays for colection with the message "Please select the appropriate collection frequency. This field is required."
    When the User enters any Study Specific Aim and immediately deletes it
    And clicks on any other field on the page
    Then an error message displays for aims with the message "Please enter the study specific aims. This field is required."

  @regression
  Scenario: Verifying Study Form Submission as a Reviewer
    Given a User has logged in to the NIH COVID-19 Biorepository Dashboard Application
    And successfully submits a Study Form
    When impersonating a reviewer
    Then the submitted study is displayed and options to Approve or Reject are available
