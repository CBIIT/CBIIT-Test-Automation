# Author: @SonikaJain
Feature: All FHQ GrandChild Record Producers submisiion and verification in the FHQ Survey Portal
  
  Description: This feature file contains all scenarios which verify questionnaires for FHQ GrandChild Record Producers submisiion and verification

 #@jains @Progression
  Scenario: FHQ Grandparent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Grandchildren Grid link on FHQ Grid page to land on the FHQ Grandchildren list view page
    And click the new GrandChild added and verify the completed record producer data
    And click the FHQ Home button

  #@jains @Progression
  Scenario: FHQ GrandChild Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Grandchildren Grid link on FHQ Grid page to land on the FHQ Grandchildren list view page
    And verifies the Grandchildren List View details
    When clicks the New button on the FHQ Grandchildren list view page it lands on the New FHQ Grandchild record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the GrandChild
    And fills the Sex assigned at birth, Gender Identity information for the GrandChild
    And fills the Which best describes this relative? information for GrandChild
    And fills the Type of birth, Which best describes this GrandChild? information
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Grandchild
    And fills the Patient GrandChild Resopathy details
    And GrandChild Rasopathy MRVS details are filled
    And GrandChild Rasopathy MRVS table are verified
    And fills the Patient Grandchild Cancer details
    And Grandchild Cancer MRVS details are filled
    And Grandchild Cancer MRVS table are verified
    And fills the Patient Grandchild Medical Conditions details
    And Grandchild Medical Conditions MRVS details are filled
    And Grandchild Medical Conditions MRVS table are verified
    And Grandchild Total children details are filled
    And fills the additional Information about the Grandchild
    And Generate Scenario Report for the details of the patient Grandchild in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandchild record producer
    And Grandchild list view page is updated and verified
    And click the new GrandChild added and verify the completed record producer data
    And click the FHQ Home button

  #@jains @Progression
  Scenario: FHQ GrandChild Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Grandchildren Grid link on FHQ Grid page to land on the FHQ Grandchildren list view page
    And verifies the Grandchildren List View details
