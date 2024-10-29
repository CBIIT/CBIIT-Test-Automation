# Author: @SonikaJain
Feature: FHQ Landing Page on the RASopathies Longitudinal Cohort Study Portal for the Initial visit of the Participant or Legal guardian of the participant
  Description: This feature file contains the scenario for the the Initial visit of the Participant or Legal guardian of the participant on the FHQ Survey landing page

  @FHQ
  Scenario: User Fills the Patient Personal Record Producer on the Landing FHQ pag
    Given participant open RASopathies Longitudinal Cohort Study log in page
    Then logs Rasopathy page via Okta using username "charmsras3@yahoo.com" and password "RASTest2023$$"
    And logs in CHARMS FHQ Survey page
    Given a proxy is on the RASopathies Longitudinal Cohort Study login page
    And logs in Rasopathy page via Okta with username "charmsras4@yahoo.com" and password "RASTest2021$$"
    When the user navigates to CHARMS FHQ Survey page and opens FHQ Landing Page Qualtrics
    Then Verify the New Details of participant immediate family banner is visible on the page
    And selects option To confirm your identity, please indicate your relationship to the participant drop-down
    And Sex assigned at birth, Gender Identity information of the participant are filled
    And Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled
    And Participant Total children details are filled
    And Participant Child MRVS details are filled
    And Participant Child MRVS table are verified
    And Participant Partner details are filled
    And Participant Partner MRVS details are filled
    And Participant Partner MRVS table are verified
    And Participant Siblings details are filled
    And Participant Sibling MRVS details are filled
    And Participant Sibling MRVS table are verified
    And Participant additional Informations are filled
    And finally the Complete-Submit Button is clicked to submit the Participant Personal record producer
    And Generate Scenario Report for the Initial visit of the Participant on the FHQ Survey landing page
    And Grid View page is verified

  Scenario: User Fills the Patient Personal Record Producer on the Landing FHQ page
    Given participant open RASopathies Longitudinal Cohort Study log in page
    Then logs Rasopathy page via Okta using username "charmsras1@yahoo.com" and password "RASTest2022$$"
    And logs in CHARMS FHQ Survey page
    Then Start your family health questionnaire Link is visible and clicked
    Then Verify the New Details of participant immediate family banner is visible on the page
    And selects option To confirm your identity, please indicate your relationship to the participant drop-down
    And Sex assigned at birth, Gender Identity information of the participant are filled
    And Total Miscarriages, Total Still births, Total Induced Abortions, Total Tubal Ectopic Molar Pregnancies details of the participant are filled
    And Participant Total children details are filled
    And Participant Child MRVS details are filled
    And Participant Child MRVS table are verified
    And Participant Partner details are filled
    And Participant Partner MRVS details are filled
    And Participant Partner MRVS table are verified
    And Participant Siblings details are filled
    And Participant Sibling MRVS details are filled
    And Participant Sibling MRVS table are verified
    And Participant additional Informations are filled
    And finally the Complete-Submit Button is clicked to submit the Participant Personal record producer
    And Generate Scenario Report for the Initial visit of the Participant on the FHQ Survey landing page
    And Grid View page is verified
