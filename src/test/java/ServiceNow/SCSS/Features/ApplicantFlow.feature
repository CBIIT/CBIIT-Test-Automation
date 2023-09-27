Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "Okta Verified Applicant"

  @Regression @Smoke @Nekrashevich @APPTRACK-711 @APPTRACK-758
  Scenario Outline: Edit Basic Information of Profile
    And User is on SCSS landing page
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
    And User is on SCSS landing page
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
    And User saves the updated section



