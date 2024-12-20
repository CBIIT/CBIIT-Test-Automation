Feature: Melanoma Screener Scenarios


    @juarezds  @melanomaScreenerSubmission @selfSubmission
    Scenario: Self Submission - Selecting 'Yes' to all questions
        Given a participant is on the Family Cohort Study Management System: Melanoma and Spitzoid Tumor login page
        When the participant logs in with username "charmsras5@yahoo.com" and password "RASTest2021$$"
        And clicks on Eligibility Questionnaire
        And selects I am completing this form for myself for Are you completing this form for someone else or for yourself?
        And enters First name "FirstTestingLongNameSelf", Middle Initial "S", Last name "LastTestingLongNameSelf" for What is your name?
        And enters date of birth "04/01/1990" for What is your date of birth?
        And selects male for What was your sex assigned at birth?
        And selects Yes for Are you adopted?
        And selects United States of America for In which country do you currently live?
        And enters "9609 Medical Center Dr", "Rockville", "MD", "20850" for Please provide the mailing address where study materials can be sent, as needed
        And enters "automatedTest@nci.gov", for What is your email address?
        And enters "automatedTest@nci.gov", for Please confirm your email address
        And enters "703-687-5816", "703-687-5816", "703-687-5816" and enters a preferred contact number
        And selects ethnicity "Hispanic/Latino", for What is your ethnicity?
        # And selects mothers ethnicity "Hispanic/Latino", for What is your biological mother's ethnicity?
        # And selects fathers ethnicity "Hispanic/Latino", for What is your biological father's ethnicity?
        And selects White for What is your race?
        # And selects White for What is your biological mother's race?
        # And selects White for What is your biological father's race?
        And selects Familial Melanoma Study for Are you a participant in any other research study or registry group?
        And selects Yes to Have you been diagnosed with a melanoma or a Spitz tumor?
        And selects Skin for Type, enters "25" for Age at diagnosis, enters "2000" for Year of diagnosis, enters "Johns Hopkins Hospital" for Name of institution or clinic where biopsy occurred, enters "Dr. Bashir Zikria" for Name of physician who performed thr biopsy
        And selects Yes to Have you ever been diagnosed with non-melanoma cancer?
        And selects Leukemia for Cancer Type, enters "20" for Age at diagnosis, enters "2002" for Year of diagnosis, selects Yes tp currently receiving treatment for Please complete the box below by selecting which primary, non-melanoma cancers you were diagnosed with and at what age and year they occurred.
        And selects Yes for Have you ever had genetic testing?
        And selects BAP1 for Were any genetic changes detected in the following genes?
        And selects Yes to Do you have a copy of the genetic test results?
        And selects Mail for How would you like to provide the genetic results to us?
        And selects Yes option for Have any of your biological relatives been diagnosed with a melanoma?
        And enters "Diego Test" for First Name, selects Last initial "T", selects Melanoma type "Skin" for Please complete the box below by selecting which primary melanoma cancers were diagnosed and at what age or year they occurred.
        And selects Yes for Have any of your biological relatives ever had genetic testing?
        And selects BAP1 for Were any genetic changes detected for the following genes?
        And selects Websearch for How did you hear about this study?
        And selects Yes to Have you or other family members ever participated in another study on melanoma at another medical institution, university, government agency or other site?
        And enters "TestingLongFirstName" for Study Name, enters "This is an automated test" for Family relationship, enters "Automated test person" for Study Contact Person, enters "703-687-5816" for Study Phone Number, enters "2002" for Start year of Participation , enters "2011" for End year for Partiipation, enters "INOVA Fairfax Hospital" for Institution
        And selects Participate in research for What are the main reasons for participating in this study and enters reason "Sending 100 characters as a string as a test Sending 100 characters as a string as a test Sending 100"?
        And submits Melanoma Screener

    @juarezds  @melanomaScreenerSubmission @proxySubmission
    Scenario: Proxy Submission - Selecting 'Yes' to all questions
        Given a participant is on the Family Cohort Study Management System: Melanoma and Spitzoid Tumor login page
        When the participant logs in with username "charmsras5@yahoo.com" and password "RASTest2021$$"
        And clicks on Eligibility Questionnaire
        And selects I am completing this form for for someone else for Are you completing this form for someone else or for yourself?
        And enters First name "SelfName", Middle Initial "N", Last name "SelfLastName" for What is the name of the person who may be eligible for this study?
