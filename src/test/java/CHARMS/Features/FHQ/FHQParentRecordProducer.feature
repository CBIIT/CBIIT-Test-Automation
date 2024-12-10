# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Participant to Fill the FHQ Parent RP
  
  Description: This feature file contains the scenario to submit the New FHQ Parent record producer to the Participant

 @jains 
  Scenario: FHQ Parent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And verifies the Parents List View details
    When clicks the New button on the FHQ Parents list view page it lands on the New FHQ Parent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Parent related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the Parent
    And fills the Type of birth Information for the Parent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this person
    And fills the Patient Parent Resopathy details
    And Parent Rasopathy MRVS details are filled
    And Parent Rasopathy MRVS table are verified
    And fills the Patient Parent Cancer details
    And Parent Cancer MRVS details are filled
    And Parent Cancer MRVS table are verified
    And fills the Patient Parent Medical Conditions details
    And Parent Medical Conditions MRVS details are filled
    And Parent Medical Conditions MRVS table are verified
    And fills the Patient Parent siblings details
    And Parent Sibling MRVS details are filled
    And Parent Sibling MRVS table are verified    
    And finally click the Complete-Submit Button to submit the patient Parent record producer
    And Parents list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Parent in the FHQ Survey
    And click the new parent added and verify the completed record producer data
    And click the FHQ Home button

  @jains 
  Scenario: FHQ Parent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And click the new parent added and verify the completed record producer data
    And click the FHQ Home button

  @jains 
  Scenario: FHQ Parent Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And verifies the Parents List View details
    When clicks the New button on the FHQ Parents list view page it lands on the New FHQ Parent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Parent related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the Parent
    And fills the Type of birth Information for the Parent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this person
    And fills the Patient Parent Resopathy details
    And Parent Rasopathy MRVS details are filled
    And Parent Rasopathy MRVS table are verified
    And fills the Patient Parent Cancer details
    And Parent Cancer MRVS details are filled
    And Parent Cancer MRVS table are verified
    And fills the Patient Parent Medical Conditions details
    And Parent Medical Conditions MRVS details are filled
    And Parent Medical Conditions MRVS table are verified
    And fills the Patient Parent siblings details
    And Parent Sibling MRVS details are filled
    And Parent Sibling MRVS table are verified
    And finally click the Complete-Submit Button to submit the patient Parent record producer
    And Parents list view page is updated and verified
    And click the new parent added and verify the completed record producer data
    And click the FHQ Home button

  @jains 
  Scenario: FHQ Parent Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Parents Grid link on FHQ Grid page to land on the FHQ Parents list view page
    And click the new parent added and verify the completed record producer data
