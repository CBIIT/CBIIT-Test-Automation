
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Patient
  
  Description: This feature file contains the scenario to submit the New FHQ Partner record producer to the patient

  @jains 
  Scenario: FHQ Aunt Uncle Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page
    And click the new AuntUncle added and verify the completed record producer data
     And click the FHQ Home button

@jains 
  Scenario: FHQ Aunt Uncle Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page
    And verifies the AuntUncle List View details
    When clicks the New button on the FHQ AuntUncle list view page it lands on the New FHQ AuntUncle record producer page
    Then fills the AuntUncle information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the AuntUncle related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the AuntUncle
    And fills the Type of birth Information for the AuntUncle
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this AuntUncle
    And fills the Patient AuntUncle Resopathy details
    And AuntUncle Rasopathy MRVS details are filled
    And AuntUncle Rasopathy MRVS table are verified
    And fills the Patient AuntUncle Cancer details
    And AuntUncle Cancer MRVS details are filled
    And AuntUncle Cancer MRVS table are verified
    And fills the Patient AuntUncle Medical Conditions details
    And AuntUncle Medical Conditions MRVS details are filled
    And AuntUncle Medical Conditions MRVS table are verified
    And AuntUncle Total children details are filled
    And AuntUncle Child MRVS details are filled
    And AuntUncle child MRVS table are verified
    And fills the additional Information about the AuntUncle
    And Generate Scenario Report for the details of the patient AuntUncle in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient AuntUncle record producer
     And click the new AuntUncle added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Aunt Uncle Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the AuntUncle Grid link on FHQ Grid page to land on the FHQ AuntUncle list view page
    And verifies the AuntUncle List View details
