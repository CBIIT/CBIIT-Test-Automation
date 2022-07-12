Feature: Melanoma Screener Scenarios


    Scenario: Self Submission - Selecting 'Yes' to all questions

        Given a participant is on the Family Cohort Study Management System: Melanoma and Spitzoid Tumor login page
        When the participant logs in with username "username" and password "password"
        And clicks on Eligibility Questionnaire
        And selects I am completing this form for myself for Are you completing this form for someone else or for yourself?
        And enters First name "FirstTestingLongNameSelf", Middle Initial "S", Last name "LastTestingLongNameSelf" for What is your name?
        And enters date of birth "04/01/1990" for What is your date of birth?
        And selects male for What was your sex assigned at birth?
        And selects Yes for Are you adopted?
        And selects United States of America for In which country do you currently live?
        And enters "Street", "City", "State", "Zip Code" for Please provide the mailing address where study materials can be sent, as needed
        And enters "email", for What is your email address?
        And enters "email", for Please confirm your email address
        And enters "HomePhoneNumber", "CellPhoneNumber", "WorkPhoneNumber" and enters a preferred contact number
        And selects ethnicity "Hispanic/Latino", for What is your ethnicity?
        And selects mothers ethnicity "Hispanic/Latino", for What is your biological mother's ethnicity?
        And selects fathers ethnicity "Hispanic/Latino", for What is your biological father's ethnicity?
        And selects White for What is your race?
        And selects White for What is your biological mother's race?
        And selects White for What is your biological father's race?
        And selects Familial Melanoma Study for Are you a participant in any other research study or registry group?
        And selects Yes to Have you been diagnosed with a melanoma or a Spitz tumor?
        And selects Skin for Type, enters "Age" for Age at diagnosis, enters "Year" for Year of diagnosis, enters "Name" for Name of institution or clinic where biopsy occurred, enters "Name" for Name of physician who performed thr biopsy
        And selects Yes to Have you ever been diagnosed with non-melanoma cancer?
        And selects Leukemia for Cancer Type, enters "Age" for Age at diagnosis, enters "Year" for Year of diagnosis, selects Yes tp currently receiving treatment for Please complete the box below by selecting which primary, non-melanoma cancers you were diagnosed with and at what age and year they occurred.
        And selects Yes for Have you ever ad genetic testing?
        And selects BAP1 for Were any genetic changes detected in the following genes?
        And selects Yes to Do you have a copy of the genetic test results?
        And selects Mail for How would you like to provide the genetic results to us?
        And selects Yes for Have any of your biological relatives been diagnosed with a melanoma?
        And enters "Name" for First Name, select Last initial, select Melanoma type for Please complete the box below by selecting which primary melanoma cancers were diagnosed and at what age or year they occurred.
        And selects Yes for Have any of your biological relatives ever had genetic testing?
        And selects BAP1 for Were any genetic changes detected for the following genes?
        And selects Websearch for How did you hear about this study?
        And selects Yes to Have you or other family members ever participated in another study on melanoma at another medical institution, university, government agency or other site?
        And enters "Name" for Study Name, enters "relationship" for Family relationship, enters "Person" for Study Contact Person, enters "number" for Study Phone Number, enters "Date" for Start year of Participation , enters "Date" for End year for Partiipation, enters "Name" for Institution
        And selects Participate in research for What are the main reasons for participating in this study?


    Scenario: Self Submission - Selecting 'Yes' to all questions

        Given a participant is on the Family Cohort Study Management System: Melanoma and Spitzoid Tumor login page
        When the participant logs in with username "username" and password "password"
        And clicks on Eligibility Questionnaire
        And selects I am completing this form for myself for Are you completing this form for someone else or for yourself?
        And enters First name "SelfName", Middle Initial "N", Last name "SelfLastName" for What is your name?
        And enters date of birth "10/20/1989" for What is your date of birth?
        And selects male for What was your sex assigned at birth?
        And selects No for Are you adopted?
        And selects United States of America for In which country do you currently live?
        And enters "Street", "City", "State", "Zip Code" for Please provide the mailing address where study materials can be sent, as needed
        And enters "email", for What is your email address?
        And enters "email", for Please confirm your email address
        And enters "HomePhoneNumber", "CellPhoneNumber", "WorkPhoneNumber" and enters a preferred contact number
        And selects ethnicity "Hispanic/Latino", for What is your ethnicity?
        And selects mothers ethnicity "Hispanic/Latino", for What is your biological mother's ethnicity?
        And selects fathers ethnicity "Hispanic/Latino", for What is your biological father's ethnicity?
        And selects White for What is your race?
        And selects White for What is your biological mother's race?
        And selects White for What is your biological father's race?
        And selects Not sure for Are you a participant in any other research study or registry group?
        And selects No to Have you been diagnosed with a melanoma or a Spitz tumor?
        And selects No to Have you ever been diagnosed with non-melanoma cancer?
        And selects No to Have you ever ad genetic testing?
        And selects No to Have any of your biological relatives been diagnosed with a melanoma?
        And selects No to Have any of your biological relatives ever had genetic testing?
        And selects Websearch for How did you hear about this study?
        And selects No to Have you or other family members ever participated in another study on melanoma at another medical institution, university, government agency or other site?
        And selects Participate in research for What are the main reasons for participating in this study?



