Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "Okta Verified Applicant"

  @Regression @Smoke @Nekrashevich @APPTRACK-758
  Scenario Outline: Edit Basic Information of Profile
    When User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Basic Information" section
    And User inputs "<firstName>" into first name field
    And User inputs "<middleName>" into middle name field
    And User inputs "<lastName>" into last name field
    And User inputs "<email>" into email field
    And User inputs "<phone>" into phone field
    And User inputs "<businessPhone>" into business phone field
    And User picks highest degree option as "Masters"
    And User confirms being a US Citizen
    And User inputs "<address>" into address field
    And User inputs "<appNumber>" into appNumber field
    And User inputs "<city>" into city field
    And User inputs "<state>" into state field
    And User inputs "<country>" into country field
    And User inputs "<zip>" into zip field
    And User saves the updated section
     Examples:
     | firstName | middleName | lastName | email           | phone      | businessPhone | address   | appNumber | city  | state | country  | zip   |
     | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    |  7 Mills  | 12378     | Reston| VA    | UsA      | 20453 |


  @Regression @Smoke @Nekrashevich @APPTRACK-712
  Scenario: Edit Demographics of Profile
    When User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Demographics" section
    And User chooses to share demographic details
    And User edits sex choice
    And User edits ethnicity choice
    And User edits race choice
    And User edits disability choice
    And User saves the updated section
    And User clicks Edit for "Demographics" section
    And User chooses not to share demographic details
    Then User saves the updated section

  @Regression @Smoke @Nekrashevich @APPTRACK-71
  Scenario: Apply for a OWM Vacancy
  When User is on SCSS landing page
  And User clicks to apply for a OWM vacancy
  And User can verify that vacancy name is displayed
  And User can verify open and close dates are displayed
  And User can verify that equal opportunity employer statement is displayed
  And User clicks "Apply" button
  And User uploads "Cover Letter"
  And User uplaods "Qualification Statement"
 And User uploads "Vision Statement"
 And User uploads "Curriculum Vitae"
 And User clicks "Next" button
 And User fills in "Reference 1" section fields
 And User fills in "Reference 2" section fields
 And User chose not to answer the demographic questions
