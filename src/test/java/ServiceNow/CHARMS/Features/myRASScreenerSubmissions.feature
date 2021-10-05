Feature: myRAS Screener Submissions
  
  This feature file contains scenarios which verify data submitted via Qualtrics questionnaire in Native View

  @Progression @juarezds
  Scenario: Proxy Screener Submission with data verification
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    And clicks on Eligibility Questionnaire to begin questionnaire
    And clicks next after reviewing the STUDY INTRODCTION
    And selects I am completing this form for someone else option 
    And enters First Name "Automated", Middle Name "Middle", Last Name "Test" for What is the name of the person who may be eligible for this study?
    And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "lastNameTest" for What is your name?
    And enters "Entering Other Relationship" for What is your relationship to the participant?
    And selects Yes option for Are you the legal guardian of the participant?
    And clicks next for The next set of questions will collect basic information about the participant. page 
    And selects participants Date of Birth from the calendar picker
    And selects Male option for participants Sex assigned at birth
    And selects Yes option for participant being adopted
    And selects Yes for participant still being alive
    And selects Yes option for participant currently living in the United States
    And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" city "Rockville" state "Maryland" zip code "20850"
    And enters proxy email address "automatedTest@nci.gov"
    And enters proxy email address "automatedTest@nci.gov" to confirm email address
    And enters proxy home phone number "703-687-5816", cell phone number "703-687-5816", work phone number "703-687-5816" and selects cell phone number as Preferred Contact
    And selects Not Hispanic/Latino option for Ethnicity of participant
    And enters "Entering other Race" for other when selecting Race of participant
    And selects Other option and enters "This is a test" for participant being in other research study
    And proceeds with providing information for medical diagnosis
    And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
    And selects Yes option for participant being diagnosed with cancer
    And for participants primary cancers diagnosed selects cancer types "Leukemia", "Brain tumor (ie, glioma)", "Rhabdomyosarcoma", "Skin cancer (ie, melanoma)" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects Yes option for currently receiving treatment 
    And selects Yes option for participant being diagnosed with a Rasopathy
    And selects Other and enters "Entering Other RASopathy" for selecting a specific RASopathy diagnosed of the participant
    And enters participants age in years "20" of diagnosis 
    And enters participants year of diagnosis "2010"
    And proceeds with providing genetic testing information
    And selects Yes option to family members of participants having been diagnosed with a RASopathy
    And selects Yes option to participant having had genetic testing
    And selects Yes option to participant having a copy of genetic test results
    And selects Upload to this questionnaire options for providing genetic test results of participant
    And uploads PDF file of genetic test results of participant
    
    
    
    
