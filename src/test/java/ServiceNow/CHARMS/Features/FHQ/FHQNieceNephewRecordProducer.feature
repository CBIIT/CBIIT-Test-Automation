# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Niece Nephew
  
  Description: This feature file contains the scenario to submit the New FHQ Niece Nephew record producer to the patient

  @jains @FHQRegression
  Scenario: FHQ Parent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the NieceNephew Grid link on FHQ Grid page to land on the FHQ NieceNephew list view page
     And NieceNephew list view page is updated and verified
    And click the new NieceNephew added and verify the completed record producer data
      And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Niece Nephew Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the NieceNephew Grid link on FHQ Grid page to land on the FHQ NieceNephew list view page
    And verifies the NieceNephew List View details
    When clicks the New button on the FHQ NieceNephew list view page it lands on the New FHQ NieceNephew record producer page
    Then fills the NieceNephew information
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the NieceNephew related to the Patient
    And fills the Sex assigned at birth, Gender Identity information for the NieceNephew
    And fills the Which best describes this relative? information for NieceNephew
    And fills the Type of birth Information for the NieceNephew
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this NieceNephew
    And NieceNephew Resopathy details are filled
    And NieceNephew Rasopathy MRVS details are filled
    And NeiceNephew Rasopathy MRVS table are verified
    And NeiceNephew Cancer details are filled
    And NeiceNephew Cancer MRVS details are filled
    And NeiceNephew Cancer MRVS table are verified
    And NieceNephew Medical Conditions details are filled
    And NieceNephew  Medical Conditions MRVS details are filled
    And NieceNephew  Medical Conditions MRVS table are verified
    And NieceNephew Total children details are filled
    And NieceNephew additional Information details are filled
    And Generate Scenario Report for the details of the patient NieceNephew in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient NieceNephew record producer
    And NieceNephew list view page is updated and verified
    And click the new NieceNephew added and verify the completed record producer data
    And click the FHQ Home button

  @jains @FHQRegression
  Scenario: FHQ Niece Nephew Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the NieceNephew Grid link on FHQ Grid page to land on the FHQ NieceNephew list view page
    And verifies the NieceNephew List View details
