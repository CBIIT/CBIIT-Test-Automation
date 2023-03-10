# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Patient
  
  Description: This feature file contains the scenario to submit the New FHQ record producer for the Grandparent to the patient

 #  #@jains @Progression
 Scenario: FHQ Grandparent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Grandparents Grid link on FHQ Grid page to land on the FHQ Grandparents list view page
    And Grandparents list view page is updated and verified
    And click the new GrandParent added and verify the completed record producer data
    And click the FHQ Home button

 #@jains @Progression
  Scenario: FHQ Grandparent Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Grandparents Grid link on FHQ Grid page to land on the FHQ Grandparents list view page
    And verifies the Grandparents List View details
    When clicks the New button on the FHQ Grandparent list view page it lands on the New FHQ Grandparent record producer page
    And fills the First Name, First Initial of LAST name, Year of Birth, Vital Status,Year of Death, Age of Death information of the Grandparent related to the Patient
    And fills the Sex assigned at birth, Gender Identity about Grandparent related to the Patient
    And fills the Type of birth Information for the Participant_Grandparent
    And fills Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of this Participant_Grandparent
    And fills the Patient Grandparent Resopathy details
    And Grandparent Rasopathy MRVS details are filled
    And Grandparent Rasopathy MRVS table are verified
    And fills the Patient Grandparent Cancer details
    And Grandparent Cancer MRVS details are filled
    And Grandparent Cancer MRVS table are verified
    And fills the Patient Medical Conditions details
    And Grandparent Medical Condition MRVS details are filled
    And Grandparent Medical Condition MRVS table are verified
    And Generate Scenario Report for the details of the patient Grandparent in the FHQ Survey
    And finally click the Complete-Submit Button to submit the patient Grandparent record producer
    And Grandparents list view page is updated and verified
    And click the new GrandParent added and verify the completed record producer data
    And click the FHQ Home button
    
    

  #@jains @Progression
  Scenario: FHQ Grandparent Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Grandparents Grid link on FHQ Grid page to land on the FHQ Grandparents list view page
    And verifies the Grandparents List View details
    And click the new GrandParent added and verify the completed record producer data
