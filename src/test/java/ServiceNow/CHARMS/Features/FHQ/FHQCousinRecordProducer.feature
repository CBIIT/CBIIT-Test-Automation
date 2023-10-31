# Author: @SonikaJain
Feature: All FHQ Cousin Record Producers submisiion and verification in the FHQ Survey Portal
  
  Description: This feature file contains all scenarios which verify questionnaires for New FHQ Cousin Record Producer submisiion and verification

  @jains 
  Scenario: New FHQ Cousin Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page
    And click the new Cousin added and verify the completed record producer data
    And click the FHQ Home button

 @jains 
  Scenario: New FHQ Cousin Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page
    And verifies the Cousin List View details
    When clicks the New button on the FHQ Cousin list view page it lands on the New FHQ Cousin record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information for the Cousin
    And fills the Sex assigned at birth, Gender Identity information for the Cousin
    And fills Which best describes this Cousin and the Type of birth Information for the Cousin related to the Patients
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Cousin
    And fills the Resopathy details for Cousin
    And Rasopathy MRVS details are filled for Cousin
    And Cousin Rasopathy MRVS table are verified
    And fills the Cancer details for Cousin
    And Cancer MRVS details are filled for Cousin
    And Cousin Cancer MRVS table are verified
    And fills the Medical Conditions details for Cousin
    And Medical Conditions MRVS details are filled for Cousin
    And Cousin Medical Conditions MRVS table are verified
    And Cousin Total children details are filled
    And fills the additional Information about the Cousin
    And Generate Scenario Report for the details of the patient Cousin in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Cousin record producer
    And Cousin list view page is updated and verified
    And click the new Cousin added and verify the completed record producer data
    And click the FHQ Home button

  @jains 
  Scenario: New FHQ Cousin Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Cousin Grid link on FHQ Grid page to land on the FHQ Cousin list view page
    And verifies the Cousin List View details
    And click the FHQ Home button
