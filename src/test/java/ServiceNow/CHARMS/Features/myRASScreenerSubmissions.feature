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


	@jains @myRASScreenerSubmission @E2E
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

