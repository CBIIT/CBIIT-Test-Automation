Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @juarezds  @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @Regression
  Scenario Outline: Verifying the Save application functionality
    Given a test account "<firstName>" is reset before executing a test
    When User is on SCSS Landing page and user is "Maria Chaudhry" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhone>" into business phone field - PW
    And selects highest education "<highestEducation>"
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
      | firstName | middleName | lastName  | email              | phone      | businessPhone | highestEducation |  US Citizenship | address  | aptNumber | city      | state | country | zip   |
      | SSJTest   | Michelle   | Pololi    | mario@gmail.com    | 2018212343 | 2023323454    | Masters          | Yes             | 7 Mills  | 12378     | Reston    | VA    | USA     | 20453 |
      | David     | Black      | Kristensen| kristen1@nih.gov   | 2133212333 | 2902122234    | Bachelors        | Yes             | 2 Bells  | 231       | McLean    | VA    | USA     | 21333 |
      | Krista    | James      | Bernier   | bernierkd@nih.gov  | 2018211343 | 2123323454    | Masters          | Yes             | 11 Kolls | 78        | Sterling  | VA    | USA     | 20483 |
      | Joe       | Donald     | Viola     | violajc@nih.gov    | 2233212333 | 2202122234    | Bachelors        | Yes             | 11 Bells | 23        | Ashburn   | VA    | USA     | 29233 |
      | William   | Michel     | Violette  | violettews@nih.gov | 3018212343 | 2023323454    | Doctorate        | Yes             | 7 Mills  | 13378     | San Diego | CA    | USA     | 90453 |
      | Violeta   | Seidell    | Lack      | seidellvv@nih.gov  | 4133212333 | 2902122234    | Bachelors        | Yes             | 2 Bells  | 2313      | Monterey  | CA    | USA     | 94333 |
      | Abby      | Marianna   | Molnar    | molnaraj@nih.gov   | 7018211343 | 2123323454    | Masters          | Yes             | 11 Kolls | 6         | Carmel    | CA    | USA     | 97812 |
      | Maureen   | Jim        | Kennedy   | mkennedyh@nih.gov  | 8233212333 | 2202122234    | Bachelors        | Yes             | 11 Bells | 39        | San Jose  | CA    | USA     | 95112 |
      | Jessica   | Marianna   | Mollick   | mollickja@nih.gov  | 7018211343 | 2123323454    | Masters          | Yes             | 11 Kolls | 6         | Sausalito | CA    | USA     | 97712 |
      | Karen     | Elena      | Andrew    | andrewkl@nih.gov   | 8233212333 | 2202122234    | Bachelors        | Yes             | 11 Bells | 39        | Sacramento| CA    | USA     | 95512 |