# And enters First name "FirstTestingLongNameSelf", Middle Initial "S", Last name "LastTestingLongNameSelf" for What is your name?
# And selects Other option and enters "" for What is your relationship to participant - melanoma?
# And selects Yes option for Are you the legal guardian of participant?
# And enters Date of birth of participant as "04/09/1990"
# And selects Male option for Sex of participant
# And selects Yes option for is participant adopted?
# And selects Yes option for is participant alive?
# And selects "" for In which country does participant currently live?
# And enters "9609 Medical Center Dr", "Rockville", "MD", "20850" for Please provide the mailing address where study materials can be sent, as needed
# And enters "automatedTest@nci.gov", for What is your email address?
# And enters "automatedTest@nci.gov", for Please confirm your email address
# And enters "703-687-5816", "703-687-5816", "703-687-5816" and enters a preferred contact number
# And selects Not Hispanic or Latino for Ethnicity of participant
# And selects Asian for What is the race of participant?
# And selects Family Advocacy Group and enters "" for is participant in any other research study or registry group?
# And select Yes option for Has participant ever been diagnosed with a melanoma or Spitz tumor (examples include Spitz nevus, atypical Spitz/Spitzoid tumor, Spitz/Spitzoid melanoma)?
# And selects Skin for Type, enters "25" for Age at diagnosis, enters "2000" for Year of diagnosis, enters "Johns Hopkins Hospital" for Name of institution or clinic where biopsy occurred, enters "Dr. Bashir Zikria" for Name of physician who performed thr biopsy
# And selects Yes option for has participant ever been diagnosed with non-melanoma cancer?
# And selects Leukemia for Cancer Type, enters "20" for Age at diagnosis, enters "2002" for Year of diagnosis, selects Yes tp currently receiving treatment for Please complete the box below by selecting which primary, non-melanoma cancers you were diagnosed with and at what age and year they occurred.
# And selects Yes option for Has participant ever had genetic testing?
# And selects BAP1 for Were any genetic changes detected in the following genes?
# And selects Yes to Do you have a copy of the genetic test results?
# And selects Mail for How would you like to provide the genetic results to us?
# And selects Yes option for Have any of participants biological relatives been diagnosed with a melanoma?
# And enters "TestingLongFirstName" for Study Name, enters "This is an automated test" for Family relationship, enters "Automated test person" for Study Contact Person, enters "703-687-5816" for Study Phone Number, enters "2002" for Start year of Participation , enters "2011" for End year for Partiipation, enters "INOVA Fairfax Hospital" for Institution
# And selects Yes for Have any of participants biological relatives ever had genetic testing?
# And selects BAP1 for Were any genetic changes detected for the following genes?
# And selects Genetic Counselor and enters "" for How did you hear about this study?
# And selects Yes option for Has participants or other family members ever participated in another study on melanoma at another medical institution, university, government agency or other site?
# And enters "TestingLongFirstName" for Study Name, enters "This is an automated test" for Family relationship, enters "Automated test person" for Study Contact Person, enters "703-687-5816" for Study Phone Number, enters "2002" for Start year of Participation , enters "2011" for End year for Partiipation, enters "INOVA Fairfax Hospital" for Institution
# And selects Participate in research for What are the main reasons for participating in this study and enters reason "Sending 100 characters as a string as a test Sending 100 characters as a string as a test Sending 100"?
# And submits Melanoma Screener



