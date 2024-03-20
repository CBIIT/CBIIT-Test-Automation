# Author: @SonikaJain
Feature: All FHQ Child Record Producers submisiion and verification in the FHQ SUrvey Portal
  
  Description: This feature file contains all scenarios which verify questionnaires for all FHQ Child Record Producers submisiion and verification

  @jains @Regression
  Scenario: FHQ Child Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And verifies the Child List View details
    When clicks the New button on the FHQ Childs list view page it lands on the FHQ new child record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Child
    And fills the Sex assigned at birth, Gender Identity information
    And fills the Which best describes this relative? information
    And fills the other biological parent of this relative
    And fills the Type of birth, Which best describes this child? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this child
    And fills the Patient Child Resopathy details
    And Rasopathy MRVS details are filled
    And Child Rasopathy MRVS table are verified
    And fills the Patient Child Cancer details
    And Cancer MRVS details are filled
    And Child Cancer MRVS table are verified
    And fills the Patient Child Medical Conditions details
    And Medical Conditions MRVS details are filled
    And Child Medical Conditions MRVS table are verified
    And Child Total children details are filled
    And Child MRVS details are filled
    And Child children MRVS table are verified
    And fills the additional Information about the child
    And Generate Scenario Report for the details of the patient Child in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient child record producer
    And Child list view page is updated and verified
    And click the new Child added and verify the completed record producer data
    And click the FHQ Home button

  @jains @Regression
  Scenario: FHQ Child Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And click the new Child added and verify the completed record producer data
    And click the FHQ Home button

  @jains @Regression
  Scenario: FHQ Parent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And click the new Child added and verify the completed record producer data

  @jains @Regression
  Scenario: FHQ Child Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Children Grid link on FHQ Grid page to land on the FHQ Childs list view page
    And verifies the Child List View details
    When clicks the New button on the FHQ Childs list view page it lands on the FHQ new child record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Child
    And fills the Sex assigned at birth, Gender Identity information
    And fills the Which best describes this relative? information
    And fills the other biological parent of this relative
    And fills the Type of birth, Which best describes this child? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this child
    And fills the Patient Child Resopathy details
    And Rasopathy MRVS details are filled
    And Child Rasopathy MRVS table are verified
    And fills the Patient Child Cancer details
    And Cancer MRVS details are filled
    And Child Cancer MRVS table are verified
    And fills the Patient Child Medical Conditions details
    And Medical Conditions MRVS details are filled
    And Child Medical Conditions MRVS table are verified
    And Child Total children details are filled
    And Child MRVS details are filled
    And Child children MRVS table are verified
    And fills the additional Information about the child
    And Generate Scenario Report for the details of the patient Child in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient child record producer
    And Child list view page is updated and verified
