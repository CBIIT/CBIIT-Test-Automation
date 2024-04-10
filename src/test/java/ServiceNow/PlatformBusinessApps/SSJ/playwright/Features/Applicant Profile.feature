Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @IN_PROGRESS @juarezds
  Scenario Outline: Verifying the Save application functionality
    Given a test account "<firstName>" is reset before executing a test
    Given User is on SCSS Landing page and user is "Okta Verified Applicant" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhone>" into business phone field - PW
    And selects highest education "Masters"
    And User confirms being a US Citizen - PW
    And User inputs "<address>" into address field - PW
    And User inputs "<aptNumber>" into appNumber field - PW
    And User inputs "<city>" into city field - PW
    And User inputs "<state>" into state field - PW
    And User inputs "<country>" into country field - PW
    And User inputs "<zip>" into zip field - PW
    When User clicks on Save Application button - PW
    Then user verifies that first name "<firstName>", middle name "<middleName>", and last name "<lastName>" saved display as expected
    And verifies that the saved address displays with "<address>", "<aptNumber>", "<city>", "<state>", "<country>", "<zip>"
    And verifies that the saved email address displays as "<email>"
    And verifies that the saved phone number displays as "<phone>"
    And verifies that the saved business phone number displays as "<businessPhone>"
    And verifies that the saved highest education displays as "<highestEducation>"
    And verifies that the saved US Citizenship displays as "<US Citizenship>"
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |