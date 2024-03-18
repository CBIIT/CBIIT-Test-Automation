Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @Progression
  Scenario: Verify the Save application functionality
    Given User is on SCSS Landing page and user is "Okta Verified Applicant" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
#    And User inputs "<middleName>" into middle name field
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
#    And User inputs "<businessPhone>" into business phone field
    And selects highest education "<Masters>"
#    And User confirms being a US Citizen - PW
#    And User inputs "<address>" into address field
#    And User inputs "<appNumber>" into appNumber field
#    And User inputs "<city>" into city field
#    And User inputs "<state>" into state field
#    And User inputs "<country>" into country field
#    And User inputs "<zip>" into zip field
#    When User clicks on Save Application button
#    Then successful save alert is displayed
#    And User can verify the application became a draft
#    Examples:
#      | firstName | middleName | lastName | email           | phone      | businessPhone | address | appNumber | city   | state | country | zip   |
#      | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |