Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @juarezds @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @Regression @playwright
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
      | firstName | middleName | lastName   | email              | phone      | businessPhone | highestEducation | US Citizenship | address  | aptNumber | city       | state | country | zip   |
      | SSJTest   | Michelle   | Pololi     | mario@gmail.com    | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills  | 12378     | Reston     | VA    | USA     | 20453 |
      | David     | Black      | Kristensen | kristen1@nih.gov   | 2133212333 | 2902122234    | Bachelors        | Yes            | 2 Bells  | 231       | McLean     | VA    | USA     | 21333 |
      | Krista    | James      | Bernier    | bernierkd@nih.gov  | 2018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 78        | Sterling   | VA    | USA     | 20483 |
      | Joe       | Donald     | Viola      | violajc@nih.gov    | 2233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 23        | Ashburn    | VA    | USA     | 29233 |
      | William   | Michel     | Violette   | violettews@nih.gov | 3018212343 | 2023323454    | Doctorate        | Yes            | 7 Mills  | 13378     | San Diego  | CA    | USA     | 90453 |
      | Violeta   | Seidell    | Lack       | seidellvv@nih.gov  | 4133212333 | 2902122234    | Bachelors        | Yes            | 2 Bells  | 2313      | Monterey   | CA    | USA     | 94333 |
      | Abby      | Marianna   | Molnar     | molnaraj@nih.gov   | 7018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 6         | Carmel     | CA    | USA     | 97812 |
      | Maureen   | Jim        | Kennedy    | mkennedyh@nih.gov  | 8233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 39        | San Jose   | CA    | USA     | 95112 |
      | Jessica   | Marianna   | Mollick    | mollickja@nih.gov  | 7018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 6         | Sausalito  | CA    | USA     | 97712 |
      | Karen     | Elena      | Andrew     | andrewkl@nih.gov   | 8233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 39        | Sacramento | CA    | USA     | 95512 |

  @juarezds @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @Regression @playwright @Bug_Open @Smoke
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
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |

  @alenan @SSJ-712 @Bug_Open @juarezds @In_Progress @playwright @Smoke
  Scenario: Edit Demographics of Profile
    Given a test account "Maria Chaudhry" is reset before executing a test
    When User is on SCSS Landing page and user is "Maria Chaudhry" - PW
    When User is on Profile tab - PW
    And User clicks Edit for Demographics section - PW
    And User chooses to share demographic details - PW
    And User edits sex choice - PW
    And User edits ethnicity choice - PW
    And User edits race choice - PW
    And User edits disability choice - PW
    And User saves the updated section - PW
    And User clicks Edit for Demographics section - PW
    And User chooses not to share demographic details - PW
    Then User saves the updated section - PW

  @APPTRACK-38 @Progression @playwright
  Scenario Outline: Your Applications tab
