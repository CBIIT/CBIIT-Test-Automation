Feature: myRAS Screener Submissions from the Qualtrics Portal
	Description: This feature file contains scenarios which submits myRAS Screener and verify questionnaire data submitted via Qualtrics is imported as expected in Native View

	This feature file contains scenarios which verify data submitted via Qualtrics questionnaire in Native View

	@juarezds @myRasScreenerSubmissionOnly
	Scenario: Proxy Screener Submission - for manual testing only - use if you need to submit screener quickly
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
		And selects No option to participant having a copy of genetic test results
		And selects all the option for any genetic changes detected for the following syndromes for the participant
		And the user proceeds on answering few remaining questions regarding the study
		And selects Other option and enters "Entering other option" for how did you hear about this study?
		And selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And provides the following information regarding previous participation in other RASopathy studies
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@juarezds @Regression @Progression
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
		And selects No option to participant having a copy of genetic test results
		And selects all the option for any genetic changes detected for the following syndromes for the participant
		And the user proceeds on answering few remaining questions regarding the study
		And selects Other option and enters "Entering other option" for how did you hear about this study?
		And selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And provides the following information regarding previous participation in other RASopathy studies
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted
		When a ServiceNow user navigates to CHARMS Native view and opens records that are Waiting for Elegibility Review
		And selects the submitted MyRAS screener record
		And verifies data submitted in Qualtrics is imported as expected in ServiceNow
		And the ServiceNow user submits the study for eligibility review
		And the ServiceNow user marks the study eligible
		And the ServiceNow user adds comments in the history section "Sending consent form to the participant" and sends consent form
		When the myRAS user signs the consent form in the Service Portal
		When a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature
		And selects the submitted MyRAS screener record that has signed consent form from participant attached
		And the ServiceNow user signs the consent form
		Given a proxy is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
		And clicks on the Individual Information Questionnaire to begin the IIQ form
		And enters email address and One Time Pin code to proceed with the form
		And on the CGB Statement of Confidentiality page clicks next arrow button
		And on the CGB Instructions page clicks next arrow button
		And on the General Background Information section of IIQ Survey page clicks next arrow button
		And selects the radio button labelled I am completing this form for someone else
		And fills out the participant "Jennifer Slogan" for whom the user is completing the IIQ form.
		And selects Female as the biological sex of the participant assigned at birth
		And selects for which Sex the participant is identified
		And selects what the participant is considered to be
		And selects the Race of the participant
		And selects if the participant is from the Ashkenazi Eastern European JewishDescent
		And selects if the participant is Adopted
		And selects Yes for the participant raised by someone other than their biological parent
		And adds Information regarding individuals who raised the participant "Joanne","Step Mother"
		And adds the participant DOB in MMDDYYYY format
		And adds the Demographic information of the participant "Bethesda", "Maryland", "United States"
		And selects the participant Biological Mothers Ancestral Background or add the free text for the box labelled Other SPECIFY
		And selects the participant Biological Fathers Ancestral Background or add the free text for the box labelled Other SPECIFY
		And selects the participant Familys Religious Background or add the free text for the box labelled Other SPECIFY
		And selects the participant Current Marital Status
		And adds the participant "Software Engineer"
		And selects if the participant currently have health insurance?
		And selects the total combined yearly income for all the persons in participant household
		And selects the highest level of schooling participant has completed
		And on the medical history section of IIQ Survey page clicks on the forward arrow button
		And the user selects if the participant conceived using in vitro fertilization IVF
		And selects if the participant conceived through a donor egg or sperm
		And selects if the participant Preimplantation Genetic Diagnosis PGD used
		And selects option Yes if the participant is a twin or multiple birth
		And selects the option Twin for what type of birth was the participant
		And selects whether the participant have a fraternal or identical twin
		And adds the information for the names of the children in the twin or multiple birth "Twin","Bryan","L","Fraternal twin"
		And selects the option Yes for the participants biological parents blood-related to each other
		And adds "Second cousins once removed" of the participant how the biological parents blood-related to each other
		And selects how was the participant born
		And adds the participants birth "7", "17" and "10" Numerical Value and "pounds", "inches" and "inches" for Unit Of Measure
		And the user clicks the forward arrow on the cancer and benign tumor history section of IIQ Survey page
		And the user selects option Yes if participant ever been diagnosed with any cancer and or benign tumor
		And selects or adds the primary cancers or benign tumors that have been diagnosed
		And adds primary cancer or tumor information "2021","17","Baltimore Maryland","Fairfax Virginia" and selects what kind of the treatment received
		And selects Yes if the participant ever been evaluated for ANY genetic disease or syndrome?
		And selects if participant ever had genetic counseling for ANY reason?
		And selects the details for the genetic evaluations that have been completed includes "Li-Fraumeni Syndrome (TP53)" summarization of the evaluation and adds the information "12/19", "16", "John Hopkins Hospital, Baltimore, Maryland, United States of America", and "No abnormality found"
		And selects Yes if the participant has copy of the genetic test results and would like to upload them to this questionnaire?
		And upload the genetic test results
		And the user adds the participant height and weight at the indicated ages "170","6","130","170","180" and selects "pounds", "feet", "pounds", "pounds" and "pounds" for Unit of Measurements
		And selects the most participant has ever weighed "180 lbs" EXCLUDING WEIGHT DURING PREGNANCY
		And selects at what "18" was the participant at their highest weight?
		And the user adds the "14" of the participant at first menstrual period
		And adds the last menstrual period "10/2021"
		And selects the reason if participant period has not occurred for the last year or more
		And selects Yes if the participant ever been pregnant?
		And adds the participant "18" at their first pregnancy?
		And adds the "4" the participant has been pregnant?
		And selects Yes if the participant has ever tried to become pregnant for more than one year without success
		And selects Yes for participant ever being consulted a doctor because of difficulty in getting pregnant
		And adds "40" was participant when they first consulted a doctor about difficulty in getting pregnant
		And selects all diagnosis that was made to explain the difficulties getting pregnant
		And on the Female Hormones section of IIQ Survey page clicks on the forward arrow button
		And the user selects if participant has ever taken pills, injections or implants for birth control or for any other reason?
		And selects Yes if participant has ever prescribed female hormones for this reason?
		And adds at what "35" was participant prescribed female hormones for hormone replacement therapy?
		And adds the total amount of time the participant has taken hormone replacement therapy "43"
		Then the user lands on the "You are almost done!" page
		And the user clicks the forward arrow button
		Then the end of the IIQ survey page "EndOfSurvey" is displayed

	@jains @myRASScreenerSubmission
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
		And clicks next for The next set of questions will collect basic information about the participant
		And selects participants Date of Birth from the calendar picker
		And selects Male option for participants Sex assigned at birth
		And selects Yes option for participant being adopted
		And selects Yes for participant still being alive
		And selects Yes option for participant currently living in the United States
		And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street Optional "New Avenue Park" city "Rockville" state "Maryland" zip code "20850"
		And enters proxy email address "automatedTest@nci.gov"
		And enters proxy email address "automatedTest@nci.gov" to confirm email address
		And enters proxy home phone number "703-687-5816", cell phone number "703-687-5816", work phone number "703-687-5816" and selects cell phone number as Preferred Contact
		And selects Not Hispanic/Latino option for Ethnicity of participant
		And selects White, Black/African American, Native Hawaiian/Pacific Islander, American Indian/Alaskan Native, Asian and enters "Entering other Race" for other when selecting Race of participant
		And selects Other option and enters "LFS Study" for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
		And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
		And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
		And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
		And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
		And selects skin/hair abnormalitiessuch as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions
		And selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions
		And selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions
		And selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions
		And selects Lymphedema or participant being diagnosed with any of the listed conditions
		And selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions
		And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
		And selects Yes option for participant being diagnosed with cancer
		And for participants primary cancers diagnosed selects cancer types "Leukemia", "Brain tumor (ie, glioma)", "Rhabdomyosarcoma", "Skin cancer (ie, melanoma)" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects Yes option for currently receiving treatment
		And selects Yes option for participant being diagnosed with a Rasopathy
		And selects Other and enters "Entering Other RASopathy" for selecting a specific RASopathy diagnosed of the participant
		And enters participants age in years "20" of diagnosis
		And enters participants year of diagnosis "2010"
		And proceeds with providing genetic testing information
		And selects I have no information on my biological relatives option to family members of participants having been diagnosed with a RASopathy
		And selects Yes option to participant having had genetic testing
		And selects No option to participant having a copy of genetic test results
		And selects all the option for any genetic changes detected for the following syndromes for the participant
		And the user proceeds on answering few remaining questions regarding the study
		And selects Other option and enters "Entering other option" for how did you hear about this study?
		And selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And provides the following information regarding previous participation in other RASopathy studies
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted
		When a ServiceNow user navigates to CHARMS Native view and opens records that are Waiting for Elegibility Review
		And selects the submitted MyRAS screener record
		And verifies data submitted in Qualtrics is imported as expected in ServiceNow
		And verifies Personal Information data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies Demographics data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies Contact Info data submitted in Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies Medical Information data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Contact Info data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Demographics data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies RASopathy History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Cancer History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Participant Cancer History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies Genetic Testing History data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Final Information data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Comments data submitted in Qualtrics is imported as expected in the RAS Referral page of ServiceNow
		And verifies Participant Cancer History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And verifies Participant Genetic History data submitted Qualtrics is imported as expected in the Family Member Details page of ServiceNow
		And the ServiceNow user submits the study for eligibility review
		And the ServiceNow user marks the study eligible
		And the ServiceNow user adds comments in the history section "Sending consent form to the participant" and sends consent form
		When the myRAS user signs the consent form in the Service Portal
		When a ServiceNow user navigates to CHARMS Native view and opens records that are Awaiting PI Signature
		And selects the submitted MyRAS screener record that has signed consent form from participant attached
		And the ServiceNow user signs the consent form

	@jains @myRASScreenerSubmission
	Scenario: Proxy Screener Submission for male participant with selection of the multiple options
		Given a proxy is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		And clicks next after reviewing the STUDY INTRODCTION
		And selects I am completing this form for someone else option
		And enters First Name "Automated", Middle Name "Middle", Last Name "Test" for What is the name of the person who may be eligible for this study?
		And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "lastNameTest" for What is your name?
		And enters "Entering Other Relationship" for What is your relationship to the participant?
		And selects No option for Are you the legal guardian of the participant?
		And clicks next for The next set of questions will collect basic information about the participant
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
		And selects White, Black/African American, Native Hawaiian/Pacific Islander, American Indian/Alaskan Native, Asian and enters "Entering other Race" for other when selecting Race of participant
		And selects Rasopathies Net,I am not involved in any other research study or registry group,Not sure, and enters "Family Group" for Family Advocacy Group and enters "LFS Study" for other for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
		And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
		And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
		And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
		And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
		And selects skin/hair abnormalitiessuch as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions
		And selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions
		And selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions
		And selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions
		And selects Lymphedema or participant being diagnosed with any of the listed conditions
		And selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions
		And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
		And selects Yes option for participant being diagnosed with cancer
		And for participants primary cancers diagnosed selects cancer types "Neuroblastoma", "Bladder cancer", "Gastrointestinal stromal tumor (GIST)", "Malignant peripheral nerve sheath tumor (MPNST)" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects No option for currently receiving treatment
		And selects Yes option for participant being diagnosed with a Rasopathy
		And selects Other and enters "Entering Other RASopathy" for selecting a specific RASopathy diagnosed of the participant
		And enters participants age in years "20" of diagnosis
		And enters participants year of diagnosis "2010"
		And proceeds with providing genetic testing information
		And selects Yes option to family members of participants having been diagnosed with a RASopathy
		And selects Yes option to participant having had genetic testing
		And selects No option to participant having a copy of genetic test results
		And selects all the option for any genetic changes detected for the following syndromes for the participant
		And the user proceeds on answering few remaining questions regarding the study
		And selects Other option and enters "Entering other option" for how did you hear about this study?
		And selects the Yes option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And provides the following information regarding previous participation in other RASopathy studies
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@jains @myRASScreenerSubmission
	Scenario: Proxy Screener Submission for male participant who is not alive
		Given a proxy is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		And clicks next after reviewing the STUDY INTRODCTION
		And selects I am completing this form for someone else option
		And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "LastNameTest" for What is the name of the person who may be eligible for this study?
		And enters First Name "ProxyFirstName", Middle Name "ProxyMiddleName", Last Name "ProxyLastname" for What is your name?
		And selects Parent for What is your relationship to the participant?
		And selects Yes option for Are you the legal guardian of the participant?
		And clicks next for The next set of questions will collect basic information about the participant
		And selects participants Date of Birth from the calendar picker
		And selects Male option for participants Sex assigned at birth
		And selects No option for participant being adopted
		And selects No for participant still being alive
		And selects participants Date of Death from the calendar picker
		And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street Optional "Street number 2" city "Rockville" state "Maryland" zip code "20850"
		And enters proxy email address "automatedTest@nci.gov"
		And enters proxy email address "automatedTest@nci.gov" to confirm email address
		And selects Hispanic/Latino option for Ethnicity of participant
		And selects Prefer not to answer for other when selecting Race of participant
		And selects I am not involved in any other research study or registry group for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Never diagnosed with any of these conditions option for participant being diagnosed with any of the listed conditions
		And selects Yes option for participant being diagnosed with cancer
		And for participants primary cancers diagnosed selects cancer types "Soft tissue sarcoma", "Pheochromocytoma", "Paraganglioma", "Unknown" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects No option for currently receiving treatment
		And selects Yes option for participant being diagnosed with a Rasopathy
		And selects Dont Know for selecting a specific RASopathy diagnosed of the participant
		And enters participants age in years "20" of diagnosis
		And enters participants year of diagnosis "2010"
		And proceeds with providing genetic testing information
		And selects No option to family members of participants having been diagnosed with a RASopathy
		And selects No option to participant having had genetic testing
		And the user proceeds on answering few remaining questions regarding the study
		And selects Websearch for how did you hear about this study?
		And selects No option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@jains @myRASScreenerSubmission
	Scenario: proband Screener Submission for Female participant who is not currently living in the United States with selection of the multiple options
		Given a proband is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		And clicks next after reviewing the STUDY INTRODCTION
		And selects I am completing this form for myself option
		And enters First Name "FirstNameTest", Middle Name "MiddleNameTest", Last Name "lastNameTest" for What is your name?
		And clicks next for The next set of questions will collect basic information about the participant
		And selects participants Date of Birth from the calendar picker
		And selects Female option for participants Sex assigned at birth
		And selects Yes option for participant being adopted
		And selects No option for participant currently living in the United States
		And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street "street 2" city "city Test" state "state Test" Province "province" Country "country Test"
		And enters proband email address "automatedTest@nci.gov"
		And enters proband email address "automatedTest@nci.gov" to confirm email address
		And enters proband home phone number "9111234234", cell phone number "9111234234", work phone number "9111234234" and selects cell phone number as Preferred Contact
		And selects Unknown option for Ethnicity of participant
		And enters "Entering other Race" for other when selecting Race of participant
		And selects Rasopathies Net and enters "Family Group" for Family Advocacy Group and enters "LFS Study" for other for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
		And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
		And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
		And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
		And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
		And selects skin/hair abnormalitiessuch as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions
		And selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions
		And selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions
		And selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions
		And selects Lymphedema or participant being diagnosed with any of the listed conditions
		And selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions
		And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
		And selects Yes option for participant being diagnosed with cancer
		And for participants primary cancers diagnosed selects cancer types "OTHER cancers", "OTHER cancers", "OTHER cancers", "OTHER cancers" and enters Other cancers options "Cancer1", "Cancer2", "Cancer3", "Cancer4" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects No option for currently receiving treatment
		And selects No option for proband being diagnosed with a Rasopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome
		And proceeds with providing genetic testing information
		And selects I have no information on my biological relatives option for Have any of your biological relatives been diagnosed with a RASopathy?
		And selects Not sure option to participant having had genetic testing
		And the user proceeds on answering few remaining questions regarding the study
		And selects Family member for how did you hear about this study?
		And selects the Not sure option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@jains @myRASScreenerSubmission
	Scenario: proband Screener Submission for Male participant who is diagnosed with other cancer types and with selection of the multiple options
		Given a proband is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		And clicks next after reviewing the STUDY INTRODCTION
		And selects I am completing this form for myself option
		And enters First Name "FirstNameMaleProband", Middle Name "MiddleNameMaleProband", Last Name "lastNameMaleProband" for What is your name?
		And clicks next for The next set of questions will collect basic information about the participant
		And selects participants Date of Birth from the calendar picker
		And selects Male option for participants Sex assigned at birth
		And selects No option for participant being adopted
		And selects No option for participant currently living in the United States
		And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street "street 2" city "city Test" state "state Test" Province "province" Country "country Test"
		And enters proband email address "charmsras6@gmail.com"
		And enters proband email address "charmsras6@gmail.com" to confirm email address
		And enters proband home phone number "9111234234", cell phone number "9111234234", work phone number "9111234234" and selects home phone number as Preferred Contact
		And selects Unknown option for Ethnicity of participant
		And selects White, Black/African American, Native Hawaiian/Pacific Islander, American Indian/Alaskan Native, Asian and enters "Entering other Race" for other when selecting Race of participant
		And selects Not sure for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
		And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
		And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
		And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
		And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
		And selects skin/hair abnormalitiessuch as: soft loose skin, fine/thin/thick/dry/brittle/curly hair, slow growing hair, tumors or small skin tags near the nose or anus, lipomas, light to dark brown birth marks (cafe au lait spots), freckles in the armpits option for participant being diagnosed with any of the listed conditions
		And selects Heart problems such as cardiomyopathy or pulmonary valve stenosis option for participant being diagnosed with any of the listed conditions
		And selects Genital abnormalities such as undescended testes for participant being diagnosed with any of the listed conditions
		And selects Non-cancerous tumors for participant being diagnosed with any of the listed conditions
		And selects Lymphedema or participant being diagnosed with any of the listed conditions
		And selects Other such as endocrine issues, bleeding disorders, seizures, tethered cord for participant being diagnosed with any of the listed conditions
		And enters "Diagnosed with other conditions" for participant being diagnosed with any of the listed conditions
		And selects Yes option for participant being diagnosed with cancer
		And for participants primary cancers diagnosed selects cancer types "OTHER cancers", "OTHER cancers", "OTHER cancers", "OTHER cancers" and enters Other cancers options "Cancer1", "Cancer2", "Cancer3", "Cancer4" and selects age at diagnosis for primary cancers entered for all options "20", "21", "22", "23" and year of diagnosis "2000", "2001", "2002", "2003" and selects Yes option for currently receiving treatment
		And selects No option for proband being diagnosed with a Rasopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome
		And proceeds with providing genetic testing information
		And selects I have no information on my biological relatives option for Have any of your biological relatives been diagnosed with a RASopathy?
		And selects Not sure option to participant having had genetic testing
		And the user proceeds on answering few remaining questions regarding the study
		And selects Support Group for how did you hear about this study?
		And selects the Not sure option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@jains @myRASScreenerSubmission
	Scenario: proband Screener Submission for Male participant who is diagnosed with given options of cancer types and with selection of the multiple options
		Given a proband is on the RASopathies Longitudinal Cohort Study login page
		And logs in via Okta with username "charmsras6@gmail.com" and password "RASTest2021$$"
		And clicks on Eligibility Questionnaire to begin questionnaire
		And clicks next after reviewing the STUDY INTRODCTION
		And selects I am completing this form for myself option
		And enters First Name "FirstNameMaleProband", Middle Name "MiddleNameMaleProband", Last Name "lastNameMaleProband" for What is your name?
		And clicks next for The next set of questions will collect basic information about the participant
		And selects participants Date of Birth from the calendar picker
		And selects Male option for participants Sex assigned at birth
		And selects No option for participant being adopted
		And selects Yes option for participant currently living in the United States
		And enters mailing address for where study materials can be sent, street "9609 Medical Center Dr" street Optional "New Avenue Park" city "Rockville" state "Maryland" zip code "20850"
		And enters proband email address "charmsras6@gmail.com"
		And enters proband email address "charmsras6@gmail.com" to confirm email address
		And enters proband home phone number "9111234234", cell phone number "9111234234", work phone number "9111234234" and selects Work phone number as Preferred Contact
		And selects Unknown option for Ethnicity of participant
		And selects White, Black/African American, Native Hawaiian/Pacific Islander, American Indian/Alaskan Native, Asian and enters "Entering other Race" for other when selecting Race of participant
		And selects Not sure for is the participant participated in any other research study or registry group?
		And proceeds with providing information for medical diagnosis
		And selects Feeding problems, failure to thrive, or other stomach/digestive problems option for participant being diagnosed with any of the listed conditions
		And selects Neurocognitive developmental delay such as:Intellectual disability and language impairment option for participant being diagnosed with any of the listed conditions
		And selects Skeletal deformities such as: Short stature, short webbed neck, unusual chest shape, curved spine, muscle or joint problems, limb overgrowth option for participant being diagnosed with any of the listed conditions
		And selects Head craniofacial abnormalities such as: Large head, broad or high forehead, short nose, small chin, swelling or bleeding of the gums, abnormal shape or movement of teeth option for participant being diagnosed with any of the listed conditions
		And selects Eye Ear abnormalities such as: Widely spaced eyes, eye diseases, droopy eye lids, sparse-absent eye lashes-eyebrows, low set ears, vision or hearing impairment option for participant being diagnosed with any of the listed conditions
		And selects No option for participant being diagnosed with cancer
		And selects No option for proband being diagnosed with a Rasopathy such as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello syndrome
		And proceeds with providing genetic testing information
		And selects I have no information on my biological relatives option for Have any of your biological relatives been diagnosed with a RASopathy?
		And selects Not sure option to participant having had genetic testing
		And the user proceeds on answering few remaining questions regarding the study
		And selects Genetic counselor option and enters "Genetic counselor Study" for how did you hear about this study?
		And selects No option for the participant or other family members ever participated in another study on RASopathies at another medical institution
		And for What are the main reasons for participating in this study? selects All options and for Participate in research enters "Reason one", for Identify a diagnosis enters "Reason two", for Receive genetic testing enters "Reason three", and for Other enters "Reason four"
		And proceeds with submitting the Eligibility Questionnaire
		Then the Eligibility Questionnaire is sucessfully submitted

	@juarezds @RASSurveyPreview
	Scenario: RASSurvey Preview Submission #submit page next button has been commented out/disabled
		Given a participant is on the Rassurvey Questionaire login page - myRAS Survey
		And logs in via Okta with username "diego1@test.com" and password "123456" on login page - myRAS Survey
		And clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey
		And clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey
		And selects I am completing this form for myself option on who is completing this form page - myRAS Survey
		And clicks YES option for Have you ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher? page - myRAS Survey
		And enters information about a previous cancer study "PUBLISHED IN ANOTHER CANCER STUDY" Please provide any additional information about the authors, year of publication or PubMed ID (PMID), if available. page - myRAS Survey
		And clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey
		And enters Biological Mother birth city "LOS ANGELES", select Mothers Age "23" and enters Father birth city "PUERTO VALLARTA",and selects Fathers age "26" for What was your biological parents age in Years when you were born? page - myRAS Survey
		And clicks YES Were you diagnosed with hypoglycemia (low blood sugar) during the newborn period. page - myRAS Survey
		And selects All that apply and enters in other prenatal condition "ABNORMAL BONE STRUCTURE" for Were you diagnosed with any of the following conditions during your mothers pregnancy? page - myRAS Survey
		And click YES During her pregnancy with you, did your mother have any prenatal tests to identify fetal birth defects or fetal medical problems? page - myRAS Survey
		And selects All normal results and enters other prenatal test "GENETIC" for Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you. page - myRAS Survey
		And selects All that apply and enters mothers prenatal type of infection "FLU" prenatal type of rash "ECZEMA", other complications "STREP THROAT" for Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? page - myRAS Survey
		And click YES During her pregnancy with you, did your biological mother take any medications vitamins or supplements for any reason? page - myRAS Survey
		And selects All that apply for and enters herbal supplement "OREGANO", other medication "TUMERIC", and other medication "MELATONIN" for Please select all medications your mother took during her pregnancy with you. page - myRAS Survey
		And adds details in Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey
		And clicks next Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey
		And clicks YES Did your biological mother use any tobacco products during her pregnancy with you? page - myRAS Survey
		And selects All that apply and enters other tobacco product "WAX" for What tobacco products did your biological mother use during her pregnancy with you? page - myRAS Survey
		And clicks YES Did your biological mother use any vaping products during her pregnancy with you? - myRAS Survey
		And selects All that apply and enters other vape product "ELECTRONIC CIGARS" for Which vaping products did your mother use during her pregnancy with you? Please select all that apply. page - myRAS Survey
		And clicks YES Did your biological mother drink any alcoholic beverages during her pregnancy with you? page - myRAS Survey
		And selects All that apply and enters other alcoholic beverage "ABSINTHE" for What alcoholic beverages did your mother drink during her pregnancy with you? page - myRAS Survey
		And clicks YES Did your biological mother use any recreational drugs during her pregnancy with you? page - myRAS Survey
		And selects All that apply and enters other recreational drug "HASH" for What recreational drug did your biological mother use during her pregnancy with you? page - myRAS Survey
		And clicks YES Did your biological mother ever live or work in a place where others smoked cigarettes, pipes or cigars around her during her pregnancy with you? page - myRAS Survey
		And selects All that apply and enters other products used around your mother "JUUL" for What products were used around your biological mother during her pregnancy with you? page - myRAS Survey
		And adds Please describe your biological parents occupation(s) during your mothers pregnancy with you? and enters mothers occupation "TEACHER" and enters fathers occupation "DIRECTOR" in Please list all of the occupations during the pregnancy. page - myRAS Survey
		And enters height in cm for biological mother height "150" and biological fathers height "180" in What is the height of your biological mother and father? page - myRAS Survey
		And clicks next The next set of questions will ask about hormone-related growth. Growth is influenced by many things including nutrition, parental height/genetics and secreted hormones that tell the body to grow taller. page - myRAS Survey
		And clicks YES Have you ever been evaluated by an endocrinologist for any reason? These are doctors that specialize in the endocrine system, which is made up of many glands that secrete hormones. Hormones play a role in many things in the body including growth, metabolism and salt regulation. Endocrinologists often diagnose conditions such as diabetes and thyroid problems. page - myRAS Survey
		And enters Endocrinologist medical provider name "DOCTOR GERALDINE TZU", medical provider city, state, country "ASHBURN, VA, UNITED STATES", hospital or medical affiliation "INOVA" in What is the name of the endocrinologist who completed your examination? page - myRAS Survey
		And clicks YES Have you ever had growth hormone testing? page - myRAS Survey
		And selects All options that apply enters other hormone testing "ADRENALINE OR EPINEPHRINE" for What were the results of your growth hormone testing? page - myRAS Survey
		And clicks YES Have you ever received growth hormone treatment? page - myRAS Survey
		And enters height before growth hormone treatment "5.5 Feet" for What was your height before starting growth hormone? page - myRAS Survey
		And selects number of growth hormone treatment "3" for How many times have you received growth hormone treatment? page - myRAS Survey
		And adds details in Please provide the details of growth hormone replacement by completing the table below. page - myRAS Survey
		And clicks Next button The next set of questions will ask about development. Development includes things such as crawling walking and speaking understanding language. page - myRAS Survey
		And clicks YES Were you ever diagnosed with hypotonia as an infant or child? This is often described as unusually low muscle tone or floppy muscle tone. page - myRAS Survey
		And clicks twelve-eighteen months option At what age were you able to sit without support? page - myRAS Survey
		And clicks twelve-eighteen months option At what age were you able to walk without support? page - myRAS Survey
		And clicks YES Have you ever received physical therapy? page - myRAS Survey
		And clicks twenty-four to thirthy-six months option At what age were you able to use simple two-word phrases? page - myRAS Survey
		And selects Simple speech compared to people of the same age How would you describe your current speech capabilities? page - myRAS Survey
		And clicks YES Have you ever received speech therapy? page - myRAS Survey
		And clicks Severe Cognitive Delay Between the ages of three and six years old preschool years, were you ever diagnosed with issues of cognitive development? Cognitive development can include difficulties in learning, understanding, andprocessing information or making decisions. page - myRAS Survey
		And clicks YES Didyou receive occupational therapy between three and six years of age? Occupational therapy is based on engagement in activities of daily life (such as self-care skills, education, work, or social interaction). page - myRAS Survey
		And clicks Attended typical elementary school without support Between the ages of six and ten (elementary school age)Please select the option that best describes your schooling. page - myRAS Survey
		And clicks Attended typical elementary school without support Between the ages of ten and seventeen (middle and high school age) please select the option that best describes your schooling. page - myRAS Survey
		And clicks Bachelors degree four-year college with BA, BS, AB, Please indicate the highest degree or level of schooling you have completed. page - myRAS Survey
		And click Working full time What is your current employment status? page - myRAS Survey
		And clicks All that apply and enters other learning differences "DYSGRAPHIA" for if other Have you ever been diagnosed with any of the following learning differences? page - myRAS Survey
		And clicks Next button If you have ever had formal IQ testing and have a copy, please upload it here. page - myRAS Survey
		And clicks Next button The next set of questions will ask about medical conditions associated with the heart. page - myRAS Survey
		And clicks YES Have you ever been evaluated by a cardiologist? These are doctors that specialize in the heart. Cardiologists often diagnose conditions such as an irregular heart beat, an enlarged heart, and heartdefects. page - myRAS Survey
		And enters name of Cardiologist doctor "DOCTOR RUSS JUNIOR", and enters Location "WASHINGTON DC, USA" ,and enters for Hospital "G.W. HOSPITAL" for What is the name of the cardiologist who completed your heart evaluation? page - myRAS Survey
		And clicks YES Have you ever been diagnosed with any structural heart issue(s)? page - myRAS Survey
		And clicks All that apply and enters "GIANT HEART" for Have you been diagnosed with any of the following structural heart issues? Structural issues affect how the heart is shaped. page - myRAS Survey
		And clicks All that apply for Have you ever had any of the following symptoms? page - myRAS Survey
		And enters all details for all symptom occurences and where and when they were evaluated for Please complete the table below for the following symptoms, indicating when these symptoms occurred and where these symptoms wereevaluated. You only have to provide the age or date for each symptom. If you dont recall when the symptom first started or when it most recently occurred, place an X under dont know. page - myRAS Survey
		And clicks YES Have you ever received treatment for heart problems? Some examples include: medication, catheter intervention, and surgery. page - myRAS Survey
		And select All that apply and enters for medication "BENAZEPRIL" and enters for other treatment "HEART EXAM" for Have you ever had any of the following treatments for heart problems? page - myRAS Survey
		And enters all details for Please complete the table below by providing information for the FIRST treatment and the MOST RECENT treatment. You only need to provide the age at which symptoms occurred or date (not both). If you donot recall the details, please place an X in the Dont know box. page - myRAS Survey
		And clicks YES button Are you still on? page - myRAS Survey
		And clicks YES button Have you ever been diagnosed with any functional heart issue(s)? page - myRAS Survey
		And clicks All that apply and enters other functional heart issues "GIANT HEART" for Have you ever been diagnosed with any of the following functional heart issues? page - myRAS Survey
		And enters all details for Please provide any details known for the condition(s) for which you have been diagnosed. For each condition, you need to provide either the age or date at which the condition occurred (not both). If you do not know or cannot recall, place an X in the Dont know box. For each condition, also provide any information regarding treatment. If none, please state None in the treatment. page - myRAS Survey
		And clicks Next button The next two questions will ask about RASopathy diagnoses. page - myRAS Survey
		And clicks YES button Have you been diagnosed with a RASopathy by a physician or through genetic testing? page - myRAS Survey
		And clicks All that apply and enters other RASopathies "CAPILLARY MALFORMATION-ARTERIOVENOUS MALFORMATION SYNDROME" for Please indicate if you have been diagnosed with any of the following RASopathies? page - myRAS Survey
		And clicks Next button The next set of questions will ask about general medical history. page - myRAS Survey
		And clicks YES Do you have a primary care provider? A primary care provider is a health professional (doctor, physician assistant, nurse practitioner) for which you go to for routine care. Examples of routine care include immunizations/vaccines, annual or sports physicals, or to treat common minor illnesses, such as sinus or ear infections. page - myRAS Survey
		And enters name of Primary Care medical provider "DOCTOR GEORGE PEABODY" and enter for location "FAIRFAX" and enters hospital "INOVA" for Please provide the information for your primary care provider below. page - myRAS Survey
		And clicks YES to all allergies for Please indicate in the table below if you have allergies to the listed items. We will ask about the specifics of these allergies in later questions. page - myRAS Survey
		And clicks + sign to add Medication "TYLENOL" and enters for allergic reaction "RASH" for Please complete the table below for all medications to which you are allergic. page - myRAS Survey
		And clicks + sign to add first food allergy "MILK" and enters allergic reaction "RASH" and clicks + sign for second food allergy "NUTS" and enters allergic reaction "HIVES" for Please complete the table below for all Foods to which you are allergic. page - myRAS Survey
		And clicks + sign to add other allergy "MOSQUITO BITES" and enters "ITCHING" for allergic reaction and clicks + sign for second allergy "BEE STINGS" and enters	"SWELLING OF THE THROAT" for items to which you are allergic that were notincluded in medication or food allergies. page - myRAS Survey
		And clicks YES button Have you ever had an operation or biopsy? page - myRAS Survey
		And clicks + sign to add type of surgery "C SECTION" and enters age for surgery "20" and selects reason for surgery "Childbirth" and enters hospital name "INOVA, ARLINGTON, VA, USA" in Please provide the information for eachbiopsy and surgery in the table below. To add a surgery or biopsy, click on the + button located in the upper left corner of the table. page - myRAS Survey
		And clicks YES button Have you ever been hospitalized for any reason other than a surgery or childbirth? page - myRAS Survey
		And clicks + sign to add reason for hospitalization "LONG TERM BLOODY NOSE" and enters when it occureed "9 NOVEMBER 2020" and enters hospital "INOVA, FAIRFAX, VA, USA" for Please provide the information for eachhospitalization in the table below. To add a new hospitalization, please click on the + sign in the upper left corner of the table. page - myRAS Survey
		And clicks Next button The next set of questions will ask about GI(gastrointestinal) symptoms or conditions. page - myRAS Survey
		And clicks YES button Have you ever been evaluated by a gastroenterologist? These are doctors that specialize in the GI tract and liver. The GI tract includes your esophagus, stomach, small intestine, large intestine/colon, liver and pancreas. page - myRAS Survey
		And enters Gastroenterologist doctors name "DOCTOR PHIL VOSS" and enters city, state "FAIRFAX, VA" then enters hospital "INOVA" for Please provide the details for the gastroenterologist who completed the evaluation. page - myRAS Survey
		And clicks All that apply and enters other feeding difficulties "TROUBLE SWALLOWING" for Have you ever been diagnosed with any of the following feeding difficulties? These issues often include problems eating food by mouth or keeping food from being vomited. page - myRAS Survey
		And clicks age and enters amount of time "10 DAYS" for At what age was the nasogastric or nasojejunal tube placed? page - myRAS Survey
		And clicks age and enters amount of time "20 DAYS" for At what age was the gastrostomy (G-tube) or gastrostomy-jejunostomy (GJ) tube placed? page - myRAS Survey
		And clicks age and enters amount of time "30 DAYS" for At what age was the gastrostomy (G-tube) or gastrostomy-jejunostomy (GJ) tube removed? page - myRAS Survey
		And click YES button Have you ever had any physical symptoms that likely involved your gastrointestinal (GI) system? There are many symptoms that are connected to the GI system. page - myRAS Survey
		And clicks All that apply Which of the following symptoms related to the GI system have occurred? page - myRAS Survey
		And clicks All previous resolved symptom for let us know if the symptoms listed below were previous symptoms or current (ongoing) symptoms. page - myRAS Survey
		And clicks YES for All for Did choking/gagging ever lead to. page - myRAS Survey
		And click YES for All that apply and enters heartburn symptoms at age "20" and enters heartburn medication "TUMS" for Please complete the Testing Docs table below regarding heartburn/reflux symptoms. page - myRAS Survey
		And click YES for All and enters nausea symptoms at age "12" and enters medication "PEPTOBISMOL" for Please complete the table below regarding nausea symptoms. page - myRAS Survey
		And clicks YES for ALL for Please complete the next set of questions regarding abdominal pain. page - myRAS Survey
		And clicks YES button Have any medications ever been taken for abdominal pain? page - myRAS Survey
		And selects abdominal medication amount "2" for How many medications have been taken for abdominal pain. page - myRAS Survey
		And enters abdominal pain details at age "18" and enters medication "ADVIL" and enters "LASTS 45 MINUTES AT A TIME" for Please complete the table below regarding the medications taken for abdominal pain to the best of your ability. page - myRAS Survey
		And clicks YES button for all Please complete the next set of questions regarding vomiting. page - myRAS Survey
		And clicks YES button for Has any medication ever been taken for vomiting? page - myRAS Survey
		And selects vomiting medication amount "2" for How many medications have been taken for vomiting? page - myRAS Survey
		And enters vomiting details at age "16" and enters medication "PEPTOBISMOL" and enters second age "16" for second medication "IMODIUM" for second medication for Please complete the list below by describing any medications taken for vomiting and the age when these medications were taken. page - myRAS Survey
		And selects all symptoms for Have any of the following symptoms occurred four or more days/month for at least two months? Select all that apply. page - myRAS Survey
		And enters amount of time "1 DAY" for when jaundice occured and enters "2 DAYS" for how long jaundice lasted for Please answer the below questions regarding jaundice (yellowing of the skin). page - myRAS Survey
		And clicks YES Do you take a lactose supplement? page - myRAS Survey
		And enters avoided foods "EGGS" for foods you avoid in Describe foods that you avoid because you do not like the texture or other physical qualities of the food. page - myRAS Survey
		And clicks YES button for all for Please answer the next two questions about diarrhea. page - myRAS Survey
		And enters amount of episodes "2 A DAY" for episodes in a day and enters "TUMS" for medication used and enters "12" for age when medication was taken in Please complete the table below regarding diarrhea. If medications have never been used, please put N/A in the box. page - myRAS Survey
		And clicks YES for All for Please complete the table regarding constipation. page - myRAS Survey
		And enters medication "ADVIL" for medication and enters "16" for age in Please complete the table below regarding encopresis. If medications have never been used, please put N/A in the box. page - myRAS Survey
		And enters weight "20 POUNDS" for weight lost and enters "30 DAYS " for over period of time where loss of weight occured and enters "YES" for gained back weight in Please complete the table below regarding weight loss. page - myRAS Survey
		And clicks YES for All and clicks all checkboxes regarding supplemental nutrition for Please complete the information below regarding decreased appetite. page - myRAS Survey
		And clicks YES. Are you toilet trained? page - myRAS Survey
		And selects toilet trained age "2" for At what age (approximately) were you toilet trained? page - myRAS Survey
		And clicks YES for ALL for Please complete the information below regarding urination. page - myRAS Survey
		And clicks YES for ALL for Please complete the information below regarding bowel movements. page - myRAS Survey
		And selects bowel movement per week amount "2" for How many bowel movements do you have per week? page - myRAS Survey
		And selects longest amount of time since last bowel movement "2 days" What is the longest amount of time that has passed without you having a bowel movement? page - myRAS Survey
		And clicks type one for Please use the Bristol Stool Chart shown below and select the choice that best represents what typical bowel movements look like. page - myRAS Survey
		And clicks YES for Have you ever had a procedure, test or study to evaluate your gastrointestinal (GI) system? page - myRAS Survey
		And selects All and enters for other GI test "ANAL FISSURES EXAM" Please indicate which of the following procedures have been performed. page - myRAS Survey
		And enters all details for Please provide the information below for the first procedure of each kind that was performed. page - myRAS Survey
		And clicks Next button for The next set of questions ask about breathing and the lungs. page - myRAS Survey
		And clicks YES button for Have you ever had an evaluation by a pulmonologist? page - myRAS Survey
		And enters Name of Pulmonologist Physician "DOCTOR LEE VOSS", and enters hospital Location "MONROVIA, MD, USA" and enters Hospital name "HOLLYCROSS" for Please provide the information below for the pulmonologist who completed your evaluation. page - myRAS Survey
		And clicks YES button for Have you ever had wheezing or whistling in your chest? page - myRAS Survey
		And clicks YES button for Has a doctor diagnosed you with reactive airway disease or asthma? page - myRAS Survey
		And clicks YES button for Have you ever been seen in the emergency room for a breathing problem? page - myRAS Survey
		And clicks YES button. Have you ever been admitted to the hospital for a breathing problem? page - myRAS Survey
		And clicks Next button for The next set of questions will ask about oral health and dental history. page - myRAS Survey
		And clicks YES button for Do you receive regular dental care? page - myRAS Survey
		And enters name of Dentist "DOCTOR DEAN ROY" and enters location "ARLINGTON, VA", and enters Medical Center "INOVA" for Please provide the information below for where dental care is received. page - myRAS Survey
		And enters last dentist visit date "12/21/2012" for when did you last visit a dentist? Please use format month/year as MM/YY. page - myRAS Survey
		And clicks cleaning for What was the reason for your last dental visit? page - myRAS Survey
		And clicks YES button for Do your gums bleed regularly with tooth brushing now? page - myRAS Survey
		And click YES button for Do your teeth or gums hurt regularly? page - myRAS Survey
		And click YES button for Do you have periodontal or gum disease? page - myRAS Survey
		And clicks YES button for Have you had dental sealants placed? page - myRAS Survey
		And clicks YES button for Do you currently have cavities? page - myRAS Survey
		And clicks YES button for Have you previously had any dental fillings? page - myRAS Survey
		And clicks YES button for Does your mouth usually feel dry? page - myRAS Survey
		And clicks Fair button for Overall, how would you rate the overall health of your teeth and gums? page - myRAS Survey
		And clicks Fair button for Overall, how would you rate your dental hygiene routine (regular tooth brushing, flossing, and your home oral mouth rinse)? page - myRAS Survey
		And clicks YES button for Have you had any changes in your sense of smell (NOT related to a diagnosis of COVID)? page - myRAS Survey
		And clicks YES button for Have you had any changes in your sense of taste (NOT related to a diagnosis of COVID)? page - myRAS Survey
		And clicks YES button for Do you have jaw or temporomandibular joint pain? page - myRAS Survey
		And clicks YES button for Do you have frequent headaches? page - myRAS Survey
		And clicks YES button for Have you had any orthodontic treatment? page - myRAS Survey
		And clicks YES button for Have you had a palatal expansion? page - myRAS Survey
		And clicks YES button for Have you had any facial or dental trauma? page - myRAS Survey
		And clicks YES button and enters dental surgery "ROOT CANAL" for Did the facial or dental trauma require surgery? page - myRAS Survey
		And clicks YES button Have you had elective jaw surgery? page - myRAS Survey
		And clicks YES button enters mouth or jaw cancer "SQUAMOUS CELL CARCINOMA" for Do you have a history of cancer in the mouth or jaw? page - myRAS Survey
		And clicks YES button enters jaw abnormality "SMALL UPPER JAW" for Do you have a family member with a jaw abnormality? page - myRAS Survey
		And clicks YES button Do you have any numbness in or around your mouth? page - myRAS Survey
		And clicks YES button Do you have any mouth sores? page - myRAS Survey
		And clicks YES button Do your teeth feel sensitive to hot or cold foods? page - myRAS Survey
		And clicks YES button Do you have problems moving your lips, tongue or mouth? page - myRAS Survey
		And clicks YES button enters unusual dental condition "EXTRA TEETH" for Is there anything unusual about your teeth or mouth extra teeth, missing teeth, severe dental diseases, jawbone problems, enamel problems, etc.? page - myRAS Survey
		And clicks Occasionally for Have you had trouble pronouncing any words because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally for Have you felt that your sense of taste has worsened because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally for Have you had painful aching in your mouth? page - myRAS Survey
		And clicks Occasionally for Have you found it uncomfortable to eat any foods because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally for Are you self-conscious because of your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally for Have you felt tense because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Has your diet been unsatisfactory because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you had to interrupt meals because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you found it difficult to relax because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you been a bit embarrassed because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you been irritable with other people because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you had difficulty doing your usual jobs because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you felt that life in general is less satisfying because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Occasionally Have you been totally unable to function because of problems with your teeth, mouth or dentures? page - myRAS Survey
		And clicks Next button The next set of questions ask about fluid balance and if any fluid builds up throughout the body. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with a lymphatic system issue? Some examples include: neonatal lymphedema, lymphedema, congenital chylothorax, pleural effusion/chylothorax, and lymphangioma. page - myRAS Survey
		And clicks All and enters for other lymphatic condition "POOR LYMPHATIC DRAINAGE" for Have you ever been diagnosed with any of the following lymphatic system issues? The lymphatic system is a network of vessels and nodes (lymph nodes) that carry a fluid called lymph throughout our bodies. Lymph helps the body fight infection. Please select all that apply. page - myRAS Survey
		And enters all details for Please complete the table below to the best of your ability about the onset of symptoms, when you were diagnosed and if any procedures or medications were undertaken. page - myRAS Survey
		And click Next button for The next set of questions will ask about the kidneys. page - myRAS Survey
		And clicks YES button Start Have you ever been evaluated by a nephrologist? These are doctors that specialize in the kidneys.They often diagnose conditions related to kidney function and help people get dialysis if their kidneys are not working well. page - myRAS Survey
		And enters name of Neuphrologist doctor "DOCTOR LAUREN RODNEY", and enters City "ARLINGTON, VA" and enters Hospital "INOVA" for Please list the information below for the nephrologist who completed your evaluation. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with a kidney problem? Some examples include: minor issues with kidney shape, underdeveloped kidney, missing kidney, or swollen kidney. page - myRAS Survey
		And clicks All that apply and enters other kidney problem "KIDNEY DISEASE" Have you ever been diagnosed with any of the following kidney problems? Please select all that apply. page - myRAS Survey
		And enters All details for Please complete the table below to the best of your ability regarding date of onset of symptoms, diagnosis and if any medications or procedures were undertaken. page - myRAS Survey
		And clicks Next button for The next set of questions ask about hair and skin qualities. page - myRAS Survey
		And clicks Yes button for Have you ever been evaluated by a dermatologist? Dermatologists are physicians who specialize in conditions of the skin. They diagnose and treat a range of conditions such as melanoma, acne, and hemangiomas. page - myRAS Survey
		And enters name of Dermatologist Physician "DOCTOR DERMA CLOONEY" and enters city/state "WASHINGTON, DC" and enters Hospital "G.W. HOSPITAL" for Please provide the information below for the dermatologist who completed your evaluation. page - myRAS Survey
		And clicks all and enters other hair condition "THICK HAIR" for Please choose the best term(s) to describe your hair. Please select all that apply. page - myRAS Survey
		And clicks YES button for Is the texture or amount of your hair similar to biological family members, such as your mother, father, sibling, and children? page -  myRAS Survey
		And clicks All that apply and enters other skin issue "VITILIGO" for Have you ever been diagnosed with any of the following issues involving patches of thickened skin, also known as hyperkeratotis skin? Please select all that apply. page - myRAS Survey
		And clicks All that apply and enters other pigmented skin issue "ALBINISM" for Do you have any of the following pigmented skin findings? Select all that apply. page - myRAS Survey
		And clicks Three or more hemangiomas for Do you have any hemangiomas? Hemangiomas are bright red marks on the skin made up of blood vessels, which may appear as a mass or lump. A hemangioma may appear in infancy or childhood and fade over time. page - myRAS Survey
		And clicks All that apply and enters other skin tumor "BENIGN TUMOR" for Have you ever been diagnosed with any of the following skin tumors? Please select all that applyfor this page. page - myRAS Survey
		And clicks Next button for The next set of questions ask about skeletal conditions. Skeletal conditions involve the bones throughout the body page. page - myRAS Survey
		And clicks YES button for Have you ever been evaluated by an orthopaedic surgeon? Orthopaedic surgeons are doctors who specialize in the bones and muscles. They diagnose and treat a range of conditions including broken bones, osteosarcoma, and torn ligaments. page - myRAS Survey
		And enters Name of Orthapaedic Physican "DOCTOR BASHIR ZIKRIA" and enters Location "BETHESDA, MD" and enters Hospital "JOHNS HOPKINS" for Please provide the details below for the orthopaedic surgeon who completed your evaluation. page - myRAS Survey
		And clicks All that apply and enters other skeletal condition "RICKETS" for Have you been diagnosed with any of the following skeletal findings in the thoracic area? The thoracic area includes the chest and ribs. page - myRAS Survey
		And clicks YES button for Do you have any issues with curving of the spine? This would often be diagnosed or evaluated by an orthopaedic surgeon. Examples include scoliosis and kyphosis. page - myRAS Survey
		And clicks All that apply and enters other spine condition "ARTHRITIS OF THE SPINE" for Have you ever been diagnosed with any of the following types of curvature of the spin. page - myRAS Survey
		And enters all details for Please complete the table below for each of the spine issues listed. For each condition, please indicate your age or date when they occurred (you do not need to include both). If you do not recall the details, place	an X in the column Dont know. For the treatment column, if no treatment was	required, please write None. page - myRAS Survey
		And clicks YES button for Has your neck been described as short or webbed? Individuals with a short, webbed neck may have a low hairline or extra skin where the neck meets the shoulders. Page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with joint issues? These conditions are often diagnosed by neurologists, rheumatologists and orthopaedic surgeons. Examples include ulnar deviation, Achilles tendon contracture, hip dysplasia. page - myRAS Survey
		And clicks ALL that apply and enters other joint issue "GOUT" for Have you ever been diagnosed with the following joint issues page? page - myRAS Survey
		And enters all details for Please complete the table below for each of the joint issues listed. For each condition, please include the date or age when symptoms first occurred and date or age at diagnosis (you do not need to include both the date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please put None in the Treatment column. page - myRAS Survey
		And clicks Next button for The next set of questions ask about blood disorders. Blood disorders include immune system problems white blood cells or bleeding clotting issues platelets or other bone marrow problems where white blood cells, red blood cells and platelets are produced. page - myRAS Survey
		And clicks YES button for Have you ever had an evaluation by a hematologist or oncologist? Hematologists are physicians who specialize in the blood system, including white blood cells, platelets, red blood cells and clotting factors. Oncologists are physicians who specialize in cancer. page - myRAS Survey
		And enters Name of Hematologist Physican "DOCTOR LILY KING" and enters Location "ARLINGTON, VA",and enters Hospital "INOVA" for Please provide the information below for the hematologist/oncologist who completed your evaluation. page - myRAS Survey
		And clicks YES button for Do you have issues with bleeding or bruising? Examples include easy bruising, poor blood clotting. These conditions are often evaluated and diagnosed by a hematologist (a physician who specializes in the blood). page - myRAS Survey
		And clicks All that apply and enters other blood issue "ANEMIA" for Do you have any of the following issues with bleeding or bruising? Please select all that apply. page - myRAS Survey
		And enters All details for Please complete the table below for each of the bleeding bruising issues listed. For each condition, please provide your age or date when symptoms first started and at diagnosis, you only need to provide date or age, but not both. If you do not recall the details, please place an X in the Dont know column. If no treatment was required, please write None in the treatment column. page - myRAS Survey
		And clicks YES button for Do you have any known blood disorders or symptoms of blood disorders? Examples include an enlarged spleen, leukemia, low plateletsor low blood cells. page - myRAS Survey
		And clicks All that apply and enters other leukemia condition "CHRONIC LYMPHOCYTIC LEUKEMIA" and other blood condition "FACTOR V DEFICIENCY" in Have you ever been diagnosed with any of the following blood disorders or symptoms of blood disorders? Please select all that apply. page - myRAS Survey
		And enters All details for Please complete the table below for each of the blood disorders issues listed. For each condition listed, please include either your age or date of symptoms and diagnosis (you do not need to include both date and age). If you do not recall the details, please place an X in the column Dont know. If no treatment was required, please write None in the Treatment column. page - myRAS Survey
		And clicks All that apply and enters other tumor condition "BRAIN TUMOR" for Have you ever been diagnosed with any of the following tumors? Please select all that apply. page - myRAS Survey
		And enters All details for Please complete the table below for each of the tumors listed. Please include your age or date when symptoms first started and diagnosis you do not need to include both age and date. If you do not recall the details, please place an X under the Dont know column. page - myRAS Survey
		And clicks YES button for Do you have a history of frequent infections (typically recurrent sinus infections or pneumonia) or immunodeficiency? page - myRAS Survey
		And clicks YES button for Have you ever been evaluated by an immunologist or rheumatologist? These are physicians who specialize in the immune system and how it functions. They diagnose conditions such as lupus, autoimmune thyroiditis, and psoriasis. page - myRAS Survey
		And enter Name of Immunologist Physican "DOCTOR JOSE MORENO" and enters Location "DECATUR, GA" and enters Hospital "GEORGIA REGIONAL HOSPITAL" for Please provide the name of the immunologist/rheumatologist who completed your evaluation. page - myRAS Survey
		And clicks All and enters for other infection frequency "FREQUENT INFECTIONS IN ADULTHOOD" for How would you describe infection frequency and your immune system? Please select all that apply. page - myRAS Survey
		And enters All details for Please complete the table below for each of the immunodeficiencies listed. For each, please provide the date or age at which symptoms occurred and diagnosis (you do not need to include both age and date). If you do not recall details, please place an X in the Dont know column. If no treatment has been required, place None in the Treatment column. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with an autoimmune disorder? An autoimmune disorder is when the immune system attacks the bodys own healthy tissues; can include Hashimoto thyroiditis, lupus, or autoimmune thrombocytopenia, etc. page - myRAS Survey
		And clicks All that apply and enters autoimmune blood condition "VASCULITIS" and enters for other "GULLAIN-BARRE SYNDROME" for With what autoimmune disorder have you been diagnosed? page - myRAS Survey
		And enters All details for Please complete the table below for each of the autoimmune conditions listed below. Please provide the date or age when symptoms first occurred and diagnosis, you do not need to include both age and date. If you do not recall the details, please place an X in the Dont know box. If no treatment was required, please state None in the Treatment column. page - myRAS Survey
		And clicks Next button for The next set of questions ask about conditions associated with the central nervous system. The central nervous system includes the brain and spinal cord. page - myRAS Survey
		And clicks YES button for Have you ever been evaluated by a neurologist or neurosurgeon? These are physicians who specialize in the brain and spinal cord. They diagnose conditions such as seizures, brain tumors, and brain malformations. page - myRAS Survey
		And enters Name of Neurologist Physican "DOCTOR JENNIFER LOPEZ" and enters Location "MAIMI, FL" and enters Hospital "MERCY HOSPITAL" for Please provide the information for the neurologist or neurosurgeon who completed your evaluation. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with a structural brain abnormality? Examples include Chiari one malformation, hydrocephalus, tethered spinal cord. These conditions are often diagnosed using a CT or MRI scan and evaluated by neurosurgeons. page - myRAS Survey
		And clicks All that apply and enters brain issue "DIMENTIA" for Have you ever been diagnosed with any of the following issues of the brain? page - myRAS Survey
		And enters All details for Please complete the table below for each of the conditions listed. For each condition, please list either the date or age when the symptoms started and time of diagnosis (you do not need to include both age and date). If you do not recall, place an X in the Dont know column. page - myRAS Survey
		And clicks YES button for Do you have a history of seizures page? page - myRAS Survey
		And clicks All that apply and enters seizure type "MYOCLONIC SEIZURES" for Please select all seizure disorders for which you have been diagnosed. page - myRAS Survey
		And enters All details for Please complete the table below for each of the conditions listed. For each condition, please include the age or date when symptoms occurred and when diagnosed (you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. page - myRAS Survey
		And clicks YES button for Have you ever been evaluated by a psychiatrist, psychologist or behavioral pediatrician? These medical providers often diagnose conditions such as depression, anxiety, learning difficulties, and developmental disorders. page - myRAS Survey
		And enters Name of Behavioral Physican "DOCTOR BRAD PITT" and enters Location "WASHINGTON, DC" and enters hospital "G.W. HOSPITAL" for Please provide the information listed below for the medical providers who completed your evaluation. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with a behavioral or psychiatric condition? Examples include mood disorders (depression), self-harm acts, anxiety, bipolar disorder, autism spectrum disorder, aggression. page - myRAS Survey
		And clicks All that apply and enters other behaviorial condition "ASPERGERS" for Have you ever been diagnosed with a behavioral or psychiatric condition? page - myRAS Survey
		And enters All details for Please complete the table below for each of the diagnosed behavioral and/or psychiatric conditions listed. For each condition, please list the date or age of symptom onset and diagnosis (you do not need to include both age and date). If you do not recall, please place an X in the Dont know box. If no treatment was required, place None in the Treatment column. page - myRAS Survey
		And enters neurologic conditions and enters other neurologic condition "ATAXIA" for Please list and describe any additional neurologic conditions here that were not covered by the previous questions. page - myRAS Survey
		And clicks Next button for The next set of questions ask about vision and hearing page. page - myRAS Survey
		And clicks YES button for Have you ever been diagnosed with ptosis (droopiness of the upper eyelid)? page - myRAS Survey
		And clicks YES button for Did you require treatment for ptosis? page - myRAS Survey
		And clicks YES button for Have you ever had any issues with your vision or eyesight? page - myRAS Survey
		And clicks All that apply and enters for other vision condition "GLAUCOMA" for Please select all the vision/eyesight conditions for which you have been diagnosed. page - myRAS Survey
		And enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first started and when the diagnosis was made you do not need to include both date and age. If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey
		And clicks YES button for Have you ever experienced strabismus? Strabismus is when the eyes are not aligned properly; one may wander up, down or sideways. page - myRAS Survey
		And enters strabismus first symptoms date "03/13" and enters age "23" and enters diagnosis date "04/14" and enters age "24" and clicks occlusion treatment for Please complete the table below regarding strabismus. Please list the age or date when symptoms first started and when the diagnosis was made (you do not need to include both date and age). If you do not recall, place an X in the Dont know column. If no treatment was required, place None in the Treatment column. page - myRAS Survey
		And clicks YES button for Have you ever experienced nystagmus? Nystagmus is when the eye makes sudden, uncontrolled movements, like tremors. page - myRAS Survey
		And enters nystagmus first symptoms date "05/09" and enters age "11" and enters diagnosis date "06/13" and enters age "15" and clicks yes treatment mild shorterm severity for Please complete the table below regarding nystagmus. Please include the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. page - myRAS Survey
		And clicks YES button for Have you experienced hearing loss? page - myRAS Survey
		And clicks All that apply and enters other hearing loss "SEVERE HEARING LOSS" for Have you experienced any of the following types of hearing loss? page - myRAS Survey
		And enters for other hearing loss "SEVERE HEARING LOSS" and clicks YES for all treatment and enters All details for Please complete the table below for each of the conditions listed. For each condition, please list the age or date when symptoms first occurred and when the diagnosis was made you do not need to include both age and date. If you do not recall the details, place an X in the Dont know column. page - myRAS Survey
		And select All that apply and enters other ear issue "INNER EAR INFECTION" for Do you have any of the following issues with your ears? page - myRAS Survey
		And enters other health issue "FOREIGN ACCENT SYNDROME" for If there are any other health issues present that have not been captured by this survey page. page - myRAS Survey
		And clicks Next button to end survey for You are almost done! To submit your responses, you must continue in the questionnaire by clicking the forward arrow below. The information you have provided will be reviewed by our study team. In the meantime, you should receive an email confirming this submission. page - myRAS Survey

