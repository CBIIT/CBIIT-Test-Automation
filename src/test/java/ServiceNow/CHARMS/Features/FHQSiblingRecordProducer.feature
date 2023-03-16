# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Sibling
  
  Description: This feature file contains the scenario to submit the New FHQ Sibling record producer to the Participant

  @jains @FHQRegression
  Scenario: FHQ Sibling Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Siblings Grid link on FHQ Grid page to land on the FHQ Siblings list view page
    And click the new Sibling added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Sibling Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Siblings Grid link on FHQ Grid page to land on the FHQ Siblings list view page
    And verifies the Sibling List View details
    When clicks the New button on the FHQ Siblings list view page it lands on the New FHQ Sibling record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Sibling related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the sibling related to the Patient
    And fills the Type of birth Information for the Sibling
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this sibling
    And fills the patient sibling Resopathy details
    And Rasopathy MRVS details are filled for the sibling
    And Sibling Rasopathy MRVS table are verified
    And fills the Patient sibling Cancer details
    And Sibling Cancer MRVS details are filled
    And Sibling Cancer MRVS table are verified
    And fills the patient sibling Medical Conditions details
    And Sibling Medical Conditions MRVS details are filled
    And Sibling Medical Conditions MRVS table are verified
    And Sibling Total children details are filled
    And Sibling Child MRVS details are filled
    And Sibling Child MRVS table are verified
    And fills the additional Information about the sibling
    And Generate Scenario Report for the details of the Sibling Partner in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient sibling record producer
    And Sibling list view page is updated and verified
    And click the new Sibling added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Sibling Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page

