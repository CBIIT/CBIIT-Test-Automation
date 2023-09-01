Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "Okta Verified Applicant"

  @Regression @Smoke @Nekrashevich @Progression @APPTRACK-711 @APPTRACK-758
  Scenario Outline: Edit Basic Information of Profile
    And User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Basic Information" section
    And User clicks Edit for "Profile" section
    And User can edit "<firstName>" field
    And User can edit "<middleName>" field
    And User can edit "<lastName>" field
    And User can edit "<email>" field
    And User can edit "<phone>" field
    And User can edit "<businessPhone>" field
    And User picks highest degree option as "Masters"
    And User confirms being a US Citizen
    And User can edit "<address>" field
    And User can edit "<appNumber>" field
    And User can edit "<city>" field
    And User can edit "<state>" field
    And User can edit "<country>" field
    And User can edit "<zip>" field
    And User saves the updated section

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | address   | appNumber | city  | state | country  | zip   |
      | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    |  7 Mills  | 12378     | Reston| VA    | UsA      | 20453 |
