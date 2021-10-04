Feature: myRAS Screener Submissions
  
  This feature file contains scenarios which verify data submitted via Qualtrics questionnaire in Native View

  @Progression @juarezds
  Scenario: Proxy Screener Submission with data verification
    Given a user is on the RASopathies Longitudinal Cohort Study login page
    And logs in via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    And clicks on Eligibility Questionnaire to begin questionnaire
    And clicks next after reviewing the STUDY INTRODCTION
    And selects I am completing this form for someone else option 
    And enters First Name "Automated", Middle Name "Middle", Last Name "Test" for What is the name of the person who may be eligible for this study?
    And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "lastNameTest" for What is your name?
    And enters "Entering Other Relationship" for What is your relationship to automated name?
    And selects Yes option for Are you the legal guardian of automated name?
    And clicks next for The next set of questions will collect basic information about automated name. page 
    And selects a Date of Birth from the calendar picker
    And selects Male option for Sex assigned at birth
    And selects Yes option for being adopted
    And selects Yes for still being alive
    And selects Yes option for living in the United States
    And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" city "Rockville" state "Maryland" zip code "20850"
    And enters email address "automatedTest@nci.gov"
    And enters email address "automatedTest@nci.gov" to confirm email address
    And enters home phone number "703-687-5816", cell phone number "703-687-5816", work phone number "703-687-5816" and selects cell phone number as Preferred Contact
    And selects Not Hispanic/Latino option for Ethnicity of proxy
     
