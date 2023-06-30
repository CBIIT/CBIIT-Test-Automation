# Author: @SonikaJain
Feature: All FHQ Survey Record Producers validation in Native View
  
  Description: This feature file contains all scenarios which verify questionnaires for all FHQ Survey Record Producers in Native View

  @jains @FHQRegression
  Scenario: FHQ Patient Personal Record Producer with data verification
    Given a user is on the Native View side door login page
    And the user logs in the Native View using the Test Account credentials
    When the user navigates to CHARMS Native view and opens FHQ Record Producers
    Then the user clicks the Preview link and open the FHQ Patient Personals Record Producer
    And verify the New Details of patient immediate family banner is visible
    And To confirm your identity, please indicate your relationship to the participant drop-down displays with values I am the participant,I am the legal guardian or legal representative for the participant
    And Are you currently married or in a long term relationship? drop-down displays with values Yes, No, Prefer not to answer
    Then selects the value Yes for Are you currently married or in a long term relationship? drop-down
    Then Please fill out the following about your current partner statement is displayed
    And First Name text box displays
    And First Initial of Last Name drop-down displays with values A-Z, Prefer not to answer, Dont Know
    And Vital Status drop-down displays with values Alive, Deceased, Dont know, Prefer not to answer
    Then Please identify the number of each of the following pregnancy results. statement displays
    Then How many TOTAL pregnancies have you had or fathered? drop-down displays with values one to thirty,Dont Know, Prefer not to answer
    When selects the value one to thirty or Dont Know for the How many TOTAL pregnancies have you had or fathered? drop-down
    Then Have all of your pregnancies been with your Current Partner? drop-down displays with values  Yes, No, Dont Know, Prefer not to answer
    And Total Number of Live Births drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    And Total Number of Miscarriages drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    And Total number of stillbirths drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    And Total Number of Induced Abortions drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    And Total number of Tubal,Ectopic,Molar Pregnancies drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    Then How many total children do you have? drop-down displays with values zero to twenty, Dont Know, Prefer Not to Answer
    When selects the value one to twenty or Dont Know for the How many total children do you have?
    Then The MRVS for children will show
    When The Add button in children MRVS is clicked then the Add Row window opens
    Then First Name text box displays for patient child in the Add Row Page
    And First Initial of Last Name drop-down displays patient child with values A-Z, Prefer not to answer, Dont Know in the Add Row Page
    And Vital Status drop-down displays patient child with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page
    Then Click the Add Button in patient child Add Row Page
    And Have all of your children been with Current Partner? drop-down displays with values Yes, No, Dont Know, Prefer not to answer
    When selects the value No, Dont Know or Prefer not to answer for the Have all of your children been with CurrentPartner?
    Then How many total different partners have you had biological children with? drop-down displays with values one to ten, Don't Know, Prefer not to answer
    And The MRVS for Partners will show
    When The Add button in partners MRVS is clicked then the Add Row window opens
    And First Name text box displays for patient partner in the Add Row Page
    And First Initial of Last Name for patient partner drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page
    And Vital Status drop-down for patient partner displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page
    Then Click the Add Button in patient partner Add Row Page
    And We would like to ask you some questions about Siblings details. statement displays
    And How many siblings do you have? drop-down displays with values zero, one-to-twelve, Dont Know,Prefer not to answer
    When selects the value one-to-twelve or Dont Know for the How many siblings do you have?
    Then The MRVS for siblings will show
    When The Add button in siblings MRVS is clicked then the Add Row window opens
    And Types of Siblings relation drop-down displays for patient parent in the Add Row Page
    And First Name text box displays for patient sibling in the Add Row Page
    And First Initial of Last Name for patient sibling drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page
    And Vital Status drop-down for patient sibling displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page
    Then Click the Add Button in patient sibling Add Row Page
    And We would like to ask you some questions about your parents and grandparents. statement displays
    Then The MRVS for parents will show
    When The Add button in parents MRVS is clicked then the Add Row window opens
    And Relationship drop-down displays for patient parent in the Add Row Page
    And First Name text box displays for patient parent in the Add Row Page
    And First Initial of Last Name for patient parent drop-down displays with values A-Z, Prefer not to answer, Dont Know in the Add Row Page
    And Vital Status drop-down for patient parent displays with values Alive, Deceased, Dont know, Prefer not to answer in the Add Row Page
    Then Click the Add Button in patient parent Add Row Page
    And the Submit Button displays for the FHQ Patient Personal Record Producer
    And Generate Scenario Report