#    Given an Okta user "" is on the SSJ home page and logs in
    Given a test account "<firstName>" is reset before executing a test
    When User is on SCSS Landing page and user is "Maria Chaudhry" - PW
    And clicks on a Vacancy Title
    And clicks "Apply"
    And proceeds with completing profile by clicking "Finish Profile"
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
    And navigates to the "Home" tab to be able to apply to a vacancy after creating a profile
    And clicks on a Vacancy Title
    And clicks "Apply"
    Then user is on the "Application Documents" page
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And clicks "Next"
    Then user is on the "References" page
    Then if reference one is required then user enters Reference One first name "<referenceOneFirstName>"
    And enters Reference One middle name "<referenceOneMiddleName>"
    And enters Reference One last name "<referenceOneLastName>"
    And enters Reference One email address "<referenceOneEmail>"
    And enters Reference One phone number "<referenceOnePhoneNumber>"
    And selects Reference One relationship as "<referenceOneRelationship>"
    And enters Reference One position title "<referenceOnePositionTitle>"
    And enters Reference One organization name "<referenceOneOrganizationName>"
    Then if reference two is required then user enters Reference Two first name "<referenceTwoFirstName>"
    And enters Reference Two middle name "<referenceTwoMiddleName>"
    And enters Reference Two last name "<referenceTwoLastName>"
    And enters Reference Two email address "<referenceTwoEmail>"
    And enters Reference Two phone number "<referenceTwoPhoneNumber>"
    And selects Reference Two relationship as Co-worker
    And enters Reference Two position title "<referenceTwoPositionTitle>"
    And enters Reference Two organization name "<referenceTwoOrganizationName>"
    And clicks "Next"
    Then user is on the "Demographic Information" page
    And user agrees to share demographic details and help improve the hiring process.
    And selects "Male" for Sex
    And selects "Hispanic or Latino" for Ethnicity
    And selects "American Indian or Alaska", "Asian", "Black or African-American", "Native Hawaiian or other", "White" for Race
    And selects "None of the conditions listed above apply to me." for Disability or Serious Health Condition
    And clicks "Next"
    Then user is on the "Review" page
    And user verifies basic information "<firstName>", "<middleName>", "<lastName>", "<email>", "<phone>", "<businessPhone>", "<highestEducation>", and "<US Citizenship>"
    And user verifies address information "<address>", "<aptNumber>", "<city>", "<state>", "<zip>"
    And user verifies demographics information "Yes", "Male", "Hispanic or Latino", "American Indian or Alaska Native, Asian, Black or African-American, Native Hawaiian or other Pacific Islander, White", and "None of the conditions listed above apply to me."
    And user verifies references one information "<referenceOneFirstName>", "<referenceOneMiddleName>", "<referenceOneLastName>", "<referenceOneEmail>", "<referenceOnePhoneNumber>", "<referenceOneRelationship>", "<referenceOnePositionTitle>", "<referenceOneOrganizationName>"
    And user verifies references two information "<referenceTwoFirstName>", "<referenceTwoMiddleName>", "<referenceTwoLastName>", "<referenceTwoEmail>", "<referenceTwoPhoneNumber>", "<referenceTwoRelationship>", "<referenceTwoPositionTitle>", "<referenceTwoOrganizationName>"
    And if a Cover Letter was uploaded then user verifies that Cover Letter is displayed "✓ Cover Letter", " SSJ_COVER_LETTER_TEST.docx"

  #    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   | referenceOneFirstName | referenceOneMiddleName | referenceOneLastName | referenceOneEmail     | referenceOnePhoneNumber | referenceOneRelationship | referenceOnePositionTitle | referenceOneOrganizationName                 | referenceTwoFirstName | referenceTwoMiddleName | referenceTwoLastName | referenceTwoEmail     | referenceTwoPhoneNumber | referenceTwoRelationship | referenceTwoPositionTitle | referenceTwoOrganizationName                 |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 | Fred                  | Trout                  | Laste                | referenceOne@test.com | 7036875816              | Supervisor/Manager       | PROJECT MANAGER           | TESTING ORGANIZATION FIELD FOR REFERENCE ONE | John                  | Steven                 | Vakhutko             | referenceTwo@test.com | 7036875816              | Co-worker                | TEST AUTOMATION LEAD      | TESTING ORGANIZATION FIELD FOR REFERENCE TWO |


#    When User is on Your Applications tab
#    And User can verify "Your Applications" page title
#    Then User can see the following columns displayed on Your Applications page
#      | column1       | column2 | column3        | column4               | column5 |
#      | Vacancy Title | State   | Vacancy Closes | Application Submitted | Actions |


#APPTRACK-145
#APPTRACK-144
#APPTRACK-827
#APPTRACK-1158
#APPTRACK-134
#APPTRACK-133
#APPTRACK-370
#APPTRACK-135
#APPTRACK-360
#APPTRACK-129
#APPTRACK-128
#APPTRACK-127
#APPTRACK-928
#APPTRACK-928
#APPTRACK-927
#APPTRACK-1130
#APPTRACK-594
#APPTRACK-359
#APPTRACK-911
#APPTRACK-599
#APPTRACK-461
#APPTRACK-1106
#APPTRACK-463
#APPTRACK-1109
#APPTRACK-454
#APPTRACK-565