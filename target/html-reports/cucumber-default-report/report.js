$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/ServiceNow/SEER/Features/SEERDataAccessRequestPage.feature");
formatter.feature({
  "name": "SEER Data Access Request Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Non-Institutional flow - Verifying SEER Data Access Request page contents and agreements for Non-Institutional flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Progression"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Users/diegojuarez/backupworkspace/CBIIT-Test-Automation/src/main/java/com/drivers/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\n\tat com.nci.automation.web.WebDriverUtils.getWebDriver(WebDriverUtils.java:59)\n\tat ServiceNow.SEER.Steps.HooksSteps.genericSetUp(HooksSteps.java:34)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\n\tat cucumber.runner.Runner.runPickle(Runner.java:49)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:123)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:147)\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\n",
  "status": "failed"
});
formatter.step({
  "name": "a SEER User Registration has been successfully submitted",
  "keyword": "Given "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.a_SEER_User_Registration_has_been_successfully_submitted()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies email address by clicking on the email verification link that is sent to the user after submitting a SEER User registration form",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_verifies_email_address_by_clicking_on_the_email_verification_link_that_is_sent_to_the_user_after_submitting_a_SEER_User_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is directed to the \u0027SEER Data Access Request\u0027 page",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_directed_to_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027Requested for\u0027 field contains the name of the requestor in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_contains_the_name_of_the_requestor_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027Database type\u0027 field displays with \u0027SEER Research Plus\u0027 in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_field_displays_with_in_read_only_format(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user can select a general purpose for using the data",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_can_select_a_general_purpose_for_using_the_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can enter official first name, official last name, and official email address",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_can_enter_official_first_name_official_last_name_and_official_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can select Yes to \u0027Do you intend to use the treatment fields in your analysis?\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_can_select_Yes_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user can enter a plan to \"How do you plan to use these fields?\"",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.user_can_enter_a_plan_to(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027I understand the limitation of treatment data.\u0027 the Initials text box displays with the users initials in read-only mode",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_Initials_text_box_displays_with_the_users_initials_in_read_only_mode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the \u0027I understand the limitation of treatment data.\u0027 text agreement displays as followed",
  "keyword": "And ",
  "doc_string": {
    "value": "Acknowledgment of Data Limitations of SEER Data Submission for Radiation Therapy and Chemotherapy Information and Sequence Treatment Variables\nThe population-based Surveillance, Epidemiology, and End Results (SEER) registries collect information on radiation therapy (RT) and chemotherapy given as part of the first course of treatment. RT data are classified by the type of RT received or “no/unknown – no evidence of radiation was found in the medical records examined”. Chemotherapy data are categorized as either “yes – patient had chemotherapy” or “no/unknown – no evidence of chemotherapy was found in the medical records examined”. These data are available upon request after acknowledging the limitations associated with analyses of the data. Three main limitations affect recommended analyses using the SEER radiation therapy and data: 1) the completeness of the variables; and 2) the biases associated with unmeasured reasons for receiving or not receiving RT/chemotherapy; 3) the interpretation of sequence data variables. Below we further describe the issues and analyses that could be problematic.\nCompleteness of the Variables\nOne recent publication comparing SEER data with SEER-Medicare data reported that overall sensitivity was 80% for SEER RT data and 68% for SEER chemotherapy data. Sensitivity varied by cancer site, stage, and patient characteristics. The overall positive predictive value was high (\u003e85%) for all treatments and cancer sites except chemotherapy for prostate cancer. This analysis used a fairly broad definition for chemotherapy use based on Medicare claims, and further sensitivity analysis is ongoing. 1\nAlthough sensitivity was moderate, specificity was high, meaning that if RT or chemotherapy was captured in SEER, it was most likely received by the patient. But if it was not captured in SEER, then we do not know whether it was not received by the patient or whether it was missed by the registry. As treatment is increasingly received outside of the hospital setting, there is a diminishing likelihood that it is captured completely. Because we cannot accurately distinguish between “no treatment” and “unknown if patients received treatment,” the variables that are released upon request are classified as “yes” or “no/unknown”.\nExamples of analyses that would NOT be supported by the RT/chemotherapy data, due to the incompleteness of the variable, include:\nEstimates of population prevalence of treatment or patterns of care in the population without appropriate comment on the limitations of the data (e.g., clearly labeling both treatment categories as “yes” and “no/unknown” wherever they appear).\nEstimates of compliance with guidelines\nComparison of treatment levels in different groups, e.g., investigating health disparities, without adequately stated limitations\nComparison of outcomes by treatment received\nSince we have high confidence that an individual received RT/chemotherapy if the variable is listed as “yes”, analyses such as identifying a cohort of patients who received treatment in order to identify risk of adverse events, including risk of second cancers, would be supported by the data.\nBiases Associated with Who Receives Treatment\nUnlike clinical trials, many factors involved in determining the course of treatment will not be captured in the registry data. Such factors include: patient preferences, physician recommendations, comorbidities, and proximity to treatment providers. Because the data collected do not include these and other factors that are related to why a patient did or did not receive RT/chemotherapy, we do not recommend comparing outcomes conditioned on treatment or comparative effectiveness research using the SEER data without careful consideration of possible biases and appropriate adjustments, potentially using data beyond standard SEER data (e.g. SEER-Medicare linked data). For example, survival differences observed for patients who did vs. did not receive chemotherapy cannot be attributed to the efficacy or effectiveness of treatment without controlling for the factors that determined treatment receipt. Similarly, observed differences cannot be generalized to describe the benefit an individual would expect to receive from chemotherapy treatment.\nSequence Treatment Variables\nStarting with the November 2019 submission of data, the Research Plus databases include two variables indicating the sequence of systemic therapy and radiation therapy with respect to surgery, “RX SUMM--SYSTEMIC/SUR SEQ” and “RX SUMM--SURG/RAD SEQ”. We recommend caution when using these variables to identify patients that could have received neoadjuvant treatment because:\nSurgery in the context of this data item may refer to any surgical procedure recorded in any surgery-related data items, such as an excisional biopsy of the primary tumor, a removal of a distant metastatic lymph node, etc. \nAlthough the variables report the sequence of surgery and other treatment modalities, it does not consider the timing of events. Thus, it is possible that radiation may have been given more than 6 months, or just 6 days prior to surgery and not constitute neoadjuvant.\nThe systemic treatment administered before surgery might not have had neo-adjuvant intent or would not have been administered long enough to expect a relevant tumor response (i.e., endocrine therapy administered days before mastectomy).\nThere may be missing information about radiation and/or systemic treatment, which may underestimate the frequency of neoadjuvant treatment.\nSurgery does not refer to most definitive surgery. For example, it might refer to the removal of regional or distant lymph nodes.\nBecause of the limitations listed above, we strongly caution investigators to consider the potential for misclassification bias when using the sequence treatment variables to select cases that might have received radiation therapy or systemic treatment with neoadjuvant intent.\nDefinitions\nNeoadjuvant: Systemic therapy provided prior to a curative surgery with an intention of producing an outcome of reduction in tumor size prior to surgery.\nIntraoperative radiation therapy (IORT): An intensive radiation treatment that is administered during surgery. IORT allows direct radiation to the target area while sparing normal surrounding tissue. IORT is used to treat cancers that are difficult to remove during surgery and when there is a concern that microscopic amounts of cancer may remain. IORT is often combined with conventional radiation therapy, which is usually administered before surgery. IORT allows higher effective doses of radiation to be used compared with conventional radiation therapy, as it allows doctors to temporarily move nearby organs or shield them from radiation exposure.\nReference:\n \nNoone AM, Lund JL, Mariotto A, Cronin K, McNeel T, Deapen D, Warren JL. Comparison of SEER Treatment Data with Medicare Claims. Med Care 2014 Mar 15. [Epub ahead of print]\n\nSequence Treatment Variables\nStarting with the November 2019 submission of data, the Research Plus databases include two variables indicating the sequence of systemic therapy and radiation therapy with respect to surgery, “RX SUMM--SYSTEMIC/SUR SEQ” and “RX SUMM--SURG/RAD SEQ”. We recommend caution when using these variables to identify patients that could have received neoadjuvant treatment because:\nSurgery in the context of this data item may refer to any surgical procedure recorded in any surgery-related data items, such as an excisional biopsy of the primary tumor, a removal of a distant metastatic lymph node, etc. \nAlthough the variables report the sequence of surgery and other treatment modalities, it does not consider the timing of events. Thus, it is possible that radiation may have been given more than 6 months, or just 6 days prior to surgery and not constitute neoadjuvant.\nThe systemic treatment administered before surgery might not have had neo-adjuvant intent or would not have been administered long enough to expect a relevant tumor response (i.e., endocrine therapy administered days before mastectomy).\nThere may be missing information about radiation and/or systemic treatment, which may underestimate the frequency of neoadjuvant treatment.\nSurgery does not refer to most definitive surgery. For example, it might refer to the removal of regional or distant lymph nodes.\nBecause of the limitations listed above, we strongly caution investigators to consider the potential for misclassification bias when using the sequence treatment variables to select cases that might have received radiation therapy or systemic treatment with neoadjuvant intent.\nDefinitions\nNeoadjuvant: Systemic therapy provided prior to a curative surgery with an intention of producing an outcome of reduction in tumor size prior to surgery.\nIntraoperative radiation therapy (IORT): An intensive radiation treatment that is administered during surgery. IORT allows direct radiation to the target area while sparing normal surrounding tissue. IORT is used to treat cancers that are difficult to remove during surgery and when there is a concern that microscopic amounts of cancer may remain. IORT is often combined with conventional radiation therapy, which is usually administered before surgery. IORT allows higher effective doses of radiation to be used compared with conventional radiation therapy, as it allows doctors to temporarily move nearby organs or shield them from radiation exposure.\n \nI have read and understand the limitations of the SEER RT and chemotherapy data and the Sequence Treatment Variables described above and will include a description of relevant limitations in any analyses published using the SEER data. I acknowledge that the SEER Program has advised me that there are substantive concerns about using these data to address certain research questions as described above. I understand that any findings from such analyses may be inaccurate or misleading."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_text_agreement_displays_as_followed(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Data Use Agreement Certification\u0027, the users initials display in read only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_users_initials_display_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Data Use Agreement Certification text displays as the following:",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER Research Data Use Certification Agreement\n \nThis SEER Research Data Use Certification Agreement (the “Agreement”) outlines the terms for access to data in the National Institutes of Health (NIH) Surveillance, Epidemiology, and End Results (SEER) Research and Research Plus Databases (collectively, the “Databases”). The parties to this Agreement include the NIH and the “Authorized User” indicated in the signature block below. The effective date of this Agreement is the date of Authorized User’s signature (“Effective Date”).\n \nPreamble\n \nThe NIH has established NIH-designated cloud-based data repositories for securely storing and sharing data collected by the National Cancer Institute (NCI) SEER Program. The SEER Program developed the Databases to support research and makes the Databases available through the SEER*Stat software.\nAuthorized User wishes to access the Databases for research. This Agreement governs Authorized User’s use and disclosure of data obtained from the Databases and data derived from that data (collectively referred to in this Agreement as “Data”).\nAgreement and Terms of Use\n \nAs a condition of access to the Databases and Data, Authorized User agrees to the following provisions:\nUse and Disclosure Restricted: Authorized User will not use or disclose, nor will permit others to use or disclose, the Data for purposes other than the research described in the Data Access Request (DAR) and other application material.\nCompliance: Authorized User will use Data in full compliance with all applicable laws and NCI policies and guidance documents. To the extent NCI policies or guidance documents are inconsistent with the terms of this Agreement, the terms of this Agreement will supersede NCI policies or guidance.\nNo Data Linkage: Authorized User will not link or attempt to link the Data with information in another database, nor will permit others to do so. This includes, but is not limited to, links or attempts to link two or more SEER Databases to which Authorized User has access.\nNo Re-Identification of Individuals. Authorized User will not attempt to learn the identity of any individual whose Data is contained in the Databases. If Authorized User or any other person inadvertently discovers the identity of an individual whose Data is in the Databases, Authorized User will: (a) make no use of this knowledge, including informing others of the discovered identity, (b) not contact any individual, and (b) notify the NCI Surveillance Research Program (SRP) of the incident under Section 7, below. Authorized User agrees not to generate information from Data that could allow the identities of individuals to be readily ascertained.\nNo Release to Others. Authorized User will not release, nor permit others to release, the Data to any other person. All members of a research team who wish to have access to the Data must sign a SEER Research Data Use Agreement. Authorized User will not disclose Data in any Federal, State, or local civil, criminal, administrative, legislative, or other proceeding without advance written approval of the NCI SRP.\nRequired Safeguards. Authorized User will use appropriate safeguards to prevent use or disclosure of the Data. Authorized User will not share his or her logon name or password with any other person. Authorized User will not allow any other person to use Authorized User’s computer account after Authorized User has logged on with Authorized User’s logon name and password.\nNotice of Unauthorized Data Use, Unauthorized Data Sharing, Identification of Individuals in Data, or Breaches of Security. Authorized User agrees to notify the NCI SRP at seercustomdata@imsweb.com of any unauthorized Data use or disclosure, identification of individuals whose Data is in the Databases, or breaches of security that may compromise the confidentiality of Data, within 24 hours of when the incident is discovered. Within 3 business days of notification, Authorized User agrees to submit to the NCI SRP a detailed written report including the date and nature of the incident, actions taken or that will be taken to remediate the issue(s) and to prevent further problems (the “Remediation Plan”), and a timeline for actions in the Remediation Plan. Authorized User agrees to cooperate with an investigation by NIH (or another entity designated by NIH), to work with NIH to assure that the Remediation Plan is sufficient, and to provide documentation verifying that the Remediation Plan has been implemented. Repeated violations or unresponsiveness to NIH requests may result in further compliance measures affecting Authorized User.\nSoftware. For all software provided to Authorized User by the NCI SRP (“NCI Software”), Authorized User will not copy, distribute, reverse engineer, sell, lease, or incorporate NCI Software into any other software system.\nPublication: Authorized User will not present or publish Data or the results of research conducted with Data in which an individual can be identified. Authorized User will not publish information on an individual, including information generated by the case listing session of SEER*Stat, even if such information cannot directly identify an individual. Authorized User will follow all NCI policies, including any policy on small cell sizes. Authorized User will send a copy of any manuscript or book chapter generated through research conducted with Data to seercustomdata@imsweb.com.\nRequired Acknowledgements. Authorized User agrees to acknowledge the SEER Databases and specific version of the dataset(s) analyzed, in all oral and written presentations, disclosures, and publications resulting from any analyses of Data. The appropriate citation is associated with the data file used, which may be found in Suggested Citations on the SEER*Stat Help menu or the Readme.txt associated with the ASCII text version of the SEER data.\nNCI Use of Information about Authorized Users. Authorized User agrees that information about Authorized User and the approved research will be posted publicly on the SEER website, including Authorized User’s name, the project name, and information provided in the DAR and other application materials. Authorized User agrees that citations of publications resulting from the use of the Databases may be posted on the SEER website. Authorized User agrees that NIH may use information provided in the DAR and other application materials for purposes of enforcing this Agreement and administering the NCI SEER Program.\nTerm and Termination of Agreement. This Agreement will continue until terminated. NIH may from time to time request Authorized User to submit an application to continue access to the Databases. This Agreement will automatically terminate if Authorized User fails to submit such application with the time period required. NIH also may terminate this Agreement and immediately revoke or suspend access to Data if NIH determines the Authorized User has breached this Agreement.\nDisposition of Data upon Termination and Project Close-Out Form. Upon termination of this Agreement, Authorized User agrees to destroy all Data, including copies and derivatives of Data, wherever located, including local servers and hardware, media, paper, and cloud computing storage, virtual and physical machines, databases, and random-access archives.\nNO WARRANTY. DATA IS PROVIDED ON AN AS-IS, WHERE-IS BASIS, AND ARE NOT WARRANTED TO BE ERROR-FREE OR COMPLETE. NIH MAKES NO EXPRESS OR IMPLIED WARRANTIES AND EXPRESSLY DISCLAIMS THE IMPLIED WARRANTIES OF PERFORMANCE, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.\nLiability. Each party will be responsible for its own actions. The NIH, as an agency of the United States, may be liable only to the extent provided under the Federal Tort Claims Act, 28 USC 2671 et seq."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Data_Use_Agreement_Certification_text_displays_as_the_following(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "before entering initials for \u0027Best Practice Assurance\u0027, the users initials are displayed in read-only format",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.before_entering_initials_for_the_users_initials_are_displayed_in_read_only_format(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the Best Practice Assurance text displays as follows:",
  "keyword": "And ",
  "doc_string": {
    "value": "Introduction\nThis document is intended to provide guidance for those requesting access to National Cancer Institute (NCI)-designated data repositories. It provides an outline of the expectations for the management and responsible conduct for the secondary use of data managed by the NCI on local storage systems or in cloud computing systems. This document is intended to ensure that NCI’s data distributed for secondary research purposes are kept secure and that only NCI approved users have access to this data.\n \nThe information contained in this document is targeted to those individuals who are:\nindependent and not affiliated with an institution of higher learning, company, or industry and do not have institutional signing officials1\nInformation Related to the Use of Cloud Computing\nIn contrast to traditional computing on local servers and hardware, cloud computing often entails the transfer and storage of NCI registry data on systems managed by a third party. Cloud computing offers a number of advantages for authorized data requestors but also requires additional security considerations.\nTypically, information security in cloud environments is the responsibility of the Requestor’s institution; the implementation of that security is shared between the institution and the cloud service provider. Thus, it is essential that institutions validate that they are partnering with a reputable cloud service provider. Since you are independent of an institution, you, as an Independent Requestor, are expected to understand the security policies and practices utilized and recommended by the cloud service provider of choice and may wish to obtain third party reviews or audits from the cloud service provider. The Independent Requestor should utilize these best practices, work with their cloud service provider to understand and implement the best practices associated with their specific environment and ensure that the cloud service provider can meet information security requirements. Because the use of cloud computing has the potential for being higher risk than using local infrastructure, the NIH strongly recommends that the Independent Requestor consult their Information Technology experts to ensure that an appropriate security plan is developed and that necessary technical, training and policy controls are in place before data is migrated to cloud environments. Remember – The Independent Requestor is accountable for ensuring the security of this data, not the cloud service provider\n\nLocal Infrastructure Guidance\nGeneral Information Security Guidelines\n \nEnsure data files are not exposed to the Internet, except connections that are required to download data from source repositories. Infrastructure should be behind firewalls that block access from outside your computer system. For cloud infrastructure, Independent Requestors must restrict external access to instances and storage under the Requestor’s control (see section on cloud computing for more details).\nDo not post data on servers in any fashion that will make it publicly accessible, such as a data requestor’s website. Even files on websites can be “discovered” by Internet search engines, e.g., Google, Bing. The Independent Requestor is prohibited from making the SEER data publicly accessible.\nDo not set up web or other electronic services that publicly host data, or provide access to individuals that are not listed on the Data Access Request even if those individuals have access to the same NCI registry data. Providing such access requires that an organization be an NIH Trusted Partner, with different requirements above and beyond those required for access to NCI registry data.\nImplement and use authentication technology for access control. Two factor authentication technologies (smart cards, hard or soft token, etc.) are preferred. When using single factor passwords, set policies that mandate the following requirements:\nMinimum length of 12 characters\nDoes not contain usernames, real names or company names\nDoes not contain a complete dictionary word\nContains characters from each of the following groups: lowercase letters, uppercase letters, numerals, and special characters\nPasswords should expire every 120 days or at the rate required by institutional policies, whichever is more frequent\nAvoid allowing users to place NCI registry data on mobile devices (e.g. laptops, smartphones, tablets, mp3 players) or removable media such as USB thumb drives (except where such media are used as backups and follow appropriate physical security controls). If data must be placed on mobile devices, it must be encrypted. NIH recommends the use of the National Institute of Standards and Technology (NIST) validated encryption technologies.\nKeep all software patches up-to-date.\n\nPhysical Security Guidelines\nEncrypt and store data that are in hard copy or reside on portable media, e.g., on a USB stick, CD, flash drive or laptop in a locked facility with access granted to the minimum number of individuals required to efficiently carry out research.\nRestrict physical access to all servers, network hardware, storage arrays, firewalls and backup media only to those that are required for efficient operations.\nLog access to secure facilities, ideally with electronic authentication.\nControls for Servers\nKeep servers from being accessible directly from the Internet, (i.e. must be behind a firewall or not connected to a larger network) and disable unnecessary services. It is better to begin with a server image that disables all non-essential services and restore those that are needed than to start with a full-featured image and disable unnecessary services.\nEnforce principle of Least Privilege to ensure that individuals and/or processes grant only the rights and permissions necessary to perform their assigned tasks and functions, but no more.\nSecure NCI registry data on the systems from unauthorized users (restrict directory permissions to only the owner and group) and if exported via file sharing, ensure limited access to remote systems.\nUse encrypted data access (such as Secure Shell (SSH) or Virtual Private Network (VPN)) when accessing systems remotely. It is preferred to use a tool such as Remote Desktop Protocol (RDP), X-windows or Virtual Network Computing (VNC) that does not permit copying of data and provides “View only” support.\nEnsure that data access policies are retained throughout the processing of the data on all systems including when data is used on multiple systems (such as a compute cluster). If data is cached on local systems, directory protection must be kept, and data must be removed when processing is complete. Requestors must meet the spirit and intent of these protection requirements to ensure a secure environment 24 hours a day for the period of the agreement.\nSource Data and Control of Copies of Data\n\nApproved data requestors must retain the original version of the encrypted data, track all copies or extracts and ensure that the information is not divulged to anyone except approved users. Therefore, NIH recommends ensuring careful control of all copies of data and providing appropriate logging on machines where such data is resident.\nAdditional independent or collaborating investigators from other institutions must submit a separate Data Access Request and be approved to access the data. Approved requestors must restrict outbound access from devices that host NCI registry data.\nDestruction of Data\n\nData downloaded from NIH-designated data repositories must be destroyed upon the time of project close-out or project termination.\n \nDelete all data for the project from storage, virtual and physical machines, databases, and random-access archives (i.e., archival technology that allows for deletion of specified records within the context of media containing multiple records).\nRetain only encrypted copies of the minimum data necessary for publication(s). Ideally, the data will exist on backup media that is not used for other projects and can therefore be destroyed or erased without impacting other users/tenants. If retaining the data on separate backup media is not possible, as will be the case with many users, the media may be retained for the standard media retention period of three years. However, the data may not be recovered for any purpose without a new Data Access Request approved by NCI SEER program staff. Retained data should be deleted at the end of the SEER approved access period.\nDelete electronic files securely. For personal computers, the minimum would involve deleting files and emptying the recycle bin or equivalent with equivalent procedures for servers. Optimally, use a secure method that performs a delete and overwrite of the physical media that was used to store the files.\nEnsure that backups are reused (data deleted) and any archive copies are also destroyed.\nDestroy media according to NIST Guidelines for Information Media Sanitization.\nAdditional Guidance for Cloud Computing\nIndependent Requestors wishing to use cloud computing must work with their cloud service provider to devise an appropriate security plan that meets the general Information Security Best Practices outlined in this document as well as additional requirements that derive from the nature of multi-tenant clouds with default access to the internet. Please refer to the specific cloud service provider for methods, processes and procedures for working with NCI registry databases.\n \nGeneral Cloud Computing Guidelines\n\nUse end-to-end encryption for network traffic whenever possible. For example, use Hypertext Transfer Protocol (HTTPS) sessions between you and your virtual server instance. Ensure that your service uses only valid and up-to-date certificates.\nEncrypt data at rest with a user\u0027s own keys. For example, sensitive data should be encrypted into ciphertext while it is stored in a database and decrypt it to plaintext when it is accessed by an authorized user, and vice versa. The Sequence Read Archive (SRA)-toolkit includes this feature; other software providers offer tools to meet this requirement.\nUse security groups and firewalls to control inbound traffic access to your instance. Ensure that your security profile is configured to allow access only to the minimum set of ports required to provide necessary functionality for your services and limit access to specific networks or hosts. In addition, allow administrative access only to the minimum set of ports and source IP address ranges necessary.\nBe aware of the top 10 vulnerabilities for web applications and build your applications accordingly. To learn more, visit Open Web Application Security Project (OWASP) - Top 10 Web Application Security Risks. When new internet vulnerabilities are discovered, promptly update any web applications included in your Virtual Machine (VM) images. Examples of resources that include this information are Security Focus and the NIST National Vulnerability Database.\nReview the Access Control Lists (ACLs), permissions, and security perimeter to ensure consistent definition.\n\nAudit and Accountability\nEnsure that data is accessible only to those approved for access, and control for changing that access is retained by the Requestor who submitted the request for access to NCI registry data and the appropriate IT staff. A mechanism for monitoring and notification needs to be in place to monitor changes in permission changes.\nEnsure that account access is logged along with access controls and file access. This information must be reviewed by the data requestor on a regular basis to ensure continued secure access.\nImage Specific Security\nEnsure images do not contain any known vulnerabilities, malware, or viruses. A number of tools are available for scanning the software, such as Chkrootkit, rkhunter, OpenVAS and Nessus.\nEnsure that Linux-based Images lock/disable root login and allow only sudo access. Additionally, root password must not be null or blank.\nEnsure that images allow end-users with OS-level administration capabilities to allow for compliance requirements, vulnerability updates, and log file access. For Linux-based Images, this is normally through secure shell (SSH), and for Windows-based virtual machine images, this is normally through remote desktop protocol (RDP).\nBest Practices for Specific Cloud Service Providers\nExamples of cloud service provider best practices are provided in the links below, links to the best practices of additional cloud service providers will be periodically appended to this document when they become available. Please be aware that these are provided for convenience only, and do not imply endorsement by the NIH or the United States Government for any of these services, nor does the government guarantee that these links lead to the most current version of these best practices. NIH recommends that Requestors consult with their cloud service provider to ensure that they are using the most up to date best practice documents.\n \nAmazon Web Services:\n \nAmazon Machine Images\nAmazon’s Best Practices for Elastic Cloud Compute (EC2)\nInformation on Elastic Cloud Compute (EC2)\n \nAdditional Resources for Testing and Best Practices\nExamples of cloud best practices from organizations that leverage the cloud are provided in the links below.\nCenter for Internet Security (CIS)\nCIS is the only distributor of consensus best practice standards for security configuration. The benchmarks are widely accepted by U.S. government agencies for Federal Security Information Act (FISMA) compliance, and by auditors for compliance with:\nthe International Organization for Standardization (ISO)\nthe Gramm-Leach-Bliley (GLB) Act\nSarbanes-Oxley (SOX) Act\nfederal Health Insurance Portability and Accountability Act (HIPAA)\nFamily Educational Rights and Privacy Act (FERPA)\nand other regulatory requirements for information security\nEnd user organizations that build their configuration policies based on the consensus benchmarks cannot acquire them elsewhere.\n \nNational Institute of Standards and Technology (NIST)\nNIST, an agency of the US Department of Commerce, provides information security standards and best practices for the federal government. The NIST Special Publications (SP) and Federal Information Processing Standards (FIPS) provide useful and concrete guidance to users of information technology systems (http://csrc.nist.gov/publications/).\n \nUnited States Government Configuration Baseline (USGCB)\nUSGCB (http://usgcb.nist.gov) provides security configuration baselines for information technology products widely used across the federal government including desktop computers."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_Best_Practice_Assurance_text_displays_as_follows(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "when the user scrolls down each agreement",
  "keyword": "And "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.when_the_user_scrolls_down_each_agreement()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is able to enter intials",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.the_user_is_able_to_enter_intials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "SEER information is displayed on the bottom of the page as follows:",
  "keyword": "And ",
  "doc_string": {
    "value": "SEER is supported by the Surveillance Research Program (SRP) in NCI\u0027s Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."
  }
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.seer_information_is_displayed_on_the_bottom_of_the_page_as_follows(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "after entering required information, the user is able to successfully submit the SEER Data Access Request form",
  "keyword": "Then "
});
formatter.match({
  "location": "SEERDataAccessRequestPageSteps.after_entering_required_information_the_user_is_able_to_successfully_submit_the_SEER_Data_Access_Request_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});