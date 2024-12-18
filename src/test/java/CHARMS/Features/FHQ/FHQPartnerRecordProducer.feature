# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Participant
  
  Description: This feature file contains the scenario to submit the New FHQ Partner record producer to the Participant

  @jains 
  Scenario: FHQ Partner Record
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And verifies FHQ Family Cohort Study Management Page
    And user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page
    And verifies the Partner List View details
    When clicks the New button on the FHQ Partners list view page it lands on the New FHQ Partner record producer page
    And fills the First Name, First Initial of LAST name information of the Partner related to the Patient
    And fills the Year of Birth, Current Age of the Partner related to the Patient
    And fills the Vital Status,Year of Death, Age of Death information of the Partner related to the Patient
    And fills the Sex assigned at birth, Gender Identity information of the partner related to the Patient
    And fills if the participant is blood-related to this person details    
   	And finally click the Complete and Submit Button to submit the New FHQ Partner of the Patient Record Producer  
    And Partner list view page is updated and verified
    And Generate Scenario Report for the details of the Patient Partner in the FHQ Survey
    And click the new Partner added and verify the completed record producer data
    And click the FHQ Home button

  @jains 
  Scenario: FHQ Partner Record
    Given a proband is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    Given a user is logged on FHQ Family Cohort Study Management Page
    And user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page
    And click the new Partner added and verify the completed record producer data

  @jains 
  Scenario: FHQ Partner Record
    Given a user is logged on FHQ Landing Page after filling out patient data using the Test Account credentials in Test side door login page
    And user clicks the Partner Grid link on FHQ Grid page to land on the FHQ Partners list view page
    And verifies the Partner List View details